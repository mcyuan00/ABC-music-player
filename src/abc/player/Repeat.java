package abc.player;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Repeat implements Music {

    List<Music> repeat;
    List<Music> firstEnding;
    
    public Repeat(List<Music> repeat){
        this.repeat = repeat;
        this.firstEnding = new ArrayList<Music>();
    }
    
    public Repeat (List<Music> repeat, List<Music> firstEnding){
        this.repeat = repeat;
        this.firstEnding = firstEnding;
    }
    
    
    @Override
    public Fraction duration() {
        List<Fraction> fracs = new ArrayList<Fraction>();
        for (Music m: repeat){
            fracs.add(m.duration());
            fracs.add(m.duration());
        }
        for (Music m: firstEnding){
            fracs.add(m.duration());
        }
        return Fraction.sumAllFractions(fracs);
        
    }

    @Override
    public Set<Integer> getAllDurationDenominators() {
        Set<Integer> durationDenominators = new HashSet<Integer>();
        for (Music m: repeat){
            durationDenominators.addAll(m.getAllDurationDenominators());
        }
        for (Music m: firstEnding){
            durationDenominators.addAll(m.getAllDurationDenominators());

        }
        return durationDenominators;
    }

    @Override
    public List<PlayerElement> getPlayerElements(int startTick, int ticksPerBeat, Fraction pieceNoteLength) {
        List<PlayerElement> elements = new ArrayList<PlayerElement>();
        int currentStart = startTick;
        for (Music m: repeat){
            elements.addAll(m.getPlayerElements(currentStart, ticksPerBeat, pieceNoteLength));
            
            // calculate the start tick of the next music element
            Fraction numBeats = new Fraction(m.duration().numerator()*pieceNoteLength.denominator(), m.duration().denominator()*pieceNoteLength.numerator()).simplify();
            int musicDuration = ticksPerBeat*numBeats.numerator()/numBeats.denominator();
            currentStart = currentStart + musicDuration;
        }
        for (Music m: firstEnding){
            elements.addAll(m.getPlayerElements(currentStart, ticksPerBeat, pieceNoteLength));
            
            // calculate the start tick of the next music element
            Fraction numBeats = new Fraction(m.duration().numerator()*pieceNoteLength.denominator(), m.duration().denominator()*pieceNoteLength.numerator()).simplify();
            int musicDuration = ticksPerBeat*numBeats.numerator()/numBeats.denominator();
            currentStart = currentStart + musicDuration;
        }
        for (Music m: repeat){
            elements.addAll(m.getPlayerElements(currentStart, ticksPerBeat, pieceNoteLength));
            
            // calculate the start tick of the next music element
            Fraction numBeats = new Fraction(m.duration().numerator()*pieceNoteLength.denominator(), m.duration().denominator()*pieceNoteLength.numerator()).simplify();
            int musicDuration = ticksPerBeat*numBeats.numerator()/numBeats.denominator();
            currentStart = currentStart + musicDuration;
        }
        return elements;
    }

//    @Override
//    public void transposeKey(char note, int octave, int semitonesUp) {
//        for (Music m: repeat){
//            m.transposeKey(note, octave, semitonesUp);
//        }
//        for (Music m: firstEnding){
//            m.transposeKey(note, octave, semitonesUp);
//        }
//
//    }

    @Override
    public Music applyAccidentals(Map<String, Integer> accidentalMap) {
        // TODO Auto-generated method stub
        return null;
    }

}
