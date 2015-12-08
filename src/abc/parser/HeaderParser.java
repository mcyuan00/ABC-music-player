// Generated from Header.g4 by ANTLR 4.5.1

package abc.parser;
// Do not edit this .java file! Edit the .g4 file and re-run Antlr.

import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class HeaderParser extends Parser {
  static { RuntimeMetaData.checkVersion("4.5.1", RuntimeMetaData.VERSION); }

  protected static final DFA[] _decisionToDFA;
  protected static final PredictionContextCache _sharedContextCache =
    new PredictionContextCache();
  public static final int
    T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
    T__9=10, T__10=11, T__11=12, T__12=13, NOTE=14, SYMBOLS=15, LETTERS=16, 
    KEYACCIDENTAL=17, MINOR=18, NEWLINE=19, DIGIT=20, WHITESPACE=21;
  public static final int
    RULE_root = 0, RULE_header = 1, RULE_index = 2, RULE_title = 3, RULE_otherfields = 4, 
    RULE_composer = 5, RULE_length = 6, RULE_tempo = 7, RULE_meter = 8, 
    RULE_voice = 9, RULE_key = 10, RULE_comment = 11, RULE_text = 12;
  public static final String[] ruleNames = {
    "root", "header", "index", "title", "otherfields", "composer", "length", 
    "tempo", "meter", "voice", "key", "comment", "text"
  };

  private static final String[] _LITERAL_NAMES = {
    null, "'X:'", "'T:'", "'C:'", "'L:'", "'/'", "'Q:'", "'='", "'M:'", 
    "'C'", "'C|'", "'V:'", "'K:'", "'%'", null, null, null, null, "'m'"
  };
  private static final String[] _SYMBOLIC_NAMES = {
    null, null, null, null, null, null, null, null, null, null, null, null, 
    null, null, "NOTE", "SYMBOLS", "LETTERS", "KEYACCIDENTAL", "MINOR", 
    "NEWLINE", "DIGIT", "WHITESPACE"
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

  @Override
  public String getGrammarFileName() { return "Header.g4"; }

  @Override
  public String[] getRuleNames() { return ruleNames; }

  @Override
  public String getSerializedATN() { return _serializedATN; }

  @Override
  public ATN getATN() { return _ATN; }


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

  public HeaderParser(TokenStream input) {
    super(input);
    _interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
  }
  public static class RootContext extends ParserRuleContext {
    public HeaderContext header() {
      return getRuleContext(HeaderContext.class,0);
    }
    public TerminalNode EOF() { return getToken(HeaderParser.EOF, 0); }
    public RootContext(ParserRuleContext parent, int invokingState) {
      super(parent, invokingState);
    }
    @Override public int getRuleIndex() { return RULE_root; }
    @Override
    public void enterRule(ParseTreeListener listener) {
      if ( listener instanceof HeaderListener ) ((HeaderListener)listener).enterRoot(this);
    }
    @Override
    public void exitRule(ParseTreeListener listener) {
      if ( listener instanceof HeaderListener ) ((HeaderListener)listener).exitRoot(this);
    }
  }

  public final RootContext root() throws RecognitionException {
    RootContext _localctx = new RootContext(_ctx, getState());
    enterRule(_localctx, 0, RULE_root);
    try {
      enterOuterAlt(_localctx, 1);
      {
      setState(26);
      header();
      setState(27);
      match(EOF);
      }
    }
    catch (RecognitionException re) {
      _localctx.exception = re;
      _errHandler.reportError(this, re);
      _errHandler.recover(this, re);
    }
    finally {
      exitRule();
    }
    return _localctx;
  }

  public static class HeaderContext extends ParserRuleContext {
    public IndexContext index() {
      return getRuleContext(IndexContext.class,0);
    }
    public TitleContext title() {
      return getRuleContext(TitleContext.class,0);
    }
    public KeyContext key() {
      return getRuleContext(KeyContext.class,0);
    }
    public List<CommentContext> comment() {
      return getRuleContexts(CommentContext.class);
    }
    public CommentContext comment(int i) {
      return getRuleContext(CommentContext.class,i);
    }
    public List<OtherfieldsContext> otherfields() {
      return getRuleContexts(OtherfieldsContext.class);
    }
    public OtherfieldsContext otherfields(int i) {
      return getRuleContext(OtherfieldsContext.class,i);
    }
    public HeaderContext(ParserRuleContext parent, int invokingState) {
      super(parent, invokingState);
    }
    @Override public int getRuleIndex() { return RULE_header; }
    @Override
    public void enterRule(ParseTreeListener listener) {
      if ( listener instanceof HeaderListener ) ((HeaderListener)listener).enterHeader(this);
    }
    @Override
    public void exitRule(ParseTreeListener listener) {
      if ( listener instanceof HeaderListener ) ((HeaderListener)listener).exitHeader(this);
    }
  }

  public final HeaderContext header() throws RecognitionException {
    HeaderContext _localctx = new HeaderContext(_ctx, getState());
    enterRule(_localctx, 2, RULE_header);
    int _la;
    try {
      enterOuterAlt(_localctx, 1);
      {
      setState(29);
      index();
      setState(33);
      _errHandler.sync(this);
      _la = _input.LA(1);
      while (_la==T__12) {
        {
        {
        setState(30);
        comment();
        }
        }
        setState(35);
        _errHandler.sync(this);
        _la = _input.LA(1);
      }
      setState(36);
      title();
      setState(40);
      _errHandler.sync(this);
      _la = _input.LA(1);
      while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__2) | (1L << T__3) | (1L << T__5) | (1L << T__7) | (1L << T__10) | (1L << T__12))) != 0)) {
        {
        {
        setState(37);
        otherfields();
        }
        }
        setState(42);
        _errHandler.sync(this);
        _la = _input.LA(1);
      }
      setState(43);
      key();
      }
    }
    catch (RecognitionException re) {
      _localctx.exception = re;
      _errHandler.reportError(this, re);
      _errHandler.recover(this, re);
    }
    finally {
      exitRule();
    }
    return _localctx;
  }

  public static class IndexContext extends ParserRuleContext {
    public TerminalNode NEWLINE() { return getToken(HeaderParser.NEWLINE, 0); }
    public List<TerminalNode> DIGIT() { return getTokens(HeaderParser.DIGIT); }
    public TerminalNode DIGIT(int i) {
      return getToken(HeaderParser.DIGIT, i);
    }
    public IndexContext(ParserRuleContext parent, int invokingState) {
      super(parent, invokingState);
    }
    @Override public int getRuleIndex() { return RULE_index; }
    @Override
    public void enterRule(ParseTreeListener listener) {
      if ( listener instanceof HeaderListener ) ((HeaderListener)listener).enterIndex(this);
    }
    @Override
    public void exitRule(ParseTreeListener listener) {
      if ( listener instanceof HeaderListener ) ((HeaderListener)listener).exitIndex(this);
    }
  }

  public final IndexContext index() throws RecognitionException {
    IndexContext _localctx = new IndexContext(_ctx, getState());
    enterRule(_localctx, 4, RULE_index);
    int _la;
    try {
      enterOuterAlt(_localctx, 1);
      {
      setState(45);
      match(T__0);
      setState(47); 
      _errHandler.sync(this);
      _la = _input.LA(1);
      do {
        {
        {
        setState(46);
        match(DIGIT);
        }
        }
        setState(49); 
        _errHandler.sync(this);
        _la = _input.LA(1);
      } while ( _la==DIGIT );
      setState(51);
      match(NEWLINE);
      }
    }
    catch (RecognitionException re) {
      _localctx.exception = re;
      _errHandler.reportError(this, re);
      _errHandler.recover(this, re);
    }
    finally {
      exitRule();
    }
    return _localctx;
  }

  public static class TitleContext extends ParserRuleContext {
    public TerminalNode NEWLINE() { return getToken(HeaderParser.NEWLINE, 0); }
    public List<TextContext> text() {
      return getRuleContexts(TextContext.class);
    }
    public TextContext text(int i) {
      return getRuleContext(TextContext.class,i);
    }
    public TitleContext(ParserRuleContext parent, int invokingState) {
      super(parent, invokingState);
    }
    @Override public int getRuleIndex() { return RULE_title; }
    @Override
    public void enterRule(ParseTreeListener listener) {
      if ( listener instanceof HeaderListener ) ((HeaderListener)listener).enterTitle(this);
    }
    @Override
    public void exitRule(ParseTreeListener listener) {
      if ( listener instanceof HeaderListener ) ((HeaderListener)listener).exitTitle(this);
    }
  }

  public final TitleContext title() throws RecognitionException {
    TitleContext _localctx = new TitleContext(_ctx, getState());
    enterRule(_localctx, 6, RULE_title);
    int _la;
    try {
      enterOuterAlt(_localctx, 1);
      {
      setState(53);
      match(T__1);
      setState(55); 
      _errHandler.sync(this);
      _la = _input.LA(1);
      do {
        {
        {
        setState(54);
        text();
        }
        }
        setState(57); 
        _errHandler.sync(this);
        _la = _input.LA(1);
      } while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << NOTE) | (1L << SYMBOLS) | (1L << LETTERS) | (1L << KEYACCIDENTAL) | (1L << MINOR) | (1L << DIGIT))) != 0) );
      setState(59);
      match(NEWLINE);
      }
    }
    catch (RecognitionException re) {
      _localctx.exception = re;
      _errHandler.reportError(this, re);
      _errHandler.recover(this, re);
    }
    finally {
      exitRule();
    }
    return _localctx;
  }

  public static class OtherfieldsContext extends ParserRuleContext {
    public ComposerContext composer() {
      return getRuleContext(ComposerContext.class,0);
    }
    public LengthContext length() {
      return getRuleContext(LengthContext.class,0);
    }
    public MeterContext meter() {
      return getRuleContext(MeterContext.class,0);
    }
    public TempoContext tempo() {
      return getRuleContext(TempoContext.class,0);
    }
    public List<VoiceContext> voice() {
      return getRuleContexts(VoiceContext.class);
    }
    public VoiceContext voice(int i) {
      return getRuleContext(VoiceContext.class,i);
    }
    public CommentContext comment() {
      return getRuleContext(CommentContext.class,0);
    }
    public OtherfieldsContext(ParserRuleContext parent, int invokingState) {
      super(parent, invokingState);
    }
    @Override public int getRuleIndex() { return RULE_otherfields; }
    @Override
    public void enterRule(ParseTreeListener listener) {
      if ( listener instanceof HeaderListener ) ((HeaderListener)listener).enterOtherfields(this);
    }
    @Override
    public void exitRule(ParseTreeListener listener) {
      if ( listener instanceof HeaderListener ) ((HeaderListener)listener).exitOtherfields(this);
    }
  }

  public final OtherfieldsContext otherfields() throws RecognitionException {
    OtherfieldsContext _localctx = new OtherfieldsContext(_ctx, getState());
    enterRule(_localctx, 8, RULE_otherfields);
    try {
      int _alt;
      setState(71);
      switch (_input.LA(1)) {
      case T__2:
        enterOuterAlt(_localctx, 1);
        {
        setState(61);
        composer();
        }
        break;
      case T__3:
        enterOuterAlt(_localctx, 2);
        {
        setState(62);
        length();
        }
        break;
      case T__7:
        enterOuterAlt(_localctx, 3);
        {
        setState(63);
        meter();
        }
        break;
      case T__5:
        enterOuterAlt(_localctx, 4);
        {
        setState(64);
        tempo();
        }
        break;
      case T__10:
        enterOuterAlt(_localctx, 5);
        {
        setState(66); 
        _errHandler.sync(this);
        _alt = 1;
        do {
          switch (_alt) {
          case 1:
            {
            {
            setState(65);
            voice();
            }
            }
            break;
          default:
            throw new NoViableAltException(this);
          }
          setState(68); 
          _errHandler.sync(this);
          _alt = getInterpreter().adaptivePredict(_input,4,_ctx);
        } while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
        }
        break;
      case T__12:
        enterOuterAlt(_localctx, 6);
        {
        setState(70);
        comment();
        }
        break;
      default:
        throw new NoViableAltException(this);
      }
    }
    catch (RecognitionException re) {
      _localctx.exception = re;
      _errHandler.reportError(this, re);
      _errHandler.recover(this, re);
    }
    finally {
      exitRule();
    }
    return _localctx;
  }

  public static class ComposerContext extends ParserRuleContext {
    public TerminalNode NEWLINE() { return getToken(HeaderParser.NEWLINE, 0); }
    public List<TextContext> text() {
      return getRuleContexts(TextContext.class);
    }
    public TextContext text(int i) {
      return getRuleContext(TextContext.class,i);
    }
    public ComposerContext(ParserRuleContext parent, int invokingState) {
      super(parent, invokingState);
    }
    @Override public int getRuleIndex() { return RULE_composer; }
    @Override
    public void enterRule(ParseTreeListener listener) {
      if ( listener instanceof HeaderListener ) ((HeaderListener)listener).enterComposer(this);
    }
    @Override
    public void exitRule(ParseTreeListener listener) {
      if ( listener instanceof HeaderListener ) ((HeaderListener)listener).exitComposer(this);
    }
  }

  public final ComposerContext composer() throws RecognitionException {
    ComposerContext _localctx = new ComposerContext(_ctx, getState());
    enterRule(_localctx, 10, RULE_composer);
    int _la;
    try {
      enterOuterAlt(_localctx, 1);
      {
      setState(73);
      match(T__2);
      setState(75); 
      _errHandler.sync(this);
      _la = _input.LA(1);
      do {
        {
        {
        setState(74);
        text();
        }
        }
        setState(77); 
        _errHandler.sync(this);
        _la = _input.LA(1);
      } while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << NOTE) | (1L << SYMBOLS) | (1L << LETTERS) | (1L << KEYACCIDENTAL) | (1L << MINOR) | (1L << DIGIT))) != 0) );
      setState(79);
      match(NEWLINE);
      }
    }
    catch (RecognitionException re) {
      _localctx.exception = re;
      _errHandler.reportError(this, re);
      _errHandler.recover(this, re);
    }
    finally {
      exitRule();
    }
    return _localctx;
  }

  public static class LengthContext extends ParserRuleContext {
    public TerminalNode NEWLINE() { return getToken(HeaderParser.NEWLINE, 0); }
    public List<TerminalNode> DIGIT() { return getTokens(HeaderParser.DIGIT); }
    public TerminalNode DIGIT(int i) {
      return getToken(HeaderParser.DIGIT, i);
    }
    public LengthContext(ParserRuleContext parent, int invokingState) {
      super(parent, invokingState);
    }
    @Override public int getRuleIndex() { return RULE_length; }
    @Override
    public void enterRule(ParseTreeListener listener) {
      if ( listener instanceof HeaderListener ) ((HeaderListener)listener).enterLength(this);
    }
    @Override
    public void exitRule(ParseTreeListener listener) {
      if ( listener instanceof HeaderListener ) ((HeaderListener)listener).exitLength(this);
    }
  }

  public final LengthContext length() throws RecognitionException {
    LengthContext _localctx = new LengthContext(_ctx, getState());
    enterRule(_localctx, 12, RULE_length);
    int _la;
    try {
      enterOuterAlt(_localctx, 1);
      {
      setState(81);
      match(T__3);
      setState(83); 
      _errHandler.sync(this);
      _la = _input.LA(1);
      do {
        {
        {
        setState(82);
        match(DIGIT);
        }
        }
        setState(85); 
        _errHandler.sync(this);
        _la = _input.LA(1);
      } while ( _la==DIGIT );
      setState(87);
      match(T__4);
      setState(89); 
      _errHandler.sync(this);
      _la = _input.LA(1);
      do {
        {
        {
        setState(88);
        match(DIGIT);
        }
        }
        setState(91); 
        _errHandler.sync(this);
        _la = _input.LA(1);
      } while ( _la==DIGIT );
      setState(93);
      match(NEWLINE);
      }
    }
    catch (RecognitionException re) {
      _localctx.exception = re;
      _errHandler.reportError(this, re);
      _errHandler.recover(this, re);
    }
    finally {
      exitRule();
    }
    return _localctx;
  }

  public static class TempoContext extends ParserRuleContext {
    public TerminalNode NEWLINE() { return getToken(HeaderParser.NEWLINE, 0); }
    public List<TerminalNode> DIGIT() { return getTokens(HeaderParser.DIGIT); }
    public TerminalNode DIGIT(int i) {
      return getToken(HeaderParser.DIGIT, i);
    }
    public TempoContext(ParserRuleContext parent, int invokingState) {
      super(parent, invokingState);
    }
    @Override public int getRuleIndex() { return RULE_tempo; }
    @Override
    public void enterRule(ParseTreeListener listener) {
      if ( listener instanceof HeaderListener ) ((HeaderListener)listener).enterTempo(this);
    }
    @Override
    public void exitRule(ParseTreeListener listener) {
      if ( listener instanceof HeaderListener ) ((HeaderListener)listener).exitTempo(this);
    }
  }

  public final TempoContext tempo() throws RecognitionException {
    TempoContext _localctx = new TempoContext(_ctx, getState());
    enterRule(_localctx, 14, RULE_tempo);
    int _la;
    try {
      enterOuterAlt(_localctx, 1);
      {
      setState(95);
      match(T__5);
      {
      setState(97); 
      _errHandler.sync(this);
      _la = _input.LA(1);
      do {
        {
        {
        setState(96);
        match(DIGIT);
        }
        }
        setState(99); 
        _errHandler.sync(this);
        _la = _input.LA(1);
      } while ( _la==DIGIT );
      setState(101);
      match(T__4);
      setState(103); 
      _errHandler.sync(this);
      _la = _input.LA(1);
      do {
        {
        {
        setState(102);
        match(DIGIT);
        }
        }
        setState(105); 
        _errHandler.sync(this);
        _la = _input.LA(1);
      } while ( _la==DIGIT );
      }
      setState(107);
      match(T__6);
      setState(109); 
      _errHandler.sync(this);
      _la = _input.LA(1);
      do {
        {
        {
        setState(108);
        match(DIGIT);
        }
        }
        setState(111); 
        _errHandler.sync(this);
        _la = _input.LA(1);
      } while ( _la==DIGIT );
      setState(113);
      match(NEWLINE);
      }
    }
    catch (RecognitionException re) {
      _localctx.exception = re;
      _errHandler.reportError(this, re);
      _errHandler.recover(this, re);
    }
    finally {
      exitRule();
    }
    return _localctx;
  }

  public static class MeterContext extends ParserRuleContext {
    public TerminalNode NEWLINE() { return getToken(HeaderParser.NEWLINE, 0); }
    public List<TerminalNode> DIGIT() { return getTokens(HeaderParser.DIGIT); }
    public TerminalNode DIGIT(int i) {
      return getToken(HeaderParser.DIGIT, i);
    }
    public MeterContext(ParserRuleContext parent, int invokingState) {
      super(parent, invokingState);
    }
    @Override public int getRuleIndex() { return RULE_meter; }
    @Override
    public void enterRule(ParseTreeListener listener) {
      if ( listener instanceof HeaderListener ) ((HeaderListener)listener).enterMeter(this);
    }
    @Override
    public void exitRule(ParseTreeListener listener) {
      if ( listener instanceof HeaderListener ) ((HeaderListener)listener).exitMeter(this);
    }
  }

  public final MeterContext meter() throws RecognitionException {
    MeterContext _localctx = new MeterContext(_ctx, getState());
    enterRule(_localctx, 16, RULE_meter);
    int _la;
    try {
      enterOuterAlt(_localctx, 1);
      {
      setState(115);
      match(T__7);
      setState(129);
      switch (_input.LA(1)) {
      case DIGIT:
        {
        {
        setState(117); 
        _errHandler.sync(this);
        _la = _input.LA(1);
        do {
          {
          {
          setState(116);
          match(DIGIT);
          }
          }
          setState(119); 
          _errHandler.sync(this);
          _la = _input.LA(1);
        } while ( _la==DIGIT );
        setState(121);
        match(T__4);
        setState(123); 
        _errHandler.sync(this);
        _la = _input.LA(1);
        do {
          {
          {
          setState(122);
          match(DIGIT);
          }
          }
          setState(125); 
          _errHandler.sync(this);
          _la = _input.LA(1);
        } while ( _la==DIGIT );
        }
        }
        break;
      case T__8:
        {
        setState(127);
        match(T__8);
        }
        break;
      case T__9:
        {
        setState(128);
        match(T__9);
        }
        break;
      default:
        throw new NoViableAltException(this);
      }
      setState(131);
      match(NEWLINE);
      }
    }
    catch (RecognitionException re) {
      _localctx.exception = re;
      _errHandler.reportError(this, re);
      _errHandler.recover(this, re);
    }
    finally {
      exitRule();
    }
    return _localctx;
  }

  public static class VoiceContext extends ParserRuleContext {
    public TerminalNode NEWLINE() { return getToken(HeaderParser.NEWLINE, 0); }
    public List<TextContext> text() {
      return getRuleContexts(TextContext.class);
    }
    public TextContext text(int i) {
      return getRuleContext(TextContext.class,i);
    }
    public VoiceContext(ParserRuleContext parent, int invokingState) {
      super(parent, invokingState);
    }
    @Override public int getRuleIndex() { return RULE_voice; }
    @Override
    public void enterRule(ParseTreeListener listener) {
      if ( listener instanceof HeaderListener ) ((HeaderListener)listener).enterVoice(this);
    }
    @Override
    public void exitRule(ParseTreeListener listener) {
      if ( listener instanceof HeaderListener ) ((HeaderListener)listener).exitVoice(this);
    }
  }

  public final VoiceContext voice() throws RecognitionException {
    VoiceContext _localctx = new VoiceContext(_ctx, getState());
    enterRule(_localctx, 18, RULE_voice);
    int _la;
    try {
      enterOuterAlt(_localctx, 1);
      {
      setState(133);
      match(T__10);
      setState(135); 
      _errHandler.sync(this);
      _la = _input.LA(1);
      do {
        {
        {
        setState(134);
        text();
        }
        }
        setState(137); 
        _errHandler.sync(this);
        _la = _input.LA(1);
      } while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << NOTE) | (1L << SYMBOLS) | (1L << LETTERS) | (1L << KEYACCIDENTAL) | (1L << MINOR) | (1L << DIGIT))) != 0) );
      setState(139);
      match(NEWLINE);
      }
    }
    catch (RecognitionException re) {
      _localctx.exception = re;
      _errHandler.reportError(this, re);
      _errHandler.recover(this, re);
    }
    finally {
      exitRule();
    }
    return _localctx;
  }

  public static class KeyContext extends ParserRuleContext {
    public TerminalNode NOTE() { return getToken(HeaderParser.NOTE, 0); }
    public TerminalNode NEWLINE() { return getToken(HeaderParser.NEWLINE, 0); }
    public TerminalNode KEYACCIDENTAL() { return getToken(HeaderParser.KEYACCIDENTAL, 0); }
    public TerminalNode MINOR() { return getToken(HeaderParser.MINOR, 0); }
    public KeyContext(ParserRuleContext parent, int invokingState) {
      super(parent, invokingState);
    }
    @Override public int getRuleIndex() { return RULE_key; }
    @Override
    public void enterRule(ParseTreeListener listener) {
      if ( listener instanceof HeaderListener ) ((HeaderListener)listener).enterKey(this);
    }
    @Override
    public void exitRule(ParseTreeListener listener) {
      if ( listener instanceof HeaderListener ) ((HeaderListener)listener).exitKey(this);
    }
  }

  public final KeyContext key() throws RecognitionException {
    KeyContext _localctx = new KeyContext(_ctx, getState());
    enterRule(_localctx, 20, RULE_key);
    int _la;
    try {
      enterOuterAlt(_localctx, 1);
      {
      setState(141);
      match(T__11);
      setState(142);
      match(NOTE);
      setState(144);
      _la = _input.LA(1);
      if (_la==KEYACCIDENTAL) {
        {
        setState(143);
        match(KEYACCIDENTAL);
        }
      }

      setState(147);
      _la = _input.LA(1);
      if (_la==MINOR) {
        {
        setState(146);
        match(MINOR);
        }
      }

      setState(149);
      match(NEWLINE);
      }
    }
    catch (RecognitionException re) {
      _localctx.exception = re;
      _errHandler.reportError(this, re);
      _errHandler.recover(this, re);
    }
    finally {
      exitRule();
    }
    return _localctx;
  }

  public static class CommentContext extends ParserRuleContext {
    public TerminalNode NEWLINE() { return getToken(HeaderParser.NEWLINE, 0); }
    public List<TextContext> text() {
      return getRuleContexts(TextContext.class);
    }
    public TextContext text(int i) {
      return getRuleContext(TextContext.class,i);
    }
    public CommentContext(ParserRuleContext parent, int invokingState) {
      super(parent, invokingState);
    }
    @Override public int getRuleIndex() { return RULE_comment; }
    @Override
    public void enterRule(ParseTreeListener listener) {
      if ( listener instanceof HeaderListener ) ((HeaderListener)listener).enterComment(this);
    }
    @Override
    public void exitRule(ParseTreeListener listener) {
      if ( listener instanceof HeaderListener ) ((HeaderListener)listener).exitComment(this);
    }
  }

  public final CommentContext comment() throws RecognitionException {
    CommentContext _localctx = new CommentContext(_ctx, getState());
    enterRule(_localctx, 22, RULE_comment);
    int _la;
    try {
      enterOuterAlt(_localctx, 1);
      {
      setState(151);
      match(T__12);
      setState(153); 
      _errHandler.sync(this);
      _la = _input.LA(1);
      do {
        {
        {
        setState(152);
        text();
        }
        }
        setState(155); 
        _errHandler.sync(this);
        _la = _input.LA(1);
      } while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << NOTE) | (1L << SYMBOLS) | (1L << LETTERS) | (1L << KEYACCIDENTAL) | (1L << MINOR) | (1L << DIGIT))) != 0) );
      setState(157);
      match(NEWLINE);
      }
    }
    catch (RecognitionException re) {
      _localctx.exception = re;
      _errHandler.reportError(this, re);
      _errHandler.recover(this, re);
    }
    finally {
      exitRule();
    }
    return _localctx;
  }

  public static class TextContext extends ParserRuleContext {
    public TerminalNode DIGIT() { return getToken(HeaderParser.DIGIT, 0); }
    public TerminalNode NOTE() { return getToken(HeaderParser.NOTE, 0); }
    public TerminalNode MINOR() { return getToken(HeaderParser.MINOR, 0); }
    public TerminalNode KEYACCIDENTAL() { return getToken(HeaderParser.KEYACCIDENTAL, 0); }
    public TerminalNode LETTERS() { return getToken(HeaderParser.LETTERS, 0); }
    public TerminalNode SYMBOLS() { return getToken(HeaderParser.SYMBOLS, 0); }
    public TextContext(ParserRuleContext parent, int invokingState) {
      super(parent, invokingState);
    }
    @Override public int getRuleIndex() { return RULE_text; }
    @Override
    public void enterRule(ParseTreeListener listener) {
      if ( listener instanceof HeaderListener ) ((HeaderListener)listener).enterText(this);
    }
    @Override
    public void exitRule(ParseTreeListener listener) {
      if ( listener instanceof HeaderListener ) ((HeaderListener)listener).exitText(this);
    }
  }

  public final TextContext text() throws RecognitionException {
    TextContext _localctx = new TextContext(_ctx, getState());
    enterRule(_localctx, 24, RULE_text);
    int _la;
    try {
      enterOuterAlt(_localctx, 1);
      {
      setState(159);
      _la = _input.LA(1);
      if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << NOTE) | (1L << SYMBOLS) | (1L << LETTERS) | (1L << KEYACCIDENTAL) | (1L << MINOR) | (1L << DIGIT))) != 0)) ) {
      _errHandler.recoverInline(this);
      } else {
        consume();
      }
      }
    }
    catch (RecognitionException re) {
      _localctx.exception = re;
      _errHandler.reportError(this, re);
      _errHandler.recover(this, re);
    }
    finally {
      exitRule();
    }
    return _localctx;
  }

  public static final String _serializedATN =
    "\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3\27\u00a4\4\2\t"+
      "\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n"+
      "\4\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\3\2\3\2\3\2\3\3\3\3\7\3\"\n\3"+
      "\f\3\16\3%\13\3\3\3\3\3\7\3)\n\3\f\3\16\3,\13\3\3\3\3\3\3\4\3\4\6"+
      "\4\62\n\4\r\4\16\4\63\3\4\3\4\3\5\3\5\6\5:\n\5\r\5\16\5;\3\5\3\5\3"+
      "\6\3\6\3\6\3\6\3\6\6\6E\n\6\r\6\16\6F\3\6\5\6J\n\6\3\7\3\7\6\7N\n"+
      "\7\r\7\16\7O\3\7\3\7\3\b\3\b\6\bV\n\b\r\b\16\bW\3\b\3\b\6\b\\\n\b"+
      "\r\b\16\b]\3\b\3\b\3\t\3\t\6\td\n\t\r\t\16\te\3\t\3\t\6\tj\n\t\r\t"+
      "\16\tk\3\t\3\t\6\tp\n\t\r\t\16\tq\3\t\3\t\3\n\3\n\6\nx\n\n\r\n\16"+
      "\ny\3\n\3\n\6\n~\n\n\r\n\16\n\177\3\n\3\n\5\n\u0084\n\n\3\n\3\n\3"+
      "\13\3\13\6\13\u008a\n\13\r\13\16\13\u008b\3\13\3\13\3\f\3\f\3\f\5"+
      "\f\u0093\n\f\3\f\5\f\u0096\n\f\3\f\3\f\3\r\3\r\6\r\u009c\n\r\r\r\16"+
      "\r\u009d\3\r\3\r\3\16\3\16\3\16\2\2\17\2\4\6\b\n\f\16\20\22\24\26"+
      "\30\32\2\3\4\2\20\24\26\26\u00ae\2\34\3\2\2\2\4\37\3\2\2\2\6/\3\2"+
      "\2\2\b\67\3\2\2\2\nI\3\2\2\2\fK\3\2\2\2\16S\3\2\2\2\20a\3\2\2\2\22"+
      "u\3\2\2\2\24\u0087\3\2\2\2\26\u008f\3\2\2\2\30\u0099\3\2\2\2\32\u00a1"+
      "\3\2\2\2\34\35\5\4\3\2\35\36\7\2\2\3\36\3\3\2\2\2\37#\5\6\4\2 \"\5"+
      "\30\r\2! \3\2\2\2\"%\3\2\2\2#!\3\2\2\2#$\3\2\2\2$&\3\2\2\2%#\3\2\2"+
      "\2&*\5\b\5\2\')\5\n\6\2(\'\3\2\2\2),\3\2\2\2*(\3\2\2\2*+\3\2\2\2+"+
      "-\3\2\2\2,*\3\2\2\2-.\5\26\f\2.\5\3\2\2\2/\61\7\3\2\2\60\62\7\26\2"+
      "\2\61\60\3\2\2\2\62\63\3\2\2\2\63\61\3\2\2\2\63\64\3\2\2\2\64\65\3"+
      "\2\2\2\65\66\7\25\2\2\66\7\3\2\2\2\679\7\4\2\28:\5\32\16\298\3\2\2"+
      "\2:;\3\2\2\2;9\3\2\2\2;<\3\2\2\2<=\3\2\2\2=>\7\25\2\2>\t\3\2\2\2?"+
      "J\5\f\7\2@J\5\16\b\2AJ\5\22\n\2BJ\5\20\t\2CE\5\24\13\2DC\3\2\2\2E"+
      "F\3\2\2\2FD\3\2\2\2FG\3\2\2\2GJ\3\2\2\2HJ\5\30\r\2I?\3\2\2\2I@\3\2"+
      "\2\2IA\3\2\2\2IB\3\2\2\2ID\3\2\2\2IH\3\2\2\2J\13\3\2\2\2KM\7\5\2\2"+
      "LN\5\32\16\2ML\3\2\2\2NO\3\2\2\2OM\3\2\2\2OP\3\2\2\2PQ\3\2\2\2QR\7"+
      "\25\2\2R\r\3\2\2\2SU\7\6\2\2TV\7\26\2\2UT\3\2\2\2VW\3\2\2\2WU\3\2"+
      "\2\2WX\3\2\2\2XY\3\2\2\2Y[\7\7\2\2Z\\\7\26\2\2[Z\3\2\2\2\\]\3\2\2"+
      "\2][\3\2\2\2]^\3\2\2\2^_\3\2\2\2_`\7\25\2\2`\17\3\2\2\2ac\7\b\2\2"+
      "bd\7\26\2\2cb\3\2\2\2de\3\2\2\2ec\3\2\2\2ef\3\2\2\2fg\3\2\2\2gi\7"+
      "\7\2\2hj\7\26\2\2ih\3\2\2\2jk\3\2\2\2ki\3\2\2\2kl\3\2\2\2lm\3\2\2"+
      "\2mo\7\t\2\2np\7\26\2\2on\3\2\2\2pq\3\2\2\2qo\3\2\2\2qr\3\2\2\2rs"+
      "\3\2\2\2st\7\25\2\2t\21\3\2\2\2u\u0083\7\n\2\2vx\7\26\2\2wv\3\2\2"+
      "\2xy\3\2\2\2yw\3\2\2\2yz\3\2\2\2z{\3\2\2\2{}\7\7\2\2|~\7\26\2\2}|"+
      "\3\2\2\2~\177\3\2\2\2\177}\3\2\2\2\177\u0080\3\2\2\2\u0080\u0084\3"+
      "\2\2\2\u0081\u0084\7\13\2\2\u0082\u0084\7\f\2\2\u0083w\3\2\2\2\u0083"+
      "\u0081\3\2\2\2\u0083\u0082\3\2\2\2\u0084\u0085\3\2\2\2\u0085\u0086"+
      "\7\25\2\2\u0086\23\3\2\2\2\u0087\u0089\7\r\2\2\u0088\u008a\5\32\16"+
      "\2\u0089\u0088\3\2\2\2\u008a\u008b\3\2\2\2\u008b\u0089\3\2\2\2\u008b"+
      "\u008c\3\2\2\2\u008c\u008d\3\2\2\2\u008d\u008e\7\25\2\2\u008e\25\3"+
      "\2\2\2\u008f\u0090\7\16\2\2\u0090\u0092\7\20\2\2\u0091\u0093\7\23"+
      "\2\2\u0092\u0091\3\2\2\2\u0092\u0093\3\2\2\2\u0093\u0095\3\2\2\2\u0094"+
      "\u0096\7\24\2\2\u0095\u0094\3\2\2\2\u0095\u0096\3\2\2\2\u0096\u0097"+
      "\3\2\2\2\u0097\u0098\7\25\2\2\u0098\27\3\2\2\2\u0099\u009b\7\17\2"+
      "\2\u009a\u009c\5\32\16\2\u009b\u009a\3\2\2\2\u009c\u009d\3\2\2\2\u009d"+
      "\u009b\3\2\2\2\u009d\u009e\3\2\2\2\u009e\u009f\3\2\2\2\u009f\u00a0"+
      "\7\25\2\2\u00a0\31\3\2\2\2\u00a1\u00a2\t\2\2\2\u00a2\33\3\2\2\2\25"+
      "#*\63;FIOW]ekqy\177\u0083\u008b\u0092\u0095\u009d";
  public static final ATN _ATN =
    new ATNDeserializer().deserialize(_serializedATN.toCharArray());
  static {
    _decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
    for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
      _decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
    }
  }
}