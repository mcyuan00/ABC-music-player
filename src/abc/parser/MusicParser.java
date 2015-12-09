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
    T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, ACCIDENTAL=15, OCTAVE=16, 
    SYMBOLS=17, LETTERS=18, NTHREPEAT=19, NOTELETTER=20, NEWLINE=21, WHITESPACE=22, 
    DIGIT=23;
  public static final int
    RULE_root = 0, RULE_music = 1, RULE_measure = 2, RULE_firstendingmeasure = 3, 
    RULE_secondendingmeasure = 4, RULE_normalmeasure = 5, RULE_doublebarmeasure = 6, 
    RULE_startrepeatmeasure = 7, RULE_endrepeatmeasure = 8, RULE_element = 9, 
    RULE_noteelement = 10, RULE_chord = 11, RULE_note = 12, RULE_pitch = 13, 
    RULE_rest = 14, RULE_notelength = 15, RULE_tupletelement = 16, RULE_tupletspec = 17, 
    RULE_comment = 18, RULE_text = 19;
  public static final String[] ruleNames = {
    "root", "music", "measure", "firstendingmeasure", "secondendingmeasure", 
    "normalmeasure", "doublebarmeasure", "startrepeatmeasure", "endrepeatmeasure", 
    "element", "noteelement", "chord", "note", "pitch", "rest", "notelength", 
    "tupletelement", "tupletspec", "comment", "text"
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
      setState(40);
      music();
      setState(41);
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
      setState(44); 
      _errHandler.sync(this);
      _la = _input.LA(1);
      do {
        {
        {
        setState(43);
        measure();
        }
        }
        setState(46); 
        _errHandler.sync(this);
        _la = _input.LA(1);
      } while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__1) | (1L << T__6) | (1L << T__8) | (1L << T__10) | (1L << T__12) | (1L << ACCIDENTAL) | (1L << NOTELETTER) | (1L << WHITESPACE))) != 0) );
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
      setState(54);
      switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
      case 1:
        enterOuterAlt(_localctx, 1);
        {
        setState(48);
        normalmeasure();
        }
        break;
      case 2:
        enterOuterAlt(_localctx, 2);
        {
        setState(49);
        startrepeatmeasure();
        }
        break;
      case 3:
        enterOuterAlt(_localctx, 3);
        {
        setState(50);
        doublebarmeasure();
        }
        break;
      case 4:
        enterOuterAlt(_localctx, 4);
        {
        setState(51);
        firstendingmeasure();
        }
        break;
      case 5:
        enterOuterAlt(_localctx, 5);
        {
        setState(52);
        secondendingmeasure();
        }
        break;
      case 6:
        enterOuterAlt(_localctx, 6);
        {
        setState(53);
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
      setState(56);
      match(T__0);
      setState(60);
      _errHandler.sync(this);
      _alt = getInterpreter().adaptivePredict(_input,2,_ctx);
      while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
        if ( _alt==1 ) {
          {
          {
          setState(57);
          normalmeasure();
          }
          } 
        }
        setState(62);
        _errHandler.sync(this);
        _alt = getInterpreter().adaptivePredict(_input,2,_ctx);
      }
      setState(63);
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
      setState(65);
      match(T__1);
      setState(69);
      _errHandler.sync(this);
      _alt = getInterpreter().adaptivePredict(_input,3,_ctx);
      while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
        if ( _alt==1 ) {
          {
          {
          setState(66);
          normalmeasure();
          }
          } 
        }
        setState(71);
        _errHandler.sync(this);
        _alt = getInterpreter().adaptivePredict(_input,3,_ctx);
      }
      setState(72);
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
      setState(76); 
      _errHandler.sync(this);
      _la = _input.LA(1);
      do {
        {
        setState(76);
        switch (_input.LA(1)) {
        case T__8:
        case T__10:
        case T__12:
        case ACCIDENTAL:
        case NOTELETTER:
          {
          setState(74);
          element();
          }
          break;
        case WHITESPACE:
          {
          setState(75);
          match(WHITESPACE);
          }
          break;
        default:
          throw new NoViableAltException(this);
        }
        }
        setState(78); 
        _errHandler.sync(this);
        _la = _input.LA(1);
      } while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__8) | (1L << T__10) | (1L << T__12) | (1L << ACCIDENTAL) | (1L << NOTELETTER) | (1L << WHITESPACE))) != 0) );
      setState(82);
      switch (_input.LA(1)) {
      case T__2:
        {
        setState(80);
        match(T__2);
        }
        break;
      case T__6:
        {
        setState(81);
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
      setState(86); 
      _errHandler.sync(this);
      _la = _input.LA(1);
      do {
        {
        setState(86);
        switch (_input.LA(1)) {
        case T__8:
        case T__10:
        case T__12:
        case ACCIDENTAL:
        case NOTELETTER:
          {
          setState(84);
          element();
          }
          break;
        case WHITESPACE:
          {
          setState(85);
          match(WHITESPACE);
          }
          break;
        default:
          throw new NoViableAltException(this);
        }
        }
        setState(88); 
        _errHandler.sync(this);
        _la = _input.LA(1);
      } while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__8) | (1L << T__10) | (1L << T__12) | (1L << ACCIDENTAL) | (1L << NOTELETTER) | (1L << WHITESPACE))) != 0) );
      setState(90);
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
      setState(92);
      match(T__6);
      setState(95); 
      _errHandler.sync(this);
      _la = _input.LA(1);
      do {
        {
        setState(95);
        switch (_input.LA(1)) {
        case T__8:
        case T__10:
        case T__12:
        case ACCIDENTAL:
        case NOTELETTER:
          {
          setState(93);
          element();
          }
          break;
        case WHITESPACE:
          {
          setState(94);
          match(WHITESPACE);
          }
          break;
        default:
          throw new NoViableAltException(this);
        }
        }
        setState(97); 
        _errHandler.sync(this);
        _la = _input.LA(1);
      } while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__8) | (1L << T__10) | (1L << T__12) | (1L << ACCIDENTAL) | (1L << NOTELETTER) | (1L << WHITESPACE))) != 0) );
      {
      setState(99);
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
      setState(103); 
      _errHandler.sync(this);
      _la = _input.LA(1);
      do {
        {
        setState(103);
        switch (_input.LA(1)) {
        case T__8:
        case T__10:
        case T__12:
        case ACCIDENTAL:
        case NOTELETTER:
          {
          setState(101);
          element();
          }
          break;
        case WHITESPACE:
          {
          setState(102);
          match(WHITESPACE);
          }
          break;
        default:
          throw new NoViableAltException(this);
        }
        }
        setState(105); 
        _errHandler.sync(this);
        _la = _input.LA(1);
      } while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__8) | (1L << T__10) | (1L << T__12) | (1L << ACCIDENTAL) | (1L << NOTELETTER) | (1L << WHITESPACE))) != 0) );
      setState(107);
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
    enterRule(_localctx, 18, RULE_element);
    try {
      setState(111);
      switch (_input.LA(1)) {
      case T__8:
      case T__10:
      case ACCIDENTAL:
      case NOTELETTER:
        enterOuterAlt(_localctx, 1);
        {
        setState(109);
        noteelement();
        }
        break;
      case T__12:
        enterOuterAlt(_localctx, 2);
        {
        setState(110);
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
    enterRule(_localctx, 20, RULE_noteelement);
    try {
      setState(115);
      switch (_input.LA(1)) {
      case T__10:
      case ACCIDENTAL:
      case NOTELETTER:
        enterOuterAlt(_localctx, 1);
        {
        setState(113);
        note();
        }
        break;
      case T__8:
        enterOuterAlt(_localctx, 2);
        {
        setState(114);
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
    enterRule(_localctx, 22, RULE_chord);
    int _la;
    try {
      enterOuterAlt(_localctx, 1);
      {
      setState(117);
      match(T__8);
      setState(119); 
      _errHandler.sync(this);
      _la = _input.LA(1);
      do {
        {
        {
        setState(118);
        note();
        }
        }
        setState(121); 
        _errHandler.sync(this);
        _la = _input.LA(1);
      } while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__10) | (1L << ACCIDENTAL) | (1L << NOTELETTER))) != 0) );
      setState(123);
      match(T__9);
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
    enterRule(_localctx, 24, RULE_note);
    try {
      setState(127);
      switch (_input.LA(1)) {
      case ACCIDENTAL:
      case NOTELETTER:
        enterOuterAlt(_localctx, 1);
        {
        setState(125);
        pitch();
        }
        break;
      case T__10:
        enterOuterAlt(_localctx, 2);
        {
        setState(126);
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
    enterRule(_localctx, 26, RULE_pitch);
    int _la;
    try {
      enterOuterAlt(_localctx, 1);
      {
      setState(130);
      _la = _input.LA(1);
      if (_la==ACCIDENTAL) {
        {
        setState(129);
        match(ACCIDENTAL);
        }
      }

      setState(132);
      match(NOTELETTER);
      setState(134);
      _la = _input.LA(1);
      if (_la==OCTAVE) {
        {
        setState(133);
        match(OCTAVE);
        }
      }

      setState(137);
      _la = _input.LA(1);
      if (_la==T__11 || _la==DIGIT) {
        {
        setState(136);
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
    enterRule(_localctx, 28, RULE_rest);
    int _la;
    try {
      enterOuterAlt(_localctx, 1);
      {
      setState(139);
      match(T__10);
      setState(141);
      _la = _input.LA(1);
      if (_la==T__11 || _la==DIGIT) {
        {
        setState(140);
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
    enterRule(_localctx, 30, RULE_notelength);
    int _la;
    try {
      setState(163);
      switch ( getInterpreter().adaptivePredict(_input,26,_ctx) ) {
      case 1:
        enterOuterAlt(_localctx, 1);
        {
        {
        setState(148);
        _la = _input.LA(1);
        if (_la==DIGIT) {
          {
          setState(144); 
          _errHandler.sync(this);
          _la = _input.LA(1);
          do {
            {
            {
            setState(143);
            match(DIGIT);
            }
            }
            setState(146); 
            _errHandler.sync(this);
            _la = _input.LA(1);
          } while ( _la==DIGIT );
          }
        }

        setState(150);
        match(T__11);
        setState(156);
        _la = _input.LA(1);
        if (_la==DIGIT) {
          {
          setState(152); 
          _errHandler.sync(this);
          _la = _input.LA(1);
          do {
            {
            {
            setState(151);
            match(DIGIT);
            }
            }
            setState(154); 
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
        setState(159); 
        _errHandler.sync(this);
        _la = _input.LA(1);
        do {
          {
          {
          setState(158);
          match(DIGIT);
          }
          }
          setState(161); 
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
    enterRule(_localctx, 32, RULE_tupletelement);
    try {
      int _alt;
      enterOuterAlt(_localctx, 1);
      {
      setState(165);
      tupletspec();
      setState(167); 
      _errHandler.sync(this);
      _alt = 1;
      do {
        switch (_alt) {
        case 1:
          {
          {
          setState(166);
          noteelement();
          }
          }
          break;
        default:
          throw new NoViableAltException(this);
        }
        setState(169); 
        _errHandler.sync(this);
        _alt = getInterpreter().adaptivePredict(_input,27,_ctx);
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
    enterRule(_localctx, 34, RULE_tupletspec);
    try {
      enterOuterAlt(_localctx, 1);
      {
      setState(171);
      match(T__12);
      setState(172);
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
    enterRule(_localctx, 36, RULE_comment);
    int _la;
    try {
      enterOuterAlt(_localctx, 1);
      {
      setState(174);
      match(T__13);
      setState(176); 
      _errHandler.sync(this);
      _la = _input.LA(1);
      do {
        {
        {
        setState(175);
        text();
        }
        }
        setState(178); 
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
    enterRule(_localctx, 38, RULE_text);
    int _la;
    try {
      enterOuterAlt(_localctx, 1);
      {
      setState(180);
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
    "\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3\31\u00b9\4\2\t"+
      "\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n"+
      "\4\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21"+
      "\4\22\t\22\4\23\t\23\4\24\t\24\4\25\t\25\3\2\3\2\3\2\3\3\6\3/\n\3"+
      "\r\3\16\3\60\3\4\3\4\3\4\3\4\3\4\3\4\5\49\n\4\3\5\3\5\7\5=\n\5\f\5"+
      "\16\5@\13\5\3\5\3\5\3\6\3\6\7\6F\n\6\f\6\16\6I\13\6\3\6\3\6\3\7\3"+
      "\7\6\7O\n\7\r\7\16\7P\3\7\3\7\5\7U\n\7\3\b\3\b\6\bY\n\b\r\b\16\bZ"+
      "\3\b\3\b\3\t\3\t\3\t\6\tb\n\t\r\t\16\tc\3\t\3\t\3\n\3\n\6\nj\n\n\r"+
      "\n\16\nk\3\n\3\n\3\13\3\13\5\13r\n\13\3\f\3\f\5\fv\n\f\3\r\3\r\6\r"+
      "z\n\r\r\r\16\r{\3\r\3\r\3\16\3\16\5\16\u0082\n\16\3\17\5\17\u0085"+
      "\n\17\3\17\3\17\5\17\u0089\n\17\3\17\5\17\u008c\n\17\3\20\3\20\5\20"+
      "\u0090\n\20\3\21\6\21\u0093\n\21\r\21\16\21\u0094\5\21\u0097\n\21"+
      "\3\21\3\21\6\21\u009b\n\21\r\21\16\21\u009c\5\21\u009f\n\21\3\21\6"+
      "\21\u00a2\n\21\r\21\16\21\u00a3\5\21\u00a6\n\21\3\22\3\22\6\22\u00aa"+
      "\n\22\r\22\16\22\u00ab\3\23\3\23\3\23\3\24\3\24\6\24\u00b3\n\24\r"+
      "\24\16\24\u00b4\3\25\3\25\3\25\2\2\26\2\4\6\b\n\f\16\20\22\24\26\30"+
      "\32\34\36 \"$&(\2\4\3\2\6\b\5\2\21\24\26\26\30\31\u00c5\2*\3\2\2\2"+
      "\4.\3\2\2\2\68\3\2\2\2\b:\3\2\2\2\nC\3\2\2\2\fN\3\2\2\2\16X\3\2\2"+
      "\2\20^\3\2\2\2\22i\3\2\2\2\24q\3\2\2\2\26u\3\2\2\2\30w\3\2\2\2\32"+
      "\u0081\3\2\2\2\34\u0084\3\2\2\2\36\u008d\3\2\2\2 \u00a5\3\2\2\2\""+
      "\u00a7\3\2\2\2$\u00ad\3\2\2\2&\u00b0\3\2\2\2(\u00b6\3\2\2\2*+\5\4"+
      "\3\2+,\7\2\2\3,\3\3\2\2\2-/\5\6\4\2.-\3\2\2\2/\60\3\2\2\2\60.\3\2"+
      "\2\2\60\61\3\2\2\2\61\5\3\2\2\2\629\5\f\7\2\639\5\20\t\2\649\5\16"+
      "\b\2\659\5\b\5\2\669\5\n\6\2\679\5\22\n\28\62\3\2\2\28\63\3\2\2\2"+
      "8\64\3\2\2\28\65\3\2\2\28\66\3\2\2\28\67\3\2\2\29\7\3\2\2\2:>\7\3"+
      "\2\2;=\5\f\7\2<;\3\2\2\2=@\3\2\2\2><\3\2\2\2>?\3\2\2\2?A\3\2\2\2@"+
      ">\3\2\2\2AB\5\22\n\2B\t\3\2\2\2CG\7\4\2\2DF\5\f\7\2ED\3\2\2\2FI\3"+
      "\2\2\2GE\3\2\2\2GH\3\2\2\2HJ\3\2\2\2IG\3\2\2\2JK\5\16\b\2K\13\3\2"+
      "\2\2LO\5\24\13\2MO\7\30\2\2NL\3\2\2\2NM\3\2\2\2OP\3\2\2\2PN\3\2\2"+
      "\2PQ\3\2\2\2QT\3\2\2\2RU\7\5\2\2SU\5\20\t\2TR\3\2\2\2TS\3\2\2\2U\r"+
      "\3\2\2\2VY\5\24\13\2WY\7\30\2\2XV\3\2\2\2XW\3\2\2\2YZ\3\2\2\2ZX\3"+
      "\2\2\2Z[\3\2\2\2[\\\3\2\2\2\\]\t\2\2\2]\17\3\2\2\2^a\7\t\2\2_b\5\24"+
      "\13\2`b\7\30\2\2a_\3\2\2\2a`\3\2\2\2bc\3\2\2\2ca\3\2\2\2cd\3\2\2\2"+
      "de\3\2\2\2ef\7\5\2\2f\21\3\2\2\2gj\5\24\13\2hj\7\30\2\2ig\3\2\2\2"+
      "ih\3\2\2\2jk\3\2\2\2ki\3\2\2\2kl\3\2\2\2lm\3\2\2\2mn\7\n\2\2n\23\3"+
      "\2\2\2or\5\26\f\2pr\5\"\22\2qo\3\2\2\2qp\3\2\2\2r\25\3\2\2\2sv\5\32"+
      "\16\2tv\5\30\r\2us\3\2\2\2ut\3\2\2\2v\27\3\2\2\2wy\7\13\2\2xz\5\32"+
      "\16\2yx\3\2\2\2z{\3\2\2\2{y\3\2\2\2{|\3\2\2\2|}\3\2\2\2}~\7\f\2\2"+
      "~\31\3\2\2\2\177\u0082\5\34\17\2\u0080\u0082\5\36\20\2\u0081\177\3"+
      "\2\2\2\u0081\u0080\3\2\2\2\u0082\33\3\2\2\2\u0083\u0085\7\21\2\2\u0084"+
      "\u0083\3\2\2\2\u0084\u0085\3\2\2\2\u0085\u0086\3\2\2\2\u0086\u0088"+
      "\7\26\2\2\u0087\u0089\7\22\2\2\u0088\u0087\3\2\2\2\u0088\u0089\3\2"+
      "\2\2\u0089\u008b\3\2\2\2\u008a\u008c\5 \21\2\u008b\u008a\3\2\2\2\u008b"+
      "\u008c\3\2\2\2\u008c\35\3\2\2\2\u008d\u008f\7\r\2\2\u008e\u0090\5"+
      " \21\2\u008f\u008e\3\2\2\2\u008f\u0090\3\2\2\2\u0090\37\3\2\2\2\u0091"+
      "\u0093\7\31\2\2\u0092\u0091\3\2\2\2\u0093\u0094\3\2\2\2\u0094\u0092"+
      "\3\2\2\2\u0094\u0095\3\2\2\2\u0095\u0097\3\2\2\2\u0096\u0092\3\2\2"+
      "\2\u0096\u0097\3\2\2\2\u0097\u0098\3\2\2\2\u0098\u009e\7\16\2\2\u0099"+
      "\u009b\7\31\2\2\u009a\u0099\3\2\2\2\u009b\u009c\3\2\2\2\u009c\u009a"+
      "\3\2\2\2\u009c\u009d\3\2\2\2\u009d\u009f\3\2\2\2\u009e\u009a\3\2\2"+
      "\2\u009e\u009f\3\2\2\2\u009f\u00a6\3\2\2\2\u00a0\u00a2\7\31\2\2\u00a1"+
      "\u00a0\3\2\2\2\u00a2\u00a3\3\2\2\2\u00a3\u00a1\3\2\2\2\u00a3\u00a4"+
      "\3\2\2\2\u00a4\u00a6\3\2\2\2\u00a5\u0096\3\2\2\2\u00a5\u00a1\3\2\2"+
      "\2\u00a6!\3\2\2\2\u00a7\u00a9\5$\23\2\u00a8\u00aa\5\26\f\2\u00a9\u00a8"+
      "\3\2\2\2\u00aa\u00ab\3\2\2\2\u00ab\u00a9\3\2\2\2\u00ab\u00ac\3\2\2"+
      "\2\u00ac#\3\2\2\2\u00ad\u00ae\7\17\2\2\u00ae\u00af\7\31\2\2\u00af"+
      "%\3\2\2\2\u00b0\u00b2\7\20\2\2\u00b1\u00b3\5(\25\2\u00b2\u00b1\3\2"+
      "\2\2\u00b3\u00b4\3\2\2\2\u00b4\u00b2\3\2\2\2\u00b4\u00b5\3\2\2\2\u00b5"+
      "\'\3\2\2\2\u00b6\u00b7\t\3\2\2\u00b7)\3\2\2\2\37\608>GNPTXZacikqu"+
      "{\u0081\u0084\u0088\u008b\u008f\u0094\u0096\u009c\u009e\u00a3\u00a5"+
      "\u00ab\u00b4";
  public static final ATN _ATN =
    new ATNDeserializer().deserialize(_serializedATN.toCharArray());
  static {
    _decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
    for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
      _decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
    }
  }
}