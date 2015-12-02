package abc.player;

/**
 * Voice represents a melodic line (voice) playing at the
 * same time as other melodic lines (voices).
 */
public class Voice implements Music {
    private final String name;
    private final Measure[] measures;
    
    /**
     * Make a Voice with a given name identifier and measures.
     * @param name identifies the voice
     * @param measures music for the voice to play
     */
    public Voice(String name, Measure[] measures){
        this.name = name;
        this.measures = measures;
    }

    @Override
    public Fraction duration() {
        return new Fraction(0,0);
    }

//    @Override
//    public Music transpose(int semitonesUp) {
//        // TODO Auto-generated method stub
//        return null;
//    }

}
