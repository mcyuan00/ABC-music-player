package abc.player;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.junit.Test;

public class ChordTest {

    @Test(expected=AssertionError.class)
    public void testAssertionsEnabled() {
        assert false; // make sure assertions are enabled with VM argument: -ea
    }
    
    //testing strategy:
    //  number of notes: 1, >1
    //  lengths: first note longest, shortest, middle length, same (check duration works)
    //  check all observer functions: numNotes(), chordNotes(), duration(), getPlayerElements(), getAllDurationDenominators()
    //  equals: different notes completely, one has more notes, same notes in different order
    
    @Test(expected=AssertionError.class)
    public void testNotesEmptyNotes(){
        List<Music> notes = new ArrayList<>();
        Chord chord = new Chord(notes);
    }
    
    @Test
    public void testNotesOneNote(){
        List<Music> notes = new ArrayList<>();
        notes.add(new Note(new Fraction(1, 5), 'A', 0));
        Chord chord = new Chord(notes);
        //check numNotes
        assertEquals(1, chord.numNotes());
        //check chordNotes
        List<Music> chordNotes = new ArrayList<>();
        chordNotes.add(new Note(new Fraction(1, 5), 'A', 0));
        assertEquals(chordNotes, chord.chordNotes());
        //check duration
        assertEquals(new Fraction(1, 5), chord.duration());
        //check getPlayerElements
        List<PlayerElement> playerElements = new ArrayList<>();
        playerElements.add(new PlayerElement(new Pitch('A'), 10, 5));
        assertEquals(playerElements, chord.getPlayerElements(10, 5, new Fraction(1, 5)));
        //getAllDurationDenominators
        Set<Integer> denominators = new HashSet<>();
        denominators.add(5);
        assertEquals(denominators, chord.getAllDurationDenominators());
    }
    
    @Test
    public void testNotesFirstNoteLonger(){
        List<Music> notes = new ArrayList<>();
        notes.add(new Note(new Fraction(1, 4), 'C', 2));
        notes.add(new Note(new Fraction(1, 8), 'A', 0, 1));
        Chord chord = new Chord(notes);
        //check numNotes
        assertEquals(2, chord.numNotes());
        //check chordNotes
        List<Music> chordNotes = new ArrayList<>();
        chordNotes.add(new Note(new Fraction(1, 4), 'C', 2));
        chordNotes.add(new Note(new Fraction(1, 8), 'A', 0, 1));
        assertEquals(chordNotes, chord.chordNotes());
        //check duration
        assertEquals(new Fraction(1, 4), chord.duration());
        //check getPlayerElements
        List<PlayerElement> playerElements = new ArrayList<>();
        playerElements.add(new PlayerElement(new Pitch('C').transpose(Pitch.OCTAVE * 2), 3, 2));
        playerElements.add(new PlayerElement(new Pitch('A').transpose(1), 3, 1));
//        List<PlayerElement> elements = chord.getPlayerElements(3, 8, new Fraction(1, 1));
//        System.out.println(elements.get(0).pitch());
//        System.out.println(elements.get(0).startTick());
//        System.out.println(elements.get(0).numTicks());
        assertEquals(playerElements, chord.getPlayerElements(3, 8, new Fraction(1, 1)));
        //getAllDurationDenominators
        Set<Integer> denominators = new HashSet<>();
        denominators.add(4);
        denominators.add(8);
        assertEquals(denominators, chord.getAllDurationDenominators());
    }
    
    @Test
    public void testNotesFirstNoteShortest(){
        List<Music> notes = new ArrayList<>();
        notes.add(new Note(new Fraction(1, 16), 'D', 1));
        notes.add(new Note(new Fraction(1, 2), 'B', -2));
        Chord chord = new Chord(notes);
        //check numNotes
        assertEquals(2, chord.numNotes());
        //check chordNotes
        List<Music> chordNotes = new ArrayList<>();
        chordNotes.add(new Note(new Fraction(1, 16), 'D', 1));
        chordNotes.add(new Note(new Fraction(1, 2), 'B', -2));
        assertEquals(chordNotes, chord.chordNotes());
        //check duration
        assertEquals(new Fraction(1, 16), chord.duration());
        //check getPlayerElements
        List<PlayerElement> playerElements = new ArrayList<>();
        playerElements.add(new PlayerElement(new Pitch('D').transpose(Pitch.OCTAVE), 14, 3));
        playerElements.add(new PlayerElement(new Pitch('B').transpose(-2 * Pitch.OCTAVE), 14, 24));
        assertEquals(playerElements, chord.getPlayerElements(14, 3, new Fraction(1, 16)));
        //getAllDurationDenominators
        Set<Integer> denominators = new HashSet<>();
        denominators.add(16);
        denominators.add(2);
        assertEquals(denominators, chord.getAllDurationDenominators());
    }
    
