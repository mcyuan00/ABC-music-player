package abc.player;

import java.io.*;

public class PieceReader {

    private static String piece;
    
    public PieceReader(String piece) {
        this.piece = piece;
    }
    
    public String readPiece() throws IOException {
        StringBuilder readPiece = new StringBuilder();
        FileReader fileReader;
        String line = "";
        
        try {
            fileReader = new FileReader(piece);
        } catch (FileNotFoundException fnfe) {
            fnfe.printStackTrace();
            throw new RuntimeException ("File does not exist");
        }
        
        BufferedReader bufferedReader = new BufferedReader(fileReader);
       
        while ((line = bufferedReader.readLine()) != null) {
            readPiece.append(line+"\n");
        }
        
        fileReader.close();
        bufferedReader.close();
        
        return readPiece.toString();
    }
    
}
