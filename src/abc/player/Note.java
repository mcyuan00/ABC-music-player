package abc.player;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
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
    private boolean wasTransposed = false;

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
    
    @Override
    public void transposeKey(char note, int octave, int semitonesUp) {
        if(note == noteLetter && this.octave == octave){
            pitch.transpose(semitonesUp);
        }  
    }

    public void setTransposeTag(boolean transpose){
        this.wasTransposed = transpose;
    }
    
    public boolean getTransposeTag(){
        return wasTransposed;
    }
    
    public char getNoteLetter(){
        return noteLetter;
    }
    
    public int getOctave(){
        return octave;
    }
    
    public int getAccidental(){
        return accidental;
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
    public boolean equals(Object obj){
        if(! (obj instanceof Note)) {return false;}
        Note that = (Note) obj;
        return ((this.duration.equals(that.duration())) && this.pitch.equals(that.pitch()));
    }



}
