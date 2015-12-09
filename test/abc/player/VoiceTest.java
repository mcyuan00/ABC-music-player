package abc.player;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.junit.Test;

public class VoiceTest {
    @Test(expected=AssertionError.class)
    public void testAssertionsEnabled() {
        assert false; // make sure assertions are enabled with VM argument: -ea
    }

    //  test get Player Elements: notes one after another, two measures
    @Test
    public void testGetPlayerElementsSimpleNotes(){
        List<Music> notes = new ArrayList<Music>();
        notes.add(new Note(new Fraction(1,4), 'A', 0));
        notes.add(new Note(new Fraction(1,4), 'B', 0));
        notes.add(new Note(new Fraction(1,4), 'C', 0));
        notes.add(new Note(new Fraction(1,4), 'D', 0));
        Measure m = new Measure(notes, false, false, false, false);
        List<Music> notes2 = new ArrayList<Music>();
        notes2.add(new Note(new Fraction(1,4), 'A', 0));
        notes2.add(new Note(new Fraction(1,4), 'B', 0));
        notes2.add(new Note(new Fraction(1,4), 'C', 0));
        notes2.add(new Note(new Fraction(1,4), 'D', 0));
        Measure m2 = new Measure(notes2, false, false, false, false);
        
        Voice v = new Voice("voice", Arrays.asList(m,m2));

        List<PlayerElement> p = v.getPlayerElements(0, 12, new Fraction(1,4));

        List<PlayerElement> expected = new ArrayList<PlayerElement>();
        expected.add(new PlayerElement(new Pitch('A'), 0, 12));
        expected.add(new PlayerElement(new Pitch('B'), 12, 12));
        expected.add(new PlayerElement(new Pitch('C'), 24, 12));
        expected.add(new PlayerElement(new Pitch('D'), 36, 12));
        expected.add(new PlayerElement(new Pitch('A'), 48, 12));
        expected.add(new PlayerElement(new Pitch('B'), 60, 12));
        expected.add(new PlayerElement(new Pitch('C'), 72, 12));
        expected.add(new PlayerElement(new Pitch('D'), 84, 12));

        for (int i = 0; i < p.size(); i++){
            assertEquals(expected.get(i), p.get(i));
        }       
    }

    //  test get Player Elements: simple note measure followed by chord note easure, two measures
    @Test
    public void testGetPlayerElementsSimpleAndChords(){
        List<Music> notes = new ArrayList<Music>();
        notes.add(new Note(new Fraction(1,4), 'A', 0));
        notes.add(new Note(new Fraction(1,4), 'B', 0));
        notes.add(new Note(new Fraction(1,4), 'C', 0));
        notes.add(new Note(new Fraction(1,4), 'D', 0));
        Measure m = new Measure(notes, false, false, false, false);
        
        List<Music> notes2 = new ArrayList<Music>();
        notes2.add(new Note(new Fraction(1,4), 'A', 0));
        
        //triplet
        List<Music> triplet = new ArrayList<Music>();
        
        triplet.add(new Note(new Fraction(1,3), 'B', 0));
        triplet.add(new Note(new Fraction(2,3), 'C', 0));
        triplet.add(new Note(new Fraction(1,4), 'D', 0));
        notes2.add(new Chord(triplet));
        
        Measure m2 = new Measure(notes2, false, false, false, false);
        
        Voice v = new Voice("voice", Arrays.asList(m,m2));

        List<PlayerElement> p = v.getPlayerElements(0, 12, new Fraction(1,4));

        List<PlayerElement> expected = new ArrayList<PlayerElement>();
        expected.add(new PlayerElement(new Pitch('A'), 0, 12));
        expected.add(new PlayerElement(new Pitch('B'), 12, 12));
        expected.add(new PlayerElement(new Pitch('C'), 24, 12));
        expected.add(new PlayerElement(new Pitch('D'), 36, 12));
        expected.add(new PlayerElement(new Pitch('A'), 48, 12));
        expected.add(new PlayerElement(new Pitch('B'), 60, 16));
        expected.add(new PlayerElement(new Pitch('C'), 60, 32));
        expected.add(new PlayerElement(new Pitch('D'), 60, 12));

        for (int i = 0; i < p.size(); i++){
            assertEquals(expected.get(i), p.get(i));
        }       
    }
    
}
