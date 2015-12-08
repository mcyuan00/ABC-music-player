/*
 * Compile all your grammars using
 *       java -jar ../../../lib/antlr.jar *.g4
 * then Refresh in Eclipse.
 */
grammar Music;
import Configuration;

root : music EOF;
music : section | midtune | comment;
midtune : voice section;
voice : 'V:' text+ NEWLINE;
section : repeat+  NEWLINE;
repeat : STARTREPEAT? (((measure BARLINE)+ measure (DOUBLEBAR | ENDREPEAT)) | (ONEREPEAT (measure BARLINE)* measure ENDREPEAT TWOREPEAT (measure BARLINE)* measure DOUBLEBAR?));
measure : WHITESPACE noteelement+ WHITESPACE+ ;
noteelement : note | rest | chord | tuplet;
tuplet : tupletspec (note | chord)+;
tupletspec : '(' DIGIT ;
chord : '[' note+ ']';
note : ACCIDENTAL? NOTELETTER OCTAVE? notelength?;
rest : 'z' notelength?;
notelength : ((DIGIT+)? '/' (DIGIT+)?) | DIGIT+;
comment : '%' text+ NEWLINE;
text : DIGIT | NOTELETTER | LETTERS | SYMBOLS;
NOTELETTER : [a-gA-G];
SYMBOLS : '.' | '~' | '`' | '!' | '@' | '$' | '^' | '&' | '*' | '(' | ')' | '-' | '_' | '+' | '{' | '[' | '}' | ']' | '|' | '\\' | ';' | ':' | '\'' | '"' | '<' | '>' | ',' | '?';
LETTERS : [H-Zh-y];
OCTAVE : '\''+ | ','+;
ACCIDENTAL : '_' | '__' | '^' | '^^' | '=';
BARLINE : '|';
DOUBLEBAR : '||' | '[|' | '|]'; 
STARTREPEAT : '|:';
ENDREPEAT : ':|';
ONEREPEAT: '[1';
TWOREPEAT: '[2';
NEWLINE : [\r]? [\n];
WHITESPACE : [\t]+;
DIGIT : [0-9];



