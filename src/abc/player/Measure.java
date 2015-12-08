package abc.player;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * Measure represents a group of notes and rests, for which an accidental applied to 
 * a particular note is assumed to still apply if the note is repeated within the measure grouping.
 * The combined duration of the notes and rests is equal to the number of beats
 * in one measure as defined by the piece's time signature.
 */
public class Measure implements Music {
    private final List<Music> m;
    private final boolean startRepeat;
    private final boolean endRepeat;
    private final boolean firstEnding;
    private final boolean doubleBar;
    
    /**
     * Make a Measure with certain notes and rests.
     * @param m array of Music
     * @param duration duration in beats, must be >= 0
     */
    public Measure(List<Music> m, boolean startRepeat, boolean endRepeat, boolean firstEnding, boolean doubleBar){
        this.m = m;
        this.startRepeat = startRepeat;
        this.endRepeat = endRepeat;
        this.firstEnding = firstEnding;
        this.doubleBar = doubleBar;
    }
    
    public Measure(Measure prevMeasure, boolean startRepeat, boolean endRepeat, boolean firstEnding, boolean doubleBar){
        this.m = prevMeasure.getElements();
        this.startRepeat = startRepeat;
        this.endRepeat = endRepeat;
        this.firstEnding = firstEnding;
        this.doubleBar = doubleBar;
    }
    
    /**
     * 
     * @return a list of all the Music elements in the measure in order
     */
    public List<Music> getElements(){
        return new ArrayList<Music>(m);
    }

    @Override
    public Fraction duration() {
        List<Fraction> durations = new ArrayList<Fraction>();
        for (Music music : m){
            durations.add(music.duration());
        }
        return Fraction.sumAllFractions(durations);
    }
    
    public boolean isStartRepeat(){
        return startRepeat;
    }
    
    public boolean isEndRepeat(){
        return endRepeat;
    }
    
    public boolean isFirstEnding(){
        return firstEnding;
    }
    
    public boolean isDoubleBar(){
        return doubleBar;
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
    public Set<Integer> getAllDurationDenominators() {
        Set<Integer> denominators = new HashSet<>();
        for (Music music : m){
            denominators.addAll(music.getAllDurationDenominators());
        }
        return denominators;
    }

    @Override
    public void transposeKey(char note, int octave, int semitonesUp) {
        for (Music music: m){
            music.transposeKey(note, octave, semitonesUp);
        }
        
    }


}