    @Test
    public void testNotesFirstNoteMiddle(){
        List<Music> notes = new ArrayList<>();
        notes.add(new Note(new Fraction(1, 6), 'A', 0));
        notes.add(new Note(new Fraction(1, 4), 'D', 0));
        notes.add(new Note(new Fraction(1, 8), 'F', 0));
        Chord chord = new Chord(notes);
        //check numNotes
        assertEquals(3, chord.numNotes());
        //check chordNotes
        List<Music> chordNotes = new ArrayList<>();
        chordNotes.add(new Note(new Fraction(1, 6), 'A', 0));
        chordNotes.add(new Note(new Fraction(1, 4), 'D', 0));
        chordNotes.add(new Note(new Fraction(1, 8), 'F', 0));
        assertEquals(chordNotes, chord.chordNotes());
        //check duration
        assertEquals(new Fraction(1, 6), chord.duration());
        //check getPlayerElements
        List<PlayerElement> playerElements = new ArrayList<>();
        playerElements.add(new PlayerElement(new Pitch('A'), 5, 4));
        playerElements.add(new PlayerElement(new Pitch('D'), 5, 6));
        playerElements.add(new PlayerElement(new Pitch('F'), 5, 3));
        assertEquals(playerElements, chord.getPlayerElements(5, 6, new Fraction(1, 4)));
        //getAllDurationDenominators
        Set<Integer> denominators = new HashSet<>();
        denominators.addAll(Arrays.asList(6, 4, 8));
        assertEquals(denominators, chord.getAllDurationDenominators());
    }
    
    //notes are different
    @Test
    public void testEqualsDifferent(){
        List<Music> notes1 = new ArrayList<>();
        notes1.add(new Note(new Fraction(1, 6), 'A', 0));
        notes1.add(new Note(new Fraction(1, 4), 'D', 1));
        List<Music> notes2 = new ArrayList<>();
        notes2.add(new Note(new Fraction(1, 6), 'A', 0));
        notes2.add(new Note(new Fraction(1, 4), 'D', 0));
        Chord chord1 = new Chord(notes1);
        Chord chord2 = new Chord(notes2);
        assertTrue(!chord1.equals(chord2));
    }
    
    //notes are the same except one chord has more notes
    @Test
    public void testEqualsDifferentLenghts(){
        List<Music> notes1 = new ArrayList<>();
        notes1.add(new Note(new Fraction(1, 3), 'A', 0));
        notes1.add(new Note(new Fraction(2, 6), 'D', 1));
        List<Music> notes2 = new ArrayList<>();
        notes2.add(new Note(new Fraction(1, 3), 'A', 0));
        notes2.add(new Note(new Fraction(2, 6), 'D', 1));
        notes2.add(new Note(new Fraction(1, 5), 'C', 0));
        Chord chord1 = new Chord(notes1);
        Chord chord2 = new Chord(notes2);
        assertTrue(!chord1.equals(chord2));
    }
    
    //same notes but in different order
    @Test
    public void testEqualsDifferentOrder(){
        List<Music> notes1 = new ArrayList<>();
        notes1.add(new Note(new Fraction(1, 3), 'A', 0));
        notes1.add(new Note(new Fraction(2, 6), 'D', 1));
        List<Music> notes2 = new ArrayList<>();
        notes2.add(new Note(new Fraction(2, 6), 'D', 1));
        notes2.add(new Note(new Fraction(1, 3), 'A', 0));        
        Chord chord1 = new Chord(notes1);
        Chord chord2 = new Chord(notes2);
        assertTrue(!chord1.equals(chord2));
    }
    
    //actually equals
    @Test
    public void testEqualsSame(){
        List<Music> notes1 = new ArrayList<>();
        notes1.add(new Note(new Fraction(1, 3), 'E', -1));
        notes1.add(new Note(new Fraction(2, 6), 'C', 1));
        List<Music> notes2 = new ArrayList<>();
        notes2.add(new Note(new Fraction(1, 3), 'E', -1));        
        notes2.add(new Note(new Fraction(2, 6), 'C', 1));
        Chord chord1 = new Chord(notes1);
        Chord chord2 = new Chord(notes2);
        assertTrue(chord1.equals(chord2));
    }

}
