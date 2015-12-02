package abc.player;

import java.util.HashMap;

public class KeySignatureMap {

    // creates a key signature map
    // map key = key signature
    // map value = individual map for that key signature
    public final static HashMap<KeySignature, HashMap<NoteLetter, Accidental>> KEY_SIGNATURE_MAP =
            new HashMap<KeySignature, HashMap<NoteLetter, Accidental>>();

    // create individual maps for every key signature
    // map key = note letter
    // map value = accidental that applies to the note
    private final static HashMap<NoteLetter, Accidental> C_MAJOR_MAP = new HashMap<NoteLetter, Accidental>();
   
    private final static HashMap<NoteLetter, Accidental> G_MAJOR_MAP = new HashMap<NoteLetter, Accidental>();
    private final static HashMap<NoteLetter, Accidental> D_MAJOR_MAP = new HashMap<NoteLetter, Accidental>();
    private final static HashMap<NoteLetter, Accidental> A_MAJOR_MAP = new HashMap<NoteLetter, Accidental>();
    private final static HashMap<NoteLetter, Accidental> E_MAJOR_MAP = new HashMap<NoteLetter, Accidental>();
    private final static HashMap<NoteLetter, Accidental> B_MAJOR_MAP = new HashMap<NoteLetter, Accidental>();
    private final static HashMap<NoteLetter, Accidental> F_SHARP_MAJOR_MAP = new HashMap<NoteLetter, Accidental>();
    private final static HashMap<NoteLetter, Accidental> C_SHARP_MAJOR_MAP = new HashMap<NoteLetter, Accidental>();
    
    private final static HashMap<NoteLetter, Accidental> F_MAJOR_MAP = new HashMap<NoteLetter, Accidental>();

