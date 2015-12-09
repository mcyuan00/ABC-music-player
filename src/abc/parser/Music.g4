/*
 * Compile all your grammars using
 *       java -jar ../../../lib/antlr.jar *.g4
 * then Refresh in Eclipse.
 */
grammar Music;
import Configuration;

root : music EOF;
music : measure+;
measure : normalmeasure | startrepeatmeasure | doublebarmeasure | firstendingmeasure | secondendingmeasure | endrepeatmeasure;
firstendingmeasure : '[1' normalmeasure* endrepeatmeasure;
secondendingmeasure : '[2' normalmeasure* doublebarmeasure;
normalmeasure : (element | WHITESPACE)+ ('|' | startrepeatmeasure);
doublebarmeasure : (element | WHITESPACE)+ ('||' | '[|' | '|]');
startrepeatmeasure : '|:' (element | WHITESPACE)+ ('|');
endrepeatmeasure : (element | WHITESPACE)+ ':|';

element : noteelement | tupletelement;
noteelement : note | chord;
chord : '[' note+ ']';
note : pitch | rest;
pitch : ACCIDENTAL? NOTELETTER OCTAVE? notelength?;
rest : 'z' notelength?;
notelength : ((DIGIT+)? '/' (DIGIT+)?) | DIGIT+;
tupletelement : tupletspec noteelement+;
tupletspec : '(' DIGIT;
comment : '%' text+;
text : DIGIT | NOTELETTER | LETTERS | SYMBOLS | ACCIDENTAL | OCTAVE | WHITESPACE;

ACCIDENTAL : '_' | '__' | '^' | '^^' | '=';
OCTAVE : '\''+ | ','+;
SYMBOLS : '.' | '~' | '`' | '!' | '@' | '$' | '&' | '*' | '(' | ')' | '-' | '+' | '{' | '[' | '}' | ']' | '|' | '\\' | ';' | ':' | '"' | '<' | '>' | '?';
LETTERS : [H-Zh-y];
NTHREPEAT : '[1' | '[2';
NOTELETTER : [a-gA-G];
NEWLINE : [\r]? [\n];
WHITESPACE : [ ]+;
DIGIT : [0-9];