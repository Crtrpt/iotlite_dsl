// Generated from D:/iotlang/src/main/antlr4\Iotlang.g4 by ANTLR 4.9.1
package com.dj.iot.dsl;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link IotlangParser}.
 */
public interface IotlangListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link IotlangParser#prog}.
	 * @param ctx the parse tree
	 */
	void enterProg(IotlangParser.ProgContext ctx);
	/**
	 * Exit a parse tree produced by {@link IotlangParser#prog}.
	 * @param ctx the parse tree
	 */
	void exitProg(IotlangParser.ProgContext ctx);
	/**
	 * Enter a parse tree produced by {@link IotlangParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStatement(IotlangParser.StatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link IotlangParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStatement(IotlangParser.StatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link IotlangParser#func_argv}.
	 * @param ctx the parse tree
	 */
	void enterFunc_argv(IotlangParser.Func_argvContext ctx);
	/**
	 * Exit a parse tree produced by {@link IotlangParser#func_argv}.
	 * @param ctx the parse tree
	 */
	void exitFunc_argv(IotlangParser.Func_argvContext ctx);
	/**
	 * Enter a parse tree produced by {@link IotlangParser#func_def}.
	 * @param ctx the parse tree
	 */
	void enterFunc_def(IotlangParser.Func_defContext ctx);
	/**
	 * Exit a parse tree produced by {@link IotlangParser#func_def}.
	 * @param ctx the parse tree
	 */
	void exitFunc_def(IotlangParser.Func_defContext ctx);
	/**
	 * Enter a parse tree produced by {@link IotlangParser#func_call}.
	 * @param ctx the parse tree
	 */
	void enterFunc_call(IotlangParser.Func_callContext ctx);
	/**
	 * Exit a parse tree produced by {@link IotlangParser#func_call}.
	 * @param ctx the parse tree
	 */
	void exitFunc_call(IotlangParser.Func_callContext ctx);
	/**
	 * Enter a parse tree produced by {@link IotlangParser#block}.
	 * @param ctx the parse tree
	 */
	void enterBlock(IotlangParser.BlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link IotlangParser#block}.
	 * @param ctx the parse tree
	 */
	void exitBlock(IotlangParser.BlockContext ctx);
	/**
	 * Enter a parse tree produced by {@link IotlangParser#func_return}.
	 * @param ctx the parse tree
	 */
	void enterFunc_return(IotlangParser.Func_returnContext ctx);
	/**
	 * Exit a parse tree produced by {@link IotlangParser#func_return}.
	 * @param ctx the parse tree
	 */
	void exitFunc_return(IotlangParser.Func_returnContext ctx);
	/**
	 * Enter a parse tree produced by {@link IotlangParser#break_statement}.
	 * @param ctx the parse tree
	 */
	void enterBreak_statement(IotlangParser.Break_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link IotlangParser#break_statement}.
	 * @param ctx the parse tree
	 */
	void exitBreak_statement(IotlangParser.Break_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link IotlangParser#continue_statement}.
	 * @param ctx the parse tree
	 */
	void enterContinue_statement(IotlangParser.Continue_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link IotlangParser#continue_statement}.
	 * @param ctx the parse tree
	 */
	void exitContinue_statement(IotlangParser.Continue_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link IotlangParser#loop_statement}.
	 * @param ctx the parse tree
	 */
	void enterLoop_statement(IotlangParser.Loop_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link IotlangParser#loop_statement}.
	 * @param ctx the parse tree
	 */
	void exitLoop_statement(IotlangParser.Loop_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link IotlangParser#if_statement}.
	 * @param ctx the parse tree
	 */
	void enterIf_statement(IotlangParser.If_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link IotlangParser#if_statement}.
	 * @param ctx the parse tree
	 */
	void exitIf_statement(IotlangParser.If_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link IotlangParser#assign}.
	 * @param ctx the parse tree
	 */
	void enterAssign(IotlangParser.AssignContext ctx);
	/**
	 * Exit a parse tree produced by {@link IotlangParser#assign}.
	 * @param ctx the parse tree
	 */
	void exitAssign(IotlangParser.AssignContext ctx);
	/**
	 * Enter a parse tree produced by {@link IotlangParser#expr_statement}.
	 * @param ctx the parse tree
	 */
	void enterExpr_statement(IotlangParser.Expr_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link IotlangParser#expr_statement}.
	 * @param ctx the parse tree
	 */
	void exitExpr_statement(IotlangParser.Expr_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link IotlangParser#condition_expr}.
	 * @param ctx the parse tree
	 */
	void enterCondition_expr(IotlangParser.Condition_exprContext ctx);
	/**
	 * Exit a parse tree produced by {@link IotlangParser#condition_expr}.
	 * @param ctx the parse tree
	 */
	void exitCondition_expr(IotlangParser.Condition_exprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Val}
	 * labeled alternative in {@link IotlangParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterVal(IotlangParser.ValContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Val}
	 * labeled alternative in {@link IotlangParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitVal(IotlangParser.ValContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Arith}
	 * labeled alternative in {@link IotlangParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterArith(IotlangParser.ArithContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Arith}
	 * labeled alternative in {@link IotlangParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitArith(IotlangParser.ArithContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Var}
	 * labeled alternative in {@link IotlangParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterVar(IotlangParser.VarContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Var}
	 * labeled alternative in {@link IotlangParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitVar(IotlangParser.VarContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Paren}
	 * labeled alternative in {@link IotlangParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterParen(IotlangParser.ParenContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Paren}
	 * labeled alternative in {@link IotlangParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitParen(IotlangParser.ParenContext ctx);
}