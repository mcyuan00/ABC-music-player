package abc.player;

/**
 * Rest represents a pause in a piece of music
 */
public class Rest implements Music {
    private final double duration;
    
    /**
     * Make a Rest that lasts for duration beats
     * @param duration duration in beats, must be >= 0
     */
    public Rest(double duration){
        this.duration = duration;
    }

    /**
     * @return duration of this rest
     */
    @Override
    public double duration() {
        return duration;
    }

    /**
     * Transpose this rest.
     */
    @Override
    public Music transpose(int semitonesUp) {
        return this;
    }

}
