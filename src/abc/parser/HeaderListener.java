// Generated from Header.g4 by ANTLR 4.5.1

package abc.parser;
// Do not edit this .java file! Edit the .g4 file and re-run Antlr.

import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link HeaderParser}.
 */
public interface HeaderListener extends ParseTreeListener {
  /**
   * Enter a parse tree produced by {@link HeaderParser#root}.
   * @param ctx the parse tree
   */
  void enterRoot(HeaderParser.RootContext ctx);
  /**
   * Exit a parse tree produced by {@link HeaderParser#root}.
   * @param ctx the parse tree
   */
  void exitRoot(HeaderParser.RootContext ctx);
  /**
   * Enter a parse tree produced by {@link HeaderParser#header}.
   * @param ctx the parse tree
   */
  void enterHeader(HeaderParser.HeaderContext ctx);
  /**
   * Exit a parse tree produced by {@link HeaderParser#header}.
   * @param ctx the parse tree
   */
  void exitHeader(HeaderParser.HeaderContext ctx);
  /**
   * Enter a parse tree produced by {@link HeaderParser#index}.
   * @param ctx the parse tree
   */
  void enterIndex(HeaderParser.IndexContext ctx);
  /**
   * Exit a parse tree produced by {@link HeaderParser#index}.
   * @param ctx the parse tree
   */
  void exitIndex(HeaderParser.IndexContext ctx);
  /**
   * Enter a parse tree produced by {@link HeaderParser#title}.
   * @param ctx the parse tree
   */
  void enterTitle(HeaderParser.TitleContext ctx);
  /**
   * Exit a parse tree produced by {@link HeaderParser#title}.
   * @param ctx the parse tree
   */
  void exitTitle(HeaderParser.TitleContext ctx);
  /**
   * Enter a parse tree produced by {@link HeaderParser#otherfields}.
   * @param ctx the parse tree
   */
  void enterOtherfields(HeaderParser.OtherfieldsContext ctx);
  /**
   * Exit a parse tree produced by {@link HeaderParser#otherfields}.
   * @param ctx the parse tree
   */
  void exitOtherfields(HeaderParser.OtherfieldsContext ctx);
  /**
   * Enter a parse tree produced by {@link HeaderParser#composer}.
   * @param ctx the parse tree
   */
  void enterComposer(HeaderParser.ComposerContext ctx);
  /**
   * Exit a parse tree produced by {@link HeaderParser#composer}.
   * @param ctx the parse tree
   */
  void exitComposer(HeaderParser.ComposerContext ctx);
  /**
   * Enter a parse tree produced by {@link HeaderParser#length}.
   * @param ctx the parse tree
   */
  void enterLength(HeaderParser.LengthContext ctx);
  /**
   * Exit a parse tree produced by {@link HeaderParser#length}.
   * @param ctx the parse tree
   */
  void exitLength(HeaderParser.LengthContext ctx);
  /**
   * Enter a parse tree produced by {@link HeaderParser#tempo}.
   * @param ctx the parse tree
   */
  void enterTempo(HeaderParser.TempoContext ctx);
  /**
   * Exit a parse tree produced by {@link HeaderParser#tempo}.
   * @param ctx the parse tree
   */
  void exitTempo(HeaderParser.TempoContext ctx);
  /**
   * Enter a parse tree produced by {@link HeaderParser#meter}.
   * @param ctx the parse tree
   */
  void enterMeter(HeaderParser.MeterContext ctx);
  /**
   * Exit a parse tree produced by {@link HeaderParser#meter}.
   * @param ctx the parse tree
   */
  void exitMeter(HeaderParser.MeterContext ctx);
  /**
   * Enter a parse tree produced by {@link HeaderParser#voice}.
   * @param ctx the parse tree
   */
  void enterVoice(HeaderParser.VoiceContext ctx);
  /**
   * Exit a parse tree produced by {@link HeaderParser#voice}.
   * @param ctx the parse tree
   */
  void exitVoice(HeaderParser.VoiceContext ctx);
  /**
   * Enter a parse tree produced by {@link HeaderParser#key}.
   * @param ctx the parse tree
   */
  void enterKey(HeaderParser.KeyContext ctx);
  /**
   * Exit a parse tree produced by {@link HeaderParser#key}.
   * @param ctx the parse tree
   */
  void exitKey(HeaderParser.KeyContext ctx);
  /**
   * Enter a parse tree produced by {@link HeaderParser#comment}.
   * @param ctx the parse tree
   */
  void enterComment(HeaderParser.CommentContext ctx);
  /**
   * Exit a parse tree produced by {@link HeaderParser#comment}.
   * @param ctx the parse tree
   */
  void exitComment(HeaderParser.CommentContext ctx);
  /**
   * Enter a parse tree produced by {@link HeaderParser#text}.
   * @param ctx the parse tree
   */
  void enterText(HeaderParser.TextContext ctx);
  /**
   * Exit a parse tree produced by {@link HeaderParser#text}.
   * @param ctx the parse tree
   */
  void exitText(HeaderParser.TextContext ctx);
}