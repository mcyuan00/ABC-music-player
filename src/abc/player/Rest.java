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
        List<PlayerElement> playerElements = new ArrayList<>();
        
        //find the number of ticks the note is played for
        Fraction numBeats = new Fraction(duration.numerator()*pieceNoteLength.denominator(), duration.denominator()*pieceNoteLength.numerator()).simplify();
        int noteDuration = ticksPerBeat*numBeats.numerator()/numBeats.denominator();
        
        playerElements.add(new PlayerElement(startTick, noteDuration));
        return playerElements;
    }

    @Override
    public List<Fraction> getAllDurations() {
        List<Fraction> allDurations = new ArrayList<>();
        allDurations.add(duration);
        return allDurations;
    }

    @Override
    public void transposeKey(char note, int semitonesUp) {
        //rests cannot be transposed
    }



}
