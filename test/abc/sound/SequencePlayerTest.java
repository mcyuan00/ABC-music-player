package abc.sound;

import static org.junit.Assert.*;

import java.io.IOException;

import javax.sound.midi.InvalidMidiDataException;
import javax.sound.midi.MidiUnavailableException;

import org.junit.Test;

import abc.player.Pitch;
import abc.player.PlayerElement;

/**
 * @category no_didit
 */
public class SequencePlayerTest {

    // TODO: warmup #2

    @Test(expected=AssertionError.class)
    public void testAssertionsEnabled() {
        assert false; // make sure assertions are enabled with VM argument: -ea
    }

    @Test
    public void testPiece1() {
        SequencePlayer player;
        try {
            player = new SequencePlayer(140, 12);

            player.addNote(new Pitch('C').toMidiNote(), 0, 12);
            player.addNote(new Pitch('C').toMidiNote(), 12, 12);
            player.addNote(new Pitch('C').toMidiNote(), 24, 9);
            player.addNote(new Pitch('D').toMidiNote(), 33, 3);
            player.addNote(new Pitch('E').toMidiNote(), 36, 12);

            player.addNote(new Pitch('E').toMidiNote(), 48, 9);
            player.addNote(new Pitch('D').toMidiNote(), 57, 3);
            player.addNote(new Pitch('E').toMidiNote(), 60, 9);
            player.addNote(new Pitch('F').toMidiNote(), 69, 3);
            player.addNote(new Pitch('G').toMidiNote(), 72, 24);

            player.addNote(new Pitch('C').transpose(Pitch.OCTAVE).toMidiNote(), 96, 4);
            player.addNote(new Pitch('C').transpose(Pitch.OCTAVE).toMidiNote(), 100, 4);
            player.addNote(new Pitch('C').transpose(Pitch.OCTAVE).toMidiNote(), 104, 4);
            player.addNote(new Pitch('G').toMidiNote(), 108, 4);
            player.addNote(new Pitch('G').toMidiNote(), 112, 4);
            player.addNote(new Pitch('G').toMidiNote(), 116, 4);
            player.addNote(new Pitch('E').toMidiNote(), 120, 4);
            player.addNote(new Pitch('E').toMidiNote(), 124, 4);
            player.addNote(new Pitch('E').toMidiNote(), 128, 4);
            player.addNote(new Pitch('C').toMidiNote(), 132, 4);
            player.addNote(new Pitch('C').toMidiNote(), 136, 4);
            player.addNote(new Pitch('C').toMidiNote(), 140, 4);

            player.addNote(new Pitch('G').toMidiNote(), 144, 9);
            player.addNote(new Pitch('F').toMidiNote(), 153, 3);
            player.addNote(new Pitch('E').toMidiNote(), 156, 9);
            player.addNote(new Pitch('D').toMidiNote(), 165, 3);
            player.addNote(new Pitch('C').toMidiNote(), 168, 24);


            System.out.println(player);

            // play!
            player.play();

            System.in.read();

            /*
             * Note: A possible weird behavior of the Java sequencer: Even if the
             * sequencer has finished playing all of the scheduled notes and is
             * manually closed, the program may not terminate. This is likely
             * due to daemon threads that are spawned when the sequencer is
             * opened but keep on running even after the sequencer is killed. In
             * this case, you need to explicitly exit the program with
             * System.exit(0).
             */
            System.exit(0);

        } catch (MidiUnavailableException mue) {
            mue.printStackTrace();
        } catch (InvalidMidiDataException imde) {
            imde.printStackTrace();
        } catch (IOException ioe) {
            ioe.printStackTrace();
        }
    }


