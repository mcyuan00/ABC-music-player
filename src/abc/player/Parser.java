package abc.player;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Stack;
import java.util.concurrent.Future;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import javax.swing.JDialog;

import org.antlr.v4.gui.Trees;
import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.RecognitionException;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.misc.Utils;
import org.antlr.v4.runtime.tree.ErrorNode;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.ParseTreeWalker;
import org.antlr.v4.runtime.tree.TerminalNode;

import abc.parser.HeaderLexer;
import abc.parser.HeaderListener;
import abc.parser.HeaderParser;
import abc.parser.HeaderParser.CommentContext;
import abc.parser.HeaderParser.ComposerContext;
import abc.parser.HeaderParser.EndlineContext;
import abc.parser.HeaderParser.HeaderContext;
import abc.parser.HeaderParser.IndexContext;
import abc.parser.HeaderParser.KeyContext;
import abc.parser.HeaderParser.LengthContext;
import abc.parser.HeaderParser.MeterContext;
import abc.parser.HeaderParser.OtherfieldsContext;
import abc.parser.HeaderParser.RootContext;
import abc.parser.HeaderParser.TempoContext;
import abc.parser.HeaderParser.TextContext;
import abc.parser.HeaderParser.TitleContext;
import abc.parser.HeaderParser.VoiceContext;
import abc.parser.MusicLexer;
import abc.parser.MusicListener;
import abc.parser.MusicParser;
import abc.parser.MusicParser.ChordContext;
import abc.parser.MusicParser.DoublebarmeasureContext;
import abc.parser.MusicParser.ElementContext;
import abc.parser.MusicParser.EndrepeatmeasureContext;
import abc.parser.MusicParser.FirstendingmeasureContext;
import abc.parser.MusicParser.MeasureContext;
import abc.parser.MusicParser.MusicContext;
import abc.parser.MusicParser.NormalmeasureContext;
import abc.parser.MusicParser.NoteContext;
import abc.parser.MusicParser.NoteelementContext;
import abc.parser.MusicParser.NotelengthContext;
import abc.parser.MusicParser.PitchContext;
import abc.parser.MusicParser.RestContext;
import abc.parser.MusicParser.SecondendingmeasureContext;
import abc.parser.MusicParser.StartrepeatmeasureContext;
import abc.parser.MusicParser.TupletelementContext;
import abc.parser.MusicParser.TupletspecContext;


public class Parser {

    public static Header parseHeader(String input){
        //        try{
        // Create a stream of characters from the string
        CharStream stream = new ANTLRInputStream(input);

        HeaderLexer lexer = new HeaderLexer(stream);
        TokenStream tokens = new CommonTokenStream(lexer);

        HeaderParser parser = new HeaderParser(tokens);

        lexer.reportErrorsAsExceptions();
        parser.reportErrorsAsExceptions();

        // Generate the parse tree using the starter rule.
        // root is the starter rule for this grammar.
        // Other grammars may have different names for the starter rule.
        ParseTree tree = parser.root();

//                Future<JDialog> inspect = Trees.inspect(tree, parser);
//                try {
//                    Utils.waitForClose(inspect.get());
//                } catch (Exception e) {
//                    e.printStackTrace();
//                }

        MakeHeader headerMaker = new MakeHeader();
        new ParseTreeWalker().walk(headerMaker, tree);
        return headerMaker.getHeader();
        //        }
        //        catch(Exception e){
        //            System.out.println(e.getMessage()); //not used after debugging
        //            throw new IllegalArgumentException();
        //        }
    }

    static class MakeHeader implements HeaderListener {
        private final Stack<String> requiredStack = new Stack<>();
        private final Stack<String> optionalStack = new Stack<>();

