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
        List<Fraction> durations = new ArrayList<Fraction>();
        for (Measure measure : measures){
            durations.add(measure.duration());
        }
        return Fraction.sumAllFractions(durations);
    }
    
    /**
     * Identifies the voice with a String name
     * @return name of the voice
     */
    public String name(){
        return name;
    }
    
    /**
     * Returns the measures that the voice plays
     * @return ArrayList<Measure> of measures played by the voice
     */
    public List<Measure> measures(){
        return new ArrayList<Measure>(measures);
    }

    @Override
    public List<PlayerElement> getPlayerElements(int startTick, int ticksPerBeat, Fraction pieceNoteLength) {
        List<PlayerElement> elements = new ArrayList<PlayerElement>();
        int currentStart = startTick;
        for (Measure measure : measures){
            elements.addAll(measure.getPlayerElements(currentStart, ticksPerBeat, pieceNoteLength));
            
            // calculate the start tick of the next music element
            Fraction numBeats = new Fraction(measure.duration().numerator()*pieceNoteLength.denominator(), measure.duration().denominator()*pieceNoteLength.numerator()).simplify();
            int musicDuration = ticksPerBeat*numBeats.numerator()/numBeats.denominator();
            currentStart = currentStart + musicDuration;
        }
        return elements;
    }

    @Override
    public List<Fraction> getAllDurations() {
        List<Fraction> allDurations = new ArrayList<>();
        for (Music music : measures){
            allDurations.addAll(music.getAllDurations());
        }
        return allDurations;
    }


}
