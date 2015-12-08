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
    "\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\2\21f\b\1\4\2\t\2"+
      "\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
      "\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\3\2\3\2\3\2"+
      "\3\3\3\3\3\4\3\4\3\5\3\5\3\6\3\6\3\7\3\7\3\b\3\b\3\t\3\t\3\n\6\n\64"+
      "\n\n\r\n\16\n\65\3\n\6\n9\n\n\r\n\16\n:\5\n=\n\n\3\13\3\13\3\13\3"+
      "\13\3\13\3\13\3\13\5\13F\n\13\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f"+
      "\3\f\3\f\5\fS\n\f\3\r\3\r\3\r\3\r\5\rY\n\r\3\16\5\16\\\n\16\3\16\3"+
      "\16\3\17\6\17a\n\17\r\17\16\17b\3\20\3\20\2\2\21\3\3\5\4\7\5\t\6\13"+
      "\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35\20\37\21\3\2\7\4\2"+
      "CIci\3\2\17\17\3\2\f\f\3\2\13\13\3\2\62;t\2\3\3\2\2\2\2\5\3\2\2\2"+
      "\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21"+
      "\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33"+
      "\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\3!\3\2\2\2\5$\3\2\2\2\7&\3\2\2"+
      "\2\t(\3\2\2\2\13*\3\2\2\2\r,\3\2\2\2\17.\3\2\2\2\21\60\3\2\2\2\23"+
      "<\3\2\2\2\25E\3\2\2\2\27R\3\2\2\2\31X\3\2\2\2\33[\3\2\2\2\35`\3\2"+
      "\2\2\37d\3\2\2\2!\"\7X\2\2\"#\7<\2\2#\4\3\2\2\2$%\7*\2\2%\6\3\2\2"+
      "\2&\'\7]\2\2\'\b\3\2\2\2()\7_\2\2)\n\3\2\2\2*+\7|\2\2+\f\3\2\2\2,"+
      "-\7\61\2\2-\16\3\2\2\2./\7\'\2\2/\20\3\2\2\2\60\61\t\2\2\2\61\22\3"+
      "\2\2\2\62\64\7)\2\2\63\62\3\2\2\2\64\65\3\2\2\2\65\63\3\2\2\2\65\66"+
      "\3\2\2\2\66=\3\2\2\2\679\7.\2\28\67\3\2\2\29:\3\2\2\2:8\3\2\2\2:;"+
      "\3\2\2\2;=\3\2\2\2<\63\3\2\2\2<8\3\2\2\2=\24\3\2\2\2>F\7a\2\2?@\7"+
      "a\2\2@F\7a\2\2AF\7`\2\2BC\7`\2\2CF\7`\2\2DF\7?\2\2E>\3\2\2\2E?\3\2"+
      "\2\2EA\3\2\2\2EB\3\2\2\2ED\3\2\2\2F\26\3\2\2\2GS\7~\2\2HI\7~\2\2I"+
      "S\7~\2\2JK\7~\2\2KS\7<\2\2LM\7<\2\2MS\7~\2\2NO\7]\2\2OS\7~\2\2PQ\7"+
      "~\2\2QS\7_\2\2RG\3\2\2\2RH\3\2\2\2RJ\3\2\2\2RL\3\2\2\2RN\3\2\2\2R"+
      "P\3\2\2\2S\30\3\2\2\2TU\7]\2\2UY\7\63\2\2VW\7]\2\2WY\7\64\2\2XT\3"+
      "\2\2\2XV\3\2\2\2Y\32\3\2\2\2Z\\\t\3\2\2[Z\3\2\2\2[\\\3\2\2\2\\]\3"+
      "\2\2\2]^\t\4\2\2^\34\3\2\2\2_a\t\5\2\2`_\3\2\2\2ab\3\2\2\2b`\3\2\2"+
      "\2bc\3\2\2\2c\36\3\2\2\2de\t\6\2\2e \3\2\2\2\13\2\65:<ERX[b\2";
  public static final ATN _ATN =
    new ATNDeserializer().deserialize(_serializedATN.toCharArray());
  static {
    _decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
    for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
      _decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
    }
  }
}