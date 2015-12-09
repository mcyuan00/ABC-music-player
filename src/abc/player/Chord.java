package abc.player;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * Chord represents one or more notes played simultaneously.
 */
public class Chord implements Music{
    private final List<Music> notes;
    
    /**
     * Make a Chord with certain notes played for duration beats.
     * @param duration duration in beats, must be >= 0 
     * @param notes notes in the chord; cannot be an empty list
     */
    public Chord(List<Music> notes){
        this.notes = notes;
        checkRep();
    }
    // asserts rep invariant
    private void checkRep(){
        assert !notes.isEmpty();
    }
    
    /**
     * @return the number of notes that are played together in this chord
     */
    public int numNotes(){
        return notes.size();
    }
    
    /**
     * @return the a list that contains the notes within in this chord
     */
    public List<Music> chordNotes(){
        return new ArrayList<Music>(notes);   
    }

    // duration of chord is the duration of the first note 
    @Override
    public Fraction duration() {
        return notes.get(0).duration();
    }

    @Override
    public List<PlayerElement> getPlayerElements(int startTick, int ticksPerBeat, Fraction pieceNoteLength) {
        List<PlayerElement> elements = new ArrayList<PlayerElement>();
        for(Music note : notes){
            elements.addAll(note.getPlayerElements(startTick, ticksPerBeat, pieceNoteLength));
        }
        return elements;
    }

    @Override
    public Set<Integer> getAllDurationDenominators() {
        Set<Integer> denominators = new HashSet<>();
        for (Music note : notes){
            denominators.addAll(note.getAllDurationDenominators());
        }
        return denominators;
    }
    
    @Override
    public Music applyAccidentals(Map<String, Integer> accidentalMap) {
        List<Music> newNotes = new ArrayList<>();
        for (Music m : notes){
            Music newNote = m.applyAccidentals(accidentalMap);
            newNotes.add(newNote);
        }
        return new Chord(newNotes);
    }
    
    @Override
    public boolean equals(Object obj){
        if(! (obj instanceof Chord)) {return false;}
        Chord that = (Chord) obj;
        return this.chordNotes().equals(that.chordNotes());
    }
    
    @Override 
    public int hashCode(){
        int hashCode = 0;
        for (Music m: notes){
            hashCode+= m.hashCode();
        }
        return hashCode;
    }
    
    @Override
    public String toString(){
        String toString = "[";
        for (Music m: notes){
            toString += m.toString();
        }
        toString += "]";
        return toString;
    }
        

}
