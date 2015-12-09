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
   * Enter a parse tree produced by {@link MusicParser#measure}.
   * @param ctx the parse tree
   */
  void enterMeasure(MusicParser.MeasureContext ctx);
  /**
   * Exit a parse tree produced by {@link MusicParser#measure}.
   * @param ctx the parse tree
   */
  void exitMeasure(MusicParser.MeasureContext ctx);
  /**
   * Enter a parse tree produced by {@link MusicParser#firstendingmeasure}.
   * @param ctx the parse tree
   */
  void enterFirstendingmeasure(MusicParser.FirstendingmeasureContext ctx);
  /**
   * Exit a parse tree produced by {@link MusicParser#firstendingmeasure}.
   * @param ctx the parse tree
   */
  void exitFirstendingmeasure(MusicParser.FirstendingmeasureContext ctx);
  /**
   * Enter a parse tree produced by {@link MusicParser#secondendingmeasure}.
   * @param ctx the parse tree
   */
  void enterSecondendingmeasure(MusicParser.SecondendingmeasureContext ctx);
  /**
   * Exit a parse tree produced by {@link MusicParser#secondendingmeasure}.
   * @param ctx the parse tree
   */
  void exitSecondendingmeasure(MusicParser.SecondendingmeasureContext ctx);
  /**
   * Enter a parse tree produced by {@link MusicParser#doublebarmeasure}.
   * @param ctx the parse tree
   */
  void enterDoublebarmeasure(MusicParser.DoublebarmeasureContext ctx);
  /**
   * Exit a parse tree produced by {@link MusicParser#doublebarmeasure}.
   * @param ctx the parse tree
   */
  void exitDoublebarmeasure(MusicParser.DoublebarmeasureContext ctx);
  /**
   * Enter a parse tree produced by {@link MusicParser#startrepeatmeasure}.
   * @param ctx the parse tree
   */
  void enterStartrepeatmeasure(MusicParser.StartrepeatmeasureContext ctx);
  /**
   * Exit a parse tree produced by {@link MusicParser#startrepeatmeasure}.
   * @param ctx the parse tree
   */
  void exitStartrepeatmeasure(MusicParser.StartrepeatmeasureContext ctx);
  /**
   * Enter a parse tree produced by {@link MusicParser#endrepeatmeasure}.
   * @param ctx the parse tree
   */
  void enterEndrepeatmeasure(MusicParser.EndrepeatmeasureContext ctx);
  /**
   * Exit a parse tree produced by {@link MusicParser#endrepeatmeasure}.
   * @param ctx the parse tree
   */
  void exitEndrepeatmeasure(MusicParser.EndrepeatmeasureContext ctx);
  /**
   * Enter a parse tree produced by {@link MusicParser#singlerepeatmeasure}.
   * @param ctx the parse tree
   */
  void enterSinglerepeatmeasure(MusicParser.SinglerepeatmeasureContext ctx);
  /**
   * Exit a parse tree produced by {@link MusicParser#singlerepeatmeasure}.
   * @param ctx the parse tree
   */
  void exitSinglerepeatmeasure(MusicParser.SinglerepeatmeasureContext ctx);
  /**
   * Enter a parse tree produced by {@link MusicParser#normalmeasure}.
   * @param ctx the parse tree
   */
  void enterNormalmeasure(MusicParser.NormalmeasureContext ctx);
  /**
   * Exit a parse tree produced by {@link MusicParser#normalmeasure}.
   * @param ctx the parse tree
   */
  void exitNormalmeasure(MusicParser.NormalmeasureContext ctx);
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
   * Enter a parse tree produced by {@link MusicParser#noteelement}.
   * @param ctx the parse tree
   */
  void enterNoteelement(MusicParser.NoteelementContext ctx);
  /**
   * Exit a parse tree produced by {@link MusicParser#noteelement}.
   * @param ctx the parse tree
   */
  void exitNoteelement(MusicParser.NoteelementContext ctx);
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
   * Enter a parse tree produced by {@link MusicParser#pitch}.
   * @param ctx the parse tree
   */
  void enterPitch(MusicParser.PitchContext ctx);
  /**
   * Exit a parse tree produced by {@link MusicParser#pitch}.
   * @param ctx the parse tree
   */
  void exitPitch(MusicParser.PitchContext ctx);
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
   * Enter a parse tree produced by {@link MusicParser#tupletelement}.
   * @param ctx the parse tree
   */
  void enterTupletelement(MusicParser.TupletelementContext ctx);
  /**
   * Exit a parse tree produced by {@link MusicParser#tupletelement}.
   * @param ctx the parse tree
   */
  void exitTupletelement(MusicParser.TupletelementContext ctx);
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