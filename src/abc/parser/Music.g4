/*
 * Compile all your grammars using
 *       java -jar ../../../lib/antlr.jar *.g4
 * then Refresh in Eclipse.
 */
grammar Music;
import Configuration;

root : music EOF;
music : element+ NEWLINE | midtune | comment;
element : numnote | tuplet | BARLINE | NUMREPEAT | WHITESPACE;
midtune : voice;
voice : 'V:' text NEWLINE;
numnote : note | multinote;
multinote : '[' note+ ']'; //chord
note : ispitch notelength;
ispitch : pitch | rest;
pitch : ACCIDENTAL? NOTELETTER OCTAVE?;
rest : 'z' (DIGIT+)? '/'? (DIGIT+)?;
notelength : (DIGIT+)? '/'? (DIGIT+)?;
tuplet : tupletspec numnote+;
tupletspec : '(' DIGIT;
comment : text+ NEWLINE;
text : ~NEWLINE;
NOTELETTER :  'A' | 'B' | 'C' | 'D' | 'E' | 'F' | 'G' |'a' | 'b' | 'c' | 'd' | 'e' | 'f' | 'g';
OCTAVE :  '\''+ | ','+;
ACCIDENTAL : '_' | '__' | '^' | '^^' | '=';
BARLINE : '|' | '||' | '|:' | ':|' | '[|' | '|]';
NUMREPEAT: '[1' | '[2';
NEWLINE : [\r]? [\n];
WHITESPACE : [\s]+ | [\t]+;
DIGIT : [0-9];

