package abc.player;

public class Rest implements Music {
    private final double duration;
    
    public Rest(double duration){
        this.duration = duration;
    }

    @Override
    public double duration() {
        return duration;
    }

    @Override
    public Music transpose(int semitonesUp) {
        // TODO Auto-generated method stub
        return null;
    }

}
