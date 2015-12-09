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
     * @return the header of the piece
     */
    public Header getHeader(){
        return header;
    }

    /**
     * @return the list of the piece's voices
     */
    public List<Music> getVoices(){
        return voices;
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
                if(!e.isRest()){
                    player.addNote(e);
                }
            }
        }

        player.play();
    }

    /**
     * Utility function to find the LCM of a set of integers
     * @param durationDenominators a set of integers to find the LCM of
     * @return the LCM
     */
    private int getLCM(Set<Integer> durationDenominators){
        int currentLcm = 1;
        for (int denominator : durationDenominators){
            currentLcm = pairLCM(denominator, currentLcm);
        }
        return currentLcm;
    }

    /**
     * Utility function to find the LCM of two integers
     * @param firstNum first integer
     * @param secondNum second integer
     * @return the two integers' LCM
     */
    private int pairLCM(int firstNum, int secondNum){
        int product = firstNum * secondNum;
        int gcd = pairGCD(firstNum, secondNum);
        return product / gcd;
    }

    /**
     * Utility function to find the GCD of two integers
     * @param firstNum first integer
     * @param secondNum second integer
     * @return the two integers' GCD
     */
    private int pairGCD(int firstNum, int secondNum){
        if(firstNum == 0){
            return secondNum;
        }
        if(secondNum == 0){
            return firstNum;
        }
        if(firstNum == secondNum){
            return firstNum;
        }
        if(firstNum < secondNum){
            return pairGCD(firstNum, (secondNum%firstNum));
        }
        return pairGCD((firstNum % secondNum), secondNum);
    }

    @Override
    public boolean equals(Object obj){
        if (!(obj instanceof Piece)){return false;}
        Piece that = (Piece)obj;
        return header.equals(that.getVoices()) && voices.equals(that.getVoices());
    }

    @Override
    public int hashCode(){
        return header.hashCode() + voices.hashCode();
    }

    @Override
    public String toString(){
        String toString = header.toString() + "\n";
        for (Music m: voices){
            toString += m.toString() + "\n";
        }
        return toString;
    }
}
