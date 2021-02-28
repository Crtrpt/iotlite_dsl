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
	 * Visit a parse tree produced by {@link IotlangParser#match}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMatch(IotlangParser.MatchContext ctx);
	/**
	 * Visit a parse tree produced by {@link IotlangParser#assign}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssign(IotlangParser.AssignContext ctx);
	/**
	 * Visit a parse tree produced by {@link IotlangParser#print}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrint(IotlangParser.PrintContext ctx);
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