        /**
         * @return the Header that was parsed
         * @Throws IllegalArgumentException of index, title, or keySignature is missing
         */
        public Header getHeader(){
            int index = -1;
            String title = "";
            KeySignature keySignature= KeySignature.valueOf("NEGATIVE");

            // parse/check existence of required fields index, header, keySignature
            while (!requiredStack.isEmpty()){
                String context = requiredStack.pop();
                //                System.out.println(context);
                //                if (context.contains("missing")){
                //                    throw new IllegalArgumentException();  
                //                }

                //parse out index, header, and keySignature
                if (context.contains("X:")){
                    Pattern pattern = Pattern.compile("[0-9-]+");
                    Matcher matcher = pattern.matcher(context);
                    if (matcher.find()){
                        index = Integer.valueOf( matcher.group());
                    }

                }
                else if (context.contains("T:")){
                    title = context.replace("T:", "").replace("\n", "");
                }
                else if (context.contains("K:")){
                    String key = "";
                    context = context.replace("K:", "");
                    Pattern pattern = Pattern.compile("[A-G]");
                    Matcher matcher = pattern.matcher(context);
                    if (matcher.find()){
                        key += matcher.group(); 
                    }
                    if (context.contains("b")){
                        key+="_FLAT";
                    }
                    else if (context.contains("#")){
                        key+="_SHARP";
                    }
                    if(context.contains("m")){
                        key+="_MINOR";
                    }
                    else{
                        key+="_MAJOR";
                    }
                    keySignature = KeySignature.valueOf(key);
                }   
            }
            //missing one of index, header or keySig
            //            if(index < 0 || title.equals("") || keySignature.equals(KeySignature.valueOf("NEGATIVE"))){
            //                throw new IllegalArgumentException();
            //            }

            Header header = new Header(index, title, keySignature);

            // need to fix tempo later
            Fraction given = header.noteLength();
            
            //parse other fields
            while (!optionalStack.isEmpty()){
                String context = optionalStack.pop();
                //                System.out.println(context);
                //                if (context.contains("missing")|| !(context.contains(":"))){
                //                    throw new IllegalArgumentException();  
                //                }

                if (context.contains("C:")){
                    String composer = context.replace("C:", "").replace("\n", "");
                    header.setComposer(composer);
                }
                if (context.contains("M:")){
                    //                    System.out.println(context);
                    if(context.contains("C|")){
                        header.setMeter(new Fraction(2,2));
                    }
                    else if(context.contains("C")){
                        header.setMeter(new Fraction(4, 4));
                    }
                    else{
                        context = context.replace("M:", "").replace("\n", "");
                        Fraction meter = parseFraction(context);
                        header.setMeter(meter);
                    }

                }
                if (context.contains("L:")){
                    context = context.replace("L:", "").replace("\n", "");
                    Fraction noteLength = parseFraction(context);
                    header.setNoteLength(noteLength);; 
                }
                if (context.contains("Q:")){
                    Pattern pattern = Pattern.compile("=[0-9]+");
                    Matcher matcher = pattern.matcher(context);
                    int tempo = -1;
                    if (matcher.find()){
                        String group = matcher.group();
                        tempo = Integer.valueOf(group.replace("=", "")); 
                        context = context.replace(group, "").replace("\n", "").replace("Q:", "");
                    }
                    else{
                        throw new IllegalArgumentException();
                    }

                    given = parseFraction(context);
                    header.setTempo((tempo)); 
//                    System.out.println("tempo offset:" + tempoOffset);
//                    System.out.println("tempo:" + tempo);
//                    System.out.println("given:" + given);
//                    System.out.println("header:" + headerLength);
                    
                }
                if (context.contains("V:")){
                    String voice = context.replace("V:", "").replace("\n", "");
                    header.addVoice(voice);
                }
            }
            
            if (!(given.equals(header.noteLength()))){
                Fraction headerLength = header.noteLength();
                System.out.println("headerLength: "+ headerLength);
                System.out.println("given length: "+ given);
                double tempoOffset = (double)(headerLength.numerator()*given.denominator())/(headerLength.denominator()*given.numerator());
                System.out.println("offset: "+ tempoOffset);
                System.out.println(headerLength.numerator()*given.denominator());
                System.out.println(headerLength.denominator()*given.numerator());
                
                header.setTempo((int)(header.tempo()/tempoOffset)); 
            }
 
            
            
            return header;
        }

        /**
         * @param context the context containing the fraction to parse out
         * @return the Fraction that the context represented
         */
        private Fraction parseFraction(String context){
            String[] nums = context.split("/");
            int numerator = Integer.valueOf(nums[0]);
            int denominator = Integer.valueOf(nums[1]);
            return new Fraction(numerator, denominator);
        }

        @Override
        public void exitRoot(HeaderParser.RootContext ctx) { }

        @Override
        public void exitHeader(HeaderParser.HeaderContext ctx) { }

        @Override
        public void exitIndex(HeaderParser.IndexContext ctx) {
            requiredStack.push(ctx.getText());
        }

        @Override
        public void exitTitle(HeaderParser.TitleContext ctx) {
            requiredStack.push(ctx.getText());
        }

