package abc.player;

import java.util.List;

import javax.sound.midi.InvalidMidiDataException;
import javax.sound.midi.MidiUnavailableException;

import abc.sound.SequencePlayer;

public interface Music {
    /**
     * Datatype definition:
     *      Music = Note (duration: double, pitch: Pitch) 
     *              + Chord (duration:double, numNotes: int, notes: List<Note>)
     *              + Tuplet (numNotes: int, notes List<Note>)
     *              + Rest (duration: duration)
     *              + Measure (m: List<Note>)
     *              + Voice (name: String, measures: List<Note>) 
     */

    /**
     * 
     * @return total duration of music in terms of fraction of a whole note
     */
    Fraction duration();
    
    /**
     * Transpose all notes upward or downward in pitch.
     * @param semitonesUp semitones by which to transpose
     * @return for Music m, return m' such that for all notes n in m, the
     *         corresponding note n' in m' has
     *         n'.pitch() == n.pitch().transpose(semitonesUp), and m' is
     *         otherwise identical to m
     * @throws InvalidMidiDataException 
     * @throws MidiUnavailableException 
     */
//    Music transpose(int semitonesUp);
    
    /**
     * 
     * @param tempo
     * @param ticksPerBeat the number of ticks in one beat of music
     * @param pieceNoteLength the default note length in the piece
     * @return a SequencePlayer that plays the entire music
     * @throws MidiUnavailableException
     * @throws InvalidMidiDataException
     */
    public static SequencePlayer constructPlayer(int tempo, int ticksPerBeat, Fraction pieceNoteLength) throws MidiUnavailableException, InvalidMidiDataException{
        // call piece.constructPlayer TODO finish this thing
        return new SequencePlayer(tempo, ticksPerBeat);
    }
    
    /**
     * Translates this music object into PlayerElements, to be used to construct a SequencePlayer
     * @param startTick the start tick of the music
     * @param ticksPerBeat the number of ticks in one beat of music
     * @param pieceNoteLength the default note length in the piece
     * @return the list of PlayerElements for the entire music
     */
    List<PlayerElement> getPlayerElements(int startTick, int ticksPerBeat, Fraction pieceNoteLength);
    
    @Override String toString();
    
    @Override boolean equals(Object obj);
    
    @Override int hashCode();
    
}
