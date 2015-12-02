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
    T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, NOTELETTER=8, 
    OCTAVE=9, ACCIDENTAL=10, BARLINE=11, NUMREPEAT=12, NEWLINE=13, WHITESPACE=14, 
    DIGIT=15;
  public static final int
    RULE_root = 0, RULE_music = 1, RULE_element = 2, RULE_midtune = 3, RULE_voice = 4, 
    RULE_numnote = 5, RULE_multinote = 6, RULE_note = 7, RULE_ispitch = 8, 
    RULE_pitch = 9, RULE_rest = 10, RULE_notelength = 11, RULE_tuplet = 12, 
    RULE_tupletspec = 13, RULE_comment = 14, RULE_text = 15;
  public static final String[] ruleNames = {
    "root", "music", "element", "midtune", "voice", "numnote", "multinote", 
    "note", "ispitch", "pitch", "rest", "notelength", "tuplet", "tupletspec", 
    "comment", "text"
  };

  private static final String[] _LITERAL_NAMES = {
    null, "'V:'", "'['", "']'", "'z'", "'/'", "'('", "'%'"
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
      setState(32);
      music();
      setState(33);
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
    public TerminalNode NEWLINE() { return getToken(MusicParser.NEWLINE, 0); }
    public List<ElementContext> element() {
      return getRuleContexts(ElementContext.class);
    }
    public ElementContext element(int i) {
      return getRuleContext(ElementContext.class,i);
    }
    public MidtuneContext midtune() {
      return getRuleContext(MidtuneContext.class,0);
    }
    public CommentContext comment() {
      return getRuleContext(CommentContext.class,0);
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
      setState(44);
      switch (_input.LA(1)) {
      case T__1:
      case T__3:
      case T__5:
      case NOTELETTER:
      case ACCIDENTAL:
      case BARLINE:
      case NUMREPEAT:
      case WHITESPACE:
        enterOuterAlt(_localctx, 1);
        {
        setState(36); 
        _errHandler.sync(this);
        _la = _input.LA(1);
        do {
          {
          {
          setState(35);
          element();
          }
          }
          setState(38); 
          _errHandler.sync(this);
          _la = _input.LA(1);
        } while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__1) | (1L << T__3) | (1L << T__5) | (1L << NOTELETTER) | (1L << ACCIDENTAL) | (1L << BARLINE) | (1L << NUMREPEAT) | (1L << WHITESPACE))) != 0) );
        setState(40);
        match(NEWLINE);
        }
        break;
      case T__0:
        enterOuterAlt(_localctx, 2);
        {
        setState(42);
        midtune();
        }
        break;
      case T__6:
        enterOuterAlt(_localctx, 3);
        {
        setState(43);
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

  public static class ElementContext extends ParserRuleContext {
    public NumnoteContext numnote() {
      return getRuleContext(NumnoteContext.class,0);
    }
    public TupletContext tuplet() {
      return getRuleContext(TupletContext.class,0);
    }
    public TerminalNode BARLINE() { return getToken(MusicParser.BARLINE, 0); }
    public TerminalNode NUMREPEAT() { return getToken(MusicParser.NUMREPEAT, 0); }
    public TerminalNode WHITESPACE() { return getToken(MusicParser.WHITESPACE, 0); }
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
    enterRule(_localctx, 4, RULE_element);
    try {
      setState(51);
      switch (_input.LA(1)) {
      case T__1:
      case T__3:
      case NOTELETTER:
      case ACCIDENTAL:
        enterOuterAlt(_localctx, 1);
        {
        setState(46);
        numnote();
        }
        break;
      case T__5:
        enterOuterAlt(_localctx, 2);
        {
        setState(47);
        tuplet();
        }
        break;
      case BARLINE:
        enterOuterAlt(_localctx, 3);
        {
        setState(48);
        match(BARLINE);
        }
        break;
      case NUMREPEAT:
        enterOuterAlt(_localctx, 4);
        {
        setState(49);
        match(NUMREPEAT);
        }
        break;
      case WHITESPACE:
        enterOuterAlt(_localctx, 5);
        {
        setState(50);
        match(WHITESPACE);
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

  public static class MidtuneContext extends ParserRuleContext {
    public VoiceContext voice() {
      return getRuleContext(VoiceContext.class,0);
    }
    public MidtuneContext(ParserRuleContext parent, int invokingState) {
      super(parent, invokingState);
    }
    @Override public int getRuleIndex() { return RULE_midtune; }
    @Override
    public void enterRule(ParseTreeListener listener) {
      if ( listener instanceof MusicListener ) ((MusicListener)listener).enterMidtune(this);
    }
    @Override
    public void exitRule(ParseTreeListener listener) {
      if ( listener instanceof MusicListener ) ((MusicListener)listener).exitMidtune(this);
    }
  }

  public final MidtuneContext midtune() throws RecognitionException {
    MidtuneContext _localctx = new MidtuneContext(_ctx, getState());
    enterRule(_localctx, 6, RULE_midtune);
    try {
      enterOuterAlt(_localctx, 1);
      {
      setState(53);
      voice();
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
    public TextContext text() {
      return getRuleContext(TextContext.class,0);
    }
    public TerminalNode NEWLINE() { return getToken(MusicParser.NEWLINE, 0); }
    public VoiceContext(ParserRuleContext parent, int invokingState) {
      super(parent, invokingState);
    }
    @Override public int getRuleIndex() { return RULE_voice; }
    @Override
    public void enterRule(ParseTreeListener listener) {
      if ( listener instanceof MusicListener ) ((MusicListener)listener).enterVoice(this);
    }
    @Override
    public void exitRule(ParseTreeListener listener) {
      if ( listener instanceof MusicListener ) ((MusicListener)listener).exitVoice(this);
    }
  }

  public final VoiceContext voice() throws RecognitionException {
    VoiceContext _localctx = new VoiceContext(_ctx, getState());
    enterRule(_localctx, 8, RULE_voice);
    try {
      enterOuterAlt(_localctx, 1);
      {
      setState(55);
      match(T__0);
      setState(56);
      text();
      setState(57);
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

  public static class NumnoteContext extends ParserRuleContext {
    public NoteContext note() {
      return getRuleContext(NoteContext.class,0);
    }
    public MultinoteContext multinote() {
      return getRuleContext(MultinoteContext.class,0);
    }
    public NumnoteContext(ParserRuleContext parent, int invokingState) {
      super(parent, invokingState);
    }
    @Override public int getRuleIndex() { return RULE_numnote; }
    @Override
    public void enterRule(ParseTreeListener listener) {
      if ( listener instanceof MusicListener ) ((MusicListener)listener).enterNumnote(this);
    }
    @Override
    public void exitRule(ParseTreeListener listener) {
      if ( listener instanceof MusicListener ) ((MusicListener)listener).exitNumnote(this);
    }
  }

  public final NumnoteContext numnote() throws RecognitionException {
    NumnoteContext _localctx = new NumnoteContext(_ctx, getState());
    enterRule(_localctx, 10, RULE_numnote);
    try {
      setState(61);
      switch (_input.LA(1)) {
      case T__3:
      case NOTELETTER:
      case ACCIDENTAL:
        enterOuterAlt(_localctx, 1);
        {
        setState(59);
        note();
        }
        break;
      case T__1:
        enterOuterAlt(_localctx, 2);
        {
        setState(60);
        multinote();
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

  public static class MultinoteContext extends ParserRuleContext {
    public List<NoteContext> note() {
      return getRuleContexts(NoteContext.class);
    }
    public NoteContext note(int i) {
      return getRuleContext(NoteContext.class,i);
    }
    public MultinoteContext(ParserRuleContext parent, int invokingState) {
      super(parent, invokingState);
    }
    @Override public int getRuleIndex() { return RULE_multinote; }
    @Override
    public void enterRule(ParseTreeListener listener) {
      if ( listener instanceof MusicListener ) ((MusicListener)listener).enterMultinote(this);
    }
    @Override
    public void exitRule(ParseTreeListener listener) {
      if ( listener instanceof MusicListener ) ((MusicListener)listener).exitMultinote(this);
    }
  }

  public final MultinoteContext multinote() throws RecognitionException {
    MultinoteContext _localctx = new MultinoteContext(_ctx, getState());
    enterRule(_localctx, 12, RULE_multinote);
    int _la;
    try {
      enterOuterAlt(_localctx, 1);
      {
      setState(63);
      match(T__1);
      setState(65); 
      _errHandler.sync(this);
      _la = _input.LA(1);
      do {
        {
        {
        setState(64);
        note();
        }
        }
        setState(67); 
        _errHandler.sync(this);
        _la = _input.LA(1);
      } while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__3) | (1L << NOTELETTER) | (1L << ACCIDENTAL))) != 0) );
      setState(69);
      match(T__2);
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
    public IspitchContext ispitch() {
      return getRuleContext(IspitchContext.class,0);
    }
    public NotelengthContext notelength() {
      return getRuleContext(NotelengthContext.class,0);
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
    enterRule(_localctx, 14, RULE_note);
    try {
      enterOuterAlt(_localctx, 1);
      {
      setState(71);
      ispitch();
      setState(72);
      notelength();
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

  public static class IspitchContext extends ParserRuleContext {
    public PitchContext pitch() {
      return getRuleContext(PitchContext.class,0);
    }
    public RestContext rest() {
      return getRuleContext(RestContext.class,0);
    }
    public IspitchContext(ParserRuleContext parent, int invokingState) {
      super(parent, invokingState);
    }
    @Override public int getRuleIndex() { return RULE_ispitch; }
    @Override
    public void enterRule(ParseTreeListener listener) {
      if ( listener instanceof MusicListener ) ((MusicListener)listener).enterIspitch(this);
    }
    @Override
    public void exitRule(ParseTreeListener listener) {
      if ( listener instanceof MusicListener ) ((MusicListener)listener).exitIspitch(this);
    }
  }

  public final IspitchContext ispitch() throws RecognitionException {
    IspitchContext _localctx = new IspitchContext(_ctx, getState());
    enterRule(_localctx, 16, RULE_ispitch);
    try {
      setState(76);
      switch (_input.LA(1)) {
      case NOTELETTER:
      case ACCIDENTAL:
        enterOuterAlt(_localctx, 1);
        {
        setState(74);
        pitch();
        }
        break;
      case T__3:
        enterOuterAlt(_localctx, 2);
        {
        setState(75);
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
    enterRule(_localctx, 18, RULE_pitch);
    int _la;
    try {
      enterOuterAlt(_localctx, 1);
      {
      setState(79);
      _la = _input.LA(1);
      if (_la==ACCIDENTAL) {
        {
        setState(78);
        match(ACCIDENTAL);
        }
      }

      setState(81);
      match(NOTELETTER);
      setState(83);
      _la = _input.LA(1);
      if (_la==OCTAVE) {
        {
        setState(82);
        match(OCTAVE);
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
    public List<TerminalNode> DIGIT() { return getTokens(MusicParser.DIGIT); }
    public TerminalNode DIGIT(int i) {
      return getToken(MusicParser.DIGIT, i);
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
    enterRule(_localctx, 20, RULE_rest);
    try {
      int _alt;
      enterOuterAlt(_localctx, 1);
      {
      setState(85);
      match(T__3);
      setState(91);
      switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
      case 1:
        {
        setState(87); 
        _errHandler.sync(this);
        _alt = 1;
        do {
          switch (_alt) {
          case 1:
            {
            {
            setState(86);
            match(DIGIT);
            }
            }
            break;
          default:
            throw new NoViableAltException(this);
          }
          setState(89); 
          _errHandler.sync(this);
          _alt = getInterpreter().adaptivePredict(_input,8,_ctx);
        } while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
        }
        break;
      }
      setState(94);
      switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
      case 1:
        {
        setState(93);
        match(T__4);
        }
        break;
      }
      setState(101);
      switch ( getInterpreter().adaptivePredict(_input,12,_ctx) ) {
      case 1:
        {
        setState(97); 
        _errHandler.sync(this);
        _alt = 1;
        do {
          switch (_alt) {
          case 1:
            {
            {
            setState(96);
            match(DIGIT);
            }
            }
            break;
          default:
            throw new NoViableAltException(this);
          }
          setState(99); 
          _errHandler.sync(this);
          _alt = getInterpreter().adaptivePredict(_input,11,_ctx);
        } while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
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
    enterRule(_localctx, 22, RULE_notelength);
    int _la;
    try {
      int _alt;
      enterOuterAlt(_localctx, 1);
      {
      setState(108);
      switch ( getInterpreter().adaptivePredict(_input,14,_ctx) ) {
      case 1:
        {
        setState(104); 
        _errHandler.sync(this);
        _alt = 1;
        do {
          switch (_alt) {
          case 1:
            {
            {
            setState(103);
            match(DIGIT);
            }
            }
            break;
          default:
            throw new NoViableAltException(this);
          }
          setState(106); 
          _errHandler.sync(this);
          _alt = getInterpreter().adaptivePredict(_input,13,_ctx);
        } while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
        }
        break;
      }
      setState(111);
      _la = _input.LA(1);
      if (_la==T__4) {
        {
        setState(110);
        match(T__4);
        }
      }

      setState(118);
      _la = _input.LA(1);
      if (_la==DIGIT) {
        {
        setState(114); 
        _errHandler.sync(this);
        _la = _input.LA(1);
        do {
          {
          {
          setState(113);
          match(DIGIT);
          }
          }
          setState(116); 
          _errHandler.sync(this);
          _la = _input.LA(1);
        } while ( _la==DIGIT );
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

  public static class TupletContext extends ParserRuleContext {
    public TupletspecContext tupletspec() {
      return getRuleContext(TupletspecContext.class,0);
    }
    public List<NumnoteContext> numnote() {
      return getRuleContexts(NumnoteContext.class);
    }
    public NumnoteContext numnote(int i) {
      return getRuleContext(NumnoteContext.class,i);
    }
    public TupletContext(ParserRuleContext parent, int invokingState) {
      super(parent, invokingState);
    }
    @Override public int getRuleIndex() { return RULE_tuplet; }
    @Override
    public void enterRule(ParseTreeListener listener) {
      if ( listener instanceof MusicListener ) ((MusicListener)listener).enterTuplet(this);
    }
    @Override
    public void exitRule(ParseTreeListener listener) {
      if ( listener instanceof MusicListener ) ((MusicListener)listener).exitTuplet(this);
    }
  }

  public final TupletContext tuplet() throws RecognitionException {
    TupletContext _localctx = new TupletContext(_ctx, getState());
    enterRule(_localctx, 24, RULE_tuplet);
    try {
      int _alt;
      enterOuterAlt(_localctx, 1);
      {
      setState(120);
      tupletspec();
      setState(122); 
      _errHandler.sync(this);
      _alt = 1;
      do {
        switch (_alt) {
        case 1:
          {
          {
          setState(121);
          numnote();
          }
          }
          break;
        default:
          throw new NoViableAltException(this);
        }
        setState(124); 
        _errHandler.sync(this);
        _alt = getInterpreter().adaptivePredict(_input,18,_ctx);
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
    enterRule(_localctx, 26, RULE_tupletspec);
    try {
      enterOuterAlt(_localctx, 1);
      {
      setState(126);
      match(T__5);
      setState(127);
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
    public TerminalNode NEWLINE() { return getToken(MusicParser.NEWLINE, 0); }
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
    enterRule(_localctx, 28, RULE_comment);
    int _la;
    try {
      enterOuterAlt(_localctx, 1);
      {
      setState(129);
      match(T__6);
      setState(131); 
      _errHandler.sync(this);
      _la = _input.LA(1);
      do {
        {
        {
        setState(130);
        text();
        }
        }
        setState(133); 
        _errHandler.sync(this);
        _la = _input.LA(1);
      } while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__1) | (1L << T__2) | (1L << T__3) | (1L << T__4) | (1L << T__5) | (1L << T__6) | (1L << NOTELETTER) | (1L << OCTAVE) | (1L << ACCIDENTAL) | (1L << BARLINE) | (1L << NUMREPEAT) | (1L << WHITESPACE) | (1L << DIGIT))) != 0) );
      setState(135);
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
    public TerminalNode NEWLINE() { return getToken(MusicParser.NEWLINE, 0); }
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
    enterRule(_localctx, 30, RULE_text);
    int _la;
    try {
      enterOuterAlt(_localctx, 1);
      {
      setState(137);
      _la = _input.LA(1);
      if ( _la <= 0 || (_la==NEWLINE) ) {
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
    "\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3\21\u008e\4\2\t"+
      "\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n"+
      "\4\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21"+
      "\3\2\3\2\3\2\3\3\6\3\'\n\3\r\3\16\3(\3\3\3\3\3\3\3\3\5\3/\n\3\3\4"+
      "\3\4\3\4\3\4\3\4\5\4\66\n\4\3\5\3\5\3\6\3\6\3\6\3\6\3\7\3\7\5\7@\n"+
      "\7\3\b\3\b\6\bD\n\b\r\b\16\bE\3\b\3\b\3\t\3\t\3\t\3\n\3\n\5\nO\n\n"+
      "\3\13\5\13R\n\13\3\13\3\13\5\13V\n\13\3\f\3\f\6\fZ\n\f\r\f\16\f[\5"+
      "\f^\n\f\3\f\5\fa\n\f\3\f\6\fd\n\f\r\f\16\fe\5\fh\n\f\3\r\6\rk\n\r"+
      "\r\r\16\rl\5\ro\n\r\3\r\5\rr\n\r\3\r\6\ru\n\r\r\r\16\rv\5\ry\n\r\3"+
      "\16\3\16\6\16}\n\16\r\16\16\16~\3\17\3\17\3\17\3\20\3\20\6\20\u0086"+
      "\n\20\r\20\16\20\u0087\3\20\3\20\3\21\3\21\3\21\2\2\22\2\4\6\b\n\f"+
      "\16\20\22\24\26\30\32\34\36 \2\3\3\2\17\17\u0095\2\"\3\2\2\2\4.\3"+
      "\2\2\2\6\65\3\2\2\2\b\67\3\2\2\2\n9\3\2\2\2\f?\3\2\2\2\16A\3\2\2\2"+
      "\20I\3\2\2\2\22N\3\2\2\2\24Q\3\2\2\2\26W\3\2\2\2\30n\3\2\2\2\32z\3"+
      "\2\2\2\34\u0080\3\2\2\2\36\u0083\3\2\2\2 \u008b\3\2\2\2\"#\5\4\3\2"+
      "#$\7\2\2\3$\3\3\2\2\2%\'\5\6\4\2&%\3\2\2\2\'(\3\2\2\2(&\3\2\2\2()"+
      "\3\2\2\2)*\3\2\2\2*+\7\17\2\2+/\3\2\2\2,/\5\b\5\2-/\5\36\20\2.&\3"+
      "\2\2\2.,\3\2\2\2.-\3\2\2\2/\5\3\2\2\2\60\66\5\f\7\2\61\66\5\32\16"+
      "\2\62\66\7\r\2\2\63\66\7\16\2\2\64\66\7\20\2\2\65\60\3\2\2\2\65\61"+
      "\3\2\2\2\65\62\3\2\2\2\65\63\3\2\2\2\65\64\3\2\2\2\66\7\3\2\2\2\67"+
      "8\5\n\6\28\t\3\2\2\29:\7\3\2\2:;\5 \21\2;<\7\17\2\2<\13\3\2\2\2=@"+
      "\5\20\t\2>@\5\16\b\2?=\3\2\2\2?>\3\2\2\2@\r\3\2\2\2AC\7\4\2\2BD\5"+
      "\20\t\2CB\3\2\2\2DE\3\2\2\2EC\3\2\2\2EF\3\2\2\2FG\3\2\2\2GH\7\5\2"+
      "\2H\17\3\2\2\2IJ\5\22\n\2JK\5\30\r\2K\21\3\2\2\2LO\5\24\13\2MO\5\26"+
      "\f\2NL\3\2\2\2NM\3\2\2\2O\23\3\2\2\2PR\7\f\2\2QP\3\2\2\2QR\3\2\2\2"+
      "RS\3\2\2\2SU\7\n\2\2TV\7\13\2\2UT\3\2\2\2UV\3\2\2\2V\25\3\2\2\2W]"+
      "\7\6\2\2XZ\7\21\2\2YX\3\2\2\2Z[\3\2\2\2[Y\3\2\2\2[\\\3\2\2\2\\^\3"+
      "\2\2\2]Y\3\2\2\2]^\3\2\2\2^`\3\2\2\2_a\7\7\2\2`_\3\2\2\2`a\3\2\2\2"+
      "ag\3\2\2\2bd\7\21\2\2cb\3\2\2\2de\3\2\2\2ec\3\2\2\2ef\3\2\2\2fh\3"+
      "\2\2\2gc\3\2\2\2gh\3\2\2\2h\27\3\2\2\2ik\7\21\2\2ji\3\2\2\2kl\3\2"+
      "\2\2lj\3\2\2\2lm\3\2\2\2mo\3\2\2\2nj\3\2\2\2no\3\2\2\2oq\3\2\2\2p"+
      "r\7\7\2\2qp\3\2\2\2qr\3\2\2\2rx\3\2\2\2su\7\21\2\2ts\3\2\2\2uv\3\2"+
      "\2\2vt\3\2\2\2vw\3\2\2\2wy\3\2\2\2xt\3\2\2\2xy\3\2\2\2y\31\3\2\2\2"+
      "z|\5\34\17\2{}\5\f\7\2|{\3\2\2\2}~\3\2\2\2~|\3\2\2\2~\177\3\2\2\2"+
      "\177\33\3\2\2\2\u0080\u0081\7\b\2\2\u0081\u0082\7\21\2\2\u0082\35"+
      "\3\2\2\2\u0083\u0085\7\t\2\2\u0084\u0086\5 \21\2\u0085\u0084\3\2\2"+
      "\2\u0086\u0087\3\2\2\2\u0087\u0085\3\2\2\2\u0087\u0088\3\2\2\2\u0088"+
      "\u0089\3\2\2\2\u0089\u008a\7\17\2\2\u008a\37\3\2\2\2\u008b\u008c\n"+
      "\2\2\2\u008c!\3\2\2\2\26(.\65?ENQU[]`eglnqvx~\u0087";
  public static final ATN _ATN =
    new ATNDeserializer().deserialize(_serializedATN.toCharArray());
  static {
    _decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
    for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
      _decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
    }
  }
}