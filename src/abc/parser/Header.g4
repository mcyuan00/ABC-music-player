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
title : 'T:' [.]+ NEWLINE;
otherfields : composer | length | meter | tempo | voice | comment;
composer : 'C:' [.]+ NEWLINE;
meter : 'M:' (DIGIT+ '/' DIGIT+) | 'C' | 'C|' NEWLINE;
length : 'L:' DIGIT+ '/' DIGIT+ NEWLINE;
tempo : 'Q:' (DIGIT+ '/' DIGIT+) '=' DIGIT+ NEWLINE;
voice : 'V:' [.]+ NEWLINE;
key : 'K:' [ABCDEFGabcdefg] KEYACCIDENTAL? MINOR? NEWLINE;
comment : [.]+ NEWLINE;
KEYACCIDENTAL : '#' | 'b';
MINOR : 'm';
NEWLINE : [\r]? [\n];
DIGIT : [0-9];

WHITESPACE : [\s]+ | [\t]+ -> skip

