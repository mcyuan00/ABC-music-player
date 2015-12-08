package abc.player;

import java.util.ArrayList;
import java.util.List;

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
    public List<PlayerElement> getPlayerElements(int startTick, int ticksPerBeat, Fraction pieceNoteLength) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public List<Fraction> getAllDurations() {
        List<Fraction> allDurations = new ArrayList<>();
        allDurations.add(duration);
        return allDurations;
    }

    @Override
    public void transposeKey(char note,int octave, int semitonesUp) {
        //rests cannot be transposed
    }



}
