package abc.player;

import java.util.List;

/**
 * Note represents a note with a given pitch played for a given duration.
 */
public class Note implements Music {
    private final Fraction duration;
    private final char noteLetter;
    private final int octave;
    private final int accidental;
    private final Pitch pitch;

    /**
     * Make a Note with a certain pitch (without an accidental) played for duration beats.
     * @param duration duration in beats, must be >= 0
     * @param noteLetter the letter that represents the note (A, B, C, D, E, F, G)
     * @param octave octaves above middle C 
     *          (0 represents C4 to B4, 1 represents C5 to B5, -1 represents C3 to B3)
     */
    public Note(Fraction duration, char noteLetter, int octave){
        this.duration = duration;
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
        this.duration = duration;
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
    public List<PlayerElement> getPlayerElements(int startTick, int ticksPerBeat, Fraction pieceNoteLength) {
        // TODO Auto-generated method stub
        return null;
    }
    
//    @Override
//    public Music transpose(int semitonesUp) {
//        return new Note(duration, pitch.transpose(semitonesUp));
//    }

}
