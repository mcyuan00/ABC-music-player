package abc.player;

import java.util.ArrayList;
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
import abc.parser.MusicParser.MeasureContext;
import abc.parser.MusicParser.MidtuneContext;
import abc.parser.MusicParser.MusicContext;
import abc.parser.MusicParser.NoteContext;
import abc.parser.MusicParser.NoteelementContext;
import abc.parser.MusicParser.NotelengthContext;
import abc.parser.MusicParser.RepeatContext;
import abc.parser.MusicParser.RestContext;
import abc.parser.MusicParser.SectionContext;
import abc.parser.MusicParser.TupletContext;
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

        //        Future<JDialog> inspect = Trees.inspect(tree, parser);
        //        try {
        //            Utils.waitForClose(inspect.get());
        //        } catch (Exception e) {
        //            e.printStackTrace();
        //        }

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
         * 
         * @return
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

                    Fraction given = parseFraction(context);
                    Fraction headerLength = header.noteLength();
                    double tempoOffset = given.numerator()*headerLength.denominator()/(given.denominator()*headerLength.numerator());
                    header.setTempo((int)(tempo/tempoOffset)); 
                }
                if (context.contains("V:")){
                    String voice = context.replace("V:", "").replace("\n", "");
                    header.addVoice(voice);
                }
            }

            return header;
        }

        private Fraction parseFraction(String context){
            String[] nums = context.split("/");
            // fraction doesn't have correct number of /
            //            if (nums.length >2){
            //                throw new IllegalArgumentException();
            //            }
            int numerator = Integer.valueOf(nums[0]);
            int denominator = Integer.valueOf(nums[1]);
            return new Fraction(numerator, denominator);
        }

        @Override
        public void exitRoot(HeaderParser.RootContext ctx) { }

        @Override
        public void exitHeader(HeaderParser.HeaderContext ctx) {


        }

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
        public void enterEndline(EndlineContext ctx) {
            // TODO Auto-generated method stub
            
        }

        @Override
        public void exitEndline(EndlineContext ctx) {
            // TODO Auto-generated method stub
            
        }

    }

    public static Music parseMusic(String input, Fraction defaultNoteLength, KeySignature keySig){
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

        MakeMusic musicMaker = new MakeMusic(keySig, defaultNoteLength);
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
        private final Fraction defaultNoteLength;
        private final Map<Accidental, Integer> accidental = new HashMap<Accidental, Integer>();
        private final Stack<Music> stack = new Stack<>();
        private final Stack<List<Music>> listStack = new Stack<>();

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

        public MakeMusic(KeySignature keysig, Fraction defaultNoteLength){
            KeySignatureMap map = new KeySignatureMap();
            this.defaultNoteLength = defaultNoteLength;
            this.keySig = map.KEY_SIGNATURE_MAP.get(keysig);
            accidental.put(Accidental.valueOf("DOUBLESHARP"), 2);
            accidental.put(Accidental.valueOf("SHARP"), 1);
            accidental.put(Accidental.valueOf("NATURAL"), 0);
            accidental.put(Accidental.valueOf("FLAT"), -1);
            accidental.put(Accidental.valueOf("DOUBLEFLAT"), -2);
        }


        public Music getMusic(){
            return stack.get(0);
        }

        @Override
        public void exitRoot(MusicParser.RootContext ctx) {
            // TODO Auto-generated method stub

        }

        @Override
        public void exitMusic(MusicParser.MusicContext ctx) {
            // TODO Auto-generated method stub

        }

        @Override
        public void exitMidtune(MusicParser.MidtuneContext ctx) {
            // TODO Auto-generated method stub

        }

        @Override
        public void exitVoice(MusicParser.VoiceContext ctx) {
            // TODO Auto-generated method stub

        }
        
        
        @Override
        public void exitSection(SectionContext ctx) {  
        }
        
        @Override
        public void exitRepeat(RepeatContext ctx) {
            int numMeasures = ctx.measure().size();
            List<Music> baseMeasures = new ArrayList<Music>();
            for (int i = 0; i < numMeasures; i++){
                baseMeasures.add(stack.pop());
            }
            Collections.reverse(baseMeasures);
            
            // parse through repeats 
            List<Music> finalMeasures = new ArrayList<Music>();
            
            
            
            
            
            
          
        }

        @Override
        public void exitMeasure(MeasureContext ctx) {
            int numElements = ctx.noteelement().size();
            List<Music> noteElements = new ArrayList<Music>();
            for (int i = 0; i < numElements; i++){
                noteElements.add(stack.pop());
            }
            Collections.reverse(noteElements);
            
            boolean transpose = false;
            char note = 'y';
            int octave = 0;
            int semitonesUp= 0;
            for (Music m : noteElements){
                if(m instanceof Note && ((Note)m).getTransposeTag()){
                    Note n = (Note)m;
                    transpose = true;
                    note = n.getNoteLetter();
                    octave = n.getOctave();
                    semitonesUp = n.getAccidental();
                }
                if(transpose){
                    m.transposeKey(note, octave, semitonesUp);
                }
            }
            Measure m = new Measure(noteElements);
            stack.push(m);
        }
        
        @Override
        public void exitNoteelement(NoteelementContext ctx) { }

        @Override
        public void exitTuplet(MusicParser.TupletContext ctx) {
            int tupletNum = Integer.valueOf(ctx.tupletspec().getText().replace("(", ""));
            assert stack.size()> tupletNum;
            assert tupletNum > 1 && tupletNum < 5;
            
            int tupletSize = ctx.note().size() + ctx.chord().size();
            List<Music> tupletNotes = new ArrayList<Music>();

            for (int i = 0; i < tupletSize; i++){
                tupletNotes.add(stack.pop());
            }
            Collections.reverse(tupletNotes);
            Tuplet t = new Tuplet(tupletNum, tupletNotes);
            stack.push(t);
        }

        @Override
        public void exitTupletspec(MusicParser.TupletspecContext ctx) { }

        @Override
        public void exitChord(MusicParser.ChordContext ctx) {
            List<MusicParser.NoteContext> notes = ctx.note();
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

        private Fraction parseNoteLength(String length){
            if(!length.contains("/")){
                return new Fraction(Integer.valueOf(length), 1);
            }
            String[] nums = length.split("/");

            int numerator = (nums[0].equals("")) ? 1 : Integer.valueOf(nums[0]);
            int denominator = (nums[1].equals("")) ? 2 : Integer.valueOf(nums[1]);
            return new Fraction(numerator, denominator);
        }

        @Override
        public void exitNote(MusicParser.NoteContext ctx) {
            System.out.println(ctx.NOTELETTER().getText());
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
                    numAccidental = accidental.length();
                }
                if (accidental.contains("^")){
                    numAccidental = accidental.length();
                }
                transpose = true;
            }
            Note n = new Note(noteLength, noteLetter, octave, numAccidental);
            n.setTransposeTag(transpose);
            stack.push(n);
        }

        @Override
        public void exitRest(MusicParser.RestContext ctx) {
            Fraction noteLength = defaultNoteLength;
            if (ctx.notelength()!= null){
                String length = ctx.notelength().getText();
                noteLength = parseNoteLength(length);
            }
            Rest r = new Rest(noteLength);
            stack.push(r);

        }

        @Override
        public void exitNotelength(MusicParser.NotelengthContext ctx) {
            // TODO Auto-generated method stub

        }

        @Override
        public void exitComment(MusicParser.CommentContext ctx) {
            // TODO Auto-generated method stub

        }

        @Override
        public void exitText(MusicParser.TextContext ctx) {
            // TODO Auto-generated method stub

        }


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
        public void enterMidtune(MidtuneContext ctx) {}

        @Override
        public void enterVoice(abc.parser.MusicParser.VoiceContext ctx) {}

        @Override
        public void enterNote(NoteContext ctx) { }

        @Override
        public void enterRest(RestContext ctx) {}

        @Override
        public void enterNotelength(NotelengthContext ctx) {}

        @Override
        public void enterTuplet(TupletContext ctx) { }

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
        public void enterSection(SectionContext ctx) { }


        @Override
        public void enterRepeat(RepeatContext ctx) { }


    }
}


