// Generated from NotSimpleCalc.g4 by ANTLR 4.13.1
package com.compiler.project;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link NotSimpleCalcParser}.
 */
public interface NotSimpleCalcListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link NotSimpleCalcParser#program}.
	 * @param ctx the parse tree
	 */
	void enterProgram(NotSimpleCalcParser.ProgramContext ctx);
	/**
	 * Exit a parse tree produced by {@link NotSimpleCalcParser#program}.
	 * @param ctx the parse tree
	 */
	void exitProgram(NotSimpleCalcParser.ProgramContext ctx);
	/**
	 * Enter a parse tree produced by {@link NotSimpleCalcParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStatement(NotSimpleCalcParser.StatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link NotSimpleCalcParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStatement(NotSimpleCalcParser.StatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link NotSimpleCalcParser#assign_stmt}.
	 * @param ctx the parse tree
	 */
	void enterAssign_stmt(NotSimpleCalcParser.Assign_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link NotSimpleCalcParser#assign_stmt}.
	 * @param ctx the parse tree
	 */
	void exitAssign_stmt(NotSimpleCalcParser.Assign_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link NotSimpleCalcParser#block_stmt}.
	 * @param ctx the parse tree
	 */
	void enterBlock_stmt(NotSimpleCalcParser.Block_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link NotSimpleCalcParser#block_stmt}.
	 * @param ctx the parse tree
	 */
	void exitBlock_stmt(NotSimpleCalcParser.Block_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link NotSimpleCalcParser#if_stmt}.
	 * @param ctx the parse tree
	 */
	void enterIf_stmt(NotSimpleCalcParser.If_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link NotSimpleCalcParser#if_stmt}.
	 * @param ctx the parse tree
	 */
	void exitIf_stmt(NotSimpleCalcParser.If_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link NotSimpleCalcParser#while_stmt}.
	 * @param ctx the parse tree
	 */
	void enterWhile_stmt(NotSimpleCalcParser.While_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link NotSimpleCalcParser#while_stmt}.
	 * @param ctx the parse tree
	 */
	void exitWhile_stmt(NotSimpleCalcParser.While_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link NotSimpleCalcParser#for_stmt}.
	 * @param ctx the parse tree
	 */
	void enterFor_stmt(NotSimpleCalcParser.For_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link NotSimpleCalcParser#for_stmt}.
	 * @param ctx the parse tree
	 */
	void exitFor_stmt(NotSimpleCalcParser.For_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link NotSimpleCalcParser#loop_stmt}.
	 * @param ctx the parse tree
	 */
	void enterLoop_stmt(NotSimpleCalcParser.Loop_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link NotSimpleCalcParser#loop_stmt}.
	 * @param ctx the parse tree
	 */
	void exitLoop_stmt(NotSimpleCalcParser.Loop_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link NotSimpleCalcParser#print_stmt}.
	 * @param ctx the parse tree
	 */
	void enterPrint_stmt(NotSimpleCalcParser.Print_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link NotSimpleCalcParser#print_stmt}.
	 * @param ctx the parse tree
	 */
	void exitPrint_stmt(NotSimpleCalcParser.Print_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link NotSimpleCalcParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExpr(NotSimpleCalcParser.ExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link NotSimpleCalcParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExpr(NotSimpleCalcParser.ExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link NotSimpleCalcParser#cmp_expr}.
	 * @param ctx the parse tree
	 */
	void enterCmp_expr(NotSimpleCalcParser.Cmp_exprContext ctx);
	/**
	 * Exit a parse tree produced by {@link NotSimpleCalcParser#cmp_expr}.
	 * @param ctx the parse tree
	 */
	void exitCmp_expr(NotSimpleCalcParser.Cmp_exprContext ctx);
	/**
	 * Enter a parse tree produced by {@link NotSimpleCalcParser#term}.
	 * @param ctx the parse tree
	 */
	void enterTerm(NotSimpleCalcParser.TermContext ctx);
	/**
	 * Exit a parse tree produced by {@link NotSimpleCalcParser#term}.
	 * @param ctx the parse tree
	 */
	void exitTerm(NotSimpleCalcParser.TermContext ctx);
	/**
	 * Enter a parse tree produced by {@link NotSimpleCalcParser#power}.
	 * @param ctx the parse tree
	 */
	void enterPower(NotSimpleCalcParser.PowerContext ctx);
	/**
	 * Exit a parse tree produced by {@link NotSimpleCalcParser#power}.
	 * @param ctx the parse tree
	 */
	void exitPower(NotSimpleCalcParser.PowerContext ctx);
	/**
	 * Enter a parse tree produced by {@link NotSimpleCalcParser#factor}.
	 * @param ctx the parse tree
	 */
	void enterFactor(NotSimpleCalcParser.FactorContext ctx);
	/**
	 * Exit a parse tree produced by {@link NotSimpleCalcParser#factor}.
	 * @param ctx the parse tree
	 */
	void exitFactor(NotSimpleCalcParser.FactorContext ctx);
	/**
	 * Enter a parse tree produced by {@link NotSimpleCalcParser#begin}.
	 * @param ctx the parse tree
	 */
	void enterBegin(NotSimpleCalcParser.BeginContext ctx);
	/**
	 * Exit a parse tree produced by {@link NotSimpleCalcParser#begin}.
	 * @param ctx the parse tree
	 */
	void exitBegin(NotSimpleCalcParser.BeginContext ctx);
	/**
	 * Enter a parse tree produced by {@link NotSimpleCalcParser#end}.
	 * @param ctx the parse tree
	 */
	void enterEnd(NotSimpleCalcParser.EndContext ctx);
	/**
	 * Exit a parse tree produced by {@link NotSimpleCalcParser#end}.
	 * @param ctx the parse tree
	 */
	void exitEnd(NotSimpleCalcParser.EndContext ctx);
	/**
	 * Enter a parse tree produced by {@link NotSimpleCalcParser#if}.
	 * @param ctx the parse tree
	 */
	void enterIf(NotSimpleCalcParser.IfContext ctx);
	/**
	 * Exit a parse tree produced by {@link NotSimpleCalcParser#if}.
	 * @param ctx the parse tree
	 */
	void exitIf(NotSimpleCalcParser.IfContext ctx);
	/**
	 * Enter a parse tree produced by {@link NotSimpleCalcParser#then}.
	 * @param ctx the parse tree
	 */
	void enterThen(NotSimpleCalcParser.ThenContext ctx);
	/**
	 * Exit a parse tree produced by {@link NotSimpleCalcParser#then}.
	 * @param ctx the parse tree
	 */
	void exitThen(NotSimpleCalcParser.ThenContext ctx);
	/**
	 * Enter a parse tree produced by {@link NotSimpleCalcParser#else}.
	 * @param ctx the parse tree
	 */
	void enterElse(NotSimpleCalcParser.ElseContext ctx);
	/**
	 * Exit a parse tree produced by {@link NotSimpleCalcParser#else}.
	 * @param ctx the parse tree
	 */
	void exitElse(NotSimpleCalcParser.ElseContext ctx);
	/**
	 * Enter a parse tree produced by {@link NotSimpleCalcParser#while}.
	 * @param ctx the parse tree
	 */
	void enterWhile(NotSimpleCalcParser.WhileContext ctx);
	/**
	 * Exit a parse tree produced by {@link NotSimpleCalcParser#while}.
	 * @param ctx the parse tree
	 */
	void exitWhile(NotSimpleCalcParser.WhileContext ctx);
	/**
	 * Enter a parse tree produced by {@link NotSimpleCalcParser#for}.
	 * @param ctx the parse tree
	 */
	void enterFor(NotSimpleCalcParser.ForContext ctx);
	/**
	 * Exit a parse tree produced by {@link NotSimpleCalcParser#for}.
	 * @param ctx the parse tree
	 */
	void exitFor(NotSimpleCalcParser.ForContext ctx);
	/**
	 * Enter a parse tree produced by {@link NotSimpleCalcParser#loop}.
	 * @param ctx the parse tree
	 */
	void enterLoop(NotSimpleCalcParser.LoopContext ctx);
	/**
	 * Exit a parse tree produced by {@link NotSimpleCalcParser#loop}.
	 * @param ctx the parse tree
	 */
	void exitLoop(NotSimpleCalcParser.LoopContext ctx);
	/**
	 * Enter a parse tree produced by {@link NotSimpleCalcParser#print}.
	 * @param ctx the parse tree
	 */
	void enterPrint(NotSimpleCalcParser.PrintContext ctx);
	/**
	 * Exit a parse tree produced by {@link NotSimpleCalcParser#print}.
	 * @param ctx the parse tree
	 */
	void exitPrint(NotSimpleCalcParser.PrintContext ctx);
	/**
	 * Enter a parse tree produced by {@link NotSimpleCalcParser#of}.
	 * @param ctx the parse tree
	 */
	void enterOf(NotSimpleCalcParser.OfContext ctx);
	/**
	 * Exit a parse tree produced by {@link NotSimpleCalcParser#of}.
	 * @param ctx the parse tree
	 */
	void exitOf(NotSimpleCalcParser.OfContext ctx);
	/**
	 * Enter a parse tree produced by {@link NotSimpleCalcParser#to}.
	 * @param ctx the parse tree
	 */
	void enterTo(NotSimpleCalcParser.ToContext ctx);
	/**
	 * Exit a parse tree produced by {@link NotSimpleCalcParser#to}.
	 * @param ctx the parse tree
	 */
	void exitTo(NotSimpleCalcParser.ToContext ctx);
	/**
	 * Enter a parse tree produced by {@link NotSimpleCalcParser#do}.
	 * @param ctx the parse tree
	 */
	void enterDo(NotSimpleCalcParser.DoContext ctx);
	/**
	 * Exit a parse tree produced by {@link NotSimpleCalcParser#do}.
	 * @param ctx the parse tree
	 */
	void exitDo(NotSimpleCalcParser.DoContext ctx);
	/**
	 * Enter a parse tree produced by {@link NotSimpleCalcParser#openp}.
	 * @param ctx the parse tree
	 */
	void enterOpenp(NotSimpleCalcParser.OpenpContext ctx);
	/**
	 * Exit a parse tree produced by {@link NotSimpleCalcParser#openp}.
	 * @param ctx the parse tree
	 */
	void exitOpenp(NotSimpleCalcParser.OpenpContext ctx);
	/**
	 * Enter a parse tree produced by {@link NotSimpleCalcParser#closep}.
	 * @param ctx the parse tree
	 */
	void enterClosep(NotSimpleCalcParser.ClosepContext ctx);
	/**
	 * Exit a parse tree produced by {@link NotSimpleCalcParser#closep}.
	 * @param ctx the parse tree
	 */
	void exitClosep(NotSimpleCalcParser.ClosepContext ctx);
	/**
	 * Enter a parse tree produced by {@link NotSimpleCalcParser#sc}.
	 * @param ctx the parse tree
	 */
	void enterSc(NotSimpleCalcParser.ScContext ctx);
	/**
	 * Exit a parse tree produced by {@link NotSimpleCalcParser#sc}.
	 * @param ctx the parse tree
	 */
	void exitSc(NotSimpleCalcParser.ScContext ctx);
	/**
	 * Enter a parse tree produced by {@link NotSimpleCalcParser#c}.
	 * @param ctx the parse tree
	 */
	void enterC(NotSimpleCalcParser.CContext ctx);
	/**
	 * Exit a parse tree produced by {@link NotSimpleCalcParser#c}.
	 * @param ctx the parse tree
	 */
	void exitC(NotSimpleCalcParser.CContext ctx);
	/**
	 * Enter a parse tree produced by {@link NotSimpleCalcParser#com}.
	 * @param ctx the parse tree
	 */
	void enterCom(NotSimpleCalcParser.ComContext ctx);
	/**
	 * Exit a parse tree produced by {@link NotSimpleCalcParser#com}.
	 * @param ctx the parse tree
	 */
	void exitCom(NotSimpleCalcParser.ComContext ctx);
}