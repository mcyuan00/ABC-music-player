package abc.player;

import static org.junit.Assert.*;

import org.junit.Test;

public class ChordTest {

    @Test(expected=AssertionError.class)
    public void testAssertionsEnabled() {
        assert false; // make sure assertions are enabled with VM argument: -ea
    }
    
    //testing strategy:
    //  number of notes: 1, >1
    //  lengths: different, same

}
