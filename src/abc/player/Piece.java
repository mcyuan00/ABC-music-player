package abc.player;

public class Piece {

    private final Header header;
    private final Music music;
    
    public Piece(Header header, Music music){
        this.header = header;
        this.music = music;
    }
    
    public static void Play(){
        // call Music.constructPlayer() and then plays it
    }
    
}
