package abc.player;

import java.util.List;

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
    private final Fraction noteDuration; // duration of each note in tuplet i.e. quarter/eighth etc
    private final List<Note> chordNotes;
    
    /**
     * Make a Tuplet with certain notes.
     * @param numNotes number of notes in the tuplet
     * @param notes notes in the tuplet
     */
    public Tuplet(int numNotes, List<Note> chordNotes, Fraction noteDuration){
        this.numNotes = numNotes;
        this.noteDuration = noteDuration;
        this.chordNotes = chordNotes;
    }

    @Override
    public Fraction duration() {
        return new Fraction(noteDuration.numerator()*numNotes, noteDuration.denominator());
    }
    
    /**
     * 
     * @return the length of the individual notes of the tuplet
     */
    public Fraction noteDuration(){
        return noteDuration;
    }
    
    /**
     * 
     * @return the number of notes in the tuplet (i.e. 2 for duplet, 3 for triplet, 4 for quaduplet)
     */
    public int numNotes(){
        return numNotes;
        
    }
    
    /**
     * 
     * @return a list of all the notes played in the tuplet
     */
    public List<Note> chordNotes(){
        return chordNotes;
    }

    @Override
    public List<PlayerElement> getPlayerElements(int startTick) {
        // TODO Auto-generated method stub
        return null;
    }
    
//    @Override
//    public Music transpose(int semitonesUp) {
//        // TODO Auto-generated method stub
//        return null;
//    }

}
