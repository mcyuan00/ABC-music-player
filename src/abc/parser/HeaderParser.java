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
    T__9=10, T__10=11, T__11=12, T__12=13, OTHER=14, NOTE=15, KEYACCIDENTAL=16, 
    MINOR=17, NEWLINE=18, DIGIT=19, WHITESPACE=20;
  public static final int
    RULE_root = 0, RULE_header = 1, RULE_index = 2, RULE_title = 3, RULE_otherfields = 4, 
    RULE_composer = 5, RULE_meter = 6, RULE_length = 7, RULE_tempo = 8, 
    RULE_voice = 9, RULE_key = 10, RULE_comment = 11, RULE_text = 12;
  public static final String[] ruleNames = {
    "root", "header", "index", "title", "otherfields", "composer", "meter", 
    "length", "tempo", "voice", "key", "comment", "text"
  };

  private static final String[] _LITERAL_NAMES = {
    null, "'X:'", "'T:'", "'C:'", "'M:'", "'/'", "'C'", "'C|'", "'L:'", 
    "'Q:'", "'='", "'V:'", "'K:'", "'%'", null, null, null, "'m'"
  };
  private static final String[] _SYMBOLIC_NAMES = {
    null, null, null, null, null, null, null, null, null, null, null, null, 
    null, null, "OTHER", "NOTE", "KEYACCIDENTAL", "MINOR", "NEWLINE", "DIGIT", 
    "WHITESPACE"
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
      while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__2) | (1L << T__3) | (1L << T__5) | (1L << T__6) | (1L << T__7) | (1L << T__8) | (1L << T__10) | (1L << T__12))) != 0)) {
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
      } while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << OTHER) | (1L << NOTE) | (1L << KEYACCIDENTAL) | (1L << MINOR) | (1L << DIGIT))) != 0) );
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
    public VoiceContext voice() {
      return getRuleContext(VoiceContext.class,0);
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
      setState(67);
      switch (_input.LA(1)) {
      case T__2:
        enterOuterAlt(_localctx, 1);
        {
        setState(61);
        composer();
        }
        break;
      case T__7:
        enterOuterAlt(_localctx, 2);
        {
        setState(62);
        length();
        }
        break;
      case T__3:
      case T__5:
      case T__6:
        enterOuterAlt(_localctx, 3);
        {
        setState(63);
        meter();
        }
        break;
      case T__8:
        enterOuterAlt(_localctx, 4);
        {
        setState(64);
        tempo();
        }
        break;
      case T__10:
        enterOuterAlt(_localctx, 5);
        {
        setState(65);
        voice();
        }
        break;
      case T__12:
        enterOuterAlt(_localctx, 6);
        {
        setState(66);
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
      setState(69);
      match(T__2);
      setState(71); 
      _errHandler.sync(this);
      _la = _input.LA(1);
      do {
        {
        {
        setState(70);
        text();
        }
        }
        setState(73); 
        _errHandler.sync(this);
        _la = _input.LA(1);
      } while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << OTHER) | (1L << NOTE) | (1L << KEYACCIDENTAL) | (1L << MINOR) | (1L << DIGIT))) != 0) );
      setState(75);
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
    public List<TerminalNode> DIGIT() { return getTokens(HeaderParser.DIGIT); }
    public TerminalNode DIGIT(int i) {
      return getToken(HeaderParser.DIGIT, i);
    }
    public TerminalNode NEWLINE() { return getToken(HeaderParser.NEWLINE, 0); }
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
    enterRule(_localctx, 12, RULE_meter);
    int _la;
    try {
      setState(92);
      switch (_input.LA(1)) {
      case T__3:
        enterOuterAlt(_localctx, 1);
        {
        setState(77);
        match(T__3);
        {
        setState(79); 
        _errHandler.sync(this);
        _la = _input.LA(1);
        do {
          {
          {
          setState(78);
          match(DIGIT);
          }
          }
          setState(81); 
          _errHandler.sync(this);
          _la = _input.LA(1);
        } while ( _la==DIGIT );
        setState(83);
        match(T__4);
        setState(85); 
        _errHandler.sync(this);
        _la = _input.LA(1);
        do {
          {
          {
          setState(84);
          match(DIGIT);
          }
          }
          setState(87); 
          _errHandler.sync(this);
          _la = _input.LA(1);
        } while ( _la==DIGIT );
        }
        }
        break;
      case T__5:
        enterOuterAlt(_localctx, 2);
        {
        setState(89);
        match(T__5);
        }
        break;
      case T__6:
        enterOuterAlt(_localctx, 3);
        {
        setState(90);
        match(T__6);
        setState(91);
        match(NEWLINE);
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
    enterRule(_localctx, 14, RULE_length);
    int _la;
    try {
      enterOuterAlt(_localctx, 1);
      {
      setState(94);
      match(T__7);
      setState(96); 
      _errHandler.sync(this);
      _la = _input.LA(1);
      do {
        {
        {
        setState(95);
        match(DIGIT);
        }
        }
        setState(98); 
        _errHandler.sync(this);
        _la = _input.LA(1);
      } while ( _la==DIGIT );
      setState(100);
      match(T__4);
      setState(102); 
      _errHandler.sync(this);
      _la = _input.LA(1);
      do {
        {
        {
        setState(101);
        match(DIGIT);
        }
        }
        setState(104); 
        _errHandler.sync(this);
        _la = _input.LA(1);
      } while ( _la==DIGIT );
      setState(106);
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
    enterRule(_localctx, 16, RULE_tempo);
    int _la;
    try {
      enterOuterAlt(_localctx, 1);
      {
      setState(108);
      match(T__8);
      {
      setState(110); 
      _errHandler.sync(this);
      _la = _input.LA(1);
      do {
        {
        {
        setState(109);
        match(DIGIT);
        }
        }
        setState(112); 
        _errHandler.sync(this);
        _la = _input.LA(1);
      } while ( _la==DIGIT );
      setState(114);
      match(T__4);
      setState(116); 
      _errHandler.sync(this);
      _la = _input.LA(1);
      do {
        {
        {
        setState(115);
        match(DIGIT);
        }
        }
        setState(118); 
        _errHandler.sync(this);
        _la = _input.LA(1);
      } while ( _la==DIGIT );
      }
      setState(120);
      match(T__9);
      setState(122); 
      _errHandler.sync(this);
      _la = _input.LA(1);
      do {
        {
        {
        setState(121);
        match(DIGIT);
        }
        }
        setState(124); 
        _errHandler.sync(this);
        _la = _input.LA(1);
      } while ( _la==DIGIT );
      setState(126);
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
      setState(128);
      match(T__10);
      setState(130); 
      _errHandler.sync(this);
      _la = _input.LA(1);
      do {
        {
        {
        setState(129);
        text();
        }
        }
        setState(132); 
        _errHandler.sync(this);
        _la = _input.LA(1);
      } while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << OTHER) | (1L << NOTE) | (1L << KEYACCIDENTAL) | (1L << MINOR) | (1L << DIGIT))) != 0) );
      setState(134);
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
      setState(136);
      match(T__11);
      setState(137);
      match(NOTE);
      setState(139);
      _la = _input.LA(1);
      if (_la==KEYACCIDENTAL) {
        {
        setState(138);
        match(KEYACCIDENTAL);
        }
      }

      setState(142);
      _la = _input.LA(1);
      if (_la==MINOR) {
        {
        setState(141);
        match(MINOR);
        }
      }

      setState(144);
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
      setState(146);
      match(T__12);
      setState(148); 
      _errHandler.sync(this);
      _la = _input.LA(1);
      do {
        {
        {
        setState(147);
        text();
        }
        }
        setState(150); 
        _errHandler.sync(this);
        _la = _input.LA(1);
      } while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << OTHER) | (1L << NOTE) | (1L << KEYACCIDENTAL) | (1L << MINOR) | (1L << DIGIT))) != 0) );
      setState(152);
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
    public TerminalNode OTHER() { return getToken(HeaderParser.OTHER, 0); }
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
      setState(154);
      _la = _input.LA(1);
      if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << OTHER) | (1L << NOTE) | (1L << KEYACCIDENTAL) | (1L << MINOR) | (1L << DIGIT))) != 0)) ) {
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
    "\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3\26\u009f\4\2\t"+
      "\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n"+
      "\4\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\3\2\3\2\3\2\3\3\3\3\7\3\"\n\3"+
      "\f\3\16\3%\13\3\3\3\3\3\7\3)\n\3\f\3\16\3,\13\3\3\3\3\3\3\4\3\4\6"+
      "\4\62\n\4\r\4\16\4\63\3\4\3\4\3\5\3\5\6\5:\n\5\r\5\16\5;\3\5\3\5\3"+
      "\6\3\6\3\6\3\6\3\6\3\6\5\6F\n\6\3\7\3\7\6\7J\n\7\r\7\16\7K\3\7\3\7"+
      "\3\b\3\b\6\bR\n\b\r\b\16\bS\3\b\3\b\6\bX\n\b\r\b\16\bY\3\b\3\b\3\b"+
      "\5\b_\n\b\3\t\3\t\6\tc\n\t\r\t\16\td\3\t\3\t\6\ti\n\t\r\t\16\tj\3"+
      "\t\3\t\3\n\3\n\6\nq\n\n\r\n\16\nr\3\n\3\n\6\nw\n\n\r\n\16\nx\3\n\3"+
      "\n\6\n}\n\n\r\n\16\n~\3\n\3\n\3\13\3\13\6\13\u0085\n\13\r\13\16\13"+
      "\u0086\3\13\3\13\3\f\3\f\3\f\5\f\u008e\n\f\3\f\5\f\u0091\n\f\3\f\3"+
      "\f\3\r\3\r\6\r\u0097\n\r\r\r\16\r\u0098\3\r\3\r\3\16\3\16\3\16\2\2"+
      "\17\2\4\6\b\n\f\16\20\22\24\26\30\32\2\3\4\2\20\23\25\25\u00a8\2\34"+
      "\3\2\2\2\4\37\3\2\2\2\6/\3\2\2\2\b\67\3\2\2\2\nE\3\2\2\2\fG\3\2\2"+
      "\2\16^\3\2\2\2\20`\3\2\2\2\22n\3\2\2\2\24\u0082\3\2\2\2\26\u008a\3"+
      "\2\2\2\30\u0094\3\2\2\2\32\u009c\3\2\2\2\34\35\5\4\3\2\35\36\7\2\2"+
      "\3\36\3\3\2\2\2\37#\5\6\4\2 \"\5\30\r\2! \3\2\2\2\"%\3\2\2\2#!\3\2"+
      "\2\2#$\3\2\2\2$&\3\2\2\2%#\3\2\2\2&*\5\b\5\2\')\5\n\6\2(\'\3\2\2\2"+
      "),\3\2\2\2*(\3\2\2\2*+\3\2\2\2+-\3\2\2\2,*\3\2\2\2-.\5\26\f\2.\5\3"+
      "\2\2\2/\61\7\3\2\2\60\62\7\25\2\2\61\60\3\2\2\2\62\63\3\2\2\2\63\61"+
      "\3\2\2\2\63\64\3\2\2\2\64\65\3\2\2\2\65\66\7\24\2\2\66\7\3\2\2\2\67"+
      "9\7\4\2\28:\5\32\16\298\3\2\2\2:;\3\2\2\2;9\3\2\2\2;<\3\2\2\2<=\3"+
      "\2\2\2=>\7\24\2\2>\t\3\2\2\2?F\5\f\7\2@F\5\20\t\2AF\5\16\b\2BF\5\22"+
      "\n\2CF\5\24\13\2DF\5\30\r\2E?\3\2\2\2E@\3\2\2\2EA\3\2\2\2EB\3\2\2"+
      "\2EC\3\2\2\2ED\3\2\2\2F\13\3\2\2\2GI\7\5\2\2HJ\5\32\16\2IH\3\2\2\2"+
      "JK\3\2\2\2KI\3\2\2\2KL\3\2\2\2LM\3\2\2\2MN\7\24\2\2N\r\3\2\2\2OQ\7"+
      "\6\2\2PR\7\25\2\2QP\3\2\2\2RS\3\2\2\2SQ\3\2\2\2ST\3\2\2\2TU\3\2\2"+
      "\2UW\7\7\2\2VX\7\25\2\2WV\3\2\2\2XY\3\2\2\2YW\3\2\2\2YZ\3\2\2\2Z_"+
      "\3\2\2\2[_\7\b\2\2\\]\7\t\2\2]_\7\24\2\2^O\3\2\2\2^[\3\2\2\2^\\\3"+
      "\2\2\2_\17\3\2\2\2`b\7\n\2\2ac\7\25\2\2ba\3\2\2\2cd\3\2\2\2db\3\2"+
      "\2\2de\3\2\2\2ef\3\2\2\2fh\7\7\2\2gi\7\25\2\2hg\3\2\2\2ij\3\2\2\2"+
      "jh\3\2\2\2jk\3\2\2\2kl\3\2\2\2lm\7\24\2\2m\21\3\2\2\2np\7\13\2\2o"+
      "q\7\25\2\2po\3\2\2\2qr\3\2\2\2rp\3\2\2\2rs\3\2\2\2st\3\2\2\2tv\7\7"+
      "\2\2uw\7\25\2\2vu\3\2\2\2wx\3\2\2\2xv\3\2\2\2xy\3\2\2\2yz\3\2\2\2"+
      "z|\7\f\2\2{}\7\25\2\2|{\3\2\2\2}~\3\2\2\2~|\3\2\2\2~\177\3\2\2\2\177"+
      "\u0080\3\2\2\2\u0080\u0081\7\24\2\2\u0081\23\3\2\2\2\u0082\u0084\7"+
      "\r\2\2\u0083\u0085\5\32\16\2\u0084\u0083\3\2\2\2\u0085\u0086\3\2\2"+
      "\2\u0086\u0084\3\2\2\2\u0086\u0087\3\2\2\2\u0087\u0088\3\2\2\2\u0088"+
      "\u0089\7\24\2\2\u0089\25\3\2\2\2\u008a\u008b\7\16\2\2\u008b\u008d"+
      "\7\21\2\2\u008c\u008e\7\22\2\2\u008d\u008c\3\2\2\2\u008d\u008e\3\2"+
      "\2\2\u008e\u0090\3\2\2\2\u008f\u0091\7\23\2\2\u0090\u008f\3\2\2\2"+
      "\u0090\u0091\3\2\2\2\u0091\u0092\3\2\2\2\u0092\u0093\7\24\2\2\u0093"+
      "\27\3\2\2\2\u0094\u0096\7\17\2\2\u0095\u0097\5\32\16\2\u0096\u0095"+
      "\3\2\2\2\u0097\u0098\3\2\2\2\u0098\u0096\3\2\2\2\u0098\u0099\3\2\2"+
      "\2\u0099\u009a\3\2\2\2\u009a\u009b\7\24\2\2\u009b\31\3\2\2\2\u009c"+
      "\u009d\t\2\2\2\u009d\33\3\2\2\2\24#*\63;EKSY^djrx~\u0086\u008d\u0090"+
      "\u0098";
  public static final ATN _ATN =
    new ATNDeserializer().deserialize(_serializedATN.toCharArray());
  static {
    _decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
    for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
      _decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
    }
  }
}