        @Override
        public void exitOtherfields(HeaderParser.OtherfieldsContext ctx) { }

        @Override
        public void exitComposer(HeaderParser.ComposerContext ctx) {
            optionalStack.push(ctx.getText());

        }

        @Override
        public void exitMeter(HeaderParser.MeterContext ctx) {
            System.out.println(ctx.getText());
            optionalStack.push(ctx.getText());

        }

        @Override
        public void exitLength(HeaderParser.LengthContext ctx) {
            optionalStack.push(ctx.getText());

        }

        @Override
        public void exitTempo(HeaderParser.TempoContext ctx) {
            optionalStack.push(ctx.getText());

        }

        @Override
        public void exitVoice(HeaderParser.VoiceContext ctx) {
            optionalStack.push(ctx.getText());

        }

        @Override
        public void exitKey(HeaderParser.KeyContext ctx) {
            requiredStack.push(ctx.getText());

        }

        @Override
        public void exitComment(HeaderParser.CommentContext ctx) { }

        @Override
        public void exitText(HeaderParser.TextContext ctx) { }

        // ~~~~~~~~~~~~~~~~~~~
        @Override
        public void enterEveryRule(ParserRuleContext arg0) { }

        @Override
        public void exitEveryRule(ParserRuleContext arg0) { }

        @Override
        public void visitErrorNode(ErrorNode arg0) { }

        @Override
        public void visitTerminal(TerminalNode arg0) { }

        @Override
        public void enterRoot(RootContext ctx) { }

        @Override
        public void enterHeader(HeaderContext ctx) { }

        @Override
        public void enterIndex(IndexContext ctx) { }

        @Override
        public void enterTitle(TitleContext ctx) { }

        @Override
        public void enterOtherfields(OtherfieldsContext ctx) { }

        @Override
        public void enterComposer(ComposerContext ctx) { }

        @Override
        public void enterMeter(MeterContext ctx) { }

        @Override
        public void enterLength(LengthContext ctx) { }

        @Override
        public void enterTempo(TempoContext ctx) { }

        @Override
        public void enterVoice(VoiceContext ctx) { }

        @Override
        public void enterKey(KeyContext ctx) { }

        @Override
        public void enterComment(CommentContext ctx) { }

        @Override
        public void enterText(TextContext ctx) { }

        @Override
        public void enterEndline(EndlineContext ctx) { }

        @Override
        public void exitEndline(EndlineContext ctx) { }

    }

    public static Music parseMusic(String input, Fraction defaultNoteLength, KeySignature keySig, String voice){
        //        try{
        // Create a stream of characters from the string
        CharStream stream = new ANTLRInputStream(input);

        MusicLexer lexer = new MusicLexer(stream);
        TokenStream tokens = new CommonTokenStream(lexer);
        MusicParser parser = new MusicParser(tokens);

        lexer.reportErrorsAsExceptions();
        parser.reportErrorsAsExceptions();

        // Generate the parse tree using the starter rule.
        // root is the starter rule for this grammar.
        // Other grammars may have different names for the starter rule.
        ParseTree tree = parser.root();

        
//        Future<JDialog> inspect = Trees.inspect(tree, parser);
//        try {
//            Utils.waitForClose(inspect.get());
//        } catch (Exception e) {
//            e.printStackTrace();
//        }

        MakeMusic musicMaker = new MakeMusic(keySig, defaultNoteLength, voice);
        new ParseTreeWalker().walk(musicMaker, tree);
        return musicMaker.getMusic();

        //        }
        //        catch(RuntimeException e){
        //            System.out.println(e.getMessage()); //not used after debugging
        //            throw new IllegalArgumentException();
        //        }

    }


    static class MakeMusic implements MusicListener{
        private final Map<NoteLetter, Accidental> keySig;
        private final String voiceName;
        private final Fraction defaultNoteLength;
        private final Map<Accidental, Integer> accidental = new HashMap<Accidental, Integer>();
        private final Stack<Music> stack = new Stack<>();

        //        public MakeMusic(){
        //            KeySignatureMap map = new KeySignatureMap();
        //            this.keySig = KeySignatureMap.KEY_SIGNATURE_MAP.get(KeySignature.valueOf("C_MAJOR"));
        //            accidental.put(Accidental.valueOf("DOUBLESHARP"), 2);
        //            accidental.put(Accidental.valueOf("SHARP"), 1);
        //            accidental.put(Accidental.valueOf("NATURAL"), 0);
        //            accidental.put(Accidental.valueOf("FLAT"), -1);
        //            accidental.put(Accidental.valueOf("DOUBLEFLAT"), -2);
        //
        //        }

