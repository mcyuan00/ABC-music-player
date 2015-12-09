// Generated from Music.g4 by ANTLR 4.5.1

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
public class MusicParser extends Parser {
  static { RuntimeMetaData.checkVersion("4.5.1", RuntimeMetaData.VERSION); }

  protected static final DFA[] _decisionToDFA;
  protected static final PredictionContextCache _sharedContextCache =
    new PredictionContextCache();
  public static final int
    T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
    T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, ACCIDENTAL=16, 
    OCTAVE=17, SYMBOLS=18, LETTERS=19, NTHREPEAT=20, NOTELETTER=21, NEWLINE=22, 
    WHITESPACE=23, DIGIT=24;
  public static final int
    RULE_root = 0, RULE_music = 1, RULE_measure = 2, RULE_firstendingmeasure = 3, 
    RULE_secondendingmeasure = 4, RULE_normalmeasure = 5, RULE_doublebarmeasure = 6, 
    RULE_startrepeatmeasure = 7, RULE_endrepeatmeasure = 8, RULE_singlerepeatmeasure = 9, 
    RULE_element = 10, RULE_noteelement = 11, RULE_chord = 12, RULE_note = 13, 
    RULE_pitch = 14, RULE_rest = 15, RULE_notelength = 16, RULE_tupletelement = 17, 
    RULE_tupletspec = 18, RULE_comment = 19, RULE_text = 20;
  public static final String[] ruleNames = {
    "root", "music", "measure", "firstendingmeasure", "secondendingmeasure", 
    "normalmeasure", "doublebarmeasure", "startrepeatmeasure", "endrepeatmeasure", 
    "singlerepeatmeasure", "element", "noteelement", "chord", "note", "pitch", 
    "rest", "notelength", "tupletelement", "tupletspec", "comment", "text"
  };

