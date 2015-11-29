package abc.player;

/**
 * Tuplet represents a consecutive group of notes that are to
 * be played for a duration that is either greater or less than 
 * the sum of the individual notes within that group.
 * A tuplet can either be a duplet, triplet, or quadruplet, as defined below.
 * Duplet: 2 notes in the time of 3 notes
 * Triplet: 3 notes in the time of 2 notes
 * Quadruplet: 4 notes in the time of 3 notes
 */
public class Tuplet implements Music{
    private final int numNotes;
    private final Note[] notes;
    
    /**
     * Make a tuplet with certain notes.
     * @param numNotes number of notes in the tuplet
     * @param notes notes in the tuplet
     */
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
