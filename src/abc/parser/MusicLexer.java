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
    T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, ACCIDENTAL=15, OCTAVE=16, 
    SYMBOLS=17, LETTERS=18, NTHREPEAT=19, NOTELETTER=20, NEWLINE=21, WHITESPACE=22, 
    DIGIT=23;
  public static String[] modeNames = {
    "DEFAULT_MODE"
  };

  public static final String[] ruleNames = {
    "T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "T__6", "T__7", "T__8", 
    "T__9", "T__10", "T__11", "T__12", "T__13", "ACCIDENTAL", "OCTAVE", 
    "SYMBOLS", "LETTERS", "NTHREPEAT", "NOTELETTER", "NEWLINE", "WHITESPACE", 
    "DIGIT"
  };

  private static final String[] _LITERAL_NAMES = {
    null, "'[1'", "'[2'", "'|'", "'||'", "'[|'", "'|]'", "'|:'", "':|'", 
    "'['", "']'", "'z'", "'/'", "'('", "'%'"
  };
  private static final String[] _SYMBOLIC_NAMES = {
    null, null, null, null, null, null, null, null, null, null, null, null, 
    null, null, null, "ACCIDENTAL", "OCTAVE", "SYMBOLS", "LETTERS", "NTHREPEAT", 
    "NOTELETTER", "NEWLINE", "WHITESPACE", "DIGIT"
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
    "\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\2\31\u0081\b\1\4"+
      "\2\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n"+
      "\t\n\4\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21"+
      "\t\21\4\22\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27"+
      "\4\30\t\30\3\2\3\2\3\2\3\3\3\3\3\3\3\4\3\4\3\5\3\5\3\5\3\6\3\6\3\6"+
      "\3\7\3\7\3\7\3\b\3\b\3\b\3\t\3\t\3\t\3\n\3\n\3\13\3\13\3\f\3\f\3\r"+
      "\3\r\3\16\3\16\3\17\3\17\3\20\3\20\3\20\3\20\3\20\3\20\3\20\5\20\\"+
      "\n\20\3\21\6\21_\n\21\r\21\16\21`\3\21\6\21d\n\21\r\21\16\21e\5\21"+
      "h\n\21\3\22\3\22\3\23\3\23\3\24\3\24\3\24\3\24\5\24r\n\24\3\25\3\25"+
      "\3\26\5\26w\n\26\3\26\3\26\3\27\6\27|\n\27\r\27\16\27}\3\30\3\30\2"+
      "\2\31\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33"+
      "\17\35\20\37\21!\22#\23%\24\'\25)\26+\27-\30/\31\3\2\t\f\2#$&&((*"+
      "-/\60<>@B]_bb}\u0080\4\2J\\j{\4\2CIci\3\2\17\17\3\2\f\f\3\2\"\"\3"+
      "\2\62;\u008a\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13"+
      "\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3"+
      "\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3"+
      "\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+"+
      "\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\3\61\3\2\2\2\5\64\3\2\2\2\7\67\3\2"+
      "\2\2\t9\3\2\2\2\13<\3\2\2\2\r?\3\2\2\2\17B\3\2\2\2\21E\3\2\2\2\23"+
      "H\3\2\2\2\25J\3\2\2\2\27L\3\2\2\2\31N\3\2\2\2\33P\3\2\2\2\35R\3\2"+
      "\2\2\37[\3\2\2\2!g\3\2\2\2#i\3\2\2\2%k\3\2\2\2\'q\3\2\2\2)s\3\2\2"+
      "\2+v\3\2\2\2-{\3\2\2\2/\177\3\2\2\2\61\62\7]\2\2\62\63\7\63\2\2\63"+
      "\4\3\2\2\2\64\65\7]\2\2\65\66\7\64\2\2\66\6\3\2\2\2\678\7~\2\28\b"+
      "\3\2\2\29:\7~\2\2:;\7~\2\2;\n\3\2\2\2<=\7]\2\2=>\7~\2\2>\f\3\2\2\2"+
      "?@\7~\2\2@A\7_\2\2A\16\3\2\2\2BC\7~\2\2CD\7<\2\2D\20\3\2\2\2EF\7<"+
      "\2\2FG\7~\2\2G\22\3\2\2\2HI\7]\2\2I\24\3\2\2\2JK\7_\2\2K\26\3\2\2"+
      "\2LM\7|\2\2M\30\3\2\2\2NO\7\61\2\2O\32\3\2\2\2PQ\7*\2\2Q\34\3\2\2"+
      "\2RS\7\'\2\2S\36\3\2\2\2T\\\7a\2\2UV\7a\2\2V\\\7a\2\2W\\\7`\2\2XY"+
      "\7`\2\2Y\\\7`\2\2Z\\\7?\2\2[T\3\2\2\2[U\3\2\2\2[W\3\2\2\2[X\3\2\2"+
      "\2[Z\3\2\2\2\\ \3\2\2\2]_\7)\2\2^]\3\2\2\2_`\3\2\2\2`^\3\2\2\2`a\3"+
      "\2\2\2ah\3\2\2\2bd\7.\2\2cb\3\2\2\2de\3\2\2\2ec\3\2\2\2ef\3\2\2\2"+
      "fh\3\2\2\2g^\3\2\2\2gc\3\2\2\2h\"\3\2\2\2ij\t\2\2\2j$\3\2\2\2kl\t"+
      "\3\2\2l&\3\2\2\2mn\7]\2\2nr\7\63\2\2op\7]\2\2pr\7\64\2\2qm\3\2\2\2"+
      "qo\3\2\2\2r(\3\2\2\2st\t\4\2\2t*\3\2\2\2uw\t\5\2\2vu\3\2\2\2vw\3\2"+
      "\2\2wx\3\2\2\2xy\t\6\2\2y,\3\2\2\2z|\t\7\2\2{z\3\2\2\2|}\3\2\2\2}"+
      "{\3\2\2\2}~\3\2\2\2~.\3\2\2\2\177\u0080\t\b\2\2\u0080\60\3\2\2\2\n"+
      "\2[`egqv}\2";
  public static final ATN _ATN =
    new ATNDeserializer().deserialize(_serializedATN.toCharArray());
  static {
    _decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
    for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
      _decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
    }
  }
}