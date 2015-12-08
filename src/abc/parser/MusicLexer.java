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
    SYMBOLS=9, LETTERS=10, OCTAVE=11, ACCIDENTAL=12, BARLINE=13, DOUBLEBAR=14, 
    STARTREPEAT=15, ENDREPEAT=16, ONEREPEAT=17, TWOREPEAT=18, NEWLINE=19, 
    WHITESPACE=20, DIGIT=21;
  public static String[] modeNames = {
    "DEFAULT_MODE"
  };

  public static final String[] ruleNames = {
    "T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "T__6", "NOTELETTER", 
    "SYMBOLS", "LETTERS", "OCTAVE", "ACCIDENTAL", "BARLINE", "DOUBLEBAR", 
    "STARTREPEAT", "ENDREPEAT", "ONEREPEAT", "TWOREPEAT", "NEWLINE", "WHITESPACE", 
    "DIGIT"
  };

  private static final String[] _LITERAL_NAMES = {
    null, "'V:'", "'('", "'['", "']'", "'z'", "'/'", "'%'", null, null, 
    null, null, null, "'|'", null, "'|:'", "':|'", "'[1'", "'[2'"
  };
  private static final String[] _SYMBOLIC_NAMES = {
    null, null, null, null, null, null, null, null, "NOTELETTER", "SYMBOLS", 
    "LETTERS", "OCTAVE", "ACCIDENTAL", "BARLINE", "DOUBLEBAR", "STARTREPEAT", 
    "ENDREPEAT", "ONEREPEAT", "TWOREPEAT", "NEWLINE", "WHITESPACE", "DIGIT"
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
    "\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\2\27y\b\1\4\2\t\2"+
      "\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
      "\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4"+
      "\22\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\3\2\3\2\3\2\3\3\3"+
      "\3\3\4\3\4\3\5\3\5\3\6\3\6\3\7\3\7\3\b\3\b\3\t\3\t\3\n\3\n\3\13\3"+
      "\13\3\f\6\fD\n\f\r\f\16\fE\3\f\6\fI\n\f\r\f\16\fJ\5\fM\n\f\3\r\3\r"+
      "\3\r\3\r\3\r\3\r\3\r\5\rV\n\r\3\16\3\16\3\17\3\17\3\17\3\17\3\17\3"+
      "\17\5\17`\n\17\3\20\3\20\3\20\3\21\3\21\3\21\3\22\3\22\3\22\3\23\3"+
      "\23\3\23\3\24\5\24o\n\24\3\24\3\24\3\25\6\25t\n\25\r\25\16\25u\3\26"+
      "\3\26\2\2\27\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31"+
      "\16\33\17\35\20\37\21!\22#\23%\24\'\25)\26+\27\3\2\t\4\2CIci\t\2#"+
      "$&&(\60<>@B]b}\u0080\4\2J\\j{\3\2\17\17\3\2\f\f\3\2\13\13\3\2\62;"+
      "\u0083\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2"+
      "\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2"+
      "\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2"+
      "\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2"+
      "\2\3-\3\2\2\2\5\60\3\2\2\2\7\62\3\2\2\2\t\64\3\2\2\2\13\66\3\2\2\2"+
      "\r8\3\2\2\2\17:\3\2\2\2\21<\3\2\2\2\23>\3\2\2\2\25@\3\2\2\2\27L\3"+
      "\2\2\2\31U\3\2\2\2\33W\3\2\2\2\35_\3\2\2\2\37a\3\2\2\2!d\3\2\2\2#"+
      "g\3\2\2\2%j\3\2\2\2\'n\3\2\2\2)s\3\2\2\2+w\3\2\2\2-.\7X\2\2./\7<\2"+
      "\2/\4\3\2\2\2\60\61\7*\2\2\61\6\3\2\2\2\62\63\7]\2\2\63\b\3\2\2\2"+
      "\64\65\7_\2\2\65\n\3\2\2\2\66\67\7|\2\2\67\f\3\2\2\289\7\61\2\29\16"+
      "\3\2\2\2:;\7\'\2\2;\20\3\2\2\2<=\t\2\2\2=\22\3\2\2\2>?\t\3\2\2?\24"+
      "\3\2\2\2@A\t\4\2\2A\26\3\2\2\2BD\7)\2\2CB\3\2\2\2DE\3\2\2\2EC\3\2"+
      "\2\2EF\3\2\2\2FM\3\2\2\2GI\7.\2\2HG\3\2\2\2IJ\3\2\2\2JH\3\2\2\2JK"+
      "\3\2\2\2KM\3\2\2\2LC\3\2\2\2LH\3\2\2\2M\30\3\2\2\2NV\7a\2\2OP\7a\2"+
      "\2PV\7a\2\2QV\7`\2\2RS\7`\2\2SV\7`\2\2TV\7?\2\2UN\3\2\2\2UO\3\2\2"+
      "\2UQ\3\2\2\2UR\3\2\2\2UT\3\2\2\2V\32\3\2\2\2WX\7~\2\2X\34\3\2\2\2"+
      "YZ\7~\2\2Z`\7~\2\2[\\\7]\2\2\\`\7~\2\2]^\7~\2\2^`\7_\2\2_Y\3\2\2\2"+
      "_[\3\2\2\2_]\3\2\2\2`\36\3\2\2\2ab\7~\2\2bc\7<\2\2c \3\2\2\2de\7<"+
      "\2\2ef\7~\2\2f\"\3\2\2\2gh\7]\2\2hi\7\63\2\2i$\3\2\2\2jk\7]\2\2kl"+
      "\7\64\2\2l&\3\2\2\2mo\t\5\2\2nm\3\2\2\2no\3\2\2\2op\3\2\2\2pq\t\6"+
      "\2\2q(\3\2\2\2rt\t\7\2\2sr\3\2\2\2tu\3\2\2\2us\3\2\2\2uv\3\2\2\2v"+
      "*\3\2\2\2wx\t\b\2\2x,\3\2\2\2\n\2EJLU_nu\2";
  public static final ATN _ATN =
    new ATNDeserializer().deserialize(_serializedATN.toCharArray());
  static {
    _decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
    for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
      _decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
    }
  }
}