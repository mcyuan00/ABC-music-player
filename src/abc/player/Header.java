package abc.player;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.tree.ErrorNode;
import org.antlr.v4.runtime.tree.TerminalNode;

import abc.parser.HeaderListener;
import abc.parser.HeaderParser;
import abc.parser.HeaderParser.CommentContext;
import abc.parser.HeaderParser.ComposerContext;
import abc.parser.HeaderParser.HeaderContext;
import abc.parser.HeaderParser.IndexContext;
import abc.parser.HeaderParser.KeyContext;
import abc.parser.HeaderParser.LengthContext;
import abc.parser.HeaderParser.MeterContext;
import abc.parser.HeaderParser.OtherfieldsContext;
import abc.parser.HeaderParser.RootContext;
import abc.parser.HeaderParser.TempoContext;
import abc.parser.HeaderParser.TextContext;
import abc.parser.HeaderParser.TitleContext;
import abc.parser.HeaderParser.VoiceContext;

/**
 * Header is a mutable type that represents the header of a music piece.
 * It has the basic informations about the piece, which are:
 *  title, composer, key, meter, tempo (defines the speed of a default note), and index.
 *
 */
public class Header {

    //rep invariant:
    //  tempo > 0
    //  all the fractions are already required to be greater than 0 and have a nonzero denominator

    private String composer;
    private KeySignature key;
    private Fraction noteLength;
    private Fraction meter;
    private int tempo;
    private String title;
    private int index;
    private List<String> voices = new ArrayList<String>();

    // default values

    private Fraction DEFAULT_METER = new Fraction(4,4);
    private Fraction DEFAULT_NOTE_LENGTH = new Fraction(1,8);
    private int DEFAULT_TEMPO = 100;
    private String DEFAULT_COMPOSER = "Unknown";

    /**
     * Makes a header with the given index, title, and key.
     * The meter will be set to 4/4, note length to 1/8, tempo = 100, and composer = "Unknown"
     * @param index the index of the piece
     * @param title the title of the piece
     * @param key the key of the piece
     */
    public Header(int index, String title, KeySignature key){
        this.index = index;
        this.title = title;
        this.key = key;
        this.composer = DEFAULT_COMPOSER;
        this.meter = DEFAULT_METER;
        this.tempo = DEFAULT_TEMPO;
        this.noteLength = DEFAULT_NOTE_LENGTH;
        checkRep();
    }

    /**
     * 
     * @return the composer of the piece
     */
    public String composer(){
        return composer;
    }

    /**
     * 
     * @return the key signature of the piece
     */
    public KeySignature keySignature(){
        return key;
    }

    /**
     * 
     * @return the note length of the default note
     */
    public Fraction noteLength(){
        return noteLength;
    }

    /**
     * 
     * @return the meter of the piece.
     */
    public Fraction meter(){
        return meter;
    }

    /**
     * 
     * @return the tempo of the piece
     */
    public int tempo(){
        return tempo;
    }

    /**
     * 
     * @return the title of the piece
     */
    public String title(){
        return title;
    }

    /**
     * 
     * @return the index of the piece
     */
    public int index(){
        return index;
    }

    /**
     * 
     * @return the voice(s) of the piece
     */
    public List<String> voices(){
        return voices;
    }
    
    /**
     * Sets the composer of the piece to composer
     * @param composer the name of the composer
     */
    public void setComposer(String composer){
        this.composer = composer;
        checkRep();
    }

    /**
     * Sets the meter of the piece to the meter
     * @param meter the meter of the piece
     */
    public void setMeter(Fraction meter){
        this.meter = meter;
        checkRep();
    }

    /**
     * Sets the tempo of the piece to the tempo
     * @param tempo the tempo of the piece
     */
    public void setTempo(int tempo){
        this.tempo = tempo;
        checkRep();
    }

    /**
     * Sets the default note length of the piece to noteLength
     * @param noteLength the length of the default note
     */
    public void setNoteLength(Fraction noteLength){
        this.noteLength = noteLength;
        checkRep();
    }

    public void addVoice(String voiceName){
        this.voices.add(voiceName);
    }
    private void checkRep(){
        assert tempo > 0;
    }


 

}
