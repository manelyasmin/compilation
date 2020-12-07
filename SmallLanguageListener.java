// Generated from C:/Users/hammo/IdeaProjects/tpCompil3\SmallLanguage.g4 by ANTLR 4.7.2
package gen;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link SmallLanguageParser}.
 */
public interface SmallLanguageListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link SmallLanguageParser#parse}.
	 * @param ctx the parse tree
	 */
	void enterParse(SmallLanguageParser.ParseContext ctx);
	/**
	 * Exit a parse tree produced by {@link SmallLanguageParser#parse}.
	 * @param ctx the parse tree
	 */
	void exitParse(SmallLanguageParser.ParseContext ctx);
	/**
	 * Enter a parse tree produced by {@link SmallLanguageParser#block}.
	 * @param ctx the parse tree
	 */
	void enterBlock(SmallLanguageParser.BlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link SmallLanguageParser#block}.
	 * @param ctx the parse tree
	 */
	void exitBlock(SmallLanguageParser.BlockContext ctx);
	/**
	 * Enter a parse tree produced by {@link SmallLanguageParser#prog}.
	 * @param ctx the parse tree
	 */
	void enterProg(SmallLanguageParser.ProgContext ctx);
	/**
	 * Exit a parse tree produced by {@link SmallLanguageParser#prog}.
	 * @param ctx the parse tree
	 */
	void exitProg(SmallLanguageParser.ProgContext ctx);
	/**
	 * Enter a parse tree produced by {@link SmallLanguageParser#bib}.
	 * @param ctx the parse tree
	 */
	void enterBib(SmallLanguageParser.BibContext ctx);
	/**
	 * Exit a parse tree produced by {@link SmallLanguageParser#bib}.
	 * @param ctx the parse tree
	 */
	void exitBib(SmallLanguageParser.BibContext ctx);
	/**
	 * Enter a parse tree produced by {@link SmallLanguageParser#modificateur}.
	 * @param ctx the parse tree
	 */
	void enterModificateur(SmallLanguageParser.ModificateurContext ctx);
	/**
	 * Exit a parse tree produced by {@link SmallLanguageParser#modificateur}.
	 * @param ctx the parse tree
	 */
	void exitModificateur(SmallLanguageParser.ModificateurContext ctx);
	/**
	 * Enter a parse tree produced by {@link SmallLanguageParser#variable}.
	 * @param ctx the parse tree
	 */
	void enterVariable(SmallLanguageParser.VariableContext ctx);
	/**
	 * Exit a parse tree produced by {@link SmallLanguageParser#variable}.
	 * @param ctx the parse tree
	 */
	void exitVariable(SmallLanguageParser.VariableContext ctx);
	/**
	 * Enter a parse tree produced by {@link SmallLanguageParser#id1}.
	 * @param ctx the parse tree
	 */
	void enterId1(SmallLanguageParser.Id1Context ctx);
	/**
	 * Exit a parse tree produced by {@link SmallLanguageParser#id1}.
	 * @param ctx the parse tree
	 */
	void exitId1(SmallLanguageParser.Id1Context ctx);
	/**
	 * Enter a parse tree produced by {@link SmallLanguageParser#typevar}.
	 * @param ctx the parse tree
	 */
	void enterTypevar(SmallLanguageParser.TypevarContext ctx);
	/**
	 * Exit a parse tree produced by {@link SmallLanguageParser#typevar}.
	 * @param ctx the parse tree
	 */
	void exitTypevar(SmallLanguageParser.TypevarContext ctx);
	/**
	 * Enter a parse tree produced by {@link SmallLanguageParser#instruction}.
	 * @param ctx the parse tree
	 */
	void enterInstruction(SmallLanguageParser.InstructionContext ctx);
	/**
	 * Exit a parse tree produced by {@link SmallLanguageParser#instruction}.
	 * @param ctx the parse tree
	 */
	void exitInstruction(SmallLanguageParser.InstructionContext ctx);
	/**
	 * Enter a parse tree produced by {@link SmallLanguageParser#read}.
	 * @param ctx the parse tree
	 */
	void enterRead(SmallLanguageParser.ReadContext ctx);
	/**
	 * Exit a parse tree produced by {@link SmallLanguageParser#read}.
	 * @param ctx the parse tree
	 */
	void exitRead(SmallLanguageParser.ReadContext ctx);
	/**
	 * Enter a parse tree produced by {@link SmallLanguageParser#write}.
	 * @param ctx the parse tree
	 */
	void enterWrite(SmallLanguageParser.WriteContext ctx);
	/**
	 * Exit a parse tree produced by {@link SmallLanguageParser#write}.
	 * @param ctx the parse tree
	 */
	void exitWrite(SmallLanguageParser.WriteContext ctx);
	/**
	 * Enter a parse tree produced by {@link SmallLanguageParser#condition}.
	 * @param ctx the parse tree
	 */
	void enterCondition(SmallLanguageParser.ConditionContext ctx);
	/**
	 * Exit a parse tree produced by {@link SmallLanguageParser#condition}.
	 * @param ctx the parse tree
	 */
	void exitCondition(SmallLanguageParser.ConditionContext ctx);
	/**
	 * Enter a parse tree produced by {@link SmallLanguageParser#assignmet}.
	 * @param ctx the parse tree
	 */
	void enterAssignmet(SmallLanguageParser.AssignmetContext ctx);
	/**
	 * Exit a parse tree produced by {@link SmallLanguageParser#assignmet}.
	 * @param ctx the parse tree
	 */
	void exitAssignmet(SmallLanguageParser.AssignmetContext ctx);
	/**
	 * Enter a parse tree produced by {@link SmallLanguageParser#signe}.
	 * @param ctx the parse tree
	 */
	void enterSigne(SmallLanguageParser.SigneContext ctx);
	/**
	 * Exit a parse tree produced by {@link SmallLanguageParser#signe}.
	 * @param ctx the parse tree
	 */
	void exitSigne(SmallLanguageParser.SigneContext ctx);
	/**
	 * Enter a parse tree produced by {@link SmallLanguageParser#cond_block}.
	 * @param ctx the parse tree
	 */
	void enterCond_block(SmallLanguageParser.Cond_blockContext ctx);
	/**
	 * Exit a parse tree produced by {@link SmallLanguageParser#cond_block}.
	 * @param ctx the parse tree
	 */
	void exitCond_block(SmallLanguageParser.Cond_blockContext ctx);
	/**
	 * Enter a parse tree produced by the {@code negationExpr}
	 * labeled alternative in {@link SmallLanguageParser#exp}.
	 * @param ctx the parse tree
	 */
	void enterNegationExpr(SmallLanguageParser.NegationExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code negationExpr}
	 * labeled alternative in {@link SmallLanguageParser#exp}.
	 * @param ctx the parse tree
	 */
	void exitNegationExpr(SmallLanguageParser.NegationExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code additionExpr}
	 * labeled alternative in {@link SmallLanguageParser#exp}.
	 * @param ctx the parse tree
	 */
	void enterAdditionExpr(SmallLanguageParser.AdditionExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code additionExpr}
	 * labeled alternative in {@link SmallLanguageParser#exp}.
	 * @param ctx the parse tree
	 */
	void exitAdditionExpr(SmallLanguageParser.AdditionExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code multiplicationExpr}
	 * labeled alternative in {@link SmallLanguageParser#exp}.
	 * @param ctx the parse tree
	 */
	void enterMultiplicationExpr(SmallLanguageParser.MultiplicationExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code multiplicationExpr}
	 * labeled alternative in {@link SmallLanguageParser#exp}.
	 * @param ctx the parse tree
	 */
	void exitMultiplicationExpr(SmallLanguageParser.MultiplicationExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code atomExpr}
	 * labeled alternative in {@link SmallLanguageParser#exp}.
	 * @param ctx the parse tree
	 */
	void enterAtomExpr(SmallLanguageParser.AtomExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code atomExpr}
	 * labeled alternative in {@link SmallLanguageParser#exp}.
	 * @param ctx the parse tree
	 */
	void exitAtomExpr(SmallLanguageParser.AtomExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code orExpr}
	 * labeled alternative in {@link SmallLanguageParser#exp}.
	 * @param ctx the parse tree
	 */
	void enterOrExpr(SmallLanguageParser.OrExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code orExpr}
	 * labeled alternative in {@link SmallLanguageParser#exp}.
	 * @param ctx the parse tree
	 */
	void exitOrExpr(SmallLanguageParser.OrExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code equaliteExpr}
	 * labeled alternative in {@link SmallLanguageParser#exp}.
	 * @param ctx the parse tree
	 */
	void enterEqualiteExpr(SmallLanguageParser.EqualiteExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code equaliteExpr}
	 * labeled alternative in {@link SmallLanguageParser#exp}.
	 * @param ctx the parse tree
	 */
	void exitEqualiteExpr(SmallLanguageParser.EqualiteExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code relationExpr}
	 * labeled alternative in {@link SmallLanguageParser#exp}.
	 * @param ctx the parse tree
	 */
	void enterRelationExpr(SmallLanguageParser.RelationExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code relationExpr}
	 * labeled alternative in {@link SmallLanguageParser#exp}.
	 * @param ctx the parse tree
	 */
	void exitRelationExpr(SmallLanguageParser.RelationExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code andExpr}
	 * labeled alternative in {@link SmallLanguageParser#exp}.
	 * @param ctx the parse tree
	 */
	void enterAndExpr(SmallLanguageParser.AndExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code andExpr}
	 * labeled alternative in {@link SmallLanguageParser#exp}.
	 * @param ctx the parse tree
	 */
	void exitAndExpr(SmallLanguageParser.AndExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code parExpr}
	 * labeled alternative in {@link SmallLanguageParser#atom}.
	 * @param ctx the parse tree
	 */
	void enterParExpr(SmallLanguageParser.ParExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code parExpr}
	 * labeled alternative in {@link SmallLanguageParser#atom}.
	 * @param ctx the parse tree
	 */
	void exitParExpr(SmallLanguageParser.ParExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code numberAtom}
	 * labeled alternative in {@link SmallLanguageParser#atom}.
	 * @param ctx the parse tree
	 */
	void enterNumberAtom(SmallLanguageParser.NumberAtomContext ctx);
	/**
	 * Exit a parse tree produced by the {@code numberAtom}
	 * labeled alternative in {@link SmallLanguageParser#atom}.
	 * @param ctx the parse tree
	 */
	void exitNumberAtom(SmallLanguageParser.NumberAtomContext ctx);
	/**
	 * Enter a parse tree produced by the {@code idAtom}
	 * labeled alternative in {@link SmallLanguageParser#atom}.
	 * @param ctx the parse tree
	 */
	void enterIdAtom(SmallLanguageParser.IdAtomContext ctx);
	/**
	 * Exit a parse tree produced by the {@code idAtom}
	 * labeled alternative in {@link SmallLanguageParser#atom}.
	 * @param ctx the parse tree
	 */
	void exitIdAtom(SmallLanguageParser.IdAtomContext ctx);
	/**
	 * Enter a parse tree produced by the {@code stringAtom}
	 * labeled alternative in {@link SmallLanguageParser#atom}.
	 * @param ctx the parse tree
	 */
	void enterStringAtom(SmallLanguageParser.StringAtomContext ctx);
	/**
	 * Exit a parse tree produced by the {@code stringAtom}
	 * labeled alternative in {@link SmallLanguageParser#atom}.
	 * @param ctx the parse tree
	 */
	void exitStringAtom(SmallLanguageParser.StringAtomContext ctx);
	/**
	 * Enter a parse tree produced by {@link SmallLanguageParser#sentier}.
	 * @param ctx the parse tree
	 */
	void enterSentier(SmallLanguageParser.SentierContext ctx);
	/**
	 * Exit a parse tree produced by {@link SmallLanguageParser#sentier}.
	 * @param ctx the parse tree
	 */
	void exitSentier(SmallLanguageParser.SentierContext ctx);
	/**
	 * Enter a parse tree produced by {@link SmallLanguageParser#sfloat}.
	 * @param ctx the parse tree
	 */
	void enterSfloat(SmallLanguageParser.SfloatContext ctx);
	/**
	 * Exit a parse tree produced by {@link SmallLanguageParser#sfloat}.
	 * @param ctx the parse tree
	 */
	void exitSfloat(SmallLanguageParser.SfloatContext ctx);
	/**
	 * Enter a parse tree produced by {@link SmallLanguageParser#sstring}.
	 * @param ctx the parse tree
	 */
	void enterSstring(SmallLanguageParser.SstringContext ctx);
	/**
	 * Exit a parse tree produced by {@link SmallLanguageParser#sstring}.
	 * @param ctx the parse tree
	 */
	void exitSstring(SmallLanguageParser.SstringContext ctx);
}