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
    RULE_root = 0, RULE_music = 1, RULE_element = 2, RULE_noteelement = 3, 
    RULE_measure = 4, RULE_midtune = 5, RULE_voice = 6, RULE_tuplet = 7, 
    RULE_tupletspec = 8, RULE_chord = 9, RULE_note = 10, RULE_rest = 11, 
    RULE_notelength = 12, RULE_comment = 13, RULE_text = 14;
  public static final String[] ruleNames = {
    "root", "music", "element", "noteelement", "measure", "midtune", "voice", 
    "tuplet", "tupletspec", "chord", "note", "rest", "notelength", "comment", 
    "text"
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
      setState(30);
      music();
      setState(31);
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
      setState(42);
      switch (_input.LA(1)) {
      case T__1:
      case T__2:
      case T__4:
      case NOTELETTER:
      case ACCIDENTAL:
      case BARLINE:
      case NUMREPEAT:
      case WHITESPACE:
        enterOuterAlt(_localctx, 1);
        {
        setState(34); 
        _errHandler.sync(this);
        _la = _input.LA(1);
        do {
          {
          {
          setState(33);
          element();
          }
          }
          setState(36); 
          _errHandler.sync(this);
          _la = _input.LA(1);
        } while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__1) | (1L << T__2) | (1L << T__4) | (1L << NOTELETTER) | (1L << ACCIDENTAL) | (1L << BARLINE) | (1L << NUMREPEAT) | (1L << WHITESPACE))) != 0) );
        setState(38);
        match(NEWLINE);
        }
        break;
      case T__0:
        enterOuterAlt(_localctx, 2);
        {
        setState(40);
        midtune();
        }
        break;
      case T__6:
        enterOuterAlt(_localctx, 3);
        {
        setState(41);
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
    public NoteContext note() {
      return getRuleContext(NoteContext.class,0);
    }
    public RestContext rest() {
      return getRuleContext(RestContext.class,0);
    }
    public ChordContext chord() {
      return getRuleContext(ChordContext.class,0);
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
      case NOTELETTER:
      case ACCIDENTAL:
        enterOuterAlt(_localctx, 1);
        {
        setState(44);
        note();
        }
        break;
      case T__4:
        enterOuterAlt(_localctx, 2);
        {
        setState(45);
        rest();
        }
        break;
      case T__2:
        enterOuterAlt(_localctx, 3);
        {
        setState(46);
        chord();
        }
        break;
      case T__1:
        enterOuterAlt(_localctx, 4);
        {
        setState(47);
        tuplet();
        }
        break;
      case BARLINE:
        enterOuterAlt(_localctx, 5);
        {
        setState(48);
        match(BARLINE);
        }
        break;
      case NUMREPEAT:
        enterOuterAlt(_localctx, 6);
        {
        setState(49);
        match(NUMREPEAT);
        }
        break;
      case WHITESPACE:
        enterOuterAlt(_localctx, 7);
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

  public static class NoteelementContext extends ParserRuleContext {
    public NoteContext note() {
      return getRuleContext(NoteContext.class,0);
    }
    public RestContext rest() {
      return getRuleContext(RestContext.class,0);
    }
    public ChordContext chord() {
      return getRuleContext(ChordContext.class,0);
    }
    public TupletContext tuplet() {
      return getRuleContext(TupletContext.class,0);
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
    enterRule(_localctx, 6, RULE_noteelement);
    try {
      setState(57);
      switch (_input.LA(1)) {
      case NOTELETTER:
      case ACCIDENTAL:
        enterOuterAlt(_localctx, 1);
        {
        setState(53);
        note();
        }
        break;
      case T__4:
        enterOuterAlt(_localctx, 2);
        {
        setState(54);
        rest();
        }
        break;
      case T__2:
        enterOuterAlt(_localctx, 3);
        {
        setState(55);
        chord();
        }
        break;
      case T__1:
        enterOuterAlt(_localctx, 4);
        {
        setState(56);
        tuplet();
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

  public static class MeasureContext extends ParserRuleContext {
    public TerminalNode BARLINE() { return getToken(MusicParser.BARLINE, 0); }
    public TerminalNode NUMREPEAT() { return getToken(MusicParser.NUMREPEAT, 0); }
    public List<NoteelementContext> noteelement() {
      return getRuleContexts(NoteelementContext.class);
    }
    public NoteelementContext noteelement(int i) {
      return getRuleContext(NoteelementContext.class,i);
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
    enterRule(_localctx, 8, RULE_measure);
    int _la;
    try {
      enterOuterAlt(_localctx, 1);
      {
      setState(60);
      _la = _input.LA(1);
      if (_la==NUMREPEAT) {
        {
        setState(59);
        match(NUMREPEAT);
        }
      }

      setState(63); 
      _errHandler.sync(this);
      _la = _input.LA(1);
      do {
        {
        {
        setState(62);
        noteelement();
        }
        }
        setState(65); 
        _errHandler.sync(this);
        _la = _input.LA(1);
      } while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__1) | (1L << T__2) | (1L << T__4) | (1L << NOTELETTER) | (1L << ACCIDENTAL))) != 0) );
      setState(67);
      match(BARLINE);
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
    enterRule(_localctx, 10, RULE_midtune);
    try {
      enterOuterAlt(_localctx, 1);
      {
      setState(69);
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
    enterRule(_localctx, 12, RULE_voice);
    try {
      enterOuterAlt(_localctx, 1);
      {
      setState(71);
      match(T__0);
      setState(72);
      text();
      setState(73);
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

  public static class TupletContext extends ParserRuleContext {
    public TupletspecContext tupletspec() {
      return getRuleContext(TupletspecContext.class,0);
    }
    public List<NoteContext> note() {
      return getRuleContexts(NoteContext.class);
    }
    public NoteContext note(int i) {
      return getRuleContext(NoteContext.class,i);
    }
    public List<ChordContext> chord() {
      return getRuleContexts(ChordContext.class);
    }
    public ChordContext chord(int i) {
      return getRuleContext(ChordContext.class,i);
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
    enterRule(_localctx, 14, RULE_tuplet);
    try {
      int _alt;
      enterOuterAlt(_localctx, 1);
      {
      setState(75);
      tupletspec();
      setState(78); 
      _errHandler.sync(this);
      _alt = 1;
      do {
        switch (_alt) {
        case 1:
          {
          setState(78);
          switch (_input.LA(1)) {
          case NOTELETTER:
          case ACCIDENTAL:
            {
            setState(76);
            note();
            }
            break;
          case T__2:
            {
            setState(77);
            chord();
            }
            break;
          default:
            throw new NoViableAltException(this);
          }
          }
          break;
        default:
          throw new NoViableAltException(this);
        }
        setState(80); 
        _errHandler.sync(this);
        _alt = getInterpreter().adaptivePredict(_input,7,_ctx);
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
    enterRule(_localctx, 16, RULE_tupletspec);
    try {
      enterOuterAlt(_localctx, 1);
      {
      setState(82);
      match(T__1);
      setState(83);
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
    enterRule(_localctx, 18, RULE_chord);
    int _la;
    try {
      enterOuterAlt(_localctx, 1);
      {
      setState(85);
      match(T__2);
      setState(87); 
      _errHandler.sync(this);
      _la = _input.LA(1);
      do {
        {
        {
        setState(86);
        note();
        }
        }
        setState(89); 
        _errHandler.sync(this);
        _la = _input.LA(1);
      } while ( _la==NOTELETTER || _la==ACCIDENTAL );
      setState(91);
      match(T__3);
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
    public TerminalNode NOTELETTER() { return getToken(MusicParser.NOTELETTER, 0); }
    public TerminalNode ACCIDENTAL() { return getToken(MusicParser.ACCIDENTAL, 0); }
    public TerminalNode OCTAVE() { return getToken(MusicParser.OCTAVE, 0); }
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
    enterRule(_localctx, 20, RULE_note);
    int _la;
    try {
      enterOuterAlt(_localctx, 1);
      {
      setState(94);
      _la = _input.LA(1);
      if (_la==ACCIDENTAL) {
        {
        setState(93);
        match(ACCIDENTAL);
        }
      }

      setState(96);
      match(NOTELETTER);
      setState(98);
      _la = _input.LA(1);
      if (_la==OCTAVE) {
        {
        setState(97);
        match(OCTAVE);
        }
      }

      setState(101);
      _la = _input.LA(1);
      if (_la==T__5 || _la==DIGIT) {
        {
        setState(100);
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
    enterRule(_localctx, 22, RULE_rest);
    int _la;
    try {
      enterOuterAlt(_localctx, 1);
      {
      setState(103);
      match(T__4);
      setState(105);
      _la = _input.LA(1);
      if (_la==T__5 || _la==DIGIT) {
        {
        setState(104);
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
    enterRule(_localctx, 24, RULE_notelength);
    int _la;
    try {
      setState(127);
      switch ( getInterpreter().adaptivePredict(_input,18,_ctx) ) {
      case 1:
        enterOuterAlt(_localctx, 1);
        {
        {
        setState(112);
        _la = _input.LA(1);
        if (_la==DIGIT) {
          {
          setState(108); 
          _errHandler.sync(this);
          _la = _input.LA(1);
          do {
            {
            {
            setState(107);
            match(DIGIT);
            }
            }
            setState(110); 
            _errHandler.sync(this);
            _la = _input.LA(1);
          } while ( _la==DIGIT );
          }
        }

        setState(114);
        match(T__5);
        setState(120);
        _la = _input.LA(1);
        if (_la==DIGIT) {
          {
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
        }

        }
        }
        break;
      case 2:
        enterOuterAlt(_localctx, 2);
        {
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
    enterRule(_localctx, 26, RULE_comment);
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
    enterRule(_localctx, 28, RULE_text);
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
      "\4\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\3\2\3\2\3"+
      "\2\3\3\6\3%\n\3\r\3\16\3&\3\3\3\3\3\3\3\3\5\3-\n\3\3\4\3\4\3\4\3\4"+
      "\3\4\3\4\3\4\5\4\66\n\4\3\5\3\5\3\5\3\5\5\5<\n\5\3\6\5\6?\n\6\3\6"+
      "\6\6B\n\6\r\6\16\6C\3\6\3\6\3\7\3\7\3\b\3\b\3\b\3\b\3\t\3\t\3\t\6"+
      "\tQ\n\t\r\t\16\tR\3\n\3\n\3\n\3\13\3\13\6\13Z\n\13\r\13\16\13[\3\13"+
      "\3\13\3\f\5\fa\n\f\3\f\3\f\5\fe\n\f\3\f\5\fh\n\f\3\r\3\r\5\rl\n\r"+
      "\3\16\6\16o\n\16\r\16\16\16p\5\16s\n\16\3\16\3\16\6\16w\n\16\r\16"+
      "\16\16x\5\16{\n\16\3\16\6\16~\n\16\r\16\16\16\177\5\16\u0082\n\16"+
      "\3\17\3\17\6\17\u0086\n\17\r\17\16\17\u0087\3\17\3\17\3\20\3\20\3"+
      "\20\2\2\21\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36\2\3\3\2\17\17\u009a"+
      "\2 \3\2\2\2\4,\3\2\2\2\6\65\3\2\2\2\b;\3\2\2\2\n>\3\2\2\2\fG\3\2\2"+
      "\2\16I\3\2\2\2\20M\3\2\2\2\22T\3\2\2\2\24W\3\2\2\2\26`\3\2\2\2\30"+
      "i\3\2\2\2\32\u0081\3\2\2\2\34\u0083\3\2\2\2\36\u008b\3\2\2\2 !\5\4"+
      "\3\2!\"\7\2\2\3\"\3\3\2\2\2#%\5\6\4\2$#\3\2\2\2%&\3\2\2\2&$\3\2\2"+
      "\2&\'\3\2\2\2\'(\3\2\2\2()\7\17\2\2)-\3\2\2\2*-\5\f\7\2+-\5\34\17"+
      "\2,$\3\2\2\2,*\3\2\2\2,+\3\2\2\2-\5\3\2\2\2.\66\5\26\f\2/\66\5\30"+
      "\r\2\60\66\5\24\13\2\61\66\5\20\t\2\62\66\7\r\2\2\63\66\7\16\2\2\64"+
      "\66\7\20\2\2\65.\3\2\2\2\65/\3\2\2\2\65\60\3\2\2\2\65\61\3\2\2\2\65"+
      "\62\3\2\2\2\65\63\3\2\2\2\65\64\3\2\2\2\66\7\3\2\2\2\67<\5\26\f\2"+
      "8<\5\30\r\29<\5\24\13\2:<\5\20\t\2;\67\3\2\2\2;8\3\2\2\2;9\3\2\2\2"+
      ";:\3\2\2\2<\t\3\2\2\2=?\7\16\2\2>=\3\2\2\2>?\3\2\2\2?A\3\2\2\2@B\5"+
      "\b\5\2A@\3\2\2\2BC\3\2\2\2CA\3\2\2\2CD\3\2\2\2DE\3\2\2\2EF\7\r\2\2"+
      "F\13\3\2\2\2GH\5\16\b\2H\r\3\2\2\2IJ\7\3\2\2JK\5\36\20\2KL\7\17\2"+
      "\2L\17\3\2\2\2MP\5\22\n\2NQ\5\26\f\2OQ\5\24\13\2PN\3\2\2\2PO\3\2\2"+
      "\2QR\3\2\2\2RP\3\2\2\2RS\3\2\2\2S\21\3\2\2\2TU\7\4\2\2UV\7\21\2\2"+
      "V\23\3\2\2\2WY\7\5\2\2XZ\5\26\f\2YX\3\2\2\2Z[\3\2\2\2[Y\3\2\2\2[\\"+
      "\3\2\2\2\\]\3\2\2\2]^\7\6\2\2^\25\3\2\2\2_a\7\f\2\2`_\3\2\2\2`a\3"+
      "\2\2\2ab\3\2\2\2bd\7\n\2\2ce\7\13\2\2dc\3\2\2\2de\3\2\2\2eg\3\2\2"+
      "\2fh\5\32\16\2gf\3\2\2\2gh\3\2\2\2h\27\3\2\2\2ik\7\7\2\2jl\5\32\16"+
      "\2kj\3\2\2\2kl\3\2\2\2l\31\3\2\2\2mo\7\21\2\2nm\3\2\2\2op\3\2\2\2"+
      "pn\3\2\2\2pq\3\2\2\2qs\3\2\2\2rn\3\2\2\2rs\3\2\2\2st\3\2\2\2tz\7\b"+
      "\2\2uw\7\21\2\2vu\3\2\2\2wx\3\2\2\2xv\3\2\2\2xy\3\2\2\2y{\3\2\2\2"+
      "zv\3\2\2\2z{\3\2\2\2{\u0082\3\2\2\2|~\7\21\2\2}|\3\2\2\2~\177\3\2"+
      "\2\2\177}\3\2\2\2\177\u0080\3\2\2\2\u0080\u0082\3\2\2\2\u0081r\3\2"+
      "\2\2\u0081}\3\2\2\2\u0082\33\3\2\2\2\u0083\u0085\7\t\2\2\u0084\u0086"+
      "\5\36\20\2\u0085\u0084\3\2\2\2\u0086\u0087\3\2\2\2\u0087\u0085\3\2"+
      "\2\2\u0087\u0088\3\2\2\2\u0088\u0089\3\2\2\2\u0089\u008a\7\17\2\2"+
      "\u008a\35\3\2\2\2\u008b\u008c\n\2\2\2\u008c\37\3\2\2\2\26&,\65;>C"+
      "PR[`dgkprxz\177\u0081\u0087";
  public static final ATN _ATN =
    new ATNDeserializer().deserialize(_serializedATN.toCharArray());
  static {
    _decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
    for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
      _decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
    }
  }
}