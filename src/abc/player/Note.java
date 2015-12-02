package abc.player;

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
     * Make a Note with a certain pitch played for duration beats.
     * @param duration duration in beats, must be >= 0
     * @param pitch pitch of the note
     */
    public Note(Fraction duration, char noteLetter, int octave){
        this.duration = duration;
        this.noteLetter = noteLetter;
        this.octave = octave;
        this.accidental = 0;
        pitch = new Pitch(noteLetter).transpose(Pitch.OCTAVE*octave);
    }
    
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
    
//    @Override
//    public Music transpose(int semitonesUp) {
//        return new Note(duration, pitch.transpose(semitonesUp));
//    }

}