        public MakeMusic(KeySignature keysig, Fraction defaultNoteLength, String voiceName){
            KeySignatureMap map = new KeySignatureMap();
            this.defaultNoteLength = defaultNoteLength;
            this.voiceName = voiceName;
            this.keySig = map.KEY_SIGNATURE_MAP.get(keysig);
            accidental.put(Accidental.valueOf("DOUBLESHARP"), 2);
            accidental.put(Accidental.valueOf("SHARP"), 1);
            accidental.put(Accidental.valueOf("NATURAL"), 0);
            accidental.put(Accidental.valueOf("FLAT"), -1);
            accidental.put(Accidental.valueOf("DOUBLEFLAT"), -2);
        }
        
        /**
         * @return the music object that was parsed
         */
        public Music getMusic(){
            return stack.get(0);
        }

        @Override
        public void exitRoot(MusicParser.RootContext ctx) { }

        @Override
        public void exitMusic(MusicContext ctx) { 
            List<Music> voiceMeasures = new ArrayList<Music>();
            while(!stack.isEmpty()){
                voiceMeasures.add(stack.pop());
            }
            Collections.reverse(voiceMeasures);
            Voice voice = new Voice(voiceName, voiceMeasures);
            stack.push(voice);
        }

        @Override
        public void exitMeasure(MeasureContext ctx) { 
            if (ctx.endrepeatmeasure()!= null){
                System.out.println(ctx.getText());
                List<Music> repeatBody= new ArrayList<Music>();
                List<Music> firstRepeat = new ArrayList<Music>();
                List<Music> repeat = new ArrayList<Music>();
                while(!stack.isEmpty()){
                    Music music = stack.pop();
                    Measure m = (Measure)music;
                    if (m.isFirstEnding()){
                        repeat.add(music);
                        firstRepeat.addAll(repeat);
                        Collections.reverse(firstRepeat);
                        repeat = new ArrayList<Music>();
                    }
                    else if(m.isStartRepeat()){
                        repeat.add(music);
                        repeatBody.addAll(repeat);
                        Collections.reverse(repeatBody);
                        repeat = new ArrayList<Music>();
                        break;
                    }
                    else if(m.isDoubleBar()){
                        repeatBody.addAll(repeat);
                        stack.push(m);
                        Collections.reverse(repeatBody);
                        repeat = new ArrayList<Music>();
                        break;
                    }
                    else{
                        repeat.add(music);
                    }
                }
                if(stack.isEmpty()){
                    repeatBody.addAll(repeat);
                    Collections.reverse(repeatBody);
                    repeat = new ArrayList<Music>();
                }
                repeat.addAll(repeatBody);
                repeat.addAll(firstRepeat);
                repeat.addAll(repeatBody);
                for (Music m: repeat){
                    stack.push(m);
                }
            }
        }

        @Override
        public void exitFirstendingmeasure(FirstendingmeasureContext ctx) { 
            int numNorm = ctx.normalmeasure().size();
            List<Music> measures = new ArrayList<Music>();
            for (int i = 0; i < numNorm; i++){
                measures.add(stack.pop());
            }
            Measure startFirstEnding = (Measure) stack.pop();
            Measure replacedStartFirst;
            if (numNorm == 0){
                replacedStartFirst = new Measure(startFirstEnding, false, true, true, false);
            }
            else{
                replacedStartFirst = new Measure(startFirstEnding, false, false, true, false);
            }
            measures.add(replacedStartFirst);
            Collections.reverse(measures);
            for (int i = 0; i < numNorm + 1; i++){
                stack.push(measures.get(i));
            }
        }

        @Override
        public void exitSecondendingmeasure(SecondendingmeasureContext ctx) { }

        @Override
        public void exitDoublebarmeasure(DoublebarmeasureContext ctx) { 
            int numElements = ctx.element().size();
            List<Music> elements = new ArrayList<Music>();
            for (int i = 0; i < numElements; i++){
                elements.add(stack.pop());
            }
            Collections.reverse(elements);
            List<Music> newElements = applyAccidentalsToMeasure(elements);
            Measure m = new Measure(newElements, false, false, false, true);
            stack.push(m);
        }

