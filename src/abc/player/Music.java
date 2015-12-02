package abc.player;

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
     * @return total duration of music
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
    
    public static SequencePlayer play(int tempo, int tickBreakdown) throws MidiUnavailableException, InvalidMidiDataException{
        // call piece.constructPlayer
        return new SequencePlayer(tempo, tickBreakdown);
    }
    
    PlayerElement constructPlayer(); 
    
    @Override String toString();
    
    @Override boolean equals(Object obj);
    
    @Override int hashCode();
    
}
