package abc.player;

/**
 * Represents the key signature of a given piece.
 */
public enum KeySignature {
    // version of null
    NEGATIVE,
    
    // Major keys
    C_MAJOR, // none
    G_MAJOR, // F#
    D_MAJOR, // F#, C#
    A_MAJOR, // F#, C#, G#
    E_MAJOR, // F#, C#, G#, D#
    B_MAJOR, // F#, C#, G#, D#, A#
    F_SHARP_MAJOR, // F#, C#, G#, D#, A#, E#
    C_SHARP_MAJOR, // F#, C#, G#, D#, A#, E#, B#
    F_MAJOR, // Bb
    B_FLAT_MAJOR, // Bb, Eb
    E_FLAT_MAJOR, // Bb, Eb, Ab
    A_FLAT_MAJOR, // Bb, Eb, Ab, Db
    D_FLAT_MAJOR, // Bb, Eb, Ab, Db, Gb
    G_FLAT_MAJOR, // Bb, Eb, Ab, Db, Gb, Cb
    C_FLAT_MAJOR, // Bb, Eb, Ab, Db, Gb, Cb, Fb
    
    // minor keys
    A_MINOR, // none
    E_MINOR, // F#
    B_MINOR, // F#, C#
    F_SHARP_MINOR, // F#, C#, G#
    C_SHARP_MINOR, // F#, C#, G#, D#
    G_SHARP_MINOR, // F#, C#, G#, D#, A#
    D_SHARP_MINOR, // F#, C#, G#, D#, A#, E#
    A_SHARP_MINOR, // F#, C#, G#, D#, A#, E#, B#
    D_MINOR, // Bb
    G_MINOR, // Bb, Eb
    C_MINOR, // Bb, Eb, Ab
    F_MINOR, // Bb, Eb, Ab, Db
    B_FLAT_MINOR, // Bb, Eb, Ab, Db, Gb
    E_FLAT_MINOR, // Bb, Eb, Ab, Db, Gb, Cb
    A_FLAT_MINOR // Bb, Eb, Ab, Db, Gb, Cb, Fb
    
}
