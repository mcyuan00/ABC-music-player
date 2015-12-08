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
    SYMBOLS=9, LETTERS=10, OCTAVE=11, ACCIDENTAL=12, BARLINE=13, DOUBLEBAR=14, 
    STARTREPEAT=15, ENDREPEAT=16, ONEREPEAT=17, TWOREPEAT=18, NEWLINE=19, 
    WHITESPACE=20, DIGIT=21;
  public static final int
    RULE_root = 0, RULE_music = 1, RULE_midtune = 2, RULE_voice = 3, RULE_section = 4, 
    RULE_repeat = 5, RULE_measure = 6, RULE_noteelement = 7, RULE_tuplet = 8, 
    RULE_tupletspec = 9, RULE_chord = 10, RULE_note = 11, RULE_rest = 12, 
    RULE_notelength = 13, RULE_comment = 14, RULE_text = 15;
  public static final String[] ruleNames = {
    "root", "music", "midtune", "voice", "section", "repeat", "measure", 
    "noteelement", "tuplet", "tupletspec", "chord", "note", "rest", "notelength", 
    "comment", "text"
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
    public SectionContext section() {
      return getRuleContext(SectionContext.class,0);
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
    try {
      setState(38);
      switch (_input.LA(1)) {
      case STARTREPEAT:
      case ONEREPEAT:
      case WHITESPACE:
        enterOuterAlt(_localctx, 1);
        {
        setState(35);
        section();
        }
        break;
      case T__0:
        enterOuterAlt(_localctx, 2);
        {
        setState(36);
        midtune();
        }
        break;
      case T__6:
        enterOuterAlt(_localctx, 3);
        {
        setState(37);
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

  public static class MidtuneContext extends ParserRuleContext {
    public VoiceContext voice() {
      return getRuleContext(VoiceContext.class,0);
    }
    public SectionContext section() {
      return getRuleContext(SectionContext.class,0);
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
    enterRule(_localctx, 4, RULE_midtune);
    try {
      enterOuterAlt(_localctx, 1);
      {
      setState(40);
      voice();
      setState(41);
      section();
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
    public TerminalNode NEWLINE() { return getToken(MusicParser.NEWLINE, 0); }
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
      if ( listener instanceof MusicListener ) ((MusicListener)listener).enterVoice(this);
    }
    @Override
    public void exitRule(ParseTreeListener listener) {
      if ( listener instanceof MusicListener ) ((MusicListener)listener).exitVoice(this);
    }
  }

  public final VoiceContext voice() throws RecognitionException {
    VoiceContext _localctx = new VoiceContext(_ctx, getState());
    enterRule(_localctx, 6, RULE_voice);
    int _la;
    try {
      enterOuterAlt(_localctx, 1);
      {
      setState(43);
      match(T__0);
      setState(45); 
      _errHandler.sync(this);
      _la = _input.LA(1);
      do {
        {
        {
        setState(44);
        text();
        }
        }
        setState(47); 
        _errHandler.sync(this);
        _la = _input.LA(1);
      } while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << NOTELETTER) | (1L << SYMBOLS) | (1L << LETTERS) | (1L << DIGIT))) != 0) );
      setState(49);
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

  public static class SectionContext extends ParserRuleContext {
    public TerminalNode NEWLINE() { return getToken(MusicParser.NEWLINE, 0); }
    public List<RepeatContext> repeat() {
      return getRuleContexts(RepeatContext.class);
    }
    public RepeatContext repeat(int i) {
      return getRuleContext(RepeatContext.class,i);
    }
    public SectionContext(ParserRuleContext parent, int invokingState) {
      super(parent, invokingState);
    }
    @Override public int getRuleIndex() { return RULE_section; }
    @Override
    public void enterRule(ParseTreeListener listener) {
      if ( listener instanceof MusicListener ) ((MusicListener)listener).enterSection(this);
    }
    @Override
    public void exitRule(ParseTreeListener listener) {
      if ( listener instanceof MusicListener ) ((MusicListener)listener).exitSection(this);
    }
  }

  public final SectionContext section() throws RecognitionException {
    SectionContext _localctx = new SectionContext(_ctx, getState());
    enterRule(_localctx, 8, RULE_section);
    int _la;
    try {
      enterOuterAlt(_localctx, 1);
      {
      setState(52); 
      _errHandler.sync(this);
      _la = _input.LA(1);
      do {
        {
        {
        setState(51);
        repeat();
        }
        }
        setState(54); 
        _errHandler.sync(this);
        _la = _input.LA(1);
      } while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << STARTREPEAT) | (1L << ONEREPEAT) | (1L << WHITESPACE))) != 0) );
      setState(56);
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

  public static class RepeatContext extends ParserRuleContext {
    public TerminalNode STARTREPEAT() { return getToken(MusicParser.STARTREPEAT, 0); }
    public List<MeasureContext> measure() {
      return getRuleContexts(MeasureContext.class);
    }
    public MeasureContext measure(int i) {
      return getRuleContext(MeasureContext.class,i);
    }
    public TerminalNode ONEREPEAT() { return getToken(MusicParser.ONEREPEAT, 0); }
    public TerminalNode ENDREPEAT() { return getToken(MusicParser.ENDREPEAT, 0); }
    public TerminalNode TWOREPEAT() { return getToken(MusicParser.TWOREPEAT, 0); }
    public TerminalNode DOUBLEBAR() { return getToken(MusicParser.DOUBLEBAR, 0); }
    public List<TerminalNode> BARLINE() { return getTokens(MusicParser.BARLINE); }
    public TerminalNode BARLINE(int i) {
      return getToken(MusicParser.BARLINE, i);
    }
    public RepeatContext(ParserRuleContext parent, int invokingState) {
      super(parent, invokingState);
    }
    @Override public int getRuleIndex() { return RULE_repeat; }
    @Override
    public void enterRule(ParseTreeListener listener) {
      if ( listener instanceof MusicListener ) ((MusicListener)listener).enterRepeat(this);
    }
    @Override
    public void exitRule(ParseTreeListener listener) {
      if ( listener instanceof MusicListener ) ((MusicListener)listener).exitRepeat(this);
    }
  }

  public final RepeatContext repeat() throws RecognitionException {
    RepeatContext _localctx = new RepeatContext(_ctx, getState());
    enterRule(_localctx, 10, RULE_repeat);
    int _la;
    try {
      int _alt;
      enterOuterAlt(_localctx, 1);
      {
      setState(59);
      _la = _input.LA(1);
      if (_la==STARTREPEAT) {
        {
        setState(58);
        match(STARTREPEAT);
        }
      }

      setState(95);
      switch (_input.LA(1)) {
      case WHITESPACE:
        {
        {
        setState(64); 
        _errHandler.sync(this);
        _alt = 1;
        do {
          switch (_alt) {
          case 1:
            {
            {
            setState(61);
            measure();
            setState(62);
            match(BARLINE);
            }
            }
            break;
          default:
            throw new NoViableAltException(this);
          }
          setState(66); 
          _errHandler.sync(this);
          _alt = getInterpreter().adaptivePredict(_input,4,_ctx);
        } while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
        setState(68);
        measure();
        setState(69);
        _la = _input.LA(1);
        if ( !(_la==DOUBLEBAR || _la==ENDREPEAT) ) {
        _errHandler.recoverInline(this);
        } else {
          consume();
        }
        }
        }
        break;
      case ONEREPEAT:
        {
        {
        setState(71);
        match(ONEREPEAT);
        setState(77);
        _errHandler.sync(this);
        _alt = getInterpreter().adaptivePredict(_input,5,_ctx);
        while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
          if ( _alt==1 ) {
            {
            {
            setState(72);
            measure();
            setState(73);
            match(BARLINE);
            }
            } 
          }
          setState(79);
          _errHandler.sync(this);
          _alt = getInterpreter().adaptivePredict(_input,5,_ctx);
        }
        setState(80);
        measure();
        setState(81);
        match(ENDREPEAT);
        setState(82);
        match(TWOREPEAT);
        setState(88);
        _errHandler.sync(this);
        _alt = getInterpreter().adaptivePredict(_input,6,_ctx);
        while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
          if ( _alt==1 ) {
            {
            {
            setState(83);
            measure();
            setState(84);
            match(BARLINE);
            }
            } 
          }
          setState(90);
          _errHandler.sync(this);
          _alt = getInterpreter().adaptivePredict(_input,6,_ctx);
        }
        setState(91);
        measure();
        setState(93);
        _la = _input.LA(1);
        if (_la==DOUBLEBAR) {
          {
          setState(92);
          match(DOUBLEBAR);
          }
        }

        }
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

  public static class MeasureContext extends ParserRuleContext {
    public List<TerminalNode> WHITESPACE() { return getTokens(MusicParser.WHITESPACE); }
    public TerminalNode WHITESPACE(int i) {
      return getToken(MusicParser.WHITESPACE, i);
    }
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
    enterRule(_localctx, 12, RULE_measure);
    int _la;
    try {
      int _alt;
      enterOuterAlt(_localctx, 1);
      {
      setState(97);
      match(WHITESPACE);
      setState(99); 
      _errHandler.sync(this);
      _la = _input.LA(1);
      do {
        {
        {
        setState(98);
        noteelement();
        }
        }
        setState(101); 
        _errHandler.sync(this);
        _la = _input.LA(1);
      } while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__1) | (1L << T__2) | (1L << T__4) | (1L << NOTELETTER) | (1L << ACCIDENTAL))) != 0) );
      setState(104); 
      _errHandler.sync(this);
      _alt = 1;
      do {
        switch (_alt) {
        case 1:
          {
          {
          setState(103);
          match(WHITESPACE);
          }
          }
          break;
        default:
          throw new NoViableAltException(this);
        }
        setState(106); 
        _errHandler.sync(this);
        _alt = getInterpreter().adaptivePredict(_input,10,_ctx);
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
    enterRule(_localctx, 14, RULE_noteelement);
    try {
      setState(112);
      switch (_input.LA(1)) {
      case NOTELETTER:
      case ACCIDENTAL:
        enterOuterAlt(_localctx, 1);
        {
        setState(108);
        note();
        }
        break;
      case T__4:
        enterOuterAlt(_localctx, 2);
        {
        setState(109);
        rest();
        }
        break;
      case T__2:
        enterOuterAlt(_localctx, 3);
        {
        setState(110);
        chord();
        }
        break;
      case T__1:
        enterOuterAlt(_localctx, 4);
        {
        setState(111);
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
    enterRule(_localctx, 16, RULE_tuplet);
    try {
      int _alt;
      enterOuterAlt(_localctx, 1);
      {
      setState(114);
      tupletspec();
      setState(117); 
      _errHandler.sync(this);
      _alt = 1;
      do {
        switch (_alt) {
        case 1:
          {
          setState(117);
          switch (_input.LA(1)) {
          case NOTELETTER:
          case ACCIDENTAL:
            {
            setState(115);
            note();
            }
            break;
          case T__2:
            {
            setState(116);
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
        setState(119); 
        _errHandler.sync(this);
        _alt = getInterpreter().adaptivePredict(_input,13,_ctx);
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
    enterRule(_localctx, 18, RULE_tupletspec);
    try {
      enterOuterAlt(_localctx, 1);
      {
      setState(121);
      match(T__1);
      setState(122);
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
    enterRule(_localctx, 20, RULE_chord);
    int _la;
    try {
      enterOuterAlt(_localctx, 1);
      {
      setState(124);
      match(T__2);
      setState(126); 
      _errHandler.sync(this);
      _la = _input.LA(1);
      do {
        {
        {
        setState(125);
        note();
        }
        }
        setState(128); 
        _errHandler.sync(this);
        _la = _input.LA(1);
      } while ( _la==NOTELETTER || _la==ACCIDENTAL );
      setState(130);
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
    enterRule(_localctx, 22, RULE_note);
    int _la;
    try {
      enterOuterAlt(_localctx, 1);
      {
      setState(133);
      _la = _input.LA(1);
      if (_la==ACCIDENTAL) {
        {
        setState(132);
        match(ACCIDENTAL);
        }
      }

      setState(135);
      match(NOTELETTER);
      setState(137);
      _la = _input.LA(1);
      if (_la==OCTAVE) {
        {
        setState(136);
        match(OCTAVE);
        }
      }

      setState(140);
      _la = _input.LA(1);
      if (_la==T__5 || _la==DIGIT) {
        {
        setState(139);
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
    enterRule(_localctx, 24, RULE_rest);
    int _la;
    try {
      enterOuterAlt(_localctx, 1);
      {
      setState(142);
      match(T__4);
      setState(144);
      _la = _input.LA(1);
      if (_la==T__5 || _la==DIGIT) {
        {
        setState(143);
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
    enterRule(_localctx, 26, RULE_notelength);
    int _la;
    try {
      setState(166);
      switch ( getInterpreter().adaptivePredict(_input,24,_ctx) ) {
      case 1:
        enterOuterAlt(_localctx, 1);
        {
        {
        setState(151);
        _la = _input.LA(1);
        if (_la==DIGIT) {
          {
          setState(147); 
          _errHandler.sync(this);
          _la = _input.LA(1);
          do {
            {
            {
            setState(146);
            match(DIGIT);
            }
            }
            setState(149); 
            _errHandler.sync(this);
            _la = _input.LA(1);
          } while ( _la==DIGIT );
          }
        }

        setState(153);
        match(T__5);
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

        }
        }
        break;
      case 2:
        enterOuterAlt(_localctx, 2);
        {
        setState(162); 
        _errHandler.sync(this);
        _la = _input.LA(1);
        do {
          {
          {
          setState(161);
          match(DIGIT);
          }
          }
          setState(164); 
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
    enterRule(_localctx, 28, RULE_comment);
    int _la;
    try {
      enterOuterAlt(_localctx, 1);
      {
      setState(168);
      match(T__6);
      setState(170); 
      _errHandler.sync(this);
      _la = _input.LA(1);
      do {
        {
        {
        setState(169);
        text();
        }
        }
        setState(172); 
        _errHandler.sync(this);
        _la = _input.LA(1);
      } while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << NOTELETTER) | (1L << SYMBOLS) | (1L << LETTERS) | (1L << DIGIT))) != 0) );
      setState(174);
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
    public TerminalNode DIGIT() { return getToken(MusicParser.DIGIT, 0); }
    public TerminalNode NOTELETTER() { return getToken(MusicParser.NOTELETTER, 0); }
    public TerminalNode LETTERS() { return getToken(MusicParser.LETTERS, 0); }
    public TerminalNode SYMBOLS() { return getToken(MusicParser.SYMBOLS, 0); }
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
      setState(176);
      _la = _input.LA(1);
      if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << NOTELETTER) | (1L << SYMBOLS) | (1L << LETTERS) | (1L << DIGIT))) != 0)) ) {
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
    "\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3\27\u00b5\4\2\t"+
      "\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n"+
      "\4\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21"+
      "\3\2\3\2\3\2\3\3\3\3\3\3\5\3)\n\3\3\4\3\4\3\4\3\5\3\5\6\5\60\n\5\r"+
      "\5\16\5\61\3\5\3\5\3\6\6\6\67\n\6\r\6\16\68\3\6\3\6\3\7\5\7>\n\7\3"+
      "\7\3\7\3\7\6\7C\n\7\r\7\16\7D\3\7\3\7\3\7\3\7\3\7\3\7\3\7\7\7N\n\7"+
      "\f\7\16\7Q\13\7\3\7\3\7\3\7\3\7\3\7\3\7\7\7Y\n\7\f\7\16\7\\\13\7\3"+
      "\7\3\7\5\7`\n\7\5\7b\n\7\3\b\3\b\6\bf\n\b\r\b\16\bg\3\b\6\bk\n\b\r"+
      "\b\16\bl\3\t\3\t\3\t\3\t\5\ts\n\t\3\n\3\n\3\n\6\nx\n\n\r\n\16\ny\3"+
      "\13\3\13\3\13\3\f\3\f\6\f\u0081\n\f\r\f\16\f\u0082\3\f\3\f\3\r\5\r"+
      "\u0088\n\r\3\r\3\r\5\r\u008c\n\r\3\r\5\r\u008f\n\r\3\16\3\16\5\16"+
      "\u0093\n\16\3\17\6\17\u0096\n\17\r\17\16\17\u0097\5\17\u009a\n\17"+
      "\3\17\3\17\6\17\u009e\n\17\r\17\16\17\u009f\5\17\u00a2\n\17\3\17\6"+
      "\17\u00a5\n\17\r\17\16\17\u00a6\5\17\u00a9\n\17\3\20\3\20\6\20\u00ad"+
      "\n\20\r\20\16\20\u00ae\3\20\3\20\3\21\3\21\3\21\2\2\22\2\4\6\b\n\f"+
      "\16\20\22\24\26\30\32\34\36 \2\4\4\2\20\20\22\22\4\2\n\f\27\27\u00c1"+
      "\2\"\3\2\2\2\4(\3\2\2\2\6*\3\2\2\2\b-\3\2\2\2\n\66\3\2\2\2\f=\3\2"+
      "\2\2\16c\3\2\2\2\20r\3\2\2\2\22t\3\2\2\2\24{\3\2\2\2\26~\3\2\2\2\30"+
      "\u0087\3\2\2\2\32\u0090\3\2\2\2\34\u00a8\3\2\2\2\36\u00aa\3\2\2\2"+
      " \u00b2\3\2\2\2\"#\5\4\3\2#$\7\2\2\3$\3\3\2\2\2%)\5\n\6\2&)\5\6\4"+
      "\2\')\5\36\20\2(%\3\2\2\2(&\3\2\2\2(\'\3\2\2\2)\5\3\2\2\2*+\5\b\5"+
      "\2+,\5\n\6\2,\7\3\2\2\2-/\7\3\2\2.\60\5 \21\2/.\3\2\2\2\60\61\3\2"+
      "\2\2\61/\3\2\2\2\61\62\3\2\2\2\62\63\3\2\2\2\63\64\7\25\2\2\64\t\3"+
      "\2\2\2\65\67\5\f\7\2\66\65\3\2\2\2\678\3\2\2\28\66\3\2\2\289\3\2\2"+
      "\29:\3\2\2\2:;\7\25\2\2;\13\3\2\2\2<>\7\21\2\2=<\3\2\2\2=>\3\2\2\2"+
      ">a\3\2\2\2?@\5\16\b\2@A\7\17\2\2AC\3\2\2\2B?\3\2\2\2CD\3\2\2\2DB\3"+
      "\2\2\2DE\3\2\2\2EF\3\2\2\2FG\5\16\b\2GH\t\2\2\2Hb\3\2\2\2IO\7\23\2"+
      "\2JK\5\16\b\2KL\7\17\2\2LN\3\2\2\2MJ\3\2\2\2NQ\3\2\2\2OM\3\2\2\2O"+
      "P\3\2\2\2PR\3\2\2\2QO\3\2\2\2RS\5\16\b\2ST\7\22\2\2TZ\7\24\2\2UV\5"+
      "\16\b\2VW\7\17\2\2WY\3\2\2\2XU\3\2\2\2Y\\\3\2\2\2ZX\3\2\2\2Z[\3\2"+
      "\2\2[]\3\2\2\2\\Z\3\2\2\2]_\5\16\b\2^`\7\20\2\2_^\3\2\2\2_`\3\2\2"+
      "\2`b\3\2\2\2aB\3\2\2\2aI\3\2\2\2b\r\3\2\2\2ce\7\26\2\2df\5\20\t\2"+
      "ed\3\2\2\2fg\3\2\2\2ge\3\2\2\2gh\3\2\2\2hj\3\2\2\2ik\7\26\2\2ji\3"+
      "\2\2\2kl\3\2\2\2lj\3\2\2\2lm\3\2\2\2m\17\3\2\2\2ns\5\30\r\2os\5\32"+
      "\16\2ps\5\26\f\2qs\5\22\n\2rn\3\2\2\2ro\3\2\2\2rp\3\2\2\2rq\3\2\2"+
      "\2s\21\3\2\2\2tw\5\24\13\2ux\5\30\r\2vx\5\26\f\2wu\3\2\2\2wv\3\2\2"+
      "\2xy\3\2\2\2yw\3\2\2\2yz\3\2\2\2z\23\3\2\2\2{|\7\4\2\2|}\7\27\2\2"+
      "}\25\3\2\2\2~\u0080\7\5\2\2\177\u0081\5\30\r\2\u0080\177\3\2\2\2\u0081"+
      "\u0082\3\2\2\2\u0082\u0080\3\2\2\2\u0082\u0083\3\2\2\2\u0083\u0084"+
      "\3\2\2\2\u0084\u0085\7\6\2\2\u0085\27\3\2\2\2\u0086\u0088\7\16\2\2"+
      "\u0087\u0086\3\2\2\2\u0087\u0088\3\2\2\2\u0088\u0089\3\2\2\2\u0089"+
      "\u008b\7\n\2\2\u008a\u008c\7\r\2\2\u008b\u008a\3\2\2\2\u008b\u008c"+
      "\3\2\2\2\u008c\u008e\3\2\2\2\u008d\u008f\5\34\17\2\u008e\u008d\3\2"+
      "\2\2\u008e\u008f\3\2\2\2\u008f\31\3\2\2\2\u0090\u0092\7\7\2\2\u0091"+
      "\u0093\5\34\17\2\u0092\u0091\3\2\2\2\u0092\u0093\3\2\2\2\u0093\33"+
      "\3\2\2\2\u0094\u0096\7\27\2\2\u0095\u0094\3\2\2\2\u0096\u0097\3\2"+
      "\2\2\u0097\u0095\3\2\2\2\u0097\u0098\3\2\2\2\u0098\u009a\3\2\2\2\u0099"+
      "\u0095\3\2\2\2\u0099\u009a\3\2\2\2\u009a\u009b\3\2\2\2\u009b\u00a1"+
      "\7\b\2\2\u009c\u009e\7\27\2\2\u009d\u009c\3\2\2\2\u009e\u009f\3\2"+
      "\2\2\u009f\u009d\3\2\2\2\u009f\u00a0\3\2\2\2\u00a0\u00a2\3\2\2\2\u00a1"+
      "\u009d\3\2\2\2\u00a1\u00a2\3\2\2\2\u00a2\u00a9\3\2\2\2\u00a3\u00a5"+
      "\7\27\2\2\u00a4\u00a3\3\2\2\2\u00a5\u00a6\3\2\2\2\u00a6\u00a4\3\2"+
      "\2\2\u00a6\u00a7\3\2\2\2\u00a7\u00a9\3\2\2\2\u00a8\u0099\3\2\2\2\u00a8"+
      "\u00a4\3\2\2\2\u00a9\35\3\2\2\2\u00aa\u00ac\7\t\2\2\u00ab\u00ad\5"+
      " \21\2\u00ac\u00ab\3\2\2\2\u00ad\u00ae\3\2\2\2\u00ae\u00ac\3\2\2\2"+
      "\u00ae\u00af\3\2\2\2\u00af\u00b0\3\2\2\2\u00b0\u00b1\7\25\2\2\u00b1"+
      "\37\3\2\2\2\u00b2\u00b3\t\3\2\2\u00b3!\3\2\2\2\34(\618=DOZ_aglrwy"+
      "\u0082\u0087\u008b\u008e\u0092\u0097\u0099\u009f\u00a1\u00a6\u00a8"+
      "\u00ae";
  public static final ATN _ATN =
    new ATNDeserializer().deserialize(_serializedATN.toCharArray());
  static {
    _decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
    for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
      _decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
    }
  }
}