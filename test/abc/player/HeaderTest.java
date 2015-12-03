package abc.player;

import static org.junit.Assert.*;

import org.junit.Test;

public class HeaderTest {

    @Test(expected=AssertionError.class)
    public void testAssertionsEnabled() {
        assert false; // make sure assertions are enabled with VM argument: -ea
    }
    
    //testing strategy:
    //  construct a Header
    //      check that a negative tempo gives an assertion error
    //  check that the observer methods return the correct values
    //      composer(), keySignature(), noteLength(), meter(), tempo(), title(), index()
    //  check that mutator methods correctly change the fields and nothing else:
    //      setComposer(), setMeter(), setTempo(), setNoteLength()
    //      for setTempo(), check that negative values raises an assertion error
    
    @Test
    public void testHeader(){        
        Header header = new Header(0, "This title has all characters #2!?", KeySignature.C_MAJOR);
        //check that the default fields and the inputed fields are all correct
        assertEquals("Unknown", header.composer());
        assertEquals(KeySignature.C_MAJOR, header.keySignature());
        assertEquals(new Fraction(1, 8), header.noteLength());
        assertEquals(new Fraction(4, 4), header.meter());
        assertEquals(100, header.tempo());
        assertEquals("This title has all characters #2!?", header.title());
        assertEquals(0, header.index());
        
        //test setComposer()
        header.setComposer("Hello");
        assertEquals("Hello", header.composer());
        assertEquals(KeySignature.C_MAJOR, header.keySignature());
        assertEquals(new Fraction(1, 8), header.noteLength());
        assertEquals(new Fraction(4, 4), header.meter());
        assertEquals(100, header.tempo());
        assertEquals("This title has all characters #2!?", header.title());
        assertEquals(0, header.index());
        
        //test setMeter()
        header.setMeter(new Fraction(3, 4));
        assertEquals("Hello", header.composer());
        assertEquals(KeySignature.C_MAJOR, header.keySignature());
        assertEquals(new Fraction(1, 8), header.noteLength());
        assertEquals(new Fraction(3, 4), header.meter());
        assertEquals(100, header.tempo());
        assertEquals("This title has all characters #2!?", header.title());
        assertEquals(0, header.index());
        
        //test setTempo()
        header.setTempo(150);
        assertEquals("Hello", header.composer());
        assertEquals(KeySignature.C_MAJOR, header.keySignature());
        assertEquals(new Fraction(1, 8), header.noteLength());
        assertEquals(new Fraction(3, 4), header.meter());
        assertEquals(150, header.tempo());
        assertEquals("This title has all characters #2!?", header.title());
        assertEquals(0, header.index());
        
        //set noteLength()
        header.setNoteLength(new Fraction(1, 4));
        assertEquals("Hello", header.composer());
        assertEquals(KeySignature.C_MAJOR, header.keySignature());
        assertEquals(new Fraction(1, 4), header.noteLength());
        assertEquals(new Fraction(3, 4), header.meter());
        assertEquals(150, header.tempo());
        assertEquals("This title has all characters #2!?", header.title());
        assertEquals(0, header.index());
    }
    
    //test that setting the tempo to a negative value raises an assert
    @Test(expected=AssertionError.class)
    public void testHeaderSetTempoNegative(){
        Header header = new Header(3, "random", KeySignature.A_MINOR);
        header.setTempo(-100);
    }

}
