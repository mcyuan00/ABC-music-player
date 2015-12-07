package abc.player;

import static org.junit.Assert.*;

import org.junit.Test;

public class MeasureTest {

    @Test(expected=AssertionError.class)
    public void testAssertionsEnabled() {
        assert false; // make sure assertions are enabled with VM argument: -ea
    }

}
