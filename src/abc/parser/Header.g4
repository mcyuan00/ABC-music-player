/*
 * Compile all your grammars using
 *       java -jar ../../../lib/antlr.jar *.g4
 * then Refresh in Eclipse.
 */
grammar Header;
import Configuration;

root : header EOF;
header : index comment* title otherfields* key;
index : 'X:' DIGIT+ NEWLINE;
title : 'T:' text+ NEWLINE;
otherfields : composer | length | meter | tempo | voice | comment;
composer : 'C:' text+ NEWLINE;
meter : 'M:' (DIGIT+ '/' DIGIT+) | 'C' | 'C|' NEWLINE;
length : 'L:' DIGIT+ '/' DIGIT+ NEWLINE;
tempo : 'Q:' (DIGIT+ '/' DIGIT+) '=' DIGIT+ NEWLINE;
voice : 'V:' text+ NEWLINE;
key : 'K:' NOTE KEYACCIDENTAL? MINOR? NEWLINE;
comment : '%' text+ NEWLINE;
text : DIGIT | NOTE | MINOR | KEYACCIDENTAL | OTHER;
OTHER :[h-ln-zH-Z] | [-_=:;'"//\<>];
NOTE: [a-gA-G];
KEYACCIDENTAL : '#' | 'b';
MINOR : 'm';
NEWLINE : [\r]? [\n];
DIGIT : [0-9];
WHITESPACE : [\s\t]+ -> skip;