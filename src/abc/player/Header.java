package abc.player;

public class Header {
   
    private String composer;
    private KeySignature key;
    private Fraction noteLength;
    private Fraction meter;
    private int tempo;
    private String title;
    private int index;
    
    // default values
    
    private Fraction DEFAULT_METER = new Fraction(4,4);
    private Fraction DEFAULT_NOTE_LENGTH = new Fraction(1,8);
    private int DEFAULT_TEMPO = 100;
    private String DEFAULT_COMPOSER = "Unknown";
    
    
    public Header(int index, String title, KeySignature key){
        this.index = index;
        this.title = title;
        this.key = key;
        this.composer = DEFAULT_COMPOSER;
        this.meter = DEFAULT_METER;
        this.tempo = DEFAULT_TEMPO;
        this.noteLength = DEFAULT_NOTE_LENGTH;
    }
    
    public String composer(){
        return composer;
    }
    
    public KeySignature keySignature(){
        return key;
    }
    
    public Fraction noteLength(){
        return noteLength;
    }
    
    public Fraction meter(){
        return meter;
    }
    
    public int tempo(){
        return tempo;
    }
    
    public String title(){
        return title;
    }
    
    public int index(){
        return index;
    }
    
    public void setComposer(String composer){
        this.composer = composer;
    }
    
    public void setMeter(Fraction meter){
        this.meter = meter;
    }
    
    public void setTempo(int tempo){
        this.tempo = tempo;
    }
    
    public void setNoteLength(Fraction noteLength){
        this.noteLength = noteLength;
    }

}
