package abc.player;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

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
    //noteLength * adjustmentFactor is the actual length of individual notes
    //noteLength keeps track of the length of notes that are passed in
    private final Fraction noteLength;
    private final int tupletNumber;
    private final List<Music> notes;
    private final Fraction adjustmentFactor;
    
    //AF: 
    //      notes represents the note to be played as a tuplet
    //      first element of note determines the length of the tuplet
    //RI:
    //      list notes cannot be empty
    //      1 < tupletNumber < 5
    //      all elements in the noteElements must have equal length
    //Safety from Rep Exposure:
    //      all fields are immutable and final
    //      notes is never returned, but we only return a copy of it
    
    /**
     * Make a Tuplet with certain notes.
     * @param tupletNumber type of tuplet (2 for duplet, 3 for triplet, and 4 for quadruplet)
     * @param notes notes in the tuplet; each note are required to have the same duration; cannot be empty
     */

    public Tuplet(int tupletNumber, List<Music> notes){
        this.tupletNumber = tupletNumber;
        this.notes = notes;
        noteLength = notes.get(0).duration();
        if (tupletNumber == 2){
            adjustmentFactor = new Fraction(3, 2);
        }
        else if (tupletNumber == 3){
            adjustmentFactor = new Fraction(2, 3);
        }
        else{
            adjustmentFactor = new Fraction(3, 4);
        }
        checkRep();
    }
    
    //checks that numNotes == notes.size() and that 1 < numNotes < 5;
    private void checkRep(){
        assert (tupletNumber > 1);
        assert (tupletNumber < 5);
        for (Music note : notes){
            assert noteLength.equals(note.duration());
        }
        assert !notes.isEmpty();
    }

    @Override
    public Fraction duration() {
        return new Fraction(notes.size() * noteLength.numerator() * adjustmentFactor.numerator(), 
                noteLength.denominator() * adjustmentFactor.denominator());
    }
    
    /**
     * @return the length of the individual notes of the tuplet as a fraction of a whole note
     */
    public Fraction noteDuration(){
        return new Fraction(noteLength.numerator() * adjustmentFactor.numerator(), 
                noteLength.denominator() * adjustmentFactor.denominator());
    }
    
    /**
     * @return the tuplet number (i.e. 2 for duplet, 3 for triplet, 4 for quaduplet)
     */

    public int tupletNumber(){
        return tupletNumber;
        
    }
    
    /**
     * @return a list of all the notes played in the tuplet
     */
    public List<Music> tupletNotes(){
        return new ArrayList<Music>(notes);
    }

    @Override
    public List<PlayerElement> getPlayerElements(int startTick, int ticksPerBeat, Fraction pieceNoteLength) {
        List<PlayerElement> elements = new ArrayList<PlayerElement>();
        int currentStart = startTick;
        for (Music music : notes){
            List<PlayerElement> noteElements = music.getPlayerElements(currentStart, ticksPerBeat, pieceNoteLength);
            List<PlayerElement> elementsLengthFixed = new ArrayList<>();
            int adjustedNumTicks = noteElements.get(0).numTicks() 
                    * adjustmentFactor.numerator() / adjustmentFactor.denominator();
            for (PlayerElement playerElement : noteElements){
                elementsLengthFixed.add(new PlayerElement(playerElement.pitch(), currentStart, adjustedNumTicks));
            }
            elements.addAll(elementsLengthFixed);
            currentStart += adjustedNumTicks;
        }
        return elements;
    }

    @Override
    public Set<Integer> getAllDurationDenominators() {
       Set<Integer> denominators = new HashSet<>();
       for (Music note : notes){
           denominators.addAll(note.getAllDurationDenominators());
       }
       denominators.add(adjustmentFactor.denominator());
       return denominators;
    }
    
    @Override
    public Music applyAccidentals(Map<String, Integer> accidentalMap) {
        List<Music> newNotes = new ArrayList<>();
        for (Music m : notes){
            Music newNote = m.applyAccidentals(accidentalMap);
            newNotes.add(newNote);
        }
        return new Tuplet(tupletNumber, newNotes);
    }
    
    @Override
    public boolean equals(Object obj){
        if(! (obj instanceof Tuplet)) {return false;}
        Tuplet that = (Tuplet) obj;
        if (this.tupletNumber() != that.tupletNumber()){
            return false;
        }
        return this.tupletNotes().equals(that.tupletNotes());
    }
    
    @Override
    public int hashCode(){
        return tupletNumber + notes.hashCode();
    }

    @Override
    public String toString(){
        String toString = "(" + tupletNumber;
        for (Music m: notes){
            toString +=m.toString();
        }
        return toString;
    }
}
