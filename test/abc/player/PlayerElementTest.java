package abc.player;

import static org.junit.Assert.*;

import org.junit.Test;

public class PlayerElementTest {

    @Test(expected=AssertionError.class)
    public void testAssertionsEnabled() {
        assert false; // make sure assertions are enabled with VM argument: -ea
    }
    
    //testing strategies:
    //  create a note, create a rest
    //      nonpositive numTicks & negative startTick should give an assertion error
    //  check all observer methods work correctly:
    //      pitch(), pitchMidiValue(), startTick(), numTicks(), isRest()
    //  check equals:
    //      check that middle C is not equal to a rest with the same duration
    
    @Test(expected=AssertionError.class)
    public void testPlayerElementNonpositiveNumTicks(){
        PlayerElement playerElement = new PlayerElement(new Pitch('C'), 4, 0);
    }
    
    @Test(expected=AssertionError.class)
    public void testPlayerElementNegativeStartTick(){
        PlayerElement playerElement = new PlayerElement(new Pitch('A'), -1, 6);
    }
    
    @Test
    public void testPlayerElementConstructNote(){
        PlayerElement playerElement = new PlayerElement(new Pitch('B'), 2, 7);
        assertEquals(new Pitch('B'), playerElement.pitch());
        assertEquals(new Pitch('B').toMidiNote(), playerElement.pitchMidiValue());
        assertEquals(2, playerElement.startTick());
        assertEquals(7, playerElement.numTicks());
        assertEquals(false, playerElement.isRest());
    }
    
    @Test
    public void testPlayerElementConstructRest(){
        PlayerElement playerElement = new PlayerElement(1, 10);
        assertEquals(1, playerElement.startTick());
        assertEquals(10, playerElement.numTicks());
        assertEquals(true, playerElement.isRest());        
    }
    
    @Test
    public void testPlayerElementEqualsTwoNotes(){
        PlayerElement playerElement = new PlayerElement(new Pitch('A'), 3, 3);
        PlayerElement playerElementEquals = new PlayerElement(new Pitch('A'), 3, 3);
        PlayerElement playerElementDifferentPitch = new PlayerElement(new Pitch('C'), 3, 3);
        PlayerElement playerElementDifferentStartTick = new PlayerElement(new Pitch('A'), 5, 3);
        PlayerElement playerElementDifferentNumTicks = new PlayerElement(new Pitch('A'), 3, 2);
        assertEquals(playerElement, playerElementEquals);
        assertFalse(playerElement.equals(playerElementDifferentPitch));
        assertFalse(playerElement.equals(playerElementDifferentStartTick));
        assertFalse(playerElement.equals(playerElementDifferentNumTicks));
    }

}
