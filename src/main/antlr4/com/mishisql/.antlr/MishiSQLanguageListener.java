// Generated from c:/Users/carlo/Documents/CompilersAntlr/mishsql/src/main/antlr4/com/mishisql/MishiSQLanguage.g4 by ANTLR 4.13.1
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
	 * Enter a parse tree produced by {@link MishiSQLanguageParser#from_join}.
	 * @param ctx the parse tree
	 */
	void enterFrom_join(MishiSQLanguageParser.From_joinContext ctx);
	/**
	 * Exit a parse tree produced by {@link MishiSQLanguageParser#from_join}.
	 * @param ctx the parse tree
	 */
	void exitFrom_join(MishiSQLanguageParser.From_joinContext ctx);
	/**
	 * Enter a parse tree produced by {@link MishiSQLanguageParser#createDatabaseQuery}.
	 * @param ctx the parse tree
	 */
	void enterCreateDatabaseQuery(MishiSQLanguageParser.CreateDatabaseQueryContext ctx);
	/**
	 * Exit a parse tree produced by {@link MishiSQLanguageParser#createDatabaseQuery}.
	 * @param ctx the parse tree
	 */
	void exitCreateDatabaseQuery(MishiSQLanguageParser.CreateDatabaseQueryContext ctx);
	/**
	 * Enter a parse tree produced by {@link MishiSQLanguageParser#useDatabaseQuery}.
	 * @param ctx the parse tree
	 */
	void enterUseDatabaseQuery(MishiSQLanguageParser.UseDatabaseQueryContext ctx);
	/**
	 * Exit a parse tree produced by {@link MishiSQLanguageParser#useDatabaseQuery}.
	 * @param ctx the parse tree
	 */
	void exitUseDatabaseQuery(MishiSQLanguageParser.UseDatabaseQueryContext ctx);
	/**
	 * Enter a parse tree produced by {@link MishiSQLanguageParser#createTableQuery}.
	 * @param ctx the parse tree
	 */
	void enterCreateTableQuery(MishiSQLanguageParser.CreateTableQueryContext ctx);
	/**
	 * Exit a parse tree produced by {@link MishiSQLanguageParser#createTableQuery}.
	 * @param ctx the parse tree
	 */
	void exitCreateTableQuery(MishiSQLanguageParser.CreateTableQueryContext ctx);
	/**
	 * Enter a parse tree produced by {@link MishiSQLanguageParser#tableFields}.
	 * @param ctx the parse tree
	 */
	void enterTableFields(MishiSQLanguageParser.TableFieldsContext ctx);
	/**
	 * Exit a parse tree produced by {@link MishiSQLanguageParser#tableFields}.
	 * @param ctx the parse tree
	 */
	void exitTableFields(MishiSQLanguageParser.TableFieldsContext ctx);
	/**
	 * Enter a parse tree produced by {@link MishiSQLanguageParser#tableField}.
	 * @param ctx the parse tree
	 */
	void enterTableField(MishiSQLanguageParser.TableFieldContext ctx);
	/**
	 * Exit a parse tree produced by {@link MishiSQLanguageParser#tableField}.
	 * @param ctx the parse tree
	 */
	void exitTableField(MishiSQLanguageParser.TableFieldContext ctx);
	/**
	 * Enter a parse tree produced by {@link MishiSQLanguageParser#sqlType}.
	 * @param ctx the parse tree
	 */
	void enterSqlType(MishiSQLanguageParser.SqlTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link MishiSQLanguageParser#sqlType}.
	 * @param ctx the parse tree
	 */
	void exitSqlType(MishiSQLanguageParser.SqlTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link MishiSQLanguageParser#fieldConstraint}.
	 * @param ctx the parse tree
	 */
	void enterFieldConstraint(MishiSQLanguageParser.FieldConstraintContext ctx);
	/**
	 * Exit a parse tree produced by {@link MishiSQLanguageParser#fieldConstraint}.
	 * @param ctx the parse tree
	 */
	void exitFieldConstraint(MishiSQLanguageParser.FieldConstraintContext ctx);
	/**
	 * Enter a parse tree produced by {@link MishiSQLanguageParser#foreignKeyClause}.
	 * @param ctx the parse tree
	 */
	void enterForeignKeyClause(MishiSQLanguageParser.ForeignKeyClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link MishiSQLanguageParser#foreignKeyClause}.
	 * @param ctx the parse tree
	 */
	void exitForeignKeyClause(MishiSQLanguageParser.ForeignKeyClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link MishiSQLanguageParser#insertQuery}.
	 * @param ctx the parse tree
	 */
	void enterInsertQuery(MishiSQLanguageParser.InsertQueryContext ctx);
	/**
	 * Exit a parse tree produced by {@link MishiSQLanguageParser#insertQuery}.
	 * @param ctx the parse tree
	 */
	void exitInsertQuery(MishiSQLanguageParser.InsertQueryContext ctx);
	/**
	 * Enter a parse tree produced by {@link MishiSQLanguageParser#valueTuples}.
	 * @param ctx the parse tree
	 */
	void enterValueTuples(MishiSQLanguageParser.ValueTuplesContext ctx);
	/**
	 * Exit a parse tree produced by {@link MishiSQLanguageParser#valueTuples}.
	 * @param ctx the parse tree
	 */
	void exitValueTuples(MishiSQLanguageParser.ValueTuplesContext ctx);
	/**
	 * Enter a parse tree produced by {@link MishiSQLanguageParser#valueTuple}.
	 * @param ctx the parse tree
	 */
	void enterValueTuple(MishiSQLanguageParser.ValueTupleContext ctx);
	/**
	 * Exit a parse tree produced by {@link MishiSQLanguageParser#valueTuple}.
	 * @param ctx the parse tree
	 */
	void exitValueTuple(MishiSQLanguageParser.ValueTupleContext ctx);
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
	/**
	 * Enter a parse tree produced by {@link MishiSQLanguageParser#join_condition}.
	 * @param ctx the parse tree
	 */
	void enterJoin_condition(MishiSQLanguageParser.Join_conditionContext ctx);
	/**
	 * Exit a parse tree produced by {@link MishiSQLanguageParser#join_condition}.
	 * @param ctx the parse tree
	 */
	void exitJoin_condition(MishiSQLanguageParser.Join_conditionContext ctx);
	/**
	 * Enter a parse tree produced by {@link MishiSQLanguageParser#value}.
	 * @param ctx the parse tree
	 */
	void enterValue(MishiSQLanguageParser.ValueContext ctx);
	/**
	 * Exit a parse tree produced by {@link MishiSQLanguageParser#value}.
	 * @param ctx the parse tree
	 */
	void exitValue(MishiSQLanguageParser.ValueContext ctx);
}