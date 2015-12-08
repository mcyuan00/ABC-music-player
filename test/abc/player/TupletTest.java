package abc.player;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.junit.Test;

public class TupletTest {

    @Test(expected=AssertionError.class)
    public void testAssertionsEnabled() {
        assert false; // make sure assertions are enabled with VM argument: -ea
    }
    
    //testing strategy:
    //  tupletNum: 2, 3, 4; also check that other numbers fail
    //  notes: length = tupletNum, not equal
    //      test that notes with different durations fail
    //      use both Note and Chord
    //  test all: duration(), noteDuration(), tupletNumber(), tupletNotes(), getPlayerElements()
    //      getAllDurationDenominators()
    //  equals:
    //      different tupletNumber, notes contain mix of Chord and Notes
    
    @Test(expected = AssertionError.class)
    public void testTupletNumTooLow(){
        List<Music> notes = new ArrayList<>();
        notes.add(new Note(new Fraction(1, 5), 'D', 0));
        Tuplet tuplet = new Tuplet(1, notes);
    }
    
    @Test(expected=AssertionError.class)
    public void testTupletNumTooHigh(){
        List<Music> notes = new ArrayList<>();
        notes.add(new Note(new Fraction(1, 5), 'D', 0));
        Tuplet tuplet = new Tuplet(5, notes);
    }
    
    @Test(expected=AssertionError.class)
    public void testDurationsNotEqual(){
        List<Music> notes = new ArrayList<>();
        notes.add(new Note(new Fraction(1, 5), 'D', 0));
        notes.add(new Note(new Fraction(1, 4), 'B', 2));
        Tuplet tuplet = new Tuplet(2, notes);
    }
    
    //also tests note length = tupletNum, only notes
    @Test
    public void testDuplet(){
        List<Music> notes = new ArrayList<>();
        notes.add(new Note(new Fraction(1, 4), 'B', 1));
        notes.add(new Note(new Fraction(1, 4), 'G', 0));
        Tuplet tuplet = new Tuplet(2, notes);
        //duration
        assertEquals(new Fraction(3, 4), tuplet.duration());
        //noteDuration
        assertEquals(new Fraction(3, 8), tuplet.noteDuration());
        //tupletNumber
        assertEquals(2, tuplet.tupletNumber());
        //tupletNotes
        List<Music> tupletNotes = new ArrayList<>();
        tupletNotes.add(new Note(new Fraction(1, 4), 'B', 1));
        tupletNotes.add(new Note(new Fraction(1, 4), 'G', 0));
        assertEquals(tupletNotes, tuplet.tupletNotes());
        //getPlayerElements
        List<PlayerElement> playerElements = new ArrayList<>();
        playerElements.add(new PlayerElement(new Pitch('B').transpose(Pitch.OCTAVE), 3, 6));
        playerElements.add(new PlayerElement(new Pitch('G'), 9, 6));
        assertEquals(playerElements, tuplet.getPlayerElements(3, 16, new Fraction(1, 1)));
        //getAllDurationDenominators
        Set<Integer> denominators = new HashSet<>();
        denominators.add(4);
        denominators.add(2);
        assertEquals(denominators, tuplet.getAllDurationDenominators());        
    }
    
