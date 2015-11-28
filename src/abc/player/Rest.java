package abc.player;

public class Rest implements Music {
    private final double duration;
    
    public Rest(double duration){
        this.duration = duration;
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
