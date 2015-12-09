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
    OCTAVE=17, SYMBOLS=18, LETTERS=19, BARLINE=20, NTHREPEAT=21, NOTELETTER=22, 
    NEWLINE=23, WHITESPACE=24, DIGIT=25;
  public static String[] modeNames = {
    "DEFAULT_MODE"
  };

  public static final String[] ruleNames = {
    "T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "T__6", "T__7", "T__8", 
    "T__9", "T__10", "T__11", "T__12", "T__13", "T__14", "ACCIDENTAL", "OCTAVE", 
    "SYMBOLS", "LETTERS", "BARLINE", "NTHREPEAT", "NOTELETTER", "NEWLINE", 
    "WHITESPACE", "DIGIT"
  };

  private static final String[] _LITERAL_NAMES = {
    null, "'[1'", "'[2'", "'||'", "'[|'", "'|]'", "'|:'", "':'", "':|'", 
    "'|'", "'z'", "'/'", "'('", "'['", "']'", "'%'"
  };
  private static final String[] _SYMBOLIC_NAMES = {
    null, null, null, null, null, null, null, null, null, null, null, null, 
    null, null, null, null, "ACCIDENTAL", "OCTAVE", "SYMBOLS", "LETTERS", 
    "BARLINE", "NTHREPEAT", "NOTELETTER", "NEWLINE", "WHITESPACE", "DIGIT"
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
    "\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\2\33\u0094\b\1\4"+
      "\2\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n"+
      "\t\n\4\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21"+
      "\t\21\4\22\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27"+
      "\4\30\t\30\4\31\t\31\4\32\t\32\3\2\3\2\3\2\3\3\3\3\3\3\3\4\3\4\3\4"+
      "\3\5\3\5\3\5\3\6\3\6\3\6\3\7\3\7\3\7\3\b\3\b\3\t\3\t\3\t\3\n\3\n\3"+
      "\13\3\13\3\f\3\f\3\r\3\r\3\16\3\16\3\17\3\17\3\20\3\20\3\21\3\21\3"+
      "\21\3\21\3\21\3\21\3\21\5\21b\n\21\3\22\6\22e\n\22\r\22\16\22f\3\22"+
      "\6\22j\n\22\r\22\16\22k\5\22n\n\22\3\23\3\23\3\24\3\24\3\25\3\25\3"+
      "\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\5\25\177\n\25\3\26\3\26"+
      "\3\26\3\26\5\26\u0085\n\26\3\27\3\27\3\30\5\30\u008a\n\30\3\30\3\30"+
      "\3\31\6\31\u008f\n\31\r\31\16\31\u0090\3\32\3\32\2\2\33\3\3\5\4\7"+
      "\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35\20\37\21"+
      "!\22#\23%\24\'\25)\26+\27-\30/\31\61\32\63\33\3\2\t\f\2#$&&((*-/\60"+
      "<>@B]_bb}\u0080\4\2J\\j{\4\2CIci\3\2\17\17\3\2\f\f\3\2\"\"\3\2\62"+
      ";\u00a2\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2"+
      "\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2"+
      "\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2"+
      "\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2"+
      "\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2\3\65\3\2\2\2\5"+
      "8\3\2\2\2\7;\3\2\2\2\t>\3\2\2\2\13A\3\2\2\2\rD\3\2\2\2\17G\3\2\2\2"+
      "\21I\3\2\2\2\23L\3\2\2\2\25N\3\2\2\2\27P\3\2\2\2\31R\3\2\2\2\33T\3"+
      "\2\2\2\35V\3\2\2\2\37X\3\2\2\2!a\3\2\2\2#m\3\2\2\2%o\3\2\2\2\'q\3"+
      "\2\2\2)~\3\2\2\2+\u0084\3\2\2\2-\u0086\3\2\2\2/\u0089\3\2\2\2\61\u008e"+
      "\3\2\2\2\63\u0092\3\2\2\2\65\66\7]\2\2\66\67\7\63\2\2\67\4\3\2\2\2"+
      "89\7]\2\29:\7\64\2\2:\6\3\2\2\2;<\7~\2\2<=\7~\2\2=\b\3\2\2\2>?\7]"+
      "\2\2?@\7~\2\2@\n\3\2\2\2AB\7~\2\2BC\7_\2\2C\f\3\2\2\2DE\7~\2\2EF\7"+
      "<\2\2F\16\3\2\2\2GH\7<\2\2H\20\3\2\2\2IJ\7<\2\2JK\7~\2\2K\22\3\2\2"+
      "\2LM\7~\2\2M\24\3\2\2\2NO\7|\2\2O\26\3\2\2\2PQ\7\61\2\2Q\30\3\2\2"+
      "\2RS\7*\2\2S\32\3\2\2\2TU\7]\2\2U\34\3\2\2\2VW\7_\2\2W\36\3\2\2\2"+
      "XY\7\'\2\2Y \3\2\2\2Zb\7a\2\2[\\\7a\2\2\\b\7a\2\2]b\7`\2\2^_\7`\2"+
      "\2_b\7`\2\2`b\7?\2\2aZ\3\2\2\2a[\3\2\2\2a]\3\2\2\2a^\3\2\2\2a`\3\2"+
      "\2\2b\"\3\2\2\2ce\7)\2\2dc\3\2\2\2ef\3\2\2\2fd\3\2\2\2fg\3\2\2\2g"+
      "n\3\2\2\2hj\7.\2\2ih\3\2\2\2jk\3\2\2\2ki\3\2\2\2kl\3\2\2\2ln\3\2\2"+
      "\2md\3\2\2\2mi\3\2\2\2n$\3\2\2\2op\t\2\2\2p&\3\2\2\2qr\t\3\2\2r(\3"+
      "\2\2\2s\177\7~\2\2tu\7~\2\2u\177\7~\2\2vw\7]\2\2w\177\7~\2\2xy\7~"+
      "\2\2y\177\7_\2\2z{\7~\2\2{\177\7<\2\2|}\7<\2\2}\177\7~\2\2~s\3\2\2"+
      "\2~t\3\2\2\2~v\3\2\2\2~x\3\2\2\2~z\3\2\2\2~|\3\2\2\2\177*\3\2\2\2"+
      "\u0080\u0081\7]\2\2\u0081\u0085\7\63\2\2\u0082\u0083\7]\2\2\u0083"+
      "\u0085\7\64\2\2\u0084\u0080\3\2\2\2\u0084\u0082\3\2\2\2\u0085,\3\2"+
      "\2\2\u0086\u0087\t\4\2\2\u0087.\3\2\2\2\u0088\u008a\t\5\2\2\u0089"+
      "\u0088\3\2\2\2\u0089\u008a\3\2\2\2\u008a\u008b\3\2\2\2\u008b\u008c"+
      "\t\6\2\2\u008c\60\3\2\2\2\u008d\u008f\t\7\2\2\u008e\u008d\3\2\2\2"+
      "\u008f\u0090\3\2\2\2\u0090\u008e\3\2\2\2\u0090\u0091\3\2\2\2\u0091"+
      "\62\3\2\2\2\u0092\u0093\t\b\2\2\u0093\64\3\2\2\2\13\2afkm~\u0084\u0089"+
      "\u0090\2";
  public static final ATN _ATN =
    new ATNDeserializer().deserialize(_serializedATN.toCharArray());
  static {
    _decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
    for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
      _decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
    }
  }
}