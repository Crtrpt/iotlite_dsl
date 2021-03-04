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
	 * Visit a parse tree produced by {@link IotlangParser#select_argv}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSelect_argv(IotlangParser.Select_argvContext ctx);
	/**
	 * Visit a parse tree produced by {@link IotlangParser#from_argv}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFrom_argv(IotlangParser.From_argvContext ctx);
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
	 * Visit a parse tree produced by {@link IotlangParser#limit}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLimit(IotlangParser.LimitContext ctx);
	/**
	 * Visit a parse tree produced by {@link IotlangParser#assign}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssign(IotlangParser.AssignContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ADD}
	 * labeled alternative in {@link IotlangParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitADD(IotlangParser.ADDContext ctx);
	/**
	 * Visit a parse tree produced by the {@code GET_REF_OBJ_MEMBER}
	 * labeled alternative in {@link IotlangParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGET_REF_OBJ_MEMBER(IotlangParser.GET_REF_OBJ_MEMBERContext ctx);
	/**
	 * Visit a parse tree produced by the {@code GET_REF_STRING}
	 * labeled alternative in {@link IotlangParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGET_REF_STRING(IotlangParser.GET_REF_STRINGContext ctx);
	/**
	 * Visit a parse tree produced by the {@code GET_REF_NUMBER}
	 * labeled alternative in {@link IotlangParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGET_REF_NUMBER(IotlangParser.GET_REF_NUMBERContext ctx);
	/**
	 * Visit a parse tree produced by the {@code PAREN}
	 * labeled alternative in {@link IotlangParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPAREN(IotlangParser.PARENContext ctx);
	/**
	 * Visit a parse tree produced by the {@code GET_REF_BOOL}
	 * labeled alternative in {@link IotlangParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGET_REF_BOOL(IotlangParser.GET_REF_BOOLContext ctx);
	/**
	 * Visit a parse tree produced by the {@code GET_REF_ID}
	 * labeled alternative in {@link IotlangParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGET_REF_ID(IotlangParser.GET_REF_IDContext ctx);
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