    //also tests note length > tupletNumber, notes & chords
    @Test
    public void testTriplet(){
        List<Music> chord1Notes = new ArrayList<>();
        chord1Notes.add(new Note(new Fraction(1, 2), 'A', 0));
        chord1Notes.add(new Note(new Fraction(1, 2), 'G', 0, 1));
        Chord chord1 = new Chord(chord1Notes);
        List<Music> chord2Notes = new ArrayList<>();
        chord2Notes.add(new Note(new Fraction(1, 2), 'C', 0));
        chord2Notes.add(new Note(new Fraction(1, 2), 'F', 0));
        Chord chord2 = new Chord(chord2Notes);
        List<Music> chord3Notes = new ArrayList<>();
        chord3Notes.add(new Note(new Fraction(1, 2), 'B', 0));
        chord3Notes.add(new Note(new Fraction(1, 2), 'E', 0));
        Chord chord3 = new Chord(chord3Notes);
        List<Music> notes = new ArrayList<>();
        notes.addAll(Arrays.asList(chord1, new Note(new Fraction(1, 2), 'C', -1), new Note(new Fraction(1, 2), 'D', 0),
                chord2, new Note(new Fraction(1, 2), 'A', 0, -1), chord3));
        Tuplet tuplet = new Tuplet(3, notes);
        //duration
        assertEquals(new Fraction(2, 1), tuplet.duration());
        //noteDuration
        assertEquals(new Fraction(1, 3), tuplet.noteDuration());
        //tupletNumber
        assertEquals(3, tuplet.tupletNumber());
        //tupletNotes
        List<Music> tupletNotes = new ArrayList<>();
        tupletNotes.addAll(Arrays.asList(chord1, new Note(new Fraction(1, 2), 'C', -1), new Note(new Fraction(1, 2), 'D', 0),
                chord2, new Note(new Fraction(1, 2), 'A', 0, -1), chord3));
        assertEquals(tupletNotes, tuplet.tupletNotes());
        //getPlayerElements
        List<PlayerElement> playerElements = new ArrayList<>();
        playerElements.add(new PlayerElement(new Pitch('A'), 0, 2));
        playerElements.add(new PlayerElement(new Pitch('G').transpose(1), 0, 2));
        playerElements.add(new PlayerElement(new Pitch('C').transpose(-1 * Pitch.OCTAVE), 2, 2));
        playerElements.add(new PlayerElement(new Pitch('D'), 4, 2));
        playerElements.add(new PlayerElement(new Pitch('C'), 6, 2));
        playerElements.add(new PlayerElement(new Pitch('F'), 6, 2));
        playerElements.add(new PlayerElement(new Pitch('A').transpose(-1), 8, 2));
        playerElements.add(new PlayerElement(new Pitch('B'), 10, 2));
        playerElements.add(new PlayerElement(new Pitch('E'), 10, 2));
        assertEquals(playerElements, tuplet.getPlayerElements(0, 1, new Fraction(1, 6)));
        //getAllDurationDenominators
        Set<Integer> denominators = new HashSet<>();
        denominators.add(2);
        denominators.add(3);
        assertEquals(denominators, tuplet.getAllDurationDenominators());        
    }
    
    //also tests note length = tupletNumber, only notes
    @Test
    public void testQuadruplet(){
        List<Music> notes = new ArrayList<>();
        notes.add(new Note(new Fraction(2, 3), 'A', 0));
        notes.add(new Note(new Fraction(2, 3), 'C', -1));
        notes.add(new Note(new Fraction(2, 3), 'D', 0));
        notes.add(new Note(new Fraction(2, 3), 'E', 0));
        Tuplet tuplet = new Tuplet(4, notes);
        //duration
        assertEquals(new Fraction(2, 1), tuplet.duration());
        //noteDuration
        assertEquals(new Fraction(1, 2), tuplet.noteDuration());
        //tupletNumber
        assertEquals(4, tuplet.tupletNumber());
        //tupletNotes
        List<Music> tupletNotes = new ArrayList<>();
        tupletNotes.add(new Note(new Fraction(2, 3), 'A', 0));
        tupletNotes.add(new Note(new Fraction(2, 3), 'C', -1));
        tupletNotes.add(new Note(new Fraction(2, 3), 'D', 0));
        tupletNotes.add(new Note(new Fraction(2, 3), 'E', 0));
        assertEquals(tupletNotes, tuplet.tupletNotes());
        //getPlayerElements
        List<PlayerElement> playerElements = new ArrayList<>();
        playerElements.add(new PlayerElement(new Pitch('A'), 1, 3));
        playerElements.add(new PlayerElement(new Pitch('C').transpose(-1 * Pitch.OCTAVE), 4, 3));
        playerElements.add(new PlayerElement(new Pitch('D'), 7, 3));
        playerElements.add(new PlayerElement(new Pitch('E'), 10, 3));
        assertEquals(playerElements, tuplet.getPlayerElements(1, 3, new Fraction(1, 2)));
        //getAllDurationDenominators
        Set<Integer> denominators = new HashSet<>();
        denominators.add(3);
        denominators.add(4);
        assertEquals(denominators, tuplet.getAllDurationDenominators());        
    }

}
