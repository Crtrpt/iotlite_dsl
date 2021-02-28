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
	 * Enter a parse tree produced by {@link IotlangParser#match}.
	 * @param ctx the parse tree
	 */
	void enterMatch(IotlangParser.MatchContext ctx);
	/**
	 * Exit a parse tree produced by {@link IotlangParser#match}.
	 * @param ctx the parse tree
	 */
	void exitMatch(IotlangParser.MatchContext ctx);
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
	 * Enter a parse tree produced by {@link IotlangParser#print}.
	 * @param ctx the parse tree
	 */
	void enterPrint(IotlangParser.PrintContext ctx);
	/**
	 * Exit a parse tree produced by {@link IotlangParser#print}.
	 * @param ctx the parse tree
	 */
	void exitPrint(IotlangParser.PrintContext ctx);
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