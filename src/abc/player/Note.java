package abc.player;

/**
 * Note represents a note with a given pitch played for a given duration.
 */
public class Note implements Music {
    private final int duration;
    private final Pitch pitch;

    /**
     * Make a Note with a certain pitch played for duration beats.
     * @param duration duration in beats, must be >= 0
     * @param pitch pitch of the note
     */
    public Note(int duration, Pitch pitch){
        this.duration = duration;
        this.pitch = pitch;
    }
    
    /**
     * @return pitch of this note
     */
    @Override
    public Pitch pitch() {
        return pitch;
    }
    
    /**
     * @return duration of this note
     */
    @Override
    public double duration() {
        return duration;
    }
    
    /**
     * Transpose this note.
     * @return a new Note that is equivalent to the previous note 
     * transposed by a given number of semitones
     */
    @Override
    public Music transpose(int semitonesUp) {
        return new Note(duration, pitch.transpose(semitonesUp));
    }

}
