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
    null, "'|'", "'[1'", "'[2'", "'||'", "'[|'", "'|]'", "'|:'", "':|'", 
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
      _la = _input.LA(1);
      if (_la==T__0) {
        {
        setState(43);
        match(T__0);
        }
      }

      setState(47); 
      _errHandler.sync(this);
      _la = _input.LA(1);
      do {
        {
        {
        setState(46);
        measure();
        }
        }
        setState(49); 
        _errHandler.sync(this);
        _la = _input.LA(1);
      } while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__1) | (1L << T__2) | (1L << T__6) | (1L << T__8) | (1L << T__10) | (1L << T__12) | (1L << ACCIDENTAL) | (1L << NOTELETTER) | (1L << WHITESPACE))) != 0) );
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
      setState(57);
      switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
      case 1:
        enterOuterAlt(_localctx, 1);
        {
        setState(51);
        normalmeasure();
        }
        break;
      case 2:
        enterOuterAlt(_localctx, 2);
        {
        setState(52);
        startrepeatmeasure();
        }
        break;
      case 3:
        enterOuterAlt(_localctx, 3);
        {
        setState(53);
        doublebarmeasure();
        }
        break;
      case 4:
        enterOuterAlt(_localctx, 4);
        {
        setState(54);
        firstendingmeasure();
        }
        break;
      case 5:
        enterOuterAlt(_localctx, 5);
        {
        setState(55);
        secondendingmeasure();
        }
        break;
      case 6:
        enterOuterAlt(_localctx, 6);
        {
        setState(56);
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
      setState(59);
      match(T__1);
      setState(63);
      _errHandler.sync(this);
      _alt = getInterpreter().adaptivePredict(_input,3,_ctx);
      while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
        if ( _alt==1 ) {
          {
          {
          setState(60);
          normalmeasure();
          }
          } 
        }
        setState(65);
        _errHandler.sync(this);
        _alt = getInterpreter().adaptivePredict(_input,3,_ctx);
      }
      setState(66);
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
    public List<NormalmeasureContext> normalmeasure() {
      return getRuleContexts(NormalmeasureContext.class);
    }
    public NormalmeasureContext normalmeasure(int i) {
      return getRuleContext(NormalmeasureContext.class,i);
    }
    public DoublebarmeasureContext doublebarmeasure() {
      return getRuleContext(DoublebarmeasureContext.class,0);
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
      setState(68);
      match(T__2);
      setState(72);
      _errHandler.sync(this);
      _alt = getInterpreter().adaptivePredict(_input,4,_ctx);
      while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
        if ( _alt==1 ) {
          {
          {
          setState(69);
          normalmeasure();
          }
          } 
        }
        setState(74);
        _errHandler.sync(this);
        _alt = getInterpreter().adaptivePredict(_input,4,_ctx);
      }
      setState(76);
      switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
      case 1:
        {
        setState(75);
        doublebarmeasure();
        }
        break;
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
      setState(80); 
      _errHandler.sync(this);
      _la = _input.LA(1);
      do {
        {
        setState(80);
        switch (_input.LA(1)) {
        case T__8:
        case T__10:
        case T__12:
        case ACCIDENTAL:
        case NOTELETTER:
          {
          setState(78);
          element();
          }
          break;
        case WHITESPACE:
          {
          setState(79);
          match(WHITESPACE);
          }
          break;
        default:
          throw new NoViableAltException(this);
        }
        }
        setState(82); 
        _errHandler.sync(this);
        _la = _input.LA(1);
      } while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__8) | (1L << T__10) | (1L << T__12) | (1L << ACCIDENTAL) | (1L << NOTELETTER) | (1L << WHITESPACE))) != 0) );
      setState(86);
      switch (_input.LA(1)) {
      case T__0:
        {
        setState(84);
        match(T__0);
        }
        break;
      case T__6:
        {
        setState(85);
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
      setState(90); 
      _errHandler.sync(this);
      _la = _input.LA(1);
      do {
        {
        setState(90);
        switch (_input.LA(1)) {
        case T__8:
        case T__10:
        case T__12:
        case ACCIDENTAL:
        case NOTELETTER:
          {
          setState(88);
          element();
          }
          break;
        case WHITESPACE:
          {
          setState(89);
          match(WHITESPACE);
          }
          break;
        default:
          throw new NoViableAltException(this);
        }
        }
        setState(92); 
        _errHandler.sync(this);
        _la = _input.LA(1);
      } while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__8) | (1L << T__10) | (1L << T__12) | (1L << ACCIDENTAL) | (1L << NOTELETTER) | (1L << WHITESPACE))) != 0) );
      setState(94);
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
      setState(96);
      match(T__6);
      setState(99); 
      _errHandler.sync(this);
      _la = _input.LA(1);
      do {
        {
        setState(99);
        switch (_input.LA(1)) {
        case T__8:
        case T__10:
        case T__12:
        case ACCIDENTAL:
        case NOTELETTER:
          {
          setState(97);
          element();
          }
          break;
        case WHITESPACE:
          {
          setState(98);
          match(WHITESPACE);
          }
          break;
        default:
          throw new NoViableAltException(this);
        }
        }
        setState(101); 
        _errHandler.sync(this);
        _la = _input.LA(1);
      } while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__8) | (1L << T__10) | (1L << T__12) | (1L << ACCIDENTAL) | (1L << NOTELETTER) | (1L << WHITESPACE))) != 0) );
      {
      setState(103);
      match(T__0);
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
      setState(107); 
      _errHandler.sync(this);
      _la = _input.LA(1);
      do {
        {
        setState(107);
        switch (_input.LA(1)) {
        case T__8:
        case T__10:
        case T__12:
        case ACCIDENTAL:
        case NOTELETTER:
          {
          setState(105);
          element();
          }
          break;
        case WHITESPACE:
          {
          setState(106);
          match(WHITESPACE);
          }
          break;
        default:
          throw new NoViableAltException(this);
        }
        }
        setState(109); 
        _errHandler.sync(this);
        _la = _input.LA(1);
      } while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__8) | (1L << T__10) | (1L << T__12) | (1L << ACCIDENTAL) | (1L << NOTELETTER) | (1L << WHITESPACE))) != 0) );
      setState(111);
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
      setState(115);
      switch (_input.LA(1)) {
      case T__8:
      case T__10:
      case ACCIDENTAL:
      case NOTELETTER:
        enterOuterAlt(_localctx, 1);
        {
        setState(113);
        noteelement();
        }
        break;
      case T__12:
        enterOuterAlt(_localctx, 2);
        {
        setState(114);
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
      setState(119);
      switch (_input.LA(1)) {
      case T__10:
      case ACCIDENTAL:
      case NOTELETTER:
        enterOuterAlt(_localctx, 1);
        {
        setState(117);
        note();
        }
        break;
      case T__8:
        enterOuterAlt(_localctx, 2);
        {
        setState(118);
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
      setState(121);
      match(T__8);
      setState(123); 
      _errHandler.sync(this);
      _la = _input.LA(1);
      do {
        {
        {
        setState(122);
        note();
        }
        }
        setState(125); 
        _errHandler.sync(this);
        _la = _input.LA(1);
      } while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__10) | (1L << ACCIDENTAL) | (1L << NOTELETTER))) != 0) );
      setState(127);
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
      setState(131);
      switch (_input.LA(1)) {
      case ACCIDENTAL:
      case NOTELETTER:
        enterOuterAlt(_localctx, 1);
        {
        setState(129);
        pitch();
        }
        break;
      case T__10:
        enterOuterAlt(_localctx, 2);
        {
        setState(130);
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
      setState(134);
      _la = _input.LA(1);
      if (_la==ACCIDENTAL) {
        {
        setState(133);
        match(ACCIDENTAL);
        }
      }

      setState(136);
      match(NOTELETTER);
      setState(138);
      _la = _input.LA(1);
      if (_la==OCTAVE) {
        {
        setState(137);
        match(OCTAVE);
        }
      }

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
      setState(143);
      match(T__10);
      setState(145);
      _la = _input.LA(1);
      if (_la==T__11 || _la==DIGIT) {
        {
        setState(144);
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
      setState(167);
      switch ( getInterpreter().adaptivePredict(_input,28,_ctx) ) {
      case 1:
        enterOuterAlt(_localctx, 1);
        {
        {
        setState(152);
        _la = _input.LA(1);
        if (_la==DIGIT) {
          {
          setState(148); 
          _errHandler.sync(this);
          _la = _input.LA(1);
          do {
            {
            {
            setState(147);
            match(DIGIT);
            }
            }
            setState(150); 
            _errHandler.sync(this);
            _la = _input.LA(1);
          } while ( _la==DIGIT );
          }
        }

        setState(154);
        match(T__11);
        setState(160);
        _la = _input.LA(1);
        if (_la==DIGIT) {
          {
          setState(156); 
          _errHandler.sync(this);
          _la = _input.LA(1);
          do {
            {
            {
            setState(155);
            match(DIGIT);
            }
            }
            setState(158); 
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
      setState(169);
      tupletspec();
      setState(171); 
      _errHandler.sync(this);
      _alt = 1;
      do {
        switch (_alt) {
        case 1:
          {
          {
          setState(170);
          noteelement();
          }
          }
          break;
        default:
          throw new NoViableAltException(this);
        }
        setState(173); 
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
    enterRule(_localctx, 34, RULE_tupletspec);
    try {
      enterOuterAlt(_localctx, 1);
      {
      setState(175);
      match(T__12);
      setState(176);
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
      setState(178);
      match(T__13);
      setState(180); 
      _errHandler.sync(this);
      _la = _input.LA(1);
      do {
        {
        {
        setState(179);
        text();
        }
        }
        setState(182); 
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
      setState(184);
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
    "\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3\31\u00bd\4\2\t"+
      "\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n"+
      "\4\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21"+
      "\4\22\t\22\4\23\t\23\4\24\t\24\4\25\t\25\3\2\3\2\3\2\3\3\5\3/\n\3"+
      "\3\3\6\3\62\n\3\r\3\16\3\63\3\4\3\4\3\4\3\4\3\4\3\4\5\4<\n\4\3\5\3"+
      "\5\7\5@\n\5\f\5\16\5C\13\5\3\5\3\5\3\6\3\6\7\6I\n\6\f\6\16\6L\13\6"+
      "\3\6\5\6O\n\6\3\7\3\7\6\7S\n\7\r\7\16\7T\3\7\3\7\5\7Y\n\7\3\b\3\b"+
      "\6\b]\n\b\r\b\16\b^\3\b\3\b\3\t\3\t\3\t\6\tf\n\t\r\t\16\tg\3\t\3\t"+
      "\3\n\3\n\6\nn\n\n\r\n\16\no\3\n\3\n\3\13\3\13\5\13v\n\13\3\f\3\f\5"+
      "\fz\n\f\3\r\3\r\6\r~\n\r\r\r\16\r\177\3\r\3\r\3\16\3\16\5\16\u0086"+
      "\n\16\3\17\5\17\u0089\n\17\3\17\3\17\5\17\u008d\n\17\3\17\5\17\u0090"+
      "\n\17\3\20\3\20\5\20\u0094\n\20\3\21\6\21\u0097\n\21\r\21\16\21\u0098"+
      "\5\21\u009b\n\21\3\21\3\21\6\21\u009f\n\21\r\21\16\21\u00a0\5\21\u00a3"+
      "\n\21\3\21\6\21\u00a6\n\21\r\21\16\21\u00a7\5\21\u00aa\n\21\3\22\3"+
      "\22\6\22\u00ae\n\22\r\22\16\22\u00af\3\23\3\23\3\23\3\24\3\24\6\24"+
      "\u00b7\n\24\r\24\16\24\u00b8\3\25\3\25\3\25\2\2\26\2\4\6\b\n\f\16"+
      "\20\22\24\26\30\32\34\36 \"$&(\2\4\3\2\6\b\5\2\21\24\26\26\30\31\u00cb"+
      "\2*\3\2\2\2\4.\3\2\2\2\6;\3\2\2\2\b=\3\2\2\2\nF\3\2\2\2\fR\3\2\2\2"+
      "\16\\\3\2\2\2\20b\3\2\2\2\22m\3\2\2\2\24u\3\2\2\2\26y\3\2\2\2\30{"+
      "\3\2\2\2\32\u0085\3\2\2\2\34\u0088\3\2\2\2\36\u0091\3\2\2\2 \u00a9"+
      "\3\2\2\2\"\u00ab\3\2\2\2$\u00b1\3\2\2\2&\u00b4\3\2\2\2(\u00ba\3\2"+
      "\2\2*+\5\4\3\2+,\7\2\2\3,\3\3\2\2\2-/\7\3\2\2.-\3\2\2\2./\3\2\2\2"+
      "/\61\3\2\2\2\60\62\5\6\4\2\61\60\3\2\2\2\62\63\3\2\2\2\63\61\3\2\2"+
      "\2\63\64\3\2\2\2\64\5\3\2\2\2\65<\5\f\7\2\66<\5\20\t\2\67<\5\16\b"+
      "\28<\5\b\5\29<\5\n\6\2:<\5\22\n\2;\65\3\2\2\2;\66\3\2\2\2;\67\3\2"+
      "\2\2;8\3\2\2\2;9\3\2\2\2;:\3\2\2\2<\7\3\2\2\2=A\7\4\2\2>@\5\f\7\2"+
      "?>\3\2\2\2@C\3\2\2\2A?\3\2\2\2AB\3\2\2\2BD\3\2\2\2CA\3\2\2\2DE\5\22"+
      "\n\2E\t\3\2\2\2FJ\7\5\2\2GI\5\f\7\2HG\3\2\2\2IL\3\2\2\2JH\3\2\2\2"+
      "JK\3\2\2\2KN\3\2\2\2LJ\3\2\2\2MO\5\16\b\2NM\3\2\2\2NO\3\2\2\2O\13"+
      "\3\2\2\2PS\5\24\13\2QS\7\30\2\2RP\3\2\2\2RQ\3\2\2\2ST\3\2\2\2TR\3"+
      "\2\2\2TU\3\2\2\2UX\3\2\2\2VY\7\3\2\2WY\5\20\t\2XV\3\2\2\2XW\3\2\2"+
      "\2Y\r\3\2\2\2Z]\5\24\13\2[]\7\30\2\2\\Z\3\2\2\2\\[\3\2\2\2]^\3\2\2"+
      "\2^\\\3\2\2\2^_\3\2\2\2_`\3\2\2\2`a\t\2\2\2a\17\3\2\2\2be\7\t\2\2"+
      "cf\5\24\13\2df\7\30\2\2ec\3\2\2\2ed\3\2\2\2fg\3\2\2\2ge\3\2\2\2gh"+
      "\3\2\2\2hi\3\2\2\2ij\7\3\2\2j\21\3\2\2\2kn\5\24\13\2ln\7\30\2\2mk"+
      "\3\2\2\2ml\3\2\2\2no\3\2\2\2om\3\2\2\2op\3\2\2\2pq\3\2\2\2qr\7\n\2"+
      "\2r\23\3\2\2\2sv\5\26\f\2tv\5\"\22\2us\3\2\2\2ut\3\2\2\2v\25\3\2\2"+
      "\2wz\5\32\16\2xz\5\30\r\2yw\3\2\2\2yx\3\2\2\2z\27\3\2\2\2{}\7\13\2"+
      "\2|~\5\32\16\2}|\3\2\2\2~\177\3\2\2\2\177}\3\2\2\2\177\u0080\3\2\2"+
      "\2\u0080\u0081\3\2\2\2\u0081\u0082\7\f\2\2\u0082\31\3\2\2\2\u0083"+
      "\u0086\5\34\17\2\u0084\u0086\5\36\20\2\u0085\u0083\3\2\2\2\u0085\u0084"+
      "\3\2\2\2\u0086\33\3\2\2\2\u0087\u0089\7\21\2\2\u0088\u0087\3\2\2\2"+
      "\u0088\u0089\3\2\2\2\u0089\u008a\3\2\2\2\u008a\u008c\7\26\2\2\u008b"+
      "\u008d\7\22\2\2\u008c\u008b\3\2\2\2\u008c\u008d\3\2\2\2\u008d\u008f"+
      "\3\2\2\2\u008e\u0090\5 \21\2\u008f\u008e\3\2\2\2\u008f\u0090\3\2\2"+
      "\2\u0090\35\3\2\2\2\u0091\u0093\7\r\2\2\u0092\u0094\5 \21\2\u0093"+
      "\u0092\3\2\2\2\u0093\u0094\3\2\2\2\u0094\37\3\2\2\2\u0095\u0097\7"+
      "\31\2\2\u0096\u0095\3\2\2\2\u0097\u0098\3\2\2\2\u0098\u0096\3\2\2"+
      "\2\u0098\u0099\3\2\2\2\u0099\u009b\3\2\2\2\u009a\u0096\3\2\2\2\u009a"+
      "\u009b\3\2\2\2\u009b\u009c\3\2\2\2\u009c\u00a2\7\16\2\2\u009d\u009f"+
      "\7\31\2\2\u009e\u009d\3\2\2\2\u009f\u00a0\3\2\2\2\u00a0\u009e\3\2"+
      "\2\2\u00a0\u00a1\3\2\2\2\u00a1\u00a3\3\2\2\2\u00a2\u009e\3\2\2\2\u00a2"+
      "\u00a3\3\2\2\2\u00a3\u00aa\3\2\2\2\u00a4\u00a6\7\31\2\2\u00a5\u00a4"+
      "\3\2\2\2\u00a6\u00a7\3\2\2\2\u00a7\u00a5\3\2\2\2\u00a7\u00a8\3\2\2"+
      "\2\u00a8\u00aa\3\2\2\2\u00a9\u009a\3\2\2\2\u00a9\u00a5\3\2\2\2\u00aa"+
      "!\3\2\2\2\u00ab\u00ad\5$\23\2\u00ac\u00ae\5\26\f\2\u00ad\u00ac\3\2"+
      "\2\2\u00ae\u00af\3\2\2\2\u00af\u00ad\3\2\2\2\u00af\u00b0\3\2\2\2\u00b0"+
      "#\3\2\2\2\u00b1\u00b2\7\17\2\2\u00b2\u00b3\7\31\2\2\u00b3%\3\2\2\2"+
      "\u00b4\u00b6\7\20\2\2\u00b5\u00b7\5(\25\2\u00b6\u00b5\3\2\2\2\u00b7"+
      "\u00b8\3\2\2\2\u00b8\u00b6\3\2\2\2\u00b8\u00b9\3\2\2\2\u00b9\'\3\2"+
      "\2\2\u00ba\u00bb\t\3\2\2\u00bb)\3\2\2\2!.\63;AJNRTX\\^egmouy\177\u0085"+
      "\u0088\u008c\u008f\u0093\u0098\u009a\u00a0\u00a2\u00a7\u00a9\u00af"+
      "\u00b8";
  public static final ATN _ATN =
    new ATNDeserializer().deserialize(_serializedATN.toCharArray());
  static {
    _decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
    for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
      _decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
    }
  }
}