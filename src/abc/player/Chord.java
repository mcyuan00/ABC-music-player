package abc.player;

import java.util.ArrayList;
import java.util.List;

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
    public List<Fraction> getAllDurations() {
        List<Fraction> allDurations = new ArrayList<>();
        for (Music note : notes){
            allDurations.add(note.duration());
        }
        return allDurations;
    }
    
    private void checkRep(){
        assert !notes.isEmpty();
    }


    

}
