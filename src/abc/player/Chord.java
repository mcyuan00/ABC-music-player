package abc.player;

public class Chord implements Music{
    private final double duration;
    private final int numNotes;
    private final Note[] notes;
    
    public Chord(double duration, int numNotes, Note[] notes){
        this.duration = duration;
        this.numNotes = numNotes;
        this.notes = notes;
    }
    
    @Override
    public double duration() {
        // TODO Auto-generated method stub
        return 0;
    }

    @Override
    public Music transpose(int semitonesUp) {
        // TODO Auto-generated method stub
        return null;
    }
    

}
