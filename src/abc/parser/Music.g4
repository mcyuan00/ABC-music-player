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
doublebarmeasure : (element | WHITESPACE)+ ('||' | '[|' | '|]');
startrepeatmeasure : ('|:' | ':') (element | WHITESPACE)+;
endrepeatmeasure : (element | WHITESPACE)+ ':|';
normalmeasure : (element | WHITESPACE)+ '|';

element : noteelement | tupletelement;
noteelement : note | chord;
note : pitch | rest;
pitch : ACCIDENTAL? NOTELETTER OCTAVE? notelength?;
rest : 'z' notelength?;
notelength : ((DIGIT+)? '/' (DIGIT+)?) | DIGIT+;
tupletelement : tupletspec noteelement+;
tupletspec : '(' DIGIT;
chord : '[' note+ ']';
comment : '%' text+;
text : DIGIT | NOTELETTER | LETTERS | SYMBOLS | ACCIDENTAL;

ACCIDENTAL : '_' | '__' | '^' | '^^' | '=';
OCTAVE : '\''+ | ','+;
SYMBOLS : '.' | '~' | '`' | '!' | '@' | '$' | '&' | '*' | '(' | ')' | '-' | '+' | '{' | '[' | '}' | ']' | '|' | '\\' | ';' | ':' | '"' | '<' | '>' | '?';
LETTERS : [H-Zh-y];
BARLINE : '|' | '||' | '[|' | '|]' | '|:' | ':|';
NTHREPEAT : '[1' | '[2';
NOTELETTER : [a-gA-G];
NEWLINE : [\r]? [\n];
WHITESPACE : [ ]+;
DIGIT : [0-9];