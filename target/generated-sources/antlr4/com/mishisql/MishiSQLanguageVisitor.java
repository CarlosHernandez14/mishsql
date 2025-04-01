// Generated from com\mishisql\MishiSQLanguage.g4 by ANTLR 4.9.2
package com.mishisql;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link MishiSQLanguageParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface MishiSQLanguageVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link MishiSQLanguageParser#start}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStart(MishiSQLanguageParser.StartContext ctx);
	/**
	 * Visit a parse tree produced by {@link MishiSQLanguageParser#query}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitQuery(MishiSQLanguageParser.QueryContext ctx);
	/**
	 * Visit a parse tree produced by {@link MishiSQLanguageParser#selectQuery}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSelectQuery(MishiSQLanguageParser.SelectQueryContext ctx);
	/**
	 * Visit a parse tree produced by {@link MishiSQLanguageParser#condition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCondition(MishiSQLanguageParser.ConditionContext ctx);
}