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
    public Pitch pitch() {
        return pitch;
    }
    

    @Override
    public double duration() {
        return duration;
    }
    

    @Override
    public Music transpose(int semitonesUp) {
        return new Note(duration, pitch.transpose(semitonesUp));
    }

}
