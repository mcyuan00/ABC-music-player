package abc.player;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

public class MeasureTest {

    @Test(expected=AssertionError.class)
    public void testAssertionsEnabled() {
        assert false; // make sure assertions are enabled with VM argument: -ea
    }

    /*
     * Testing Strategy:
     *  - test that constructor works correctly
     *  - test getAllDurationDenominators
     *      -all the same duration
     *      -all different
     *      -some same some different
     *  -test getPlayerElements
     *      - notes one after another
     *      - triplets
     *      - Chords
     *          - Chords with weird lengths
     */

    //  test get Player Elements: notes one after another
    @Test
    public void testGetPlayerElementsSimpleNotes(){
        List<Music> notes = new ArrayList<Music>();
        notes.add(new Note(new Fraction(1,4), 'A', 0));
        notes.add(new Note(new Fraction(1,4), 'B', 0));
        notes.add(new Note(new Fraction(1,4), 'C', 0));
        notes.add(new Note(new Fraction(1,4), 'D', 0));
        Measure m = new Measure(notes, false, false, false, false);
        List<PlayerElement> p = m.getPlayerElements(0, 12, new Fraction(1,4));
        
        List<PlayerElement> expected = new ArrayList<PlayerElement>();
        expected.add(new PlayerElement(new Pitch('A'), 0, 12));
        expected.add(new PlayerElement(new Pitch('B'), 12, 12));
        expected.add(new PlayerElement(new Pitch('C'), 24, 12));
        expected.add(new PlayerElement(new Pitch('D'), 36, 12));
        
        for (int i = 0; i < p.size(); i++){
            assertEquals(expected.get(i), p.get(i));
        }       
    }
    
    //  test get Player Elements: notes one after another but not the default note length
    @Test
    public void testGetPlayerElementsSimpleNotesNotDefault(){
        List<Music> notes = new ArrayList<Music>();
        notes.add(new Note(new Fraction(1,4), 'A', 0));
        notes.add(new Note(new Fraction(1,4), 'B', 0));
        notes.add(new Note(new Fraction(1,4), 'C', 0));
        notes.add(new Note(new Fraction(1,4), 'D', 0));
        Measure m = new Measure(notes, false, false, false, false);
        List<PlayerElement> p = m.getPlayerElements(0, 12, new Fraction(3,4));
        
        List<PlayerElement> expected = new ArrayList<PlayerElement>();
        expected.add(new PlayerElement(new Pitch('A'), 0, 4));
        expected.add(new PlayerElement(new Pitch('B'), 4, 4));
        expected.add(new PlayerElement(new Pitch('C'), 8, 4));
        expected.add(new PlayerElement(new Pitch('D'), 12, 4));
        
        for (int i = 0; i < p.size(); i++){
            assertEquals(expected.get(i), p.get(i));
        }       
    }
    
    //  test get Player Elements: notes one after another different lengths
    @Test
    public void testGetPlayerElementsSimpleNotesDifferentLength(){
        List<Music> notes = new ArrayList<Music>();
        notes.add(new Note(new Fraction(1,4), 'A', 0));
        notes.add(new Note(new Fraction(1,2), 'B', 0));
        notes.add(new Note(new Fraction(1,4), 'C', 0));
        notes.add(new Note(new Fraction(1,3), 'D', 0));
        Measure m = new Measure(notes, false, false, false, false);
        List<PlayerElement> p = m.getPlayerElements(0, 12, new Fraction(1,1));
        
        List<PlayerElement> expected = new ArrayList<PlayerElement>();
        expected.add(new PlayerElement(new Pitch('A'), 0, 3));
        expected.add(new PlayerElement(new Pitch('B'), 3, 6));
        expected.add(new PlayerElement(new Pitch('C'), 9, 3));
        expected.add(new PlayerElement(new Pitch('D'), 12, 4));
        
        for (int i = 0; i < p.size(); i++){
            assertEquals(expected.get(i), p.get(i));
        }       
    }
    
    //  test get Player Elements: triplets included
    @Test
    public void testGetPlayerElementsIncludeTriplet(){
        List<Music> notes = new ArrayList<Music>();
        notes.add(new Note(new Fraction(1,4), 'A', 0));
        
        //triplet
        List<Music> triplet = new ArrayList<Music>();
        
        triplet.add(new Note(new Fraction(1,4), 'B', 0));
        triplet.add(new Note(new Fraction(1,4), 'C', 0));
        triplet.add(new Note(new Fraction(1,4), 'D', 0));
        notes.add(new Tuplet(3,triplet));
        
        Measure m = new Measure(notes, false, false, false, false);
        List<PlayerElement> p = m.getPlayerElements(0, 12, new Fraction(1,1));
        
        List<PlayerElement> expected = new ArrayList<PlayerElement>();
        expected.add(new PlayerElement(new Pitch('A'), 0, 3));
        expected.add(new PlayerElement(new Pitch('B'), 3, 2));
        expected.add(new PlayerElement(new Pitch('C'), 5, 2));
        expected.add(new PlayerElement(new Pitch('D'), 7, 2));
        
        for (int i = 0; i < p.size(); i++){
            assertEquals(expected.get(i), p.get(i));
        }       
    }
    
    //  test get Player Elements: Chords
    @Test
    public void testGetPlayerElementsIncludeChord(){
        List<Music> notes = new ArrayList<Music>();
        notes.add(new Note(new Fraction(1,4), 'A', 0));
        
        //triplet
        List<Music> triplet = new ArrayList<Music>();
        
        triplet.add(new Note(new Fraction(1,3), 'B', 0));
        triplet.add(new Note(new Fraction(1,3), 'C', 0));
        triplet.add(new Note(new Fraction(1,3), 'D', 0));
        notes.add(new Chord(triplet));
        
        Measure m = new Measure(notes, false, false, false, false);
        List<PlayerElement> p = m.getPlayerElements(0, 12, new Fraction(1,4));
        
        List<PlayerElement> expected = new ArrayList<PlayerElement>();
        expected.add(new PlayerElement(new Pitch('A'), 0, 12));
        expected.add(new PlayerElement(new Pitch('B'), 12, 16));
        expected.add(new PlayerElement(new Pitch('C'), 12, 16));
        expected.add(new PlayerElement(new Pitch('D'), 12, 16));
        
        for (int i = 0; i < p.size(); i++){
            assertEquals(expected.get(i), p.get(i));
        }       
    }
    
    //  test get Player Elements: Chords with weird lengths
    @Test
    public void testGetPlayerElementsIncludeChordWeirdLength(){
        List<Music> notes = new ArrayList<Music>();
        notes.add(new Note(new Fraction(1,4), 'A', 0));
        
        //triplet
        List<Music> triplet = new ArrayList<Music>();
        
        triplet.add(new Note(new Fraction(1,3), 'B', 0));
        triplet.add(new Note(new Fraction(2,3), 'C', 0));
        triplet.add(new Note(new Fraction(1,4), 'D', 0));
        notes.add(new Chord(triplet));
        
        Measure m = new Measure(notes, false, false, false, false);
        List<PlayerElement> p = m.getPlayerElements(0, 12, new Fraction(1,4));
        
        List<PlayerElement> expected = new ArrayList<PlayerElement>();
        expected.add(new PlayerElement(new Pitch('A'), 0, 12));
        expected.add(new PlayerElement(new Pitch('B'), 12, 16));
        expected.add(new PlayerElement(new Pitch('C'), 12, 32));
        expected.add(new PlayerElement(new Pitch('D'), 12, 12));
        
        for (int i = 0; i < p.size(); i++){
            assertEquals(expected.get(i), p.get(i));
        }       
    }

}


