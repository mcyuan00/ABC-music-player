package abc.player;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

public class NoteTest {

    @Test(expected=AssertionError.class)
    public void testAssertionsEnabled() {
        assert false; // make sure assertions are enabled with VM argument: -ea
    }
    
    //testing strategy:
    //  test both constructors
    //  test observers: pitch(), duration(), getPlayerElement()
    
//    @Test
//    public void testNoteNoAccidentalMiddleOctave(){
//        Note note = new Note(new Fraction(3, 4), 'B', 0);
//        assertEquals(new Pitch('B'), note.pitch());
//        assertEquals(new Fraction(3, 4), note.duration());
//        List<PlayerElement> playerElements = new ArrayList<>();
//        playerElements.add(new PlayerElement(new Pitch('B'), 5, 11));
//        assertEquals(playerElements, note.getPlayerElements(5, 2, new Fraction(1, 4)));
//    }
}
