// Generated from D:/iotlang/src/main/antlr4\Iotlang.g4 by ANTLR 4.9.1
package com.dj.iot.dsl;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link IotlangParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface IotlangVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link IotlangParser#prog}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProg(IotlangParser.ProgContext ctx);
	/**
	 * Visit a parse tree produced by {@link IotlangParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatement(IotlangParser.StatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link IotlangParser#func_argv}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunc_argv(IotlangParser.Func_argvContext ctx);
	/**
	 * Visit a parse tree produced by {@link IotlangParser#func_def}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunc_def(IotlangParser.Func_defContext ctx);
	/**
	 * Visit a parse tree produced by {@link IotlangParser#func_call}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunc_call(IotlangParser.Func_callContext ctx);
	/**
	 * Visit a parse tree produced by {@link IotlangParser#block}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBlock(IotlangParser.BlockContext ctx);
	/**
	 * Visit a parse tree produced by {@link IotlangParser#func_return}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunc_return(IotlangParser.Func_returnContext ctx);
	/**
	 * Visit a parse tree produced by {@link IotlangParser#break_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBreak_statement(IotlangParser.Break_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link IotlangParser#continue_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitContinue_statement(IotlangParser.Continue_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link IotlangParser#loop_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLoop_statement(IotlangParser.Loop_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link IotlangParser#if_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIf_statement(IotlangParser.If_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link IotlangParser#assign}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssign(IotlangParser.AssignContext ctx);
	/**
	 * Visit a parse tree produced by {@link IotlangParser#expr_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpr_statement(IotlangParser.Expr_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link IotlangParser#condition_expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCondition_expr(IotlangParser.Condition_exprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Val}
	 * labeled alternative in {@link IotlangParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVal(IotlangParser.ValContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Arith}
	 * labeled alternative in {@link IotlangParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArith(IotlangParser.ArithContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Var}
	 * labeled alternative in {@link IotlangParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVar(IotlangParser.VarContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Paren}
	 * labeled alternative in {@link IotlangParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParen(IotlangParser.ParenContext ctx);
}