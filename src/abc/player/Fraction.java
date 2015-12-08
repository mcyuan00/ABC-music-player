package abc.player;

import java.util.List;

/**
 * Represents a positive fraction. This class is immutable.
 *
 */
public class Fraction {
    
    private final int numerator;
    private final int denominator;
    
    /**
     * Asserts rep invariant
     */
    private void checkRep(){
        assert (numerator >= 0);
        assert (denominator > 0);
    }
    
    /**
     * Makes a new fraction with numerator n and denominator d
     * @param n numerator of the fraction
     * @param d denominator of the fraction
     */
    public Fraction(int n, int d){
        this.numerator = n;
        this.denominator= d;
        checkRep();
    }
    
    /**
     * Returns the numerator of the fraction as an int
     * @return numerator
     */
    public int numerator(){
        return numerator;
    }
    
    /**
     * Returns the denominator of the fraction as an int
     * @return denominator
     */
    public int denominator(){
        return denominator;
    }
    
    /**
     * Simplifies the fraction
     * @return a new simplified fraction
     */
    public Fraction simplify(){
        for (int possibleDivisor = 2; possibleDivisor <= denominator; possibleDivisor++){
            int numeratorRemainder = (numerator % possibleDivisor);
            int denominatorRemainder = (denominator % possibleDivisor);
            if (numeratorRemainder == 0 && denominatorRemainder == 0){
                return new Fraction(numerator/possibleDivisor, denominator/possibleDivisor).simplify();
            }
        }
        return new Fraction(numerator, denominator);
    }
    
    
    /**
     * Sums up all the fractions in the list
     * @param summands the fractions to be summed
     * @return the sum of all the fractions simplified; returns Fraction(0, 1) if the list is empty
     */
    public static Fraction sumAllFractions(List<Fraction> summands){
        Fraction runningTotal = new Fraction(0, 1);
        for (Fraction fraction : summands){
            int newDenominator = runningTotal.denominator() * fraction.denominator();
            int newNumerator = runningTotal.numerator() * fraction.denominator() + fraction.numerator() * runningTotal.denominator();
            runningTotal = new Fraction(newNumerator, newDenominator).simplify();
        }
        return runningTotal;
    }
    
    /**
     * @return the fraction object as a double
     */
    public double toDecimal(){
        return ((double)numerator)/denominator;
    }
    
    @Override
    public boolean equals(Object obj){
        if(! (obj instanceof Fraction)) {return false;}
        Fraction that = (Fraction) obj;
        double thisDecimal = ((double) this.numerator) / this.denominator;
        double thatDecimal = ((double) that.numerator()) / that.denominator();
        return thisDecimal == thatDecimal;
    }
    
    @Override
    public String toString(){
        return numerator + "/" + denominator;
    }
    
    

}