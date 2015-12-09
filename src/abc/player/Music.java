package abc.player;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Set;

import javax.sound.midi.InvalidMidiDataException;
import javax.sound.midi.MidiUnavailableException;

import abc.sound.SequencePlayer;

public interface Music {
    /**
     * Datatype definition:
     *      Music = Note (duration: double, pitch: Pitch) 
     *              + Chord (duration:double, numNotes: int, notes: List<Music>)
     *              + Tuplet (numNotes: int, notes List<Music>)
     *              + Rest (duration: duration)
     *              + Measure (m: List<Music>)
     *              + Voice (name: String, measures: List<Music>) 
     */

    /**
     * 
     * @return total duration of music in terms of fraction of a whole note
     */
    Fraction duration();

    /**
     * 
     * @return all the denominators for durations used
     */
    Set<Integer> getAllDurationDenominators();

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
     * @param startTick the start tick of the music, must be positive
     * @param ticksPerBeat the number of ticks in one beat of music
     * @param pieceNoteLength the default note length in the piece
     * @return the list of PlayerElements for the entire music
     */
    public List<PlayerElement> getPlayerElements(int startTick, int ticksPerBeat, Fraction pieceNoteLength);

//    /**
//     * Transposes a certain note in this music object the specified number of semitones up. N
//     * @param note a note from A-G to be transposed
//     * @param semitonesUp the number of semitones to tranpose. Flats are represented as negative numbers.
//     */
//    public void transposeKey(char note, int octave, int semitonesUp);
    
    /**
     * Apply accidentals to the entire Music
     * @param accidentalMap the map of "Note + octave" (e.g. "C0", "A-1", "D2") to the respective accidental
     * @return new Music with accidentals applied
     */
    public Music applyAccidentals(Map<String, Integer> accidentalMap);
}
