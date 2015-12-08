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
    T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, NOTELETTER=8, 
    OCTAVE=9, ACCIDENTAL=10, BARLINE=11, DOUBLEBAR=12, STARTREPEAT=13, ENDREPEAT=14, 
    ONEREPEAT=15, TWOREPEAT=16, NEWLINE=17, WHITESPACE=18, DIGIT=19;
  public static String[] modeNames = {
    "DEFAULT_MODE"
  };

  public static final String[] ruleNames = {
    "T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "T__6", "NOTELETTER", 
    "OCTAVE", "ACCIDENTAL", "BARLINE", "DOUBLEBAR", "STARTREPEAT", "ENDREPEAT", 
    "ONEREPEAT", "TWOREPEAT", "NEWLINE", "WHITESPACE", "DIGIT"
  };

  private static final String[] _LITERAL_NAMES = {
    null, "'V:'", "'('", "'['", "']'", "'z'", "'/'", "'%'", null, null, 
    null, "'|'", null, "'|:'", "':|'", "'[1'", "'[2'"
  };
  private static final String[] _SYMBOLIC_NAMES = {
    null, null, null, null, null, null, null, null, "NOTELETTER", "OCTAVE", 
    "ACCIDENTAL", "BARLINE", "DOUBLEBAR", "STARTREPEAT", "ENDREPEAT", "ONEREPEAT", 
    "TWOREPEAT", "NEWLINE", "WHITESPACE", "DIGIT"
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
    "\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\2\25q\b\1\4\2\t\2"+
      "\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
      "\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4"+
      "\22\t\22\4\23\t\23\4\24\t\24\3\2\3\2\3\2\3\3\3\3\3\4\3\4\3\5\3\5\3"+
      "\6\3\6\3\7\3\7\3\b\3\b\3\t\3\t\3\n\6\n<\n\n\r\n\16\n=\3\n\6\nA\n\n"+
      "\r\n\16\nB\5\nE\n\n\3\13\3\13\3\13\3\13\3\13\3\13\3\13\5\13N\n\13"+
      "\3\f\3\f\3\r\3\r\3\r\3\r\3\r\3\r\5\rX\n\r\3\16\3\16\3\16\3\17\3\17"+
      "\3\17\3\20\3\20\3\20\3\21\3\21\3\21\3\22\5\22g\n\22\3\22\3\22\3\23"+
      "\6\23l\n\23\r\23\16\23m\3\24\3\24\2\2\25\3\3\5\4\7\5\t\6\13\7\r\b"+
      "\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35\20\37\21!\22#\23%\24\'\25"+
      "\3\2\7\4\2CIci\3\2\17\17\3\2\f\f\4\2\13\13\"\"\3\2\62;{\2\3\3\2\2"+
      "\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2"+
      "\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2"+
      "\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3"+
      "\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\3)\3\2\2\2\5,\3\2\2\2\7.\3\2\2\2\t\60"+
      "\3\2\2\2\13\62\3\2\2\2\r\64\3\2\2\2\17\66\3\2\2\2\218\3\2\2\2\23D"+
      "\3\2\2\2\25M\3\2\2\2\27O\3\2\2\2\31W\3\2\2\2\33Y\3\2\2\2\35\\\3\2"+
      "\2\2\37_\3\2\2\2!b\3\2\2\2#f\3\2\2\2%k\3\2\2\2\'o\3\2\2\2)*\7X\2\2"+
      "*+\7<\2\2+\4\3\2\2\2,-\7*\2\2-\6\3\2\2\2./\7]\2\2/\b\3\2\2\2\60\61"+
      "\7_\2\2\61\n\3\2\2\2\62\63\7|\2\2\63\f\3\2\2\2\64\65\7\61\2\2\65\16"+
      "\3\2\2\2\66\67\7\'\2\2\67\20\3\2\2\289\t\2\2\29\22\3\2\2\2:<\7)\2"+
      "\2;:\3\2\2\2<=\3\2\2\2=;\3\2\2\2=>\3\2\2\2>E\3\2\2\2?A\7.\2\2@?\3"+
      "\2\2\2AB\3\2\2\2B@\3\2\2\2BC\3\2\2\2CE\3\2\2\2D;\3\2\2\2D@\3\2\2\2"+
      "E\24\3\2\2\2FN\7a\2\2GH\7a\2\2HN\7a\2\2IN\7`\2\2JK\7`\2\2KN\7`\2\2"+
      "LN\7?\2\2MF\3\2\2\2MG\3\2\2\2MI\3\2\2\2MJ\3\2\2\2ML\3\2\2\2N\26\3"+
      "\2\2\2OP\7~\2\2P\30\3\2\2\2QR\7~\2\2RX\7~\2\2ST\7]\2\2TX\7~\2\2UV"+
      "\7~\2\2VX\7_\2\2WQ\3\2\2\2WS\3\2\2\2WU\3\2\2\2X\32\3\2\2\2YZ\7~\2"+
      "\2Z[\7<\2\2[\34\3\2\2\2\\]\7<\2\2]^\7~\2\2^\36\3\2\2\2_`\7]\2\2`a"+
      "\7\63\2\2a \3\2\2\2bc\7]\2\2cd\7\64\2\2d\"\3\2\2\2eg\t\3\2\2fe\3\2"+
      "\2\2fg\3\2\2\2gh\3\2\2\2hi\t\4\2\2i$\3\2\2\2jl\t\5\2\2kj\3\2\2\2l"+
      "m\3\2\2\2mk\3\2\2\2mn\3\2\2\2n&\3\2\2\2op\t\6\2\2p(\3\2\2\2\n\2=B"+
      "DMWfm\2";
  public static final ATN _ATN =
    new ATNDeserializer().deserialize(_serializedATN.toCharArray());
  static {
    _decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
    for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
      _decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
    }
  }
}