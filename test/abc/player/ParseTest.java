package abc.player;


import org.antlr.v4.gui.Trees;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.ParseTree;

import org.junit.Test;

import abc.parser.HeaderLexer;
import abc.parser.HeaderParser;

public class ParseTest {

    @Test(expected=AssertionError.class)
    public void testAssertionsEnabled() {
        assert false; // make sure assertions are enabled with VM argument: -ea
    }
    
    //test header parse
    
    @Test
    public void testHeaderParser(){
        CharStream stream = new ANTLRInputStream("X:1\nT:h\nK:A\n");
        HeaderLexer lexer = new HeaderLexer(stream);
        TokenStream tokens = new CommonTokenStream(lexer);
        
        HeaderParser parser = new HeaderParser(tokens);
        ParseTree tree = parser.root();
        Trees.inspect(tree, parser);
    }
    
    //test body parse
}
