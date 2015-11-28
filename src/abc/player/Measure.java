package abc.player;

/**
 * Measure represents a group of notes, for which an accidental applied to a particular note
 * is assumed to still apply if the note is repeated within the measure grouping.
 * The combined duration of the notes is equal to the number of beats
 * in one measure as defined by the piece's time signature.
 */
public class Measure implements Music {
    private final Music[] m;
    private final double duration;
    
    /**
     * Make a Measure with certain notes and rests.
     * @param m array of Music
     */
    public Measure(Music[] m, double duration){
        this.m = m;
        this.duration = duration;
    }

    /**
     * @return duration of this measure, defined by the time signature
     */
    @Override
    public double duration() {
        // TODO Auto-generated method stub
        return duration;
    }

    /**
     * Transpose this measure.
     * @param semitonesUp semitones by which to transpose
     * @return a new Measure with notes equivalent to every note of the original measure
     * transposed by a given number of semitones
     */
    @Override
    public Music transpose(int semitonesUp) {
        // TODO Auto-generated method stub
        return null;
    }

}
