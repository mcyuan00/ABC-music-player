package abc.player;

import java.io.*;

public class PieceReader {

    public static String readPiece(String fileName) throws IOException {
        StringBuilder readPiece = new StringBuilder();
        FileReader fileReader;
        String line = "";
        
        try {
            fileReader = new FileReader(fileName);
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
