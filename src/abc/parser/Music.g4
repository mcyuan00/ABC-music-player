/*
 * Compile all your grammars using
 *       java -jar ../../../lib/antlr.jar *.g4
 * then Refresh in Eclipse.
 */
grammar Music;
import Configuration;

root : music EOF;
music : line+;
line : (measureline | midtune | comment) NEWLINE ;
midtune : 'V:' text+;

measureline : measure+;
measure : normalmeasure | startrepeatmeasure | doublebarmeasure | firstendingmeasure | secondendingmeasure | endrepeatmeasure;
firstendingmeasure : '[1' normalmeasure* endrepeatmeasure;
secondendingmeasure : '[2' normalmeasure* doublebarmeasure;
doublebarmeasure : element+ ('||' | '[|' | '|]');
startrepeatmeasure : ('|:' | ':') element+;
endrepeatmeasure : element+ ':|';
normalmeasure : element+ '|';

element : noteelement | tupletelement | WHITESPACE;
noteelement : note | chord;
note : notetype;
notetype : pitch | rest;
pitch : ACCIDENTAL? NOTELETTER OCTAVE? notelength?;
rest : 'z' notelength?;
notelength : ((DIGIT+)? '/' (DIGIT+)?) | DIGIT+;
tupletelement : tupletspec noteelement+;
tupletspec : '(' DIGIT;
chord : '[' note+ ']';
comment : '%' text+;
text : DIGIT | NOTELETTER | LETTERS | SYMBOLS | ACCIDENTAL;

SYMBOLS : '.' | '~' | '`' | '!' | '@' | '$' | '&' | '*' | '(' | ')' | '-' | '+' | '{' | '[' | '}' | ']' | '|' | '\\' | ';' | ':' | '\'' | '"' | '<' | '>' | ',' | '?';
LETTERS : [H-Zh-y];
BARLINE : '|' | '||' | '[|' | '|]' | '|:' | ':|';
NTHREPEAT : '[1' | '[2';
NOTELETTER : [a-gA-G];
ACCIDENTAL : '_' | '__' | '^' | '^^' | '=';
OCTAVE : '\''+ | ','+;
NEWLINE : [\r]? [\n];
WHITESPACE : [ ]+;
DIGIT : [0-9];