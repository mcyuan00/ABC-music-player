package abc.player;

public class Measure implements Music {
    private final Music[] m;
    
    public Measure(Music[] m){
        this.m = m;
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
