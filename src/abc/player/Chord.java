package abc.player;

/**
 * Chord represents one or more notes played simultaneously.
 */
public class Chord implements Music{
    private final Fraction duration;
    private final int numNotes;
    private final Note[] notes;
    
    /**
     * Make a Chord with certain notes played for duration beats.
     * @param duration duration in beats, must be >= 0
     * @param numNotes number of notes in the chord
     * @param notes notes in the chord
     */
    public Chord(Fraction duration, int numNotes, Note[] notes){
        this.duration = duration;
        this.numNotes = numNotes;
        this.notes = notes;
    }
    
    @Override
    public Fraction duration() {
        return duration;
    }
    
//    @Override
//    public Music transpose(int semitonesUp) {
//        // TODO Auto-generated method stub
//        return null;
//    }

    

}
