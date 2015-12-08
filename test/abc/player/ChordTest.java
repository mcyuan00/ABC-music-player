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
    //  lengths: first note longer, other notes longer, same (check duration works)
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
        //check duratioon
        assertEquals(new Fraction(1, 5), chord.duration());
        //check getPlayerElements
        List<PlayerElement> playerElements = new ArrayList<>();
        playerElements.add(new PlayerElement(new Pitch('A'), 10, 5));
        assertEquals(playerElements, chord.getPlayerElements(10, 5, new Fraction(1, 5)));
        
    }

}
