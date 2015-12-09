package abc.player;

import static org.junit.Assert.*;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import org.junit.Test;

public class PieceReaderTest {

    @Test(expected=AssertionError.class)
    public void testAssertionsEnabled() {
        assert false; // make sure assertions are enabled with VM argument: -ea
    }

    @Test
    public void testPieceReaderNoVoices(){
        PieceReader reader = new PieceReader("sample_abc/piece1.abc");
        String expectedHeader = "X: 1\nT:Piece No.1\nM:4/4\nL:1/4\nQ:1/4=140\nK:C\n";
        try {
            reader.readPiece();
            String actualHeader = reader.getHeader();
            assertEquals(expectedHeader, actualHeader);

            Map<String, String> expectedVoices= new HashMap<String, String>();
            expectedVoices.put("main", "C C C3/4 D/4 E | E3/4 D/4 E3/4 F/4 G2 |(3c/c/c/ (3G/G/G/ (3E/E/E/ (3C/C/C/ |G3/4 F/4 E3/4 D/4 C2 |");
            Map<String, String> actualVoices = reader.getVoices();

            for(String key: actualVoices.keySet()){
                assertTrue(actualVoices.get(key).contains(expectedVoices.get(key)));
            }


        } catch (IOException ioe) {
            ioe.printStackTrace();
        }
    }


    @Test 
    public void testPieceReaderThreeVoices(){
        PieceReader reader = new PieceReader("sample_abc/prelude.abc");
        String expectedHeader = "X:8628\nT:Prelude BWV 846 no. 1\nC:Johann Sebastian Bach\nM:4/4\nL:1/16\nQ:1/4=70\nV:1\nV:2\nV:3\nK:C\n";
        try {
            reader.readPiece();
            String actualHeader = reader.getHeader();
            assertEquals(expectedHeader, actualHeader);

            Map<String, String> expectedVoices= new HashMap<String, String>();
            expectedVoices.put("1", "z2 Gc eGce z2 Gc eGce| z2 Ad fAdf z2 Ad fAdf| z2 Gd fGdf z2 Gd fGdf| z2 Gc eGce z2 Gc eGce| z2 Ae aAea z2 Ae aAea| z2 ^FA dFAd z2 FA dFAd| z2 Gd gGdg z2 Gd gGdg| z2 EG cEGc z2 EG cEGc| z2 EG cEGc z2 EG cEGc|");
            expectedVoices.put("2","z E7 z E7|z D7 z D7|z D7 z D7|z E7 z E7|z E7 z E7|z D7 z D7|z D7 z D7|z C7 z C7|z C7 z C7|");
            expectedVoices.put("3","C8 C8|C8 C8|B,8 B,8|C8 C8|C8 C8|C8 C8|B,8 B,8|B,8 B,8|A,8 A,8|");
            Map<String, String> actualVoices = reader.getVoices();

            for(String key: actualVoices.keySet()){
                assertTrue(actualVoices.get(key).contains(expectedVoices.get(key)));
            }

        } catch (IOException ioe) {
            ioe.printStackTrace();
        }
    }

}
