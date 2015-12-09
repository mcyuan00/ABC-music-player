package abc.player;

import java.util.List;
import java.util.Set;

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
        Set<Integer> durationDenominators = new HashSet<>();
        int ticksPerBeat = 
        SequencePlayer player =  new SequencePlayer(tempo, ticksPerBeat);
        // SequencePlayer player = Music.constructPlayer(tempo, tickBreakdown, pieceNoteLength);
        // call Music.constructPlayer() and then plays it
    }
    
    private int getLCM(Set<Integer> durationDenominator){
        int currentLcm = 1;
        for (int denominator : durationDenominator){
            currentLcm = pairLCM(denominator, currentLcm);
        }
        return currentLcm;
    }
    
    private int pairLCM(int firstNum, int secondNum){
        int product = firstNum * secondNum;
        int gcd = pairGCD(firstNum, secondNum);
        return product / gcd;
    }
    
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
