package abc.player;

import java.util.ArrayList;
import java.util.List;

/**
 * Voice represents a melodic line (voice) playing at the
 * same time as other melodic lines (voices).
 */
public class Voice implements Music {
    private final String name;
    private final List<Measure> measures;
    
    /**
     * Make a Voice with a given name identifier and measures.
     * @param name identifies the voice
     * @param measures music for the voice to play
     */
    public Voice(String name, List<Measure> measures){
        this.name = name;
        this.measures = measures;
    }

    @Override
    public Fraction duration() {
        return new Fraction(0,0);
    }
    
    public String name(){
        return name;
    }
    
    public List<Measure> measures(){
        return new ArrayList<Measure>(measures);
    }

//    @Override
//    public Music transpose(int semitonesUp) {
//        // TODO Auto-generated method stub
//        return null;
//    }

}
