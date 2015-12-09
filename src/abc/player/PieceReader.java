package abc.player;

import java.io.*;
import java.util.HashMap;
import java.util.Map;

public class PieceReader {
    
    private String header = "";
    private final Map<String, String> voices = new HashMap<String,String>();
    private final String filePath;
    
    /**
     * Creates a pieceReader that reads in a piece from a file and parses it into a header string and a map
     * containing voice strings
     * @param filePath the filePath of the piece
     */
    public PieceReader(String filePath){
        this.filePath = filePath;
    }

    /**
     * Parses piece that was passed in into a header string and a map
     * containing voice strings
     * @throws IOException
     */
    public void readPiece() throws IOException {
        FileReader fileReader;
        String line = "";
        
        try {
            fileReader = new FileReader(filePath);
        } catch (FileNotFoundException fnfe) {
            fnfe.printStackTrace();
            throw new RuntimeException ("File does not exist");
        }
        
        BufferedReader bufferedReader = new BufferedReader(fileReader);
        
        while ((line = bufferedReader.readLine()) != null) {
            header += line +"\n";
            if(line.contains("K:")){
                break;
            }
        }
        
//        System.out.println(header);
        String currentVoice = "main";
        Map<String, StringBuilder> builderVoices = new HashMap<String, StringBuilder>();
        builderVoices.put(currentVoice, new StringBuilder());
        while ((line = bufferedReader.readLine()) != null) {
            if (line.contains("V:")){
                currentVoice = line.replace("V:", "");
                if(!builderVoices.containsKey(currentVoice)){
                    builderVoices.put(currentVoice, new StringBuilder());
                }
                builderVoices.remove("main");
            }
            else if(line.contains("%")){
                continue;
            }
            else{
                StringBuilder currentPiece = builderVoices.get(currentVoice);
                if (line.startsWith("|")){
                    currentPiece.append(line.substring(1));
                }
                else{
                    currentPiece.append(line);
                }
            }
        }
        
        for (String v: builderVoices.keySet()){
            voices.put(v, builderVoices.get(v).toString());
//            System.out.println(v);
//            System.out.println(voices.get(v));
        }
        
        fileReader.close();
        bufferedReader.close();
        
    }
    
    /**
     * @return the header section of the file as a String
     */
    public String getHeader(){
        return header;
    }
    
    /**
     * @return a Map of voice name to a string that contains the lines that belong to that voice
     */
    public Map<String, String> getVoices(){
        return voices;
    }
    
}
