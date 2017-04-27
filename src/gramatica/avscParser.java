// Generated from avsc.g4 by ANTLR 4.4
package gramatica;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class avscParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.4", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__34=1, T__33=2, T__32=3, T__31=4, T__30=5, T__29=6, T__28=7, T__27=8, 
		T__26=9, T__25=10, T__24=11, T__23=12, T__22=13, T__21=14, T__20=15, T__19=16, 
		T__18=17, T__17=18, T__16=19, T__15=20, T__14=21, T__13=22, T__12=23, 
		T__11=24, T__10=25, T__9=26, T__8=27, T__7=28, T__6=29, T__5=30, T__4=31, 
		T__3=32, T__2=33, T__1=34, T__0=35, IDENTIFIER=36, INTEGER_LITERAL=37, 
		SINGLE_LINE_COMMENT=38, MULTI_LINE_COMMENT=39, WHITESPACE=40;
	public static final String[] tokenNames = {
		"<INVALID>", "'main'", "'length'", "'new'", "'true'", "'return'", "'class'", 
		"'while'", "';'", "'void'", "'{'", "'&&'", "'='", "'extends'", "'}'", 
		"'if'", "'int'", "'('", "'*'", "'this'", "','", "'.'", "'false'", "'boolean'", 
		"'System.out.println'", "'['", "'<'", "'String'", "']'", "'public'", "'!'", 
		"'static'", "'else'", "')'", "'+'", "'-'", "IDENTIFIER", "INTEGER_LITERAL", 
		"SINGLE_LINE_COMMENT", "MULTI_LINE_COMMENT", "WHITESPACE"
	};
	public static final int
		RULE_goal = 0, RULE_mainClass = 1, RULE_classDeclaration = 2, RULE_varDeclaration = 3, 
		RULE_methodDeclaration = 4, RULE_type = 5, RULE_statement = 6, RULE_ifElse = 7, 
		RULE_whileLoop = 8, RULE_print = 9, RULE_expression = 10;
	public static final String[] ruleNames = {
		"goal", "mainClass", "classDeclaration", "varDeclaration", "methodDeclaration", 
		"type", "statement", "ifElse", "whileLoop", "print", "expression"
	};

	@Override
	public String getGrammarFileName() { return "avsc.g4"; }

	@Override
	public String[] getTokenNames() { return tokenNames; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public avscParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class GoalContext extends ParserRuleContext {
		public List<ClassDeclarationContext> classDeclaration() {
			return getRuleContexts(ClassDeclarationContext.class);
		}
		public ClassDeclarationContext classDeclaration(int i) {
			return getRuleContext(ClassDeclarationContext.class,i);
		}
		public MainClassContext mainClass() {
			return getRuleContext(MainClassContext.class,0);
		}
		public GoalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_goal; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof avscListener ) ((avscListener)listener).enterGoal(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof avscListener ) ((avscListener)listener).exitGoal(this);
		}
	}

	public final GoalContext goal() throws RecognitionException {
		GoalContext _localctx = new GoalContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_goal);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(22); mainClass();
			setState(26);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__29) {
				{
				{
				setState(23); classDeclaration();
				}
				}
				setState(28);
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

	public static class MainClassContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER(int i) {
			return getToken(avscParser.IDENTIFIER, i);
		}
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public List<TerminalNode> IDENTIFIER() { return getTokens(avscParser.IDENTIFIER); }
		public MainClassContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_mainClass; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof avscListener ) ((avscListener)listener).enterMainClass(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof avscListener ) ((avscListener)listener).exitMainClass(this);
		}
	}

	public final MainClassContext mainClass() throws RecognitionException {
		MainClassContext _localctx = new MainClassContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_mainClass);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(29); match(T__29);
			setState(30); match(IDENTIFIER);
			setState(31); match(T__25);
			setState(32); match(T__6);
			setState(33); match(T__4);
			setState(34); match(T__26);
			setState(35); match(T__34);
			setState(36); match(T__18);
			setState(37); match(T__8);
			setState(38); match(T__10);
			setState(39); match(T__7);
			setState(40); match(IDENTIFIER);
			setState(41); match(T__2);
			setState(42); match(T__25);
			setState(43); statement();
			setState(44); match(T__21);
			setState(45); match(T__21);
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

	public static class ClassDeclarationContext extends ParserRuleContext {
		public List<MethodDeclarationContext> methodDeclaration() {
			return getRuleContexts(MethodDeclarationContext.class);
		}
		public List<VarDeclarationContext> varDeclaration() {
			return getRuleContexts(VarDeclarationContext.class);
		}
		public TerminalNode IDENTIFIER(int i) {
			return getToken(avscParser.IDENTIFIER, i);
		}
		public List<TerminalNode> IDENTIFIER() { return getTokens(avscParser.IDENTIFIER); }
		public MethodDeclarationContext methodDeclaration(int i) {
			return getRuleContext(MethodDeclarationContext.class,i);
		}
		public VarDeclarationContext varDeclaration(int i) {
			return getRuleContext(VarDeclarationContext.class,i);
		}
		public ClassDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_classDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof avscListener ) ((avscListener)listener).enterClassDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof avscListener ) ((avscListener)listener).exitClassDeclaration(this);
		}
	}

	public final ClassDeclarationContext classDeclaration() throws RecognitionException {
		ClassDeclarationContext _localctx = new ClassDeclarationContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_classDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(47); match(T__29);
			setState(48); match(IDENTIFIER);
			setState(51);
			_la = _input.LA(1);
			if (_la==T__22) {
				{
				setState(49); match(T__22);
				setState(50); match(IDENTIFIER);
				}
			}

			setState(53); match(T__25);
			setState(57);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__19) | (1L << T__12) | (1L << IDENTIFIER))) != 0)) {
				{
				{
				setState(54); varDeclaration();
				}
				}
				setState(59);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(63);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__6) {
				{
				{
				setState(60); methodDeclaration();
				}
				}
				setState(65);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(66); match(T__21);
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

	public static class VarDeclarationContext extends ParserRuleContext {
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TerminalNode IDENTIFIER() { return getToken(avscParser.IDENTIFIER, 0); }
		public VarDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_varDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof avscListener ) ((avscListener)listener).enterVarDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof avscListener ) ((avscListener)listener).exitVarDeclaration(this);
		}
	}

	public final VarDeclarationContext varDeclaration() throws RecognitionException {
		VarDeclarationContext _localctx = new VarDeclarationContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_varDeclaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(68); type();
			setState(69); match(IDENTIFIER);
			setState(70); match(T__27);
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

	public static class MethodDeclarationContext extends ParserRuleContext {
		public List<VarDeclarationContext> varDeclaration() {
			return getRuleContexts(VarDeclarationContext.class);
		}
		public TypeContext type(int i) {
			return getRuleContext(TypeContext.class,i);
		}
		public TerminalNode IDENTIFIER(int i) {
			return getToken(avscParser.IDENTIFIER, i);
		}
		public List<TypeContext> type() {
			return getRuleContexts(TypeContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public List<TerminalNode> IDENTIFIER() { return getTokens(avscParser.IDENTIFIER); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public VarDeclarationContext varDeclaration(int i) {
			return getRuleContext(VarDeclarationContext.class,i);
		}
		public MethodDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_methodDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof avscListener ) ((avscListener)listener).enterMethodDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof avscListener ) ((avscListener)listener).exitMethodDeclaration(this);
		}
	}

	public final MethodDeclarationContext methodDeclaration() throws RecognitionException {
		MethodDeclarationContext _localctx = new MethodDeclarationContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_methodDeclaration);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(72); match(T__6);
			setState(73); type();
			setState(74); match(IDENTIFIER);
			setState(75); match(T__18);
			setState(87);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__19) | (1L << T__12) | (1L << IDENTIFIER))) != 0)) {
				{
				setState(76); type();
				setState(77); match(IDENTIFIER);
				setState(84);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__15) {
					{
					{
					setState(78); match(T__15);
					setState(79); type();
					setState(80); match(IDENTIFIER);
					}
					}
					setState(86);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(89); match(T__2);
			setState(90); match(T__25);
			setState(94);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,6,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(91); varDeclaration();
					}
					} 
				}
				setState(96);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,6,_ctx);
			}
			setState(100);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__28) | (1L << T__25) | (1L << T__20) | (1L << T__11) | (1L << IDENTIFIER))) != 0)) {
				{
				{
				setState(97); statement();
				}
				}
				setState(102);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(103); match(T__30);
			setState(104); expression(0);
			setState(105); match(T__27);
			setState(106); match(T__21);
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

	public static class TypeContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(avscParser.IDENTIFIER, 0); }
		public TypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_type; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof avscListener ) ((avscListener)listener).enterType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof avscListener ) ((avscListener)listener).exitType(this);
		}
	}

	public final TypeContext type() throws RecognitionException {
		TypeContext _localctx = new TypeContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_type);
		try {
			setState(114);
			switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(108); match(T__19);
				setState(109); match(T__10);
				setState(110); match(T__7);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(111); match(T__12);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(112); match(T__19);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(113); match(IDENTIFIER);
				}
				break;
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

	public static class StatementContext extends ParserRuleContext {
		public WhileLoopContext whileLoop() {
			return getRuleContext(WhileLoopContext.class,0);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public TerminalNode IDENTIFIER() { return getToken(avscParser.IDENTIFIER, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public IfElseContext ifElse() {
			return getRuleContext(IfElseContext.class,0);
		}
		public PrintContext print() {
			return getRuleContext(PrintContext.class,0);
		}
		public StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof avscListener ) ((avscListener)listener).enterStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof avscListener ) ((avscListener)listener).exitStatement(this);
		}
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_statement);
		int _la;
		try {
			setState(140);
			switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(116); match(T__25);
				setState(120);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__28) | (1L << T__25) | (1L << T__20) | (1L << T__11) | (1L << IDENTIFIER))) != 0)) {
					{
					{
					setState(117); statement();
					}
					}
					setState(122);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(123); match(T__21);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(124); ifElse();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(125); whileLoop();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(126); print();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(127); match(IDENTIFIER);
				setState(128); match(T__23);
				setState(129); expression(0);
				setState(130); match(T__27);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(132); match(IDENTIFIER);
				setState(133); match(T__10);
				setState(134); expression(0);
				setState(135); match(T__7);
				setState(136); match(T__23);
				setState(137); expression(0);
				setState(138); match(T__27);
				}
				break;
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

	public static class IfElseContext extends ParserRuleContext {
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public IfElseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ifElse; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof avscListener ) ((avscListener)listener).enterIfElse(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof avscListener ) ((avscListener)listener).exitIfElse(this);
		}
	}

	public final IfElseContext ifElse() throws RecognitionException {
		IfElseContext _localctx = new IfElseContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_ifElse);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(142); match(T__20);
			setState(143); match(T__18);
			setState(144); expression(0);
			setState(145); match(T__2);
			setState(146); statement();
			setState(147); match(T__3);
			setState(148); statement();
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

	public static class WhileLoopContext extends ParserRuleContext {
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public WhileLoopContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_whileLoop; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof avscListener ) ((avscListener)listener).enterWhileLoop(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof avscListener ) ((avscListener)listener).exitWhileLoop(this);
		}
	}

	public final WhileLoopContext whileLoop() throws RecognitionException {
		WhileLoopContext _localctx = new WhileLoopContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_whileLoop);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(150); match(T__28);
			setState(151); match(T__18);
			setState(152); expression(0);
			setState(153); match(T__2);
			setState(154); statement();
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

	public static class PrintContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public PrintContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_print; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof avscListener ) ((avscListener)listener).enterPrint(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof avscListener ) ((avscListener)listener).exitPrint(this);
		}
	}

	public final PrintContext print() throws RecognitionException {
		PrintContext _localctx = new PrintContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_print);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(156); match(T__11);
			setState(157); match(T__18);
			setState(158); expression(0);
			setState(159); match(T__2);
			setState(160); match(T__27);
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

	public static class ExpressionContext extends ParserRuleContext {
		public TerminalNode INTEGER_LITERAL() { return getToken(avscParser.INTEGER_LITERAL, 0); }
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public TerminalNode IDENTIFIER() { return getToken(avscParser.IDENTIFIER, 0); }
		public ExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof avscListener ) ((avscListener)listener).enterExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof avscListener ) ((avscListener)listener).exitExpression(this);
		}
	}

	public final ExpressionContext expression() throws RecognitionException {
		return expression(0);
	}

	private ExpressionContext expression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExpressionContext _localctx = new ExpressionContext(_ctx, _parentState);
		ExpressionContext _prevctx = _localctx;
		int _startState = 20;
		enterRecursionRule(_localctx, 20, RULE_expression, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(184);
			switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
			case 1:
				{
				setState(163); match(T__5);
				setState(164); expression(10);
				}
				break;
			case 2:
				{
				setState(165); match(T__31);
				}
				break;
			case 3:
				{
				setState(166); match(T__13);
				}
				break;
			case 4:
				{
				setState(167); match(T__16);
				}
				break;
			case 5:
				{
				setState(168); match(T__18);
				setState(169); expression(0);
				setState(170); match(T__2);
				}
				break;
			case 6:
				{
				setState(172); match(IDENTIFIER);
				}
				break;
			case 7:
				{
				setState(173); match(INTEGER_LITERAL);
				}
				break;
			case 8:
				{
				setState(174); match(T__32);
				setState(175); match(T__19);
				setState(176); match(T__10);
				setState(177); expression(0);
				setState(178); match(T__7);
				}
				break;
			case 9:
				{
				setState(180); match(T__32);
				setState(181); match(IDENTIFIER);
				setState(182); match(T__18);
				setState(183); match(T__2);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(214);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,15,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(212);
					switch ( getInterpreter().adaptivePredict(_input,14,_ctx) ) {
					case 1:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(186);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(187);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__24) | (1L << T__17) | (1L << T__9) | (1L << T__1) | (1L << T__0))) != 0)) ) {
						_errHandler.recoverInline(this);
						}
						consume();
						setState(188); expression(7);
						}
						break;
					case 2:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(189);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(190); match(T__10);
						setState(191); expression(0);
						setState(192); match(T__7);
						}
						break;
					case 3:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(194);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(195); match(T__14);
						setState(196); match(T__33);
						}
						break;
					case 4:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(197);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(198); match(T__14);
						setState(199); match(IDENTIFIER);
						setState(200); match(T__18);
						setState(209);
						_la = _input.LA(1);
						if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__32) | (1L << T__31) | (1L << T__18) | (1L << T__16) | (1L << T__13) | (1L << T__5) | (1L << IDENTIFIER) | (1L << INTEGER_LITERAL))) != 0)) {
							{
							setState(201); expression(0);
							setState(206);
							_errHandler.sync(this);
							_la = _input.LA(1);
							while (_la==T__15) {
								{
								{
								setState(202); match(T__15);
								setState(203); expression(0);
								}
								}
								setState(208);
								_errHandler.sync(this);
								_la = _input.LA(1);
							}
							}
						}

						setState(211); match(T__2);
						}
						break;
					}
					} 
				}
				setState(216);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,15,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 10: return expression_sempred((ExpressionContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean expression_sempred(ExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0: return precpred(_ctx, 6);
		case 1: return precpred(_ctx, 5);
		case 2: return precpred(_ctx, 3);
		case 3: return precpred(_ctx, 1);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3*\u00dc\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\3\2\3\2\7\2\33\n\2\f\2\16\2\36\13\2\3\3\3\3\3\3\3\3\3\3\3"+
		"\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\4\3\4\3\4\3\4\5\4"+
		"\66\n\4\3\4\3\4\7\4:\n\4\f\4\16\4=\13\4\3\4\7\4@\n\4\f\4\16\4C\13\4\3"+
		"\4\3\4\3\5\3\5\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\7\6U\n"+
		"\6\f\6\16\6X\13\6\5\6Z\n\6\3\6\3\6\3\6\7\6_\n\6\f\6\16\6b\13\6\3\6\7\6"+
		"e\n\6\f\6\16\6h\13\6\3\6\3\6\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3\7\3\7\5\7u"+
		"\n\7\3\b\3\b\7\by\n\b\f\b\16\b|\13\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3"+
		"\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\5\b\u008f\n\b\3\t\3\t\3\t\3\t\3\t\3"+
		"\t\3\t\3\t\3\n\3\n\3\n\3\n\3\n\3\n\3\13\3\13\3\13\3\13\3\13\3\13\3\f\3"+
		"\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f"+
		"\3\f\3\f\3\f\5\f\u00bb\n\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f"+
		"\3\f\3\f\3\f\3\f\3\f\3\f\3\f\7\f\u00cf\n\f\f\f\16\f\u00d2\13\f\5\f\u00d4"+
		"\n\f\3\f\7\f\u00d7\n\f\f\f\16\f\u00da\13\f\3\f\2\3\26\r\2\4\6\b\n\f\16"+
		"\20\22\24\26\2\3\6\2\r\r\24\24\34\34$%\u00ef\2\30\3\2\2\2\4\37\3\2\2\2"+
		"\6\61\3\2\2\2\bF\3\2\2\2\nJ\3\2\2\2\ft\3\2\2\2\16\u008e\3\2\2\2\20\u0090"+
		"\3\2\2\2\22\u0098\3\2\2\2\24\u009e\3\2\2\2\26\u00ba\3\2\2\2\30\34\5\4"+
		"\3\2\31\33\5\6\4\2\32\31\3\2\2\2\33\36\3\2\2\2\34\32\3\2\2\2\34\35\3\2"+
		"\2\2\35\3\3\2\2\2\36\34\3\2\2\2\37 \7\b\2\2 !\7&\2\2!\"\7\f\2\2\"#\7\37"+
		"\2\2#$\7!\2\2$%\7\13\2\2%&\7\3\2\2&\'\7\23\2\2\'(\7\35\2\2()\7\33\2\2"+
		")*\7\36\2\2*+\7&\2\2+,\7#\2\2,-\7\f\2\2-.\5\16\b\2./\7\20\2\2/\60\7\20"+
		"\2\2\60\5\3\2\2\2\61\62\7\b\2\2\62\65\7&\2\2\63\64\7\17\2\2\64\66\7&\2"+
		"\2\65\63\3\2\2\2\65\66\3\2\2\2\66\67\3\2\2\2\67;\7\f\2\28:\5\b\5\298\3"+
		"\2\2\2:=\3\2\2\2;9\3\2\2\2;<\3\2\2\2<A\3\2\2\2=;\3\2\2\2>@\5\n\6\2?>\3"+
		"\2\2\2@C\3\2\2\2A?\3\2\2\2AB\3\2\2\2BD\3\2\2\2CA\3\2\2\2DE\7\20\2\2E\7"+
		"\3\2\2\2FG\5\f\7\2GH\7&\2\2HI\7\n\2\2I\t\3\2\2\2JK\7\37\2\2KL\5\f\7\2"+
		"LM\7&\2\2MY\7\23\2\2NO\5\f\7\2OV\7&\2\2PQ\7\26\2\2QR\5\f\7\2RS\7&\2\2"+
		"SU\3\2\2\2TP\3\2\2\2UX\3\2\2\2VT\3\2\2\2VW\3\2\2\2WZ\3\2\2\2XV\3\2\2\2"+
		"YN\3\2\2\2YZ\3\2\2\2Z[\3\2\2\2[\\\7#\2\2\\`\7\f\2\2]_\5\b\5\2^]\3\2\2"+
		"\2_b\3\2\2\2`^\3\2\2\2`a\3\2\2\2af\3\2\2\2b`\3\2\2\2ce\5\16\b\2dc\3\2"+
		"\2\2eh\3\2\2\2fd\3\2\2\2fg\3\2\2\2gi\3\2\2\2hf\3\2\2\2ij\7\7\2\2jk\5\26"+
		"\f\2kl\7\n\2\2lm\7\20\2\2m\13\3\2\2\2no\7\22\2\2op\7\33\2\2pu\7\36\2\2"+
		"qu\7\31\2\2ru\7\22\2\2su\7&\2\2tn\3\2\2\2tq\3\2\2\2tr\3\2\2\2ts\3\2\2"+
		"\2u\r\3\2\2\2vz\7\f\2\2wy\5\16\b\2xw\3\2\2\2y|\3\2\2\2zx\3\2\2\2z{\3\2"+
		"\2\2{}\3\2\2\2|z\3\2\2\2}\u008f\7\20\2\2~\u008f\5\20\t\2\177\u008f\5\22"+
		"\n\2\u0080\u008f\5\24\13\2\u0081\u0082\7&\2\2\u0082\u0083\7\16\2\2\u0083"+
		"\u0084\5\26\f\2\u0084\u0085\7\n\2\2\u0085\u008f\3\2\2\2\u0086\u0087\7"+
		"&\2\2\u0087\u0088\7\33\2\2\u0088\u0089\5\26\f\2\u0089\u008a\7\36\2\2\u008a"+
		"\u008b\7\16\2\2\u008b\u008c\5\26\f\2\u008c\u008d\7\n\2\2\u008d\u008f\3"+
		"\2\2\2\u008ev\3\2\2\2\u008e~\3\2\2\2\u008e\177\3\2\2\2\u008e\u0080\3\2"+
		"\2\2\u008e\u0081\3\2\2\2\u008e\u0086\3\2\2\2\u008f\17\3\2\2\2\u0090\u0091"+
		"\7\21\2\2\u0091\u0092\7\23\2\2\u0092\u0093\5\26\f\2\u0093\u0094\7#\2\2"+
		"\u0094\u0095\5\16\b\2\u0095\u0096\7\"\2\2\u0096\u0097\5\16\b\2\u0097\21"+
		"\3\2\2\2\u0098\u0099\7\t\2\2\u0099\u009a\7\23\2\2\u009a\u009b\5\26\f\2"+
		"\u009b\u009c\7#\2\2\u009c\u009d\5\16\b\2\u009d\23\3\2\2\2\u009e\u009f"+
		"\7\32\2\2\u009f\u00a0\7\23\2\2\u00a0\u00a1\5\26\f\2\u00a1\u00a2\7#\2\2"+
		"\u00a2\u00a3\7\n\2\2\u00a3\25\3\2\2\2\u00a4\u00a5\b\f\1\2\u00a5\u00a6"+
		"\7 \2\2\u00a6\u00bb\5\26\f\f\u00a7\u00bb\7\6\2\2\u00a8\u00bb\7\30\2\2"+
		"\u00a9\u00bb\7\25\2\2\u00aa\u00ab\7\23\2\2\u00ab\u00ac\5\26\f\2\u00ac"+
		"\u00ad\7#\2\2\u00ad\u00bb\3\2\2\2\u00ae\u00bb\7&\2\2\u00af\u00bb\7\'\2"+
		"\2\u00b0\u00b1\7\5\2\2\u00b1\u00b2\7\22\2\2\u00b2\u00b3\7\33\2\2\u00b3"+
		"\u00b4\5\26\f\2\u00b4\u00b5\7\36\2\2\u00b5\u00bb\3\2\2\2\u00b6\u00b7\7"+
		"\5\2\2\u00b7\u00b8\7&\2\2\u00b8\u00b9\7\23\2\2\u00b9\u00bb\7#\2\2\u00ba"+
		"\u00a4\3\2\2\2\u00ba\u00a7\3\2\2\2\u00ba\u00a8\3\2\2\2\u00ba\u00a9\3\2"+
		"\2\2\u00ba\u00aa\3\2\2\2\u00ba\u00ae\3\2\2\2\u00ba\u00af\3\2\2\2\u00ba"+
		"\u00b0\3\2\2\2\u00ba\u00b6\3\2\2\2\u00bb\u00d8\3\2\2\2\u00bc\u00bd\f\b"+
		"\2\2\u00bd\u00be\t\2\2\2\u00be\u00d7\5\26\f\t\u00bf\u00c0\f\7\2\2\u00c0"+
		"\u00c1\7\33\2\2\u00c1\u00c2\5\26\f\2\u00c2\u00c3\7\36\2\2\u00c3\u00d7"+
		"\3\2\2\2\u00c4\u00c5\f\5\2\2\u00c5\u00c6\7\27\2\2\u00c6\u00d7\7\4\2\2"+
		"\u00c7\u00c8\f\3\2\2\u00c8\u00c9\7\27\2\2\u00c9\u00ca\7&\2\2\u00ca\u00d3"+
		"\7\23\2\2\u00cb\u00d0\5\26\f\2\u00cc\u00cd\7\26\2\2\u00cd\u00cf\5\26\f"+
		"\2\u00ce\u00cc\3\2\2\2\u00cf\u00d2\3\2\2\2\u00d0\u00ce\3\2\2\2\u00d0\u00d1"+
		"\3\2\2\2\u00d1\u00d4\3\2\2\2\u00d2\u00d0\3\2\2\2\u00d3\u00cb\3\2\2\2\u00d3"+
		"\u00d4\3\2\2\2\u00d4\u00d5\3\2\2\2\u00d5\u00d7\7#\2\2\u00d6\u00bc\3\2"+
		"\2\2\u00d6\u00bf\3\2\2\2\u00d6\u00c4\3\2\2\2\u00d6\u00c7\3\2\2\2\u00d7"+
		"\u00da\3\2\2\2\u00d8\u00d6\3\2\2\2\u00d8\u00d9\3\2\2\2\u00d9\27\3\2\2"+
		"\2\u00da\u00d8\3\2\2\2\22\34\65;AVY`ftz\u008e\u00ba\u00d0\u00d3\u00d6"+
		"\u00d8";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}