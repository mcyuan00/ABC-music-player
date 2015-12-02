package abc.player;

/**
 * Player element contains all the information needed to add a note
 * in the sequence player, which are: pitch, startTick, and numTicks.
 * This class is immutable.
 *
 */
public class PlayerElement {
    
    private final Pitch pitch;
    private final int startTick;
    private final int numTicks;
    
    /**
     * Represents a note that can be added to the SequencePlayer
     * @param pitch the pitch of the note
     * @param startTick the start tick the note is to be played at
     * @param numTicks the number of ticks the note will be played for
     */
    public PlayerElement(Pitch pitch, int startTick, int numTicks){
        this.pitch = pitch;
        this.startTick = startTick;
        this.numTicks = numTicks;
        checkRep();
    }
    
    /**
     * 
     * @return the midi value of the pitch
     */
    public int pitchMidiValue(){
        return pitch.toMidiNote();
    }
    
    /**
     * 
     * @return the start tick the note is to be played at
     */
    public int startTick(){
        return startTick;
    }
    
    /**
     * 
     * @return the number of ticks the note will be played for
     */
    public int numTicks(){
        return numTicks;
    }
    
    private void checkRep(){
        assert startTick >= 0;
        assert numTicks > 0;
    }

}
