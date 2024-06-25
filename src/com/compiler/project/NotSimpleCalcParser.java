// Generated from NotSimpleCalc.g4 by ANTLR 4.13.1
package com.compiler.project;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue"})
public class NotSimpleCalcParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.13.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, T__16=17, 
		MULT=18, DIV=19, PLUS=20, MINUS=21, PWR=22, REM=23, EQ=24, LT=25, GT=26, 
		LE=27, GE=28, DE=29, NE=30, NO=31, Identifier=32, Number=33, StringLiteral=34, 
		WS=35, NEWLINE=36;
	public static final int
		RULE_program = 0, RULE_statement = 1, RULE_assign_stmt = 2, RULE_block_stmt = 3, 
		RULE_if_stmt = 4, RULE_while_stmt = 5, RULE_for_stmt = 6, RULE_loop_stmt = 7, 
		RULE_print_stmt = 8, RULE_expr = 9, RULE_cmp_expr = 10, RULE_term = 11, 
		RULE_power = 12, RULE_factor = 13, RULE_begin = 14, RULE_end = 15, RULE_if = 16, 
		RULE_then = 17, RULE_else = 18, RULE_while = 19, RULE_for = 20, RULE_loop = 21, 
		RULE_print = 22, RULE_of = 23, RULE_to = 24, RULE_do = 25, RULE_openp = 26, 
		RULE_closep = 27, RULE_sc = 28, RULE_c = 29, RULE_com = 30;
	private static String[] makeRuleNames() {
		return new String[] {
			"program", "statement", "assign_stmt", "block_stmt", "if_stmt", "while_stmt", 
			"for_stmt", "loop_stmt", "print_stmt", "expr", "cmp_expr", "term", "power", 
			"factor", "begin", "end", "if", "then", "else", "while", "for", "loop", 
			"print", "of", "to", "do", "openp", "closep", "sc", "c", "com"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'begin'", "'end'", "'if'", "'then'", "'else'", "'while'", "'for'", 
			"'loop'", "'print'", "'of'", "'to'", "'do'", "'('", "')'", "';'", "':'", 
			"','", "'*'", "'/'", "'+'", "'-'", "'^'", "'%'", "'='", "'<'", "'>'", 
			"'<='", "'>='", "'=='", "'!='", "'!'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, "MULT", "DIV", "PLUS", "MINUS", "PWR", 
			"REM", "EQ", "LT", "GT", "LE", "GE", "DE", "NE", "NO", "Identifier", 
			"Number", "StringLiteral", "WS", "NEWLINE"
		};
	}
	private static final String[] _SYMBOLIC_NAMES = makeSymbolicNames();
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}

	@Override
	public String getGrammarFileName() { return "NotSimpleCalc.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public NotSimpleCalcParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ProgramContext extends ParserRuleContext {
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public ProgramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_program; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NotSimpleCalcListener ) ((NotSimpleCalcListener)listener).enterProgram(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NotSimpleCalcListener ) ((NotSimpleCalcListener)listener).exitProgram(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NotSimpleCalcVisitor ) return ((NotSimpleCalcVisitor<? extends T>)visitor).visitProgram(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProgramContext program() throws RecognitionException {
		ProgramContext _localctx = new ProgramContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_program);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(63); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(62);
				statement();
				}
				}
				setState(65); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & 4294968266L) != 0) );
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class StatementContext extends ParserRuleContext {
		public Assign_stmtContext assign_stmt() {
			return getRuleContext(Assign_stmtContext.class,0);
		}
		public Block_stmtContext block_stmt() {
			return getRuleContext(Block_stmtContext.class,0);
		}
		public If_stmtContext if_stmt() {
			return getRuleContext(If_stmtContext.class,0);
		}
		public While_stmtContext while_stmt() {
			return getRuleContext(While_stmtContext.class,0);
		}
		public For_stmtContext for_stmt() {
			return getRuleContext(For_stmtContext.class,0);
		}
		public Loop_stmtContext loop_stmt() {
			return getRuleContext(Loop_stmtContext.class,0);
		}
		public Print_stmtContext print_stmt() {
			return getRuleContext(Print_stmtContext.class,0);
		}
		public StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NotSimpleCalcListener ) ((NotSimpleCalcListener)listener).enterStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NotSimpleCalcListener ) ((NotSimpleCalcListener)listener).exitStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NotSimpleCalcVisitor ) return ((NotSimpleCalcVisitor<? extends T>)visitor).visitStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_statement);
		try {
			setState(74);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Identifier:
				enterOuterAlt(_localctx, 1);
				{
				setState(67);
				assign_stmt();
				}
				break;
			case T__0:
				enterOuterAlt(_localctx, 2);
				{
				setState(68);
				block_stmt();
				}
				break;
			case T__2:
				enterOuterAlt(_localctx, 3);
				{
				setState(69);
				if_stmt();
				}
				break;
			case T__5:
				enterOuterAlt(_localctx, 4);
				{
				setState(70);
				while_stmt();
				}
				break;
			case T__6:
				enterOuterAlt(_localctx, 5);
				{
				setState(71);
				for_stmt();
				}
				break;
			case T__7:
				enterOuterAlt(_localctx, 6);
				{
				setState(72);
				loop_stmt();
				}
				break;
			case T__8:
				enterOuterAlt(_localctx, 7);
				{
				setState(73);
				print_stmt();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Assign_stmtContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(NotSimpleCalcParser.Identifier, 0); }
		public TerminalNode EQ() { return getToken(NotSimpleCalcParser.EQ, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public ScContext sc() {
			return getRuleContext(ScContext.class,0);
		}
		public Assign_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assign_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NotSimpleCalcListener ) ((NotSimpleCalcListener)listener).enterAssign_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NotSimpleCalcListener ) ((NotSimpleCalcListener)listener).exitAssign_stmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NotSimpleCalcVisitor ) return ((NotSimpleCalcVisitor<? extends T>)visitor).visitAssign_stmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Assign_stmtContext assign_stmt() throws RecognitionException {
		Assign_stmtContext _localctx = new Assign_stmtContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_assign_stmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(76);
			match(Identifier);
			setState(77);
			match(EQ);
			setState(78);
			expr();
			setState(79);
			sc();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Block_stmtContext extends ParserRuleContext {
		public BeginContext begin() {
			return getRuleContext(BeginContext.class,0);
		}
		public ProgramContext program() {
			return getRuleContext(ProgramContext.class,0);
		}
		public EndContext end() {
			return getRuleContext(EndContext.class,0);
		}
		public Block_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_block_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NotSimpleCalcListener ) ((NotSimpleCalcListener)listener).enterBlock_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NotSimpleCalcListener ) ((NotSimpleCalcListener)listener).exitBlock_stmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NotSimpleCalcVisitor ) return ((NotSimpleCalcVisitor<? extends T>)visitor).visitBlock_stmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Block_stmtContext block_stmt() throws RecognitionException {
		Block_stmtContext _localctx = new Block_stmtContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_block_stmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(81);
			begin();
			setState(82);
			program();
			setState(83);
			end();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class If_stmtContext extends ParserRuleContext {
		public IfContext if_() {
			return getRuleContext(IfContext.class,0);
		}
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public ThenContext then() {
			return getRuleContext(ThenContext.class,0);
		}
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public ElseContext else_() {
			return getRuleContext(ElseContext.class,0);
		}
		public If_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_if_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NotSimpleCalcListener ) ((NotSimpleCalcListener)listener).enterIf_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NotSimpleCalcListener ) ((NotSimpleCalcListener)listener).exitIf_stmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NotSimpleCalcVisitor ) return ((NotSimpleCalcVisitor<? extends T>)visitor).visitIf_stmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final If_stmtContext if_stmt() throws RecognitionException {
		If_stmtContext _localctx = new If_stmtContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_if_stmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(85);
			if_();
			setState(86);
			expr();
			setState(87);
			then();
			setState(88);
			statement();
			setState(92);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				{
				setState(89);
				else_();
				setState(90);
				statement();
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class While_stmtContext extends ParserRuleContext {
		public WhileContext while_() {
			return getRuleContext(WhileContext.class,0);
		}
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public DoContext do_() {
			return getRuleContext(DoContext.class,0);
		}
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public While_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_while_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NotSimpleCalcListener ) ((NotSimpleCalcListener)listener).enterWhile_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NotSimpleCalcListener ) ((NotSimpleCalcListener)listener).exitWhile_stmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NotSimpleCalcVisitor ) return ((NotSimpleCalcVisitor<? extends T>)visitor).visitWhile_stmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final While_stmtContext while_stmt() throws RecognitionException {
		While_stmtContext _localctx = new While_stmtContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_while_stmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(94);
			while_();
			setState(95);
			expr();
			setState(96);
			do_();
			setState(97);
			statement();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class For_stmtContext extends ParserRuleContext {
		public ForContext for_() {
			return getRuleContext(ForContext.class,0);
		}
		public TerminalNode Identifier() { return getToken(NotSimpleCalcParser.Identifier, 0); }
		public OfContext of() {
			return getRuleContext(OfContext.class,0);
		}
		public List<TerminalNode> Number() { return getTokens(NotSimpleCalcParser.Number); }
		public TerminalNode Number(int i) {
			return getToken(NotSimpleCalcParser.Number, i);
		}
		public ToContext to() {
			return getRuleContext(ToContext.class,0);
		}
		public DoContext do_() {
			return getRuleContext(DoContext.class,0);
		}
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public For_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_for_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NotSimpleCalcListener ) ((NotSimpleCalcListener)listener).enterFor_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NotSimpleCalcListener ) ((NotSimpleCalcListener)listener).exitFor_stmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NotSimpleCalcVisitor ) return ((NotSimpleCalcVisitor<? extends T>)visitor).visitFor_stmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final For_stmtContext for_stmt() throws RecognitionException {
		For_stmtContext _localctx = new For_stmtContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_for_stmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(99);
			for_();
			setState(100);
			match(Identifier);
			setState(101);
			of();
			setState(102);
			match(Number);
			setState(103);
			to();
			setState(104);
			match(Number);
			setState(105);
			do_();
			setState(106);
			statement();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Loop_stmtContext extends ParserRuleContext {
		public LoopContext loop() {
			return getRuleContext(LoopContext.class,0);
		}
		public TerminalNode Identifier() { return getToken(NotSimpleCalcParser.Identifier, 0); }
		public CContext c() {
			return getRuleContext(CContext.class,0);
		}
		public TerminalNode Number() { return getToken(NotSimpleCalcParser.Number, 0); }
		public DoContext do_() {
			return getRuleContext(DoContext.class,0);
		}
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public Loop_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_loop_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NotSimpleCalcListener ) ((NotSimpleCalcListener)listener).enterLoop_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NotSimpleCalcListener ) ((NotSimpleCalcListener)listener).exitLoop_stmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NotSimpleCalcVisitor ) return ((NotSimpleCalcVisitor<? extends T>)visitor).visitLoop_stmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Loop_stmtContext loop_stmt() throws RecognitionException {
		Loop_stmtContext _localctx = new Loop_stmtContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_loop_stmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(108);
			loop();
			setState(109);
			match(Identifier);
			setState(110);
			c();
			setState(111);
			match(Number);
			setState(112);
			do_();
			setState(113);
			statement();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Print_stmtContext extends ParserRuleContext {
		public PrintContext print() {
			return getRuleContext(PrintContext.class,0);
		}
		public TerminalNode Identifier() { return getToken(NotSimpleCalcParser.Identifier, 0); }
		public ScContext sc() {
			return getRuleContext(ScContext.class,0);
		}
		public TerminalNode StringLiteral() { return getToken(NotSimpleCalcParser.StringLiteral, 0); }
		public ComContext com() {
			return getRuleContext(ComContext.class,0);
		}
		public Print_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_print_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NotSimpleCalcListener ) ((NotSimpleCalcListener)listener).enterPrint_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NotSimpleCalcListener ) ((NotSimpleCalcListener)listener).exitPrint_stmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NotSimpleCalcVisitor ) return ((NotSimpleCalcVisitor<? extends T>)visitor).visitPrint_stmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Print_stmtContext print_stmt() throws RecognitionException {
		Print_stmtContext _localctx = new Print_stmtContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_print_stmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(115);
			print();
			setState(118);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==StringLiteral) {
				{
				setState(116);
				match(StringLiteral);
				setState(117);
				com();
				}
			}

			setState(120);
			match(Identifier);
			setState(121);
			sc();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ExprContext extends ParserRuleContext {
		public List<Cmp_exprContext> cmp_expr() {
			return getRuleContexts(Cmp_exprContext.class);
		}
		public Cmp_exprContext cmp_expr(int i) {
			return getRuleContext(Cmp_exprContext.class,i);
		}
		public TerminalNode DE() { return getToken(NotSimpleCalcParser.DE, 0); }
		public TerminalNode NE() { return getToken(NotSimpleCalcParser.NE, 0); }
		public TerminalNode LT() { return getToken(NotSimpleCalcParser.LT, 0); }
		public TerminalNode GT() { return getToken(NotSimpleCalcParser.GT, 0); }
		public TerminalNode LE() { return getToken(NotSimpleCalcParser.LE, 0); }
		public TerminalNode GE() { return getToken(NotSimpleCalcParser.GE, 0); }
		public ExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NotSimpleCalcListener ) ((NotSimpleCalcListener)listener).enterExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NotSimpleCalcListener ) ((NotSimpleCalcListener)listener).exitExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NotSimpleCalcVisitor ) return ((NotSimpleCalcVisitor<? extends T>)visitor).visitExpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExprContext expr() throws RecognitionException {
		ExprContext _localctx = new ExprContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_expr);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(123);
			cmp_expr();
			setState(126);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 2113929216L) != 0)) {
				{
				setState(124);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 2113929216L) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(125);
				cmp_expr();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Cmp_exprContext extends ParserRuleContext {
		public List<TermContext> term() {
			return getRuleContexts(TermContext.class);
		}
		public TermContext term(int i) {
			return getRuleContext(TermContext.class,i);
		}
		public List<TerminalNode> PLUS() { return getTokens(NotSimpleCalcParser.PLUS); }
		public TerminalNode PLUS(int i) {
			return getToken(NotSimpleCalcParser.PLUS, i);
		}
		public List<TerminalNode> MINUS() { return getTokens(NotSimpleCalcParser.MINUS); }
		public TerminalNode MINUS(int i) {
			return getToken(NotSimpleCalcParser.MINUS, i);
		}
		public Cmp_exprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cmp_expr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NotSimpleCalcListener ) ((NotSimpleCalcListener)listener).enterCmp_expr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NotSimpleCalcListener ) ((NotSimpleCalcListener)listener).exitCmp_expr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NotSimpleCalcVisitor ) return ((NotSimpleCalcVisitor<? extends T>)visitor).visitCmp_expr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Cmp_exprContext cmp_expr() throws RecognitionException {
		Cmp_exprContext _localctx = new Cmp_exprContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_cmp_expr);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(128);
			term();
			setState(133);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==PLUS || _la==MINUS) {
				{
				{
				setState(129);
				_la = _input.LA(1);
				if ( !(_la==PLUS || _la==MINUS) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(130);
				term();
				}
				}
				setState(135);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class TermContext extends ParserRuleContext {
		public List<PowerContext> power() {
			return getRuleContexts(PowerContext.class);
		}
		public PowerContext power(int i) {
			return getRuleContext(PowerContext.class,i);
		}
		public List<TerminalNode> MULT() { return getTokens(NotSimpleCalcParser.MULT); }
		public TerminalNode MULT(int i) {
			return getToken(NotSimpleCalcParser.MULT, i);
		}
		public List<TerminalNode> DIV() { return getTokens(NotSimpleCalcParser.DIV); }
		public TerminalNode DIV(int i) {
			return getToken(NotSimpleCalcParser.DIV, i);
		}
		public List<TerminalNode> REM() { return getTokens(NotSimpleCalcParser.REM); }
		public TerminalNode REM(int i) {
			return getToken(NotSimpleCalcParser.REM, i);
		}
		public TermContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_term; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NotSimpleCalcListener ) ((NotSimpleCalcListener)listener).enterTerm(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NotSimpleCalcListener ) ((NotSimpleCalcListener)listener).exitTerm(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NotSimpleCalcVisitor ) return ((NotSimpleCalcVisitor<? extends T>)visitor).visitTerm(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TermContext term() throws RecognitionException {
		TermContext _localctx = new TermContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_term);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(136);
			power();
			setState(141);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 9175040L) != 0)) {
				{
				{
				setState(137);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 9175040L) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(138);
				power();
				}
				}
				setState(143);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class PowerContext extends ParserRuleContext {
		public FactorContext factor() {
			return getRuleContext(FactorContext.class,0);
		}
		public List<TerminalNode> PWR() { return getTokens(NotSimpleCalcParser.PWR); }
		public TerminalNode PWR(int i) {
			return getToken(NotSimpleCalcParser.PWR, i);
		}
		public List<PowerContext> power() {
			return getRuleContexts(PowerContext.class);
		}
		public PowerContext power(int i) {
			return getRuleContext(PowerContext.class,i);
		}
		public PowerContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_power; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NotSimpleCalcListener ) ((NotSimpleCalcListener)listener).enterPower(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NotSimpleCalcListener ) ((NotSimpleCalcListener)listener).exitPower(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NotSimpleCalcVisitor ) return ((NotSimpleCalcVisitor<? extends T>)visitor).visitPower(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PowerContext power() throws RecognitionException {
		PowerContext _localctx = new PowerContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_power);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(144);
			factor();
			setState(149);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,7,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(145);
					match(PWR);
					setState(146);
					power();
					}
					} 
				}
				setState(151);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,7,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class FactorContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(NotSimpleCalcParser.Identifier, 0); }
		public TerminalNode Number() { return getToken(NotSimpleCalcParser.Number, 0); }
		public OpenpContext openp() {
			return getRuleContext(OpenpContext.class,0);
		}
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public ClosepContext closep() {
			return getRuleContext(ClosepContext.class,0);
		}
		public TerminalNode PLUS() { return getToken(NotSimpleCalcParser.PLUS, 0); }
		public TerminalNode MINUS() { return getToken(NotSimpleCalcParser.MINUS, 0); }
		public FactorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_factor; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NotSimpleCalcListener ) ((NotSimpleCalcListener)listener).enterFactor(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NotSimpleCalcListener ) ((NotSimpleCalcListener)listener).exitFactor(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NotSimpleCalcVisitor ) return ((NotSimpleCalcVisitor<? extends T>)visitor).visitFactor(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FactorContext factor() throws RecognitionException {
		FactorContext _localctx = new FactorContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_factor);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(153);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==PLUS || _la==MINUS) {
				{
				setState(152);
				_la = _input.LA(1);
				if ( !(_la==PLUS || _la==MINUS) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
			}

			setState(161);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Identifier:
				{
				setState(155);
				match(Identifier);
				}
				break;
			case Number:
				{
				setState(156);
				match(Number);
				}
				break;
			case T__12:
				{
				setState(157);
				openp();
				setState(158);
				expr();
				setState(159);
				closep();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class BeginContext extends ParserRuleContext {
		public BeginContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_begin; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NotSimpleCalcListener ) ((NotSimpleCalcListener)listener).enterBegin(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NotSimpleCalcListener ) ((NotSimpleCalcListener)listener).exitBegin(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NotSimpleCalcVisitor ) return ((NotSimpleCalcVisitor<? extends T>)visitor).visitBegin(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BeginContext begin() throws RecognitionException {
		BeginContext _localctx = new BeginContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_begin);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(163);
			match(T__0);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class EndContext extends ParserRuleContext {
		public EndContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_end; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NotSimpleCalcListener ) ((NotSimpleCalcListener)listener).enterEnd(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NotSimpleCalcListener ) ((NotSimpleCalcListener)listener).exitEnd(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NotSimpleCalcVisitor ) return ((NotSimpleCalcVisitor<? extends T>)visitor).visitEnd(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EndContext end() throws RecognitionException {
		EndContext _localctx = new EndContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_end);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(165);
			match(T__1);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class IfContext extends ParserRuleContext {
		public IfContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_if; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NotSimpleCalcListener ) ((NotSimpleCalcListener)listener).enterIf(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NotSimpleCalcListener ) ((NotSimpleCalcListener)listener).exitIf(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NotSimpleCalcVisitor ) return ((NotSimpleCalcVisitor<? extends T>)visitor).visitIf(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IfContext if_() throws RecognitionException {
		IfContext _localctx = new IfContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_if);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(167);
			match(T__2);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ThenContext extends ParserRuleContext {
		public ThenContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_then; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NotSimpleCalcListener ) ((NotSimpleCalcListener)listener).enterThen(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NotSimpleCalcListener ) ((NotSimpleCalcListener)listener).exitThen(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NotSimpleCalcVisitor ) return ((NotSimpleCalcVisitor<? extends T>)visitor).visitThen(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ThenContext then() throws RecognitionException {
		ThenContext _localctx = new ThenContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_then);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(169);
			match(T__3);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ElseContext extends ParserRuleContext {
		public ElseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_else; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NotSimpleCalcListener ) ((NotSimpleCalcListener)listener).enterElse(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NotSimpleCalcListener ) ((NotSimpleCalcListener)listener).exitElse(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NotSimpleCalcVisitor ) return ((NotSimpleCalcVisitor<? extends T>)visitor).visitElse(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ElseContext else_() throws RecognitionException {
		ElseContext _localctx = new ElseContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_else);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(171);
			match(T__4);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class WhileContext extends ParserRuleContext {
		public WhileContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_while; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NotSimpleCalcListener ) ((NotSimpleCalcListener)listener).enterWhile(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NotSimpleCalcListener ) ((NotSimpleCalcListener)listener).exitWhile(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NotSimpleCalcVisitor ) return ((NotSimpleCalcVisitor<? extends T>)visitor).visitWhile(this);
			else return visitor.visitChildren(this);
		}
	}

	public final WhileContext while_() throws RecognitionException {
		WhileContext _localctx = new WhileContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_while);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(173);
			match(T__5);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ForContext extends ParserRuleContext {
		public ForContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_for; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NotSimpleCalcListener ) ((NotSimpleCalcListener)listener).enterFor(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NotSimpleCalcListener ) ((NotSimpleCalcListener)listener).exitFor(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NotSimpleCalcVisitor ) return ((NotSimpleCalcVisitor<? extends T>)visitor).visitFor(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ForContext for_() throws RecognitionException {
		ForContext _localctx = new ForContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_for);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(175);
			match(T__6);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class LoopContext extends ParserRuleContext {
		public LoopContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_loop; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NotSimpleCalcListener ) ((NotSimpleCalcListener)listener).enterLoop(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NotSimpleCalcListener ) ((NotSimpleCalcListener)listener).exitLoop(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NotSimpleCalcVisitor ) return ((NotSimpleCalcVisitor<? extends T>)visitor).visitLoop(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LoopContext loop() throws RecognitionException {
		LoopContext _localctx = new LoopContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_loop);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(177);
			match(T__7);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class PrintContext extends ParserRuleContext {
		public PrintContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_print; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NotSimpleCalcListener ) ((NotSimpleCalcListener)listener).enterPrint(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NotSimpleCalcListener ) ((NotSimpleCalcListener)listener).exitPrint(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NotSimpleCalcVisitor ) return ((NotSimpleCalcVisitor<? extends T>)visitor).visitPrint(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PrintContext print() throws RecognitionException {
		PrintContext _localctx = new PrintContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_print);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(179);
			match(T__8);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class OfContext extends ParserRuleContext {
		public OfContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_of; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NotSimpleCalcListener ) ((NotSimpleCalcListener)listener).enterOf(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NotSimpleCalcListener ) ((NotSimpleCalcListener)listener).exitOf(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NotSimpleCalcVisitor ) return ((NotSimpleCalcVisitor<? extends T>)visitor).visitOf(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OfContext of() throws RecognitionException {
		OfContext _localctx = new OfContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_of);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(181);
			match(T__9);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ToContext extends ParserRuleContext {
		public ToContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_to; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NotSimpleCalcListener ) ((NotSimpleCalcListener)listener).enterTo(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NotSimpleCalcListener ) ((NotSimpleCalcListener)listener).exitTo(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NotSimpleCalcVisitor ) return ((NotSimpleCalcVisitor<? extends T>)visitor).visitTo(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ToContext to() throws RecognitionException {
		ToContext _localctx = new ToContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_to);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(183);
			match(T__10);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class DoContext extends ParserRuleContext {
		public DoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_do; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NotSimpleCalcListener ) ((NotSimpleCalcListener)listener).enterDo(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NotSimpleCalcListener ) ((NotSimpleCalcListener)listener).exitDo(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NotSimpleCalcVisitor ) return ((NotSimpleCalcVisitor<? extends T>)visitor).visitDo(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DoContext do_() throws RecognitionException {
		DoContext _localctx = new DoContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_do);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(185);
			match(T__11);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class OpenpContext extends ParserRuleContext {
		public OpenpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_openp; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NotSimpleCalcListener ) ((NotSimpleCalcListener)listener).enterOpenp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NotSimpleCalcListener ) ((NotSimpleCalcListener)listener).exitOpenp(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NotSimpleCalcVisitor ) return ((NotSimpleCalcVisitor<? extends T>)visitor).visitOpenp(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OpenpContext openp() throws RecognitionException {
		OpenpContext _localctx = new OpenpContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_openp);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(187);
			match(T__12);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ClosepContext extends ParserRuleContext {
		public ClosepContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_closep; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NotSimpleCalcListener ) ((NotSimpleCalcListener)listener).enterClosep(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NotSimpleCalcListener ) ((NotSimpleCalcListener)listener).exitClosep(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NotSimpleCalcVisitor ) return ((NotSimpleCalcVisitor<? extends T>)visitor).visitClosep(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ClosepContext closep() throws RecognitionException {
		ClosepContext _localctx = new ClosepContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_closep);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(189);
			match(T__13);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ScContext extends ParserRuleContext {
		public ScContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sc; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NotSimpleCalcListener ) ((NotSimpleCalcListener)listener).enterSc(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NotSimpleCalcListener ) ((NotSimpleCalcListener)listener).exitSc(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NotSimpleCalcVisitor ) return ((NotSimpleCalcVisitor<? extends T>)visitor).visitSc(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ScContext sc() throws RecognitionException {
		ScContext _localctx = new ScContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_sc);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(191);
			match(T__14);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class CContext extends ParserRuleContext {
		public CContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_c; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NotSimpleCalcListener ) ((NotSimpleCalcListener)listener).enterC(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NotSimpleCalcListener ) ((NotSimpleCalcListener)listener).exitC(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NotSimpleCalcVisitor ) return ((NotSimpleCalcVisitor<? extends T>)visitor).visitC(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CContext c() throws RecognitionException {
		CContext _localctx = new CContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_c);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(193);
			match(T__15);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ComContext extends ParserRuleContext {
		public ComContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_com; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NotSimpleCalcListener ) ((NotSimpleCalcListener)listener).enterCom(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NotSimpleCalcListener ) ((NotSimpleCalcListener)listener).exitCom(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NotSimpleCalcVisitor ) return ((NotSimpleCalcVisitor<? extends T>)visitor).visitCom(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ComContext com() throws RecognitionException {
		ComContext _localctx = new ComContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_com);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(195);
			match(T__16);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static final String _serializedATN =
		"\u0004\u0001$\u00c6\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0002"+
		"\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b\u0002"+
		"\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002\u000f\u0007\u000f"+
		"\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011\u0002\u0012\u0007\u0012"+
		"\u0002\u0013\u0007\u0013\u0002\u0014\u0007\u0014\u0002\u0015\u0007\u0015"+
		"\u0002\u0016\u0007\u0016\u0002\u0017\u0007\u0017\u0002\u0018\u0007\u0018"+
		"\u0002\u0019\u0007\u0019\u0002\u001a\u0007\u001a\u0002\u001b\u0007\u001b"+
		"\u0002\u001c\u0007\u001c\u0002\u001d\u0007\u001d\u0002\u001e\u0007\u001e"+
		"\u0001\u0000\u0004\u0000@\b\u0000\u000b\u0000\f\u0000A\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0003"+
		"\u0001K\b\u0001\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001"+
		"\u0002\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0004\u0001"+
		"\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0003"+
		"\u0004]\b\u0004\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001"+
		"\u0005\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001"+
		"\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0007\u0001\u0007\u0001"+
		"\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\b\u0001\b"+
		"\u0001\b\u0003\bw\b\b\u0001\b\u0001\b\u0001\b\u0001\t\u0001\t\u0001\t"+
		"\u0003\t\u007f\b\t\u0001\n\u0001\n\u0001\n\u0005\n\u0084\b\n\n\n\f\n\u0087"+
		"\t\n\u0001\u000b\u0001\u000b\u0001\u000b\u0005\u000b\u008c\b\u000b\n\u000b"+
		"\f\u000b\u008f\t\u000b\u0001\f\u0001\f\u0001\f\u0005\f\u0094\b\f\n\f\f"+
		"\f\u0097\t\f\u0001\r\u0003\r\u009a\b\r\u0001\r\u0001\r\u0001\r\u0001\r"+
		"\u0001\r\u0001\r\u0003\r\u00a2\b\r\u0001\u000e\u0001\u000e\u0001\u000f"+
		"\u0001\u000f\u0001\u0010\u0001\u0010\u0001\u0011\u0001\u0011\u0001\u0012"+
		"\u0001\u0012\u0001\u0013\u0001\u0013\u0001\u0014\u0001\u0014\u0001\u0015"+
		"\u0001\u0015\u0001\u0016\u0001\u0016\u0001\u0017\u0001\u0017\u0001\u0018"+
		"\u0001\u0018\u0001\u0019\u0001\u0019\u0001\u001a\u0001\u001a\u0001\u001b"+
		"\u0001\u001b\u0001\u001c\u0001\u001c\u0001\u001d\u0001\u001d\u0001\u001e"+
		"\u0001\u001e\u0001\u001e\u0000\u0000\u001f\u0000\u0002\u0004\u0006\b\n"+
		"\f\u000e\u0010\u0012\u0014\u0016\u0018\u001a\u001c\u001e \"$&(*,.0246"+
		"8:<\u0000\u0003\u0001\u0000\u0019\u001e\u0001\u0000\u0014\u0015\u0002"+
		"\u0000\u0012\u0013\u0017\u0017\u00b6\u0000?\u0001\u0000\u0000\u0000\u0002"+
		"J\u0001\u0000\u0000\u0000\u0004L\u0001\u0000\u0000\u0000\u0006Q\u0001"+
		"\u0000\u0000\u0000\bU\u0001\u0000\u0000\u0000\n^\u0001\u0000\u0000\u0000"+
		"\fc\u0001\u0000\u0000\u0000\u000el\u0001\u0000\u0000\u0000\u0010s\u0001"+
		"\u0000\u0000\u0000\u0012{\u0001\u0000\u0000\u0000\u0014\u0080\u0001\u0000"+
		"\u0000\u0000\u0016\u0088\u0001\u0000\u0000\u0000\u0018\u0090\u0001\u0000"+
		"\u0000\u0000\u001a\u0099\u0001\u0000\u0000\u0000\u001c\u00a3\u0001\u0000"+
		"\u0000\u0000\u001e\u00a5\u0001\u0000\u0000\u0000 \u00a7\u0001\u0000\u0000"+
		"\u0000\"\u00a9\u0001\u0000\u0000\u0000$\u00ab\u0001\u0000\u0000\u0000"+
		"&\u00ad\u0001\u0000\u0000\u0000(\u00af\u0001\u0000\u0000\u0000*\u00b1"+
		"\u0001\u0000\u0000\u0000,\u00b3\u0001\u0000\u0000\u0000.\u00b5\u0001\u0000"+
		"\u0000\u00000\u00b7\u0001\u0000\u0000\u00002\u00b9\u0001\u0000\u0000\u0000"+
		"4\u00bb\u0001\u0000\u0000\u00006\u00bd\u0001\u0000\u0000\u00008\u00bf"+
		"\u0001\u0000\u0000\u0000:\u00c1\u0001\u0000\u0000\u0000<\u00c3\u0001\u0000"+
		"\u0000\u0000>@\u0003\u0002\u0001\u0000?>\u0001\u0000\u0000\u0000@A\u0001"+
		"\u0000\u0000\u0000A?\u0001\u0000\u0000\u0000AB\u0001\u0000\u0000\u0000"+
		"B\u0001\u0001\u0000\u0000\u0000CK\u0003\u0004\u0002\u0000DK\u0003\u0006"+
		"\u0003\u0000EK\u0003\b\u0004\u0000FK\u0003\n\u0005\u0000GK\u0003\f\u0006"+
		"\u0000HK\u0003\u000e\u0007\u0000IK\u0003\u0010\b\u0000JC\u0001\u0000\u0000"+
		"\u0000JD\u0001\u0000\u0000\u0000JE\u0001\u0000\u0000\u0000JF\u0001\u0000"+
		"\u0000\u0000JG\u0001\u0000\u0000\u0000JH\u0001\u0000\u0000\u0000JI\u0001"+
		"\u0000\u0000\u0000K\u0003\u0001\u0000\u0000\u0000LM\u0005 \u0000\u0000"+
		"MN\u0005\u0018\u0000\u0000NO\u0003\u0012\t\u0000OP\u00038\u001c\u0000"+
		"P\u0005\u0001\u0000\u0000\u0000QR\u0003\u001c\u000e\u0000RS\u0003\u0000"+
		"\u0000\u0000ST\u0003\u001e\u000f\u0000T\u0007\u0001\u0000\u0000\u0000"+
		"UV\u0003 \u0010\u0000VW\u0003\u0012\t\u0000WX\u0003\"\u0011\u0000X\\\u0003"+
		"\u0002\u0001\u0000YZ\u0003$\u0012\u0000Z[\u0003\u0002\u0001\u0000[]\u0001"+
		"\u0000\u0000\u0000\\Y\u0001\u0000\u0000\u0000\\]\u0001\u0000\u0000\u0000"+
		"]\t\u0001\u0000\u0000\u0000^_\u0003&\u0013\u0000_`\u0003\u0012\t\u0000"+
		"`a\u00032\u0019\u0000ab\u0003\u0002\u0001\u0000b\u000b\u0001\u0000\u0000"+
		"\u0000cd\u0003(\u0014\u0000de\u0005 \u0000\u0000ef\u0003.\u0017\u0000"+
		"fg\u0005!\u0000\u0000gh\u00030\u0018\u0000hi\u0005!\u0000\u0000ij\u0003"+
		"2\u0019\u0000jk\u0003\u0002\u0001\u0000k\r\u0001\u0000\u0000\u0000lm\u0003"+
		"*\u0015\u0000mn\u0005 \u0000\u0000no\u0003:\u001d\u0000op\u0005!\u0000"+
		"\u0000pq\u00032\u0019\u0000qr\u0003\u0002\u0001\u0000r\u000f\u0001\u0000"+
		"\u0000\u0000sv\u0003,\u0016\u0000tu\u0005\"\u0000\u0000uw\u0003<\u001e"+
		"\u0000vt\u0001\u0000\u0000\u0000vw\u0001\u0000\u0000\u0000wx\u0001\u0000"+
		"\u0000\u0000xy\u0005 \u0000\u0000yz\u00038\u001c\u0000z\u0011\u0001\u0000"+
		"\u0000\u0000{~\u0003\u0014\n\u0000|}\u0007\u0000\u0000\u0000}\u007f\u0003"+
		"\u0014\n\u0000~|\u0001\u0000\u0000\u0000~\u007f\u0001\u0000\u0000\u0000"+
		"\u007f\u0013\u0001\u0000\u0000\u0000\u0080\u0085\u0003\u0016\u000b\u0000"+
		"\u0081\u0082\u0007\u0001\u0000\u0000\u0082\u0084\u0003\u0016\u000b\u0000"+
		"\u0083\u0081\u0001\u0000\u0000\u0000\u0084\u0087\u0001\u0000\u0000\u0000"+
		"\u0085\u0083\u0001\u0000\u0000\u0000\u0085\u0086\u0001\u0000\u0000\u0000"+
		"\u0086\u0015\u0001\u0000\u0000\u0000\u0087\u0085\u0001\u0000\u0000\u0000"+
		"\u0088\u008d\u0003\u0018\f\u0000\u0089\u008a\u0007\u0002\u0000\u0000\u008a"+
		"\u008c\u0003\u0018\f\u0000\u008b\u0089\u0001\u0000\u0000\u0000\u008c\u008f"+
		"\u0001\u0000\u0000\u0000\u008d\u008b\u0001\u0000\u0000\u0000\u008d\u008e"+
		"\u0001\u0000\u0000\u0000\u008e\u0017\u0001\u0000\u0000\u0000\u008f\u008d"+
		"\u0001\u0000\u0000\u0000\u0090\u0095\u0003\u001a\r\u0000\u0091\u0092\u0005"+
		"\u0016\u0000\u0000\u0092\u0094\u0003\u0018\f\u0000\u0093\u0091\u0001\u0000"+
		"\u0000\u0000\u0094\u0097\u0001\u0000\u0000\u0000\u0095\u0093\u0001\u0000"+
		"\u0000\u0000\u0095\u0096\u0001\u0000\u0000\u0000\u0096\u0019\u0001\u0000"+
		"\u0000\u0000\u0097\u0095\u0001\u0000\u0000\u0000\u0098\u009a\u0007\u0001"+
		"\u0000\u0000\u0099\u0098\u0001\u0000\u0000\u0000\u0099\u009a\u0001\u0000"+
		"\u0000\u0000\u009a\u00a1\u0001\u0000\u0000\u0000\u009b\u00a2\u0005 \u0000"+
		"\u0000\u009c\u00a2\u0005!\u0000\u0000\u009d\u009e\u00034\u001a\u0000\u009e"+
		"\u009f\u0003\u0012\t\u0000\u009f\u00a0\u00036\u001b\u0000\u00a0\u00a2"+
		"\u0001\u0000\u0000\u0000\u00a1\u009b\u0001\u0000\u0000\u0000\u00a1\u009c"+
		"\u0001\u0000\u0000\u0000\u00a1\u009d\u0001\u0000\u0000\u0000\u00a2\u001b"+
		"\u0001\u0000\u0000\u0000\u00a3\u00a4\u0005\u0001\u0000\u0000\u00a4\u001d"+
		"\u0001\u0000\u0000\u0000\u00a5\u00a6\u0005\u0002\u0000\u0000\u00a6\u001f"+
		"\u0001\u0000\u0000\u0000\u00a7\u00a8\u0005\u0003\u0000\u0000\u00a8!\u0001"+
		"\u0000\u0000\u0000\u00a9\u00aa\u0005\u0004\u0000\u0000\u00aa#\u0001\u0000"+
		"\u0000\u0000\u00ab\u00ac\u0005\u0005\u0000\u0000\u00ac%\u0001\u0000\u0000"+
		"\u0000\u00ad\u00ae\u0005\u0006\u0000\u0000\u00ae\'\u0001\u0000\u0000\u0000"+
		"\u00af\u00b0\u0005\u0007\u0000\u0000\u00b0)\u0001\u0000\u0000\u0000\u00b1"+
		"\u00b2\u0005\b\u0000\u0000\u00b2+\u0001\u0000\u0000\u0000\u00b3\u00b4"+
		"\u0005\t\u0000\u0000\u00b4-\u0001\u0000\u0000\u0000\u00b5\u00b6\u0005"+
		"\n\u0000\u0000\u00b6/\u0001\u0000\u0000\u0000\u00b7\u00b8\u0005\u000b"+
		"\u0000\u0000\u00b81\u0001\u0000\u0000\u0000\u00b9\u00ba\u0005\f\u0000"+
		"\u0000\u00ba3\u0001\u0000\u0000\u0000\u00bb\u00bc\u0005\r\u0000\u0000"+
		"\u00bc5\u0001\u0000\u0000\u0000\u00bd\u00be\u0005\u000e\u0000\u0000\u00be"+
		"7\u0001\u0000\u0000\u0000\u00bf\u00c0\u0005\u000f\u0000\u0000\u00c09\u0001"+
		"\u0000\u0000\u0000\u00c1\u00c2\u0005\u0010\u0000\u0000\u00c2;\u0001\u0000"+
		"\u0000\u0000\u00c3\u00c4\u0005\u0011\u0000\u0000\u00c4=\u0001\u0000\u0000"+
		"\u0000\nAJ\\v~\u0085\u008d\u0095\u0099\u00a1";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}