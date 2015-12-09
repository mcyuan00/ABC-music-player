package abc.player;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * Voice represents a melodic line (voice) playing at the
 * same time as other melodic lines (voices).
 */
public class Voice implements Music {
    private final String name;
    private final List<Music> musicElements;
    
    /**
     * Make a Voice with a given name identifier and measures.
     * @param name identifies the voice
     * @param musicElements music for the voice to play
     */
    public Voice(String name, List<Music> musicElements){
        this.name = name;
        this.musicElements = musicElements;
    }
    
    public List<Music> getElements(){
        return musicElements;
    }

    @Override
    public Fraction duration() {
        List<Fraction> durations = new ArrayList<Fraction>();
        for (Music music : musicElements){
            durations.add(music.duration());
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
    public List<Music> measures(){
        return new ArrayList<Music>(musicElements);
    }

    @Override
    public List<PlayerElement> getPlayerElements(int startTick, int ticksPerBeat, Fraction pieceNoteLength) {
        List<PlayerElement> elements = new ArrayList<PlayerElement>();
        int currentStart = startTick;
        for (Music music : musicElements){
            elements.addAll(music.getPlayerElements(currentStart, ticksPerBeat, pieceNoteLength));
            
            // calculate the start tick of the next music element
            Fraction numBeats = new Fraction(music.duration().numerator()*pieceNoteLength.denominator(), music.duration().denominator()*pieceNoteLength.numerator()).simplify();
            int musicDuration = ticksPerBeat*numBeats.numerator()/numBeats.denominator();
            currentStart = currentStart + musicDuration;
        }
        return elements;
    }

//    @Override
//    public void transposeKey(char note,int octave, int semitonesUp) {
//        for (Music m: musicElements){
//            m.transposeKey(note,octave, semitonesUp);
//        }
//        
//    }

    @Override
    public Set<Integer> getAllDurationDenominators() {
        Set<Integer> denominators = new HashSet<>();
        for (Music measure : musicElements){
            denominators.addAll(measure.getAllDurationDenominators());
        }
        return denominators;
    }

    @Override
    public Music applyAccidentals(Map<String, Integer> accidentalMap) {
        List<Music> newMeasures = new ArrayList<>();
        for (Music measure : musicElements){
            Music newMeasure = measure.applyAccidentals(accidentalMap);
            newMeasures.add(newMeasure);
        }
        return new Voice(name, newMeasures);
    }


}
