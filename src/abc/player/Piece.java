package abc.player;

import abc.sound.SequencePlayer;

/**
 * A piece consists of a header and a music object
 */
public class Piece {

    /***
     * Abstraction function:
     */

    private final Header header;
    private final Music music;

    /**
     * Creates a piece object
     * @param header    header of the music piece
     * @param music     body of the music piece 
     */
    public Piece(Header header, Music music){
        this.header = header;
        this.music = music;
    }

    /**
     * Uses information from the header and the music piece to create a SequencePlayer
     * object that plays the piece.
     */
    public static void Play(){
        // SequencePlayer player = Music.constructPlayer(tempo, tickBreakdown, pieceNoteLength);
        // call Music.constructPlayer() and then plays it
    }

}
