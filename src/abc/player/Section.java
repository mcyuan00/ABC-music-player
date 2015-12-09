package abc.player;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

public class Section implements Music {
    private String name = null;
    private boolean isRepeat = false;
    private List<Music> body = new ArrayList<Music>();
    private List<Music> firstEnding = new ArrayList<Music>();
    private List<Music> secondEnding = new ArrayList<Music>();
    
    
    public void addBody(List<Music> m){
        body.addAll(m);
    }
    
    public void addFirstEnding(List<Music> m){
        firstEnding.addAll(m);
    }
    
    public void addsecondEnding(List<Music> m){
        secondEnding.addAll(m);
    }
    
    public void setRepeat(boolean repeat){
        this.isRepeat = repeat;
    }
    
    public boolean isRepeat(boolean repeat){
        return isRepeat;
    }
    
    @Override
    public Fraction duration() {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public List<Fraction> getAllDurations() {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public List<PlayerElement> getPlayerElements(int startTick, int ticksPerBeat, Fraction pieceNoteLength) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public void transposeKey(char note, int octave, int semitonesUp) {
        // TODO Auto-generated method stub

    }

    @Override
    public Set<Integer> getAllDurationDenominators() {
        // TODO Auto-generated method stub
        return null;
    }

}
