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
		RULE_methodDeclaration = 4, RULE_type = 5, RULE_statement = 6, RULE_statementList = 7, 
		RULE_ifElse = 8, RULE_whileLoop = 9, RULE_print = 10, RULE_assign = 11, 
		RULE_arrayAssign = 12, RULE_expression = 13;
	public static final String[] ruleNames = {
		"goal", "mainClass", "classDeclaration", "varDeclaration", "methodDeclaration", 
		"type", "statement", "statementList", "ifElse", "whileLoop", "print", 
		"assign", "arrayAssign", "expression"
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
			setState(28); mainClass();
			setState(32);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__29) {
				{
				{
				setState(29); classDeclaration();
				}
				}
				setState(34);
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
			setState(35); match(T__29);
			setState(36); match(IDENTIFIER);
			setState(37); match(T__25);
			setState(38); match(T__6);
			setState(39); match(T__4);
			setState(40); match(T__26);
			setState(41); match(T__34);
			setState(42); match(T__18);
			setState(43); match(T__8);
			setState(44); match(T__10);
			setState(45); match(T__7);
			setState(46); match(IDENTIFIER);
			setState(47); match(T__2);
			setState(48); match(T__25);
			setState(49); statement();
			setState(50); match(T__21);
			setState(51); match(T__21);
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
			setState(53); match(T__29);
			setState(54); match(IDENTIFIER);
			setState(57);
			_la = _input.LA(1);
			if (_la==T__22) {
				{
				setState(55); match(T__22);
				setState(56); match(IDENTIFIER);
				}
			}

			setState(59); match(T__25);
			setState(63);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__19) | (1L << T__12) | (1L << IDENTIFIER))) != 0)) {
				{
				{
				setState(60); varDeclaration();
				}
				}
				setState(65);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(69);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__6) {
				{
				{
				setState(66); methodDeclaration();
				}
				}
				setState(71);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(72); match(T__21);
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
			setState(74); type();
			setState(75); match(IDENTIFIER);
			setState(76); match(T__27);
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
			setState(78); match(T__6);
			setState(79); type();
			setState(80); match(IDENTIFIER);
			setState(81); match(T__18);
			setState(93);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__19) | (1L << T__12) | (1L << IDENTIFIER))) != 0)) {
				{
				setState(82); type();
				setState(83); match(IDENTIFIER);
				setState(90);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__15) {
					{
					{
					setState(84); match(T__15);
					setState(85); type();
					setState(86); match(IDENTIFIER);
					}
					}
					setState(92);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(95); match(T__2);
			setState(96); match(T__25);
			setState(100);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,6,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(97); varDeclaration();
					}
					} 
				}
				setState(102);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,6,_ctx);
			}
			setState(106);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__28) | (1L << T__25) | (1L << T__20) | (1L << T__11) | (1L << IDENTIFIER))) != 0)) {
				{
				{
				setState(103); statement();
				}
				}
				setState(108);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(109); match(T__30);
			setState(110); expression(0);
			setState(111); match(T__27);
			setState(112); match(T__21);
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
			setState(120);
			switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(114); match(T__19);
				setState(115); match(T__10);
				setState(116); match(T__7);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(117); match(T__12);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(118); match(T__19);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(119); match(IDENTIFIER);
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
		public AssignContext assign() {
			return getRuleContext(AssignContext.class,0);
		}
		public StatementListContext statementList() {
			return getRuleContext(StatementListContext.class,0);
		}
		public ArrayAssignContext arrayAssign() {
			return getRuleContext(ArrayAssignContext.class,0);
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
		try {
			setState(128);
			switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(122); statementList();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(123); ifElse();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(124); whileLoop();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(125); print();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(126); assign();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(127); arrayAssign();
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

	public static class StatementListContext extends ParserRuleContext {
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statementList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof avscListener ) ((avscListener)listener).enterStatementList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof avscListener ) ((avscListener)listener).exitStatementList(this);
		}
	}

	public final StatementListContext statementList() throws RecognitionException {
		StatementListContext _localctx = new StatementListContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_statementList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(130); match(T__25);
			setState(134);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__28) | (1L << T__25) | (1L << T__20) | (1L << T__11) | (1L << IDENTIFIER))) != 0)) {
				{
				{
				setState(131); statement();
				}
				}
				setState(136);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(137); match(T__21);
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
		enterRule(_localctx, 16, RULE_ifElse);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(139); match(T__20);
			setState(140); match(T__18);
			setState(141); expression(0);
			setState(142); match(T__2);
			setState(143); statement();
			setState(144); match(T__3);
			setState(145); statement();
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
		enterRule(_localctx, 18, RULE_whileLoop);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(147); match(T__28);
			setState(148); match(T__18);
			setState(149); expression(0);
			setState(150); match(T__2);
			setState(151); statement();
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
		enterRule(_localctx, 20, RULE_print);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(153); match(T__11);
			setState(154); match(T__18);
			setState(155); expression(0);
			setState(156); match(T__2);
			setState(157); match(T__27);
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

	public static class AssignContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(avscParser.IDENTIFIER, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public AssignContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assign; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof avscListener ) ((avscListener)listener).enterAssign(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof avscListener ) ((avscListener)listener).exitAssign(this);
		}
	}

	public final AssignContext assign() throws RecognitionException {
		AssignContext _localctx = new AssignContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_assign);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(159); match(IDENTIFIER);
			setState(160); match(T__23);
			setState(161); expression(0);
			setState(162); match(T__27);
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

	public static class ArrayAssignContext extends ParserRuleContext {
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode IDENTIFIER() { return getToken(avscParser.IDENTIFIER, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ArrayAssignContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arrayAssign; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof avscListener ) ((avscListener)listener).enterArrayAssign(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof avscListener ) ((avscListener)listener).exitArrayAssign(this);
		}
	}

	public final ArrayAssignContext arrayAssign() throws RecognitionException {
		ArrayAssignContext _localctx = new ArrayAssignContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_arrayAssign);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(164); match(IDENTIFIER);
			setState(165); match(T__10);
			setState(166); expression(0);
			setState(167); match(T__7);
			setState(168); match(T__23);
			setState(169); expression(0);
			setState(170); match(T__27);
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
		int _startState = 26;
		enterRecursionRule(_localctx, 26, RULE_expression, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(194);
			switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
			case 1:
				{
				setState(173); match(T__5);
				setState(174); expression(10);
				}
				break;
			case 2:
				{
				setState(175); match(T__31);
				}
				break;
			case 3:
				{
				setState(176); match(T__13);
				}
				break;
			case 4:
				{
				setState(177); match(T__16);
				}
				break;
			case 5:
				{
				setState(178); match(T__18);
				setState(179); expression(0);
				setState(180); match(T__2);
				}
				break;
			case 6:
				{
				setState(182); match(IDENTIFIER);
				}
				break;
			case 7:
				{
				setState(183); match(INTEGER_LITERAL);
				}
				break;
			case 8:
				{
				setState(184); match(T__32);
				setState(185); match(T__19);
				setState(186); match(T__10);
				setState(187); expression(0);
				setState(188); match(T__7);
				}
				break;
			case 9:
				{
				setState(190); match(T__32);
				setState(191); match(IDENTIFIER);
				setState(192); match(T__18);
				setState(193); match(T__2);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(224);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,15,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(222);
					switch ( getInterpreter().adaptivePredict(_input,14,_ctx) ) {
					case 1:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(196);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(197);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__24) | (1L << T__17) | (1L << T__9) | (1L << T__1) | (1L << T__0))) != 0)) ) {
						_errHandler.recoverInline(this);
						}
						consume();
						setState(198); expression(7);
						}
						break;
					case 2:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(199);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(200); match(T__10);
						setState(201); expression(0);
						setState(202); match(T__7);
						}
						break;
					case 3:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(204);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(205); match(T__14);
						setState(206); match(T__33);
						}
						break;
					case 4:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(207);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(208); match(T__14);
						setState(209); match(IDENTIFIER);
						setState(210); match(T__18);
						setState(219);
						_la = _input.LA(1);
						if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__32) | (1L << T__31) | (1L << T__18) | (1L << T__16) | (1L << T__13) | (1L << T__5) | (1L << IDENTIFIER) | (1L << INTEGER_LITERAL))) != 0)) {
							{
							setState(211); expression(0);
							setState(216);
							_errHandler.sync(this);
							_la = _input.LA(1);
							while (_la==T__15) {
								{
								{
								setState(212); match(T__15);
								setState(213); expression(0);
								}
								}
								setState(218);
								_errHandler.sync(this);
								_la = _input.LA(1);
							}
							}
						}

						setState(221); match(T__2);
						}
						break;
					}
					} 
				}
				setState(226);
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
		case 13: return expression_sempred((ExpressionContext)_localctx, predIndex);
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
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3*\u00e6\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\3\2\3\2\7\2!\n\2\f\2\16\2$\13"+
		"\2\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3"+
		"\3\3\3\4\3\4\3\4\3\4\5\4<\n\4\3\4\3\4\7\4@\n\4\f\4\16\4C\13\4\3\4\7\4"+
		"F\n\4\f\4\16\4I\13\4\3\4\3\4\3\5\3\5\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3\6\3"+
		"\6\3\6\3\6\3\6\7\6[\n\6\f\6\16\6^\13\6\5\6`\n\6\3\6\3\6\3\6\7\6e\n\6\f"+
		"\6\16\6h\13\6\3\6\7\6k\n\6\f\6\16\6n\13\6\3\6\3\6\3\6\3\6\3\6\3\7\3\7"+
		"\3\7\3\7\3\7\3\7\5\7{\n\7\3\b\3\b\3\b\3\b\3\b\3\b\5\b\u0083\n\b\3\t\3"+
		"\t\7\t\u0087\n\t\f\t\16\t\u008a\13\t\3\t\3\t\3\n\3\n\3\n\3\n\3\n\3\n\3"+
		"\n\3\n\3\13\3\13\3\13\3\13\3\13\3\13\3\f\3\f\3\f\3\f\3\f\3\f\3\r\3\r\3"+
		"\r\3\r\3\r\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\17\3\17\3\17\3\17"+
		"\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17"+
		"\3\17\3\17\3\17\3\17\5\17\u00c5\n\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17"+
		"\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\7\17\u00d9\n\17"+
		"\f\17\16\17\u00dc\13\17\5\17\u00de\n\17\3\17\7\17\u00e1\n\17\f\17\16\17"+
		"\u00e4\13\17\3\17\2\3\34\20\2\4\6\b\n\f\16\20\22\24\26\30\32\34\2\3\6"+
		"\2\r\r\24\24\34\34$%\u00f6\2\36\3\2\2\2\4%\3\2\2\2\6\67\3\2\2\2\bL\3\2"+
		"\2\2\nP\3\2\2\2\fz\3\2\2\2\16\u0082\3\2\2\2\20\u0084\3\2\2\2\22\u008d"+
		"\3\2\2\2\24\u0095\3\2\2\2\26\u009b\3\2\2\2\30\u00a1\3\2\2\2\32\u00a6\3"+
		"\2\2\2\34\u00c4\3\2\2\2\36\"\5\4\3\2\37!\5\6\4\2 \37\3\2\2\2!$\3\2\2\2"+
		"\" \3\2\2\2\"#\3\2\2\2#\3\3\2\2\2$\"\3\2\2\2%&\7\b\2\2&\'\7&\2\2\'(\7"+
		"\f\2\2()\7\37\2\2)*\7!\2\2*+\7\13\2\2+,\7\3\2\2,-\7\23\2\2-.\7\35\2\2"+
		"./\7\33\2\2/\60\7\36\2\2\60\61\7&\2\2\61\62\7#\2\2\62\63\7\f\2\2\63\64"+
		"\5\16\b\2\64\65\7\20\2\2\65\66\7\20\2\2\66\5\3\2\2\2\678\7\b\2\28;\7&"+
		"\2\29:\7\17\2\2:<\7&\2\2;9\3\2\2\2;<\3\2\2\2<=\3\2\2\2=A\7\f\2\2>@\5\b"+
		"\5\2?>\3\2\2\2@C\3\2\2\2A?\3\2\2\2AB\3\2\2\2BG\3\2\2\2CA\3\2\2\2DF\5\n"+
		"\6\2ED\3\2\2\2FI\3\2\2\2GE\3\2\2\2GH\3\2\2\2HJ\3\2\2\2IG\3\2\2\2JK\7\20"+
		"\2\2K\7\3\2\2\2LM\5\f\7\2MN\7&\2\2NO\7\n\2\2O\t\3\2\2\2PQ\7\37\2\2QR\5"+
		"\f\7\2RS\7&\2\2S_\7\23\2\2TU\5\f\7\2U\\\7&\2\2VW\7\26\2\2WX\5\f\7\2XY"+
		"\7&\2\2Y[\3\2\2\2ZV\3\2\2\2[^\3\2\2\2\\Z\3\2\2\2\\]\3\2\2\2]`\3\2\2\2"+
		"^\\\3\2\2\2_T\3\2\2\2_`\3\2\2\2`a\3\2\2\2ab\7#\2\2bf\7\f\2\2ce\5\b\5\2"+
		"dc\3\2\2\2eh\3\2\2\2fd\3\2\2\2fg\3\2\2\2gl\3\2\2\2hf\3\2\2\2ik\5\16\b"+
		"\2ji\3\2\2\2kn\3\2\2\2lj\3\2\2\2lm\3\2\2\2mo\3\2\2\2nl\3\2\2\2op\7\7\2"+
		"\2pq\5\34\17\2qr\7\n\2\2rs\7\20\2\2s\13\3\2\2\2tu\7\22\2\2uv\7\33\2\2"+
		"v{\7\36\2\2w{\7\31\2\2x{\7\22\2\2y{\7&\2\2zt\3\2\2\2zw\3\2\2\2zx\3\2\2"+
		"\2zy\3\2\2\2{\r\3\2\2\2|\u0083\5\20\t\2}\u0083\5\22\n\2~\u0083\5\24\13"+
		"\2\177\u0083\5\26\f\2\u0080\u0083\5\30\r\2\u0081\u0083\5\32\16\2\u0082"+
		"|\3\2\2\2\u0082}\3\2\2\2\u0082~\3\2\2\2\u0082\177\3\2\2\2\u0082\u0080"+
		"\3\2\2\2\u0082\u0081\3\2\2\2\u0083\17\3\2\2\2\u0084\u0088\7\f\2\2\u0085"+
		"\u0087\5\16\b\2\u0086\u0085\3\2\2\2\u0087\u008a\3\2\2\2\u0088\u0086\3"+
		"\2\2\2\u0088\u0089\3\2\2\2\u0089\u008b\3\2\2\2\u008a\u0088\3\2\2\2\u008b"+
		"\u008c\7\20\2\2\u008c\21\3\2\2\2\u008d\u008e\7\21\2\2\u008e\u008f\7\23"+
		"\2\2\u008f\u0090\5\34\17\2\u0090\u0091\7#\2\2\u0091\u0092\5\16\b\2\u0092"+
		"\u0093\7\"\2\2\u0093\u0094\5\16\b\2\u0094\23\3\2\2\2\u0095\u0096\7\t\2"+
		"\2\u0096\u0097\7\23\2\2\u0097\u0098\5\34\17\2\u0098\u0099\7#\2\2\u0099"+
		"\u009a\5\16\b\2\u009a\25\3\2\2\2\u009b\u009c\7\32\2\2\u009c\u009d\7\23"+
		"\2\2\u009d\u009e\5\34\17\2\u009e\u009f\7#\2\2\u009f\u00a0\7\n\2\2\u00a0"+
		"\27\3\2\2\2\u00a1\u00a2\7&\2\2\u00a2\u00a3\7\16\2\2\u00a3\u00a4\5\34\17"+
		"\2\u00a4\u00a5\7\n\2\2\u00a5\31\3\2\2\2\u00a6\u00a7\7&\2\2\u00a7\u00a8"+
		"\7\33\2\2\u00a8\u00a9\5\34\17\2\u00a9\u00aa\7\36\2\2\u00aa\u00ab\7\16"+
		"\2\2\u00ab\u00ac\5\34\17\2\u00ac\u00ad\7\n\2\2\u00ad\33\3\2\2\2\u00ae"+
		"\u00af\b\17\1\2\u00af\u00b0\7 \2\2\u00b0\u00c5\5\34\17\f\u00b1\u00c5\7"+
		"\6\2\2\u00b2\u00c5\7\30\2\2\u00b3\u00c5\7\25\2\2\u00b4\u00b5\7\23\2\2"+
		"\u00b5\u00b6\5\34\17\2\u00b6\u00b7\7#\2\2\u00b7\u00c5\3\2\2\2\u00b8\u00c5"+
		"\7&\2\2\u00b9\u00c5\7\'\2\2\u00ba\u00bb\7\5\2\2\u00bb\u00bc\7\22\2\2\u00bc"+
		"\u00bd\7\33\2\2\u00bd\u00be\5\34\17\2\u00be\u00bf\7\36\2\2\u00bf\u00c5"+
		"\3\2\2\2\u00c0\u00c1\7\5\2\2\u00c1\u00c2\7&\2\2\u00c2\u00c3\7\23\2\2\u00c3"+
		"\u00c5\7#\2\2\u00c4\u00ae\3\2\2\2\u00c4\u00b1\3\2\2\2\u00c4\u00b2\3\2"+
		"\2\2\u00c4\u00b3\3\2\2\2\u00c4\u00b4\3\2\2\2\u00c4\u00b8\3\2\2\2\u00c4"+
		"\u00b9\3\2\2\2\u00c4\u00ba\3\2\2\2\u00c4\u00c0\3\2\2\2\u00c5\u00e2\3\2"+
		"\2\2\u00c6\u00c7\f\b\2\2\u00c7\u00c8\t\2\2\2\u00c8\u00e1\5\34\17\t\u00c9"+
		"\u00ca\f\7\2\2\u00ca\u00cb\7\33\2\2\u00cb\u00cc\5\34\17\2\u00cc\u00cd"+
		"\7\36\2\2\u00cd\u00e1\3\2\2\2\u00ce\u00cf\f\5\2\2\u00cf\u00d0\7\27\2\2"+
		"\u00d0\u00e1\7\4\2\2\u00d1\u00d2\f\3\2\2\u00d2\u00d3\7\27\2\2\u00d3\u00d4"+
		"\7&\2\2\u00d4\u00dd\7\23\2\2\u00d5\u00da\5\34\17\2\u00d6\u00d7\7\26\2"+
		"\2\u00d7\u00d9\5\34\17\2\u00d8\u00d6\3\2\2\2\u00d9\u00dc\3\2\2\2\u00da"+
		"\u00d8\3\2\2\2\u00da\u00db\3\2\2\2\u00db\u00de\3\2\2\2\u00dc\u00da\3\2"+
		"\2\2\u00dd\u00d5\3\2\2\2\u00dd\u00de\3\2\2\2\u00de\u00df\3\2\2\2\u00df"+
		"\u00e1\7#\2\2\u00e0\u00c6\3\2\2\2\u00e0\u00c9\3\2\2\2\u00e0\u00ce\3\2"+
		"\2\2\u00e0\u00d1\3\2\2\2\u00e1\u00e4\3\2\2\2\u00e2\u00e0\3\2\2\2\u00e2"+
		"\u00e3\3\2\2\2\u00e3\35\3\2\2\2\u00e4\u00e2\3\2\2\2\22\";AG\\_flz\u0082"+
		"\u0088\u00c4\u00da\u00dd\u00e0\u00e2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}