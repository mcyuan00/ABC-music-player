package abc.player;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

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
            PieceReader reader = new PieceReader(file);
            String headerString = reader.getHeader();
            Header header = Parser.parseHeader(headerString);
            
            Fraction defaultNoteLength = header.noteLength();
            KeySignature keySig = header.keySignature();
            Map<String, String> voicesString = reader.getVoices();
            List<Music> voices = new ArrayList<Music>();
           
            
            for (String key: voicesString.keySet()){
                Music m = Parser.parseMusic(voicesString.get(key), defaultNoteLength, keySig, key);
                voices.add(m);
            }
            Piece piece = new Piece(header, voices);
            
            //TODO: convert into pieces
            
            
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
