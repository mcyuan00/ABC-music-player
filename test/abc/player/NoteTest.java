package abc.player;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.junit.Test;

public class NoteTest {

    @Test(expected=AssertionError.class)
    public void testAssertionsEnabled() {
        assert false; // make sure assertions are enabled with VM argument: -ea
    }
    
    //testing strategy:
    //  test both constructors
    //  test observers: pitch(), duration(), getPlayerElement()
    //  test getAllDurationDenominators()
    //  test equals(): different length, different pitch, same pitch but different constructor, same everything
    
    @Test
    public void testNoteNoAccidentalMiddleOctave(){
        Note note = new Note(new Fraction(3, 4), 'B', 0);
        assertEquals(new Pitch('B'), note.pitch());
        assertEquals(new Fraction(3, 4), note.duration());
        Set<Integer> denominators = new HashSet<>();
        denominators.add(4);
        assertEquals(denominators, note.getAllDurationDenominators());
        List<PlayerElement> playerElements = new ArrayList<>();
        playerElements.add(new PlayerElement(new Pitch('B'), 5, 6));
        assertEquals(playerElements, note.getPlayerElements(5, 2, new Fraction(1, 4)));
    }
    
    @Test
    public void testNoteNoAccidentalOneOctaveHigher(){
        Note note = new Note(new Fraction(5, 8), 'C', 1);
        assertEquals(new Pitch('C').transpose(Pitch.OCTAVE), note.pitch());
        assertEquals(new Fraction(5, 8), note.duration());
        Set<Integer> denominators = new HashSet<>();
        denominators.add(8);
        assertEquals(denominators, note.getAllDurationDenominators());
        List<PlayerElement> playerElements = new ArrayList<>();
        playerElements.add(new PlayerElement(new Pitch('C').transpose(Pitch.OCTAVE), 0, 5));
        assertEquals(playerElements, note.getPlayerElements(0, 1, new Fraction(1, 8)));
    }
    
    @Test
    public void testNoteAccidentalsLowerOctave(){
        Note note = new Note(new Fraction(2, 8), 'G', -2, -1);
        assertEquals(new Pitch('G').transpose(Pitch.OCTAVE * -2 - 1), note.pitch());
        assertEquals(new Fraction(2, 8), note.duration());
        Set<Integer> denominators = new HashSet<>();
        denominators.add(4);
        assertEquals(denominators, note.getAllDurationDenominators());
        List<PlayerElement> playerElements = new ArrayList<>();
        playerElements.add(new PlayerElement(new Pitch('G').transpose(Pitch.OCTAVE * -2 - 1), 12, 4));
        assertEquals(playerElements, note.getPlayerElements(12, 16, new Fraction(1, 1)));
    }
    
    @Test
    public void testNoteEqualsDifferentLength(){
        Note note1 = new Note(new Fraction(1, 5), 'B', 0);
        Note note2 = new Note(new Fraction(4, 8), 'B', 0);
        assertTrue(!note1.equals(note2));
    }
    
    @Test
    public void testNoteEqualsDifferentPitch(){
        Note note1 = new Note(new Fraction(3, 8), 'B', 0);
        Note note2 = new Note(new Fraction(3, 8), 'C', 0);
        assertTrue(!note1.equals(note2));
    }
    
    @Test
    public void testNoteEqualsDifferentConstructor(){
        Note note1 = new Note(new Fraction(3, 8), 'G', -1);
        Note note2 = new Note(new Fraction(3, 8), 'G', -1, 0);
        assertEquals(note1, note2);
    }
    
    // test that D is the same as C##
    @Test
    public void testNoteEqualsDoubleSharp(){
        Note note1 = new Note(new Fraction(3, 8), 'C', 0, 2);
        Note note2 = new Note(new Fraction(3, 8), 'D', 0);
        assertEquals(note1, note2);
    }
    
    @Test
    public void testNoteEqualsSameEverything(){
        Note note1 = new Note(new Fraction(3, 8), 'A', 3);
        Note note2 = new Note(new Fraction(3, 8), 'A', 3);
        assertEquals(note1, note2);
    }
}
