package abc.player;


import java.io.IOException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;

import javax.print.PrintException;
import javax.swing.JDialog;

import org.antlr.v4.gui.Trees;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.Utils;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.ParseTreeWalker;
import org.junit.Test;

import abc.parser.HeaderLexer;
import abc.parser.HeaderParser;

public class ParseTest {

    @Test(expected=AssertionError.class)
    public void testAssertionsEnabled() {
        assert false; // make sure assertions are enabled with VM argument: -ea
    }

    
    
    // HeaderParser
    // Testing partitions:
   
    // Valid index (first field and digit(s))
    // Invalid index (missing X:, not first field, not digit(s))
    
    // Valid title (second field any text)
    // Invalid title (missing T:, not second field)
    
    // Valid composer (any text)
    // Invalid composer (missing C:)
    
    // Valid meter (digit(s)/digit(s) or C or C|)
    // Invalid meter (missing M:, invalid characters)
    
    // Valid length (digit(s)/digit(s))
    // Invalid length (missing L:, invalid characters)
    
    // Valid tempo (digit(s)/digit(s) = digit(s))
    // Invalid tempo (missing T:, invalid characters)
    
    // Valid voice (any text)
    // Invalid voice (missing V:)
    
    // Valid key (last field and case-insensitive note + optional accidental + optional minor)
    // Invalid key (missing K:, not last field, note does not exist, accidental does not exist)
    
    // Valid comment (% followed by any text, not treated as a field)
    // Invalid comment (missing %, treated as separate field)
    
    // Valid whitespace (all whitespace should be ignored/skipped)
    
    // Invalid field (no newline at end of field)
    
    // covers valid index, valid title, valid key
    @Test
    public void testHeaderParser(){
        CharStream stream = new ANTLRInputStream("X:1\nT:hello world\nK:A\n");
        HeaderLexer lexer = new HeaderLexer(stream);
        TokenStream tokens = new CommonTokenStream(lexer);

        HeaderParser parser = new HeaderParser(tokens);
        ParseTree tree = parser.root();
        
//        Future<JDialog> inspect = Trees.inspect(tree, parser);
//        
//        try {
//            Thread.sleep(10000);
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        }
//        
//        try {
//            Utils.waitForClose(inspect.get());
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
    }

    //test body parse
}
