package abc.player;

import java.util.ArrayList;
import java.util.List;

/**
 * Measure represents a group of notes and rests, for which an accidental applied to 
 * a particular note is assumed to still apply if the note is repeated within the measure grouping.
 * The combined duration of the notes and rests is equal to the number of beats
 * in one measure as defined by the piece's time signature.
 */
public class Measure implements Music {
    private final Music[] m;
    
    /**
     * Make a Measure with certain notes and rests.
     * @param m array of Music
     * @param duration duration in beats, must be >= 0
     */
    public Measure(Music[] m){
        this.m = m;
    }

    @Override
    public Fraction duration() {
        List<Fraction> durations = new ArrayList<Fraction>();
        for (Music music : m){
            durations.add(music.duration());
        }
        return Fraction.sumAllFractions(durations);
    }
    
    
    @Override
    public List<PlayerElement> getPlayerElements(int startTick, int ticksPerBeat, Fraction pieceNoteLength) {
        List<PlayerElement> elements = new ArrayList<PlayerElement>();
        int currentStart = startTick;
        for (Music music:m){
            elements.addAll(music.getPlayerElements(currentStart, ticksPerBeat, pieceNoteLength));
            
            // calculate the start tick of the next music element
            Fraction numBeats = new Fraction(music.duration().numerator()*pieceNoteLength.denominator(), music.duration().denominator()*pieceNoteLength.numerator()).simplify();
            int musicDuration = ticksPerBeat*numBeats.numerator()/numBeats.denominator();
            currentStart = currentStart + musicDuration;
        }
        return elements;
    }

    @Override
    public List<Fraction> getAllDurations() {
        List<Fraction> allDurations = new ArrayList<>();
        for (Music music : m){
            allDurations.addAll(music.getAllDurations());
        }
        return allDurations;
    }


}