        @Override
        public void exitStartrepeatmeasure(StartrepeatmeasureContext ctx) { 
            int numElements = ctx.element().size();
            List<Music> elements = new ArrayList<Music>();
            for (int i = 0; i < numElements; i++){
                elements.add(stack.pop());
            }
            Collections.reverse(elements);

            List<Music> newElements = applyAccidentalsToMeasure(elements);

            Measure m = new Measure(newElements, true, false, false, false);
            stack.push(m);
        }

        @Override
        public void exitEndrepeatmeasure(EndrepeatmeasureContext ctx) {
            int numElements = ctx.element().size();
            List<Music> elements = new ArrayList<Music>();
            for (int i = 0; i < numElements; i++){
                elements.add(stack.pop());
            }
            Collections.reverse(elements);  

            List<Music> newElements = applyAccidentalsToMeasure(elements);

            Measure m = new Measure(newElements, false, true, false, false);
            stack.push(m);
        }

        @Override
        public void exitNormalmeasure(NormalmeasureContext ctx) {
            if (ctx.startrepeatmeasure() != null){
                Music startRepeatMeasure = stack.pop();
                int numElements = ctx.element().size();
                assert stack.size()>= numElements;
                List<Music> elements = new ArrayList<Music>();
                for (int i = 0; i < numElements; i++){
                    elements.add(stack.pop());
                }
                Collections.reverse(elements);  

                List<Music> newElements = applyAccidentalsToMeasure(elements);
                Measure m = new Measure(newElements, false, false, false, false);
                stack.push(m);
                stack.push(startRepeatMeasure);
            }
            else{
                int numElements = ctx.element().size();
                assert stack.size()>= numElements;
                List<Music> elements = new ArrayList<Music>();
                for (int i = 0; i < numElements; i++){
                    elements.add(stack.pop());
                }
                Collections.reverse(elements);  
    
                List<Music> newElements = applyAccidentalsToMeasure(elements);
                Measure m = new Measure(newElements, false, false, false, false);
                stack.push(m);
            }
        }

        /**
         * Checks from beginning to end if list of music elements has accidentals and applies these
         * to the rest of the list if found
         * @param elements list of music elements to apply accidentals to
         * @return modified list of elements
         */
        private List<Music> applyAccidentalsToMeasure(List<Music> elements){
            Map<String, Integer> accidentalsMap = new HashMap<>();
            List<Music> newElements = new ArrayList<>();
            for (Music m : elements){
                Music newMusic = m.applyAccidentals(accidentalsMap);
                newElements.add(newMusic);
            }
            return newElements;
        }

        @Override
        public void exitElement(ElementContext ctx) { }

        @Override
        public void exitNoteelement(NoteelementContext ctx) { }

        @Override
        public void exitNote(NoteContext ctx) { }

        @Override
        public void exitPitch(PitchContext ctx) { 
            Fraction noteLength = defaultNoteLength;
            int octave = 0;
            char noteLetter = 'y';
            int numAccidental = 0;
            boolean transpose = false;
            if (ctx.NOTELETTER()!= null){
                char note = ctx.NOTELETTER().getText().charAt(0);
                if (Character.isLowerCase(note)){
                    octave +=1;
                }
                noteLetter = Character.toUpperCase(note);
                Accidental acc = keySig.get(NoteLetter.valueOf(Character.toString(noteLetter)));
                numAccidental += accidental.get(acc);
            }
            if (ctx.OCTAVE()!= null){
                String octaves = ctx.OCTAVE().getText();
                if (octaves.contains(",")){
                    octave -= octaves.length();
                }
                else if(octaves.contains("'")){
                    octave += octaves.length();
                }         
            }
            if (ctx.notelength()!= null){
                String length = ctx.notelength().getText();
                noteLength = parseNoteLength(length);
            }
            if (ctx.ACCIDENTAL()!= null){
                String accidental = ctx.ACCIDENTAL().getText();
                if (accidental.contains("_")){
                    numAccidental = -1 * accidental.length();
                }
                else if (accidental.contains("^")){
                    numAccidental = accidental.length();
                }
                else{
                    numAccidental = 0;
                }
                transpose = true;
            }
            Note n = new Note(noteLength, noteLetter, octave, numAccidental, transpose);
            stack.push(n);
        }

        @Override
        public void exitRest(RestContext ctx) { 
            Fraction noteLength = defaultNoteLength;
            if (ctx.notelength()!= null){
                String length = ctx.notelength().getText();
                noteLength = parseNoteLength(length);
            }
            Rest r = new Rest(noteLength);
            stack.push(r);
        }

