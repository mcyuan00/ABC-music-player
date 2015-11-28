package abc.player;

public class Tuplet implements Music{
    private final int numNotes;
    private final Note[] notes;
    
    public Tuplet(int numNotes, Note[] notes){
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
