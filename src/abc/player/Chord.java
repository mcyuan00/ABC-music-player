package abc.player;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * Chord represents one or more notes played simultaneously. Chord is immutable.
 */
public class Chord implements Music{
    private final List<Music> notes;
    
    //AF: 
    //      notes in the list notes contain all the notes contained in the chord
    //      the duration of the chord is equal to the duration of the first Note in the list notes
    //RI:
    //      list notes cannot be empty
    //Safety from Rep Exposure:
    //      notes is final and private
    //      return copy of notes for chordNotes instead of notes itself
    
    
    /**
     * Make a Chord with certain notes played for duration beats.
     * @param duration duration in beats, must be >= 0 
     * @param notes notes in the chord; cannot be an empty list
     *          all elements in notes must a Note
     */
    public Chord(List<Music> notes){
        this.notes = notes;
        checkRep();
    }
    
    
    /**
     * 
     * @return the number of notes that are played together in this chord
     */
    public int numNotes(){
        return notes.size();
    }
    
    /**
     * 
     * @return the notes that are in the chord
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
    
    private void checkRep(){
        assert !notes.isEmpty();
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
        

}
