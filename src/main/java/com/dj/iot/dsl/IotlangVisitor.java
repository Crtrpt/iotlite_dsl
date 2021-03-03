// Generated from D:/private/iotdsl/src/main/antlr4\Iotlang.g4 by ANTLR 4.9.1
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
	 * Visit a parse tree produced by {@link IotlangParser#select_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSelect_statement(IotlangParser.Select_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link IotlangParser#group_argv}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGroup_argv(IotlangParser.Group_argvContext ctx);
	/**
	 * Visit a parse tree produced by {@link IotlangParser#order_argv}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOrder_argv(IotlangParser.Order_argvContext ctx);
	/**
	 * Visit a parse tree produced by {@link IotlangParser#order}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOrder(IotlangParser.OrderContext ctx);
	/**
	 * Visit a parse tree produced by {@link IotlangParser#assign}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssign(IotlangParser.AssignContext ctx);
	/**
	 * Visit a parse tree produced by {@link IotlangParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpr(IotlangParser.ExprContext ctx);
	/**
	 * Visit a parse tree produced by {@link IotlangParser#obj_member}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitObj_member(IotlangParser.Obj_memberContext ctx);
	/**
	 * Visit a parse tree produced by {@link IotlangParser#obj_method}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitObj_method(IotlangParser.Obj_methodContext ctx);
	/**
	 * Visit a parse tree produced by {@link IotlangParser#method_argv}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMethod_argv(IotlangParser.Method_argvContext ctx);
}