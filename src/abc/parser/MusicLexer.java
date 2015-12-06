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
    OCTAVE=9, ACCIDENTAL=10, BARLINE=11, NUMREPEAT=12, NEWLINE=13, WHITESPACE=14, 
    DIGIT=15;
  public static String[] modeNames = {
    "DEFAULT_MODE"
  };

  public static final String[] ruleNames = {
    "T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "T__6", "NOTELETTER", 
    "OCTAVE", "ACCIDENTAL", "BARLINE", "NUMREPEAT", "NEWLINE", "WHITESPACE", 
    "DIGIT"
  };

  private static final String[] _LITERAL_NAMES = {
    null, "'V:'", "'('", "'['", "']'", "'z'", "'/'", "'%'"
  };
  private static final String[] _SYMBOLIC_NAMES = {
    null, null, null, null, null, null, null, null, "NOTELETTER", "OCTAVE", 
    "ACCIDENTAL", "BARLINE", "NUMREPEAT", "NEWLINE", "WHITESPACE", "DIGIT"
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
    "\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\2\21g\b\1\4\2\t\2"+
      "\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
      "\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\3\2\3\2\3\2"+
      "\3\3\3\3\3\4\3\4\3\5\3\5\3\6\3\6\3\7\3\7\3\b\3\b\3\t\5\t\62\n\t\3"+
      "\n\6\n\65\n\n\r\n\16\n\66\3\n\6\n:\n\n\r\n\16\n;\5\n>\n\n\3\13\3\13"+
      "\3\13\3\13\3\13\3\13\3\13\5\13G\n\13\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3"+
      "\f\3\f\3\f\3\f\5\fT\n\f\3\r\3\r\3\r\3\r\5\rZ\n\r\3\16\5\16]\n\16\3"+
      "\16\3\16\3\17\6\17b\n\17\r\17\16\17c\3\20\3\20\2\2\21\3\3\5\4\7\5"+
      "\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35\20\37\21\3"+
      "\2\7\4\2CIci\3\2\17\17\3\2\f\f\5\2\13\13^^uu\3\2\62;u\2\3\3\2\2\2"+
      "\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17"+
      "\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31"+
      "\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\3!\3\2\2\2\5$\3\2"+
      "\2\2\7&\3\2\2\2\t(\3\2\2\2\13*\3\2\2\2\r,\3\2\2\2\17.\3\2\2\2\21\61"+
      "\3\2\2\2\23=\3\2\2\2\25F\3\2\2\2\27S\3\2\2\2\31Y\3\2\2\2\33\\\3\2"+
      "\2\2\35a\3\2\2\2\37e\3\2\2\2!\"\7X\2\2\"#\7<\2\2#\4\3\2\2\2$%\7*\2"+
      "\2%\6\3\2\2\2&\'\7]\2\2\'\b\3\2\2\2()\7_\2\2)\n\3\2\2\2*+\7|\2\2+"+
      "\f\3\2\2\2,-\7\61\2\2-\16\3\2\2\2./\7\'\2\2/\20\3\2\2\2\60\62\t\2"+
      "\2\2\61\60\3\2\2\2\62\22\3\2\2\2\63\65\7)\2\2\64\63\3\2\2\2\65\66"+
      "\3\2\2\2\66\64\3\2\2\2\66\67\3\2\2\2\67>\3\2\2\28:\7.\2\298\3\2\2"+
      "\2:;\3\2\2\2;9\3\2\2\2;<\3\2\2\2<>\3\2\2\2=\64\3\2\2\2=9\3\2\2\2>"+
      "\24\3\2\2\2?G\7a\2\2@A\7a\2\2AG\7a\2\2BG\7`\2\2CD\7`\2\2DG\7`\2\2"+
      "EG\7?\2\2F?\3\2\2\2F@\3\2\2\2FB\3\2\2\2FC\3\2\2\2FE\3\2\2\2G\26\3"+
      "\2\2\2HT\7~\2\2IJ\7~\2\2JT\7~\2\2KL\7~\2\2LT\7<\2\2MN\7<\2\2NT\7~"+
      "\2\2OP\7]\2\2PT\7~\2\2QR\7~\2\2RT\7_\2\2SH\3\2\2\2SI\3\2\2\2SK\3\2"+
      "\2\2SM\3\2\2\2SO\3\2\2\2SQ\3\2\2\2T\30\3\2\2\2UV\7]\2\2VZ\7\63\2\2"+
      "WX\7]\2\2XZ\7\64\2\2YU\3\2\2\2YW\3\2\2\2Z\32\3\2\2\2[]\t\3\2\2\\["+
      "\3\2\2\2\\]\3\2\2\2]^\3\2\2\2^_\t\4\2\2_\34\3\2\2\2`b\t\5\2\2a`\3"+
      "\2\2\2bc\3\2\2\2ca\3\2\2\2cd\3\2\2\2d\36\3\2\2\2ef\t\6\2\2f \3\2\2"+
      "\2\f\2\61\66;=FSY\\c\2";
  public static final ATN _ATN =
    new ATNDeserializer().deserialize(_serializedATN.toCharArray());
  static {
    _decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
    for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
      _decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
    }
  }
}