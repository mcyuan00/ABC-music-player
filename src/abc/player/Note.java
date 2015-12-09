package abc.player;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * Note represents a note with a given pitch played for a given duration.
 * This class is immutable.
 */
public class Note implements Music {
    private final Fraction duration;
    private final char noteLetter;
    private final int octave;
    private final int accidental;
    private final Pitch pitch;
    private final boolean wasTransposed;

    /**
     * Make a Note with a certain pitch (without an accidental) played for duration beats.
     * @param duration duration in beats, must be >= 0 (e.g. one quarter note would be Fraction(1, 4)
     * @param noteLetter the letter that represents the note (A, B, C, D, E, F, G)
     * @param octave octaves above middle C 
     *          (0 represents C4 to B4, 1 represents C5 to B5, -1 represents C3 to B3)
     */
    public Note(Fraction duration, char noteLetter, int octave){
        this.duration = duration.simplify();
        this.noteLetter = noteLetter;
        this.octave = octave;
        this.accidental = 0;
        pitch = new Pitch(noteLetter).transpose(Pitch.OCTAVE*octave);
        wasTransposed = false;
    }

    /**
     * Make a Note with a certain pitch (with an accidental) played for duration beats.
     * @param duration duration in beats, must be >= 0
     * @param noteLetter the letter that represents the note (A, B, C, D, E, F, G)
     * @param octave octaves above middle C 
     *          (0 represents C4 to B4, 1 represents C5 to B5, -1 represents C3 to B3)
     * @param accidental accidental that modifies the note by a given number of semitones
     *          (0 represents natural, 1 represents sharp, 2 represents double sharp,
     *          -1 represents flat, -2 represents double flat)
     */
    public Note(Fraction duration, char noteLetter, int octave, int accidental){
        this.duration = duration.simplify();
        this.noteLetter = noteLetter;
        this.octave = octave;
        this.accidental = accidental;
        pitch = new Pitch(noteLetter).transpose(Pitch.OCTAVE*octave + accidental);
        wasTransposed = false;
    }

    /**
     * Make a Note with a certain pitch (with an accidental) played for duration beats.
     * @param duration duration in beats, must be >= 0
     * @param noteLetter the letter that represents the note (A, B, C, D, E, F, G)
     * @param octave octaves above middle C 
     *          (0 represents C4 to B4, 1 represents C5 to B5, -1 represents C3 to B3)
     * @param accidental accidental that modifies the note by a given number of semitones
     *          (0 represents natural, 1 represents sharp, 2 represents double sharp,
     *          -1 represents flat, -2 represents double flat)
     * @param wasTransposed true if this note has been explicitly transposed with an accidental;
     *          false otherwise
     */
    public Note(Fraction duration, char noteLetter, int octave, int accidental, boolean wasTransposed){
        this.duration = duration.simplify();
        this.noteLetter = noteLetter;
        this.octave = octave;
        this.accidental = accidental;
        pitch = new Pitch(noteLetter).transpose(Pitch.OCTAVE*octave + accidental);
        this.wasTransposed = wasTransposed;
    }

    /**
     * @return pitch of this note
     */
    public Pitch pitch() {
        return pitch;
    } 

    @Override
    public Fraction duration() {
        return duration;
    }

    @Override
    public Set<Integer> getAllDurationDenominators() {
        Set<Integer> denominators = new HashSet<>();
        denominators.add(duration.denominator());
        return denominators;
    }

    /**
     * @return the letter that represents the note (A, B, C, D, E, F, G)
     */
    public char getNoteLetter(){
        return noteLetter;
    }

    /**
     * @return the octave relative to middle C this note is in (where the octave of middle C is 0)
     */
    public int getOctave(){
        return octave;
    }

    /**
     * @return the number of semitones away from a natural note 
     *          (postive if the note is sharp, negative if note is flat)
     */
    public int getAccidental(){
        return accidental;
    }

    /**
     * @return true if this note was transposed (constructed from a note with an accidental), false otherwise
     */
    public boolean wasTransposed(){
        return wasTransposed;
    }

    @Override
    public List<PlayerElement> getPlayerElements(int startTick, int ticksPerBeat, Fraction pieceNoteLength) {
        List<PlayerElement> elements = new ArrayList<PlayerElement>();

        //find the number of ticks the note is played for
        Fraction numBeats = new Fraction(duration.numerator()*pieceNoteLength.denominator(), duration.denominator()*pieceNoteLength.numerator()).simplify();
        int noteDuration = ticksPerBeat*numBeats.numerator()/numBeats.denominator();

        elements.add(new PlayerElement(pitch, startTick, noteDuration));
        return elements;
    }


    @Override
    public Music applyAccidentals(Map<String, Integer> accidentalMap) {
        String noteAndOctave = Character.toString(noteLetter);
        noteAndOctave += Integer.toString(octave);
        if (wasTransposed){
            accidentalMap.put(noteAndOctave, accidental);
            return new Note(duration, noteLetter, octave, accidental, wasTransposed);
        }
        else{
            if (accidentalMap.containsKey(noteAndOctave)){
                return new Note(duration, noteLetter, octave, accidentalMap.get(noteAndOctave), wasTransposed);
            }
            else{
                return new Note(duration, noteLetter, octave, accidental, wasTransposed);
            }
        }
    }

    @Override
    public boolean equals(Object obj){
        if(! (obj instanceof Note)) {return false;}
        Note that = (Note) obj;
        return ((this.duration.equals(that.duration())) && this.pitch.equals(that.pitch()));
    }

    @Override
    public int hashCode(){
        return duration.hashCode() + pitch.hashCode();
    }

    @Override
    public String toString(){
        String toString = "";
        if(accidental > 0){
            for(int i = 0; i < accidental; i++){
                toString +="^";
            }
        }
        else if(accidental < 0){
            for(int i = 0; i > accidental; i--){
                toString +="_";
            }
        }
        toString += noteLetter;
        if(octave > 0){
            for(int i = 0; i < octave; i++){
                toString +="'";
            }
        }
        else if(octave < 0){
            for(int i = 0; i > octave; i--){
                toString +=",";
            }
        }
        toString += duration.toString();

        return toString;
    }
}
