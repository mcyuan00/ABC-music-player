package abc.player;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * Rest represents a pause in a piece of music. It is immutable.
 */
public class Rest implements Music {
    private final Fraction duration;
    
    //AF: 
    //      the duration represents the duration of the rest where nothing is played
    //RI:
    //      duration > 0
    //Safety from Rep Exposure:
    //      duration is private, final and immutable
    
    /**
     * Make a Rest that lasts for duration beats
     * @param duration duration in beats, must be >= 0
     */
    public Rest(Fraction duration){
        this.duration = duration.simplify();
        checkRep();
    }
    
    private void checkRep(){
        assert duration.toDecimal() > 0;
    }

    /**
     * @return duration of this rest
     */
    @Override
    public Fraction duration() {
        return duration;
    }


    @Override
    public List<PlayerElement> getPlayerElements(int startTick, int ticksPerBeat, Fraction pieceNoteLength) {
        List<PlayerElement> playerElements = new ArrayList<>();
        
        //find the number of ticks the note is played for
        Fraction numBeats = new Fraction(duration.numerator()*pieceNoteLength.denominator(), duration.denominator()*pieceNoteLength.numerator()).simplify();
        int noteDuration = ticksPerBeat*numBeats.numerator()/numBeats.denominator();
        
        playerElements.add(new PlayerElement(startTick, noteDuration));
        return playerElements;
    }

    @Override
    public Set<Integer> getAllDurationDenominators() {
        Set<Integer> denominators = new HashSet<>();
        denominators.add(duration.denominator());
        return denominators;
    }

//    @Override
//    public void transposeKey(char note,int octave, int semitonesUp) {
//        //rests cannot be transposed
//    }
    

    @Override
    public Music applyAccidentals(Map<String, Integer> accidentalMap) {
        return new Rest(duration);
    }

    @Override
    public boolean equals(Object obj){
        if(! (obj instanceof Rest)) {return false;}
        Rest that = (Rest) obj;
        return this.duration.equals(that.duration());
    }
    
    @Override
    public int hashCode(){
        return duration.hashCode();
    }
    
    @Override
    public String toString(){
        return "z" + duration.toString();
    }


}