    @Test
    public void testPiece2() {
        SequencePlayer player;
        try {
            player = new SequencePlayer(200, 12);

            player.addNote(new Pitch('F').transpose(1).toMidiNote(), 0, 6);        
            player.addNote(new Pitch('E').transpose(Pitch.OCTAVE).toMidiNote(), 0, 6);
            player.addNote(new Pitch('F').transpose(1).toMidiNote(), 6, 6);        
            player.addNote(new Pitch('E').transpose(Pitch.OCTAVE).toMidiNote(), 6, 6);
            //rest for 6
            player.addNote(new Pitch('F').transpose(1).toMidiNote(), 18, 6);        
            player.addNote(new Pitch('E').transpose(Pitch.OCTAVE).toMidiNote(), 18, 6);
            //rest for 6
            player.addNote(new Pitch('F').transpose(1).toMidiNote(), 30, 6);        
            player.addNote(new Pitch('C').transpose(Pitch.OCTAVE).toMidiNote(), 30, 6);
            player.addNote(new Pitch('F').transpose(1).toMidiNote(), 36, 12);        
            player.addNote(new Pitch('E').transpose(Pitch.OCTAVE).toMidiNote(), 36, 12);

            player.addNote(new Pitch('G').toMidiNote(), 48, 12);
            player.addNote(new Pitch('B').toMidiNote(), 48, 12);
            player.addNote(new Pitch('G').transpose(Pitch.OCTAVE).toMidiNote(), 48, 12);
            //rest for 12
            player.addNote(new Pitch('G').toMidiNote(), 72, 12);
            //rest for 12

            player.addNote(new Pitch('C').transpose(Pitch.OCTAVE).toMidiNote(), 96, 18);
            player.addNote(new Pitch('G').toMidiNote(), 114, 6);
            //rest for 12
            player.addNote(new Pitch('E').toMidiNote(), 132, 12);


            player.addNote(new Pitch('E').toMidiNote(), 144, 6);
            player.addNote(new Pitch('A').toMidiNote(), 150, 12);
            player.addNote(new Pitch('B').toMidiNote(), 162, 12);
            player.addNote(new Pitch('B').transpose(-1).toMidiNote(), 174, 6);
            player.addNote(new Pitch('A').toMidiNote(), 180, 12);

            player.addNote(new Pitch('G').toMidiNote(), 192, 8);
            player.addNote(new Pitch('E').transpose(Pitch.OCTAVE).toMidiNote(), 200, 8);
            player.addNote(new Pitch('G').transpose(Pitch.OCTAVE).toMidiNote(), 208, 8);
            player.addNote(new Pitch('A').transpose(Pitch.OCTAVE).toMidiNote(), 216, 12);
            player.addNote(new Pitch('F').transpose(Pitch.OCTAVE).toMidiNote(), 228, 6);
            player.addNote(new Pitch('G').transpose(Pitch.OCTAVE).toMidiNote(), 234, 6);

            //rest for 6
            player.addNote(new Pitch('E').transpose(Pitch.OCTAVE).toMidiNote(), 246, 12);
            player.addNote(new Pitch('C').transpose(Pitch.OCTAVE).toMidiNote(), 258, 6);
            player.addNote(new Pitch('D').transpose(Pitch.OCTAVE).toMidiNote(), 264, 6);
            player.addNote(new Pitch('B').toMidiNote(), 270, 9);
            //rest


            System.out.println(player);

            // play!
            player.play();
            System.in.read();


            /*
             * Note: A possible weird behavior of the Java sequencer: Even if the
             * sequencer has finished playing all of the scheduled notes and is
             * manually closed, the program may not terminate. This is likely
             * due to daemon threads that are spawned when the sequencer is
             * opened but keep on running even after the sequencer is killed. In
             * this case, you need to explicitly exit the program with
             * System.exit(0).
             */
            //System.exit(0);

        } catch (MidiUnavailableException mue) {
            mue.printStackTrace();
        } catch (InvalidMidiDataException imde) {
            imde.printStackTrace();
        } catch (IOException ioe) {
            ioe.printStackTrace();
        }
    }
    