  private static final String[] _LITERAL_NAMES = {
    null, "'[1'", "'[2'", "'|'", "'||'", "'[|'", "'|]'", "'|:'", "':|'", 
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

  @Override
  public String getGrammarFileName() { return "Music.g4"; }

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

  public MusicParser(TokenStream input) {
    super(input);
    _interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
  }
  public static class RootContext extends ParserRuleContext {
    public MusicContext music() {
      return getRuleContext(MusicContext.class,0);
    }
    public TerminalNode EOF() { return getToken(MusicParser.EOF, 0); }
    public RootContext(ParserRuleContext parent, int invokingState) {
      super(parent, invokingState);
    }
    @Override public int getRuleIndex() { return RULE_root; }
    @Override
    public void enterRule(ParseTreeListener listener) {
      if ( listener instanceof MusicListener ) ((MusicListener)listener).enterRoot(this);
    }
    @Override
    public void exitRule(ParseTreeListener listener) {
      if ( listener instanceof MusicListener ) ((MusicListener)listener).exitRoot(this);
    }
  }

  public final RootContext root() throws RecognitionException {
    RootContext _localctx = new RootContext(_ctx, getState());
    enterRule(_localctx, 0, RULE_root);
    try {
      enterOuterAlt(_localctx, 1);
      {
      setState(42);
      music();
      setState(43);
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

  public static class MusicContext extends ParserRuleContext {
    public List<MeasureContext> measure() {
      return getRuleContexts(MeasureContext.class);
    }
    public MeasureContext measure(int i) {
      return getRuleContext(MeasureContext.class,i);
    }
    public MusicContext(ParserRuleContext parent, int invokingState) {
      super(parent, invokingState);
    }
    @Override public int getRuleIndex() { return RULE_music; }
    @Override
    public void enterRule(ParseTreeListener listener) {
      if ( listener instanceof MusicListener ) ((MusicListener)listener).enterMusic(this);
    }
    @Override
    public void exitRule(ParseTreeListener listener) {
      if ( listener instanceof MusicListener ) ((MusicListener)listener).exitMusic(this);
    }
  }

  public final MusicContext music() throws RecognitionException {
    MusicContext _localctx = new MusicContext(_ctx, getState());
    enterRule(_localctx, 2, RULE_music);
    int _la;
    try {
      enterOuterAlt(_localctx, 1);
      {
      setState(46); 
      _errHandler.sync(this);
      _la = _input.LA(1);
      do {
        {
        {
        setState(45);
        measure();
        }
        }
        setState(48); 
        _errHandler.sync(this);
        _la = _input.LA(1);
      } while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__1) | (1L << T__6) | (1L << T__9) | (1L << T__11) | (1L << T__13) | (1L << ACCIDENTAL) | (1L << NOTELETTER) | (1L << WHITESPACE))) != 0) );
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

  public static class MeasureContext extends ParserRuleContext {
    public NormalmeasureContext normalmeasure() {
      return getRuleContext(NormalmeasureContext.class,0);
    }
    public StartrepeatmeasureContext startrepeatmeasure() {
      return getRuleContext(StartrepeatmeasureContext.class,0);
    }
    public DoublebarmeasureContext doublebarmeasure() {
      return getRuleContext(DoublebarmeasureContext.class,0);
    }
    public FirstendingmeasureContext firstendingmeasure() {
      return getRuleContext(FirstendingmeasureContext.class,0);
    }
    public SecondendingmeasureContext secondendingmeasure() {
      return getRuleContext(SecondendingmeasureContext.class,0);
    }
    public EndrepeatmeasureContext endrepeatmeasure() {
      return getRuleContext(EndrepeatmeasureContext.class,0);
    }
    public MeasureContext(ParserRuleContext parent, int invokingState) {
      super(parent, invokingState);
    }
    @Override public int getRuleIndex() { return RULE_measure; }
    @Override
    public void enterRule(ParseTreeListener listener) {
      if ( listener instanceof MusicListener ) ((MusicListener)listener).enterMeasure(this);
    }
    @Override
    public void exitRule(ParseTreeListener listener) {
      if ( listener instanceof MusicListener ) ((MusicListener)listener).exitMeasure(this);
    }
  }

  public final MeasureContext measure() throws RecognitionException {
    MeasureContext _localctx = new MeasureContext(_ctx, getState());
    enterRule(_localctx, 4, RULE_measure);
    try {
      setState(56);
      switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
      case 1:
        enterOuterAlt(_localctx, 1);
        {
        setState(50);
        normalmeasure();
        }
        break;
      case 2:
        enterOuterAlt(_localctx, 2);
        {
        setState(51);
        startrepeatmeasure();
        }
        break;
      case 3:
        enterOuterAlt(_localctx, 3);
        {
        setState(52);
        doublebarmeasure();
        }
        break;
      case 4:
        enterOuterAlt(_localctx, 4);
        {
        setState(53);
        firstendingmeasure();
        }
        break;
      case 5:
        enterOuterAlt(_localctx, 5);
        {
        setState(54);
        secondendingmeasure();
        }
        break;
      case 6:
        enterOuterAlt(_localctx, 6);
        {
        setState(55);
        endrepeatmeasure();
        }
        break;
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

  public static class FirstendingmeasureContext extends ParserRuleContext {
    public EndrepeatmeasureContext endrepeatmeasure() {
      return getRuleContext(EndrepeatmeasureContext.class,0);
    }
    public List<NormalmeasureContext> normalmeasure() {
      return getRuleContexts(NormalmeasureContext.class);
    }
    public NormalmeasureContext normalmeasure(int i) {
      return getRuleContext(NormalmeasureContext.class,i);
    }
    public FirstendingmeasureContext(ParserRuleContext parent, int invokingState) {
      super(parent, invokingState);
    }
    @Override public int getRuleIndex() { return RULE_firstendingmeasure; }
    @Override
    public void enterRule(ParseTreeListener listener) {
      if ( listener instanceof MusicListener ) ((MusicListener)listener).enterFirstendingmeasure(this);
    }
    @Override
    public void exitRule(ParseTreeListener listener) {
      if ( listener instanceof MusicListener ) ((MusicListener)listener).exitFirstendingmeasure(this);
    }
  }

  public final FirstendingmeasureContext firstendingmeasure() throws RecognitionException {
    FirstendingmeasureContext _localctx = new FirstendingmeasureContext(_ctx, getState());
    enterRule(_localctx, 6, RULE_firstendingmeasure);
    try {
      int _alt;
      enterOuterAlt(_localctx, 1);
      {
      setState(58);
      match(T__0);
      setState(62);
      _errHandler.sync(this);
      _alt = getInterpreter().adaptivePredict(_input,2,_ctx);
      while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
        if ( _alt==1 ) {
          {
          {
          setState(59);
          normalmeasure();
          }
          } 
        }
        setState(64);
        _errHandler.sync(this);
        _alt = getInterpreter().adaptivePredict(_input,2,_ctx);
      }
      setState(65);
      endrepeatmeasure();
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

  public static class SecondendingmeasureContext extends ParserRuleContext {
    public DoublebarmeasureContext doublebarmeasure() {
      return getRuleContext(DoublebarmeasureContext.class,0);
    }
    public List<NormalmeasureContext> normalmeasure() {
      return getRuleContexts(NormalmeasureContext.class);
    }
    public NormalmeasureContext normalmeasure(int i) {
      return getRuleContext(NormalmeasureContext.class,i);
    }
    public SecondendingmeasureContext(ParserRuleContext parent, int invokingState) {
      super(parent, invokingState);
    }
    @Override public int getRuleIndex() { return RULE_secondendingmeasure; }
    @Override
    public void enterRule(ParseTreeListener listener) {
      if ( listener instanceof MusicListener ) ((MusicListener)listener).enterSecondendingmeasure(this);
    }
    @Override
    public void exitRule(ParseTreeListener listener) {
      if ( listener instanceof MusicListener ) ((MusicListener)listener).exitSecondendingmeasure(this);
    }
  }

  public final SecondendingmeasureContext secondendingmeasure() throws RecognitionException {
    SecondendingmeasureContext _localctx = new SecondendingmeasureContext(_ctx, getState());
    enterRule(_localctx, 8, RULE_secondendingmeasure);
    try {
      int _alt;
      enterOuterAlt(_localctx, 1);
      {
      setState(67);
      match(T__1);
      setState(71);
      _errHandler.sync(this);
      _alt = getInterpreter().adaptivePredict(_input,3,_ctx);
      while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
        if ( _alt==1 ) {
          {
          {
          setState(68);
          normalmeasure();
          }
          } 
        }
        setState(73);
        _errHandler.sync(this);
        _alt = getInterpreter().adaptivePredict(_input,3,_ctx);
      }
      setState(74);
      doublebarmeasure();
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

  public static class NormalmeasureContext extends ParserRuleContext {
    public StartrepeatmeasureContext startrepeatmeasure() {
      return getRuleContext(StartrepeatmeasureContext.class,0);
    }
    public List<ElementContext> element() {
      return getRuleContexts(ElementContext.class);
    }
    public ElementContext element(int i) {
      return getRuleContext(ElementContext.class,i);
    }
    public List<TerminalNode> WHITESPACE() { return getTokens(MusicParser.WHITESPACE); }
    public TerminalNode WHITESPACE(int i) {
      return getToken(MusicParser.WHITESPACE, i);
    }
    public NormalmeasureContext(ParserRuleContext parent, int invokingState) {
      super(parent, invokingState);
    }
    @Override public int getRuleIndex() { return RULE_normalmeasure; }
    @Override
    public void enterRule(ParseTreeListener listener) {
      if ( listener instanceof MusicListener ) ((MusicListener)listener).enterNormalmeasure(this);
    }
    @Override
    public void exitRule(ParseTreeListener listener) {
      if ( listener instanceof MusicListener ) ((MusicListener)listener).exitNormalmeasure(this);
    }
  }

  public final NormalmeasureContext normalmeasure() throws RecognitionException {
    NormalmeasureContext _localctx = new NormalmeasureContext(_ctx, getState());
    enterRule(_localctx, 10, RULE_normalmeasure);
    int _la;
    try {
      enterOuterAlt(_localctx, 1);
      {
      setState(78); 
      _errHandler.sync(this);
      _la = _input.LA(1);
      do {
        {
        setState(78);
        switch (_input.LA(1)) {
        case T__9:
        case T__11:
        case T__13:
        case ACCIDENTAL:
        case NOTELETTER:
          {
          setState(76);
          element();
          }
          break;
        case WHITESPACE:
          {
          setState(77);
          match(WHITESPACE);
          }
          break;
        default:
          throw new NoViableAltException(this);
        }
        }
        setState(80); 
        _errHandler.sync(this);
        _la = _input.LA(1);
      } while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__9) | (1L << T__11) | (1L << T__13) | (1L << ACCIDENTAL) | (1L << NOTELETTER) | (1L << WHITESPACE))) != 0) );
      setState(84);
      switch (_input.LA(1)) {
      case T__2:
        {
        setState(82);
        match(T__2);
        }
        break;
      case T__6:
        {
        setState(83);
        startrepeatmeasure();
        }
        break;
      default:
        throw new NoViableAltException(this);
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

  public static class DoublebarmeasureContext extends ParserRuleContext {
    public List<ElementContext> element() {
      return getRuleContexts(ElementContext.class);
    }
    public ElementContext element(int i) {
      return getRuleContext(ElementContext.class,i);
    }
    public List<TerminalNode> WHITESPACE() { return getTokens(MusicParser.WHITESPACE); }
    public TerminalNode WHITESPACE(int i) {
      return getToken(MusicParser.WHITESPACE, i);
    }
    public DoublebarmeasureContext(ParserRuleContext parent, int invokingState) {
      super(parent, invokingState);
    }
    @Override public int getRuleIndex() { return RULE_doublebarmeasure; }
    @Override
    public void enterRule(ParseTreeListener listener) {
      if ( listener instanceof MusicListener ) ((MusicListener)listener).enterDoublebarmeasure(this);
    }
    @Override
    public void exitRule(ParseTreeListener listener) {
      if ( listener instanceof MusicListener ) ((MusicListener)listener).exitDoublebarmeasure(this);
    }
  }

  public final DoublebarmeasureContext doublebarmeasure() throws RecognitionException {
    DoublebarmeasureContext _localctx = new DoublebarmeasureContext(_ctx, getState());
    enterRule(_localctx, 12, RULE_doublebarmeasure);
    int _la;
    try {
      enterOuterAlt(_localctx, 1);
      {
      setState(88); 
      _errHandler.sync(this);
      _la = _input.LA(1);
      do {
        {
        setState(88);
        switch (_input.LA(1)) {
        case T__9:
        case T__11:
        case T__13:
        case ACCIDENTAL:
        case NOTELETTER:
          {
          setState(86);
          element();
          }
          break;
        case WHITESPACE:
          {
          setState(87);
          match(WHITESPACE);
          }
          break;
        default:
          throw new NoViableAltException(this);
        }
        }
        setState(90); 
        _errHandler.sync(this);
        _la = _input.LA(1);
      } while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__9) | (1L << T__11) | (1L << T__13) | (1L << ACCIDENTAL) | (1L << NOTELETTER) | (1L << WHITESPACE))) != 0) );
      setState(92);
      _la = _input.LA(1);
      if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__3) | (1L << T__4) | (1L << T__5))) != 0)) ) {
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

  public static class StartrepeatmeasureContext extends ParserRuleContext {
    public List<ElementContext> element() {
      return getRuleContexts(ElementContext.class);
    }
    public ElementContext element(int i) {
      return getRuleContext(ElementContext.class,i);
    }
    public List<TerminalNode> WHITESPACE() { return getTokens(MusicParser.WHITESPACE); }
    public TerminalNode WHITESPACE(int i) {
      return getToken(MusicParser.WHITESPACE, i);
    }
    public StartrepeatmeasureContext(ParserRuleContext parent, int invokingState) {
      super(parent, invokingState);
    }
    @Override public int getRuleIndex() { return RULE_startrepeatmeasure; }
    @Override
    public void enterRule(ParseTreeListener listener) {
      if ( listener instanceof MusicListener ) ((MusicListener)listener).enterStartrepeatmeasure(this);
    }
    @Override
    public void exitRule(ParseTreeListener listener) {
      if ( listener instanceof MusicListener ) ((MusicListener)listener).exitStartrepeatmeasure(this);
    }
  }

  public final StartrepeatmeasureContext startrepeatmeasure() throws RecognitionException {
    StartrepeatmeasureContext _localctx = new StartrepeatmeasureContext(_ctx, getState());
    enterRule(_localctx, 14, RULE_startrepeatmeasure);
    int _la;
    try {
      enterOuterAlt(_localctx, 1);
      {
      {
      setState(94);
      match(T__6);
      }
      setState(97); 
      _errHandler.sync(this);
      _la = _input.LA(1);
      do {
        {
        setState(97);
        switch (_input.LA(1)) {
        case T__9:
        case T__11:
        case T__13:
        case ACCIDENTAL:
        case NOTELETTER:
          {
          setState(95);
          element();
          }
          break;
        case WHITESPACE:
          {
          setState(96);
          match(WHITESPACE);
          }
          break;
        default:
          throw new NoViableAltException(this);
        }
        }
        setState(99); 
        _errHandler.sync(this);
        _la = _input.LA(1);
      } while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__9) | (1L << T__11) | (1L << T__13) | (1L << ACCIDENTAL) | (1L << NOTELETTER) | (1L << WHITESPACE))) != 0) );
      {
      setState(101);
      match(T__2);
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

  public static class EndrepeatmeasureContext extends ParserRuleContext {
    public List<ElementContext> element() {
      return getRuleContexts(ElementContext.class);
    }
    public ElementContext element(int i) {
      return getRuleContext(ElementContext.class,i);
    }
    public List<TerminalNode> WHITESPACE() { return getTokens(MusicParser.WHITESPACE); }
    public TerminalNode WHITESPACE(int i) {
      return getToken(MusicParser.WHITESPACE, i);
    }
    public EndrepeatmeasureContext(ParserRuleContext parent, int invokingState) {
      super(parent, invokingState);
    }
    @Override public int getRuleIndex() { return RULE_endrepeatmeasure; }
    @Override
    public void enterRule(ParseTreeListener listener) {
      if ( listener instanceof MusicListener ) ((MusicListener)listener).enterEndrepeatmeasure(this);
    }
    @Override
    public void exitRule(ParseTreeListener listener) {
      if ( listener instanceof MusicListener ) ((MusicListener)listener).exitEndrepeatmeasure(this);
    }
  }

  public final EndrepeatmeasureContext endrepeatmeasure() throws RecognitionException {
    EndrepeatmeasureContext _localctx = new EndrepeatmeasureContext(_ctx, getState());
    enterRule(_localctx, 16, RULE_endrepeatmeasure);
    int _la;
    try {
      enterOuterAlt(_localctx, 1);
      {
      setState(105); 
      _errHandler.sync(this);
      _la = _input.LA(1);
      do {
        {
        setState(105);
        switch (_input.LA(1)) {
        case T__9:
        case T__11:
        case T__13:
        case ACCIDENTAL:
        case NOTELETTER:
          {
          setState(103);
          element();
          }
          break;
        case WHITESPACE:
          {
          setState(104);
          match(WHITESPACE);
          }
          break;
        default:
          throw new NoViableAltException(this);
        }
        }
        setState(107); 
        _errHandler.sync(this);
        _la = _input.LA(1);
      } while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__9) | (1L << T__11) | (1L << T__13) | (1L << ACCIDENTAL) | (1L << NOTELETTER) | (1L << WHITESPACE))) != 0) );
      setState(109);
      match(T__7);
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

  public static class SinglerepeatmeasureContext extends ParserRuleContext {
    public List<ElementContext> element() {
      return getRuleContexts(ElementContext.class);
    }
    public ElementContext element(int i) {
      return getRuleContext(ElementContext.class,i);
    }
    public List<TerminalNode> WHITESPACE() { return getTokens(MusicParser.WHITESPACE); }
    public TerminalNode WHITESPACE(int i) {
      return getToken(MusicParser.WHITESPACE, i);
    }
    public SinglerepeatmeasureContext(ParserRuleContext parent, int invokingState) {
      super(parent, invokingState);
    }
    @Override public int getRuleIndex() { return RULE_singlerepeatmeasure; }
    @Override
    public void enterRule(ParseTreeListener listener) {
      if ( listener instanceof MusicListener ) ((MusicListener)listener).enterSinglerepeatmeasure(this);
    }
    @Override
    public void exitRule(ParseTreeListener listener) {
      if ( listener instanceof MusicListener ) ((MusicListener)listener).exitSinglerepeatmeasure(this);
    }
  }

  public final SinglerepeatmeasureContext singlerepeatmeasure() throws RecognitionException {
    SinglerepeatmeasureContext _localctx = new SinglerepeatmeasureContext(_ctx, getState());
    enterRule(_localctx, 18, RULE_singlerepeatmeasure);
    int _la;
    try {
      enterOuterAlt(_localctx, 1);
      {
      setState(111);
      _la = _input.LA(1);
      if ( !(_la==T__6 || _la==T__8) ) {
      _errHandler.recoverInline(this);
      } else {
        consume();
      }
      setState(114); 
      _errHandler.sync(this);
      _la = _input.LA(1);
      do {
        {
        setState(114);
        switch (_input.LA(1)) {
        case T__9:
        case T__11:
        case T__13:
        case ACCIDENTAL:
        case NOTELETTER:
          {
          setState(112);
          element();
          }
          break;
        case WHITESPACE:
          {
          setState(113);
          match(WHITESPACE);
          }
          break;
        default:
          throw new NoViableAltException(this);
        }
        }
        setState(116); 
        _errHandler.sync(this);
        _la = _input.LA(1);
      } while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__9) | (1L << T__11) | (1L << T__13) | (1L << ACCIDENTAL) | (1L << NOTELETTER) | (1L << WHITESPACE))) != 0) );
      {
      setState(118);
      match(T__7);
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

  public static class ElementContext extends ParserRuleContext {
    public NoteelementContext noteelement() {
      return getRuleContext(NoteelementContext.class,0);
    }
    public TupletelementContext tupletelement() {
      return getRuleContext(TupletelementContext.class,0);
    }
    public ElementContext(ParserRuleContext parent, int invokingState) {
      super(parent, invokingState);
    }
    @Override public int getRuleIndex() { return RULE_element; }
    @Override
    public void enterRule(ParseTreeListener listener) {
      if ( listener instanceof MusicListener ) ((MusicListener)listener).enterElement(this);
    }
    @Override
    public void exitRule(ParseTreeListener listener) {
      if ( listener instanceof MusicListener ) ((MusicListener)listener).exitElement(this);
    }
  }

  public final ElementContext element() throws RecognitionException {
    ElementContext _localctx = new ElementContext(_ctx, getState());
    enterRule(_localctx, 20, RULE_element);
    try {
      setState(122);
      switch (_input.LA(1)) {
      case T__9:
      case T__11:
      case ACCIDENTAL:
      case NOTELETTER:
        enterOuterAlt(_localctx, 1);
        {
        setState(120);
        noteelement();
        }
        break;
      case T__13:
        enterOuterAlt(_localctx, 2);
        {
        setState(121);
        tupletelement();
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

  public static class NoteelementContext extends ParserRuleContext {
    public NoteContext note() {
      return getRuleContext(NoteContext.class,0);
    }
    public ChordContext chord() {
      return getRuleContext(ChordContext.class,0);
    }
    public NoteelementContext(ParserRuleContext parent, int invokingState) {
      super(parent, invokingState);
    }
    @Override public int getRuleIndex() { return RULE_noteelement; }
    @Override
    public void enterRule(ParseTreeListener listener) {
      if ( listener instanceof MusicListener ) ((MusicListener)listener).enterNoteelement(this);
    }
    @Override
    public void exitRule(ParseTreeListener listener) {
      if ( listener instanceof MusicListener ) ((MusicListener)listener).exitNoteelement(this);
    }
  }

  public final NoteelementContext noteelement() throws RecognitionException {
    NoteelementContext _localctx = new NoteelementContext(_ctx, getState());
    enterRule(_localctx, 22, RULE_noteelement);
    try {
      setState(126);
      switch (_input.LA(1)) {
      case T__11:
      case ACCIDENTAL:
      case NOTELETTER:
        enterOuterAlt(_localctx, 1);
        {
        setState(124);
        note();
        }
        break;
      case T__9:
        enterOuterAlt(_localctx, 2);
        {
        setState(125);
        chord();
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

  public static class ChordContext extends ParserRuleContext {
    public List<NoteContext> note() {
      return getRuleContexts(NoteContext.class);
    }
    public NoteContext note(int i) {
      return getRuleContext(NoteContext.class,i);
    }
    public ChordContext(ParserRuleContext parent, int invokingState) {
      super(parent, invokingState);
    }
    @Override public int getRuleIndex() { return RULE_chord; }
    @Override
    public void enterRule(ParseTreeListener listener) {
      if ( listener instanceof MusicListener ) ((MusicListener)listener).enterChord(this);
    }
    @Override
    public void exitRule(ParseTreeListener listener) {
      if ( listener instanceof MusicListener ) ((MusicListener)listener).exitChord(this);
    }
  }

  public final ChordContext chord() throws RecognitionException {
    ChordContext _localctx = new ChordContext(_ctx, getState());
    enterRule(_localctx, 24, RULE_chord);
    int _la;
    try {
      enterOuterAlt(_localctx, 1);
      {
      setState(128);
      match(T__9);
      setState(130); 
      _errHandler.sync(this);
      _la = _input.LA(1);
      do {
        {
        {
        setState(129);
        note();
        }
        }
        setState(132); 
        _errHandler.sync(this);
        _la = _input.LA(1);
      } while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__11) | (1L << ACCIDENTAL) | (1L << NOTELETTER))) != 0) );
      setState(134);
      match(T__10);
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

  public static class NoteContext extends ParserRuleContext {
    public PitchContext pitch() {
      return getRuleContext(PitchContext.class,0);
    }
    public RestContext rest() {
      return getRuleContext(RestContext.class,0);
    }
    public NoteContext(ParserRuleContext parent, int invokingState) {
      super(parent, invokingState);
    }
    @Override public int getRuleIndex() { return RULE_note; }
    @Override
    public void enterRule(ParseTreeListener listener) {
      if ( listener instanceof MusicListener ) ((MusicListener)listener).enterNote(this);
    }
    @Override
    public void exitRule(ParseTreeListener listener) {
      if ( listener instanceof MusicListener ) ((MusicListener)listener).exitNote(this);
    }
  }

  public final NoteContext note() throws RecognitionException {
    NoteContext _localctx = new NoteContext(_ctx, getState());
    enterRule(_localctx, 26, RULE_note);
    try {
      setState(138);
      switch (_input.LA(1)) {
      case ACCIDENTAL:
      case NOTELETTER:
        enterOuterAlt(_localctx, 1);
        {
        setState(136);
        pitch();
        }
        break;
      case T__11:
        enterOuterAlt(_localctx, 2);
        {
        setState(137);
        rest();
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

  public static class PitchContext extends ParserRuleContext {
    public TerminalNode NOTELETTER() { return getToken(MusicParser.NOTELETTER, 0); }
    public TerminalNode ACCIDENTAL() { return getToken(MusicParser.ACCIDENTAL, 0); }
    public TerminalNode OCTAVE() { return getToken(MusicParser.OCTAVE, 0); }
    public NotelengthContext notelength() {
      return getRuleContext(NotelengthContext.class,0);
    }
    public PitchContext(ParserRuleContext parent, int invokingState) {
      super(parent, invokingState);
    }
    @Override public int getRuleIndex() { return RULE_pitch; }
    @Override
    public void enterRule(ParseTreeListener listener) {
      if ( listener instanceof MusicListener ) ((MusicListener)listener).enterPitch(this);
    }
    @Override
    public void exitRule(ParseTreeListener listener) {
      if ( listener instanceof MusicListener ) ((MusicListener)listener).exitPitch(this);
    }
  }

  public final PitchContext pitch() throws RecognitionException {
    PitchContext _localctx = new PitchContext(_ctx, getState());
    enterRule(_localctx, 28, RULE_pitch);
    int _la;
    try {
      enterOuterAlt(_localctx, 1);
      {
      setState(141);
      _la = _input.LA(1);
      if (_la==ACCIDENTAL) {
        {
        setState(140);
        match(ACCIDENTAL);
        }
      }

      setState(143);
      match(NOTELETTER);
      setState(145);
      _la = _input.LA(1);
      if (_la==OCTAVE) {
        {
        setState(144);
        match(OCTAVE);
        }
      }

      setState(148);
      _la = _input.LA(1);
      if (_la==T__12 || _la==DIGIT) {
        {
        setState(147);
        notelength();
        }
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

  public static class RestContext extends ParserRuleContext {
    public NotelengthContext notelength() {
      return getRuleContext(NotelengthContext.class,0);
    }
    public RestContext(ParserRuleContext parent, int invokingState) {
      super(parent, invokingState);
    }
    @Override public int getRuleIndex() { return RULE_rest; }
    @Override
    public void enterRule(ParseTreeListener listener) {
      if ( listener instanceof MusicListener ) ((MusicListener)listener).enterRest(this);
    }
    @Override
    public void exitRule(ParseTreeListener listener) {
      if ( listener instanceof MusicListener ) ((MusicListener)listener).exitRest(this);
    }
  }

  public final RestContext rest() throws RecognitionException {
    RestContext _localctx = new RestContext(_ctx, getState());
    enterRule(_localctx, 30, RULE_rest);
    int _la;
    try {
      enterOuterAlt(_localctx, 1);
      {
      setState(150);
      match(T__11);
      setState(152);
      _la = _input.LA(1);
      if (_la==T__12 || _la==DIGIT) {
        {
        setState(151);
        notelength();
        }
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

  public static class NotelengthContext extends ParserRuleContext {
    public List<TerminalNode> DIGIT() { return getTokens(MusicParser.DIGIT); }
    public TerminalNode DIGIT(int i) {
      return getToken(MusicParser.DIGIT, i);
    }
    public NotelengthContext(ParserRuleContext parent, int invokingState) {
      super(parent, invokingState);
    }
    @Override public int getRuleIndex() { return RULE_notelength; }
    @Override
    public void enterRule(ParseTreeListener listener) {
      if ( listener instanceof MusicListener ) ((MusicListener)listener).enterNotelength(this);
    }
    @Override
    public void exitRule(ParseTreeListener listener) {
      if ( listener instanceof MusicListener ) ((MusicListener)listener).exitNotelength(this);
    }
  }

  public final NotelengthContext notelength() throws RecognitionException {
    NotelengthContext _localctx = new NotelengthContext(_ctx, getState());
    enterRule(_localctx, 32, RULE_notelength);
    int _la;
    try {
      setState(174);
      switch ( getInterpreter().adaptivePredict(_input,28,_ctx) ) {
      case 1:
        enterOuterAlt(_localctx, 1);
        {
        {
        setState(159);
        _la = _input.LA(1);
        if (_la==DIGIT) {
          {
          setState(155); 
          _errHandler.sync(this);
          _la = _input.LA(1);
          do {
            {
            {
            setState(154);
            match(DIGIT);
            }
            }
            setState(157); 
            _errHandler.sync(this);
            _la = _input.LA(1);
          } while ( _la==DIGIT );
          }
        }

        setState(161);
        match(T__12);
        setState(167);
        _la = _input.LA(1);
        if (_la==DIGIT) {
          {
          setState(163); 
          _errHandler.sync(this);
          _la = _input.LA(1);
          do {
            {
            {
            setState(162);
            match(DIGIT);
            }
            }
            setState(165); 
            _errHandler.sync(this);
            _la = _input.LA(1);
          } while ( _la==DIGIT );
          }
        }

        }
        }
        break;
      case 2:
        enterOuterAlt(_localctx, 2);
        {
        setState(170); 
        _errHandler.sync(this);
        _la = _input.LA(1);
        do {
          {
          {
          setState(169);
          match(DIGIT);
          }
          }
          setState(172); 
          _errHandler.sync(this);
          _la = _input.LA(1);
        } while ( _la==DIGIT );
        }
        break;
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

  public static class TupletelementContext extends ParserRuleContext {
    public TupletspecContext tupletspec() {
      return getRuleContext(TupletspecContext.class,0);
    }
    public List<NoteelementContext> noteelement() {
      return getRuleContexts(NoteelementContext.class);
    }
    public NoteelementContext noteelement(int i) {
      return getRuleContext(NoteelementContext.class,i);
    }
    public TupletelementContext(ParserRuleContext parent, int invokingState) {
      super(parent, invokingState);
    }
    @Override public int getRuleIndex() { return RULE_tupletelement; }
    @Override
    public void enterRule(ParseTreeListener listener) {
      if ( listener instanceof MusicListener ) ((MusicListener)listener).enterTupletelement(this);
    }
    @Override
    public void exitRule(ParseTreeListener listener) {
      if ( listener instanceof MusicListener ) ((MusicListener)listener).exitTupletelement(this);
    }
  }

  public final TupletelementContext tupletelement() throws RecognitionException {
    TupletelementContext _localctx = new TupletelementContext(_ctx, getState());
    enterRule(_localctx, 34, RULE_tupletelement);
    try {
      int _alt;
      enterOuterAlt(_localctx, 1);
      {
      setState(176);
      tupletspec();
      setState(178); 
      _errHandler.sync(this);
      _alt = 1;
      do {
        switch (_alt) {
        case 1:
          {
          {
          setState(177);
          noteelement();
          }
          }
          break;
        default:
          throw new NoViableAltException(this);
        }
        setState(180); 
        _errHandler.sync(this);
        _alt = getInterpreter().adaptivePredict(_input,29,_ctx);
      } while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
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

  public static class TupletspecContext extends ParserRuleContext {
    public TerminalNode DIGIT() { return getToken(MusicParser.DIGIT, 0); }
    public TupletspecContext(ParserRuleContext parent, int invokingState) {
      super(parent, invokingState);
    }
    @Override public int getRuleIndex() { return RULE_tupletspec; }
    @Override
    public void enterRule(ParseTreeListener listener) {
      if ( listener instanceof MusicListener ) ((MusicListener)listener).enterTupletspec(this);
    }
    @Override
    public void exitRule(ParseTreeListener listener) {
      if ( listener instanceof MusicListener ) ((MusicListener)listener).exitTupletspec(this);
    }
  }

  public final TupletspecContext tupletspec() throws RecognitionException {
    TupletspecContext _localctx = new TupletspecContext(_ctx, getState());
    enterRule(_localctx, 36, RULE_tupletspec);
    try {
      enterOuterAlt(_localctx, 1);
      {
      setState(182);
      match(T__13);
      setState(183);
      match(DIGIT);
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
      if ( listener instanceof MusicListener ) ((MusicListener)listener).enterComment(this);
    }
    @Override
    public void exitRule(ParseTreeListener listener) {
      if ( listener instanceof MusicListener ) ((MusicListener)listener).exitComment(this);
    }
  }

  public final CommentContext comment() throws RecognitionException {
    CommentContext _localctx = new CommentContext(_ctx, getState());
    enterRule(_localctx, 38, RULE_comment);
    int _la;
    try {
      enterOuterAlt(_localctx, 1);
      {
      setState(185);
      match(T__14);
      setState(187); 
      _errHandler.sync(this);
      _la = _input.LA(1);
      do {
        {
        {
        setState(186);
        text();
        }
        }
        setState(189); 
        _errHandler.sync(this);
        _la = _input.LA(1);
      } while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ACCIDENTAL) | (1L << OCTAVE) | (1L << SYMBOLS) | (1L << LETTERS) | (1L << NOTELETTER) | (1L << WHITESPACE) | (1L << DIGIT))) != 0) );
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
    public TerminalNode DIGIT() { return getToken(MusicParser.DIGIT, 0); }
    public TerminalNode NOTELETTER() { return getToken(MusicParser.NOTELETTER, 0); }
    public TerminalNode LETTERS() { return getToken(MusicParser.LETTERS, 0); }
    public TerminalNode SYMBOLS() { return getToken(MusicParser.SYMBOLS, 0); }
    public TerminalNode ACCIDENTAL() { return getToken(MusicParser.ACCIDENTAL, 0); }
    public TerminalNode OCTAVE() { return getToken(MusicParser.OCTAVE, 0); }
    public TerminalNode WHITESPACE() { return getToken(MusicParser.WHITESPACE, 0); }
    public TextContext(ParserRuleContext parent, int invokingState) {
      super(parent, invokingState);
    }
    @Override public int getRuleIndex() { return RULE_text; }
    @Override
    public void enterRule(ParseTreeListener listener) {
      if ( listener instanceof MusicListener ) ((MusicListener)listener).enterText(this);
    }
    @Override
    public void exitRule(ParseTreeListener listener) {
      if ( listener instanceof MusicListener ) ((MusicListener)listener).exitText(this);
    }
  }

  public final TextContext text() throws RecognitionException {
    TextContext _localctx = new TextContext(_ctx, getState());
    enterRule(_localctx, 40, RULE_text);
    int _la;
    try {
      enterOuterAlt(_localctx, 1);
      {
      setState(191);
      _la = _input.LA(1);
      if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ACCIDENTAL) | (1L << OCTAVE) | (1L << SYMBOLS) | (1L << LETTERS) | (1L << NOTELETTER) | (1L << WHITESPACE) | (1L << DIGIT))) != 0)) ) {
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
    "\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3\32\u00c4\4\2\t"+
      "\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n"+
      "\4\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21"+
      "\4\22\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\3\2\3\2\3\2\3\3"+
      "\6\3\61\n\3\r\3\16\3\62\3\4\3\4\3\4\3\4\3\4\3\4\5\4;\n\4\3\5\3\5\7"+
      "\5?\n\5\f\5\16\5B\13\5\3\5\3\5\3\6\3\6\7\6H\n\6\f\6\16\6K\13\6\3\6"+
      "\3\6\3\7\3\7\6\7Q\n\7\r\7\16\7R\3\7\3\7\5\7W\n\7\3\b\3\b\6\b[\n\b"+
      "\r\b\16\b\\\3\b\3\b\3\t\3\t\3\t\6\td\n\t\r\t\16\te\3\t\3\t\3\n\3\n"+
      "\6\nl\n\n\r\n\16\nm\3\n\3\n\3\13\3\13\3\13\6\13u\n\13\r\13\16\13v"+
      "\3\13\3\13\3\f\3\f\5\f}\n\f\3\r\3\r\5\r\u0081\n\r\3\16\3\16\6\16\u0085"+
      "\n\16\r\16\16\16\u0086\3\16\3\16\3\17\3\17\5\17\u008d\n\17\3\20\5"+
      "\20\u0090\n\20\3\20\3\20\5\20\u0094\n\20\3\20\5\20\u0097\n\20\3\21"+
      "\3\21\5\21\u009b\n\21\3\22\6\22\u009e\n\22\r\22\16\22\u009f\5\22\u00a2"+
      "\n\22\3\22\3\22\6\22\u00a6\n\22\r\22\16\22\u00a7\5\22\u00aa\n\22\3"+
      "\22\6\22\u00ad\n\22\r\22\16\22\u00ae\5\22\u00b1\n\22\3\23\3\23\6\23"+
      "\u00b5\n\23\r\23\16\23\u00b6\3\24\3\24\3\24\3\25\3\25\6\25\u00be\n"+
      "\25\r\25\16\25\u00bf\3\26\3\26\3\26\2\2\27\2\4\6\b\n\f\16\20\22\24"+
      "\26\30\32\34\36 \"$&(*\2\5\3\2\6\b\4\2\t\t\13\13\5\2\22\25\27\27\31"+
      "\32\u00d1\2,\3\2\2\2\4\60\3\2\2\2\6:\3\2\2\2\b<\3\2\2\2\nE\3\2\2\2"+
      "\fP\3\2\2\2\16Z\3\2\2\2\20`\3\2\2\2\22k\3\2\2\2\24q\3\2\2\2\26|\3"+
      "\2\2\2\30\u0080\3\2\2\2\32\u0082\3\2\2\2\34\u008c\3\2\2\2\36\u008f"+
      "\3\2\2\2 \u0098\3\2\2\2\"\u00b0\3\2\2\2$\u00b2\3\2\2\2&\u00b8\3\2"+
      "\2\2(\u00bb\3\2\2\2*\u00c1\3\2\2\2,-\5\4\3\2-.\7\2\2\3.\3\3\2\2\2"+
      "/\61\5\6\4\2\60/\3\2\2\2\61\62\3\2\2\2\62\60\3\2\2\2\62\63\3\2\2\2"+
      "\63\5\3\2\2\2\64;\5\f\7\2\65;\5\20\t\2\66;\5\16\b\2\67;\5\b\5\28;"+
      "\5\n\6\29;\5\22\n\2:\64\3\2\2\2:\65\3\2\2\2:\66\3\2\2\2:\67\3\2\2"+
      "\2:8\3\2\2\2:9\3\2\2\2;\7\3\2\2\2<@\7\3\2\2=?\5\f\7\2>=\3\2\2\2?B"+
      "\3\2\2\2@>\3\2\2\2@A\3\2\2\2AC\3\2\2\2B@\3\2\2\2CD\5\22\n\2D\t\3\2"+
      "\2\2EI\7\4\2\2FH\5\f\7\2GF\3\2\2\2HK\3\2\2\2IG\3\2\2\2IJ\3\2\2\2J"+
      "L\3\2\2\2KI\3\2\2\2LM\5\16\b\2M\13\3\2\2\2NQ\5\26\f\2OQ\7\31\2\2P"+
      "N\3\2\2\2PO\3\2\2\2QR\3\2\2\2RP\3\2\2\2RS\3\2\2\2SV\3\2\2\2TW\7\5"+
      "\2\2UW\5\20\t\2VT\3\2\2\2VU\3\2\2\2W\r\3\2\2\2X[\5\26\f\2Y[\7\31\2"+
      "\2ZX\3\2\2\2ZY\3\2\2\2[\\\3\2\2\2\\Z\3\2\2\2\\]\3\2\2\2]^\3\2\2\2"+
      "^_\t\2\2\2_\17\3\2\2\2`c\7\t\2\2ad\5\26\f\2bd\7\31\2\2ca\3\2\2\2c"+
      "b\3\2\2\2de\3\2\2\2ec\3\2\2\2ef\3\2\2\2fg\3\2\2\2gh\7\5\2\2h\21\3"+
      "\2\2\2il\5\26\f\2jl\7\31\2\2ki\3\2\2\2kj\3\2\2\2lm\3\2\2\2mk\3\2\2"+
      "\2mn\3\2\2\2no\3\2\2\2op\7\n\2\2p\23\3\2\2\2qt\t\3\2\2ru\5\26\f\2"+
      "su\7\31\2\2tr\3\2\2\2ts\3\2\2\2uv\3\2\2\2vt\3\2\2\2vw\3\2\2\2wx\3"+
      "\2\2\2xy\7\n\2\2y\25\3\2\2\2z}\5\30\r\2{}\5$\23\2|z\3\2\2\2|{\3\2"+
      "\2\2}\27\3\2\2\2~\u0081\5\34\17\2\177\u0081\5\32\16\2\u0080~\3\2\2"+
      "\2\u0080\177\3\2\2\2\u0081\31\3\2\2\2\u0082\u0084\7\f\2\2\u0083\u0085"+
      "\5\34\17\2\u0084\u0083\3\2\2\2\u0085\u0086\3\2\2\2\u0086\u0084\3\2"+
      "\2\2\u0086\u0087\3\2\2\2\u0087\u0088\3\2\2\2\u0088\u0089\7\r\2\2\u0089"+
      "\33\3\2\2\2\u008a\u008d\5\36\20\2\u008b\u008d\5 \21\2\u008c\u008a"+
      "\3\2\2\2\u008c\u008b\3\2\2\2\u008d\35\3\2\2\2\u008e\u0090\7\22\2\2"+
      "\u008f\u008e\3\2\2\2\u008f\u0090\3\2\2\2\u0090\u0091\3\2\2\2\u0091"+
      "\u0093\7\27\2\2\u0092\u0094\7\23\2\2\u0093\u0092\3\2\2\2\u0093\u0094"+
      "\3\2\2\2\u0094\u0096\3\2\2\2\u0095\u0097\5\"\22\2\u0096\u0095\3\2"+
      "\2\2\u0096\u0097\3\2\2\2\u0097\37\3\2\2\2\u0098\u009a\7\16\2\2\u0099"+
      "\u009b\5\"\22\2\u009a\u0099\3\2\2\2\u009a\u009b\3\2\2\2\u009b!\3\2"+
      "\2\2\u009c\u009e\7\32\2\2\u009d\u009c\3\2\2\2\u009e\u009f\3\2\2\2"+
      "\u009f\u009d\3\2\2\2\u009f\u00a0\3\2\2\2\u00a0\u00a2\3\2\2\2\u00a1"+
      "\u009d\3\2\2\2\u00a1\u00a2\3\2\2\2\u00a2\u00a3\3\2\2\2\u00a3\u00a9"+
      "\7\17\2\2\u00a4\u00a6\7\32\2\2\u00a5\u00a4\3\2\2\2\u00a6\u00a7\3\2"+
      "\2\2\u00a7\u00a5\3\2\2\2\u00a7\u00a8\3\2\2\2\u00a8\u00aa\3\2\2\2\u00a9"+
      "\u00a5\3\2\2\2\u00a9\u00aa\3\2\2\2\u00aa\u00b1\3\2\2\2\u00ab\u00ad"+
      "\7\32\2\2\u00ac\u00ab\3\2\2\2\u00ad\u00ae\3\2\2\2\u00ae\u00ac\3\2"+
      "\2\2\u00ae\u00af\3\2\2\2\u00af\u00b1\3\2\2\2\u00b0\u00a1\3\2\2\2\u00b0"+
      "\u00ac\3\2\2\2\u00b1#\3\2\2\2\u00b2\u00b4\5&\24\2\u00b3\u00b5\5\30"+
      "\r\2\u00b4\u00b3\3\2\2\2\u00b5\u00b6\3\2\2\2\u00b6\u00b4\3\2\2\2\u00b6"+
      "\u00b7\3\2\2\2\u00b7%\3\2\2\2\u00b8\u00b9\7\20\2\2\u00b9\u00ba\7\32"+
      "\2\2\u00ba\'\3\2\2\2\u00bb\u00bd\7\21\2\2\u00bc\u00be\5*\26\2\u00bd"+
      "\u00bc\3\2\2\2\u00be\u00bf\3\2\2\2\u00bf\u00bd\3\2\2\2\u00bf\u00c0"+
      "\3\2\2\2\u00c0)\3\2\2\2\u00c1\u00c2\t\4\2\2\u00c2+\3\2\2\2!\62:@I"+
      "PRVZ\\cekmtv|\u0080\u0086\u008c\u008f\u0093\u0096\u009a\u009f\u00a1"+
      "\u00a7\u00a9\u00ae\u00b0\u00b6\u00bf";
  public static final ATN _ATN =
    new ATNDeserializer().deserialize(_serializedATN.toCharArray());
  static {
    _decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
    for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
      _decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
    }
  }
}