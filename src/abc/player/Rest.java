package abc.player;

/**
 * Rest represents a pause in a piece of music
 */
public class Rest implements Music {
    private final Fraction duration;
    
    /**
     * Make a Rest that lasts for duration beats
     * @param duration duration in beats, must be >= 0
     */
    public Rest(Fraction duration){
        this.duration = duration;
    }

    /**
     * @return duration of this rest
     */
    @Override
    public Fraction duration() {
        return duration;
    }

    @Override
    public PlayerElement constructPlayer() {
        // TODO Auto-generated method stub
        return null;
    }

    /**
     * Transpose this rest.
     */
//    @Override
//    public Music transpose(int semitonesUp) {
//        return this;
//    }

}
