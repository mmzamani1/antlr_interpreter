// Generated from NotSimpleCalc.g4 by ANTLR 4.13.1
package com.compiler.project;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link NotSimpleCalcParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface NotSimpleCalcVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link NotSimpleCalcParser#program}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProgram(NotSimpleCalcParser.ProgramContext ctx);
	/**
	 * Visit a parse tree produced by {@link NotSimpleCalcParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatement(NotSimpleCalcParser.StatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link NotSimpleCalcParser#assign_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssign_stmt(NotSimpleCalcParser.Assign_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link NotSimpleCalcParser#block_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBlock_stmt(NotSimpleCalcParser.Block_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link NotSimpleCalcParser#if_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIf_stmt(NotSimpleCalcParser.If_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link NotSimpleCalcParser#while_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWhile_stmt(NotSimpleCalcParser.While_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link NotSimpleCalcParser#for_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFor_stmt(NotSimpleCalcParser.For_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link NotSimpleCalcParser#loop_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLoop_stmt(NotSimpleCalcParser.Loop_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link NotSimpleCalcParser#print_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrint_stmt(NotSimpleCalcParser.Print_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link NotSimpleCalcParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpr(NotSimpleCalcParser.ExprContext ctx);
	/**
	 * Visit a parse tree produced by {@link NotSimpleCalcParser#cmp_expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCmp_expr(NotSimpleCalcParser.Cmp_exprContext ctx);
	/**
	 * Visit a parse tree produced by {@link NotSimpleCalcParser#term}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTerm(NotSimpleCalcParser.TermContext ctx);
	/**
	 * Visit a parse tree produced by {@link NotSimpleCalcParser#power}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPower(NotSimpleCalcParser.PowerContext ctx);
	/**
	 * Visit a parse tree produced by {@link NotSimpleCalcParser#factor}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFactor(NotSimpleCalcParser.FactorContext ctx);
	/**
	 * Visit a parse tree produced by {@link NotSimpleCalcParser#begin}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBegin(NotSimpleCalcParser.BeginContext ctx);
	/**
	 * Visit a parse tree produced by {@link NotSimpleCalcParser#end}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEnd(NotSimpleCalcParser.EndContext ctx);
	/**
	 * Visit a parse tree produced by {@link NotSimpleCalcParser#if}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIf(NotSimpleCalcParser.IfContext ctx);
	/**
	 * Visit a parse tree produced by {@link NotSimpleCalcParser#then}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitThen(NotSimpleCalcParser.ThenContext ctx);
	/**
	 * Visit a parse tree produced by {@link NotSimpleCalcParser#else}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitElse(NotSimpleCalcParser.ElseContext ctx);
	/**
	 * Visit a parse tree produced by {@link NotSimpleCalcParser#while}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWhile(NotSimpleCalcParser.WhileContext ctx);
	/**
	 * Visit a parse tree produced by {@link NotSimpleCalcParser#for}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFor(NotSimpleCalcParser.ForContext ctx);
	/**
	 * Visit a parse tree produced by {@link NotSimpleCalcParser#loop}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLoop(NotSimpleCalcParser.LoopContext ctx);
	/**
	 * Visit a parse tree produced by {@link NotSimpleCalcParser#print}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrint(NotSimpleCalcParser.PrintContext ctx);
	/**
	 * Visit a parse tree produced by {@link NotSimpleCalcParser#of}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOf(NotSimpleCalcParser.OfContext ctx);
	/**
	 * Visit a parse tree produced by {@link NotSimpleCalcParser#to}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTo(NotSimpleCalcParser.ToContext ctx);
	/**
	 * Visit a parse tree produced by {@link NotSimpleCalcParser#do}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDo(NotSimpleCalcParser.DoContext ctx);
	/**
	 * Visit a parse tree produced by {@link NotSimpleCalcParser#openp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOpenp(NotSimpleCalcParser.OpenpContext ctx);
	/**
	 * Visit a parse tree produced by {@link NotSimpleCalcParser#closep}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClosep(NotSimpleCalcParser.ClosepContext ctx);
	/**
	 * Visit a parse tree produced by {@link NotSimpleCalcParser#sc}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSc(NotSimpleCalcParser.ScContext ctx);
	/**
	 * Visit a parse tree produced by {@link NotSimpleCalcParser#c}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitC(NotSimpleCalcParser.CContext ctx);
	/**
	 * Visit a parse tree produced by {@link NotSimpleCalcParser#com}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCom(NotSimpleCalcParser.ComContext ctx);
}