        @Override
        public void exitNotelength(NotelengthContext ctx) { }

        @Override
        public void exitTupletelement(TupletelementContext ctx) { 
            int tupletNum = Integer.valueOf(ctx.tupletspec().getText().replace("(", ""));
            int tupletSize = ctx.noteelement().size();
            assert tupletSize >= tupletNum;
            assert tupletNum > 1 && tupletNum < 5;

            List<Music> tupletNotes = new ArrayList<Music>();

            for (int i = 0; i < tupletSize; i++){
                tupletNotes.add(stack.pop());
            }
            Collections.reverse(tupletNotes);
            Tuplet t = new Tuplet(tupletNum, tupletNotes);
            stack.push(t);
        }

        @Override
        public void exitTupletspec(TupletspecContext ctx) { }

        @Override
        public void exitChord(ChordContext ctx) {
            List<NoteContext> notes = ctx.note();
            assert stack.size() >= notes.size();
            assert notes.size()>= 1;
            List<Music> chordNotes = new ArrayList<Music>();

            for (int i = 0; i < notes.size(); i++){
                chordNotes.add(stack.pop());
            }
            Collections.reverse(chordNotes);
            Music m = new Chord(chordNotes);
            stack.push(m);
        }
        
        /**
         * Given a string representing a note or rest's length, returns a Fraction object representing the
         * given length
         * @param length string representation of note/rest's length
         * @return Fraction object representing the note/rest's length
         */
        private Fraction parseNoteLength(String length){
            int numerator;
            int denominator;
            if(!length.contains("/")){
                numerator = Integer.valueOf(length);
                denominator = 1;
            }
            else{
                String[] nums = length.split("/");
                if (nums.length == 0){
                    numerator = 1;
                    denominator = 2;
                }
                else if (nums.length == 1){
                    numerator = Integer.valueOf(nums[0]);
                    denominator = 2;
                }
                else{
                    numerator = (nums[0].equals("")) ? 1 : Integer.valueOf(nums[0]);
                    denominator = Integer.valueOf(nums[1]);
                }
            }
            return new Fraction(numerator * defaultNoteLength.numerator(), denominator * defaultNoteLength.denominator()).simplify();
        }

        @Override
        public void exitComment(MusicParser.CommentContext ctx) { }

        @Override
        public void exitText(MusicParser.TextContext ctx) { }

        //~~~~~~~~~~~~~~
        @Override
        public void enterEveryRule(ParserRuleContext arg0) { }

        @Override
        public void exitEveryRule(ParserRuleContext arg0) { }

        @Override
        public void visitErrorNode(ErrorNode arg0) { }

        @Override
        public void visitTerminal(TerminalNode arg0) { }

        @Override
        public void enterRoot(abc.parser.MusicParser.RootContext ctx) {}

        @Override
        public void enterMusic(MusicContext ctx) {}

        @Override
        public void enterNote(NoteContext ctx) { }

        @Override
        public void enterRest(RestContext ctx) {}

        @Override
        public void enterNotelength(NotelengthContext ctx) {}

        @Override
        public void enterTupletspec(TupletspecContext ctx) {}

        @Override
        public void enterComment(abc.parser.MusicParser.CommentContext ctx) { }

        @Override
        public void enterText(abc.parser.MusicParser.TextContext ctx) { }

        @Override
        public void enterChord(ChordContext ctx) { }

        @Override
        public void enterNoteelement(NoteelementContext ctx) { }

        @Override
        public void enterMeasure(MeasureContext ctx) { }

        @Override
        public void enterTupletelement(TupletelementContext ctx) { }

        @Override
        public void enterFirstendingmeasure(FirstendingmeasureContext ctx) { }      

        @Override
        public void enterSecondendingmeasure(SecondendingmeasureContext ctx) { }

        @Override
        public void enterDoublebarmeasure(DoublebarmeasureContext ctx) { }

        @Override
        public void enterStartrepeatmeasure(StartrepeatmeasureContext ctx) { }

        @Override
        public void enterEndrepeatmeasure(EndrepeatmeasureContext ctx) { }

        @Override
        public void enterNormalmeasure(NormalmeasureContext ctx) { }

        @Override
        public void enterElement(ElementContext ctx) { }

        @Override
        public void enterPitch(PitchContext ctx) { }

    }
}
