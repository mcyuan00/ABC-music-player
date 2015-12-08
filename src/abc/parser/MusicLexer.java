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
    T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, 
    SYMBOLS=17, LETTERS=18, BARLINE=19, NTHREPEAT=20, NOTELETTER=21, ACCIDENTAL=22, 
    OCTAVE=23, NEWLINE=24, WHITESPACE=25, DIGIT=26;
  public static String[] modeNames = {
    "DEFAULT_MODE"
  };

  public static final String[] ruleNames = {
    "T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "T__6", "T__7", "T__8", 
    "T__9", "T__10", "T__11", "T__12", "T__13", "T__14", "T__15", "SYMBOLS", 
    "LETTERS", "BARLINE", "NTHREPEAT", "NOTELETTER", "ACCIDENTAL", "OCTAVE", 
    "NEWLINE", "WHITESPACE", "DIGIT"
  };

  private static final String[] _LITERAL_NAMES = {
    null, "'V:'", "'[1'", "'[2'", "'||'", "'[|'", "'|]'", "'|:'", "':'", 
    "':|'", "'|'", "'z'", "'/'", "'('", "'['", "']'", "'%'"
  };
  private static final String[] _SYMBOLIC_NAMES = {
    null, null, null, null, null, null, null, null, null, null, null, null, 
    null, null, null, null, null, "SYMBOLS", "LETTERS", "BARLINE", "NTHREPEAT", 
    "NOTELETTER", "ACCIDENTAL", "OCTAVE", "NEWLINE", "WHITESPACE", "DIGIT"
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
    "\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\2\34\u0099\b\1\4"+
      "\2\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n"+
      "\t\n\4\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21"+
      "\t\21\4\22\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27"+
      "\4\30\t\30\4\31\t\31\4\32\t\32\4\33\t\33\3\2\3\2\3\2\3\3\3\3\3\3\3"+
      "\4\3\4\3\4\3\5\3\5\3\5\3\6\3\6\3\6\3\7\3\7\3\7\3\b\3\b\3\b\3\t\3\t"+
      "\3\n\3\n\3\n\3\13\3\13\3\f\3\f\3\r\3\r\3\16\3\16\3\17\3\17\3\20\3"+
      "\20\3\21\3\21\3\22\3\22\3\23\3\23\3\24\3\24\3\24\3\24\3\24\3\24\3"+
      "\24\3\24\3\24\3\24\3\24\5\24o\n\24\3\25\3\25\3\25\3\25\5\25u\n\25"+
      "\3\26\3\26\3\27\3\27\3\27\3\27\3\27\3\27\3\27\5\27\u0080\n\27\3\30"+
      "\6\30\u0083\n\30\r\30\16\30\u0084\3\30\6\30\u0088\n\30\r\30\16\30"+
      "\u0089\5\30\u008c\n\30\3\31\5\31\u008f\n\31\3\31\3\31\3\32\6\32\u0094"+
      "\n\32\r\32\16\32\u0095\3\33\3\33\2\2\34\3\3\5\4\7\5\t\6\13\7\r\b\17"+
      "\t\21\n\23\13\25\f\27\r\31\16\33\17\35\20\37\21!\22#\23%\24\'\25)"+
      "\26+\27-\30/\31\61\32\63\33\65\34\3\2\t\n\2#$&&(\60<>@B]_bb}\u0080"+
      "\4\2J\\j{\4\2CIci\3\2\17\17\3\2\f\f\3\2\"\"\3\2\62;\u00a7\2\3\3\2"+
      "\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2"+
      "\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2"+
      "\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2"+
      "#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2"+
      "\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2\3\67\3\2\2\2\5"+
      ":\3\2\2\2\7=\3\2\2\2\t@\3\2\2\2\13C\3\2\2\2\rF\3\2\2\2\17I\3\2\2\2"+
      "\21L\3\2\2\2\23N\3\2\2\2\25Q\3\2\2\2\27S\3\2\2\2\31U\3\2\2\2\33W\3"+
      "\2\2\2\35Y\3\2\2\2\37[\3\2\2\2!]\3\2\2\2#_\3\2\2\2%a\3\2\2\2\'n\3"+
      "\2\2\2)t\3\2\2\2+v\3\2\2\2-\177\3\2\2\2/\u008b\3\2\2\2\61\u008e\3"+
      "\2\2\2\63\u0093\3\2\2\2\65\u0097\3\2\2\2\678\7X\2\289\7<\2\29\4\3"+
      "\2\2\2:;\7]\2\2;<\7\63\2\2<\6\3\2\2\2=>\7]\2\2>?\7\64\2\2?\b\3\2\2"+
      "\2@A\7~\2\2AB\7~\2\2B\n\3\2\2\2CD\7]\2\2DE\7~\2\2E\f\3\2\2\2FG\7~"+
      "\2\2GH\7_\2\2H\16\3\2\2\2IJ\7~\2\2JK\7<\2\2K\20\3\2\2\2LM\7<\2\2M"+
      "\22\3\2\2\2NO\7<\2\2OP\7~\2\2P\24\3\2\2\2QR\7~\2\2R\26\3\2\2\2ST\7"+
      "|\2\2T\30\3\2\2\2UV\7\61\2\2V\32\3\2\2\2WX\7*\2\2X\34\3\2\2\2YZ\7"+
      "]\2\2Z\36\3\2\2\2[\\\7_\2\2\\ \3\2\2\2]^\7\'\2\2^\"\3\2\2\2_`\t\2"+
      "\2\2`$\3\2\2\2ab\t\3\2\2b&\3\2\2\2co\7~\2\2de\7~\2\2eo\7~\2\2fg\7"+
      "]\2\2go\7~\2\2hi\7~\2\2io\7_\2\2jk\7~\2\2ko\7<\2\2lm\7<\2\2mo\7~\2"+
      "\2nc\3\2\2\2nd\3\2\2\2nf\3\2\2\2nh\3\2\2\2nj\3\2\2\2nl\3\2\2\2o(\3"+
      "\2\2\2pq\7]\2\2qu\7\63\2\2rs\7]\2\2su\7\64\2\2tp\3\2\2\2tr\3\2\2\2"+
      "u*\3\2\2\2vw\t\4\2\2w,\3\2\2\2x\u0080\7a\2\2yz\7a\2\2z\u0080\7a\2"+
      "\2{\u0080\7`\2\2|}\7`\2\2}\u0080\7`\2\2~\u0080\7?\2\2\177x\3\2\2\2"+
      "\177y\3\2\2\2\177{\3\2\2\2\177|\3\2\2\2\177~\3\2\2\2\u0080.\3\2\2"+
      "\2\u0081\u0083\7)\2\2\u0082\u0081\3\2\2\2\u0083\u0084\3\2\2\2\u0084"+
      "\u0082\3\2\2\2\u0084\u0085\3\2\2\2\u0085\u008c\3\2\2\2\u0086\u0088"+
      "\7.\2\2\u0087\u0086\3\2\2\2\u0088\u0089\3\2\2\2\u0089\u0087\3\2\2"+
      "\2\u0089\u008a\3\2\2\2\u008a\u008c\3\2\2\2\u008b\u0082\3\2\2\2\u008b"+
      "\u0087\3\2\2\2\u008c\60\3\2\2\2\u008d\u008f\t\5\2\2\u008e\u008d\3"+
      "\2\2\2\u008e\u008f\3\2\2\2\u008f\u0090\3\2\2\2\u0090\u0091\t\6\2\2"+
      "\u0091\62\3\2\2\2\u0092\u0094\t\7\2\2\u0093\u0092\3\2\2\2\u0094\u0095"+
      "\3\2\2\2\u0095\u0093\3\2\2\2\u0095\u0096\3\2\2\2\u0096\64\3\2\2\2"+
      "\u0097\u0098\t\b\2\2\u0098\66\3\2\2\2\13\2nt\177\u0084\u0089\u008b"+
      "\u008e\u0095\2";
  public static final ATN _ATN =
    new ATNDeserializer().deserialize(_serializedATN.toCharArray());
  static {
    _decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
    for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
      _decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
    }
  }
}