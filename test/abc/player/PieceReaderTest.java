package abc.player;

import static org.junit.Assert.*;

import java.io.IOException;

import org.junit.Test;

public class PieceReaderTest {

    @Test(expected=AssertionError.class)
    public void testAssertionsEnabled() {
        assert false; // make sure assertions are enabled with VM argument: -ea
    }

    @Test
    public void testPieceReader() {
        String piece = "sample_abc/scale.abc";
        String expected = "X:1\n" + "T:Simple scale\n" + "C:Unknown\n" +
                          "M:4/4\n" + "L:1/4\n" + "Q:1/4=120\n" + "K:C\n" +
                          "C D E F | G A B c | c B A G | F E D C |\n";
        try {
            String actual = PieceReader.readPiece(piece);
            assertEquals(expected, actual);
        } catch (IOException ioe) {
            ioe.printStackTrace();
        }
        
    }

}
