// Generated from com\mishisql\MishiSQLanguage.g4 by ANTLR 4.9.2
package com.mishisql;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link MishiSQLanguageParser}.
 */
public interface MishiSQLanguageListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link MishiSQLanguageParser#start}.
	 * @param ctx the parse tree
	 */
	void enterStart(MishiSQLanguageParser.StartContext ctx);
	/**
	 * Exit a parse tree produced by {@link MishiSQLanguageParser#start}.
	 * @param ctx the parse tree
	 */
	void exitStart(MishiSQLanguageParser.StartContext ctx);
	/**
	 * Enter a parse tree produced by {@link MishiSQLanguageParser#query}.
	 * @param ctx the parse tree
	 */
	void enterQuery(MishiSQLanguageParser.QueryContext ctx);
	/**
	 * Exit a parse tree produced by {@link MishiSQLanguageParser#query}.
	 * @param ctx the parse tree
	 */
	void exitQuery(MishiSQLanguageParser.QueryContext ctx);
	/**
	 * Enter a parse tree produced by {@link MishiSQLanguageParser#selectQuery}.
	 * @param ctx the parse tree
	 */
	void enterSelectQuery(MishiSQLanguageParser.SelectQueryContext ctx);
	/**
	 * Exit a parse tree produced by {@link MishiSQLanguageParser#selectQuery}.
	 * @param ctx the parse tree
	 */
	void exitSelectQuery(MishiSQLanguageParser.SelectQueryContext ctx);
	/**
	 * Enter a parse tree produced by {@link MishiSQLanguageParser#condition}.
	 * @param ctx the parse tree
	 */
	void enterCondition(MishiSQLanguageParser.ConditionContext ctx);
	/**
	 * Exit a parse tree produced by {@link MishiSQLanguageParser#condition}.
	 * @param ctx the parse tree
	 */
	void exitCondition(MishiSQLanguageParser.ConditionContext ctx);
}