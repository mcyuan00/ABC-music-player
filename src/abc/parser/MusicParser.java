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
    RULE_tuplet = 5, RULE_tupletspec = 6, RULE_chord = 7, RULE_note = 8, 
    RULE_rest = 9, RULE_notelength = 10, RULE_comment = 11, RULE_text = 12;
  public static final String[] ruleNames = {
    "root", "music", "element", "midtune", "voice", "tuplet", "tupletspec", 
    "chord", "note", "rest", "notelength", "comment", "text"
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
      setState(26);
      music();
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
      setState(38);
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
        setState(30); 
        _errHandler.sync(this);
        _la = _input.LA(1);
        do {
          {
          {
          setState(29);
          element();
          }
          }
          setState(32); 
          _errHandler.sync(this);
          _la = _input.LA(1);
        } while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__1) | (1L << T__2) | (1L << T__4) | (1L << NOTELETTER) | (1L << ACCIDENTAL) | (1L << BARLINE) | (1L << NUMREPEAT) | (1L << WHITESPACE))) != 0) );
        setState(34);
        match(NEWLINE);
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
      setState(47);
      switch (_input.LA(1)) {
      case NOTELETTER:
      case ACCIDENTAL:
        enterOuterAlt(_localctx, 1);
        {
        setState(40);
        note();
        }
        break;
      case T__4:
        enterOuterAlt(_localctx, 2);
        {
        setState(41);
        rest();
        }
        break;
      case T__2:
        enterOuterAlt(_localctx, 3);
        {
        setState(42);
        chord();
        }
        break;
      case T__1:
        enterOuterAlt(_localctx, 4);
        {
        setState(43);
        tuplet();
        }
        break;
      case BARLINE:
        enterOuterAlt(_localctx, 5);
        {
        setState(44);
        match(BARLINE);
        }
        break;
      case NUMREPEAT:
        enterOuterAlt(_localctx, 6);
        {
        setState(45);
        match(NUMREPEAT);
        }
        break;
      case WHITESPACE:
        enterOuterAlt(_localctx, 7);
        {
        setState(46);
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
      setState(49);
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
      setState(51);
      match(T__0);
      setState(52);
      text();
      setState(53);
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
    enterRule(_localctx, 10, RULE_tuplet);
    try {
      int _alt;
      enterOuterAlt(_localctx, 1);
      {
      setState(55);
      tupletspec();
      setState(58); 
      _errHandler.sync(this);
      _alt = 1;
      do {
        switch (_alt) {
        case 1:
          {
          setState(58);
          switch (_input.LA(1)) {
          case NOTELETTER:
          case ACCIDENTAL:
            {
            setState(56);
            note();
            }
            break;
          case T__2:
            {
            setState(57);
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
        setState(60); 
        _errHandler.sync(this);
        _alt = getInterpreter().adaptivePredict(_input,4,_ctx);
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
    enterRule(_localctx, 12, RULE_tupletspec);
    try {
      enterOuterAlt(_localctx, 1);
      {
      setState(62);
      match(T__1);
      setState(63);
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
    enterRule(_localctx, 14, RULE_chord);
    int _la;
    try {
      enterOuterAlt(_localctx, 1);
      {
      setState(65);
      match(T__2);
      setState(67); 
      _errHandler.sync(this);
      _la = _input.LA(1);
      do {
        {
        {
        setState(66);
        note();
        }
        }
        setState(69); 
        _errHandler.sync(this);
        _la = _input.LA(1);
      } while ( _la==NOTELETTER || _la==ACCIDENTAL );
      setState(71);
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
    enterRule(_localctx, 16, RULE_note);
    int _la;
    try {
      enterOuterAlt(_localctx, 1);
      {
      setState(74);
      _la = _input.LA(1);
      if (_la==ACCIDENTAL) {
        {
        setState(73);
        match(ACCIDENTAL);
        }
      }

      setState(76);
      match(NOTELETTER);
      setState(78);
      _la = _input.LA(1);
      if (_la==OCTAVE) {
        {
        setState(77);
        match(OCTAVE);
        }
      }

      setState(81);
      _la = _input.LA(1);
      if (_la==T__5 || _la==DIGIT) {
        {
        setState(80);
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
    enterRule(_localctx, 18, RULE_rest);
    int _la;
    try {
      enterOuterAlt(_localctx, 1);
      {
      setState(83);
      match(T__4);
      setState(85);
      _la = _input.LA(1);
      if (_la==T__5 || _la==DIGIT) {
        {
        setState(84);
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
    enterRule(_localctx, 20, RULE_notelength);
    int _la;
    try {
      setState(107);
      switch ( getInterpreter().adaptivePredict(_input,15,_ctx) ) {
      case 1:
        enterOuterAlt(_localctx, 1);
        {
        {
        setState(92);
        _la = _input.LA(1);
        if (_la==DIGIT) {
          {
          setState(88); 
          _errHandler.sync(this);
          _la = _input.LA(1);
          do {
            {
            {
            setState(87);
            match(DIGIT);
            }
            }
            setState(90); 
            _errHandler.sync(this);
            _la = _input.LA(1);
          } while ( _la==DIGIT );
          }
        }

        setState(94);
        match(T__5);
        setState(100);
        _la = _input.LA(1);
        if (_la==DIGIT) {
          {
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
          }
        }

        }
        }
        break;
      case 2:
        enterOuterAlt(_localctx, 2);
        {
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
    enterRule(_localctx, 22, RULE_comment);
    int _la;
    try {
      enterOuterAlt(_localctx, 1);
      {
      setState(109);
      match(T__6);
      setState(111); 
      _errHandler.sync(this);
      _la = _input.LA(1);
      do {
        {
        {
        setState(110);
        text();
        }
        }
        setState(113); 
        _errHandler.sync(this);
        _la = _input.LA(1);
      } while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__1) | (1L << T__2) | (1L << T__3) | (1L << T__4) | (1L << T__5) | (1L << T__6) | (1L << NOTELETTER) | (1L << OCTAVE) | (1L << ACCIDENTAL) | (1L << BARLINE) | (1L << NUMREPEAT) | (1L << WHITESPACE) | (1L << DIGIT))) != 0) );
      setState(115);
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
    enterRule(_localctx, 24, RULE_text);
    int _la;
    try {
      enterOuterAlt(_localctx, 1);
      {
      setState(117);
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
    "\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3\21z\4\2\t\2\4\3"+
      "\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
      "\t\13\4\f\t\f\4\r\t\r\4\16\t\16\3\2\3\2\3\2\3\3\6\3!\n\3\r\3\16\3"+
      "\"\3\3\3\3\3\3\3\3\5\3)\n\3\3\4\3\4\3\4\3\4\3\4\3\4\3\4\5\4\62\n\4"+
      "\3\5\3\5\3\6\3\6\3\6\3\6\3\7\3\7\3\7\6\7=\n\7\r\7\16\7>\3\b\3\b\3"+
      "\b\3\t\3\t\6\tF\n\t\r\t\16\tG\3\t\3\t\3\n\5\nM\n\n\3\n\3\n\5\nQ\n"+
      "\n\3\n\5\nT\n\n\3\13\3\13\5\13X\n\13\3\f\6\f[\n\f\r\f\16\f\\\5\f_"+
      "\n\f\3\f\3\f\6\fc\n\f\r\f\16\fd\5\fg\n\f\3\f\6\fj\n\f\r\f\16\fk\5"+
      "\fn\n\f\3\r\3\r\6\rr\n\r\r\r\16\rs\3\r\3\r\3\16\3\16\3\16\2\2\17\2"+
      "\4\6\b\n\f\16\20\22\24\26\30\32\2\3\3\2\17\17\u0083\2\34\3\2\2\2\4"+
      "(\3\2\2\2\6\61\3\2\2\2\b\63\3\2\2\2\n\65\3\2\2\2\f9\3\2\2\2\16@\3"+
      "\2\2\2\20C\3\2\2\2\22L\3\2\2\2\24U\3\2\2\2\26m\3\2\2\2\30o\3\2\2\2"+
      "\32w\3\2\2\2\34\35\5\4\3\2\35\36\7\2\2\3\36\3\3\2\2\2\37!\5\6\4\2"+
      " \37\3\2\2\2!\"\3\2\2\2\" \3\2\2\2\"#\3\2\2\2#$\3\2\2\2$%\7\17\2\2"+
      "%)\3\2\2\2&)\5\b\5\2\')\5\30\r\2( \3\2\2\2(&\3\2\2\2(\'\3\2\2\2)\5"+
      "\3\2\2\2*\62\5\22\n\2+\62\5\24\13\2,\62\5\20\t\2-\62\5\f\7\2.\62\7"+
      "\r\2\2/\62\7\16\2\2\60\62\7\20\2\2\61*\3\2\2\2\61+\3\2\2\2\61,\3\2"+
      "\2\2\61-\3\2\2\2\61.\3\2\2\2\61/\3\2\2\2\61\60\3\2\2\2\62\7\3\2\2"+
      "\2\63\64\5\n\6\2\64\t\3\2\2\2\65\66\7\3\2\2\66\67\5\32\16\2\678\7"+
      "\17\2\28\13\3\2\2\29<\5\16\b\2:=\5\22\n\2;=\5\20\t\2<:\3\2\2\2<;\3"+
      "\2\2\2=>\3\2\2\2><\3\2\2\2>?\3\2\2\2?\r\3\2\2\2@A\7\4\2\2AB\7\21\2"+
      "\2B\17\3\2\2\2CE\7\5\2\2DF\5\22\n\2ED\3\2\2\2FG\3\2\2\2GE\3\2\2\2"+
      "GH\3\2\2\2HI\3\2\2\2IJ\7\6\2\2J\21\3\2\2\2KM\7\f\2\2LK\3\2\2\2LM\3"+
      "\2\2\2MN\3\2\2\2NP\7\n\2\2OQ\7\13\2\2PO\3\2\2\2PQ\3\2\2\2QS\3\2\2"+
      "\2RT\5\26\f\2SR\3\2\2\2ST\3\2\2\2T\23\3\2\2\2UW\7\7\2\2VX\5\26\f\2"+
      "WV\3\2\2\2WX\3\2\2\2X\25\3\2\2\2Y[\7\21\2\2ZY\3\2\2\2[\\\3\2\2\2\\"+
      "Z\3\2\2\2\\]\3\2\2\2]_\3\2\2\2^Z\3\2\2\2^_\3\2\2\2_`\3\2\2\2`f\7\b"+
      "\2\2ac\7\21\2\2ba\3\2\2\2cd\3\2\2\2db\3\2\2\2de\3\2\2\2eg\3\2\2\2"+
      "fb\3\2\2\2fg\3\2\2\2gn\3\2\2\2hj\7\21\2\2ih\3\2\2\2jk\3\2\2\2ki\3"+
      "\2\2\2kl\3\2\2\2ln\3\2\2\2m^\3\2\2\2mi\3\2\2\2n\27\3\2\2\2oq\7\t\2"+
      "\2pr\5\32\16\2qp\3\2\2\2rs\3\2\2\2sq\3\2\2\2st\3\2\2\2tu\3\2\2\2u"+
      "v\7\17\2\2v\31\3\2\2\2wx\n\2\2\2x\33\3\2\2\2\23\"(\61<>GLPSW\\^df"+
      "kms";
  public static final ATN _ATN =
    new ATNDeserializer().deserialize(_serializedATN.toCharArray());
  static {
    _decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
    for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
      _decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
    }
  }
}