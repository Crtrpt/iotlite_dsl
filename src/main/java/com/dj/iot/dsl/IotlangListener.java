// Generated from D:/private/iotdsl/src/main/antlr4\Iotlang.g4 by ANTLR 4.9.1
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
	 * Enter a parse tree produced by {@link IotlangParser#select_statement}.
	 * @param ctx the parse tree
	 */
	void enterSelect_statement(IotlangParser.Select_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link IotlangParser#select_statement}.
	 * @param ctx the parse tree
	 */
	void exitSelect_statement(IotlangParser.Select_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link IotlangParser#select_argv}.
	 * @param ctx the parse tree
	 */
	void enterSelect_argv(IotlangParser.Select_argvContext ctx);
	/**
	 * Exit a parse tree produced by {@link IotlangParser#select_argv}.
	 * @param ctx the parse tree
	 */
	void exitSelect_argv(IotlangParser.Select_argvContext ctx);
	/**
	 * Enter a parse tree produced by {@link IotlangParser#from_argv}.
	 * @param ctx the parse tree
	 */
	void enterFrom_argv(IotlangParser.From_argvContext ctx);
	/**
	 * Exit a parse tree produced by {@link IotlangParser#from_argv}.
	 * @param ctx the parse tree
	 */
	void exitFrom_argv(IotlangParser.From_argvContext ctx);
	/**
	 * Enter a parse tree produced by {@link IotlangParser#group_argv}.
	 * @param ctx the parse tree
	 */
	void enterGroup_argv(IotlangParser.Group_argvContext ctx);
	/**
	 * Exit a parse tree produced by {@link IotlangParser#group_argv}.
	 * @param ctx the parse tree
	 */
	void exitGroup_argv(IotlangParser.Group_argvContext ctx);
	/**
	 * Enter a parse tree produced by {@link IotlangParser#order_argv}.
	 * @param ctx the parse tree
	 */
	void enterOrder_argv(IotlangParser.Order_argvContext ctx);
	/**
	 * Exit a parse tree produced by {@link IotlangParser#order_argv}.
	 * @param ctx the parse tree
	 */
	void exitOrder_argv(IotlangParser.Order_argvContext ctx);
	/**
	 * Enter a parse tree produced by {@link IotlangParser#order}.
	 * @param ctx the parse tree
	 */
	void enterOrder(IotlangParser.OrderContext ctx);
	/**
	 * Exit a parse tree produced by {@link IotlangParser#order}.
	 * @param ctx the parse tree
	 */
	void exitOrder(IotlangParser.OrderContext ctx);
	/**
	 * Enter a parse tree produced by {@link IotlangParser#limit}.
	 * @param ctx the parse tree
	 */
	void enterLimit(IotlangParser.LimitContext ctx);
	/**
	 * Exit a parse tree produced by {@link IotlangParser#limit}.
	 * @param ctx the parse tree
	 */
	void exitLimit(IotlangParser.LimitContext ctx);
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
	 * Enter a parse tree produced by the {@code ADD}
	 * labeled alternative in {@link IotlangParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterADD(IotlangParser.ADDContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ADD}
	 * labeled alternative in {@link IotlangParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitADD(IotlangParser.ADDContext ctx);
	/**
	 * Enter a parse tree produced by the {@code GET_REF_OBJ_MEMBER}
	 * labeled alternative in {@link IotlangParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterGET_REF_OBJ_MEMBER(IotlangParser.GET_REF_OBJ_MEMBERContext ctx);
	/**
	 * Exit a parse tree produced by the {@code GET_REF_OBJ_MEMBER}
	 * labeled alternative in {@link IotlangParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitGET_REF_OBJ_MEMBER(IotlangParser.GET_REF_OBJ_MEMBERContext ctx);
	/**
	 * Enter a parse tree produced by the {@code GET_REF_STRING}
	 * labeled alternative in {@link IotlangParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterGET_REF_STRING(IotlangParser.GET_REF_STRINGContext ctx);
	/**
	 * Exit a parse tree produced by the {@code GET_REF_STRING}
	 * labeled alternative in {@link IotlangParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitGET_REF_STRING(IotlangParser.GET_REF_STRINGContext ctx);
	/**
	 * Enter a parse tree produced by the {@code GET_REF_NUMBER}
	 * labeled alternative in {@link IotlangParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterGET_REF_NUMBER(IotlangParser.GET_REF_NUMBERContext ctx);
	/**
	 * Exit a parse tree produced by the {@code GET_REF_NUMBER}
	 * labeled alternative in {@link IotlangParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitGET_REF_NUMBER(IotlangParser.GET_REF_NUMBERContext ctx);
	/**
	 * Enter a parse tree produced by the {@code PAREN}
	 * labeled alternative in {@link IotlangParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterPAREN(IotlangParser.PARENContext ctx);
	/**
	 * Exit a parse tree produced by the {@code PAREN}
	 * labeled alternative in {@link IotlangParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitPAREN(IotlangParser.PARENContext ctx);
	/**
	 * Enter a parse tree produced by the {@code GET_REF_BOOL}
	 * labeled alternative in {@link IotlangParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterGET_REF_BOOL(IotlangParser.GET_REF_BOOLContext ctx);
	/**
	 * Exit a parse tree produced by the {@code GET_REF_BOOL}
	 * labeled alternative in {@link IotlangParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitGET_REF_BOOL(IotlangParser.GET_REF_BOOLContext ctx);
	/**
	 * Enter a parse tree produced by the {@code GET_REF_ID}
	 * labeled alternative in {@link IotlangParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterGET_REF_ID(IotlangParser.GET_REF_IDContext ctx);
	/**
	 * Exit a parse tree produced by the {@code GET_REF_ID}
	 * labeled alternative in {@link IotlangParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitGET_REF_ID(IotlangParser.GET_REF_IDContext ctx);
	/**
	 * Enter a parse tree produced by {@link IotlangParser#obj_member}.
	 * @param ctx the parse tree
	 */
	void enterObj_member(IotlangParser.Obj_memberContext ctx);
	/**
	 * Exit a parse tree produced by {@link IotlangParser#obj_member}.
	 * @param ctx the parse tree
	 */
	void exitObj_member(IotlangParser.Obj_memberContext ctx);
	/**
	 * Enter a parse tree produced by {@link IotlangParser#obj_method}.
	 * @param ctx the parse tree
	 */
	void enterObj_method(IotlangParser.Obj_methodContext ctx);
	/**
	 * Exit a parse tree produced by {@link IotlangParser#obj_method}.
	 * @param ctx the parse tree
	 */
	void exitObj_method(IotlangParser.Obj_methodContext ctx);
	/**
	 * Enter a parse tree produced by {@link IotlangParser#method_argv}.
	 * @param ctx the parse tree
	 */
	void enterMethod_argv(IotlangParser.Method_argvContext ctx);
	/**
	 * Exit a parse tree produced by {@link IotlangParser#method_argv}.
	 * @param ctx the parse tree
	 */
	void exitMethod_argv(IotlangParser.Method_argvContext ctx);
}