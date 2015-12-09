package abc.player;

import java.io.*;
import java.util.HashMap;
import java.util.Map;

public class PieceReader {
    
    private String header = "";
    private final Map<String, String> voices = new HashMap<String,String>();
    private final String filePath;
    
    public PieceReader(String filePath){
        this.filePath = filePath;
    }

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
        
        System.out.println(header);
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
                currentPiece.append(line);
            }
        }
        
        for (String v: builderVoices.keySet()){
            voices.put(v, builderVoices.get(v).toString());
            System.out.println(v);
            System.out.println(voices.get(v));
        }
        
        fileReader.close();
        bufferedReader.close();
        
    }
    
    public String getHeader(){
        return header;
    }
    
    public Map<String, String> getVoices(){
        return voices;
    }
    
}
