package abc.player;

import java.util.Stack;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.tree.ErrorNode;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.ParseTreeWalker;
import org.antlr.v4.runtime.tree.TerminalNode;

import abc.parser.HeaderLexer;
import abc.parser.HeaderListener;
import abc.parser.HeaderParser;
import abc.parser.HeaderParser.CommentContext;
import abc.parser.HeaderParser.ComposerContext;
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


public class Parser {

    public static Header parseHeader(String input){
        try{
            // Create a stream of characters from the string
            CharStream stream = new ANTLRInputStream(input);

            HeaderLexer lexer = new HeaderLexer(stream);
            TokenStream tokens = new CommonTokenStream(lexer);

            HeaderParser parser = new HeaderParser(tokens);

            // Generate the parse tree using the starter rule.
            // root is the starter rule for this grammar.
            // Other grammars may have different names for the starter rule.
            ParseTree tree = parser.root();

            MakeHeader headerMaker = new MakeHeader();
            new ParseTreeWalker().walk(headerMaker, tree);
            return headerMaker.getHeader();
        }
        catch(RuntimeException e){
            System.out.println(e.getMessage()); //not used after debugging
            throw new IllegalArgumentException();
        }
    }
    
    static class MakeHeader implements HeaderListener {
        private Stack<String> requiredStack = new Stack<>();
        private Stack<String> optionalStack = new Stack();

        
        /**
         * 
         * @return
         * @Throws IllegalArgumentException of index, title, or keySignature is missing
         */
        public Header getHeader(){
            int index = -1;
            String title = "";
            KeySignature keySignature= KeySignature.valueOf("NEGATIVE");
           while (!requiredStack.isEmpty()){
               String context = requiredStack.pop();
               if (context.contains("X:")){
                   Pattern pattern = Pattern.compile("[0-9]+");
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
           if(index == -1 || title.equals("") || keySignature.equals(KeySignature.valueOf("NEGATIVE"))){
               throw new IllegalArgumentException();
           }
               
           Header header = new Header(index, title, keySignature);
           
           while (!optionalStack.isEmpty()){
               String context = optionalStack.pop();
               if (context.contains("C:")){
                   String composer = context.replace("C:", "").replace("\n", "");
                   header.setComposer(composer);
               }
               if (context.contains("M:")){
                   if(context.contains("C|")){
                       header.setMeter(new Fraction(2,2));
                   }
                   else if(context.contains("C")){
                       header.setMeter(new Fraction(4, 4));
                   }
                   else{
                       context = context.replace("M:", "").replace("\n", "");
                       String[] nums = context.split("/");
                       int numerator = Integer.valueOf(nums[0]);
                       int denominator = Integer.valueOf(nums[1]);
                       header.setMeter(new Fraction(numerator,denominator));
                   }
                   
               }
               if (context.contains("L:")){
                   context = context.replace("L:", "").replace("\n", "");
                   String[] nums = context.split("/");
                   int numerator = Integer.valueOf(nums[0]);
                   int denominator = Integer.valueOf(nums[1]);
                   header.setMeter(new Fraction(numerator,denominator)); 
               }
               if (context.contains("Q:")){
                   Pattern pattern = Pattern.compile("=[0-9]+");
                   Matcher matcher = pattern.matcher(context);
                   int tempo = -1;
                   if (matcher.find()){
                       String group = matcher.group();
                       tempo = Integer.valueOf(group.replace("=", "")); 
                       context = context.replace(group, "").replace("\n", "");
                   }
                   String[] nums = context.split("/");
                   // in case tempo has a different base note length than the given meter, must calculate offset
                   int numerator = Integer.valueOf(nums[0]);
                   int denominator = Integer.valueOf(nums[1]);
                   Fraction headerMeter = header.meter();
                   double tempoOffset = numerator*headerMeter.denominator()/(denominator*headerMeter.numerator());
                   header.setTempo((int)(tempo/tempoOffset)); 
               }
               if (context.contains("V:")){
                   String voice = context.replace("V:", "").replace("\n", "");
                   header.addVoice(voice);
               }
           }
           
           return header;
        }
        
        @Override
        public void exitRoot(HeaderParser.RootContext ctx) {
            // TODO Auto-generated method stub

        }

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
        public void exitOtherfields(HeaderParser.OtherfieldsContext ctx) {
            // TODO Auto-generated method stub

        }
        
        @Override
        public void exitComposer(HeaderParser.ComposerContext ctx) {
            optionalStack.push(ctx.getText());

        }
        
        @Override
        public void exitMeter(HeaderParser.MeterContext ctx) {
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
        public void exitComment(HeaderParser.CommentContext ctx) {
            // TODO Auto-generated method stub

        }
        
        @Override
        public void exitText(HeaderParser.TextContext ctx) {
            // TODO Auto-generated method stub

        }

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

    }
    
}
