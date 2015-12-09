/*
 * Compile all your grammars using
 *       java -jar ../../../lib/antlr.jar *.g4
 * then Refresh in Eclipse.
 */
grammar Header;
import Configuration;
    
root : header EOF;
header : index comment* title otherfields* key;
index : 'X:' DIGIT+ endline;
title : 'T:' text+ endline;
otherfields : composer | length | meter | tempo | voice+ | endline;
composer : 'C:' text+ endline;
tempo : 'Q:' (DIGIT+ '/' DIGIT+) '=' DIGIT+ endline;
length : 'L:' DIGIT+ '/' DIGIT+ endline;
meter : 'M:' ((DIGIT+ '/' DIGIT+) | SPECIALC | 'C|') endline;
voice : 'V:' text+ endline;
key : 'K:' (NOTE | SPECIALC) KEYACCIDENTAL? MINOR? endline;
endline : comment? NEWLINE;
comment : '%' text+;
text : DIGIT | NOTE | SPECIALC | MINOR | KEYACCIDENTAL | LETTERS | SYMBOLS;
NOTE: [ABD-G];
SPECIALC: 'C';
SYMBOLS : '.' | '~' | '`' | '!' | '@' | '$' | '^' | '&' | '*' | '(' | ')' | '-' | '_' | '+' | '{' | '[' | '}' | ']' | '|' | '\\' | ';' | ':' | '\'' | '"' | '<' | '>' | ',' | '?';
LETTERS : [H-Zc-ln-z] | 'a';
KEYACCIDENTAL : '#' | 'b';
MINOR : 'm';
NEWLINE : [\r]? [\n];
DIGIT : [0-9];
WHITESPACE : [ ]+ -> skip;