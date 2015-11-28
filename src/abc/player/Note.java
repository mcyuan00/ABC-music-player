package abc.player;

import abc.sound.Pitch;

public class Note implements Music {
    private final int duration;
    private final Pitch pitch;

    public Note(int duration, Pitch pitch){
        this.duration = duration;
        this.pitch = pitch;
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
