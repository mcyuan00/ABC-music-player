// Generated from Music.g4 by ANTLR 4.5.1

package abc.parser;
// Do not edit this .java file! Edit the .g4 file and re-run Antlr.

import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class MusicLexer extends Lexer {
  static { RuntimeMetaData.checkVersion("4.5.1", RuntimeMetaData.VERSION); }

  protected static final DFA[] _decisionToDFA;
  protected static final PredictionContextCache _sharedContextCache =
    new PredictionContextCache();
  public static final int
    T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
    T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, ACCIDENTAL=16, 
    OCTAVE=17, SYMBOLS=18, LETTERS=19, NTHREPEAT=20, NOTELETTER=21, NEWLINE=22, 
    WHITESPACE=23, DIGIT=24;
  public static String[] modeNames = {
    "DEFAULT_MODE"
  };

  public static final String[] ruleNames = {
    "T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "T__6", "T__7", "T__8", 
    "T__9", "T__10", "T__11", "T__12", "T__13", "T__14", "ACCIDENTAL", "OCTAVE", 
    "SYMBOLS", "LETTERS", "NTHREPEAT", "NOTELETTER", "NEWLINE", "WHITESPACE", 
    "DIGIT"
  };

  private static final String[] _LITERAL_NAMES = {
    null, "'|'", "'[1'", "'[2'", "'||'", "'[|'", "'|]'", "'|:'", "':|'", 
    "':'", "'['", "']'", "'z'", "'/'", "'('", "'%'"
  };
  private static final String[] _SYMBOLIC_NAMES = {
    null, null, null, null, null, null, null, null, null, null, null, null, 
    null, null, null, null, "ACCIDENTAL", "OCTAVE", "SYMBOLS", "LETTERS", 
    "NTHREPEAT", "NOTELETTER", "NEWLINE", "WHITESPACE", "DIGIT"
  };
  public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

  /**
   * @deprecated Use {@link #VOCABULARY} instead.
   */
  @Deprecated
  public static final String[] tokenNames;
  static {
    tokenNames = new String[_SYMBOLIC_NAMES.length];
    for (int i = 0; i < tokenNames.length; i++) {
      tokenNames[i] = VOCABULARY.getLiteralName(i);
      if (tokenNames[i] == null) {
        tokenNames[i] = VOCABULARY.getSymbolicName(i);
      }

      if (tokenNames[i] == null) {
        tokenNames[i] = "<INVALID>";
      }
    }
  }

  @Override
  @Deprecated
  public String[] getTokenNames() {
    return tokenNames;
  }

  @Override

  public Vocabulary getVocabulary() {
    return VOCABULARY;
  }


      // This method makes the parser stop running if it encounters
      // invalid input and throw a RuntimeException.
      public void reportErrorsAsExceptions() {
          // To prevent any reports to standard error, add this line:
          //removeErrorListeners();
          
          addErrorListener(new BaseErrorListener() {
              public void syntaxError(Recognizer<?, ?> recognizer,
                                      Object offendingSymbol, 
                                      int line, int charPositionInLine,
                                      String msg, RecognitionException e) {
                  throw new ParseCancellationException(msg, e);
              }
          });
      }


  public MusicLexer(CharStream input) {
    super(input);
    _interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
  }

  @Override
  public String getGrammarFileName() { return "Music.g4"; }

  @Override
  public String[] getRuleNames() { return ruleNames; }

  @Override
  public String getSerializedATN() { return _serializedATN; }

  @Override
  public String[] getModeNames() { return modeNames; }

  @Override
  public ATN getATN() { return _ATN; }

  public static final String _serializedATN =
    "\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\2\32\u0085\b\1\4"+
      "\2\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n"+
      "\t\n\4\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21"+
      "\t\21\4\22\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27"+
      "\4\30\t\30\4\31\t\31\3\2\3\2\3\3\3\3\3\3\3\4\3\4\3\4\3\5\3\5\3\5\3"+
      "\6\3\6\3\6\3\7\3\7\3\7\3\b\3\b\3\b\3\t\3\t\3\t\3\n\3\n\3\13\3\13\3"+
      "\f\3\f\3\r\3\r\3\16\3\16\3\17\3\17\3\20\3\20\3\21\3\21\3\21\3\21\3"+
      "\21\3\21\3\21\5\21`\n\21\3\22\6\22c\n\22\r\22\16\22d\3\22\6\22h\n"+
      "\22\r\22\16\22i\5\22l\n\22\3\23\3\23\3\24\3\24\3\25\3\25\3\25\3\25"+
      "\5\25v\n\25\3\26\3\26\3\27\5\27{\n\27\3\27\3\27\3\30\6\30\u0080\n"+
      "\30\r\30\16\30\u0081\3\31\3\31\2\2\32\3\3\5\4\7\5\t\6\13\7\r\b\17"+
      "\t\21\n\23\13\25\f\27\r\31\16\33\17\35\20\37\21!\22#\23%\24\'\25)"+
      "\26+\27-\30/\31\61\32\3\2\t\f\2#$&&((*-/\60<>@B]_bb}\u0080\4\2J\\"+
      "j{\4\2CIci\3\2\17\17\3\2\f\f\3\2\"\"\3\2\62;\u008e\2\3\3\2\2\2\2\5"+
      "\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2"+
      "\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2"+
      "\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2"+
      "\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2"+
      "\2\2\61\3\2\2\2\3\63\3\2\2\2\5\65\3\2\2\2\78\3\2\2\2\t;\3\2\2\2\13"+
      ">\3\2\2\2\rA\3\2\2\2\17D\3\2\2\2\21G\3\2\2\2\23J\3\2\2\2\25L\3\2\2"+
      "\2\27N\3\2\2\2\31P\3\2\2\2\33R\3\2\2\2\35T\3\2\2\2\37V\3\2\2\2!_\3"+
      "\2\2\2#k\3\2\2\2%m\3\2\2\2\'o\3\2\2\2)u\3\2\2\2+w\3\2\2\2-z\3\2\2"+
      "\2/\177\3\2\2\2\61\u0083\3\2\2\2\63\64\7~\2\2\64\4\3\2\2\2\65\66\7"+
      "]\2\2\66\67\7\63\2\2\67\6\3\2\2\289\7]\2\29:\7\64\2\2:\b\3\2\2\2;"+
      "<\7~\2\2<=\7~\2\2=\n\3\2\2\2>?\7]\2\2?@\7~\2\2@\f\3\2\2\2AB\7~\2\2"+
      "BC\7_\2\2C\16\3\2\2\2DE\7~\2\2EF\7<\2\2F\20\3\2\2\2GH\7<\2\2HI\7~"+
      "\2\2I\22\3\2\2\2JK\7<\2\2K\24\3\2\2\2LM\7]\2\2M\26\3\2\2\2NO\7_\2"+
      "\2O\30\3\2\2\2PQ\7|\2\2Q\32\3\2\2\2RS\7\61\2\2S\34\3\2\2\2TU\7*\2"+
      "\2U\36\3\2\2\2VW\7\'\2\2W \3\2\2\2X`\7a\2\2YZ\7a\2\2Z`\7a\2\2[`\7"+
      "`\2\2\\]\7`\2\2]`\7`\2\2^`\7?\2\2_X\3\2\2\2_Y\3\2\2\2_[\3\2\2\2_\\"+
      "\3\2\2\2_^\3\2\2\2`\"\3\2\2\2ac\7)\2\2ba\3\2\2\2cd\3\2\2\2db\3\2\2"+
      "\2de\3\2\2\2el\3\2\2\2fh\7.\2\2gf\3\2\2\2hi\3\2\2\2ig\3\2\2\2ij\3"+
      "\2\2\2jl\3\2\2\2kb\3\2\2\2kg\3\2\2\2l$\3\2\2\2mn\t\2\2\2n&\3\2\2\2"+
      "op\t\3\2\2p(\3\2\2\2qr\7]\2\2rv\7\63\2\2st\7]\2\2tv\7\64\2\2uq\3\2"+
      "\2\2us\3\2\2\2v*\3\2\2\2wx\t\4\2\2x,\3\2\2\2y{\t\5\2\2zy\3\2\2\2z"+
      "{\3\2\2\2{|\3\2\2\2|}\t\6\2\2}.\3\2\2\2~\u0080\t\7\2\2\177~\3\2\2"+
      "\2\u0080\u0081\3\2\2\2\u0081\177\3\2\2\2\u0081\u0082\3\2\2\2\u0082"+
      "\60\3\2\2\2\u0083\u0084\t\b\2\2\u0084\62\3\2\2\2\n\2_dikuz\u0081\2";
  public static final ATN _ATN =
    new ATNDeserializer().deserialize(_serializedATN.toCharArray());
  static {
    _decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
    for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
      _decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
    }
  }
}