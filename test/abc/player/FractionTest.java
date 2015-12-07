package abc.player;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.junit.Test;

public class FractionTest {
    

    @Test(expected=AssertionError.class)
    public void testAssertionsEnabled() {
        assert false; // make sure assertions are enabled with VM argument: -ea
    }
    
    //testing strategy:
    //  test that you can't make a fraction with negative numerator or denominator <= 0
    //  equals:
    //      same fraction, same fraction but simplified vs unsimplified (should be equal)
    //      different numerator, different denominator, different for both
    //  simplify: 
    //      simplified fraction, one common factor, repeated common factor, more than one
    //  sumAllFraction:
    //      simplified fractions, unsimplified fractions
    //      same denominator, different denominators
    //      on empty list, just one, more than one
    //  getDenominatorsGCD:
    //      same denominators, thisDenominator > thatDenominator, thisDenominator < thatDenominator
    //  getDenominatorsLCM:
    //      same denominators, this > that, this < that
    //  getAllDenominatorsGCD:
    //      list size: 0, 1, >1
    //      denominators equal, not relatively prime but not equal, relatively prime
    
    @Test(expected=AssertionError.class)
    public void testNegativeNumerator(){
        Fraction fraction = new Fraction(-1, 1);
    }
    
    @Test(expected=AssertionError.class)
    public void testZeroDenominator(){
        Fraction fraction = new Fraction(2, 0);
    }
    
    @Test
    public void testNumeratorAndDenominator(){
        Fraction fraction = new Fraction(2, 5);
        assertEquals(2, fraction.numerator());
        assertEquals(5, fraction.denominator());
    }
    
    //tests equals for the same fraction
    @Test
    public void testEqualsSameFraction(){
        Fraction firstFraction = new Fraction(1, 4);
        Fraction secondFraction = new Fraction(1, 4);
        assertEquals(firstFraction, secondFraction);
    }
    
    //test equals for a simplified and unsimplified versions of the same fraction    
    @Test
    public void testEqualsUnsimplifiedAndSimplified(){
        Fraction firstFraction = new Fraction(3, 7);
        Fraction secondFraction = new Fraction(6, 14);
        assertEquals(firstFraction, secondFraction);
    }
    
    //test equals for two fractions with different numerator
    @Test
    public void testEqualsDifferentNumerator(){
        Fraction firstFraction = new Fraction(2, 5);
        Fraction secondFraction = new Fraction(3, 5);   
        assertFalse(firstFraction.equals(secondFraction));
    }
    
    //test equals for two fractions with different denominator
    @Test
    public void testEqualsDifferentDenominator(){
        Fraction firstFraction = new Fraction(4, 7);
        Fraction secondFraction = new Fraction(4, 8);   
        assertFalse(firstFraction.equals(secondFraction));
    }
    
  //test equals for two fractions that are different for both num and denom
    @Test
    public void testEqualsDifferentEverything(){
        Fraction firstFraction = new Fraction(1, 10);
        Fraction secondFraction = new Fraction(13, 4);   
        assertFalse(firstFraction.equals(secondFraction));
    }
    
    //tests simplify() on a fraction that is already simplified
    @Test
    public void testSimplifyAlreadySimplified(){
        Fraction fraction = new Fraction(1, 3);
        Fraction simplifiedFraction = fraction.simplify();
        assertEquals(1, simplifiedFraction.numerator());
        assertEquals(3, simplifiedFraction.denominator());
    }
    
    //tests simplify() on a fraction with one common factor between num and denom
    @Test
    public void testSimplifyOneCommonFactor(){
        Fraction fraction = new Fraction(10, 2);
        Fraction simplifiedFraction = fraction.simplify();
        assertEquals(5, simplifiedFraction.numerator());
        assertEquals(1, simplifiedFraction.denominator());
    }
    
    //tests simplify() on a fraction with one common factor repeated between num and denom
    @Test
    public void testSimplifyRepeatedCommonFactor(){
        Fraction fraction = new Fraction(8, 8);
        Fraction simplifiedFraction = fraction.simplify();
        assertEquals(1, simplifiedFraction.numerator());
        assertEquals(1, simplifiedFraction.denominator());
    }
    
    //tests simplify() on a fraction with more than one common factor between num and denom
    @Test
    public void testSimplifyTwoCommonFactors(){
        Fraction fraction = new Fraction(30, 42);
        Fraction simplifiedFraction = fraction.simplify();
        assertEquals(5, simplifiedFraction.numerator());
        assertEquals(7, simplifiedFraction.denominator());
    }
    
    //test sumAllFractions on an empty list
    @Test
    public void testSumAllFractionsEmptyList(){
        List<Fraction> fractions = new ArrayList<Fraction>();
        Fraction sum = Fraction.sumAllFractions(fractions);
        assertEquals(0, sum.numerator());
        assertEquals(1, sum.denominator());
    }
    
