package abc.player;

import java.util.HashSet;
import java.util.List;
import java.util.Set;
import javax.sound.midi.InvalidMidiDataException;
import javax.sound.midi.MidiUnavailableException;

import abc.sound.SequencePlayer;

/**
 * A piece represents the entire music consisting of a header and the different voices
 */
public class Piece {

    //AF: 
    //      header contains the header information while voices contain all the voices of the music
    //RI:
    //      voices is not empty
    //Safety from Rep Exposure:
    //      all fields are private and final
    //      none of header or voices is returned in any observer functions

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
        checkRep();
    }
    
    private void checkRep(){
        assert !voices.isEmpty();
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
    
    /**
     * Finds the least common multiple among a set of integers
     * @param durationDenominators the numbers to find the lcm of
     * @return the least common multiple
     */
    private int getLCM(Set<Integer> durationDenominators){
        int currentLcm = 1;
        for (int denominator : durationDenominators){
            currentLcm = pairLCM(denominator, currentLcm);
        }
        return currentLcm;
    }
    
    /**
     * Finds the least common multiple of two numbers
     * @param firstNum one of the numbers
     * @param secondNum the other number
     * @return the least common multiple
     */
    private int pairLCM(int firstNum, int secondNum){
        int product = firstNum * secondNum;
        int gcd = pairGCD(firstNum, secondNum);
        return product / gcd;
    }
    
    /**
     * Finds the greatest common divisor of two numbers
     * @param firstNum one of the numbers to find GCD of
     * @param secondNum the other number
     * @return the greatest common divisor
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

}