    //tests using playerElement to add notes
    @Test
    public void testPiece2PlayerElement() {
        SequencePlayer player;
        try {
            player = new SequencePlayer(200, 12);

            player.addNote(new PlayerElement(new Pitch('F').transpose(1), 0, 6));        
            player.addNote(new PlayerElement(new Pitch('E').transpose(Pitch.OCTAVE), 0, 6));
            player.addNote(new PlayerElement(new Pitch('F').transpose(1), 6, 6));        
            player.addNote(new PlayerElement(new Pitch('E').transpose(Pitch.OCTAVE), 6, 6));
            //rest for 6
            player.addNote(new PlayerElement(new Pitch('F').transpose(1), 18, 6));        
            player.addNote(new PlayerElement(new Pitch('E').transpose(Pitch.OCTAVE), 18, 6));
            //rest for 6
            player.addNote(new PlayerElement(new Pitch('F').transpose(1), 30, 6));        
            player.addNote(new PlayerElement(new Pitch('C').transpose(Pitch.OCTAVE), 30, 6));
            player.addNote(new PlayerElement(new Pitch('F').transpose(1), 36, 12));        
            player.addNote(new PlayerElement(new Pitch('E').transpose(Pitch.OCTAVE), 36, 12));

            player.addNote(new PlayerElement(new Pitch('G'), 48, 12));
            player.addNote(new PlayerElement(new Pitch('B'), 48, 12));
            player.addNote(new PlayerElement(new Pitch('G').transpose(Pitch.OCTAVE), 48, 12));
            //rest for 12
            player.addNote(new PlayerElement(new Pitch('G'), 72, 12));
            //rest for 12

            player.addNote(new PlayerElement(new Pitch('C').transpose(Pitch.OCTAVE), 96, 18));
            player.addNote(new PlayerElement(new Pitch('G'), 114, 6));
            //rest for 12
            player.addNote(new PlayerElement(new Pitch('E'), 132, 12));


            player.addNote(new PlayerElement(new Pitch('E'), 144, 6));
            player.addNote(new PlayerElement(new Pitch('A'), 150, 12));
            player.addNote(new PlayerElement(new Pitch('B'), 162, 12));
            player.addNote(new PlayerElement(new Pitch('B').transpose(-1), 174, 6));
            player.addNote(new PlayerElement(new Pitch('A'), 180, 12));

            player.addNote(new PlayerElement(new Pitch('G'), 192, 8));
            player.addNote(new PlayerElement(new Pitch('E').transpose(Pitch.OCTAVE), 200, 8));
            player.addNote(new PlayerElement(new Pitch('G').transpose(Pitch.OCTAVE), 208, 8));
            player.addNote(new PlayerElement(new Pitch('A').transpose(Pitch.OCTAVE), 216, 12));
            player.addNote(new PlayerElement(new Pitch('F').transpose(Pitch.OCTAVE), 228, 6));
            player.addNote(new PlayerElement(new Pitch('G').transpose(Pitch.OCTAVE), 234, 6));

            //rest for 6
            player.addNote(new PlayerElement(new Pitch('E').transpose(Pitch.OCTAVE), 246, 12));
            player.addNote(new PlayerElement(new Pitch('C').transpose(Pitch.OCTAVE), 258, 6));
            player.addNote(new PlayerElement(new Pitch('D').transpose(Pitch.OCTAVE), 264, 6));
            player.addNote(new PlayerElement(new Pitch('B'), 270, 9));
            //rest


            System.out.println(player);

            // play!
            player.play();
            System.in.read();


            /*
             * Note: A possible weird behavior of the Java sequencer: Even if the
             * sequencer has finished playing all of the scheduled notes and is
             * manually closed, the program may not terminate. This is likely
             * due to daemon threads that are spawned when the sequencer is
             * opened but keep on running even after the sequencer is killed. In
             * this case, you need to explicitly exit the program with
             * System.exit(0).
             */
            //System.exit(0);

        } catch (MidiUnavailableException mue) {
            mue.printStackTrace();
        } catch (InvalidMidiDataException imde) {
            imde.printStackTrace();
        } catch (IOException ioe) {
            ioe.printStackTrace();
        }
    }



}
