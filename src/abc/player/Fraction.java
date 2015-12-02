package abc.player;

public class Fraction {
    
    private final int numerator;
    private final int denominator;
    
    public Fraction(int n, int d){
        this.numerator = n;
        this.denominator= d;
    }
    
    public int numerator(){
        return numerator;
    }
    
    public int denominator(){
        return denominator;
    }
    
    @Override
    public String toString(){
        return numerator + "/" + denominator;
    }

}
