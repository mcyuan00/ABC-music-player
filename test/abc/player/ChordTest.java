package abc.player;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

public class ChordTest {

    @Test(expected=AssertionError.class)
    public void testAssertionsEnabled() {
        assert false; // make sure assertions are enabled with VM argument: -ea
    }
    
    //testing strategy:
    //  number of notes: 1, >1
    //  lengths: first note longest, shortest, middle length, same (check duration works)
    //  check all observer functions: numNotes(), chordNotes(), duration(), getPlayerElements(), getAllDurations()
    
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
    }

}
