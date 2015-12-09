package abc.player;

import java.util.HashMap;

/**
 * Maps all possible key signatures.
 *
 */
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
    private final static HashMap<NoteLetter, Accidental> B_FLAT_MAJOR_MAP = new HashMap<NoteLetter, Accidental>();
    private final static HashMap<NoteLetter, Accidental> E_FLAT_MAJOR_MAP = new HashMap<NoteLetter, Accidental>();
    private final static HashMap<NoteLetter, Accidental> A_FLAT_MAJOR_MAP = new HashMap<NoteLetter, Accidental>();
    private final static HashMap<NoteLetter, Accidental> D_FLAT_MAJOR_MAP = new HashMap<NoteLetter, Accidental>();
    private final static HashMap<NoteLetter, Accidental> G_FLAT_MAJOR_MAP = new HashMap<NoteLetter, Accidental>();
    private final static HashMap<NoteLetter, Accidental> C_FLAT_MAJOR_MAP = new HashMap<NoteLetter, Accidental>();
    
    private final static HashMap<NoteLetter, Accidental> A_MINOR_MAP = new HashMap<NoteLetter, Accidental>();
    
    private final static HashMap<NoteLetter, Accidental> E_MINOR_MAP = new HashMap<NoteLetter, Accidental>();
    private final static HashMap<NoteLetter, Accidental> B_MINOR_MAP = new HashMap<NoteLetter, Accidental>();
    private final static HashMap<NoteLetter, Accidental> F_SHARP_MINOR_MAP = new HashMap<NoteLetter, Accidental>();
    private final static HashMap<NoteLetter, Accidental> C_SHARP_MINOR_MAP = new HashMap<NoteLetter, Accidental>();
    private final static HashMap<NoteLetter, Accidental> G_SHARP_MINOR_MAP = new HashMap<NoteLetter, Accidental>();
    private final static HashMap<NoteLetter, Accidental> D_SHARP_MINOR_MAP = new HashMap<NoteLetter, Accidental>();
    private final static HashMap<NoteLetter, Accidental> A_SHARP_MINOR_MAP = new HashMap<NoteLetter, Accidental>();
    
    private final static HashMap<NoteLetter, Accidental> D_MINOR_MAP = new HashMap<NoteLetter, Accidental>();
    private final static HashMap<NoteLetter, Accidental> G_MINOR_MAP = new HashMap<NoteLetter, Accidental>();
    private final static HashMap<NoteLetter, Accidental> C_MINOR_MAP = new HashMap<NoteLetter, Accidental>();
    private final static HashMap<NoteLetter, Accidental> F_MINOR_MAP = new HashMap<NoteLetter, Accidental>();
    private final static HashMap<NoteLetter, Accidental> B_FLAT_MINOR_MAP = new HashMap<NoteLetter, Accidental>();
    private final static HashMap<NoteLetter, Accidental> E_FLAT_MINOR_MAP = new HashMap<NoteLetter, Accidental>();
    private final static HashMap<NoteLetter, Accidental> A_FLAT_MINOR_MAP = new HashMap<NoteLetter, Accidental>();


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
        
        // B-FLAT MAJOR = Bb, Eb
        B_FLAT_MAJOR_MAP.put(NoteLetter.B, Accidental.FLAT);
        B_FLAT_MAJOR_MAP.put(NoteLetter.E, Accidental.FLAT);
        B_FLAT_MAJOR_MAP.put(NoteLetter.A, Accidental.NATURAL);
        B_FLAT_MAJOR_MAP.put(NoteLetter.D, Accidental.NATURAL);
        B_FLAT_MAJOR_MAP.put(NoteLetter.G, Accidental.NATURAL);
        B_FLAT_MAJOR_MAP.put(NoteLetter.C, Accidental.NATURAL);
        B_FLAT_MAJOR_MAP.put(NoteLetter.F, Accidental.NATURAL); 
        
        // E-FLAT MAJOR = Bb, Eb, Ab
        E_FLAT_MAJOR_MAP.put(NoteLetter.B, Accidental.FLAT);
        E_FLAT_MAJOR_MAP.put(NoteLetter.E, Accidental.FLAT);
        E_FLAT_MAJOR_MAP.put(NoteLetter.A, Accidental.FLAT);
        E_FLAT_MAJOR_MAP.put(NoteLetter.D, Accidental.NATURAL);
        E_FLAT_MAJOR_MAP.put(NoteLetter.G, Accidental.NATURAL);
        E_FLAT_MAJOR_MAP.put(NoteLetter.C, Accidental.NATURAL);
        E_FLAT_MAJOR_MAP.put(NoteLetter.F, Accidental.NATURAL); 
        
        // A-FLAT MAJOR = Bb, Eb, Ab, Db
        A_FLAT_MAJOR_MAP.put(NoteLetter.B, Accidental.FLAT);
        A_FLAT_MAJOR_MAP.put(NoteLetter.E, Accidental.FLAT);
        A_FLAT_MAJOR_MAP.put(NoteLetter.A, Accidental.FLAT);
        A_FLAT_MAJOR_MAP.put(NoteLetter.D, Accidental.FLAT);
        A_FLAT_MAJOR_MAP.put(NoteLetter.G, Accidental.NATURAL);
        A_FLAT_MAJOR_MAP.put(NoteLetter.C, Accidental.NATURAL);
        A_FLAT_MAJOR_MAP.put(NoteLetter.F, Accidental.NATURAL); 
        
        // D-FLAT MAJOR = Bb, Eb, Ab, Db, Gb
        D_FLAT_MAJOR_MAP.put(NoteLetter.B, Accidental.FLAT);
        D_FLAT_MAJOR_MAP.put(NoteLetter.E, Accidental.FLAT);
        D_FLAT_MAJOR_MAP.put(NoteLetter.A, Accidental.FLAT);
        D_FLAT_MAJOR_MAP.put(NoteLetter.D, Accidental.FLAT);
        D_FLAT_MAJOR_MAP.put(NoteLetter.G, Accidental.FLAT);
        D_FLAT_MAJOR_MAP.put(NoteLetter.C, Accidental.NATURAL);
        D_FLAT_MAJOR_MAP.put(NoteLetter.F, Accidental.NATURAL); 
        
        // G-FLAT MAJOR = Bb, Eb, Ab, Db, Gb, Cb
        G_FLAT_MAJOR_MAP.put(NoteLetter.B, Accidental.FLAT);
        G_FLAT_MAJOR_MAP.put(NoteLetter.E, Accidental.FLAT);
        G_FLAT_MAJOR_MAP.put(NoteLetter.A, Accidental.FLAT);
        G_FLAT_MAJOR_MAP.put(NoteLetter.D, Accidental.FLAT);
        G_FLAT_MAJOR_MAP.put(NoteLetter.G, Accidental.FLAT);
        G_FLAT_MAJOR_MAP.put(NoteLetter.C, Accidental.FLAT);
        G_FLAT_MAJOR_MAP.put(NoteLetter.F, Accidental.NATURAL);
        
        // C-FLAT MAJOR = Bb, Eb, Ab, Db, Gb, Cb, Fb
        C_FLAT_MAJOR_MAP.put(NoteLetter.B, Accidental.FLAT);
        C_FLAT_MAJOR_MAP.put(NoteLetter.E, Accidental.FLAT);
        C_FLAT_MAJOR_MAP.put(NoteLetter.A, Accidental.FLAT);
        C_FLAT_MAJOR_MAP.put(NoteLetter.D, Accidental.FLAT);
        C_FLAT_MAJOR_MAP.put(NoteLetter.G, Accidental.FLAT);
        C_FLAT_MAJOR_MAP.put(NoteLetter.C, Accidental.FLAT);
        C_FLAT_MAJOR_MAP.put(NoteLetter.F, Accidental.FLAT);
        
        // a minor = none
        A_MINOR_MAP.put(NoteLetter.F, Accidental.NATURAL);
        A_MINOR_MAP.put(NoteLetter.C, Accidental.NATURAL);
        A_MINOR_MAP.put(NoteLetter.G, Accidental.NATURAL);
        A_MINOR_MAP.put(NoteLetter.D, Accidental.NATURAL);
        A_MINOR_MAP.put(NoteLetter.A, Accidental.NATURAL);
        A_MINOR_MAP.put(NoteLetter.E, Accidental.NATURAL);
        A_MINOR_MAP.put(NoteLetter.B, Accidental.NATURAL);
        
        // e minor = F#
        E_MINOR_MAP.put(NoteLetter.F, Accidental.SHARP);
        E_MINOR_MAP.put(NoteLetter.C, Accidental.NATURAL);
        E_MINOR_MAP.put(NoteLetter.G, Accidental.NATURAL);
        E_MINOR_MAP.put(NoteLetter.D, Accidental.NATURAL);
        E_MINOR_MAP.put(NoteLetter.A, Accidental.NATURAL);
        E_MINOR_MAP.put(NoteLetter.E, Accidental.NATURAL);
        E_MINOR_MAP.put(NoteLetter.B, Accidental.NATURAL);
        
        // b minor = F#, C#
        B_MINOR_MAP.put(NoteLetter.F, Accidental.SHARP);
        B_MINOR_MAP.put(NoteLetter.C, Accidental.SHARP);
        B_MINOR_MAP.put(NoteLetter.G, Accidental.NATURAL);
        B_MINOR_MAP.put(NoteLetter.D, Accidental.NATURAL);
        B_MINOR_MAP.put(NoteLetter.A, Accidental.NATURAL);
        B_MINOR_MAP.put(NoteLetter.E, Accidental.NATURAL);
        B_MINOR_MAP.put(NoteLetter.B, Accidental.NATURAL);
        
        // f-sharp minor = F#, C#, G#
        F_SHARP_MINOR_MAP.put(NoteLetter.F, Accidental.SHARP);
        F_SHARP_MINOR_MAP.put(NoteLetter.C, Accidental.SHARP);
        F_SHARP_MINOR_MAP.put(NoteLetter.G, Accidental.SHARP);
        F_SHARP_MINOR_MAP.put(NoteLetter.D, Accidental.NATURAL);
        F_SHARP_MINOR_MAP.put(NoteLetter.A, Accidental.NATURAL);
        F_SHARP_MINOR_MAP.put(NoteLetter.E, Accidental.NATURAL);
        F_SHARP_MINOR_MAP.put(NoteLetter.B, Accidental.NATURAL);

        // c-sharp minor = F#, C#, G#, D#
        C_SHARP_MINOR_MAP.put(NoteLetter.F, Accidental.SHARP);
        C_SHARP_MINOR_MAP.put(NoteLetter.C, Accidental.SHARP);
        C_SHARP_MINOR_MAP.put(NoteLetter.G, Accidental.SHARP);
        C_SHARP_MINOR_MAP.put(NoteLetter.D, Accidental.SHARP);
        C_SHARP_MINOR_MAP.put(NoteLetter.A, Accidental.NATURAL);
        C_SHARP_MINOR_MAP.put(NoteLetter.E, Accidental.NATURAL);
        C_SHARP_MINOR_MAP.put(NoteLetter.B, Accidental.NATURAL);
        
        // g-sharp minor = F#, C#, G#, D#, A#
        G_SHARP_MINOR_MAP.put(NoteLetter.F, Accidental.SHARP);
        G_SHARP_MINOR_MAP.put(NoteLetter.C, Accidental.SHARP);
        G_SHARP_MINOR_MAP.put(NoteLetter.G, Accidental.SHARP);
        G_SHARP_MINOR_MAP.put(NoteLetter.D, Accidental.SHARP);
        G_SHARP_MINOR_MAP.put(NoteLetter.A, Accidental.SHARP);
        G_SHARP_MINOR_MAP.put(NoteLetter.E, Accidental.NATURAL);
        G_SHARP_MINOR_MAP.put(NoteLetter.B, Accidental.NATURAL);
        
        // d-sharp minor = F#, C#, G#, D#, A#, E#
        D_SHARP_MINOR_MAP.put(NoteLetter.F, Accidental.SHARP);
        D_SHARP_MINOR_MAP.put(NoteLetter.C, Accidental.SHARP);
        D_SHARP_MINOR_MAP.put(NoteLetter.G, Accidental.SHARP);
        D_SHARP_MINOR_MAP.put(NoteLetter.D, Accidental.SHARP);
        D_SHARP_MINOR_MAP.put(NoteLetter.A, Accidental.SHARP);
        D_SHARP_MINOR_MAP.put(NoteLetter.E, Accidental.SHARP);
        D_SHARP_MINOR_MAP.put(NoteLetter.B, Accidental.NATURAL);
        
        // a-sharp minor = F#, C#, G#, D#, A#, E#, B#
        A_SHARP_MINOR_MAP.put(NoteLetter.F, Accidental.SHARP);
        A_SHARP_MINOR_MAP.put(NoteLetter.C, Accidental.SHARP);
        A_SHARP_MINOR_MAP.put(NoteLetter.G, Accidental.SHARP);
        A_SHARP_MINOR_MAP.put(NoteLetter.D, Accidental.SHARP);
        A_SHARP_MINOR_MAP.put(NoteLetter.A, Accidental.SHARP);
        A_SHARP_MINOR_MAP.put(NoteLetter.E, Accidental.SHARP);
        A_SHARP_MINOR_MAP.put(NoteLetter.B, Accidental.SHARP);
        
        // d minor = Bb
        D_MINOR_MAP.put(NoteLetter.B, Accidental.FLAT);
        D_MINOR_MAP.put(NoteLetter.E, Accidental.NATURAL);
        D_MINOR_MAP.put(NoteLetter.A, Accidental.NATURAL);
        D_MINOR_MAP.put(NoteLetter.D, Accidental.NATURAL);
        D_MINOR_MAP.put(NoteLetter.G, Accidental.NATURAL);
        D_MINOR_MAP.put(NoteLetter.C, Accidental.NATURAL);
        D_MINOR_MAP.put(NoteLetter.F, Accidental.NATURAL); 
        
        // g minor = Bb, Eb
        G_MINOR_MAP.put(NoteLetter.B, Accidental.FLAT);
        G_MINOR_MAP.put(NoteLetter.E, Accidental.FLAT);
        G_MINOR_MAP.put(NoteLetter.A, Accidental.NATURAL);
        G_MINOR_MAP.put(NoteLetter.D, Accidental.NATURAL);
        G_MINOR_MAP.put(NoteLetter.G, Accidental.NATURAL);
        G_MINOR_MAP.put(NoteLetter.C, Accidental.NATURAL);
        G_MINOR_MAP.put(NoteLetter.F, Accidental.NATURAL); 
        
        // c minor = Bb, Eb, Ab
        C_MINOR_MAP.put(NoteLetter.B, Accidental.FLAT);
        C_MINOR_MAP.put(NoteLetter.E, Accidental.FLAT);
        C_MINOR_MAP.put(NoteLetter.A, Accidental.FLAT);
        C_MINOR_MAP.put(NoteLetter.D, Accidental.NATURAL);
        C_MINOR_MAP.put(NoteLetter.G, Accidental.NATURAL);
        C_MINOR_MAP.put(NoteLetter.C, Accidental.NATURAL);
        C_MINOR_MAP.put(NoteLetter.F, Accidental.NATURAL); 
        
        // f minor = Bb, Eb, Ab, Db
        F_MINOR_MAP.put(NoteLetter.B, Accidental.FLAT);
        F_MINOR_MAP.put(NoteLetter.E, Accidental.FLAT);
        F_MINOR_MAP.put(NoteLetter.A, Accidental.FLAT);
        F_MINOR_MAP.put(NoteLetter.D, Accidental.FLAT);
        F_MINOR_MAP.put(NoteLetter.G, Accidental.NATURAL);
        F_MINOR_MAP.put(NoteLetter.C, Accidental.NATURAL);
        F_MINOR_MAP.put(NoteLetter.F, Accidental.NATURAL); 
        
        // b-flat minor = Bb, Eb, Ab, Db, Gb
        B_FLAT_MINOR_MAP.put(NoteLetter.B, Accidental.FLAT);
        B_FLAT_MINOR_MAP.put(NoteLetter.E, Accidental.FLAT);
        B_FLAT_MINOR_MAP.put(NoteLetter.A, Accidental.FLAT);
        B_FLAT_MINOR_MAP.put(NoteLetter.D, Accidental.FLAT);
        B_FLAT_MINOR_MAP.put(NoteLetter.G, Accidental.FLAT);
        B_FLAT_MINOR_MAP.put(NoteLetter.C, Accidental.NATURAL);
        B_FLAT_MINOR_MAP.put(NoteLetter.F, Accidental.NATURAL); 
        
        // e-flat minor = Bb, Eb, Ab, Db, Gb, Cb
        E_FLAT_MINOR_MAP.put(NoteLetter.B, Accidental.FLAT);
        E_FLAT_MINOR_MAP.put(NoteLetter.E, Accidental.FLAT);
        E_FLAT_MINOR_MAP.put(NoteLetter.A, Accidental.FLAT);
        E_FLAT_MINOR_MAP.put(NoteLetter.D, Accidental.FLAT);
        E_FLAT_MINOR_MAP.put(NoteLetter.G, Accidental.FLAT);
        E_FLAT_MINOR_MAP.put(NoteLetter.C, Accidental.FLAT);
        E_FLAT_MINOR_MAP.put(NoteLetter.F, Accidental.NATURAL); 
        
        // a-flat minor = Bb, Eb, Ab, Db, Gb, Cb, Fb
        A_FLAT_MINOR_MAP.put(NoteLetter.B, Accidental.FLAT);
        A_FLAT_MINOR_MAP.put(NoteLetter.E, Accidental.FLAT);
        A_FLAT_MINOR_MAP.put(NoteLetter.A, Accidental.FLAT);
        A_FLAT_MINOR_MAP.put(NoteLetter.D, Accidental.FLAT);
        A_FLAT_MINOR_MAP.put(NoteLetter.G, Accidental.FLAT);
        A_FLAT_MINOR_MAP.put(NoteLetter.C, Accidental.FLAT);
        A_FLAT_MINOR_MAP.put(NoteLetter.F, Accidental.FLAT); 

        // add individual key signature maps to every key signature
        // major key signature with no accidentals
        KEY_SIGNATURE_MAP.put(KeySignature.C_MAJOR, C_MAJOR_MAP);
        
        // major key signatures with sharps
        KEY_SIGNATURE_MAP.put(KeySignature.G_MAJOR, G_MAJOR_MAP);
        KEY_SIGNATURE_MAP.put(KeySignature.D_MAJOR, D_MAJOR_MAP);
        KEY_SIGNATURE_MAP.put(KeySignature.A_MAJOR, A_MAJOR_MAP);
        KEY_SIGNATURE_MAP.put(KeySignature.E_MAJOR, E_MAJOR_MAP);
        KEY_SIGNATURE_MAP.put(KeySignature.B_MAJOR, B_MAJOR_MAP);
        KEY_SIGNATURE_MAP.put(KeySignature.F_SHARP_MAJOR, F_SHARP_MAJOR_MAP);
        KEY_SIGNATURE_MAP.put(KeySignature.C_SHARP_MAJOR, C_SHARP_MAJOR_MAP);
        
        // major key signatures with flats
        KEY_SIGNATURE_MAP.put(KeySignature.F_MAJOR, F_MAJOR_MAP);
        KEY_SIGNATURE_MAP.put(KeySignature.B_FLAT_MAJOR, B_FLAT_MAJOR_MAP);
        KEY_SIGNATURE_MAP.put(KeySignature.E_FLAT_MAJOR, E_FLAT_MAJOR_MAP);
        KEY_SIGNATURE_MAP.put(KeySignature.A_FLAT_MAJOR, A_FLAT_MAJOR_MAP);
        KEY_SIGNATURE_MAP.put(KeySignature.D_FLAT_MAJOR, D_FLAT_MAJOR_MAP);
        KEY_SIGNATURE_MAP.put(KeySignature.G_FLAT_MAJOR, G_FLAT_MAJOR_MAP);
        KEY_SIGNATURE_MAP.put(KeySignature.C_FLAT_MAJOR, C_FLAT_MAJOR_MAP);
        
        // minor key signature with no accidentals
        KEY_SIGNATURE_MAP.put(KeySignature.A_MINOR, A_MINOR_MAP);
        
        // minor key signatures with sharps
        KEY_SIGNATURE_MAP.put(KeySignature.E_MINOR, E_MINOR_MAP);
        KEY_SIGNATURE_MAP.put(KeySignature.B_MINOR, B_MINOR_MAP);
        KEY_SIGNATURE_MAP.put(KeySignature.F_SHARP_MINOR, F_SHARP_MINOR_MAP);
        KEY_SIGNATURE_MAP.put(KeySignature.C_SHARP_MINOR, C_SHARP_MINOR_MAP);
        KEY_SIGNATURE_MAP.put(KeySignature.G_SHARP_MINOR, G_SHARP_MINOR_MAP);
        KEY_SIGNATURE_MAP.put(KeySignature.D_SHARP_MINOR, D_SHARP_MINOR_MAP);
        KEY_SIGNATURE_MAP.put(KeySignature.A_SHARP_MINOR, A_SHARP_MINOR_MAP);
        
        // minor key signatures with flats
        KEY_SIGNATURE_MAP.put(KeySignature.D_MINOR, D_MINOR_MAP);
        KEY_SIGNATURE_MAP.put(KeySignature.G_MINOR, G_MINOR_MAP);
        KEY_SIGNATURE_MAP.put(KeySignature.C_MINOR, C_MINOR_MAP);
        KEY_SIGNATURE_MAP.put(KeySignature.F_MINOR, F_MINOR_MAP);
        KEY_SIGNATURE_MAP.put(KeySignature.B_FLAT_MINOR, B_FLAT_MINOR_MAP);
        KEY_SIGNATURE_MAP.put(KeySignature.E_FLAT_MINOR, E_FLAT_MINOR_MAP);
        KEY_SIGNATURE_MAP.put(KeySignature.A_FLAT_MINOR, A_FLAT_MINOR_MAP);

    }

}