    //test sumAllFractions on a list with one element that is simplified
    @Test
    public void testSumAllFractionsOneSimplified(){
        List<Fraction> fractions = new ArrayList<Fraction>();
        fractions.add(new Fraction(19, 3));
        Fraction sum = Fraction.sumAllFractions(fractions);
        assertEquals(19, sum.numerator());
        assertEquals(3, sum.denominator());
    }
    
    //test sumAllFractions on a list with one element that is unsimplified
    @Test
    public void testSumAllFractionsOneUnsimplified(){
        List<Fraction> fractions = new ArrayList<Fraction>();
        fractions.add(new Fraction(3, 21));
        Fraction sum = Fraction.sumAllFractions(fractions);
        assertEquals(1, sum.numerator());
        assertEquals(7, sum.denominator());
    }
    
    //test sumAllFractions on a list with more than one element with same denominators
    @Test
    public void testSumAllFractionsMoreThanOneSameDenominator(){
        List<Fraction> fractions = new ArrayList<Fraction>();
        fractions.addAll(Arrays.asList(new Fraction(2, 6), new Fraction(5, 6)));
        Fraction sum = Fraction.sumAllFractions(fractions);
        assertEquals(7, sum.numerator());
        assertEquals(6, sum.denominator());
    }
    
    //test sumAllFractions on a list with more than one element with different denominators
    @Test
    public void testSumAlFractionsMoreThanOneDifferentDenominators(){
        List<Fraction> fractions = new ArrayList<Fraction>();
        fractions.addAll(Arrays.asList(new Fraction(1, 4), new Fraction(3, 7), new Fraction(8, 3)));
        Fraction sum = Fraction.sumAllFractions(fractions);
        assertEquals(281, sum.numerator());
        assertEquals(84, sum.denominator());
    }
    
    //test getDenominatorGCD with two denominators equal
    @Test
    public void testGetDenominatorGCDEqualDenominators(){
        Fraction firstFraction = new Fraction(3, 7);
        Fraction secondFraction = new Fraction(8, 7);
        int gcd = firstFraction.getDenominatorsGCD(secondFraction);
        assertEquals(7, gcd);
    }
    
    //test getDenominatorsGCD with thisDenom > thatDenom
    @Test
    public void testGetDenominatorsGCDThisDenomBigger(){
        Fraction firstFraction = new Fraction(3, 8);
        Fraction secondFraction = new Fraction(8, 6);
        int gcd = firstFraction.getDenominatorsGCD(secondFraction);
        assertEquals(2, gcd);
    }
    
    //test getDenominatorsGCD with thatDenom < thisDenom
    @Test
    public void testGetDenominatorsGCDThatDenomBigger(){
        Fraction firstFraction = new Fraction(3, 7);
        Fraction secondFraction = new Fraction(8, 4);
        int gcd = firstFraction.getDenominatorsGCD(secondFraction);
        assertEquals(1, gcd);
    }
    
    //test getDenominatorsLCM with two denom equal
    @Test
    public void testGetDenominatorsLCMEqualDenom(){
        Fraction firstFraction = new Fraction(2, 8);
        Fraction secondFraction = new Fraction(13, 8);
        int lcm = firstFraction.getDenominatorsLCM(secondFraction);
        assertEquals(8, lcm);
    }
    
    //test getDenominatorsLCM with this > that
    @Test
    public void testGetDenominatorsLCMThisDenomBigger(){
        Fraction firstFraction = new Fraction(2, 14);
        Fraction secondFraction = new Fraction(13, 7);
        int lcm = firstFraction.getDenominatorsLCM(secondFraction);
        assertEquals(14, lcm);
    }
    
    //test getDenominatorsLCM with this < that
    @Test
    public void testGetDenominatorsLCMThisDenomSmaller(){
        Fraction firstFraction = new Fraction(2, 32);
        Fraction secondFraction = new Fraction(13, 5);
        int lcm = firstFraction.getDenominatorsLCM(secondFraction);
        assertEquals(160, lcm);
    }
    
    //test getAllDenominatorsLCM with list size 0
    @Test
    public void testGetAllDenominatorsLCMEmptyList(){
        List<Fraction> fractions = new ArrayList<>();
        int lcm = Fraction.getAllDenominatorsLCM(fractions);
        assertEquals(1, lcm);
    }
    
    //test getAllDenominatorsLCM with list size 1
    @Test
    public void testGetAllDenominatorsLCMSizeOne(){
        List<Fraction> fractions = new ArrayList<>();
        fractions.add(new Fraction(4, 13));
        int lcm = Fraction.getAllDenominatorsLCM(fractions);
        assertEquals(13, lcm);
    }
    
    //test getAllDenominatorsLCM with large list
    @Test
    public void testGetAllDenominatorsLCMLarge(){
        List<Fraction> fractions = new ArrayList<>();
        fractions.add(new Fraction(1, 12));
        fractions.add(new Fraction(14, 12));
        fractions.add(new Fraction(15, 4));
        fractions.add(new Fraction(118, 10));
        fractions.add(new Fraction(1, 7));
        int lcm = Fraction.getAllDenominatorsLCM(fractions);
        assertEquals(420, lcm);
    }

}
