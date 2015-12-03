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
    
    @Test
    public void testNoteNoAccidentalMiddleOctave(){
        Note note = new Note(new Fraction(3, 4), 'B', 0);
        assertEquals(new Pitch('B'), note.pitch());
        assertEquals(new Fraction(3, 4), note.duration());
        List<PlayerElement> playerElements = new ArrayList<>();
        playerElements.add(new PlayerElement(new Pitch('B'), 5, 11));
        assertEquals(playerElements, note.getPlayerElements(5, 2, new Fraction(1, 4)));
    }
    
    @Test
    public void testNoteNoAccidentalOneOctaveHigher(){
        Note note = new Note(new Fraction(5, 8), 'C', 1);
        assertEquals(new Pitch('C').transpose(Pitch.OCTAVE), note.pitch());
        assertEquals(new Fraction(5, 8), note.duration());
        List<PlayerElement> playerElements = new ArrayList<>();
        playerElements.add(new PlayerElement(new Pitch('C').transpose(Pitch.OCTAVE), 0, 5));
        assertEquals(playerElements, note.getPlayerElements(0, 1, new Fraction(1, 8)));
    }
    
    @Test
    public void testNoteAccidentalsLowerOctave(){
        Note note = new Note(new Fraction(2, 8), 'G', -2, -1);
        assertEquals(new Pitch('G').transpose(Pitch.OCTAVE * -2 - 1), note.pitch());
        assertEquals(new Fraction(2, 8), note.duration());
        List<PlayerElement> playerElements = new ArrayList<>();
        playerElements.add(new PlayerElement(new Pitch('G').transpose(Pitch.OCTAVE * -2 - 1), 12, 16));
        assertEquals(playerElements, note.getPlayerElements(12, 16, new Fraction(1, 1)));
    }
}
