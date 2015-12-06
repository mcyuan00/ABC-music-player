// Generated from Music.g4 by ANTLR 4.5.1

package abc.parser;
// Do not edit this .java file! Edit the .g4 file and re-run Antlr.

import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link MusicParser}.
 */
public interface MusicListener extends ParseTreeListener {
  /**
   * Enter a parse tree produced by {@link MusicParser#root}.
   * @param ctx the parse tree
   */
  void enterRoot(MusicParser.RootContext ctx);
  /**
   * Exit a parse tree produced by {@link MusicParser#root}.
   * @param ctx the parse tree
   */
  void exitRoot(MusicParser.RootContext ctx);
  /**
   * Enter a parse tree produced by {@link MusicParser#music}.
   * @param ctx the parse tree
   */
  void enterMusic(MusicParser.MusicContext ctx);
  /**
   * Exit a parse tree produced by {@link MusicParser#music}.
   * @param ctx the parse tree
   */
  void exitMusic(MusicParser.MusicContext ctx);
  /**
   * Enter a parse tree produced by {@link MusicParser#element}.
   * @param ctx the parse tree
   */
  void enterElement(MusicParser.ElementContext ctx);
  /**
   * Exit a parse tree produced by {@link MusicParser#element}.
   * @param ctx the parse tree
   */
  void exitElement(MusicParser.ElementContext ctx);
  /**
   * Enter a parse tree produced by {@link MusicParser#midtune}.
   * @param ctx the parse tree
   */
  void enterMidtune(MusicParser.MidtuneContext ctx);
  /**
   * Exit a parse tree produced by {@link MusicParser#midtune}.
   * @param ctx the parse tree
   */
  void exitMidtune(MusicParser.MidtuneContext ctx);
  /**
   * Enter a parse tree produced by {@link MusicParser#voice}.
   * @param ctx the parse tree
   */
  void enterVoice(MusicParser.VoiceContext ctx);
  /**
   * Exit a parse tree produced by {@link MusicParser#voice}.
   * @param ctx the parse tree
   */
  void exitVoice(MusicParser.VoiceContext ctx);
  /**
   * Enter a parse tree produced by {@link MusicParser#chord}.
   * @param ctx the parse tree
   */
  void enterChord(MusicParser.ChordContext ctx);
  /**
   * Exit a parse tree produced by {@link MusicParser#chord}.
   * @param ctx the parse tree
   */
  void exitChord(MusicParser.ChordContext ctx);
  /**
   * Enter a parse tree produced by {@link MusicParser#note}.
   * @param ctx the parse tree
   */
  void enterNote(MusicParser.NoteContext ctx);
  /**
   * Exit a parse tree produced by {@link MusicParser#note}.
   * @param ctx the parse tree
   */
  void exitNote(MusicParser.NoteContext ctx);
  /**
   * Enter a parse tree produced by {@link MusicParser#rest}.
   * @param ctx the parse tree
   */
  void enterRest(MusicParser.RestContext ctx);
  /**
   * Exit a parse tree produced by {@link MusicParser#rest}.
   * @param ctx the parse tree
   */
  void exitRest(MusicParser.RestContext ctx);
  /**
   * Enter a parse tree produced by {@link MusicParser#notelength}.
   * @param ctx the parse tree
   */
  void enterNotelength(MusicParser.NotelengthContext ctx);
  /**
   * Exit a parse tree produced by {@link MusicParser#notelength}.
   * @param ctx the parse tree
   */
  void exitNotelength(MusicParser.NotelengthContext ctx);
  /**
   * Enter a parse tree produced by {@link MusicParser#tuplet}.
   * @param ctx the parse tree
   */
  void enterTuplet(MusicParser.TupletContext ctx);
  /**
   * Exit a parse tree produced by {@link MusicParser#tuplet}.
   * @param ctx the parse tree
   */
  void exitTuplet(MusicParser.TupletContext ctx);
  /**
   * Enter a parse tree produced by {@link MusicParser#tupletspec}.
   * @param ctx the parse tree
   */
  void enterTupletspec(MusicParser.TupletspecContext ctx);
  /**
   * Exit a parse tree produced by {@link MusicParser#tupletspec}.
   * @param ctx the parse tree
   */
  void exitTupletspec(MusicParser.TupletspecContext ctx);
  /**
   * Enter a parse tree produced by {@link MusicParser#comment}.
   * @param ctx the parse tree
   */
  void enterComment(MusicParser.CommentContext ctx);
  /**
   * Exit a parse tree produced by {@link MusicParser#comment}.
   * @param ctx the parse tree
   */
  void exitComment(MusicParser.CommentContext ctx);
  /**
   * Enter a parse tree produced by {@link MusicParser#text}.
   * @param ctx the parse tree
   */
  void enterText(MusicParser.TextContext ctx);
  /**
   * Exit a parse tree produced by {@link MusicParser#text}.
   * @param ctx the parse tree
   */
  void exitText(MusicParser.TextContext ctx);
}