package abc.player;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
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
    
    //AF: 
    //      Represents a measure and contains all the parts of music as well as information about what kind of measure it is
    //      m - the list of music that is in the measure in order
    //      startRepeat - whether this measure is the first measure of a repeat
    //      endRepeat - whether this measure is the last measure of a repeat
    //      firstEnding - whether this measure is the beginning of the first ending of a repeat
    //      doubleBar - whether this is the last measure of a major section with a doublebar
    //RI:
    //      m is not empty
    //      CANNOT be:
    //          startRepeat = firstEnding = true
    //          startRepeat = doublebar = true
    //          endRepeat = doubleBar = true
    //          firstEnding = doubleBar = true
    //Safety from Rep Exposure:
    //      everything is final and immutable
    //      we return a copy of m instead of m itself
    
    /**
     * Make a Measure with certain notes and rests.
     * @param m array of Music
     * @param startRepeat true if this measure is the measure following |: signifying start repeat
     * @param endRepeat true if this measure is the last measure of the repeat
     * @param firstEnding true if this measure is the start of the first ending of a repeat
     * @param doubleBar true if this measure ends with a doublebar signifying the end of a major section
     */
    public Measure(List<Music> m, boolean startRepeat, boolean endRepeat, boolean firstEnding, boolean doubleBar){
        this.m = m;
        this.startRepeat = startRepeat;
        this.endRepeat = endRepeat;
        this.firstEnding = firstEnding;
        this.doubleBar = doubleBar;
        checkRep();
    }
    
    /**
     * Make a Measure using a different measure
     * @param prevMeasure the measure containing all the notes that will be in this measure
     * @param startRepeat true if this measure is the measure following |: signifying start repeat
     * @param endRepeat true if this measure is the last measure of the repeat
     * @param firstEnding true if this measure is the start of the first ending of a repeat
     * @param doubleBar true if this measure ends with a doublebar signifying the end of a major section
     */
    public Measure(Measure prevMeasure, boolean startRepeat, boolean endRepeat, boolean firstEnding, boolean doubleBar){
        this.m = prevMeasure.getElements();
        this.startRepeat = startRepeat;
        this.endRepeat = endRepeat;
        this.firstEnding = firstEnding;
        this.doubleBar = doubleBar;
        checkRep();
    }
    
    private void checkRep(){
        assert !m.isEmpty();
        assert (startRepeat && firstEnding);
        assert (startRepeat && doubleBar);
        assert (endRepeat && doubleBar);
        assert (firstEnding && doubleBar);
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
    
    /**
     * @return true if this measure is start repeat, false otherwise
     */
    public boolean isStartRepeat(){
        return startRepeat;
    }
    
    /**
     * @return true if this measure is end repeat, false otherwise
     */
    public boolean isEndRepeat(){
        return endRepeat;
    }
    
    /**
     * @return true if this measure is first ending, false otherwise
     */
    public boolean isFirstEnding(){
        return firstEnding;
    }
    
    /**
     * @return true if this measure is double bar, false otherwise
     */
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
    public Music applyAccidentals(Map<String, Integer> accidentalMap) {
        List<Music> newMusicParts = new ArrayList<>();
        for (Music musicPart : m){
            Music newMusicPart = musicPart.applyAccidentals(accidentalMap);
            newMusicParts.add(newMusicPart);
        }
        return new Measure(newMusicParts, startRepeat, endRepeat, firstEnding, doubleBar);
    }

    @Override 
    public boolean equals(Object obj){
        if (!(obj instanceof Measure)){return false;}
        Measure that = (Measure)obj;
        return m.equals(that.getElements()) && startRepeat == that.isStartRepeat() && endRepeat == that.isEndRepeat() && firstEnding == that.isFirstEnding() && doubleBar == that.isDoubleBar();
    }
    
    @Override
    public int hashCode(){
        return m.hashCode();
    }
    
    @Override
    public String toString(){
        String toString = "";
        for (Music music : m){
            toString+= music.toString() + " ";
        }
        return toString;
    }
}