    public KeySignatureMap(){

        // add proper accidentals to notes in the individual maps for every key signature
        // C Major = none
        C_MAJOR_MAP.put(NoteLetter.F, Accidental.NATURAL);
        C_MAJOR_MAP.put(NoteLetter.C, Accidental.NATURAL);
        C_MAJOR_MAP.put(NoteLetter.G, Accidental.NATURAL);
        C_MAJOR_MAP.put(NoteLetter.D, Accidental.NATURAL);
        C_MAJOR_MAP.put(NoteLetter.A, Accidental.NATURAL);
        C_MAJOR_MAP.put(NoteLetter.E, Accidental.NATURAL);
        C_MAJOR_MAP.put(NoteLetter.B, Accidental.NATURAL);

        // G Major = F#
        G_MAJOR_MAP.put(NoteLetter.F, Accidental.SHARP);
        G_MAJOR_MAP.put(NoteLetter.C, Accidental.NATURAL);
        G_MAJOR_MAP.put(NoteLetter.G, Accidental.NATURAL);
        G_MAJOR_MAP.put(NoteLetter.D, Accidental.NATURAL);
        G_MAJOR_MAP.put(NoteLetter.A, Accidental.NATURAL);
        G_MAJOR_MAP.put(NoteLetter.E, Accidental.NATURAL);
        G_MAJOR_MAP.put(NoteLetter.B, Accidental.NATURAL);

        // D MAJOR = F#, C#
        D_MAJOR_MAP.put(NoteLetter.F, Accidental.SHARP);
        D_MAJOR_MAP.put(NoteLetter.C, Accidental.SHARP);
        D_MAJOR_MAP.put(NoteLetter.G, Accidental.NATURAL);
        D_MAJOR_MAP.put(NoteLetter.D, Accidental.NATURAL);
        D_MAJOR_MAP.put(NoteLetter.A, Accidental.NATURAL);
        D_MAJOR_MAP.put(NoteLetter.E, Accidental.NATURAL);
        D_MAJOR_MAP.put(NoteLetter.B, Accidental.NATURAL);

        // A MAJOR = F#, C#, G#
        A_MAJOR_MAP.put(NoteLetter.F, Accidental.SHARP);
        A_MAJOR_MAP.put(NoteLetter.C, Accidental.SHARP);
        A_MAJOR_MAP.put(NoteLetter.G, Accidental.SHARP);
        A_MAJOR_MAP.put(NoteLetter.D, Accidental.NATURAL);
        A_MAJOR_MAP.put(NoteLetter.A, Accidental.NATURAL);
        A_MAJOR_MAP.put(NoteLetter.E, Accidental.NATURAL);
        A_MAJOR_MAP.put(NoteLetter.B, Accidental.NATURAL);

        // E MAJOR = F#, C#, G#, D#
        E_MAJOR_MAP.put(NoteLetter.F, Accidental.SHARP);
        E_MAJOR_MAP.put(NoteLetter.C, Accidental.SHARP);
        E_MAJOR_MAP.put(NoteLetter.G, Accidental.SHARP);
        E_MAJOR_MAP.put(NoteLetter.D, Accidental.SHARP);
        E_MAJOR_MAP.put(NoteLetter.A, Accidental.NATURAL);
        E_MAJOR_MAP.put(NoteLetter.E, Accidental.NATURAL);
        E_MAJOR_MAP.put(NoteLetter.B, Accidental.NATURAL);

        // B MAJOR = F#, C#, G#, D#, A#
        B_MAJOR_MAP.put(NoteLetter.F, Accidental.SHARP);
        B_MAJOR_MAP.put(NoteLetter.C, Accidental.SHARP);
        B_MAJOR_MAP.put(NoteLetter.G, Accidental.SHARP);
        B_MAJOR_MAP.put(NoteLetter.D, Accidental.SHARP);
        B_MAJOR_MAP.put(NoteLetter.A, Accidental.SHARP);
        B_MAJOR_MAP.put(NoteLetter.E, Accidental.NATURAL);
        B_MAJOR_MAP.put(NoteLetter.B, Accidental.NATURAL);  

        // F-SHARP MAJOR = F#, C#, G#, D#, A#, E#
        F_SHARP_MAJOR_MAP.put(NoteLetter.F, Accidental.SHARP);
        F_SHARP_MAJOR_MAP.put(NoteLetter.C, Accidental.SHARP);
        F_SHARP_MAJOR_MAP.put(NoteLetter.G, Accidental.SHARP);
        F_SHARP_MAJOR_MAP.put(NoteLetter.D, Accidental.SHARP);
        F_SHARP_MAJOR_MAP.put(NoteLetter.A, Accidental.SHARP);
        F_SHARP_MAJOR_MAP.put(NoteLetter.E, Accidental.SHARP);
        F_SHARP_MAJOR_MAP.put(NoteLetter.B, Accidental.NATURAL);

        // C-SHARP MAJOR = F#, C#, G#, D#, A#, E#, B#
        C_SHARP_MAJOR_MAP.put(NoteLetter.F, Accidental.SHARP);
        C_SHARP_MAJOR_MAP.put(NoteLetter.C, Accidental.SHARP);
        C_SHARP_MAJOR_MAP.put(NoteLetter.G, Accidental.SHARP);
        C_SHARP_MAJOR_MAP.put(NoteLetter.D, Accidental.SHARP);
        C_SHARP_MAJOR_MAP.put(NoteLetter.A, Accidental.SHARP);
        C_SHARP_MAJOR_MAP.put(NoteLetter.E, Accidental.SHARP);
        C_SHARP_MAJOR_MAP.put(NoteLetter.B, Accidental.SHARP);
        
        // F MAJOR = Bb
        F_MAJOR_MAP.put(NoteLetter.B, Accidental.FLAT);
        F_MAJOR_MAP.put(NoteLetter.E, Accidental.NATURAL);
        F_MAJOR_MAP.put(NoteLetter.A, Accidental.NATURAL);
        F_MAJOR_MAP.put(NoteLetter.D, Accidental.NATURAL);
        F_MAJOR_MAP.put(NoteLetter.G, Accidental.NATURAL);
        F_MAJOR_MAP.put(NoteLetter.C, Accidental.NATURAL);
        F_MAJOR_MAP.put(NoteLetter.F, Accidental.NATURAL);  

        // add individual key signature maps to every key signature
        KEY_SIGNATURE_MAP.put(KeySignature.C_MAJOR, C_MAJOR_MAP);
        KEY_SIGNATURE_MAP.put(KeySignature.G_MAJOR, G_MAJOR_MAP);
        KEY_SIGNATURE_MAP.put(KeySignature.D_MAJOR, D_MAJOR_MAP);
        KEY_SIGNATURE_MAP.put(KeySignature.A_MAJOR, A_MAJOR_MAP);
        KEY_SIGNATURE_MAP.put(KeySignature.E_MAJOR, E_MAJOR_MAP);
        KEY_SIGNATURE_MAP.put(KeySignature.B_MAJOR, B_MAJOR_MAP);
        KEY_SIGNATURE_MAP.put(KeySignature.F_SHARP_MAJOR, F_SHARP_MAJOR_MAP);
        KEY_SIGNATURE_MAP.put(KeySignature.C_SHARP_MAJOR, C_SHARP_MAJOR_MAP);
        
        KEY_SIGNATURE_MAP.put(KeySignature.F_MAJOR, F_MAJOR_MAP);

    }

}
