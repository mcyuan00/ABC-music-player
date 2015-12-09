package abc.player;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

import javax.sound.midi.InvalidMidiDataException;
import javax.sound.midi.MidiUnavailableException;

import abc.sound.SequencePlayer;

/**
 * A piece consists of a header and a music object
 */
public class Piece {

    /***
     * Abstraction function:
     */

    private final Header header;
    private final List<Music> voices;

    /**
     * Creates a piece object
     * @param header    header of the music piece
     * @param music     body of the music piece 
     */
    public Piece(Header header, List<Music> voices){
        this.header = header;
        this.voices = voices;
    }

    /**
     * Uses information from the header and the music piece to create a SequencePlayer
     * object that plays the piece.
     * @throws InvalidMidiDataException 
     * @throws MidiUnavailableException 
     */
    public void play() throws MidiUnavailableException, InvalidMidiDataException{
        int tempo = header.tempo();
        
        Set<Integer> durationDenominators = new HashSet<Integer>();
        for (Music m: voices){
            durationDenominators.addAll(m.getAllDurationDenominators());
        }
        int ticksPerBeat = getLCM(durationDenominators);
        
        Fraction pieceNoteLength = header.noteLength();
        SequencePlayer player =  new SequencePlayer(tempo, ticksPerBeat);
        for (Music m: voices){
            List<PlayerElement> elements = m.getPlayerElements(0, ticksPerBeat, pieceNoteLength);
            for (PlayerElement e: elements){
                player.addNote(e);
            }
        }
        
        player.play();
    }
    
    private int getLCM(Set<Integer> durationDenominators){
        return 0;
    }

}
