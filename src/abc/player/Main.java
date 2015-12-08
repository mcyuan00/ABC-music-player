package abc.player;

import java.io.IOException;

import javax.sound.midi.InvalidMidiDataException;
import javax.sound.midi.MidiUnavailableException;

import abc.sound.SequencePlayer;

/**
 * Main entry point of your application.
 */
public class Main {

    /**
     * Plays the input file using Java MIDI API and displays
     * header information to the standard output stream.
     * 
     * (Your code should not exit the application abnormally using
     * System.exit().)
     * 
     * @param file the name of input abc file
     */
    public static void play(String file) {
        try {
            String pieceReader = PieceReader.readPiece(file);
            Header parseHeader = Parser.parseHeader(pieceReader);
            Music parseMusic = Parser.parseMusic(pieceReader, defaultNoteLength, keySig);
            System.out.println(parseHeader.getHeader());
            try {
                SequencePlayer sequencePlayer = Piece.Play();
                sequencePlayer.play();
            } catch (MidiUnavailableException mue) {
                mue.printStackTrace();
            } catch (InvalidMidiDataException imde) {
                imde.printStackTrace();
            }            
        } catch (IOException ioe) {
            ioe.printStackTrace();
        }
        
    }

    public static void main(String[] args) {
        // CALL play() HERE USING ARGS
    }
}
