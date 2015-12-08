package abc.player;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.junit.Test;

public class RestTest {

    @Test(expected=AssertionError.class)
    public void testAssertionsEnabled() {
        assert false; // make sure assertions are enabled with VM argument: -ea
    }
    
    //testing strategy:
    //  different lengths and check that duration and getAllDurations come out correctly
    //  length: <1, 1, >1
    //  test equals
    
    @Test
    public void testRestLengthLessThanOne(){
        Rest rest = new Rest(new Fraction(2, 7));
        assertEquals(new Fraction(2, 7), rest.duration());
        Set<Integer> denominators = new HashSet<>();
        denominators.add(7);
        assertEquals(denominators, rest.getAllDurationDenominators());
        List<PlayerElement> playerElements = new ArrayList<>();
        playerElements.add(new PlayerElement(13, 4));
        assertEquals(playerElements, rest.getPlayerElements(13, 2, new Fraction(1, 7)));
    }
    
    @Test
    public void testRestLengthEqualOne(){
        Rest rest = new Rest(new Fraction(24, 24));
        assertEquals(new Fraction(24, 24), rest.duration());
        Set<Integer> denominators = new HashSet<>();
        denominators.add(1);
        assertEquals(denominators, rest.getAllDurationDenominators());
        List<PlayerElement> playerElements = new ArrayList<>();
        playerElements.add(new PlayerElement(0, 1));
        assertEquals(playerElements, rest.getPlayerElements(0, 1, new Fraction(1, 1)));
    }
    
    @Test
    public void testRestLengthGreaterThanOne(){
        Rest rest = new Rest(new Fraction(15, 3));
        assertEquals(new Fraction(15, 3), rest.duration());
        Set<Integer> denominators = new HashSet<>();
        denominators.add(1);
        assertEquals(denominators, rest.getAllDurationDenominators());
        List<PlayerElement> playerElements = new ArrayList<>();
        playerElements.add(new PlayerElement(21, 15));
        assertEquals(playerElements, rest.getPlayerElements(21, 1, new Fraction(1, 3)));
    }
    
    @Test
    public void testRestEquals(){
        Rest rest = new Rest(new Fraction(1, 4));
        Rest restEquals = new Rest(new Fraction(2, 8));
        Rest restLessThan = new Rest(new Fraction(1, 6));
        Rest restGreaterThan = new Rest(new Fraction(1, 3));
        assertEquals(restEquals, rest);
        assertTrue(!rest.equals(restLessThan));
        assertTrue(!rest.equals(restGreaterThan));
    }
}
