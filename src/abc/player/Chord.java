package abc.player;

import java.util.ArrayList;
import java.util.List;

/**
 * Chord represents one or more notes played simultaneously.
 */
public class Chord implements Music{
    private final Fraction duration;
    private final int numNotes;
    private final List<Note> notes;
    
    /**
     * Make a Chord with certain notes played for duration beats.
     * @param duration duration in beats, must be >= 0
     * @param numNotes number of notes in the chord
     * @param notes notes in the chord
     */
    public Chord(Fraction duration, int numNotes, List<Note> notes){
        this.duration = duration;
        this.numNotes = numNotes;
        this.notes = notes;
    }
    
    @Override
    public Fraction duration() {
        return duration;
    }
    
    /**
     * 
     * @return the number of notes that are played together in this chord
     */
    public int numNotes(){
        return numNotes;
    }
    
    /**
     * 
     * @return the notes that are in the chord
     */
    public List<Note> notes(){
        return new ArrayList<Note>(notes);
        
    }

    @Override
    public PlayerElement constructPlayer() {
        // TODO Auto-generated method stub
        return null;
    }
    
//    @Override
//    public Music transpose(int semitonesUp) {
//        // TODO Auto-generated method stub
//        return null;
//    }

    

}
