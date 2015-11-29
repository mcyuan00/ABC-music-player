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
        double time =0;
        for (Note note: notes){
            time += note.duration();
        }
        return time;
    }

    @Override
    public Music transpose(int semitonesUp) {
        // TODO Auto-generated method stub
        return null;
    }

}
