package abc.player;


public interface Music {
    /**
     * Datatype definition:
     *      Music = Note (duration: double, pitch: Pitch) 
     *              + Chord (duration:double, numNotes: int, notes: Note[])
     *              + Tuplet (numNotes: int, notes Note[])
     *              + Rest (duration: duration)
     *              + Measure (m: Music[])
     *              + Voice (name: String, measures: Measure[]) 
     */

    /**
     * 
     * @return total duration of music
     */
    double duration();
    
    /**
     * Transpose all notes upward or downward in pitch.
     * @param semitonesUp semitones by which to transpose
     * @return for Music m, return m' such that for all notes n in m, the
     *         corresponding note n' in m' has
     *         n'.pitch() == n.pitch().transpose(semitonesUp), and m' is
     *         otherwise identical to m
     */
    Music transpose(int semitonesUp);
    
    @Override String toString();
    
    @Override boolean equals(Object obj);
    
    @Override int hashCode();
    
}
