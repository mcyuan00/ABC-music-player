package abc.player;

import java.util.List;

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
     */
    public void Play(){
        int tempo = header.tempo();
        SequencePlayer player =  new SequencePlayer(tempo, ticksPerBeat);
        // SequencePlayer player = Music.constructPlayer(tempo, tickBreakdown, pieceNoteLength);
        // call Music.constructPlayer() and then plays it
    }

}
