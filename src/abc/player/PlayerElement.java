package abc.player;

/**
 * PlayerElement contains all the information needed to add a note
 * in the sequence player, which are: pitch, startTick, and numTicks.
 */
public class PlayerElement {
    
    /**
     * Abstraction function:
     * PlayerElement represents a musical element that can be played
     * by a sequence player.
     * 
     * Rep invariant:
     * startTick must be the 0th tick or after (>=0)
     * numTicks must be greater than 0 (>0)
     * 
     * Safety from rep exposure:
     * This class is immutable.
     * All variables are private and final.
     */
    
    private final Pitch pitch;
    private final int startTick;
    private final int numTicks;
    private final boolean isRest;
    
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
        this.isRest = false;
        checkRep();
    }
    
    /**
     * Represents a rest that can be added to the SequencePlayer
     * @param startTick the start tick the rest is to be played at
     * @param numTicks the number of ticks the rest will be played for
     */
    public PlayerElement(int startTick, int numTicks){
        this.pitch = new Pitch('c');
        this.startTick = startTick;
        this.numTicks = numTicks;
        this.isRest = true;
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
     * @return the start tick the note or rest is to be played at
     */
    public int startTick(){
        return startTick;
    }
    
    /**
     * 
     * @return the number of ticks the note or rest will be played for
     */
    public int numTicks(){
        return numTicks;
    }
    
    /**
     * Asserts rep invariant.
     */
    private void checkRep(){
        assert startTick >= 0;
        assert numTicks > 0;
    }

}
