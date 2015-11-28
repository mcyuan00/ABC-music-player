package abc.player;

public class Voices implements Music {
    private final String name;
    private final Measure[] measures;
    
    public Voices(String name, Measure[] measures){
        this.name = name;
        this.measures = measures;
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
