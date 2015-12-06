package abc.player;


import static org.junit.Assert.*;

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



    /* HeaderParser
     * Testing partitions:
     *   Basics:  
     *       - index, title, key in order 
     *       - index/title/key out of order -- expect error
     *       - missing index/title/key -- expect error
     *   Index
     *       - valid index, must be positive
     *       - invalid index (missing X: or \n or negative)     
     *       
     *   Title
     *      - valid title
     *      - invalid title (missing T: or \n)     
     *       
     *   Composer:
     *       - valid composer
     *       - invalid composer (missing C: or \n)          
     *   Meter:
     *       - digit/digit
     *       - C
     *       - C|
     *       - invalid meter (missing M: or \n, too many fractions) 
     *       
     *   Length:
     *      - valid length
     *      - invalid length (missing L: or \n, too many fractions)
     *    
     *   Tempo:
     *      - valid tempo
     *      - invalid tempo (missing T: or \n, containing non-numerical chars)
     *      
     *   Voice:
     *      - valid voice
     *      - invalid voice (missing V: or \n) 
     *      
     *   Key:
     *      - valid key
     *      - key note is lowercase -- expect error
     *      - invalid key note
     *      - missing K: or \n
     *   
     *   Valid comment (% followed by any text, not treated as a field)
     *   Invalid comment (missing %, treated as separate field)
     *   Valid whitespace (all whitespace should be ignored/skipped)
     *   Invalid field (no newline at end of field)
     */

    //    @Test
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

    // header with basic required fields: index, title, key
    @Test
    public void testHeaderRequiredFields(){
        Header header = Parser.parseHeader("X:1\nT:hello world\nK:A\n");
        assertEquals("helloworld", header.title());
        assertEquals(1, header.index());
        assertEquals(KeySignature.valueOf("A_MAJOR"), header.keySignature());
    }
    
    
    /***
     * TODO: FIGURE OUT HOW TO DEAL WITH ACCIDENTALS IN MEASURES
     */
    //test body parse
    /*
     * Note:
     *      - Lowercase and uppercase notes
     *      - , vs ' signaling octave change: 0, 1, multiple
     *      - duration in form n/m, /m, /, n
     *      
     * Tuplet:
     *      - contains notes
     *      - contains chords
     *      - contains chords and notes, try in different orders (CNN, NCN, CNC, etc)
     */
    
    // test single uppercase note with duration in form /m
//    @Test
    public void testMusicParserSingleUppercaseNote(){
        Note note = (Note)Parser.parseMusic("A/3\n");
        assertEquals(new Fraction(1,3), note.duration());
        assertEquals(new Pitch('A'), note.pitch());
    }
    
    // test single lowercase note with duration in form n/m
    @Test
    public void testMusicParserSingleLowerCaseNote(){
        Note note = (Note)Parser.parseMusic("a2/3\n");
        assertEquals(new Fraction(2,3), note.duration());
        assertEquals(new Pitch('A').transpose(Pitch.OCTAVE), note.pitch());
    }
}
