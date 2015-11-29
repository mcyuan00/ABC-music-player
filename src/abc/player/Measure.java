package abc.player;

/**
 * Measure represents a group of notes and rests, for which an accidental applied to 
 * a particular note is assumed to still apply if the note is repeated within the measure grouping.
 * The combined duration of the notes and rests is equal to the number of beats
 * in one measure as defined by the piece's time signature.
 */
public class Measure implements Music {
    private final Music[] m;
    private final double duration;
    
    /**
     * Make a Measure with certain notes and rests.
     * @param m array of Music
     * @param duration duration in beats, must be >= 0
     */
    public Measure(Music[] m, double duration){
        this.m = m;
        this.duration = duration;
    }

    @Override
    public double duration() {
        return duration;
    }

    @Override
    public Music transpose(int semitonesUp) {
        // TODO Auto-generated method stub
        return null;
    }

}
