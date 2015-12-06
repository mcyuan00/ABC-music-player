/*
 * Compile all your grammars using
 *       java -jar ../../../lib/antlr.jar *.g4
 * then Refresh in Eclipse.
 */
grammar Music;
import Configuration;

root : music EOF;
music : element+ NEWLINE | midtune | comment;
element : note | rest | chord | tuplet | BARLINE | NUMREPEAT | WHITESPACE;
midtune : voice;
voice : 'V:' text NEWLINE;
chord : '[' note+ ']';
note : ACCIDENTAL? NOTELETTER OCTAVE? notelength;
rest : 'z' notelength;
notelength : (DIGIT+)? '/'? (DIGIT+)?;
tuplet : tupletspec (note | chord)+;
tupletspec : '(' DIGIT;
comment : '%' text+ NEWLINE;
text : ~NEWLINE;
NOTELETTER :  [a-gA-G];
OCTAVE :  '\''+ | ','+;
ACCIDENTAL : '_' | '__' | '^' | '^^' | '=';
BARLINE : '|' | '||' | '|:' | ':|' | '[|' | '|]'; 
NUMREPEAT: '[1' | '[2';
NEWLINE : [\r]? [\n];
WHITESPACE : [\s\t]+;
DIGIT : [0-9];

