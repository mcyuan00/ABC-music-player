package abc.player;

/**
 * Chord represents one or more notes played simultaneously.
 */
public class Chord implements Music{
    private final double duration;
    private final int numNotes;
    private final Note[] notes;
    
    /**
     * Make a Chord with certain notes played for duration beats.
     * @param duration duration in beats, must be >= 0
     * @param numNotes number of notes in the chord
     * @param notes notes in the chord
     */
    public Chord(double duration, int numNotes, Note[] notes){
        this.duration = duration;
        this.numNotes = numNotes;
        this.notes = notes;
    }
    
    /**
     * @return duration of this chord
     */
    @Override
    public double duration() {
        return duration;
    }
    
    /**
     * Transpose this chord.   
     * @param semitonesUp semitones by which to transpose
     * @return a new Chord with notes equivalent to every note of the original chord
     * transposed by a given number of semitones
     */
    @Override
    public Music transpose(int semitonesUp) {
        // TODO Auto-generated method stub
        return null;
    }

    

}
