// Generated from C:/Users/jeffc/Desktop/CMPILER-Machine-Project/src/antlr\Clyps.g4 by ANTLR 4.9.1
package antlr;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class ClypsParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.9.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, BOOLEAN=11, BREAK=12, BYTE=13, CHAR=14, CLASS=15, CONST=16, DO=17, 
		DOUBLE=18, ELSE=19, FINAL=20, FLOAT=21, FOR=22, IF=23, INT=24, LONG=25, 
		NEW=26, PRINT=27, RETURN=28, SCAN=29, SHORT=30, VOID=31, WHILE=32, ArrayNum=33, 
		IntegerLiteral=34, FloatingPointLiteral=35, BooleanLiteral=36, CharacterLiteral=37, 
		StringLiteral=38, NullLiteral=39, LPAREN=40, RPAREN=41, LBRACE=42, RBRACE=43, 
		LBRACK=44, RBRACK=45, SEMI=46, COMMA=47, DOT=48, ASSIGN=49, GT=50, LT=51, 
		BANG=52, TILDE=53, QUESTION=54, COLON=55, EQUAL=56, LE=57, GE=58, NOTEQUAL=59, 
		AND=60, OR=61, INC=62, DEC=63, ADD=64, SUB=65, MUL=66, DIV=67, BITAND=68, 
		BITOR=69, CARET=70, MOD=71, ARROW=72, COLONCOLON=73, ADD_ASSIGN=74, SUB_ASSIGN=75, 
		MUL_ASSIGN=76, DIV_ASSIGN=77, AND_ASSIGN=78, OR_ASSIGN=79, XOR_ASSIGN=80, 
		MOD_ASSIGN=81, LSHIFT_ASSIGN=82, RSHIFT_ASSIGN=83, URSHIFT_ASSIGN=84, 
		Identifier=85, AT=86, ELLIPSIS=87, WS=88, COMMENT=89, LINE_COMMENT=90, 
		ErrorCharacter=91;
	public static final int
		RULE_literal = 0, RULE_primitiveType = 1, RULE_numericType = 2, RULE_integralType = 3, 
		RULE_floatingPointType = 4, RULE_referenceType = 5, RULE_typeVariable = 6, 
		RULE_arrayType = 7, RULE_dims = 8, RULE_expressionName = 9, RULE_methodName = 10, 
		RULE_normalClassDeclaration = 11, RULE_classBody = 12, RULE_classBodyDeclaration = 13, 
		RULE_classMemberDeclaration = 14, RULE_mainDeclaration = 15, RULE_variableDeclaratorList = 16, 
		RULE_variableDeclarator = 17, RULE_variableDeclaratorId = 18, RULE_variableInitializer = 19, 
		RULE_unannType = 20, RULE_unannPrimitiveType = 21, RULE_unannTypeVariable = 22, 
		RULE_unannArrayType = 23, RULE_methodDeclaration = 24, RULE_methodHeader = 25, 
		RULE_result = 26, RULE_methodDeclarator = 27, RULE_formalParameterList = 28, 
		RULE_formalParameters = 29, RULE_formalParameter = 30, RULE_variableModifier = 31, 
		RULE_lastFormalParameter = 32, RULE_receiverParameter = 33, RULE_methodBody = 34, 
		RULE_arrayInitializer = 35, RULE_variableInitializerList = 36, RULE_block = 37, 
		RULE_blockStatements = 38, RULE_blockStatement = 39, RULE_variableDeclarationStatement = 40, 
		RULE_localVariableDeclarationStatement = 41, RULE_localVariableDeclaration = 42, 
		RULE_statement = 43, RULE_printStatement = 44, RULE_printBlock = 45, RULE_printExtra = 46, 
		RULE_scanStatement = 47, RULE_scanBlock = 48, RULE_scanExtra = 49, RULE_statementWithoutTrailingSubstatement = 50, 
		RULE_statementExpression = 51, RULE_ifThenStatement = 52, RULE_ifThenElseStatement = 53, 
		RULE_whileStatement = 54, RULE_doStatement = 55, RULE_forStatement = 56, 
		RULE_forInit = 57, RULE_forUpdate = 58, RULE_statementExpressionList = 59, 
		RULE_returnStatement = 60, RULE_primary = 61, RULE_primaryNoNewArray_lfno_arrayAccess = 62, 
		RULE_primaryNoNewArray_lfno_primary = 63, RULE_primaryNoNewArray_lfno_primary_lfno_arrayAccess_lfno_primary = 64, 
		RULE_arrayAccess = 65, RULE_arrayAccess_lfno_primary = 66, RULE_methodInvocation = 67, 
		RULE_argumentList = 68, RULE_arrayCreationExpression = 69, RULE_dimExprs = 70, 
		RULE_dimExpr = 71, RULE_expression = 72, RULE_assignmentExpression = 73, 
		RULE_assignment = 74, RULE_leftHandSide = 75, RULE_assignmentOperator = 76, 
		RULE_expr = 77, RULE_conditionalExpression = 78, RULE_conditionalOrExpression = 79, 
		RULE_conditionalAndExpression = 80, RULE_inclusiveOrExpression = 81, RULE_exclusiveOrExpression = 82, 
		RULE_andExpression = 83, RULE_equalityExpression = 84, RULE_relationalExpression = 85, 
		RULE_shiftExpression = 86, RULE_additiveExpression = 87, RULE_multiplicativeExpression = 88, 
		RULE_unaryExpression = 89, RULE_unaryExpressionNotPlusMinus = 90, RULE_postfixExpression = 91, 
		RULE_postIncrementExpression = 92, RULE_postDecrementExpression = 93;
	private static String[] makeRuleNames() {
		return new String[] {
			"literal", "primitiveType", "numericType", "integralType", "floatingPointType", 
			"referenceType", "typeVariable", "arrayType", "dims", "expressionName", 
			"methodName", "normalClassDeclaration", "classBody", "classBodyDeclaration", 
			"classMemberDeclaration", "mainDeclaration", "variableDeclaratorList", 
			"variableDeclarator", "variableDeclaratorId", "variableInitializer", 
			"unannType", "unannPrimitiveType", "unannTypeVariable", "unannArrayType", 
			"methodDeclaration", "methodHeader", "result", "methodDeclarator", "formalParameterList", 
			"formalParameters", "formalParameter", "variableModifier", "lastFormalParameter", 
			"receiverParameter", "methodBody", "arrayInitializer", "variableInitializerList", 
			"block", "blockStatements", "blockStatement", "variableDeclarationStatement", 
			"localVariableDeclarationStatement", "localVariableDeclaration", "statement", 
			"printStatement", "printBlock", "printExtra", "scanStatement", "scanBlock", 
			"scanExtra", "statementWithoutTrailingSubstatement", "statementExpression", 
			"ifThenStatement", "ifThenElseStatement", "whileStatement", "doStatement", 
			"forStatement", "forInit", "forUpdate", "statementExpressionList", "returnStatement", 
			"primary", "primaryNoNewArray_lfno_arrayAccess", "primaryNoNewArray_lfno_primary", 
			"primaryNoNewArray_lfno_primary_lfno_arrayAccess_lfno_primary", "arrayAccess", 
			"arrayAccess_lfno_primary", "methodInvocation", "argumentList", "arrayCreationExpression", 
			"dimExprs", "dimExpr", "expression", "assignmentExpression", "assignment", 
			"leftHandSide", "assignmentOperator", "expr", "conditionalExpression", 
			"conditionalOrExpression", "conditionalAndExpression", "inclusiveOrExpression", 
			"exclusiveOrExpression", "andExpression", "equalityExpression", "relationalExpression", 
			"shiftExpression", "additiveExpression", "multiplicativeExpression", 
			"unaryExpression", "unaryExpressionNotPlusMinus", "postfixExpression", 
			"postIncrementExpression", "postDecrementExpression"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'main'", "'String'", "'this'", "'#'", "'$'", "'up to'", "'down to'", 
			"'**'", "'//'", "'%%'", "'boolean'", "'break'", "'byte'", "'char'", "'class'", 
			"'const'", "'do'", "'double'", "'else'", "'final'", "'float'", "'for'", 
			"'if'", "'int'", "'long'", "'new'", "'print'", "'return'", "'scan'", 
			"'short'", "'void'", "'while'", null, null, null, null, null, null, "'null'", 
			"'('", "')'", "'{'", "'}'", "'['", "']'", "';'", "','", "'.'", "'='", 
			"'>'", "'<'", "'!'", "'~'", "'?'", "':'", "'=='", "'<='", "'>='", "'!='", 
			"'&&'", "'||'", "'++'", "'--'", "'+'", "'-'", "'*'", "'/'", "'&'", "'|'", 
			"'^'", "'%'", "'->'", "'::'", "'+='", "'-='", "'*='", "'/='", "'&='", 
			"'|='", "'^='", "'%='", "'<<='", "'>>='", "'>>>='", null, "'@'", "'...'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, "BOOLEAN", 
			"BREAK", "BYTE", "CHAR", "CLASS", "CONST", "DO", "DOUBLE", "ELSE", "FINAL", 
			"FLOAT", "FOR", "IF", "INT", "LONG", "NEW", "PRINT", "RETURN", "SCAN", 
			"SHORT", "VOID", "WHILE", "ArrayNum", "IntegerLiteral", "FloatingPointLiteral", 
			"BooleanLiteral", "CharacterLiteral", "StringLiteral", "NullLiteral", 
			"LPAREN", "RPAREN", "LBRACE", "RBRACE", "LBRACK", "RBRACK", "SEMI", "COMMA", 
			"DOT", "ASSIGN", "GT", "LT", "BANG", "TILDE", "QUESTION", "COLON", "EQUAL", 
			"LE", "GE", "NOTEQUAL", "AND", "OR", "INC", "DEC", "ADD", "SUB", "MUL", 
			"DIV", "BITAND", "BITOR", "CARET", "MOD", "ARROW", "COLONCOLON", "ADD_ASSIGN", 
			"SUB_ASSIGN", "MUL_ASSIGN", "DIV_ASSIGN", "AND_ASSIGN", "OR_ASSIGN", 
			"XOR_ASSIGN", "MOD_ASSIGN", "LSHIFT_ASSIGN", "RSHIFT_ASSIGN", "URSHIFT_ASSIGN", 
			"Identifier", "AT", "ELLIPSIS", "WS", "COMMENT", "LINE_COMMENT", "ErrorCharacter"
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
	public String getGrammarFileName() { return "Clyps.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public ClypsParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class LiteralContext extends ParserRuleContext {
		public TerminalNode IntegerLiteral() { return getToken(ClypsParser.IntegerLiteral, 0); }
		public TerminalNode FloatingPointLiteral() { return getToken(ClypsParser.FloatingPointLiteral, 0); }
		public TerminalNode BooleanLiteral() { return getToken(ClypsParser.BooleanLiteral, 0); }
		public TerminalNode CharacterLiteral() { return getToken(ClypsParser.CharacterLiteral, 0); }
		public TerminalNode StringLiteral() { return getToken(ClypsParser.StringLiteral, 0); }
		public TerminalNode NullLiteral() { return getToken(ClypsParser.NullLiteral, 0); }
		public LiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_literal; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ClypsListener ) ((ClypsListener)listener).enterLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ClypsListener ) ((ClypsListener)listener).exitLiteral(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ClypsVisitor ) return ((ClypsVisitor<? extends T>)visitor).visitLiteral(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LiteralContext literal() throws RecognitionException {
		LiteralContext _localctx = new LiteralContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_literal);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(188);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << IntegerLiteral) | (1L << FloatingPointLiteral) | (1L << BooleanLiteral) | (1L << CharacterLiteral) | (1L << StringLiteral) | (1L << NullLiteral))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
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

	public static class PrimitiveTypeContext extends ParserRuleContext {
		public NumericTypeContext numericType() {
			return getRuleContext(NumericTypeContext.class,0);
		}
		public TerminalNode BOOLEAN() { return getToken(ClypsParser.BOOLEAN, 0); }
		public PrimitiveTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_primitiveType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ClypsListener ) ((ClypsListener)listener).enterPrimitiveType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ClypsListener ) ((ClypsListener)listener).exitPrimitiveType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ClypsVisitor ) return ((ClypsVisitor<? extends T>)visitor).visitPrimitiveType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PrimitiveTypeContext primitiveType() throws RecognitionException {
		PrimitiveTypeContext _localctx = new PrimitiveTypeContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_primitiveType);
		try {
			setState(192);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case BYTE:
			case CHAR:
			case DOUBLE:
			case FLOAT:
			case INT:
			case LONG:
			case SHORT:
				enterOuterAlt(_localctx, 1);
				{
				setState(190);
				numericType();
				}
				break;
			case BOOLEAN:
				enterOuterAlt(_localctx, 2);
				{
				setState(191);
				match(BOOLEAN);
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

	public static class NumericTypeContext extends ParserRuleContext {
		public IntegralTypeContext integralType() {
			return getRuleContext(IntegralTypeContext.class,0);
		}
		public FloatingPointTypeContext floatingPointType() {
			return getRuleContext(FloatingPointTypeContext.class,0);
		}
		public NumericTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_numericType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ClypsListener ) ((ClypsListener)listener).enterNumericType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ClypsListener ) ((ClypsListener)listener).exitNumericType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ClypsVisitor ) return ((ClypsVisitor<? extends T>)visitor).visitNumericType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NumericTypeContext numericType() throws RecognitionException {
		NumericTypeContext _localctx = new NumericTypeContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_numericType);
		try {
			setState(196);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case BYTE:
			case CHAR:
			case INT:
			case LONG:
			case SHORT:
				enterOuterAlt(_localctx, 1);
				{
				setState(194);
				integralType();
				}
				break;
			case DOUBLE:
			case FLOAT:
				enterOuterAlt(_localctx, 2);
				{
				setState(195);
				floatingPointType();
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

	public static class IntegralTypeContext extends ParserRuleContext {
		public TerminalNode BYTE() { return getToken(ClypsParser.BYTE, 0); }
		public TerminalNode SHORT() { return getToken(ClypsParser.SHORT, 0); }
		public TerminalNode INT() { return getToken(ClypsParser.INT, 0); }
		public TerminalNode LONG() { return getToken(ClypsParser.LONG, 0); }
		public TerminalNode CHAR() { return getToken(ClypsParser.CHAR, 0); }
		public IntegralTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_integralType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ClypsListener ) ((ClypsListener)listener).enterIntegralType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ClypsListener ) ((ClypsListener)listener).exitIntegralType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ClypsVisitor ) return ((ClypsVisitor<? extends T>)visitor).visitIntegralType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IntegralTypeContext integralType() throws RecognitionException {
		IntegralTypeContext _localctx = new IntegralTypeContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_integralType);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(198);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BYTE) | (1L << CHAR) | (1L << INT) | (1L << LONG) | (1L << SHORT))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
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

	public static class FloatingPointTypeContext extends ParserRuleContext {
		public TerminalNode FLOAT() { return getToken(ClypsParser.FLOAT, 0); }
		public TerminalNode DOUBLE() { return getToken(ClypsParser.DOUBLE, 0); }
		public FloatingPointTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_floatingPointType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ClypsListener ) ((ClypsListener)listener).enterFloatingPointType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ClypsListener ) ((ClypsListener)listener).exitFloatingPointType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ClypsVisitor ) return ((ClypsVisitor<? extends T>)visitor).visitFloatingPointType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FloatingPointTypeContext floatingPointType() throws RecognitionException {
		FloatingPointTypeContext _localctx = new FloatingPointTypeContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_floatingPointType);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(200);
			_la = _input.LA(1);
			if ( !(_la==DOUBLE || _la==FLOAT) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
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

	public static class ReferenceTypeContext extends ParserRuleContext {
		public TypeVariableContext typeVariable() {
			return getRuleContext(TypeVariableContext.class,0);
		}
		public ArrayTypeContext arrayType() {
			return getRuleContext(ArrayTypeContext.class,0);
		}
		public ReferenceTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_referenceType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ClypsListener ) ((ClypsListener)listener).enterReferenceType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ClypsListener ) ((ClypsListener)listener).exitReferenceType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ClypsVisitor ) return ((ClypsVisitor<? extends T>)visitor).visitReferenceType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ReferenceTypeContext referenceType() throws RecognitionException {
		ReferenceTypeContext _localctx = new ReferenceTypeContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_referenceType);
		try {
			setState(204);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(202);
				typeVariable();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(203);
				arrayType();
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

	public static class TypeVariableContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(ClypsParser.Identifier, 0); }
		public TypeVariableContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeVariable; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ClypsListener ) ((ClypsListener)listener).enterTypeVariable(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ClypsListener ) ((ClypsListener)listener).exitTypeVariable(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ClypsVisitor ) return ((ClypsVisitor<? extends T>)visitor).visitTypeVariable(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeVariableContext typeVariable() throws RecognitionException {
		TypeVariableContext _localctx = new TypeVariableContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_typeVariable);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(206);
			match(Identifier);
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

	public static class ArrayTypeContext extends ParserRuleContext {
		public PrimitiveTypeContext primitiveType() {
			return getRuleContext(PrimitiveTypeContext.class,0);
		}
		public DimsContext dims() {
			return getRuleContext(DimsContext.class,0);
		}
		public TypeVariableContext typeVariable() {
			return getRuleContext(TypeVariableContext.class,0);
		}
		public ArrayTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arrayType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ClypsListener ) ((ClypsListener)listener).enterArrayType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ClypsListener ) ((ClypsListener)listener).exitArrayType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ClypsVisitor ) return ((ClypsVisitor<? extends T>)visitor).visitArrayType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArrayTypeContext arrayType() throws RecognitionException {
		ArrayTypeContext _localctx = new ArrayTypeContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_arrayType);
		try {
			setState(214);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case BOOLEAN:
			case BYTE:
			case CHAR:
			case DOUBLE:
			case FLOAT:
			case INT:
			case LONG:
			case SHORT:
				enterOuterAlt(_localctx, 1);
				{
				setState(208);
				primitiveType();
				setState(209);
				dims();
				}
				break;
			case Identifier:
				enterOuterAlt(_localctx, 2);
				{
				setState(211);
				typeVariable();
				setState(212);
				dims();
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

	public static class DimsContext extends ParserRuleContext {
		public List<TerminalNode> LBRACK() { return getTokens(ClypsParser.LBRACK); }
		public TerminalNode LBRACK(int i) {
			return getToken(ClypsParser.LBRACK, i);
		}
		public List<TerminalNode> RBRACK() { return getTokens(ClypsParser.RBRACK); }
		public TerminalNode RBRACK(int i) {
			return getToken(ClypsParser.RBRACK, i);
		}
		public DimsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dims; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ClypsListener ) ((ClypsListener)listener).enterDims(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ClypsListener ) ((ClypsListener)listener).exitDims(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ClypsVisitor ) return ((ClypsVisitor<? extends T>)visitor).visitDims(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DimsContext dims() throws RecognitionException {
		DimsContext _localctx = new DimsContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_dims);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(216);
			match(LBRACK);
			setState(217);
			match(RBRACK);
			setState(222);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==LBRACK) {
				{
				{
				setState(218);
				match(LBRACK);
				setState(219);
				match(RBRACK);
				}
				}
				setState(224);
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

	public static class ExpressionNameContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(ClypsParser.Identifier, 0); }
		public ExpressionNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expressionName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ClypsListener ) ((ClypsListener)listener).enterExpressionName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ClypsListener ) ((ClypsListener)listener).exitExpressionName(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ClypsVisitor ) return ((ClypsVisitor<? extends T>)visitor).visitExpressionName(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpressionNameContext expressionName() throws RecognitionException {
		ExpressionNameContext _localctx = new ExpressionNameContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_expressionName);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(225);
			match(Identifier);
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

	public static class MethodNameContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(ClypsParser.Identifier, 0); }
		public MethodNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_methodName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ClypsListener ) ((ClypsListener)listener).enterMethodName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ClypsListener ) ((ClypsListener)listener).exitMethodName(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ClypsVisitor ) return ((ClypsVisitor<? extends T>)visitor).visitMethodName(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MethodNameContext methodName() throws RecognitionException {
		MethodNameContext _localctx = new MethodNameContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_methodName);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(227);
			match(Identifier);
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

	public static class NormalClassDeclarationContext extends ParserRuleContext {
		public TerminalNode CLASS() { return getToken(ClypsParser.CLASS, 0); }
		public TerminalNode Identifier() { return getToken(ClypsParser.Identifier, 0); }
		public ClassBodyContext classBody() {
			return getRuleContext(ClassBodyContext.class,0);
		}
		public NormalClassDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_normalClassDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ClypsListener ) ((ClypsListener)listener).enterNormalClassDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ClypsListener ) ((ClypsListener)listener).exitNormalClassDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ClypsVisitor ) return ((ClypsVisitor<? extends T>)visitor).visitNormalClassDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NormalClassDeclarationContext normalClassDeclaration() throws RecognitionException {
		NormalClassDeclarationContext _localctx = new NormalClassDeclarationContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_normalClassDeclaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(229);
			match(CLASS);
			setState(230);
			match(Identifier);
			setState(231);
			classBody();
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

	public static class ClassBodyContext extends ParserRuleContext {
		public TerminalNode LBRACE() { return getToken(ClypsParser.LBRACE, 0); }
		public TerminalNode RBRACE() { return getToken(ClypsParser.RBRACE, 0); }
		public ClassBodyDeclarationContext classBodyDeclaration() {
			return getRuleContext(ClassBodyDeclarationContext.class,0);
		}
		public ClassBodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_classBody; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ClypsListener ) ((ClypsListener)listener).enterClassBody(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ClypsListener ) ((ClypsListener)listener).exitClassBody(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ClypsVisitor ) return ((ClypsVisitor<? extends T>)visitor).visitClassBody(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ClassBodyContext classBody() throws RecognitionException {
		ClassBodyContext _localctx = new ClassBodyContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_classBody);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(233);
			match(LBRACE);
			setState(235);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
			case 1:
				{
				setState(234);
				classBodyDeclaration();
				}
				break;
			}
			setState(237);
			match(RBRACE);
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

	public static class ClassBodyDeclarationContext extends ParserRuleContext {
		public List<ClassMemberDeclarationContext> classMemberDeclaration() {
			return getRuleContexts(ClassMemberDeclarationContext.class);
		}
		public ClassMemberDeclarationContext classMemberDeclaration(int i) {
			return getRuleContext(ClassMemberDeclarationContext.class,i);
		}
		public ClassBodyDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_classBodyDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ClypsListener ) ((ClypsListener)listener).enterClassBodyDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ClypsListener ) ((ClypsListener)listener).exitClassBodyDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ClypsVisitor ) return ((ClypsVisitor<? extends T>)visitor).visitClassBodyDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ClassBodyDeclarationContext classBodyDeclaration() throws RecognitionException {
		ClassBodyDeclarationContext _localctx = new ClassBodyDeclarationContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_classBodyDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(242);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__1) | (1L << BOOLEAN) | (1L << BYTE) | (1L << CHAR) | (1L << DOUBLE) | (1L << FLOAT) | (1L << INT) | (1L << LONG) | (1L << SHORT) | (1L << VOID))) != 0)) {
				{
				{
				setState(239);
				classMemberDeclaration();
				}
				}
				setState(244);
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

	public static class ClassMemberDeclarationContext extends ParserRuleContext {
		public MainDeclarationContext mainDeclaration() {
			return getRuleContext(MainDeclarationContext.class,0);
		}
		public MethodDeclarationContext methodDeclaration() {
			return getRuleContext(MethodDeclarationContext.class,0);
		}
		public ClassMemberDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_classMemberDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ClypsListener ) ((ClypsListener)listener).enterClassMemberDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ClypsListener ) ((ClypsListener)listener).exitClassMemberDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ClypsVisitor ) return ((ClypsVisitor<? extends T>)visitor).visitClassMemberDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ClassMemberDeclarationContext classMemberDeclaration() throws RecognitionException {
		ClassMemberDeclarationContext _localctx = new ClassMemberDeclarationContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_classMemberDeclaration);
		try {
			setState(247);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__0:
				enterOuterAlt(_localctx, 1);
				{
				setState(245);
				mainDeclaration();
				}
				break;
			case T__1:
			case BOOLEAN:
			case BYTE:
			case CHAR:
			case DOUBLE:
			case FLOAT:
			case INT:
			case LONG:
			case SHORT:
			case VOID:
				enterOuterAlt(_localctx, 2);
				{
				setState(246);
				methodDeclaration();
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

	public static class MainDeclarationContext extends ParserRuleContext {
		public TerminalNode LPAREN() { return getToken(ClypsParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(ClypsParser.RPAREN, 0); }
		public MethodBodyContext methodBody() {
			return getRuleContext(MethodBodyContext.class,0);
		}
		public MainDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_mainDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ClypsListener ) ((ClypsListener)listener).enterMainDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ClypsListener ) ((ClypsListener)listener).exitMainDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ClypsVisitor ) return ((ClypsVisitor<? extends T>)visitor).visitMainDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MainDeclarationContext mainDeclaration() throws RecognitionException {
		MainDeclarationContext _localctx = new MainDeclarationContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_mainDeclaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(249);
			match(T__0);
			setState(250);
			match(LPAREN);
			setState(251);
			match(RPAREN);
			setState(252);
			methodBody();
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

	public static class VariableDeclaratorListContext extends ParserRuleContext {
		public List<VariableDeclaratorContext> variableDeclarator() {
			return getRuleContexts(VariableDeclaratorContext.class);
		}
		public VariableDeclaratorContext variableDeclarator(int i) {
			return getRuleContext(VariableDeclaratorContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(ClypsParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(ClypsParser.COMMA, i);
		}
		public VariableDeclaratorListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variableDeclaratorList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ClypsListener ) ((ClypsListener)listener).enterVariableDeclaratorList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ClypsListener ) ((ClypsListener)listener).exitVariableDeclaratorList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ClypsVisitor ) return ((ClypsVisitor<? extends T>)visitor).visitVariableDeclaratorList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VariableDeclaratorListContext variableDeclaratorList() throws RecognitionException {
		VariableDeclaratorListContext _localctx = new VariableDeclaratorListContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_variableDeclaratorList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(254);
			variableDeclarator();
			setState(259);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(255);
				match(COMMA);
				setState(256);
				variableDeclarator();
				}
				}
				setState(261);
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

	public static class VariableDeclaratorContext extends ParserRuleContext {
		public VariableDeclaratorIdContext variableDeclaratorId() {
			return getRuleContext(VariableDeclaratorIdContext.class,0);
		}
		public TerminalNode ASSIGN() { return getToken(ClypsParser.ASSIGN, 0); }
		public VariableInitializerContext variableInitializer() {
			return getRuleContext(VariableInitializerContext.class,0);
		}
		public VariableDeclaratorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variableDeclarator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ClypsListener ) ((ClypsListener)listener).enterVariableDeclarator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ClypsListener ) ((ClypsListener)listener).exitVariableDeclarator(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ClypsVisitor ) return ((ClypsVisitor<? extends T>)visitor).visitVariableDeclarator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VariableDeclaratorContext variableDeclarator() throws RecognitionException {
		VariableDeclaratorContext _localctx = new VariableDeclaratorContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_variableDeclarator);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(262);
			variableDeclaratorId();
			setState(263);
			match(ASSIGN);
			setState(264);
			variableInitializer();
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

	public static class VariableDeclaratorIdContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(ClypsParser.Identifier, 0); }
		public DimsContext dims() {
			return getRuleContext(DimsContext.class,0);
		}
		public VariableDeclaratorIdContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variableDeclaratorId; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ClypsListener ) ((ClypsListener)listener).enterVariableDeclaratorId(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ClypsListener ) ((ClypsListener)listener).exitVariableDeclaratorId(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ClypsVisitor ) return ((ClypsVisitor<? extends T>)visitor).visitVariableDeclaratorId(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VariableDeclaratorIdContext variableDeclaratorId() throws RecognitionException {
		VariableDeclaratorIdContext _localctx = new VariableDeclaratorIdContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_variableDeclaratorId);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(266);
			match(Identifier);
			setState(268);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LBRACK) {
				{
				setState(267);
				dims();
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

	public static class VariableInitializerContext extends ParserRuleContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public ArrayInitializerContext arrayInitializer() {
			return getRuleContext(ArrayInitializerContext.class,0);
		}
		public VariableInitializerContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variableInitializer; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ClypsListener ) ((ClypsListener)listener).enterVariableInitializer(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ClypsListener ) ((ClypsListener)listener).exitVariableInitializer(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ClypsVisitor ) return ((ClypsVisitor<? extends T>)visitor).visitVariableInitializer(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VariableInitializerContext variableInitializer() throws RecognitionException {
		VariableInitializerContext _localctx = new VariableInitializerContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_variableInitializer);
		try {
			setState(276);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(270);
				expression();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(271);
				expression();
				setState(272);
				expression();
				notifyErrorListeners("Missing Operator");
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(275);
				arrayInitializer();
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

	public static class UnannTypeContext extends ParserRuleContext {
		public UnannPrimitiveTypeContext unannPrimitiveType() {
			return getRuleContext(UnannPrimitiveTypeContext.class,0);
		}
		public UnannTypeVariableContext unannTypeVariable() {
			return getRuleContext(UnannTypeVariableContext.class,0);
		}
		public UnannTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_unannType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ClypsListener ) ((ClypsListener)listener).enterUnannType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ClypsListener ) ((ClypsListener)listener).exitUnannType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ClypsVisitor ) return ((ClypsVisitor<? extends T>)visitor).visitUnannType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final UnannTypeContext unannType() throws RecognitionException {
		UnannTypeContext _localctx = new UnannTypeContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_unannType);
		try {
			setState(280);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case BOOLEAN:
			case BYTE:
			case CHAR:
			case DOUBLE:
			case FLOAT:
			case INT:
			case LONG:
			case SHORT:
				enterOuterAlt(_localctx, 1);
				{
				setState(278);
				unannPrimitiveType();
				}
				break;
			case T__1:
				enterOuterAlt(_localctx, 2);
				{
				setState(279);
				unannTypeVariable();
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

	public static class UnannPrimitiveTypeContext extends ParserRuleContext {
		public NumericTypeContext numericType() {
			return getRuleContext(NumericTypeContext.class,0);
		}
		public TerminalNode BOOLEAN() { return getToken(ClypsParser.BOOLEAN, 0); }
		public UnannPrimitiveTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_unannPrimitiveType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ClypsListener ) ((ClypsListener)listener).enterUnannPrimitiveType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ClypsListener ) ((ClypsListener)listener).exitUnannPrimitiveType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ClypsVisitor ) return ((ClypsVisitor<? extends T>)visitor).visitUnannPrimitiveType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final UnannPrimitiveTypeContext unannPrimitiveType() throws RecognitionException {
		UnannPrimitiveTypeContext _localctx = new UnannPrimitiveTypeContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_unannPrimitiveType);
		try {
			setState(284);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case BYTE:
			case CHAR:
			case DOUBLE:
			case FLOAT:
			case INT:
			case LONG:
			case SHORT:
				enterOuterAlt(_localctx, 1);
				{
				setState(282);
				numericType();
				}
				break;
			case BOOLEAN:
				enterOuterAlt(_localctx, 2);
				{
				setState(283);
				match(BOOLEAN);
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

	public static class UnannTypeVariableContext extends ParserRuleContext {
		public UnannTypeVariableContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_unannTypeVariable; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ClypsListener ) ((ClypsListener)listener).enterUnannTypeVariable(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ClypsListener ) ((ClypsListener)listener).exitUnannTypeVariable(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ClypsVisitor ) return ((ClypsVisitor<? extends T>)visitor).visitUnannTypeVariable(this);
			else return visitor.visitChildren(this);
		}
	}

	public final UnannTypeVariableContext unannTypeVariable() throws RecognitionException {
		UnannTypeVariableContext _localctx = new UnannTypeVariableContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_unannTypeVariable);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(286);
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

	public static class UnannArrayTypeContext extends ParserRuleContext {
		public UnannPrimitiveTypeContext unannPrimitiveType() {
			return getRuleContext(UnannPrimitiveTypeContext.class,0);
		}
		public DimsContext dims() {
			return getRuleContext(DimsContext.class,0);
		}
		public UnannTypeVariableContext unannTypeVariable() {
			return getRuleContext(UnannTypeVariableContext.class,0);
		}
		public UnannArrayTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_unannArrayType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ClypsListener ) ((ClypsListener)listener).enterUnannArrayType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ClypsListener ) ((ClypsListener)listener).exitUnannArrayType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ClypsVisitor ) return ((ClypsVisitor<? extends T>)visitor).visitUnannArrayType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final UnannArrayTypeContext unannArrayType() throws RecognitionException {
		UnannArrayTypeContext _localctx = new UnannArrayTypeContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_unannArrayType);
		try {
			setState(294);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case BOOLEAN:
			case BYTE:
			case CHAR:
			case DOUBLE:
			case FLOAT:
			case INT:
			case LONG:
			case SHORT:
				enterOuterAlt(_localctx, 1);
				{
				setState(288);
				unannPrimitiveType();
				setState(289);
				dims();
				}
				break;
			case T__1:
				enterOuterAlt(_localctx, 2);
				{
				setState(291);
				unannTypeVariable();
				setState(292);
				dims();
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

	public static class MethodDeclarationContext extends ParserRuleContext {
		public MethodHeaderContext methodHeader() {
			return getRuleContext(MethodHeaderContext.class,0);
		}
		public MethodBodyContext methodBody() {
			return getRuleContext(MethodBodyContext.class,0);
		}
		public MethodDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_methodDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ClypsListener ) ((ClypsListener)listener).enterMethodDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ClypsListener ) ((ClypsListener)listener).exitMethodDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ClypsVisitor ) return ((ClypsVisitor<? extends T>)visitor).visitMethodDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MethodDeclarationContext methodDeclaration() throws RecognitionException {
		MethodDeclarationContext _localctx = new MethodDeclarationContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_methodDeclaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(296);
			methodHeader();
			setState(297);
			methodBody();
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

	public static class MethodHeaderContext extends ParserRuleContext {
		public ResultContext result() {
			return getRuleContext(ResultContext.class,0);
		}
		public MethodDeclaratorContext methodDeclarator() {
			return getRuleContext(MethodDeclaratorContext.class,0);
		}
		public MethodHeaderContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_methodHeader; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ClypsListener ) ((ClypsListener)listener).enterMethodHeader(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ClypsListener ) ((ClypsListener)listener).exitMethodHeader(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ClypsVisitor ) return ((ClypsVisitor<? extends T>)visitor).visitMethodHeader(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MethodHeaderContext methodHeader() throws RecognitionException {
		MethodHeaderContext _localctx = new MethodHeaderContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_methodHeader);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(299);
			result();
			setState(300);
			methodDeclarator();
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

	public static class ResultContext extends ParserRuleContext {
		public UnannTypeContext unannType() {
			return getRuleContext(UnannTypeContext.class,0);
		}
		public TerminalNode VOID() { return getToken(ClypsParser.VOID, 0); }
		public ResultContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_result; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ClypsListener ) ((ClypsListener)listener).enterResult(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ClypsListener ) ((ClypsListener)listener).exitResult(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ClypsVisitor ) return ((ClypsVisitor<? extends T>)visitor).visitResult(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ResultContext result() throws RecognitionException {
		ResultContext _localctx = new ResultContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_result);
		try {
			setState(304);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__1:
			case BOOLEAN:
			case BYTE:
			case CHAR:
			case DOUBLE:
			case FLOAT:
			case INT:
			case LONG:
			case SHORT:
				enterOuterAlt(_localctx, 1);
				{
				setState(302);
				unannType();
				}
				break;
			case VOID:
				enterOuterAlt(_localctx, 2);
				{
				setState(303);
				match(VOID);
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

	public static class MethodDeclaratorContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(ClypsParser.Identifier, 0); }
		public TerminalNode LPAREN() { return getToken(ClypsParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(ClypsParser.RPAREN, 0); }
		public FormalParameterListContext formalParameterList() {
			return getRuleContext(FormalParameterListContext.class,0);
		}
		public DimsContext dims() {
			return getRuleContext(DimsContext.class,0);
		}
		public MethodDeclaratorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_methodDeclarator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ClypsListener ) ((ClypsListener)listener).enterMethodDeclarator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ClypsListener ) ((ClypsListener)listener).exitMethodDeclarator(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ClypsVisitor ) return ((ClypsVisitor<? extends T>)visitor).visitMethodDeclarator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MethodDeclaratorContext methodDeclarator() throws RecognitionException {
		MethodDeclaratorContext _localctx = new MethodDeclaratorContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_methodDeclarator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(306);
			match(Identifier);
			setState(307);
			match(LPAREN);
			setState(309);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__1) | (1L << BOOLEAN) | (1L << BYTE) | (1L << CHAR) | (1L << DOUBLE) | (1L << FINAL) | (1L << FLOAT) | (1L << INT) | (1L << LONG) | (1L << SHORT))) != 0) || _la==Identifier) {
				{
				setState(308);
				formalParameterList();
				}
			}

			setState(311);
			match(RPAREN);
			setState(313);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LBRACK) {
				{
				setState(312);
				dims();
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

	public static class FormalParameterListContext extends ParserRuleContext {
		public ReceiverParameterContext receiverParameter() {
			return getRuleContext(ReceiverParameterContext.class,0);
		}
		public FormalParametersContext formalParameters() {
			return getRuleContext(FormalParametersContext.class,0);
		}
		public TerminalNode COMMA() { return getToken(ClypsParser.COMMA, 0); }
		public LastFormalParameterContext lastFormalParameter() {
			return getRuleContext(LastFormalParameterContext.class,0);
		}
		public FormalParameterListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_formalParameterList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ClypsListener ) ((ClypsListener)listener).enterFormalParameterList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ClypsListener ) ((ClypsListener)listener).exitFormalParameterList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ClypsVisitor ) return ((ClypsVisitor<? extends T>)visitor).visitFormalParameterList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FormalParameterListContext formalParameterList() throws RecognitionException {
		FormalParameterListContext _localctx = new FormalParameterListContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_formalParameterList);
		try {
			setState(321);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,17,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(315);
				receiverParameter();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(316);
				formalParameters();
				setState(317);
				match(COMMA);
				setState(318);
				lastFormalParameter();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(320);
				lastFormalParameter();
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

	public static class FormalParametersContext extends ParserRuleContext {
		public List<FormalParameterContext> formalParameter() {
			return getRuleContexts(FormalParameterContext.class);
		}
		public FormalParameterContext formalParameter(int i) {
			return getRuleContext(FormalParameterContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(ClypsParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(ClypsParser.COMMA, i);
		}
		public ReceiverParameterContext receiverParameter() {
			return getRuleContext(ReceiverParameterContext.class,0);
		}
		public FormalParametersContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_formalParameters; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ClypsListener ) ((ClypsListener)listener).enterFormalParameters(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ClypsListener ) ((ClypsListener)listener).exitFormalParameters(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ClypsVisitor ) return ((ClypsVisitor<? extends T>)visitor).visitFormalParameters(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FormalParametersContext formalParameters() throws RecognitionException {
		FormalParametersContext _localctx = new FormalParametersContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_formalParameters);
		try {
			int _alt;
			setState(339);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,20,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(323);
				formalParameter();
				setState(328);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,18,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(324);
						match(COMMA);
						setState(325);
						formalParameter();
						}
						} 
					}
					setState(330);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,18,_ctx);
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(331);
				receiverParameter();
				setState(336);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,19,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(332);
						match(COMMA);
						setState(333);
						formalParameter();
						}
						} 
					}
					setState(338);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,19,_ctx);
				}
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

	public static class FormalParameterContext extends ParserRuleContext {
		public UnannTypeContext unannType() {
			return getRuleContext(UnannTypeContext.class,0);
		}
		public VariableDeclaratorIdContext variableDeclaratorId() {
			return getRuleContext(VariableDeclaratorIdContext.class,0);
		}
		public List<VariableModifierContext> variableModifier() {
			return getRuleContexts(VariableModifierContext.class);
		}
		public VariableModifierContext variableModifier(int i) {
			return getRuleContext(VariableModifierContext.class,i);
		}
		public FormalParameterContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_formalParameter; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ClypsListener ) ((ClypsListener)listener).enterFormalParameter(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ClypsListener ) ((ClypsListener)listener).exitFormalParameter(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ClypsVisitor ) return ((ClypsVisitor<? extends T>)visitor).visitFormalParameter(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FormalParameterContext formalParameter() throws RecognitionException {
		FormalParameterContext _localctx = new FormalParameterContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_formalParameter);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(344);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==FINAL || _la==Identifier) {
				{
				{
				setState(341);
				variableModifier();
				}
				}
				setState(346);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(347);
			unannType();
			setState(348);
			variableDeclaratorId();
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

	public static class VariableModifierContext extends ParserRuleContext {
		public TerminalNode FINAL() { return getToken(ClypsParser.FINAL, 0); }
		public TerminalNode Identifier() { return getToken(ClypsParser.Identifier, 0); }
		public VariableModifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variableModifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ClypsListener ) ((ClypsListener)listener).enterVariableModifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ClypsListener ) ((ClypsListener)listener).exitVariableModifier(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ClypsVisitor ) return ((ClypsVisitor<? extends T>)visitor).visitVariableModifier(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VariableModifierContext variableModifier() throws RecognitionException {
		VariableModifierContext _localctx = new VariableModifierContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_variableModifier);
		try {
			setState(353);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case FINAL:
				enterOuterAlt(_localctx, 1);
				{
				setState(350);
				match(FINAL);
				}
				break;
			case Identifier:
				enterOuterAlt(_localctx, 2);
				{
				setState(351);
				match(Identifier);
				notifyErrorListeners("Wrong Modifier");
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

	public static class LastFormalParameterContext extends ParserRuleContext {
		public UnannTypeContext unannType() {
			return getRuleContext(UnannTypeContext.class,0);
		}
		public TerminalNode ELLIPSIS() { return getToken(ClypsParser.ELLIPSIS, 0); }
		public VariableDeclaratorIdContext variableDeclaratorId() {
			return getRuleContext(VariableDeclaratorIdContext.class,0);
		}
		public List<VariableModifierContext> variableModifier() {
			return getRuleContexts(VariableModifierContext.class);
		}
		public VariableModifierContext variableModifier(int i) {
			return getRuleContext(VariableModifierContext.class,i);
		}
		public FormalParameterContext formalParameter() {
			return getRuleContext(FormalParameterContext.class,0);
		}
		public LastFormalParameterContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_lastFormalParameter; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ClypsListener ) ((ClypsListener)listener).enterLastFormalParameter(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ClypsListener ) ((ClypsListener)listener).exitLastFormalParameter(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ClypsVisitor ) return ((ClypsVisitor<? extends T>)visitor).visitLastFormalParameter(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LastFormalParameterContext lastFormalParameter() throws RecognitionException {
		LastFormalParameterContext _localctx = new LastFormalParameterContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_lastFormalParameter);
		int _la;
		try {
			setState(366);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,24,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(358);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==FINAL || _la==Identifier) {
					{
					{
					setState(355);
					variableModifier();
					}
					}
					setState(360);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(361);
				unannType();
				setState(362);
				match(ELLIPSIS);
				setState(363);
				variableDeclaratorId();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(365);
				formalParameter();
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

	public static class ReceiverParameterContext extends ParserRuleContext {
		public UnannTypeContext unannType() {
			return getRuleContext(UnannTypeContext.class,0);
		}
		public TerminalNode Identifier() { return getToken(ClypsParser.Identifier, 0); }
		public TerminalNode DOT() { return getToken(ClypsParser.DOT, 0); }
		public ReceiverParameterContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_receiverParameter; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ClypsListener ) ((ClypsListener)listener).enterReceiverParameter(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ClypsListener ) ((ClypsListener)listener).exitReceiverParameter(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ClypsVisitor ) return ((ClypsVisitor<? extends T>)visitor).visitReceiverParameter(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ReceiverParameterContext receiverParameter() throws RecognitionException {
		ReceiverParameterContext _localctx = new ReceiverParameterContext(_ctx, getState());
		enterRule(_localctx, 66, RULE_receiverParameter);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(368);
			unannType();
			setState(371);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Identifier) {
				{
				setState(369);
				match(Identifier);
				setState(370);
				match(DOT);
				}
			}

			setState(373);
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

	public static class MethodBodyContext extends ParserRuleContext {
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public MethodBodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_methodBody; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ClypsListener ) ((ClypsListener)listener).enterMethodBody(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ClypsListener ) ((ClypsListener)listener).exitMethodBody(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ClypsVisitor ) return ((ClypsVisitor<? extends T>)visitor).visitMethodBody(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MethodBodyContext methodBody() throws RecognitionException {
		MethodBodyContext _localctx = new MethodBodyContext(_ctx, getState());
		enterRule(_localctx, 68, RULE_methodBody);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(375);
			block();
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

	public static class ArrayInitializerContext extends ParserRuleContext {
		public TerminalNode LBRACE() { return getToken(ClypsParser.LBRACE, 0); }
		public TerminalNode RBRACE() { return getToken(ClypsParser.RBRACE, 0); }
		public VariableInitializerListContext variableInitializerList() {
			return getRuleContext(VariableInitializerListContext.class,0);
		}
		public TerminalNode COMMA() { return getToken(ClypsParser.COMMA, 0); }
		public ArrayInitializerContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arrayInitializer; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ClypsListener ) ((ClypsListener)listener).enterArrayInitializer(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ClypsListener ) ((ClypsListener)listener).exitArrayInitializer(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ClypsVisitor ) return ((ClypsVisitor<? extends T>)visitor).visitArrayInitializer(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArrayInitializerContext arrayInitializer() throws RecognitionException {
		ArrayInitializerContext _localctx = new ArrayInitializerContext(_ctx, getState());
		enterRule(_localctx, 70, RULE_arrayInitializer);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(377);
			match(LBRACE);
			setState(379);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 34)) & ~0x3f) == 0 && ((1L << (_la - 34)) & ((1L << (IntegerLiteral - 34)) | (1L << (FloatingPointLiteral - 34)) | (1L << (BooleanLiteral - 34)) | (1L << (CharacterLiteral - 34)) | (1L << (StringLiteral - 34)) | (1L << (NullLiteral - 34)) | (1L << (LPAREN - 34)) | (1L << (LBRACE - 34)) | (1L << (ASSIGN - 34)) | (1L << (GT - 34)) | (1L << (LT - 34)) | (1L << (BANG - 34)) | (1L << (TILDE - 34)) | (1L << (COLON - 34)) | (1L << (ADD - 34)) | (1L << (SUB - 34)) | (1L << (MUL - 34)) | (1L << (DIV - 34)) | (1L << (BITAND - 34)) | (1L << (BITOR - 34)) | (1L << (Identifier - 34)))) != 0)) {
				{
				setState(378);
				variableInitializerList();
				}
			}

			setState(382);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COMMA) {
				{
				setState(381);
				match(COMMA);
				}
			}

			setState(384);
			match(RBRACE);
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

	public static class VariableInitializerListContext extends ParserRuleContext {
		public List<VariableInitializerContext> variableInitializer() {
			return getRuleContexts(VariableInitializerContext.class);
		}
		public VariableInitializerContext variableInitializer(int i) {
			return getRuleContext(VariableInitializerContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(ClypsParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(ClypsParser.COMMA, i);
		}
		public VariableInitializerListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variableInitializerList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ClypsListener ) ((ClypsListener)listener).enterVariableInitializerList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ClypsListener ) ((ClypsListener)listener).exitVariableInitializerList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ClypsVisitor ) return ((ClypsVisitor<? extends T>)visitor).visitVariableInitializerList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VariableInitializerListContext variableInitializerList() throws RecognitionException {
		VariableInitializerListContext _localctx = new VariableInitializerListContext(_ctx, getState());
		enterRule(_localctx, 72, RULE_variableInitializerList);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(386);
			variableInitializer();
			setState(391);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,28,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(387);
					match(COMMA);
					setState(388);
					variableInitializer();
					}
					} 
				}
				setState(393);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,28,_ctx);
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

	public static class BlockContext extends ParserRuleContext {
		public TerminalNode LBRACE() { return getToken(ClypsParser.LBRACE, 0); }
		public TerminalNode RBRACE() { return getToken(ClypsParser.RBRACE, 0); }
		public BlockStatementsContext blockStatements() {
			return getRuleContext(BlockStatementsContext.class,0);
		}
		public BlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_block; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ClypsListener ) ((ClypsListener)listener).enterBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ClypsListener ) ((ClypsListener)listener).exitBlock(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ClypsVisitor ) return ((ClypsVisitor<? extends T>)visitor).visitBlock(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BlockContext block() throws RecognitionException {
		BlockContext _localctx = new BlockContext(_ctx, getState());
		enterRule(_localctx, 74, RULE_block);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(394);
			match(LBRACE);
			setState(396);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__1) | (1L << BOOLEAN) | (1L << BYTE) | (1L << CHAR) | (1L << DO) | (1L << DOUBLE) | (1L << FINAL) | (1L << FLOAT) | (1L << FOR) | (1L << IF) | (1L << INT) | (1L << LONG) | (1L << PRINT) | (1L << RETURN) | (1L << SCAN) | (1L << SHORT) | (1L << WHILE) | (1L << IntegerLiteral) | (1L << FloatingPointLiteral) | (1L << BooleanLiteral) | (1L << CharacterLiteral) | (1L << StringLiteral) | (1L << NullLiteral) | (1L << LPAREN) | (1L << LBRACE) | (1L << ASSIGN) | (1L << GT) | (1L << LT) | (1L << COLON))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (ADD - 64)) | (1L << (SUB - 64)) | (1L << (MUL - 64)) | (1L << (DIV - 64)) | (1L << (BITAND - 64)) | (1L << (BITOR - 64)) | (1L << (Identifier - 64)))) != 0)) {
				{
				setState(395);
				blockStatements();
				}
			}

			setState(398);
			match(RBRACE);
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

	public static class BlockStatementsContext extends ParserRuleContext {
		public List<BlockStatementContext> blockStatement() {
			return getRuleContexts(BlockStatementContext.class);
		}
		public BlockStatementContext blockStatement(int i) {
			return getRuleContext(BlockStatementContext.class,i);
		}
		public BlockStatementsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_blockStatements; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ClypsListener ) ((ClypsListener)listener).enterBlockStatements(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ClypsListener ) ((ClypsListener)listener).exitBlockStatements(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ClypsVisitor ) return ((ClypsVisitor<? extends T>)visitor).visitBlockStatements(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BlockStatementsContext blockStatements() throws RecognitionException {
		BlockStatementsContext _localctx = new BlockStatementsContext(_ctx, getState());
		enterRule(_localctx, 76, RULE_blockStatements);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(401); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(400);
				blockStatement();
				}
				}
				setState(403); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__1) | (1L << BOOLEAN) | (1L << BYTE) | (1L << CHAR) | (1L << DO) | (1L << DOUBLE) | (1L << FINAL) | (1L << FLOAT) | (1L << FOR) | (1L << IF) | (1L << INT) | (1L << LONG) | (1L << PRINT) | (1L << RETURN) | (1L << SCAN) | (1L << SHORT) | (1L << WHILE) | (1L << IntegerLiteral) | (1L << FloatingPointLiteral) | (1L << BooleanLiteral) | (1L << CharacterLiteral) | (1L << StringLiteral) | (1L << NullLiteral) | (1L << LPAREN) | (1L << LBRACE) | (1L << ASSIGN) | (1L << GT) | (1L << LT) | (1L << COLON))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (ADD - 64)) | (1L << (SUB - 64)) | (1L << (MUL - 64)) | (1L << (DIV - 64)) | (1L << (BITAND - 64)) | (1L << (BITOR - 64)) | (1L << (Identifier - 64)))) != 0) );
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

	public static class BlockStatementContext extends ParserRuleContext {
		public LocalVariableDeclarationStatementContext localVariableDeclarationStatement() {
			return getRuleContext(LocalVariableDeclarationStatementContext.class,0);
		}
		public VariableDeclarationStatementContext variableDeclarationStatement() {
			return getRuleContext(VariableDeclarationStatementContext.class,0);
		}
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public BlockStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_blockStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ClypsListener ) ((ClypsListener)listener).enterBlockStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ClypsListener ) ((ClypsListener)listener).exitBlockStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ClypsVisitor ) return ((ClypsVisitor<? extends T>)visitor).visitBlockStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BlockStatementContext blockStatement() throws RecognitionException {
		BlockStatementContext _localctx = new BlockStatementContext(_ctx, getState());
		enterRule(_localctx, 78, RULE_blockStatement);
		try {
			setState(408);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,31,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(405);
				localVariableDeclarationStatement();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(406);
				variableDeclarationStatement();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(407);
				statement();
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

	public static class VariableDeclarationStatementContext extends ParserRuleContext {
		public VariableDeclaratorContext variableDeclarator() {
			return getRuleContext(VariableDeclaratorContext.class,0);
		}
		public TerminalNode SEMI() { return getToken(ClypsParser.SEMI, 0); }
		public VariableDeclarationStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variableDeclarationStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ClypsListener ) ((ClypsListener)listener).enterVariableDeclarationStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ClypsListener ) ((ClypsListener)listener).exitVariableDeclarationStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ClypsVisitor ) return ((ClypsVisitor<? extends T>)visitor).visitVariableDeclarationStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VariableDeclarationStatementContext variableDeclarationStatement() throws RecognitionException {
		VariableDeclarationStatementContext _localctx = new VariableDeclarationStatementContext(_ctx, getState());
		enterRule(_localctx, 80, RULE_variableDeclarationStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(410);
			variableDeclarator();
			setState(411);
			match(SEMI);
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

	public static class LocalVariableDeclarationStatementContext extends ParserRuleContext {
		public LocalVariableDeclarationContext localVariableDeclaration() {
			return getRuleContext(LocalVariableDeclarationContext.class,0);
		}
		public TerminalNode SEMI() { return getToken(ClypsParser.SEMI, 0); }
		public LocalVariableDeclarationStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_localVariableDeclarationStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ClypsListener ) ((ClypsListener)listener).enterLocalVariableDeclarationStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ClypsListener ) ((ClypsListener)listener).exitLocalVariableDeclarationStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ClypsVisitor ) return ((ClypsVisitor<? extends T>)visitor).visitLocalVariableDeclarationStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LocalVariableDeclarationStatementContext localVariableDeclarationStatement() throws RecognitionException {
		LocalVariableDeclarationStatementContext _localctx = new LocalVariableDeclarationStatementContext(_ctx, getState());
		enterRule(_localctx, 82, RULE_localVariableDeclarationStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(413);
			localVariableDeclaration();
			setState(414);
			match(SEMI);
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

	public static class LocalVariableDeclarationContext extends ParserRuleContext {
		public List<UnannTypeContext> unannType() {
			return getRuleContexts(UnannTypeContext.class);
		}
		public UnannTypeContext unannType(int i) {
			return getRuleContext(UnannTypeContext.class,i);
		}
		public VariableDeclaratorListContext variableDeclaratorList() {
			return getRuleContext(VariableDeclaratorListContext.class,0);
		}
		public List<VariableModifierContext> variableModifier() {
			return getRuleContexts(VariableModifierContext.class);
		}
		public VariableModifierContext variableModifier(int i) {
			return getRuleContext(VariableModifierContext.class,i);
		}
		public VariableDeclaratorIdContext variableDeclaratorId() {
			return getRuleContext(VariableDeclaratorIdContext.class,0);
		}
		public TerminalNode ASSIGN() { return getToken(ClypsParser.ASSIGN, 0); }
		public VariableInitializerContext variableInitializer() {
			return getRuleContext(VariableInitializerContext.class,0);
		}
		public ArrayCreationExpressionContext arrayCreationExpression() {
			return getRuleContext(ArrayCreationExpressionContext.class,0);
		}
		public LocalVariableDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_localVariableDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ClypsListener ) ((ClypsListener)listener).enterLocalVariableDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ClypsListener ) ((ClypsListener)listener).exitLocalVariableDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ClypsVisitor ) return ((ClypsVisitor<? extends T>)visitor).visitLocalVariableDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LocalVariableDeclarationContext localVariableDeclaration() throws RecognitionException {
		LocalVariableDeclarationContext _localctx = new LocalVariableDeclarationContext(_ctx, getState());
		enterRule(_localctx, 84, RULE_localVariableDeclaration);
		int _la;
		try {
			setState(441);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,34,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(419);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==FINAL || _la==Identifier) {
					{
					{
					setState(416);
					variableModifier();
					}
					}
					setState(421);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(422);
				unannType();
				setState(423);
				variableDeclaratorList();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(428);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==FINAL || _la==Identifier) {
					{
					{
					setState(425);
					variableModifier();
					}
					}
					setState(430);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(431);
				unannType();
				setState(432);
				variableDeclaratorId();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(434);
				unannType();
				setState(435);
				unannType();
				setState(436);
				match(ASSIGN);
				setState(437);
				variableInitializer();
				notifyErrorListeners("Explicit Use of Keyword");
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(440);
				arrayCreationExpression();
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
		public StatementWithoutTrailingSubstatementContext statementWithoutTrailingSubstatement() {
			return getRuleContext(StatementWithoutTrailingSubstatementContext.class,0);
		}
		public IfThenStatementContext ifThenStatement() {
			return getRuleContext(IfThenStatementContext.class,0);
		}
		public IfThenElseStatementContext ifThenElseStatement() {
			return getRuleContext(IfThenElseStatementContext.class,0);
		}
		public WhileStatementContext whileStatement() {
			return getRuleContext(WhileStatementContext.class,0);
		}
		public ForStatementContext forStatement() {
			return getRuleContext(ForStatementContext.class,0);
		}
		public PrintStatementContext printStatement() {
			return getRuleContext(PrintStatementContext.class,0);
		}
		public ScanStatementContext scanStatement() {
			return getRuleContext(ScanStatementContext.class,0);
		}
		public DoStatementContext doStatement() {
			return getRuleContext(DoStatementContext.class,0);
		}
		public ReturnStatementContext returnStatement() {
			return getRuleContext(ReturnStatementContext.class,0);
		}
		public PostIncrementExpressionContext postIncrementExpression() {
			return getRuleContext(PostIncrementExpressionContext.class,0);
		}
		public TerminalNode SEMI() { return getToken(ClypsParser.SEMI, 0); }
		public PostDecrementExpressionContext postDecrementExpression() {
			return getRuleContext(PostDecrementExpressionContext.class,0);
		}
		public MethodInvocationContext methodInvocation() {
			return getRuleContext(MethodInvocationContext.class,0);
		}
		public StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ClypsListener ) ((ClypsListener)listener).enterStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ClypsListener ) ((ClypsListener)listener).exitStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ClypsVisitor ) return ((ClypsVisitor<? extends T>)visitor).visitStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 86, RULE_statement);
		try {
			setState(461);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,35,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(443);
				statementWithoutTrailingSubstatement();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(444);
				ifThenStatement();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(445);
				ifThenElseStatement();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(446);
				whileStatement();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(447);
				forStatement();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(448);
				printStatement();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(449);
				scanStatement();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(450);
				doStatement();
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(451);
				returnStatement();
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(452);
				postIncrementExpression();
				setState(453);
				match(SEMI);
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(455);
				postDecrementExpression();
				setState(456);
				match(SEMI);
				}
				break;
			case 12:
				enterOuterAlt(_localctx, 12);
				{
				setState(458);
				methodInvocation();
				setState(459);
				match(SEMI);
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

	public static class PrintStatementContext extends ParserRuleContext {
		public TerminalNode PRINT() { return getToken(ClypsParser.PRINT, 0); }
		public TerminalNode LPAREN() { return getToken(ClypsParser.LPAREN, 0); }
		public PrintBlockContext printBlock() {
			return getRuleContext(PrintBlockContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(ClypsParser.RPAREN, 0); }
		public TerminalNode SEMI() { return getToken(ClypsParser.SEMI, 0); }
		public List<TerminalNode> Identifier() { return getTokens(ClypsParser.Identifier); }
		public TerminalNode Identifier(int i) {
			return getToken(ClypsParser.Identifier, i);
		}
		public List<TerminalNode> StringLiteral() { return getTokens(ClypsParser.StringLiteral); }
		public TerminalNode StringLiteral(int i) {
			return getToken(ClypsParser.StringLiteral, i);
		}
		public List<TerminalNode> IntegerLiteral() { return getTokens(ClypsParser.IntegerLiteral); }
		public TerminalNode IntegerLiteral(int i) {
			return getToken(ClypsParser.IntegerLiteral, i);
		}
		public List<TerminalNode> BANG() { return getTokens(ClypsParser.BANG); }
		public TerminalNode BANG(int i) {
			return getToken(ClypsParser.BANG, i);
		}
		public List<TerminalNode> AT() { return getTokens(ClypsParser.AT); }
		public TerminalNode AT(int i) {
			return getToken(ClypsParser.AT, i);
		}
		public List<TerminalNode> MOD() { return getTokens(ClypsParser.MOD); }
		public TerminalNode MOD(int i) {
			return getToken(ClypsParser.MOD, i);
		}
		public List<TerminalNode> CARET() { return getTokens(ClypsParser.CARET); }
		public TerminalNode CARET(int i) {
			return getToken(ClypsParser.CARET, i);
		}
		public List<TerminalNode> BITAND() { return getTokens(ClypsParser.BITAND); }
		public TerminalNode BITAND(int i) {
			return getToken(ClypsParser.BITAND, i);
		}
		public List<TerminalNode> MUL() { return getTokens(ClypsParser.MUL); }
		public TerminalNode MUL(int i) {
			return getToken(ClypsParser.MUL, i);
		}
		public List<TerminalNode> COLON() { return getTokens(ClypsParser.COLON); }
		public TerminalNode COLON(int i) {
			return getToken(ClypsParser.COLON, i);
		}
		public List<TerminalNode> DOT() { return getTokens(ClypsParser.DOT); }
		public TerminalNode DOT(int i) {
			return getToken(ClypsParser.DOT, i);
		}
		public PrintStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_printStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ClypsListener ) ((ClypsListener)listener).enterPrintStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ClypsListener ) ((ClypsListener)listener).exitPrintStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ClypsVisitor ) return ((ClypsVisitor<? extends T>)visitor).visitPrintStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PrintStatementContext printStatement() throws RecognitionException {
		PrintStatementContext _localctx = new PrintStatementContext(_ctx, getState());
		enterRule(_localctx, 88, RULE_printStatement);
		int _la;
		try {
			setState(486);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,38,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(463);
				match(PRINT);
				setState(464);
				match(LPAREN);
				setState(465);
				printBlock(0);
				setState(466);
				match(RPAREN);
				setState(467);
				match(SEMI);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(469);
				match(PRINT);
				setState(470);
				match(LPAREN);
				setState(474);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==StringLiteral || _la==Identifier) {
					{
					{
					setState(471);
					_la = _input.LA(1);
					if ( !(_la==StringLiteral || _la==Identifier) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					}
					}
					setState(476);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(480);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__3) | (1L << T__4) | (1L << IntegerLiteral) | (1L << DOT) | (1L << BANG) | (1L << COLON))) != 0) || ((((_la - 66)) & ~0x3f) == 0 && ((1L << (_la - 66)) & ((1L << (MUL - 66)) | (1L << (BITAND - 66)) | (1L << (CARET - 66)) | (1L << (MOD - 66)) | (1L << (AT - 66)))) != 0)) {
					{
					{
					setState(477);
					_la = _input.LA(1);
					if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__3) | (1L << T__4) | (1L << IntegerLiteral) | (1L << DOT) | (1L << BANG) | (1L << COLON))) != 0) || ((((_la - 66)) & ~0x3f) == 0 && ((1L << (_la - 66)) & ((1L << (MUL - 66)) | (1L << (BITAND - 66)) | (1L << (CARET - 66)) | (1L << (MOD - 66)) | (1L << (AT - 66)))) != 0)) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					}
					}
					setState(482);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(483);
				match(RPAREN);
				notifyErrorListeners("Missing double quotes");
				setState(485);
				match(SEMI);
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

	public static class PrintBlockContext extends ParserRuleContext {
		public PrintExtraContext printExtra() {
			return getRuleContext(PrintExtraContext.class,0);
		}
		public PrintBlockContext printBlock() {
			return getRuleContext(PrintBlockContext.class,0);
		}
		public TerminalNode ADD() { return getToken(ClypsParser.ADD, 0); }
		public PrintBlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_printBlock; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ClypsListener ) ((ClypsListener)listener).enterPrintBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ClypsListener ) ((ClypsListener)listener).exitPrintBlock(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ClypsVisitor ) return ((ClypsVisitor<? extends T>)visitor).visitPrintBlock(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PrintBlockContext printBlock() throws RecognitionException {
		return printBlock(0);
	}

	private PrintBlockContext printBlock(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		PrintBlockContext _localctx = new PrintBlockContext(_ctx, _parentState);
		PrintBlockContext _prevctx = _localctx;
		int _startState = 90;
		enterRecursionRule(_localctx, 90, RULE_printBlock, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(489);
			printExtra();
			}
			_ctx.stop = _input.LT(-1);
			setState(496);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,39,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new PrintBlockContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_printBlock);
					setState(491);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(492);
					match(ADD);
					setState(493);
					printExtra();
					}
					} 
				}
				setState(498);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,39,_ctx);
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

	public static class PrintExtraContext extends ParserRuleContext {
		public List<TerminalNode> Identifier() { return getTokens(ClypsParser.Identifier); }
		public TerminalNode Identifier(int i) {
			return getToken(ClypsParser.Identifier, i);
		}
		public List<TerminalNode> StringLiteral() { return getTokens(ClypsParser.StringLiteral); }
		public TerminalNode StringLiteral(int i) {
			return getToken(ClypsParser.StringLiteral, i);
		}
		public TerminalNode ADD() { return getToken(ClypsParser.ADD, 0); }
		public List<TerminalNode> IntegerLiteral() { return getTokens(ClypsParser.IntegerLiteral); }
		public TerminalNode IntegerLiteral(int i) {
			return getToken(ClypsParser.IntegerLiteral, i);
		}
		public PrintExtraContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_printExtra; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ClypsListener ) ((ClypsListener)listener).enterPrintExtra(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ClypsListener ) ((ClypsListener)listener).exitPrintExtra(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ClypsVisitor ) return ((ClypsVisitor<? extends T>)visitor).visitPrintExtra(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PrintExtraContext printExtra() throws RecognitionException {
		PrintExtraContext _localctx = new PrintExtraContext(_ctx, getState());
		enterRule(_localctx, 92, RULE_printExtra);
		try {
			int _alt;
			setState(545);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,45,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(499);
				match(Identifier);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(500);
				match(StringLiteral);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(501);
				match(Identifier);
				setState(502);
				match(ADD);
				notifyErrorListeners("Too Many '+' Symbols");
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(504);
				match(StringLiteral);
				setState(505);
				match(ADD);
				notifyErrorListeners("Too Many '+' Symbols");
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(507);
				match(IntegerLiteral);
				setState(508);
				match(ADD);
				notifyErrorListeners("Too Many '+' Symbols");
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(510);
				match(IntegerLiteral);
				setState(512); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(511);
						match(IntegerLiteral);
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(514); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,40,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				notifyErrorListeners("Missing double quotes");
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(517);
				match(Identifier);
				setState(519); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(518);
						match(Identifier);
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(521); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,41,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				notifyErrorListeners("Missing double quotes");
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(524);
				match(Identifier);
				setState(526); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(525);
						match(StringLiteral);
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(528); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,42,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				notifyErrorListeners("Missing double quotes");
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(531);
				match(StringLiteral);
				setState(533); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(532);
						match(StringLiteral);
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(535); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,43,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				notifyErrorListeners("Missing double quotes");
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(538);
				match(StringLiteral);
				setState(540); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(539);
						match(Identifier);
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(542); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,44,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				notifyErrorListeners("Missing double quotes");
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

	public static class ScanStatementContext extends ParserRuleContext {
		public TerminalNode SCAN() { return getToken(ClypsParser.SCAN, 0); }
		public TerminalNode LPAREN() { return getToken(ClypsParser.LPAREN, 0); }
		public ScanBlockContext scanBlock() {
			return getRuleContext(ScanBlockContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(ClypsParser.RPAREN, 0); }
		public TerminalNode SEMI() { return getToken(ClypsParser.SEMI, 0); }
		public ScanStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_scanStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ClypsListener ) ((ClypsListener)listener).enterScanStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ClypsListener ) ((ClypsListener)listener).exitScanStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ClypsVisitor ) return ((ClypsVisitor<? extends T>)visitor).visitScanStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ScanStatementContext scanStatement() throws RecognitionException {
		ScanStatementContext _localctx = new ScanStatementContext(_ctx, getState());
		enterRule(_localctx, 94, RULE_scanStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(547);
			match(SCAN);
			setState(548);
			match(LPAREN);
			setState(549);
			scanBlock();
			setState(550);
			match(RPAREN);
			setState(551);
			match(SEMI);
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

	public static class ScanBlockContext extends ParserRuleContext {
		public TerminalNode StringLiteral() { return getToken(ClypsParser.StringLiteral, 0); }
		public List<TerminalNode> COMMA() { return getTokens(ClypsParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(ClypsParser.COMMA, i);
		}
		public List<ScanExtraContext> scanExtra() {
			return getRuleContexts(ScanExtraContext.class);
		}
		public ScanExtraContext scanExtra(int i) {
			return getRuleContext(ScanExtraContext.class,i);
		}
		public TerminalNode Identifier() { return getToken(ClypsParser.Identifier, 0); }
		public ScanBlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_scanBlock; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ClypsListener ) ((ClypsListener)listener).enterScanBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ClypsListener ) ((ClypsListener)listener).exitScanBlock(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ClypsVisitor ) return ((ClypsVisitor<? extends T>)visitor).visitScanBlock(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ScanBlockContext scanBlock() throws RecognitionException {
		ScanBlockContext _localctx = new ScanBlockContext(_ctx, getState());
		enterRule(_localctx, 96, RULE_scanBlock);
		int _la;
		try {
			setState(568);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case StringLiteral:
				enterOuterAlt(_localctx, 1);
				{
				setState(553);
				match(StringLiteral);
				setState(556); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(554);
					match(COMMA);
					setState(555);
					scanExtra();
					}
					}
					setState(558); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==COMMA );
				}
				break;
			case Identifier:
				enterOuterAlt(_localctx, 2);
				{
				setState(560);
				match(Identifier);
				setState(565);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(561);
					match(COMMA);
					setState(562);
					scanExtra();
					}
					}
					setState(567);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
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

	public static class ScanExtraContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(ClypsParser.Identifier, 0); }
		public TerminalNode COMMA() { return getToken(ClypsParser.COMMA, 0); }
		public ScanExtraContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_scanExtra; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ClypsListener ) ((ClypsListener)listener).enterScanExtra(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ClypsListener ) ((ClypsListener)listener).exitScanExtra(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ClypsVisitor ) return ((ClypsVisitor<? extends T>)visitor).visitScanExtra(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ScanExtraContext scanExtra() throws RecognitionException {
		ScanExtraContext _localctx = new ScanExtraContext(_ctx, getState());
		enterRule(_localctx, 98, RULE_scanExtra);
		try {
			setState(574);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,49,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(570);
				match(Identifier);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(571);
				match(Identifier);
				setState(572);
				match(COMMA);
				notifyErrorListeners("Extra , Detected");
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

	public static class StatementWithoutTrailingSubstatementContext extends ParserRuleContext {
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public StatementWithoutTrailingSubstatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statementWithoutTrailingSubstatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ClypsListener ) ((ClypsListener)listener).enterStatementWithoutTrailingSubstatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ClypsListener ) ((ClypsListener)listener).exitStatementWithoutTrailingSubstatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ClypsVisitor ) return ((ClypsVisitor<? extends T>)visitor).visitStatementWithoutTrailingSubstatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatementWithoutTrailingSubstatementContext statementWithoutTrailingSubstatement() throws RecognitionException {
		StatementWithoutTrailingSubstatementContext _localctx = new StatementWithoutTrailingSubstatementContext(_ctx, getState());
		enterRule(_localctx, 100, RULE_statementWithoutTrailingSubstatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(576);
			block();
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

	public static class StatementExpressionContext extends ParserRuleContext {
		public PostIncrementExpressionContext postIncrementExpression() {
			return getRuleContext(PostIncrementExpressionContext.class,0);
		}
		public PostDecrementExpressionContext postDecrementExpression() {
			return getRuleContext(PostDecrementExpressionContext.class,0);
		}
		public AssignmentContext assignment() {
			return getRuleContext(AssignmentContext.class,0);
		}
		public MethodInvocationContext methodInvocation() {
			return getRuleContext(MethodInvocationContext.class,0);
		}
		public StatementExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statementExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ClypsListener ) ((ClypsListener)listener).enterStatementExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ClypsListener ) ((ClypsListener)listener).exitStatementExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ClypsVisitor ) return ((ClypsVisitor<? extends T>)visitor).visitStatementExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatementExpressionContext statementExpression() throws RecognitionException {
		StatementExpressionContext _localctx = new StatementExpressionContext(_ctx, getState());
		enterRule(_localctx, 102, RULE_statementExpression);
		try {
			setState(582);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,50,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(578);
				postIncrementExpression();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(579);
				postDecrementExpression();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(580);
				assignment();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(581);
				methodInvocation();
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

	public static class IfThenStatementContext extends ParserRuleContext {
		public TerminalNode IF() { return getToken(ClypsParser.IF, 0); }
		public TerminalNode LPAREN() { return getToken(ClypsParser.LPAREN, 0); }
		public ConditionalExpressionContext conditionalExpression() {
			return getRuleContext(ConditionalExpressionContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(ClypsParser.RPAREN, 0); }
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public IfThenStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ifThenStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ClypsListener ) ((ClypsListener)listener).enterIfThenStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ClypsListener ) ((ClypsListener)listener).exitIfThenStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ClypsVisitor ) return ((ClypsVisitor<? extends T>)visitor).visitIfThenStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IfThenStatementContext ifThenStatement() throws RecognitionException {
		IfThenStatementContext _localctx = new IfThenStatementContext(_ctx, getState());
		enterRule(_localctx, 104, RULE_ifThenStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(584);
			match(IF);
			setState(585);
			match(LPAREN);
			setState(586);
			conditionalExpression();
			setState(587);
			match(RPAREN);
			setState(588);
			block();
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

	public static class IfThenElseStatementContext extends ParserRuleContext {
		public TerminalNode IF() { return getToken(ClypsParser.IF, 0); }
		public TerminalNode LPAREN() { return getToken(ClypsParser.LPAREN, 0); }
		public ConditionalExpressionContext conditionalExpression() {
			return getRuleContext(ConditionalExpressionContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(ClypsParser.RPAREN, 0); }
		public List<BlockContext> block() {
			return getRuleContexts(BlockContext.class);
		}
		public BlockContext block(int i) {
			return getRuleContext(BlockContext.class,i);
		}
		public TerminalNode ELSE() { return getToken(ClypsParser.ELSE, 0); }
		public IfThenElseStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ifThenElseStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ClypsListener ) ((ClypsListener)listener).enterIfThenElseStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ClypsListener ) ((ClypsListener)listener).exitIfThenElseStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ClypsVisitor ) return ((ClypsVisitor<? extends T>)visitor).visitIfThenElseStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IfThenElseStatementContext ifThenElseStatement() throws RecognitionException {
		IfThenElseStatementContext _localctx = new IfThenElseStatementContext(_ctx, getState());
		enterRule(_localctx, 106, RULE_ifThenElseStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(590);
			match(IF);
			setState(591);
			match(LPAREN);
			setState(592);
			conditionalExpression();
			setState(593);
			match(RPAREN);
			setState(594);
			block();
			setState(595);
			match(ELSE);
			setState(596);
			block();
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

	public static class WhileStatementContext extends ParserRuleContext {
		public TerminalNode WHILE() { return getToken(ClypsParser.WHILE, 0); }
		public TerminalNode LPAREN() { return getToken(ClypsParser.LPAREN, 0); }
		public ConditionalExpressionContext conditionalExpression() {
			return getRuleContext(ConditionalExpressionContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(ClypsParser.RPAREN, 0); }
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public WhileStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_whileStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ClypsListener ) ((ClypsListener)listener).enterWhileStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ClypsListener ) ((ClypsListener)listener).exitWhileStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ClypsVisitor ) return ((ClypsVisitor<? extends T>)visitor).visitWhileStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final WhileStatementContext whileStatement() throws RecognitionException {
		WhileStatementContext _localctx = new WhileStatementContext(_ctx, getState());
		enterRule(_localctx, 108, RULE_whileStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(598);
			match(WHILE);
			setState(599);
			match(LPAREN);
			setState(600);
			conditionalExpression();
			setState(601);
			match(RPAREN);
			setState(602);
			block();
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

	public static class DoStatementContext extends ParserRuleContext {
		public TerminalNode DO() { return getToken(ClypsParser.DO, 0); }
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public TerminalNode WHILE() { return getToken(ClypsParser.WHILE, 0); }
		public TerminalNode LPAREN() { return getToken(ClypsParser.LPAREN, 0); }
		public ConditionalExpressionContext conditionalExpression() {
			return getRuleContext(ConditionalExpressionContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(ClypsParser.RPAREN, 0); }
		public TerminalNode SEMI() { return getToken(ClypsParser.SEMI, 0); }
		public DoStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_doStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ClypsListener ) ((ClypsListener)listener).enterDoStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ClypsListener ) ((ClypsListener)listener).exitDoStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ClypsVisitor ) return ((ClypsVisitor<? extends T>)visitor).visitDoStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DoStatementContext doStatement() throws RecognitionException {
		DoStatementContext _localctx = new DoStatementContext(_ctx, getState());
		enterRule(_localctx, 110, RULE_doStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(604);
			match(DO);
			setState(605);
			block();
			setState(606);
			match(WHILE);
			setState(607);
			match(LPAREN);
			setState(608);
			conditionalExpression();
			setState(609);
			match(RPAREN);
			setState(610);
			match(SEMI);
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

	public static class ForStatementContext extends ParserRuleContext {
		public TerminalNode FOR() { return getToken(ClypsParser.FOR, 0); }
		public ForInitContext forInit() {
			return getRuleContext(ForInitContext.class,0);
		}
		public ConditionalExpressionContext conditionalExpression() {
			return getRuleContext(ConditionalExpressionContext.class,0);
		}
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public LiteralContext literal() {
			return getRuleContext(LiteralContext.class,0);
		}
		public ForStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_forStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ClypsListener ) ((ClypsListener)listener).enterForStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ClypsListener ) ((ClypsListener)listener).exitForStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ClypsVisitor ) return ((ClypsVisitor<? extends T>)visitor).visitForStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ForStatementContext forStatement() throws RecognitionException {
		ForStatementContext _localctx = new ForStatementContext(_ctx, getState());
		enterRule(_localctx, 112, RULE_forStatement);
		try {
			setState(631);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,51,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(612);
				match(FOR);
				setState(613);
				forInit();
				setState(614);
				match(T__5);
				setState(615);
				conditionalExpression();
				setState(616);
				block();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(618);
				match(FOR);
				setState(619);
				forInit();
				setState(620);
				match(T__6);
				setState(621);
				conditionalExpression();
				setState(622);
				block();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(624);
				match(FOR);
				setState(625);
				forInit();
				setState(626);
				literal();
				setState(627);
				conditionalExpression();
				setState(628);
				block();
				notifyErrorListeners("Invalid For Command format");
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

	public static class ForInitContext extends ParserRuleContext {
		public List<UnannTypeContext> unannType() {
			return getRuleContexts(UnannTypeContext.class);
		}
		public UnannTypeContext unannType(int i) {
			return getRuleContext(UnannTypeContext.class,i);
		}
		public VariableDeclaratorListContext variableDeclaratorList() {
			return getRuleContext(VariableDeclaratorListContext.class,0);
		}
		public VariableDeclaratorIdContext variableDeclaratorId() {
			return getRuleContext(VariableDeclaratorIdContext.class,0);
		}
		public ForInitContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_forInit; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ClypsListener ) ((ClypsListener)listener).enterForInit(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ClypsListener ) ((ClypsListener)listener).exitForInit(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ClypsVisitor ) return ((ClypsVisitor<? extends T>)visitor).visitForInit(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ForInitContext forInit() throws RecognitionException {
		ForInitContext _localctx = new ForInitContext(_ctx, getState());
		enterRule(_localctx, 114, RULE_forInit);
		try {
			setState(645);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,52,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(633);
				unannType();
				setState(634);
				variableDeclaratorList();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(636);
				unannType();
				setState(637);
				unannType();
				setState(638);
				variableDeclaratorList();
				notifyErrorListeners("Explicit Use of Keyword");
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(641);
				unannType();
				setState(642);
				variableDeclaratorId();
				notifyErrorListeners("Missing Value at initialization");
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

	public static class ForUpdateContext extends ParserRuleContext {
		public StatementExpressionListContext statementExpressionList() {
			return getRuleContext(StatementExpressionListContext.class,0);
		}
		public ForUpdateContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_forUpdate; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ClypsListener ) ((ClypsListener)listener).enterForUpdate(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ClypsListener ) ((ClypsListener)listener).exitForUpdate(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ClypsVisitor ) return ((ClypsVisitor<? extends T>)visitor).visitForUpdate(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ForUpdateContext forUpdate() throws RecognitionException {
		ForUpdateContext _localctx = new ForUpdateContext(_ctx, getState());
		enterRule(_localctx, 116, RULE_forUpdate);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(647);
			statementExpressionList();
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

	public static class StatementExpressionListContext extends ParserRuleContext {
		public List<StatementExpressionContext> statementExpression() {
			return getRuleContexts(StatementExpressionContext.class);
		}
		public StatementExpressionContext statementExpression(int i) {
			return getRuleContext(StatementExpressionContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(ClypsParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(ClypsParser.COMMA, i);
		}
		public StatementExpressionListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statementExpressionList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ClypsListener ) ((ClypsListener)listener).enterStatementExpressionList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ClypsListener ) ((ClypsListener)listener).exitStatementExpressionList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ClypsVisitor ) return ((ClypsVisitor<? extends T>)visitor).visitStatementExpressionList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatementExpressionListContext statementExpressionList() throws RecognitionException {
		StatementExpressionListContext _localctx = new StatementExpressionListContext(_ctx, getState());
		enterRule(_localctx, 118, RULE_statementExpressionList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(649);
			statementExpression();
			setState(654);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(650);
				match(COMMA);
				setState(651);
				statementExpression();
				}
				}
				setState(656);
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

	public static class ReturnStatementContext extends ParserRuleContext {
		public TerminalNode RETURN() { return getToken(ClypsParser.RETURN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode SEMI() { return getToken(ClypsParser.SEMI, 0); }
		public List<TerminalNode> INT() { return getTokens(ClypsParser.INT); }
		public TerminalNode INT(int i) {
			return getToken(ClypsParser.INT, i);
		}
		public List<TerminalNode> FLOAT() { return getTokens(ClypsParser.FLOAT); }
		public TerminalNode FLOAT(int i) {
			return getToken(ClypsParser.FLOAT, i);
		}
		public List<TerminalNode> BOOLEAN() { return getTokens(ClypsParser.BOOLEAN); }
		public TerminalNode BOOLEAN(int i) {
			return getToken(ClypsParser.BOOLEAN, i);
		}
		public ReturnStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_returnStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ClypsListener ) ((ClypsListener)listener).enterReturnStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ClypsListener ) ((ClypsListener)listener).exitReturnStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ClypsVisitor ) return ((ClypsVisitor<? extends T>)visitor).visitReturnStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ReturnStatementContext returnStatement() throws RecognitionException {
		ReturnStatementContext _localctx = new ReturnStatementContext(_ctx, getState());
		enterRule(_localctx, 120, RULE_returnStatement);
		int _la;
		try {
			setState(670);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,55,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(657);
				match(RETURN);
				setState(658);
				expression();
				setState(659);
				match(SEMI);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(661);
				match(RETURN);
				setState(665);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__1) | (1L << BOOLEAN) | (1L << FLOAT) | (1L << INT))) != 0)) {
					{
					{
					setState(662);
					_la = _input.LA(1);
					if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__1) | (1L << BOOLEAN) | (1L << FLOAT) | (1L << INT))) != 0)) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					}
					}
					setState(667);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(668);
				match(SEMI);
				notifyErrorListeners("Cannot return variable type");
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

	public static class PrimaryContext extends ParserRuleContext {
		public PrimaryNoNewArray_lfno_primaryContext primaryNoNewArray_lfno_primary() {
			return getRuleContext(PrimaryNoNewArray_lfno_primaryContext.class,0);
		}
		public PrimaryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_primary; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ClypsListener ) ((ClypsListener)listener).enterPrimary(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ClypsListener ) ((ClypsListener)listener).exitPrimary(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ClypsVisitor ) return ((ClypsVisitor<? extends T>)visitor).visitPrimary(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PrimaryContext primary() throws RecognitionException {
		PrimaryContext _localctx = new PrimaryContext(_ctx, getState());
		enterRule(_localctx, 122, RULE_primary);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(672);
			primaryNoNewArray_lfno_primary();
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

	public static class PrimaryNoNewArray_lfno_arrayAccessContext extends ParserRuleContext {
		public LiteralContext literal() {
			return getRuleContext(LiteralContext.class,0);
		}
		public TerminalNode LPAREN() { return getToken(ClypsParser.LPAREN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(ClypsParser.RPAREN, 0); }
		public MethodInvocationContext methodInvocation() {
			return getRuleContext(MethodInvocationContext.class,0);
		}
		public PrimaryNoNewArray_lfno_arrayAccessContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_primaryNoNewArray_lfno_arrayAccess; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ClypsListener ) ((ClypsListener)listener).enterPrimaryNoNewArray_lfno_arrayAccess(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ClypsListener ) ((ClypsListener)listener).exitPrimaryNoNewArray_lfno_arrayAccess(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ClypsVisitor ) return ((ClypsVisitor<? extends T>)visitor).visitPrimaryNoNewArray_lfno_arrayAccess(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PrimaryNoNewArray_lfno_arrayAccessContext primaryNoNewArray_lfno_arrayAccess() throws RecognitionException {
		PrimaryNoNewArray_lfno_arrayAccessContext _localctx = new PrimaryNoNewArray_lfno_arrayAccessContext(_ctx, getState());
		enterRule(_localctx, 124, RULE_primaryNoNewArray_lfno_arrayAccess);
		try {
			setState(680);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IntegerLiteral:
			case FloatingPointLiteral:
			case BooleanLiteral:
			case CharacterLiteral:
			case StringLiteral:
			case NullLiteral:
				enterOuterAlt(_localctx, 1);
				{
				setState(674);
				literal();
				}
				break;
			case LPAREN:
				enterOuterAlt(_localctx, 2);
				{
				setState(675);
				match(LPAREN);
				setState(676);
				expression();
				setState(677);
				match(RPAREN);
				}
				break;
			case Identifier:
				enterOuterAlt(_localctx, 3);
				{
				setState(679);
				methodInvocation();
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

	public static class PrimaryNoNewArray_lfno_primaryContext extends ParserRuleContext {
		public LiteralContext literal() {
			return getRuleContext(LiteralContext.class,0);
		}
		public TerminalNode LPAREN() { return getToken(ClypsParser.LPAREN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(ClypsParser.RPAREN, 0); }
		public ArrayAccess_lfno_primaryContext arrayAccess_lfno_primary() {
			return getRuleContext(ArrayAccess_lfno_primaryContext.class,0);
		}
		public PrimaryNoNewArray_lfno_primaryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_primaryNoNewArray_lfno_primary; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ClypsListener ) ((ClypsListener)listener).enterPrimaryNoNewArray_lfno_primary(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ClypsListener ) ((ClypsListener)listener).exitPrimaryNoNewArray_lfno_primary(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ClypsVisitor ) return ((ClypsVisitor<? extends T>)visitor).visitPrimaryNoNewArray_lfno_primary(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PrimaryNoNewArray_lfno_primaryContext primaryNoNewArray_lfno_primary() throws RecognitionException {
		PrimaryNoNewArray_lfno_primaryContext _localctx = new PrimaryNoNewArray_lfno_primaryContext(_ctx, getState());
		enterRule(_localctx, 126, RULE_primaryNoNewArray_lfno_primary);
		try {
			setState(688);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,57,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(682);
				literal();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(683);
				match(LPAREN);
				setState(684);
				expression();
				setState(685);
				match(RPAREN);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(687);
				arrayAccess_lfno_primary();
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

	public static class PrimaryNoNewArray_lfno_primary_lfno_arrayAccess_lfno_primaryContext extends ParserRuleContext {
		public LiteralContext literal() {
			return getRuleContext(LiteralContext.class,0);
		}
		public TerminalNode LPAREN() { return getToken(ClypsParser.LPAREN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(ClypsParser.RPAREN, 0); }
		public PrimaryNoNewArray_lfno_primary_lfno_arrayAccess_lfno_primaryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_primaryNoNewArray_lfno_primary_lfno_arrayAccess_lfno_primary; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ClypsListener ) ((ClypsListener)listener).enterPrimaryNoNewArray_lfno_primary_lfno_arrayAccess_lfno_primary(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ClypsListener ) ((ClypsListener)listener).exitPrimaryNoNewArray_lfno_primary_lfno_arrayAccess_lfno_primary(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ClypsVisitor ) return ((ClypsVisitor<? extends T>)visitor).visitPrimaryNoNewArray_lfno_primary_lfno_arrayAccess_lfno_primary(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PrimaryNoNewArray_lfno_primary_lfno_arrayAccess_lfno_primaryContext primaryNoNewArray_lfno_primary_lfno_arrayAccess_lfno_primary() throws RecognitionException {
		PrimaryNoNewArray_lfno_primary_lfno_arrayAccess_lfno_primaryContext _localctx = new PrimaryNoNewArray_lfno_primary_lfno_arrayAccess_lfno_primaryContext(_ctx, getState());
		enterRule(_localctx, 128, RULE_primaryNoNewArray_lfno_primary_lfno_arrayAccess_lfno_primary);
		try {
			setState(695);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IntegerLiteral:
			case FloatingPointLiteral:
			case BooleanLiteral:
			case CharacterLiteral:
			case StringLiteral:
			case NullLiteral:
				enterOuterAlt(_localctx, 1);
				{
				setState(690);
				literal();
				}
				break;
			case LPAREN:
				enterOuterAlt(_localctx, 2);
				{
				setState(691);
				match(LPAREN);
				setState(692);
				expression();
				setState(693);
				match(RPAREN);
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

	public static class ArrayAccessContext extends ParserRuleContext {
		public ExpressionNameContext expressionName() {
			return getRuleContext(ExpressionNameContext.class,0);
		}
		public TerminalNode LBRACK() { return getToken(ClypsParser.LBRACK, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode RBRACK() { return getToken(ClypsParser.RBRACK, 0); }
		public PrimaryNoNewArray_lfno_arrayAccessContext primaryNoNewArray_lfno_arrayAccess() {
			return getRuleContext(PrimaryNoNewArray_lfno_arrayAccessContext.class,0);
		}
		public ArrayAccessContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arrayAccess; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ClypsListener ) ((ClypsListener)listener).enterArrayAccess(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ClypsListener ) ((ClypsListener)listener).exitArrayAccess(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ClypsVisitor ) return ((ClypsVisitor<? extends T>)visitor).visitArrayAccess(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArrayAccessContext arrayAccess() throws RecognitionException {
		ArrayAccessContext _localctx = new ArrayAccessContext(_ctx, getState());
		enterRule(_localctx, 130, RULE_arrayAccess);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(707);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,59,_ctx) ) {
			case 1:
				{
				setState(697);
				expressionName();
				setState(698);
				match(LBRACK);
				setState(699);
				expression();
				setState(700);
				match(RBRACK);
				}
				break;
			case 2:
				{
				setState(702);
				primaryNoNewArray_lfno_arrayAccess();
				setState(703);
				match(LBRACK);
				setState(704);
				expression();
				setState(705);
				match(RBRACK);
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

	public static class ArrayAccess_lfno_primaryContext extends ParserRuleContext {
		public ExpressionNameContext expressionName() {
			return getRuleContext(ExpressionNameContext.class,0);
		}
		public TerminalNode LBRACK() { return getToken(ClypsParser.LBRACK, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode RBRACK() { return getToken(ClypsParser.RBRACK, 0); }
		public PrimaryNoNewArray_lfno_primary_lfno_arrayAccess_lfno_primaryContext primaryNoNewArray_lfno_primary_lfno_arrayAccess_lfno_primary() {
			return getRuleContext(PrimaryNoNewArray_lfno_primary_lfno_arrayAccess_lfno_primaryContext.class,0);
		}
		public ArrayAccess_lfno_primaryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arrayAccess_lfno_primary; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ClypsListener ) ((ClypsListener)listener).enterArrayAccess_lfno_primary(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ClypsListener ) ((ClypsListener)listener).exitArrayAccess_lfno_primary(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ClypsVisitor ) return ((ClypsVisitor<? extends T>)visitor).visitArrayAccess_lfno_primary(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArrayAccess_lfno_primaryContext arrayAccess_lfno_primary() throws RecognitionException {
		ArrayAccess_lfno_primaryContext _localctx = new ArrayAccess_lfno_primaryContext(_ctx, getState());
		enterRule(_localctx, 132, RULE_arrayAccess_lfno_primary);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(719);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Identifier:
				{
				setState(709);
				expressionName();
				setState(710);
				match(LBRACK);
				setState(711);
				expression();
				setState(712);
				match(RBRACK);
				}
				break;
			case IntegerLiteral:
			case FloatingPointLiteral:
			case BooleanLiteral:
			case CharacterLiteral:
			case StringLiteral:
			case NullLiteral:
			case LPAREN:
				{
				setState(714);
				primaryNoNewArray_lfno_primary_lfno_arrayAccess_lfno_primary();
				setState(715);
				match(LBRACK);
				setState(716);
				expression();
				setState(717);
				match(RBRACK);
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

	public static class MethodInvocationContext extends ParserRuleContext {
		public MethodNameContext methodName() {
			return getRuleContext(MethodNameContext.class,0);
		}
		public List<TerminalNode> LPAREN() { return getTokens(ClypsParser.LPAREN); }
		public TerminalNode LPAREN(int i) {
			return getToken(ClypsParser.LPAREN, i);
		}
		public List<TerminalNode> RPAREN() { return getTokens(ClypsParser.RPAREN); }
		public TerminalNode RPAREN(int i) {
			return getToken(ClypsParser.RPAREN, i);
		}
		public ArgumentListContext argumentList() {
			return getRuleContext(ArgumentListContext.class,0);
		}
		public MethodInvocationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_methodInvocation; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ClypsListener ) ((ClypsListener)listener).enterMethodInvocation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ClypsListener ) ((ClypsListener)listener).exitMethodInvocation(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ClypsVisitor ) return ((ClypsVisitor<? extends T>)visitor).visitMethodInvocation(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MethodInvocationContext methodInvocation() throws RecognitionException {
		MethodInvocationContext _localctx = new MethodInvocationContext(_ctx, getState());
		enterRule(_localctx, 134, RULE_methodInvocation);
		int _la;
		try {
			int _alt;
			setState(749);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,65,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(721);
				methodName();
				setState(722);
				match(LPAREN);
				setState(724);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (((((_la - 34)) & ~0x3f) == 0 && ((1L << (_la - 34)) & ((1L << (IntegerLiteral - 34)) | (1L << (FloatingPointLiteral - 34)) | (1L << (BooleanLiteral - 34)) | (1L << (CharacterLiteral - 34)) | (1L << (StringLiteral - 34)) | (1L << (NullLiteral - 34)) | (1L << (LPAREN - 34)) | (1L << (ASSIGN - 34)) | (1L << (GT - 34)) | (1L << (LT - 34)) | (1L << (BANG - 34)) | (1L << (TILDE - 34)) | (1L << (COLON - 34)) | (1L << (ADD - 34)) | (1L << (SUB - 34)) | (1L << (MUL - 34)) | (1L << (DIV - 34)) | (1L << (BITAND - 34)) | (1L << (BITOR - 34)) | (1L << (Identifier - 34)))) != 0)) {
					{
					setState(723);
					argumentList();
					}
				}

				setState(726);
				match(RPAREN);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(728);
				methodName();
				setState(731); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(729);
						match(LPAREN);
						setState(730);
						match(RPAREN);
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(733); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,62,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				setState(735);
				match(LPAREN);
				setState(737);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (((((_la - 34)) & ~0x3f) == 0 && ((1L << (_la - 34)) & ((1L << (IntegerLiteral - 34)) | (1L << (FloatingPointLiteral - 34)) | (1L << (BooleanLiteral - 34)) | (1L << (CharacterLiteral - 34)) | (1L << (StringLiteral - 34)) | (1L << (NullLiteral - 34)) | (1L << (LPAREN - 34)) | (1L << (ASSIGN - 34)) | (1L << (GT - 34)) | (1L << (LT - 34)) | (1L << (BANG - 34)) | (1L << (TILDE - 34)) | (1L << (COLON - 34)) | (1L << (ADD - 34)) | (1L << (SUB - 34)) | (1L << (MUL - 34)) | (1L << (DIV - 34)) | (1L << (BITAND - 34)) | (1L << (BITOR - 34)) | (1L << (Identifier - 34)))) != 0)) {
					{
					setState(736);
					argumentList();
					}
				}

				setState(739);
				match(RPAREN);
				setState(744);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==LPAREN) {
					{
					{
					setState(740);
					match(LPAREN);
					setState(741);
					match(RPAREN);
					}
					}
					setState(746);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				notifyErrorListeners("Redundant Parenthesis");
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

	public static class ArgumentListContext extends ParserRuleContext {
		public List<AssignmentExpressionContext> assignmentExpression() {
			return getRuleContexts(AssignmentExpressionContext.class);
		}
		public AssignmentExpressionContext assignmentExpression(int i) {
			return getRuleContext(AssignmentExpressionContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(ClypsParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(ClypsParser.COMMA, i);
		}
		public ArgumentListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_argumentList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ClypsListener ) ((ClypsListener)listener).enterArgumentList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ClypsListener ) ((ClypsListener)listener).exitArgumentList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ClypsVisitor ) return ((ClypsVisitor<? extends T>)visitor).visitArgumentList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArgumentListContext argumentList() throws RecognitionException {
		ArgumentListContext _localctx = new ArgumentListContext(_ctx, getState());
		enterRule(_localctx, 136, RULE_argumentList);
		int _la;
		try {
			setState(763);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,67,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(751);
				assignmentExpression();
				setState(756);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(752);
					match(COMMA);
					setState(753);
					assignmentExpression();
					}
					}
					setState(758);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(759);
				assignmentExpression();
				setState(760);
				assignmentExpression();
				notifyErrorListeners("Missing ,");
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

	public static class ArrayCreationExpressionContext extends ParserRuleContext {
		public UnannArrayTypeContext unannArrayType() {
			return getRuleContext(UnannArrayTypeContext.class,0);
		}
		public TerminalNode Identifier() { return getToken(ClypsParser.Identifier, 0); }
		public TerminalNode ASSIGN() { return getToken(ClypsParser.ASSIGN, 0); }
		public TerminalNode NEW() { return getToken(ClypsParser.NEW, 0); }
		public PrimitiveTypeContext primitiveType() {
			return getRuleContext(PrimitiveTypeContext.class,0);
		}
		public DimExprsContext dimExprs() {
			return getRuleContext(DimExprsContext.class,0);
		}
		public DimsContext dims() {
			return getRuleContext(DimsContext.class,0);
		}
		public ArrayInitializerContext arrayInitializer() {
			return getRuleContext(ArrayInitializerContext.class,0);
		}
		public ArrayCreationExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arrayCreationExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ClypsListener ) ((ClypsListener)listener).enterArrayCreationExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ClypsListener ) ((ClypsListener)listener).exitArrayCreationExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ClypsVisitor ) return ((ClypsVisitor<? extends T>)visitor).visitArrayCreationExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArrayCreationExpressionContext arrayCreationExpression() throws RecognitionException {
		ArrayCreationExpressionContext _localctx = new ArrayCreationExpressionContext(_ctx, getState());
		enterRule(_localctx, 138, RULE_arrayCreationExpression);
		int _la;
		try {
			setState(782);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,69,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(765);
				unannArrayType();
				setState(766);
				match(Identifier);
				setState(767);
				match(ASSIGN);
				setState(768);
				match(NEW);
				setState(769);
				primitiveType();
				setState(770);
				dimExprs();
				setState(772);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LBRACK) {
					{
					setState(771);
					dims();
					}
				}

				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(774);
				unannArrayType();
				setState(775);
				match(Identifier);
				setState(776);
				match(ASSIGN);
				setState(777);
				match(NEW);
				setState(778);
				primitiveType();
				setState(779);
				dims();
				setState(780);
				arrayInitializer();
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

	public static class DimExprsContext extends ParserRuleContext {
		public List<DimExprContext> dimExpr() {
			return getRuleContexts(DimExprContext.class);
		}
		public DimExprContext dimExpr(int i) {
			return getRuleContext(DimExprContext.class,i);
		}
		public DimExprsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dimExprs; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ClypsListener ) ((ClypsListener)listener).enterDimExprs(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ClypsListener ) ((ClypsListener)listener).exitDimExprs(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ClypsVisitor ) return ((ClypsVisitor<? extends T>)visitor).visitDimExprs(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DimExprsContext dimExprs() throws RecognitionException {
		DimExprsContext _localctx = new DimExprsContext(_ctx, getState());
		enterRule(_localctx, 140, RULE_dimExprs);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(784);
			dimExpr();
			setState(788);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,70,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(785);
					dimExpr();
					}
					} 
				}
				setState(790);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,70,_ctx);
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

	public static class DimExprContext extends ParserRuleContext {
		public TerminalNode LBRACK() { return getToken(ClypsParser.LBRACK, 0); }
		public TerminalNode StringLiteral() { return getToken(ClypsParser.StringLiteral, 0); }
		public TerminalNode RBRACK() { return getToken(ClypsParser.RBRACK, 0); }
		public TerminalNode ArrayNum() { return getToken(ClypsParser.ArrayNum, 0); }
		public DimExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dimExpr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ClypsListener ) ((ClypsListener)listener).enterDimExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ClypsListener ) ((ClypsListener)listener).exitDimExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ClypsVisitor ) return ((ClypsVisitor<? extends T>)visitor).visitDimExpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DimExprContext dimExpr() throws RecognitionException {
		DimExprContext _localctx = new DimExprContext(_ctx, getState());
		enterRule(_localctx, 142, RULE_dimExpr);
		try {
			setState(795);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LBRACK:
				enterOuterAlt(_localctx, 1);
				{
				setState(791);
				match(LBRACK);
				setState(792);
				match(StringLiteral);
				setState(793);
				match(RBRACK);
				}
				break;
			case ArrayNum:
				enterOuterAlt(_localctx, 2);
				{
				setState(794);
				match(ArrayNum);
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

	public static class ExpressionContext extends ParserRuleContext {
		public AssignmentExpressionContext assignmentExpression() {
			return getRuleContext(AssignmentExpressionContext.class,0);
		}
		public ConditionalExpressionContext conditionalExpression() {
			return getRuleContext(ConditionalExpressionContext.class,0);
		}
		public ExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ClypsListener ) ((ClypsListener)listener).enterExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ClypsListener ) ((ClypsListener)listener).exitExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ClypsVisitor ) return ((ClypsVisitor<? extends T>)visitor).visitExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpressionContext expression() throws RecognitionException {
		ExpressionContext _localctx = new ExpressionContext(_ctx, getState());
		enterRule(_localctx, 144, RULE_expression);
		try {
			setState(799);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,72,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(797);
				assignmentExpression();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(798);
				conditionalExpression();
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

	public static class AssignmentExpressionContext extends ParserRuleContext {
		public AssignmentContext assignment() {
			return getRuleContext(AssignmentContext.class,0);
		}
		public AssignmentExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignmentExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ClypsListener ) ((ClypsListener)listener).enterAssignmentExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ClypsListener ) ((ClypsListener)listener).exitAssignmentExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ClypsVisitor ) return ((ClypsVisitor<? extends T>)visitor).visitAssignmentExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AssignmentExpressionContext assignmentExpression() throws RecognitionException {
		AssignmentExpressionContext _localctx = new AssignmentExpressionContext(_ctx, getState());
		enterRule(_localctx, 146, RULE_assignmentExpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(801);
			assignment();
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

	public static class AssignmentContext extends ParserRuleContext {
		public LeftHandSideContext leftHandSide() {
			return getRuleContext(LeftHandSideContext.class,0);
		}
		public AssignmentOperatorContext assignmentOperator() {
			return getRuleContext(AssignmentOperatorContext.class,0);
		}
		public AdditiveExpressionContext additiveExpression() {
			return getRuleContext(AdditiveExpressionContext.class,0);
		}
		public AssignmentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignment; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ClypsListener ) ((ClypsListener)listener).enterAssignment(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ClypsListener ) ((ClypsListener)listener).exitAssignment(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ClypsVisitor ) return ((ClypsVisitor<? extends T>)visitor).visitAssignment(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AssignmentContext assignment() throws RecognitionException {
		AssignmentContext _localctx = new AssignmentContext(_ctx, getState());
		enterRule(_localctx, 148, RULE_assignment);
		try {
			setState(808);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,73,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(803);
				leftHandSide();
				setState(804);
				assignmentOperator();
				setState(805);
				additiveExpression(0);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(807);
				additiveExpression(0);
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

	public static class LeftHandSideContext extends ParserRuleContext {
		public ExpressionNameContext expressionName() {
			return getRuleContext(ExpressionNameContext.class,0);
		}
		public ArrayAccessContext arrayAccess() {
			return getRuleContext(ArrayAccessContext.class,0);
		}
		public LeftHandSideContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_leftHandSide; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ClypsListener ) ((ClypsListener)listener).enterLeftHandSide(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ClypsListener ) ((ClypsListener)listener).exitLeftHandSide(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ClypsVisitor ) return ((ClypsVisitor<? extends T>)visitor).visitLeftHandSide(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LeftHandSideContext leftHandSide() throws RecognitionException {
		LeftHandSideContext _localctx = new LeftHandSideContext(_ctx, getState());
		enterRule(_localctx, 150, RULE_leftHandSide);
		try {
			setState(812);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,74,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(810);
				expressionName();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(811);
				arrayAccess();
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

	public static class AssignmentOperatorContext extends ParserRuleContext {
		public TerminalNode ASSIGN() { return getToken(ClypsParser.ASSIGN, 0); }
		public TerminalNode MUL_ASSIGN() { return getToken(ClypsParser.MUL_ASSIGN, 0); }
		public TerminalNode DIV_ASSIGN() { return getToken(ClypsParser.DIV_ASSIGN, 0); }
		public TerminalNode MOD_ASSIGN() { return getToken(ClypsParser.MOD_ASSIGN, 0); }
		public TerminalNode ADD_ASSIGN() { return getToken(ClypsParser.ADD_ASSIGN, 0); }
		public TerminalNode SUB_ASSIGN() { return getToken(ClypsParser.SUB_ASSIGN, 0); }
		public AssignmentOperatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignmentOperator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ClypsListener ) ((ClypsListener)listener).enterAssignmentOperator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ClypsListener ) ((ClypsListener)listener).exitAssignmentOperator(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ClypsVisitor ) return ((ClypsVisitor<? extends T>)visitor).visitAssignmentOperator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AssignmentOperatorContext assignmentOperator() throws RecognitionException {
		AssignmentOperatorContext _localctx = new AssignmentOperatorContext(_ctx, getState());
		enterRule(_localctx, 152, RULE_assignmentOperator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(814);
			_la = _input.LA(1);
			if ( !(((((_la - 49)) & ~0x3f) == 0 && ((1L << (_la - 49)) & ((1L << (ASSIGN - 49)) | (1L << (ADD_ASSIGN - 49)) | (1L << (SUB_ASSIGN - 49)) | (1L << (MUL_ASSIGN - 49)) | (1L << (DIV_ASSIGN - 49)) | (1L << (MOD_ASSIGN - 49)))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
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

	public static class ExprContext extends ParserRuleContext {
		public ExprContext left;
		public Token atom;
		public Token op;
		public ExprContext right;
		public TerminalNode LPAREN() { return getToken(ClypsParser.LPAREN, 0); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode RPAREN() { return getToken(ClypsParser.RPAREN, 0); }
		public TerminalNode INT() { return getToken(ClypsParser.INT, 0); }
		public TerminalNode BOOLEAN() { return getToken(ClypsParser.BOOLEAN, 0); }
		public TerminalNode OR() { return getToken(ClypsParser.OR, 0); }
		public TerminalNode AND() { return getToken(ClypsParser.AND, 0); }
		public TerminalNode EQUAL() { return getToken(ClypsParser.EQUAL, 0); }
		public TerminalNode NOTEQUAL() { return getToken(ClypsParser.NOTEQUAL, 0); }
		public TerminalNode LT() { return getToken(ClypsParser.LT, 0); }
		public TerminalNode GT() { return getToken(ClypsParser.GT, 0); }
		public TerminalNode LE() { return getToken(ClypsParser.LE, 0); }
		public TerminalNode GE() { return getToken(ClypsParser.GE, 0); }
		public TerminalNode BANG() { return getToken(ClypsParser.BANG, 0); }
		public ExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ClypsListener ) ((ClypsListener)listener).enterExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ClypsListener ) ((ClypsListener)listener).exitExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ClypsVisitor ) return ((ClypsVisitor<? extends T>)visitor).visitExpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExprContext expr() throws RecognitionException {
		return expr(0);
	}

	private ExprContext expr(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExprContext _localctx = new ExprContext(_ctx, _parentState);
		ExprContext _prevctx = _localctx;
		int _startState = 154;
		enterRecursionRule(_localctx, 154, RULE_expr, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(823);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LPAREN:
				{
				setState(817);
				match(LPAREN);
				setState(818);
				expr(0);
				setState(819);
				match(RPAREN);
				}
				break;
			case INT:
				{
				setState(821);
				((ExprContext)_localctx).atom = match(INT);
				}
				break;
			case BOOLEAN:
				{
				setState(822);
				((ExprContext)_localctx).atom = match(BOOLEAN);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(830);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,76,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new ExprContext(_parentctx, _parentState);
					_localctx.left = _prevctx;
					_localctx.left = _prevctx;
					pushNewRecursionContext(_localctx, _startState, RULE_expr);
					setState(825);
					if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
					setState(826);
					((ExprContext)_localctx).op = _input.LT(1);
					_la = _input.LA(1);
					if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << GT) | (1L << LT) | (1L << BANG) | (1L << EQUAL) | (1L << LE) | (1L << GE) | (1L << NOTEQUAL) | (1L << AND) | (1L << OR))) != 0)) ) {
						((ExprContext)_localctx).op = (Token)_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(827);
					((ExprContext)_localctx).right = expr(5);
					}
					} 
				}
				setState(832);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,76,_ctx);
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

	public static class ConditionalExpressionContext extends ParserRuleContext {
		public ConditionalOrExpressionContext conditionalOrExpression() {
			return getRuleContext(ConditionalOrExpressionContext.class,0);
		}
		public ConditionalExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_conditionalExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ClypsListener ) ((ClypsListener)listener).enterConditionalExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ClypsListener ) ((ClypsListener)listener).exitConditionalExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ClypsVisitor ) return ((ClypsVisitor<? extends T>)visitor).visitConditionalExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConditionalExpressionContext conditionalExpression() throws RecognitionException {
		ConditionalExpressionContext _localctx = new ConditionalExpressionContext(_ctx, getState());
		enterRule(_localctx, 156, RULE_conditionalExpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(833);
			conditionalOrExpression(0);
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

	public static class ConditionalOrExpressionContext extends ParserRuleContext {
		public ConditionalAndExpressionContext conditionalAndExpression() {
			return getRuleContext(ConditionalAndExpressionContext.class,0);
		}
		public ConditionalOrExpressionContext conditionalOrExpression() {
			return getRuleContext(ConditionalOrExpressionContext.class,0);
		}
		public TerminalNode OR() { return getToken(ClypsParser.OR, 0); }
		public List<TerminalNode> BITOR() { return getTokens(ClypsParser.BITOR); }
		public TerminalNode BITOR(int i) {
			return getToken(ClypsParser.BITOR, i);
		}
		public ConditionalOrExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_conditionalOrExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ClypsListener ) ((ClypsListener)listener).enterConditionalOrExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ClypsListener ) ((ClypsListener)listener).exitConditionalOrExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ClypsVisitor ) return ((ClypsVisitor<? extends T>)visitor).visitConditionalOrExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConditionalOrExpressionContext conditionalOrExpression() throws RecognitionException {
		return conditionalOrExpression(0);
	}

	private ConditionalOrExpressionContext conditionalOrExpression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ConditionalOrExpressionContext _localctx = new ConditionalOrExpressionContext(_ctx, _parentState);
		ConditionalOrExpressionContext _prevctx = _localctx;
		int _startState = 158;
		enterRecursionRule(_localctx, 158, RULE_conditionalOrExpression, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(836);
			conditionalAndExpression(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(854);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,79,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(852);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,78,_ctx) ) {
					case 1:
						{
						_localctx = new ConditionalOrExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_conditionalOrExpression);
						setState(838);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(839);
						match(OR);
						setState(840);
						conditionalAndExpression(0);
						}
						break;
					case 2:
						{
						_localctx = new ConditionalOrExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_conditionalOrExpression);
						setState(841);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(842);
						match(OR);
						setState(846);
						_errHandler.sync(this);
						_alt = getInterpreter().adaptivePredict(_input,77,_ctx);
						while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
							if ( _alt==1 ) {
								{
								{
								setState(843);
								match(BITOR);
								}
								} 
							}
							setState(848);
							_errHandler.sync(this);
							_alt = getInterpreter().adaptivePredict(_input,77,_ctx);
						}
						setState(849);
						conditionalAndExpression(0);
						notifyErrorListeners("Too Many '|' Symbols");
						}
						break;
					}
					} 
				}
				setState(856);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,79,_ctx);
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

	public static class ConditionalAndExpressionContext extends ParserRuleContext {
		public InclusiveOrExpressionContext inclusiveOrExpression() {
			return getRuleContext(InclusiveOrExpressionContext.class,0);
		}
		public ConditionalAndExpressionContext conditionalAndExpression() {
			return getRuleContext(ConditionalAndExpressionContext.class,0);
		}
		public TerminalNode AND() { return getToken(ClypsParser.AND, 0); }
		public List<TerminalNode> BITAND() { return getTokens(ClypsParser.BITAND); }
		public TerminalNode BITAND(int i) {
			return getToken(ClypsParser.BITAND, i);
		}
		public ConditionalAndExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_conditionalAndExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ClypsListener ) ((ClypsListener)listener).enterConditionalAndExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ClypsListener ) ((ClypsListener)listener).exitConditionalAndExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ClypsVisitor ) return ((ClypsVisitor<? extends T>)visitor).visitConditionalAndExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConditionalAndExpressionContext conditionalAndExpression() throws RecognitionException {
		return conditionalAndExpression(0);
	}

	private ConditionalAndExpressionContext conditionalAndExpression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ConditionalAndExpressionContext _localctx = new ConditionalAndExpressionContext(_ctx, _parentState);
		ConditionalAndExpressionContext _prevctx = _localctx;
		int _startState = 160;
		enterRecursionRule(_localctx, 160, RULE_conditionalAndExpression, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(858);
			inclusiveOrExpression(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(876);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,82,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(874);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,81,_ctx) ) {
					case 1:
						{
						_localctx = new ConditionalAndExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_conditionalAndExpression);
						setState(860);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(861);
						match(AND);
						setState(862);
						inclusiveOrExpression(0);
						}
						break;
					case 2:
						{
						_localctx = new ConditionalAndExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_conditionalAndExpression);
						setState(863);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(864);
						match(AND);
						setState(868);
						_errHandler.sync(this);
						_alt = getInterpreter().adaptivePredict(_input,80,_ctx);
						while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
							if ( _alt==1 ) {
								{
								{
								setState(865);
								match(BITAND);
								}
								} 
							}
							setState(870);
							_errHandler.sync(this);
							_alt = getInterpreter().adaptivePredict(_input,80,_ctx);
						}
						setState(871);
						inclusiveOrExpression(0);
						notifyErrorListeners("Too Many '&' Symbols");
						}
						break;
					}
					} 
				}
				setState(878);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,82,_ctx);
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

	public static class InclusiveOrExpressionContext extends ParserRuleContext {
		public ExclusiveOrExpressionContext exclusiveOrExpression() {
			return getRuleContext(ExclusiveOrExpressionContext.class,0);
		}
		public InclusiveOrExpressionContext inclusiveOrExpression() {
			return getRuleContext(InclusiveOrExpressionContext.class,0);
		}
		public TerminalNode BITOR() { return getToken(ClypsParser.BITOR, 0); }
		public InclusiveOrExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_inclusiveOrExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ClypsListener ) ((ClypsListener)listener).enterInclusiveOrExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ClypsListener ) ((ClypsListener)listener).exitInclusiveOrExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ClypsVisitor ) return ((ClypsVisitor<? extends T>)visitor).visitInclusiveOrExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InclusiveOrExpressionContext inclusiveOrExpression() throws RecognitionException {
		return inclusiveOrExpression(0);
	}

	private InclusiveOrExpressionContext inclusiveOrExpression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		InclusiveOrExpressionContext _localctx = new InclusiveOrExpressionContext(_ctx, _parentState);
		InclusiveOrExpressionContext _prevctx = _localctx;
		int _startState = 162;
		enterRecursionRule(_localctx, 162, RULE_inclusiveOrExpression, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(880);
			exclusiveOrExpression(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(887);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,83,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new InclusiveOrExpressionContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_inclusiveOrExpression);
					setState(882);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(883);
					match(BITOR);
					setState(884);
					exclusiveOrExpression(0);
					}
					} 
				}
				setState(889);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,83,_ctx);
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

	public static class ExclusiveOrExpressionContext extends ParserRuleContext {
		public AndExpressionContext andExpression() {
			return getRuleContext(AndExpressionContext.class,0);
		}
		public ExclusiveOrExpressionContext exclusiveOrExpression() {
			return getRuleContext(ExclusiveOrExpressionContext.class,0);
		}
		public TerminalNode CARET() { return getToken(ClypsParser.CARET, 0); }
		public ExclusiveOrExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_exclusiveOrExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ClypsListener ) ((ClypsListener)listener).enterExclusiveOrExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ClypsListener ) ((ClypsListener)listener).exitExclusiveOrExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ClypsVisitor ) return ((ClypsVisitor<? extends T>)visitor).visitExclusiveOrExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExclusiveOrExpressionContext exclusiveOrExpression() throws RecognitionException {
		return exclusiveOrExpression(0);
	}

	private ExclusiveOrExpressionContext exclusiveOrExpression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExclusiveOrExpressionContext _localctx = new ExclusiveOrExpressionContext(_ctx, _parentState);
		ExclusiveOrExpressionContext _prevctx = _localctx;
		int _startState = 164;
		enterRecursionRule(_localctx, 164, RULE_exclusiveOrExpression, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(891);
			andExpression(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(898);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,84,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new ExclusiveOrExpressionContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_exclusiveOrExpression);
					setState(893);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(894);
					match(CARET);
					setState(895);
					andExpression(0);
					}
					} 
				}
				setState(900);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,84,_ctx);
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

	public static class AndExpressionContext extends ParserRuleContext {
		public EqualityExpressionContext equalityExpression() {
			return getRuleContext(EqualityExpressionContext.class,0);
		}
		public AndExpressionContext andExpression() {
			return getRuleContext(AndExpressionContext.class,0);
		}
		public TerminalNode BITAND() { return getToken(ClypsParser.BITAND, 0); }
		public AndExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_andExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ClypsListener ) ((ClypsListener)listener).enterAndExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ClypsListener ) ((ClypsListener)listener).exitAndExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ClypsVisitor ) return ((ClypsVisitor<? extends T>)visitor).visitAndExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AndExpressionContext andExpression() throws RecognitionException {
		return andExpression(0);
	}

	private AndExpressionContext andExpression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		AndExpressionContext _localctx = new AndExpressionContext(_ctx, _parentState);
		AndExpressionContext _prevctx = _localctx;
		int _startState = 166;
		enterRecursionRule(_localctx, 166, RULE_andExpression, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(902);
			equalityExpression(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(909);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,85,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new AndExpressionContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_andExpression);
					setState(904);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(905);
					match(BITAND);
					setState(906);
					equalityExpression(0);
					}
					} 
				}
				setState(911);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,85,_ctx);
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

	public static class EqualityExpressionContext extends ParserRuleContext {
		public RelationalExpressionContext relationalExpression() {
			return getRuleContext(RelationalExpressionContext.class,0);
		}
		public EqualityExpressionContext equalityExpression() {
			return getRuleContext(EqualityExpressionContext.class,0);
		}
		public TerminalNode ASSIGN() { return getToken(ClypsParser.ASSIGN, 0); }
		public TerminalNode EQUAL() { return getToken(ClypsParser.EQUAL, 0); }
		public TerminalNode NOTEQUAL() { return getToken(ClypsParser.NOTEQUAL, 0); }
		public EqualityExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_equalityExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ClypsListener ) ((ClypsListener)listener).enterEqualityExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ClypsListener ) ((ClypsListener)listener).exitEqualityExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ClypsVisitor ) return ((ClypsVisitor<? extends T>)visitor).visitEqualityExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EqualityExpressionContext equalityExpression() throws RecognitionException {
		return equalityExpression(0);
	}

	private EqualityExpressionContext equalityExpression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		EqualityExpressionContext _localctx = new EqualityExpressionContext(_ctx, _parentState);
		EqualityExpressionContext _prevctx = _localctx;
		int _startState = 168;
		enterRecursionRule(_localctx, 168, RULE_equalityExpression, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(913);
			relationalExpression(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(928);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,87,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(926);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,86,_ctx) ) {
					case 1:
						{
						_localctx = new EqualityExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_equalityExpression);
						setState(915);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(916);
						match(ASSIGN);
						setState(917);
						relationalExpression(0);
						notifyErrorListeners("Missing 1 '=' Symbol");
						}
						break;
					case 2:
						{
						_localctx = new EqualityExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_equalityExpression);
						setState(920);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(921);
						match(EQUAL);
						setState(922);
						relationalExpression(0);
						}
						break;
					case 3:
						{
						_localctx = new EqualityExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_equalityExpression);
						setState(923);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(924);
						match(NOTEQUAL);
						setState(925);
						relationalExpression(0);
						}
						break;
					}
					} 
				}
				setState(930);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,87,_ctx);
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

	public static class RelationalExpressionContext extends ParserRuleContext {
		public ShiftExpressionContext shiftExpression() {
			return getRuleContext(ShiftExpressionContext.class,0);
		}
		public RelationalExpressionContext relationalExpression() {
			return getRuleContext(RelationalExpressionContext.class,0);
		}
		public TerminalNode LT() { return getToken(ClypsParser.LT, 0); }
		public TerminalNode GT() { return getToken(ClypsParser.GT, 0); }
		public TerminalNode LE() { return getToken(ClypsParser.LE, 0); }
		public TerminalNode GE() { return getToken(ClypsParser.GE, 0); }
		public RelationalExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_relationalExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ClypsListener ) ((ClypsListener)listener).enterRelationalExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ClypsListener ) ((ClypsListener)listener).exitRelationalExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ClypsVisitor ) return ((ClypsVisitor<? extends T>)visitor).visitRelationalExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RelationalExpressionContext relationalExpression() throws RecognitionException {
		return relationalExpression(0);
	}

	private RelationalExpressionContext relationalExpression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		RelationalExpressionContext _localctx = new RelationalExpressionContext(_ctx, _parentState);
		RelationalExpressionContext _prevctx = _localctx;
		int _startState = 170;
		enterRecursionRule(_localctx, 170, RULE_relationalExpression, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(932);
			shiftExpression(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(948);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,89,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(946);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,88,_ctx) ) {
					case 1:
						{
						_localctx = new RelationalExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_relationalExpression);
						setState(934);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(935);
						match(LT);
						setState(936);
						shiftExpression(0);
						}
						break;
					case 2:
						{
						_localctx = new RelationalExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_relationalExpression);
						setState(937);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(938);
						match(GT);
						setState(939);
						shiftExpression(0);
						}
						break;
					case 3:
						{
						_localctx = new RelationalExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_relationalExpression);
						setState(940);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(941);
						match(LE);
						setState(942);
						shiftExpression(0);
						}
						break;
					case 4:
						{
						_localctx = new RelationalExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_relationalExpression);
						setState(943);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(944);
						match(GE);
						setState(945);
						shiftExpression(0);
						}
						break;
					}
					} 
				}
				setState(950);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,89,_ctx);
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

	public static class ShiftExpressionContext extends ParserRuleContext {
		public UnaryExpressionNotPlusMinusContext unaryExpressionNotPlusMinus() {
			return getRuleContext(UnaryExpressionNotPlusMinusContext.class,0);
		}
		public ShiftExpressionContext shiftExpression() {
			return getRuleContext(ShiftExpressionContext.class,0);
		}
		public List<TerminalNode> LT() { return getTokens(ClypsParser.LT); }
		public TerminalNode LT(int i) {
			return getToken(ClypsParser.LT, i);
		}
		public List<TerminalNode> GT() { return getTokens(ClypsParser.GT); }
		public TerminalNode GT(int i) {
			return getToken(ClypsParser.GT, i);
		}
		public ShiftExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_shiftExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ClypsListener ) ((ClypsListener)listener).enterShiftExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ClypsListener ) ((ClypsListener)listener).exitShiftExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ClypsVisitor ) return ((ClypsVisitor<? extends T>)visitor).visitShiftExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ShiftExpressionContext shiftExpression() throws RecognitionException {
		return shiftExpression(0);
	}

	private ShiftExpressionContext shiftExpression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ShiftExpressionContext _localctx = new ShiftExpressionContext(_ctx, _parentState);
		ShiftExpressionContext _prevctx = _localctx;
		int _startState = 172;
		enterRecursionRule(_localctx, 172, RULE_shiftExpression, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(952);
			unaryExpressionNotPlusMinus();
			}
			_ctx.stop = _input.LT(-1);
			setState(969);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,91,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(967);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,90,_ctx) ) {
					case 1:
						{
						_localctx = new ShiftExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_shiftExpression);
						setState(954);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(955);
						match(LT);
						setState(956);
						match(LT);
						setState(957);
						unaryExpressionNotPlusMinus();
						}
						break;
					case 2:
						{
						_localctx = new ShiftExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_shiftExpression);
						setState(958);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(959);
						match(GT);
						setState(960);
						match(GT);
						setState(961);
						unaryExpressionNotPlusMinus();
						}
						break;
					case 3:
						{
						_localctx = new ShiftExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_shiftExpression);
						setState(962);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(963);
						match(GT);
						setState(964);
						match(GT);
						setState(965);
						match(GT);
						setState(966);
						unaryExpressionNotPlusMinus();
						}
						break;
					}
					} 
				}
				setState(971);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,91,_ctx);
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

	public static class AdditiveExpressionContext extends ParserRuleContext {
		public MultiplicativeExpressionContext multiplicativeExpression() {
			return getRuleContext(MultiplicativeExpressionContext.class,0);
		}
		public AdditiveExpressionContext additiveExpression() {
			return getRuleContext(AdditiveExpressionContext.class,0);
		}
		public List<TerminalNode> ADD() { return getTokens(ClypsParser.ADD); }
		public TerminalNode ADD(int i) {
			return getToken(ClypsParser.ADD, i);
		}
		public TerminalNode INC() { return getToken(ClypsParser.INC, 0); }
		public List<TerminalNode> SUB() { return getTokens(ClypsParser.SUB); }
		public TerminalNode SUB(int i) {
			return getToken(ClypsParser.SUB, i);
		}
		public TerminalNode DEC() { return getToken(ClypsParser.DEC, 0); }
		public AdditiveExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_additiveExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ClypsListener ) ((ClypsListener)listener).enterAdditiveExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ClypsListener ) ((ClypsListener)listener).exitAdditiveExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ClypsVisitor ) return ((ClypsVisitor<? extends T>)visitor).visitAdditiveExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AdditiveExpressionContext additiveExpression() throws RecognitionException {
		return additiveExpression(0);
	}

	private AdditiveExpressionContext additiveExpression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		AdditiveExpressionContext _localctx = new AdditiveExpressionContext(_ctx, _parentState);
		AdditiveExpressionContext _prevctx = _localctx;
		int _startState = 174;
		enterRecursionRule(_localctx, 174, RULE_additiveExpression, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(973);
			multiplicativeExpression(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(1005);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,95,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(1003);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,94,_ctx) ) {
					case 1:
						{
						_localctx = new AdditiveExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_additiveExpression);
						setState(975);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(976);
						match(ADD);
						setState(977);
						multiplicativeExpression(0);
						}
						break;
					case 2:
						{
						_localctx = new AdditiveExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_additiveExpression);
						setState(978);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(979);
						match(INC);
						setState(983);
						_errHandler.sync(this);
						_alt = getInterpreter().adaptivePredict(_input,92,_ctx);
						while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
							if ( _alt==1 ) {
								{
								{
								setState(980);
								match(ADD);
								}
								} 
							}
							setState(985);
							_errHandler.sync(this);
							_alt = getInterpreter().adaptivePredict(_input,92,_ctx);
						}
						setState(986);
						multiplicativeExpression(0);
						notifyErrorListeners("Too Many '+' Symbols");
						}
						break;
					case 3:
						{
						_localctx = new AdditiveExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_additiveExpression);
						setState(989);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(990);
						match(SUB);
						setState(991);
						multiplicativeExpression(0);
						}
						break;
					case 4:
						{
						_localctx = new AdditiveExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_additiveExpression);
						setState(992);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(993);
						match(DEC);
						setState(997);
						_errHandler.sync(this);
						_alt = getInterpreter().adaptivePredict(_input,93,_ctx);
						while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
							if ( _alt==1 ) {
								{
								{
								setState(994);
								match(SUB);
								}
								} 
							}
							setState(999);
							_errHandler.sync(this);
							_alt = getInterpreter().adaptivePredict(_input,93,_ctx);
						}
						setState(1000);
						multiplicativeExpression(0);
						notifyErrorListeners("Too Many '-' Symbols");
						}
						break;
					}
					} 
				}
				setState(1007);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,95,_ctx);
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

	public static class MultiplicativeExpressionContext extends ParserRuleContext {
		public UnaryExpressionContext unaryExpression() {
			return getRuleContext(UnaryExpressionContext.class,0);
		}
		public MultiplicativeExpressionContext multiplicativeExpression() {
			return getRuleContext(MultiplicativeExpressionContext.class,0);
		}
		public List<TerminalNode> MUL() { return getTokens(ClypsParser.MUL); }
		public TerminalNode MUL(int i) {
			return getToken(ClypsParser.MUL, i);
		}
		public List<TerminalNode> DIV() { return getTokens(ClypsParser.DIV); }
		public TerminalNode DIV(int i) {
			return getToken(ClypsParser.DIV, i);
		}
		public List<TerminalNode> MOD() { return getTokens(ClypsParser.MOD); }
		public TerminalNode MOD(int i) {
			return getToken(ClypsParser.MOD, i);
		}
		public MultiplicativeExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_multiplicativeExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ClypsListener ) ((ClypsListener)listener).enterMultiplicativeExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ClypsListener ) ((ClypsListener)listener).exitMultiplicativeExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ClypsVisitor ) return ((ClypsVisitor<? extends T>)visitor).visitMultiplicativeExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MultiplicativeExpressionContext multiplicativeExpression() throws RecognitionException {
		return multiplicativeExpression(0);
	}

	private MultiplicativeExpressionContext multiplicativeExpression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		MultiplicativeExpressionContext _localctx = new MultiplicativeExpressionContext(_ctx, _parentState);
		MultiplicativeExpressionContext _prevctx = _localctx;
		int _startState = 176;
		enterRecursionRule(_localctx, 176, RULE_multiplicativeExpression, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(1009);
			unaryExpression();
			}
			_ctx.stop = _input.LT(-1);
			setState(1055);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,100,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(1053);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,99,_ctx) ) {
					case 1:
						{
						_localctx = new MultiplicativeExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_multiplicativeExpression);
						setState(1011);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(1012);
						match(MUL);
						setState(1013);
						unaryExpression();
						}
						break;
					case 2:
						{
						_localctx = new MultiplicativeExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_multiplicativeExpression);
						setState(1014);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(1015);
						match(T__7);
						setState(1019);
						_errHandler.sync(this);
						_alt = getInterpreter().adaptivePredict(_input,96,_ctx);
						while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
							if ( _alt==1 ) {
								{
								{
								setState(1016);
								match(MUL);
								}
								} 
							}
							setState(1021);
							_errHandler.sync(this);
							_alt = getInterpreter().adaptivePredict(_input,96,_ctx);
						}
						setState(1022);
						unaryExpression();
						notifyErrorListeners("Too Many '*' Symbols");
						}
						break;
					case 3:
						{
						_localctx = new MultiplicativeExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_multiplicativeExpression);
						setState(1025);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(1026);
						match(DIV);
						setState(1027);
						unaryExpression();
						}
						break;
					case 4:
						{
						_localctx = new MultiplicativeExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_multiplicativeExpression);
						setState(1028);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(1029);
						match(T__8);
						setState(1033);
						_errHandler.sync(this);
						_alt = getInterpreter().adaptivePredict(_input,97,_ctx);
						while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
							if ( _alt==1 ) {
								{
								{
								setState(1030);
								match(DIV);
								}
								} 
							}
							setState(1035);
							_errHandler.sync(this);
							_alt = getInterpreter().adaptivePredict(_input,97,_ctx);
						}
						setState(1036);
						unaryExpression();
						notifyErrorListeners("Too Many '/' Symbols");
						}
						break;
					case 5:
						{
						_localctx = new MultiplicativeExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_multiplicativeExpression);
						setState(1039);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(1040);
						match(MOD);
						setState(1041);
						unaryExpression();
						}
						break;
					case 6:
						{
						_localctx = new MultiplicativeExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_multiplicativeExpression);
						setState(1042);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(1043);
						match(T__9);
						setState(1047);
						_errHandler.sync(this);
						_la = _input.LA(1);
						while (_la==MOD) {
							{
							{
							setState(1044);
							match(MOD);
							}
							}
							setState(1049);
							_errHandler.sync(this);
							_la = _input.LA(1);
						}
						setState(1050);
						unaryExpression();
						notifyErrorListeners("Too Many '%' Symbols");
						}
						break;
					}
					} 
				}
				setState(1057);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,100,_ctx);
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

	public static class UnaryExpressionContext extends ParserRuleContext {
		public TerminalNode ADD() { return getToken(ClypsParser.ADD, 0); }
		public UnaryExpressionContext unaryExpression() {
			return getRuleContext(UnaryExpressionContext.class,0);
		}
		public TerminalNode SUB() { return getToken(ClypsParser.SUB, 0); }
		public UnaryExpressionNotPlusMinusContext unaryExpressionNotPlusMinus() {
			return getRuleContext(UnaryExpressionNotPlusMinusContext.class,0);
		}
		public UnaryExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_unaryExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ClypsListener ) ((ClypsListener)listener).enterUnaryExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ClypsListener ) ((ClypsListener)listener).exitUnaryExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ClypsVisitor ) return ((ClypsVisitor<? extends T>)visitor).visitUnaryExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final UnaryExpressionContext unaryExpression() throws RecognitionException {
		UnaryExpressionContext _localctx = new UnaryExpressionContext(_ctx, getState());
		enterRule(_localctx, 178, RULE_unaryExpression);
		try {
			setState(1063);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,101,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1058);
				match(ADD);
				setState(1059);
				unaryExpression();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1060);
				match(SUB);
				setState(1061);
				unaryExpression();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1062);
				unaryExpressionNotPlusMinus();
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

	public static class UnaryExpressionNotPlusMinusContext extends ParserRuleContext {
		public PostfixExpressionContext postfixExpression() {
			return getRuleContext(PostfixExpressionContext.class,0);
		}
		public TerminalNode TILDE() { return getToken(ClypsParser.TILDE, 0); }
		public UnaryExpressionContext unaryExpression() {
			return getRuleContext(UnaryExpressionContext.class,0);
		}
		public TerminalNode BANG() { return getToken(ClypsParser.BANG, 0); }
		public UnaryExpressionNotPlusMinusContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_unaryExpressionNotPlusMinus; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ClypsListener ) ((ClypsListener)listener).enterUnaryExpressionNotPlusMinus(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ClypsListener ) ((ClypsListener)listener).exitUnaryExpressionNotPlusMinus(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ClypsVisitor ) return ((ClypsVisitor<? extends T>)visitor).visitUnaryExpressionNotPlusMinus(this);
			else return visitor.visitChildren(this);
		}
	}

	public final UnaryExpressionNotPlusMinusContext unaryExpressionNotPlusMinus() throws RecognitionException {
		UnaryExpressionNotPlusMinusContext _localctx = new UnaryExpressionNotPlusMinusContext(_ctx, getState());
		enterRule(_localctx, 180, RULE_unaryExpressionNotPlusMinus);
		try {
			setState(1070);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IntegerLiteral:
			case FloatingPointLiteral:
			case BooleanLiteral:
			case CharacterLiteral:
			case StringLiteral:
			case NullLiteral:
			case LPAREN:
			case ASSIGN:
			case GT:
			case LT:
			case COLON:
			case ADD:
			case SUB:
			case MUL:
			case DIV:
			case BITAND:
			case BITOR:
			case Identifier:
				enterOuterAlt(_localctx, 1);
				{
				setState(1065);
				postfixExpression();
				}
				break;
			case TILDE:
				enterOuterAlt(_localctx, 2);
				{
				setState(1066);
				match(TILDE);
				setState(1067);
				unaryExpression();
				}
				break;
			case BANG:
				enterOuterAlt(_localctx, 3);
				{
				setState(1068);
				match(BANG);
				setState(1069);
				unaryExpression();
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

	public static class PostfixExpressionContext extends ParserRuleContext {
		public PrimaryContext primary() {
			return getRuleContext(PrimaryContext.class,0);
		}
		public ExpressionNameContext expressionName() {
			return getRuleContext(ExpressionNameContext.class,0);
		}
		public List<TerminalNode> LPAREN() { return getTokens(ClypsParser.LPAREN); }
		public TerminalNode LPAREN(int i) {
			return getToken(ClypsParser.LPAREN, i);
		}
		public List<TerminalNode> RPAREN() { return getTokens(ClypsParser.RPAREN); }
		public TerminalNode RPAREN(int i) {
			return getToken(ClypsParser.RPAREN, i);
		}
		public List<TerminalNode> GT() { return getTokens(ClypsParser.GT); }
		public TerminalNode GT(int i) {
			return getToken(ClypsParser.GT, i);
		}
		public List<TerminalNode> LT() { return getTokens(ClypsParser.LT); }
		public TerminalNode LT(int i) {
			return getToken(ClypsParser.LT, i);
		}
		public List<TerminalNode> ADD() { return getTokens(ClypsParser.ADD); }
		public TerminalNode ADD(int i) {
			return getToken(ClypsParser.ADD, i);
		}
		public List<TerminalNode> SUB() { return getTokens(ClypsParser.SUB); }
		public TerminalNode SUB(int i) {
			return getToken(ClypsParser.SUB, i);
		}
		public List<TerminalNode> MUL() { return getTokens(ClypsParser.MUL); }
		public TerminalNode MUL(int i) {
			return getToken(ClypsParser.MUL, i);
		}
		public List<TerminalNode> DIV() { return getTokens(ClypsParser.DIV); }
		public TerminalNode DIV(int i) {
			return getToken(ClypsParser.DIV, i);
		}
		public List<TerminalNode> ASSIGN() { return getTokens(ClypsParser.ASSIGN); }
		public TerminalNode ASSIGN(int i) {
			return getToken(ClypsParser.ASSIGN, i);
		}
		public List<TerminalNode> BITAND() { return getTokens(ClypsParser.BITAND); }
		public TerminalNode BITAND(int i) {
			return getToken(ClypsParser.BITAND, i);
		}
		public List<TerminalNode> BITOR() { return getTokens(ClypsParser.BITOR); }
		public TerminalNode BITOR(int i) {
			return getToken(ClypsParser.BITOR, i);
		}
		public List<TerminalNode> COLON() { return getTokens(ClypsParser.COLON); }
		public TerminalNode COLON(int i) {
			return getToken(ClypsParser.COLON, i);
		}
		public PostfixExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_postfixExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ClypsListener ) ((ClypsListener)listener).enterPostfixExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ClypsListener ) ((ClypsListener)listener).exitPostfixExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ClypsVisitor ) return ((ClypsVisitor<? extends T>)visitor).visitPostfixExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PostfixExpressionContext postfixExpression() throws RecognitionException {
		PostfixExpressionContext _localctx = new PostfixExpressionContext(_ctx, getState());
		enterRule(_localctx, 182, RULE_postfixExpression);
		int _la;
		try {
			int _alt;
			setState(1089);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,105,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1072);
				primary();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1073);
				expressionName();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1074);
				primary();
				setState(1077); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(1075);
						match(LPAREN);
						setState(1076);
						match(RPAREN);
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(1079); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,103,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				notifyErrorListeners("Redundant Parenthesis");
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(1084); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(1083);
						_la = _input.LA(1);
						if ( !(((((_la - 49)) & ~0x3f) == 0 && ((1L << (_la - 49)) & ((1L << (ASSIGN - 49)) | (1L << (GT - 49)) | (1L << (LT - 49)) | (1L << (COLON - 49)) | (1L << (ADD - 49)) | (1L << (SUB - 49)) | (1L << (MUL - 49)) | (1L << (DIV - 49)) | (1L << (BITAND - 49)) | (1L << (BITOR - 49)))) != 0)) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(1086); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,104,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				notifyErrorListeners("Invalid Expression");
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

	public static class PostIncrementExpressionContext extends ParserRuleContext {
		public PostfixExpressionContext postfixExpression() {
			return getRuleContext(PostfixExpressionContext.class,0);
		}
		public TerminalNode INC() { return getToken(ClypsParser.INC, 0); }
		public PostIncrementExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_postIncrementExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ClypsListener ) ((ClypsListener)listener).enterPostIncrementExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ClypsListener ) ((ClypsListener)listener).exitPostIncrementExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ClypsVisitor ) return ((ClypsVisitor<? extends T>)visitor).visitPostIncrementExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PostIncrementExpressionContext postIncrementExpression() throws RecognitionException {
		PostIncrementExpressionContext _localctx = new PostIncrementExpressionContext(_ctx, getState());
		enterRule(_localctx, 184, RULE_postIncrementExpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1091);
			postfixExpression();
			setState(1092);
			match(INC);
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

	public static class PostDecrementExpressionContext extends ParserRuleContext {
		public PostfixExpressionContext postfixExpression() {
			return getRuleContext(PostfixExpressionContext.class,0);
		}
		public TerminalNode DEC() { return getToken(ClypsParser.DEC, 0); }
		public PostDecrementExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_postDecrementExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ClypsListener ) ((ClypsListener)listener).enterPostDecrementExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ClypsListener ) ((ClypsListener)listener).exitPostDecrementExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ClypsVisitor ) return ((ClypsVisitor<? extends T>)visitor).visitPostDecrementExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PostDecrementExpressionContext postDecrementExpression() throws RecognitionException {
		PostDecrementExpressionContext _localctx = new PostDecrementExpressionContext(_ctx, getState());
		enterRule(_localctx, 186, RULE_postDecrementExpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1094);
			postfixExpression();
			setState(1095);
			match(DEC);
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

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 45:
			return printBlock_sempred((PrintBlockContext)_localctx, predIndex);
		case 77:
			return expr_sempred((ExprContext)_localctx, predIndex);
		case 79:
			return conditionalOrExpression_sempred((ConditionalOrExpressionContext)_localctx, predIndex);
		case 80:
			return conditionalAndExpression_sempred((ConditionalAndExpressionContext)_localctx, predIndex);
		case 81:
			return inclusiveOrExpression_sempred((InclusiveOrExpressionContext)_localctx, predIndex);
		case 82:
			return exclusiveOrExpression_sempred((ExclusiveOrExpressionContext)_localctx, predIndex);
		case 83:
			return andExpression_sempred((AndExpressionContext)_localctx, predIndex);
		case 84:
			return equalityExpression_sempred((EqualityExpressionContext)_localctx, predIndex);
		case 85:
			return relationalExpression_sempred((RelationalExpressionContext)_localctx, predIndex);
		case 86:
			return shiftExpression_sempred((ShiftExpressionContext)_localctx, predIndex);
		case 87:
			return additiveExpression_sempred((AdditiveExpressionContext)_localctx, predIndex);
		case 88:
			return multiplicativeExpression_sempred((MultiplicativeExpressionContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean printBlock_sempred(PrintBlockContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 2);
		}
		return true;
	}
	private boolean expr_sempred(ExprContext _localctx, int predIndex) {
		switch (predIndex) {
		case 1:
			return precpred(_ctx, 4);
		}
		return true;
	}
	private boolean conditionalOrExpression_sempred(ConditionalOrExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 2:
			return precpred(_ctx, 2);
		case 3:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean conditionalAndExpression_sempred(ConditionalAndExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 4:
			return precpred(_ctx, 2);
		case 5:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean inclusiveOrExpression_sempred(InclusiveOrExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 6:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean exclusiveOrExpression_sempred(ExclusiveOrExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 7:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean andExpression_sempred(AndExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 8:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean equalityExpression_sempred(EqualityExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 9:
			return precpred(_ctx, 3);
		case 10:
			return precpred(_ctx, 2);
		case 11:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean relationalExpression_sempred(RelationalExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 12:
			return precpred(_ctx, 4);
		case 13:
			return precpred(_ctx, 3);
		case 14:
			return precpred(_ctx, 2);
		case 15:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean shiftExpression_sempred(ShiftExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 16:
			return precpred(_ctx, 3);
		case 17:
			return precpred(_ctx, 2);
		case 18:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean additiveExpression_sempred(AdditiveExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 19:
			return precpred(_ctx, 4);
		case 20:
			return precpred(_ctx, 3);
		case 21:
			return precpred(_ctx, 2);
		case 22:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean multiplicativeExpression_sempred(MultiplicativeExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 23:
			return precpred(_ctx, 6);
		case 24:
			return precpred(_ctx, 5);
		case 25:
			return precpred(_ctx, 4);
		case 26:
			return precpred(_ctx, 3);
		case 27:
			return precpred(_ctx, 2);
		case 28:
			return precpred(_ctx, 1);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3]\u044c\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t;\4<\t<\4=\t="+
		"\4>\t>\4?\t?\4@\t@\4A\tA\4B\tB\4C\tC\4D\tD\4E\tE\4F\tF\4G\tG\4H\tH\4I"+
		"\tI\4J\tJ\4K\tK\4L\tL\4M\tM\4N\tN\4O\tO\4P\tP\4Q\tQ\4R\tR\4S\tS\4T\tT"+
		"\4U\tU\4V\tV\4W\tW\4X\tX\4Y\tY\4Z\tZ\4[\t[\4\\\t\\\4]\t]\4^\t^\4_\t_\3"+
		"\2\3\2\3\3\3\3\5\3\u00c3\n\3\3\4\3\4\5\4\u00c7\n\4\3\5\3\5\3\6\3\6\3\7"+
		"\3\7\5\7\u00cf\n\7\3\b\3\b\3\t\3\t\3\t\3\t\3\t\3\t\5\t\u00d9\n\t\3\n\3"+
		"\n\3\n\3\n\7\n\u00df\n\n\f\n\16\n\u00e2\13\n\3\13\3\13\3\f\3\f\3\r\3\r"+
		"\3\r\3\r\3\16\3\16\5\16\u00ee\n\16\3\16\3\16\3\17\7\17\u00f3\n\17\f\17"+
		"\16\17\u00f6\13\17\3\20\3\20\5\20\u00fa\n\20\3\21\3\21\3\21\3\21\3\21"+
		"\3\22\3\22\3\22\7\22\u0104\n\22\f\22\16\22\u0107\13\22\3\23\3\23\3\23"+
		"\3\23\3\24\3\24\5\24\u010f\n\24\3\25\3\25\3\25\3\25\3\25\3\25\5\25\u0117"+
		"\n\25\3\26\3\26\5\26\u011b\n\26\3\27\3\27\5\27\u011f\n\27\3\30\3\30\3"+
		"\31\3\31\3\31\3\31\3\31\3\31\5\31\u0129\n\31\3\32\3\32\3\32\3\33\3\33"+
		"\3\33\3\34\3\34\5\34\u0133\n\34\3\35\3\35\3\35\5\35\u0138\n\35\3\35\3"+
		"\35\5\35\u013c\n\35\3\36\3\36\3\36\3\36\3\36\3\36\5\36\u0144\n\36\3\37"+
		"\3\37\3\37\7\37\u0149\n\37\f\37\16\37\u014c\13\37\3\37\3\37\3\37\7\37"+
		"\u0151\n\37\f\37\16\37\u0154\13\37\5\37\u0156\n\37\3 \7 \u0159\n \f \16"+
		" \u015c\13 \3 \3 \3 \3!\3!\3!\5!\u0164\n!\3\"\7\"\u0167\n\"\f\"\16\"\u016a"+
		"\13\"\3\"\3\"\3\"\3\"\3\"\5\"\u0171\n\"\3#\3#\3#\5#\u0176\n#\3#\3#\3$"+
		"\3$\3%\3%\5%\u017e\n%\3%\5%\u0181\n%\3%\3%\3&\3&\3&\7&\u0188\n&\f&\16"+
		"&\u018b\13&\3\'\3\'\5\'\u018f\n\'\3\'\3\'\3(\6(\u0194\n(\r(\16(\u0195"+
		"\3)\3)\3)\5)\u019b\n)\3*\3*\3*\3+\3+\3+\3,\7,\u01a4\n,\f,\16,\u01a7\13"+
		",\3,\3,\3,\3,\7,\u01ad\n,\f,\16,\u01b0\13,\3,\3,\3,\3,\3,\3,\3,\3,\3,"+
		"\3,\5,\u01bc\n,\3-\3-\3-\3-\3-\3-\3-\3-\3-\3-\3-\3-\3-\3-\3-\3-\3-\3-"+
		"\5-\u01d0\n-\3.\3.\3.\3.\3.\3.\3.\3.\3.\7.\u01db\n.\f.\16.\u01de\13.\3"+
		".\7.\u01e1\n.\f.\16.\u01e4\13.\3.\3.\3.\5.\u01e9\n.\3/\3/\3/\3/\3/\3/"+
		"\7/\u01f1\n/\f/\16/\u01f4\13/\3\60\3\60\3\60\3\60\3\60\3\60\3\60\3\60"+
		"\3\60\3\60\3\60\3\60\3\60\6\60\u0203\n\60\r\60\16\60\u0204\3\60\3\60\3"+
		"\60\6\60\u020a\n\60\r\60\16\60\u020b\3\60\3\60\3\60\6\60\u0211\n\60\r"+
		"\60\16\60\u0212\3\60\3\60\3\60\6\60\u0218\n\60\r\60\16\60\u0219\3\60\3"+
		"\60\3\60\6\60\u021f\n\60\r\60\16\60\u0220\3\60\5\60\u0224\n\60\3\61\3"+
		"\61\3\61\3\61\3\61\3\61\3\62\3\62\3\62\6\62\u022f\n\62\r\62\16\62\u0230"+
		"\3\62\3\62\3\62\7\62\u0236\n\62\f\62\16\62\u0239\13\62\5\62\u023b\n\62"+
		"\3\63\3\63\3\63\3\63\5\63\u0241\n\63\3\64\3\64\3\65\3\65\3\65\3\65\5\65"+
		"\u0249\n\65\3\66\3\66\3\66\3\66\3\66\3\66\3\67\3\67\3\67\3\67\3\67\3\67"+
		"\3\67\3\67\38\38\38\38\38\38\39\39\39\39\39\39\39\39\3:\3:\3:\3:\3:\3"+
		":\3:\3:\3:\3:\3:\3:\3:\3:\3:\3:\3:\3:\3:\5:\u027a\n:\3;\3;\3;\3;\3;\3"+
		";\3;\3;\3;\3;\3;\3;\5;\u0288\n;\3<\3<\3=\3=\3=\7=\u028f\n=\f=\16=\u0292"+
		"\13=\3>\3>\3>\3>\3>\3>\7>\u029a\n>\f>\16>\u029d\13>\3>\3>\5>\u02a1\n>"+
		"\3?\3?\3@\3@\3@\3@\3@\3@\5@\u02ab\n@\3A\3A\3A\3A\3A\3A\5A\u02b3\nA\3B"+
		"\3B\3B\3B\3B\5B\u02ba\nB\3C\3C\3C\3C\3C\3C\3C\3C\3C\3C\5C\u02c6\nC\3D"+
		"\3D\3D\3D\3D\3D\3D\3D\3D\3D\5D\u02d2\nD\3E\3E\3E\5E\u02d7\nE\3E\3E\3E"+
		"\3E\3E\6E\u02de\nE\rE\16E\u02df\3E\3E\5E\u02e4\nE\3E\3E\3E\7E\u02e9\n"+
		"E\fE\16E\u02ec\13E\3E\3E\5E\u02f0\nE\3F\3F\3F\7F\u02f5\nF\fF\16F\u02f8"+
		"\13F\3F\3F\3F\3F\5F\u02fe\nF\3G\3G\3G\3G\3G\3G\3G\5G\u0307\nG\3G\3G\3"+
		"G\3G\3G\3G\3G\3G\5G\u0311\nG\3H\3H\7H\u0315\nH\fH\16H\u0318\13H\3I\3I"+
		"\3I\3I\5I\u031e\nI\3J\3J\5J\u0322\nJ\3K\3K\3L\3L\3L\3L\3L\5L\u032b\nL"+
		"\3M\3M\5M\u032f\nM\3N\3N\3O\3O\3O\3O\3O\3O\3O\5O\u033a\nO\3O\3O\3O\7O"+
		"\u033f\nO\fO\16O\u0342\13O\3P\3P\3Q\3Q\3Q\3Q\3Q\3Q\3Q\3Q\3Q\7Q\u034f\n"+
		"Q\fQ\16Q\u0352\13Q\3Q\3Q\3Q\7Q\u0357\nQ\fQ\16Q\u035a\13Q\3R\3R\3R\3R\3"+
		"R\3R\3R\3R\3R\7R\u0365\nR\fR\16R\u0368\13R\3R\3R\3R\7R\u036d\nR\fR\16"+
		"R\u0370\13R\3S\3S\3S\3S\3S\3S\7S\u0378\nS\fS\16S\u037b\13S\3T\3T\3T\3"+
		"T\3T\3T\7T\u0383\nT\fT\16T\u0386\13T\3U\3U\3U\3U\3U\3U\7U\u038e\nU\fU"+
		"\16U\u0391\13U\3V\3V\3V\3V\3V\3V\3V\3V\3V\3V\3V\3V\3V\3V\7V\u03a1\nV\f"+
		"V\16V\u03a4\13V\3W\3W\3W\3W\3W\3W\3W\3W\3W\3W\3W\3W\3W\3W\3W\7W\u03b5"+
		"\nW\fW\16W\u03b8\13W\3X\3X\3X\3X\3X\3X\3X\3X\3X\3X\3X\3X\3X\3X\3X\3X\7"+
		"X\u03ca\nX\fX\16X\u03cd\13X\3Y\3Y\3Y\3Y\3Y\3Y\3Y\3Y\3Y\7Y\u03d8\nY\fY"+
		"\16Y\u03db\13Y\3Y\3Y\3Y\3Y\3Y\3Y\3Y\3Y\3Y\7Y\u03e6\nY\fY\16Y\u03e9\13"+
		"Y\3Y\3Y\3Y\7Y\u03ee\nY\fY\16Y\u03f1\13Y\3Z\3Z\3Z\3Z\3Z\3Z\3Z\3Z\3Z\7Z"+
		"\u03fc\nZ\fZ\16Z\u03ff\13Z\3Z\3Z\3Z\3Z\3Z\3Z\3Z\3Z\3Z\7Z\u040a\nZ\fZ\16"+
		"Z\u040d\13Z\3Z\3Z\3Z\3Z\3Z\3Z\3Z\3Z\3Z\7Z\u0418\nZ\fZ\16Z\u041b\13Z\3"+
		"Z\3Z\3Z\7Z\u0420\nZ\fZ\16Z\u0423\13Z\3[\3[\3[\3[\3[\5[\u042a\n[\3\\\3"+
		"\\\3\\\3\\\3\\\5\\\u0431\n\\\3]\3]\3]\3]\3]\6]\u0438\n]\r]\16]\u0439\3"+
		"]\3]\3]\6]\u043f\n]\r]\16]\u0440\3]\5]\u0444\n]\3^\3^\3^\3_\3_\3_\3_\2"+
		"\16\\\u009c\u00a0\u00a2\u00a4\u00a6\u00a8\u00aa\u00ac\u00ae\u00b0\u00b2"+
		"`\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&(*,.\60\62\64\668:<>@BDF"+
		"HJLNPRTVXZ\\^`bdfhjlnprtvxz|~\u0080\u0082\u0084\u0086\u0088\u008a\u008c"+
		"\u008e\u0090\u0092\u0094\u0096\u0098\u009a\u009c\u009e\u00a0\u00a2\u00a4"+
		"\u00a6\u00a8\u00aa\u00ac\u00ae\u00b0\u00b2\u00b4\u00b6\u00b8\u00ba\u00bc"+
		"\2\13\3\2$)\5\2\17\20\32\33  \4\2\24\24\27\27\4\2((WW\13\2\6\7$$\62\62"+
		"\66\6699DDFFHIXX\6\2\4\4\r\r\27\27\32\32\5\2\63\63LOSS\4\2\64\66:?\5\2"+
		"\63\6599BG\2\u0483\2\u00be\3\2\2\2\4\u00c2\3\2\2\2\6\u00c6\3\2\2\2\b\u00c8"+
		"\3\2\2\2\n\u00ca\3\2\2\2\f\u00ce\3\2\2\2\16\u00d0\3\2\2\2\20\u00d8\3\2"+
		"\2\2\22\u00da\3\2\2\2\24\u00e3\3\2\2\2\26\u00e5\3\2\2\2\30\u00e7\3\2\2"+
		"\2\32\u00eb\3\2\2\2\34\u00f4\3\2\2\2\36\u00f9\3\2\2\2 \u00fb\3\2\2\2\""+
		"\u0100\3\2\2\2$\u0108\3\2\2\2&\u010c\3\2\2\2(\u0116\3\2\2\2*\u011a\3\2"+
		"\2\2,\u011e\3\2\2\2.\u0120\3\2\2\2\60\u0128\3\2\2\2\62\u012a\3\2\2\2\64"+
		"\u012d\3\2\2\2\66\u0132\3\2\2\28\u0134\3\2\2\2:\u0143\3\2\2\2<\u0155\3"+
		"\2\2\2>\u015a\3\2\2\2@\u0163\3\2\2\2B\u0170\3\2\2\2D\u0172\3\2\2\2F\u0179"+
		"\3\2\2\2H\u017b\3\2\2\2J\u0184\3\2\2\2L\u018c\3\2\2\2N\u0193\3\2\2\2P"+
		"\u019a\3\2\2\2R\u019c\3\2\2\2T\u019f\3\2\2\2V\u01bb\3\2\2\2X\u01cf\3\2"+
		"\2\2Z\u01e8\3\2\2\2\\\u01ea\3\2\2\2^\u0223\3\2\2\2`\u0225\3\2\2\2b\u023a"+
		"\3\2\2\2d\u0240\3\2\2\2f\u0242\3\2\2\2h\u0248\3\2\2\2j\u024a\3\2\2\2l"+
		"\u0250\3\2\2\2n\u0258\3\2\2\2p\u025e\3\2\2\2r\u0279\3\2\2\2t\u0287\3\2"+
		"\2\2v\u0289\3\2\2\2x\u028b\3\2\2\2z\u02a0\3\2\2\2|\u02a2\3\2\2\2~\u02aa"+
		"\3\2\2\2\u0080\u02b2\3\2\2\2\u0082\u02b9\3\2\2\2\u0084\u02c5\3\2\2\2\u0086"+
		"\u02d1\3\2\2\2\u0088\u02ef\3\2\2\2\u008a\u02fd\3\2\2\2\u008c\u0310\3\2"+
		"\2\2\u008e\u0312\3\2\2\2\u0090\u031d\3\2\2\2\u0092\u0321\3\2\2\2\u0094"+
		"\u0323\3\2\2\2\u0096\u032a\3\2\2\2\u0098\u032e\3\2\2\2\u009a\u0330\3\2"+
		"\2\2\u009c\u0339\3\2\2\2\u009e\u0343\3\2\2\2\u00a0\u0345\3\2\2\2\u00a2"+
		"\u035b\3\2\2\2\u00a4\u0371\3\2\2\2\u00a6\u037c\3\2\2\2\u00a8\u0387\3\2"+
		"\2\2\u00aa\u0392\3\2\2\2\u00ac\u03a5\3\2\2\2\u00ae\u03b9\3\2\2\2\u00b0"+
		"\u03ce\3\2\2\2\u00b2\u03f2\3\2\2\2\u00b4\u0429\3\2\2\2\u00b6\u0430\3\2"+
		"\2\2\u00b8\u0443\3\2\2\2\u00ba\u0445\3\2\2\2\u00bc\u0448\3\2\2\2\u00be"+
		"\u00bf\t\2\2\2\u00bf\3\3\2\2\2\u00c0\u00c3\5\6\4\2\u00c1\u00c3\7\r\2\2"+
		"\u00c2\u00c0\3\2\2\2\u00c2\u00c1\3\2\2\2\u00c3\5\3\2\2\2\u00c4\u00c7\5"+
		"\b\5\2\u00c5\u00c7\5\n\6\2\u00c6\u00c4\3\2\2\2\u00c6\u00c5\3\2\2\2\u00c7"+
		"\7\3\2\2\2\u00c8\u00c9\t\3\2\2\u00c9\t\3\2\2\2\u00ca\u00cb\t\4\2\2\u00cb"+
		"\13\3\2\2\2\u00cc\u00cf\5\16\b\2\u00cd\u00cf\5\20\t\2\u00ce\u00cc\3\2"+
		"\2\2\u00ce\u00cd\3\2\2\2\u00cf\r\3\2\2\2\u00d0\u00d1\7W\2\2\u00d1\17\3"+
		"\2\2\2\u00d2\u00d3\5\4\3\2\u00d3\u00d4\5\22\n\2\u00d4\u00d9\3\2\2\2\u00d5"+
		"\u00d6\5\16\b\2\u00d6\u00d7\5\22\n\2\u00d7\u00d9\3\2\2\2\u00d8\u00d2\3"+
		"\2\2\2\u00d8\u00d5\3\2\2\2\u00d9\21\3\2\2\2\u00da\u00db\7.\2\2\u00db\u00e0"+
		"\7/\2\2\u00dc\u00dd\7.\2\2\u00dd\u00df\7/\2\2\u00de\u00dc\3\2\2\2\u00df"+
		"\u00e2\3\2\2\2\u00e0\u00de\3\2\2\2\u00e0\u00e1\3\2\2\2\u00e1\23\3\2\2"+
		"\2\u00e2\u00e0\3\2\2\2\u00e3\u00e4\7W\2\2\u00e4\25\3\2\2\2\u00e5\u00e6"+
		"\7W\2\2\u00e6\27\3\2\2\2\u00e7\u00e8\7\21\2\2\u00e8\u00e9\7W\2\2\u00e9"+
		"\u00ea\5\32\16\2\u00ea\31\3\2\2\2\u00eb\u00ed\7,\2\2\u00ec\u00ee\5\34"+
		"\17\2\u00ed\u00ec\3\2\2\2\u00ed\u00ee\3\2\2\2\u00ee\u00ef\3\2\2\2\u00ef"+
		"\u00f0\7-\2\2\u00f0\33\3\2\2\2\u00f1\u00f3\5\36\20\2\u00f2\u00f1\3\2\2"+
		"\2\u00f3\u00f6\3\2\2\2\u00f4\u00f2\3\2\2\2\u00f4\u00f5\3\2\2\2\u00f5\35"+
		"\3\2\2\2\u00f6\u00f4\3\2\2\2\u00f7\u00fa\5 \21\2\u00f8\u00fa\5\62\32\2"+
		"\u00f9\u00f7\3\2\2\2\u00f9\u00f8\3\2\2\2\u00fa\37\3\2\2\2\u00fb\u00fc"+
		"\7\3\2\2\u00fc\u00fd\7*\2\2\u00fd\u00fe\7+\2\2\u00fe\u00ff\5F$\2\u00ff"+
		"!\3\2\2\2\u0100\u0105\5$\23\2\u0101\u0102\7\61\2\2\u0102\u0104\5$\23\2"+
		"\u0103\u0101\3\2\2\2\u0104\u0107\3\2\2\2\u0105\u0103\3\2\2\2\u0105\u0106"+
		"\3\2\2\2\u0106#\3\2\2\2\u0107\u0105\3\2\2\2\u0108\u0109\5&\24\2\u0109"+
		"\u010a\7\63\2\2\u010a\u010b\5(\25\2\u010b%\3\2\2\2\u010c\u010e\7W\2\2"+
		"\u010d\u010f\5\22\n\2\u010e\u010d\3\2\2\2\u010e\u010f\3\2\2\2\u010f\'"+
		"\3\2\2\2\u0110\u0117\5\u0092J\2\u0111\u0112\5\u0092J\2\u0112\u0113\5\u0092"+
		"J\2\u0113\u0114\b\25\1\2\u0114\u0117\3\2\2\2\u0115\u0117\5H%\2\u0116\u0110"+
		"\3\2\2\2\u0116\u0111\3\2\2\2\u0116\u0115\3\2\2\2\u0117)\3\2\2\2\u0118"+
		"\u011b\5,\27\2\u0119\u011b\5.\30\2\u011a\u0118\3\2\2\2\u011a\u0119\3\2"+
		"\2\2\u011b+\3\2\2\2\u011c\u011f\5\6\4\2\u011d\u011f\7\r\2\2\u011e\u011c"+
		"\3\2\2\2\u011e\u011d\3\2\2\2\u011f-\3\2\2\2\u0120\u0121\7\4\2\2\u0121"+
		"/\3\2\2\2\u0122\u0123\5,\27\2\u0123\u0124\5\22\n\2\u0124\u0129\3\2\2\2"+
		"\u0125\u0126\5.\30\2\u0126\u0127\5\22\n\2\u0127\u0129\3\2\2\2\u0128\u0122"+
		"\3\2\2\2\u0128\u0125\3\2\2\2\u0129\61\3\2\2\2\u012a\u012b\5\64\33\2\u012b"+
		"\u012c\5F$\2\u012c\63\3\2\2\2\u012d\u012e\5\66\34\2\u012e\u012f\58\35"+
		"\2\u012f\65\3\2\2\2\u0130\u0133\5*\26\2\u0131\u0133\7!\2\2\u0132\u0130"+
		"\3\2\2\2\u0132\u0131\3\2\2\2\u0133\67\3\2\2\2\u0134\u0135\7W\2\2\u0135"+
		"\u0137\7*\2\2\u0136\u0138\5:\36\2\u0137\u0136\3\2\2\2\u0137\u0138\3\2"+
		"\2\2\u0138\u0139\3\2\2\2\u0139\u013b\7+\2\2\u013a\u013c\5\22\n\2\u013b"+
		"\u013a\3\2\2\2\u013b\u013c\3\2\2\2\u013c9\3\2\2\2\u013d\u0144\5D#\2\u013e"+
		"\u013f\5<\37\2\u013f\u0140\7\61\2\2\u0140\u0141\5B\"\2\u0141\u0144\3\2"+
		"\2\2\u0142\u0144\5B\"\2\u0143\u013d\3\2\2\2\u0143\u013e\3\2\2\2\u0143"+
		"\u0142\3\2\2\2\u0144;\3\2\2\2\u0145\u014a\5> \2\u0146\u0147\7\61\2\2\u0147"+
		"\u0149\5> \2\u0148\u0146\3\2\2\2\u0149\u014c\3\2\2\2\u014a\u0148\3\2\2"+
		"\2\u014a\u014b\3\2\2\2\u014b\u0156\3\2\2\2\u014c\u014a\3\2\2\2\u014d\u0152"+
		"\5D#\2\u014e\u014f\7\61\2\2\u014f\u0151\5> \2\u0150\u014e\3\2\2\2\u0151"+
		"\u0154\3\2\2\2\u0152\u0150\3\2\2\2\u0152\u0153\3\2\2\2\u0153\u0156\3\2"+
		"\2\2\u0154\u0152\3\2\2\2\u0155\u0145\3\2\2\2\u0155\u014d\3\2\2\2\u0156"+
		"=\3\2\2\2\u0157\u0159\5@!\2\u0158\u0157\3\2\2\2\u0159\u015c\3\2\2\2\u015a"+
		"\u0158\3\2\2\2\u015a\u015b\3\2\2\2\u015b\u015d\3\2\2\2\u015c\u015a\3\2"+
		"\2\2\u015d\u015e\5*\26\2\u015e\u015f\5&\24\2\u015f?\3\2\2\2\u0160\u0164"+
		"\7\26\2\2\u0161\u0162\7W\2\2\u0162\u0164\b!\1\2\u0163\u0160\3\2\2\2\u0163"+
		"\u0161\3\2\2\2\u0164A\3\2\2\2\u0165\u0167\5@!\2\u0166\u0165\3\2\2\2\u0167"+
		"\u016a\3\2\2\2\u0168\u0166\3\2\2\2\u0168\u0169\3\2\2\2\u0169\u016b\3\2"+
		"\2\2\u016a\u0168\3\2\2\2\u016b\u016c\5*\26\2\u016c\u016d\7Y\2\2\u016d"+
		"\u016e\5&\24\2\u016e\u0171\3\2\2\2\u016f\u0171\5> \2\u0170\u0168\3\2\2"+
		"\2\u0170\u016f\3\2\2\2\u0171C\3\2\2\2\u0172\u0175\5*\26\2\u0173\u0174"+
		"\7W\2\2\u0174\u0176\7\62\2\2\u0175\u0173\3\2\2\2\u0175\u0176\3\2\2\2\u0176"+
		"\u0177\3\2\2\2\u0177\u0178\7\5\2\2\u0178E\3\2\2\2\u0179\u017a\5L\'\2\u017a"+
		"G\3\2\2\2\u017b\u017d\7,\2\2\u017c\u017e\5J&\2\u017d\u017c\3\2\2\2\u017d"+
		"\u017e\3\2\2\2\u017e\u0180\3\2\2\2\u017f\u0181\7\61\2\2\u0180\u017f\3"+
		"\2\2\2\u0180\u0181\3\2\2\2\u0181\u0182\3\2\2\2\u0182\u0183\7-\2\2\u0183"+
		"I\3\2\2\2\u0184\u0189\5(\25\2\u0185\u0186\7\61\2\2\u0186\u0188\5(\25\2"+
		"\u0187\u0185\3\2\2\2\u0188\u018b\3\2\2\2\u0189\u0187\3\2\2\2\u0189\u018a"+
		"\3\2\2\2\u018aK\3\2\2\2\u018b\u0189\3\2\2\2\u018c\u018e\7,\2\2\u018d\u018f"+
		"\5N(\2\u018e\u018d\3\2\2\2\u018e\u018f\3\2\2\2\u018f\u0190\3\2\2\2\u0190"+
		"\u0191\7-\2\2\u0191M\3\2\2\2\u0192\u0194\5P)\2\u0193\u0192\3\2\2\2\u0194"+
		"\u0195\3\2\2\2\u0195\u0193\3\2\2\2\u0195\u0196\3\2\2\2\u0196O\3\2\2\2"+
		"\u0197\u019b\5T+\2\u0198\u019b\5R*\2\u0199\u019b\5X-\2\u019a\u0197\3\2"+
		"\2\2\u019a\u0198\3\2\2\2\u019a\u0199\3\2\2\2\u019bQ\3\2\2\2\u019c\u019d"+
		"\5$\23\2\u019d\u019e\7\60\2\2\u019eS\3\2\2\2\u019f\u01a0\5V,\2\u01a0\u01a1"+
		"\7\60\2\2\u01a1U\3\2\2\2\u01a2\u01a4\5@!\2\u01a3\u01a2\3\2\2\2\u01a4\u01a7"+
		"\3\2\2\2\u01a5\u01a3\3\2\2\2\u01a5\u01a6\3\2\2\2\u01a6\u01a8\3\2\2\2\u01a7"+
		"\u01a5\3\2\2\2\u01a8\u01a9\5*\26\2\u01a9\u01aa\5\"\22\2\u01aa\u01bc\3"+
		"\2\2\2\u01ab\u01ad\5@!\2\u01ac\u01ab\3\2\2\2\u01ad\u01b0\3\2\2\2\u01ae"+
		"\u01ac\3\2\2\2\u01ae\u01af\3\2\2\2\u01af\u01b1\3\2\2\2\u01b0\u01ae\3\2"+
		"\2\2\u01b1\u01b2\5*\26\2\u01b2\u01b3\5&\24\2\u01b3\u01bc\3\2\2\2\u01b4"+
		"\u01b5\5*\26\2\u01b5\u01b6\5*\26\2\u01b6\u01b7\7\63\2\2\u01b7\u01b8\5"+
		"(\25\2\u01b8\u01b9\b,\1\2\u01b9\u01bc\3\2\2\2\u01ba\u01bc\5\u008cG\2\u01bb"+
		"\u01a5\3\2\2\2\u01bb\u01ae\3\2\2\2\u01bb\u01b4\3\2\2\2\u01bb\u01ba\3\2"+
		"\2\2\u01bcW\3\2\2\2\u01bd\u01d0\5f\64\2\u01be\u01d0\5j\66\2\u01bf\u01d0"+
		"\5l\67\2\u01c0\u01d0\5n8\2\u01c1\u01d0\5r:\2\u01c2\u01d0\5Z.\2\u01c3\u01d0"+
		"\5`\61\2\u01c4\u01d0\5p9\2\u01c5\u01d0\5z>\2\u01c6\u01c7\5\u00ba^\2\u01c7"+
		"\u01c8\7\60\2\2\u01c8\u01d0\3\2\2\2\u01c9\u01ca\5\u00bc_\2\u01ca\u01cb"+
		"\7\60\2\2\u01cb\u01d0\3\2\2\2\u01cc\u01cd\5\u0088E\2\u01cd\u01ce\7\60"+
		"\2\2\u01ce\u01d0\3\2\2\2\u01cf\u01bd\3\2\2\2\u01cf\u01be\3\2\2\2\u01cf"+
		"\u01bf\3\2\2\2\u01cf\u01c0\3\2\2\2\u01cf\u01c1\3\2\2\2\u01cf\u01c2\3\2"+
		"\2\2\u01cf\u01c3\3\2\2\2\u01cf\u01c4\3\2\2\2\u01cf\u01c5\3\2\2\2\u01cf"+
		"\u01c6\3\2\2\2\u01cf\u01c9\3\2\2\2\u01cf\u01cc\3\2\2\2\u01d0Y\3\2\2\2"+
		"\u01d1\u01d2\7\35\2\2\u01d2\u01d3\7*\2\2\u01d3\u01d4\5\\/\2\u01d4\u01d5"+
		"\7+\2\2\u01d5\u01d6\7\60\2\2\u01d6\u01e9\3\2\2\2\u01d7\u01d8\7\35\2\2"+
		"\u01d8\u01dc\7*\2\2\u01d9\u01db\t\5\2\2\u01da\u01d9\3\2\2\2\u01db\u01de"+
		"\3\2\2\2\u01dc\u01da\3\2\2\2\u01dc\u01dd\3\2\2\2\u01dd\u01e2\3\2\2\2\u01de"+
		"\u01dc\3\2\2\2\u01df\u01e1\t\6\2\2\u01e0\u01df\3\2\2\2\u01e1\u01e4\3\2"+
		"\2\2\u01e2\u01e0\3\2\2\2\u01e2\u01e3\3\2\2\2\u01e3\u01e5\3\2\2\2\u01e4"+
		"\u01e2\3\2\2\2\u01e5\u01e6\7+\2\2\u01e6\u01e7\b.\1\2\u01e7\u01e9\7\60"+
		"\2\2\u01e8\u01d1\3\2\2\2\u01e8\u01d7\3\2\2\2\u01e9[\3\2\2\2\u01ea\u01eb"+
		"\b/\1\2\u01eb\u01ec\5^\60\2\u01ec\u01f2\3\2\2\2\u01ed\u01ee\f\4\2\2\u01ee"+
		"\u01ef\7B\2\2\u01ef\u01f1\5^\60\2\u01f0\u01ed\3\2\2\2\u01f1\u01f4\3\2"+
		"\2\2\u01f2\u01f0\3\2\2\2\u01f2\u01f3\3\2\2\2\u01f3]\3\2\2\2\u01f4\u01f2"+
		"\3\2\2\2\u01f5\u0224\7W\2\2\u01f6\u0224\7(\2\2\u01f7\u01f8\7W\2\2\u01f8"+
		"\u01f9\7B\2\2\u01f9\u0224\b\60\1\2\u01fa\u01fb\7(\2\2\u01fb\u01fc\7B\2"+
		"\2\u01fc\u0224\b\60\1\2\u01fd\u01fe\7$\2\2\u01fe\u01ff\7B\2\2\u01ff\u0224"+
		"\b\60\1\2\u0200\u0202\7$\2\2\u0201\u0203\7$\2\2\u0202\u0201\3\2\2\2\u0203"+
		"\u0204\3\2\2\2\u0204\u0202\3\2\2\2\u0204\u0205\3\2\2\2\u0205\u0206\3\2"+
		"\2\2\u0206\u0224\b\60\1\2\u0207\u0209\7W\2\2\u0208\u020a\7W\2\2\u0209"+
		"\u0208\3\2\2\2\u020a\u020b\3\2\2\2\u020b\u0209\3\2\2\2\u020b\u020c\3\2"+
		"\2\2\u020c\u020d\3\2\2\2\u020d\u0224\b\60\1\2\u020e\u0210\7W\2\2\u020f"+
		"\u0211\7(\2\2\u0210\u020f\3\2\2\2\u0211\u0212\3\2\2\2\u0212\u0210\3\2"+
		"\2\2\u0212\u0213\3\2\2\2\u0213\u0214\3\2\2\2\u0214\u0224\b\60\1\2\u0215"+
		"\u0217\7(\2\2\u0216\u0218\7(\2\2\u0217\u0216\3\2\2\2\u0218\u0219\3\2\2"+
		"\2\u0219\u0217\3\2\2\2\u0219\u021a\3\2\2\2\u021a\u021b\3\2\2\2\u021b\u0224"+
		"\b\60\1\2\u021c\u021e\7(\2\2\u021d\u021f\7W\2\2\u021e\u021d\3\2\2\2\u021f"+
		"\u0220\3\2\2\2\u0220\u021e\3\2\2\2\u0220\u0221\3\2\2\2\u0221\u0222\3\2"+
		"\2\2\u0222\u0224\b\60\1\2\u0223\u01f5\3\2\2\2\u0223\u01f6\3\2\2\2\u0223"+
		"\u01f7\3\2\2\2\u0223\u01fa\3\2\2\2\u0223\u01fd\3\2\2\2\u0223\u0200\3\2"+
		"\2\2\u0223\u0207\3\2\2\2\u0223\u020e\3\2\2\2\u0223\u0215\3\2\2\2\u0223"+
		"\u021c\3\2\2\2\u0224_\3\2\2\2\u0225\u0226\7\37\2\2\u0226\u0227\7*\2\2"+
		"\u0227\u0228\5b\62\2\u0228\u0229\7+\2\2\u0229\u022a\7\60\2\2\u022aa\3"+
		"\2\2\2\u022b\u022e\7(\2\2\u022c\u022d\7\61\2\2\u022d\u022f\5d\63\2\u022e"+
		"\u022c\3\2\2\2\u022f\u0230\3\2\2\2\u0230\u022e\3\2\2\2\u0230\u0231\3\2"+
		"\2\2\u0231\u023b\3\2\2\2\u0232\u0237\7W\2\2\u0233\u0234\7\61\2\2\u0234"+
		"\u0236\5d\63\2\u0235\u0233\3\2\2\2\u0236\u0239\3\2\2\2\u0237\u0235\3\2"+
		"\2\2\u0237\u0238\3\2\2\2\u0238\u023b\3\2\2\2\u0239\u0237\3\2\2\2\u023a"+
		"\u022b\3\2\2\2\u023a\u0232\3\2\2\2\u023bc\3\2\2\2\u023c\u0241\7W\2\2\u023d"+
		"\u023e\7W\2\2\u023e\u023f\7\61\2\2\u023f\u0241\b\63\1\2\u0240\u023c\3"+
		"\2\2\2\u0240\u023d\3\2\2\2\u0241e\3\2\2\2\u0242\u0243\5L\'\2\u0243g\3"+
		"\2\2\2\u0244\u0249\5\u00ba^\2\u0245\u0249\5\u00bc_\2\u0246\u0249\5\u0096"+
		"L\2\u0247\u0249\5\u0088E\2\u0248\u0244\3\2\2\2\u0248\u0245\3\2\2\2\u0248"+
		"\u0246\3\2\2\2\u0248\u0247\3\2\2\2\u0249i\3\2\2\2\u024a\u024b\7\31\2\2"+
		"\u024b\u024c\7*\2\2\u024c\u024d\5\u009eP\2\u024d\u024e\7+\2\2\u024e\u024f"+
		"\5L\'\2\u024fk\3\2\2\2\u0250\u0251\7\31\2\2\u0251\u0252\7*\2\2\u0252\u0253"+
		"\5\u009eP\2\u0253\u0254\7+\2\2\u0254\u0255\5L\'\2\u0255\u0256\7\25\2\2"+
		"\u0256\u0257\5L\'\2\u0257m\3\2\2\2\u0258\u0259\7\"\2\2\u0259\u025a\7*"+
		"\2\2\u025a\u025b\5\u009eP\2\u025b\u025c\7+\2\2\u025c\u025d\5L\'\2\u025d"+
		"o\3\2\2\2\u025e\u025f\7\23\2\2\u025f\u0260\5L\'\2\u0260\u0261\7\"\2\2"+
		"\u0261\u0262\7*\2\2\u0262\u0263\5\u009eP\2\u0263\u0264\7+\2\2\u0264\u0265"+
		"\7\60\2\2\u0265q\3\2\2\2\u0266\u0267\7\30\2\2\u0267\u0268\5t;\2\u0268"+
		"\u0269\7\b\2\2\u0269\u026a\5\u009eP\2\u026a\u026b\5L\'\2\u026b\u027a\3"+
		"\2\2\2\u026c\u026d\7\30\2\2\u026d\u026e\5t;\2\u026e\u026f\7\t\2\2\u026f"+
		"\u0270\5\u009eP\2\u0270\u0271\5L\'\2\u0271\u027a\3\2\2\2\u0272\u0273\7"+
		"\30\2\2\u0273\u0274\5t;\2\u0274\u0275\5\2\2\2\u0275\u0276\5\u009eP\2\u0276"+
		"\u0277\5L\'\2\u0277\u0278\b:\1\2\u0278\u027a\3\2\2\2\u0279\u0266\3\2\2"+
		"\2\u0279\u026c\3\2\2\2\u0279\u0272\3\2\2\2\u027as\3\2\2\2\u027b\u027c"+
		"\5*\26\2\u027c\u027d\5\"\22\2\u027d\u0288\3\2\2\2\u027e\u027f\5*\26\2"+
		"\u027f\u0280\5*\26\2\u0280\u0281\5\"\22\2\u0281\u0282\b;\1\2\u0282\u0288"+
		"\3\2\2\2\u0283\u0284\5*\26\2\u0284\u0285\5&\24\2\u0285\u0286\b;\1\2\u0286"+
		"\u0288\3\2\2\2\u0287\u027b\3\2\2\2\u0287\u027e\3\2\2\2\u0287\u0283\3\2"+
		"\2\2\u0288u\3\2\2\2\u0289\u028a\5x=\2\u028aw\3\2\2\2\u028b\u0290\5h\65"+
		"\2\u028c\u028d\7\61\2\2\u028d\u028f\5h\65\2\u028e\u028c\3\2\2\2\u028f"+
		"\u0292\3\2\2\2\u0290\u028e\3\2\2\2\u0290\u0291\3\2\2\2\u0291y\3\2\2\2"+
		"\u0292\u0290\3\2\2\2\u0293\u0294\7\36\2\2\u0294\u0295\5\u0092J\2\u0295"+
		"\u0296\7\60\2\2\u0296\u02a1\3\2\2\2\u0297\u029b\7\36\2\2\u0298\u029a\t"+
		"\7\2\2\u0299\u0298\3\2\2\2\u029a\u029d\3\2\2\2\u029b\u0299\3\2\2\2\u029b"+
		"\u029c\3\2\2\2\u029c\u029e\3\2\2\2\u029d\u029b\3\2\2\2\u029e\u029f\7\60"+
		"\2\2\u029f\u02a1\b>\1\2\u02a0\u0293\3\2\2\2\u02a0\u0297\3\2\2\2\u02a1"+
		"{\3\2\2\2\u02a2\u02a3\5\u0080A\2\u02a3}\3\2\2\2\u02a4\u02ab\5\2\2\2\u02a5"+
		"\u02a6\7*\2\2\u02a6\u02a7\5\u0092J\2\u02a7\u02a8\7+\2\2\u02a8\u02ab\3"+
		"\2\2\2\u02a9\u02ab\5\u0088E\2\u02aa\u02a4\3\2\2\2\u02aa\u02a5\3\2\2\2"+
		"\u02aa\u02a9\3\2\2\2\u02ab\177\3\2\2\2\u02ac\u02b3\5\2\2\2\u02ad\u02ae"+
		"\7*\2\2\u02ae\u02af\5\u0092J\2\u02af\u02b0\7+\2\2\u02b0\u02b3\3\2\2\2"+
		"\u02b1\u02b3\5\u0086D\2\u02b2\u02ac\3\2\2\2\u02b2\u02ad\3\2\2\2\u02b2"+
		"\u02b1\3\2\2\2\u02b3\u0081\3\2\2\2\u02b4\u02ba\5\2\2\2\u02b5\u02b6\7*"+
		"\2\2\u02b6\u02b7\5\u0092J\2\u02b7\u02b8\7+\2\2\u02b8\u02ba\3\2\2\2\u02b9"+
		"\u02b4\3\2\2\2\u02b9\u02b5\3\2\2\2\u02ba\u0083\3\2\2\2\u02bb\u02bc\5\24"+
		"\13\2\u02bc\u02bd\7.\2\2\u02bd\u02be\5\u0092J\2\u02be\u02bf\7/\2\2\u02bf"+
		"\u02c6\3\2\2\2\u02c0\u02c1\5~@\2\u02c1\u02c2\7.\2\2\u02c2\u02c3\5\u0092"+
		"J\2\u02c3\u02c4\7/\2\2\u02c4\u02c6\3\2\2\2\u02c5\u02bb\3\2\2\2\u02c5\u02c0"+
		"\3\2\2\2\u02c6\u0085\3\2\2\2\u02c7\u02c8\5\24\13\2\u02c8\u02c9\7.\2\2"+
		"\u02c9\u02ca\5\u0092J\2\u02ca\u02cb\7/\2\2\u02cb\u02d2\3\2\2\2\u02cc\u02cd"+
		"\5\u0082B\2\u02cd\u02ce\7.\2\2\u02ce\u02cf\5\u0092J\2\u02cf\u02d0\7/\2"+
		"\2\u02d0\u02d2\3\2\2\2\u02d1\u02c7\3\2\2\2\u02d1\u02cc\3\2\2\2\u02d2\u0087"+
		"\3\2\2\2\u02d3\u02d4\5\26\f\2\u02d4\u02d6\7*\2\2\u02d5\u02d7\5\u008aF"+
		"\2\u02d6\u02d5\3\2\2\2\u02d6\u02d7\3\2\2\2\u02d7\u02d8\3\2\2\2\u02d8\u02d9"+
		"\7+\2\2\u02d9\u02f0\3\2\2\2\u02da\u02dd\5\26\f\2\u02db\u02dc\7*\2\2\u02dc"+
		"\u02de\7+\2\2\u02dd\u02db\3\2\2\2\u02de\u02df\3\2\2\2\u02df\u02dd\3\2"+
		"\2\2\u02df\u02e0\3\2\2\2\u02e0\u02e1\3\2\2\2\u02e1\u02e3\7*\2\2\u02e2"+
		"\u02e4\5\u008aF\2\u02e3\u02e2\3\2\2\2\u02e3\u02e4\3\2\2\2\u02e4\u02e5"+
		"\3\2\2\2\u02e5\u02ea\7+\2\2\u02e6\u02e7\7*\2\2\u02e7\u02e9\7+\2\2\u02e8"+
		"\u02e6\3\2\2\2\u02e9\u02ec\3\2\2\2\u02ea\u02e8\3\2\2\2\u02ea\u02eb\3\2"+
		"\2\2\u02eb\u02ed\3\2\2\2\u02ec\u02ea\3\2\2\2\u02ed\u02ee\bE\1\2\u02ee"+
		"\u02f0\3\2\2\2\u02ef\u02d3\3\2\2\2\u02ef\u02da\3\2\2\2\u02f0\u0089\3\2"+
		"\2\2\u02f1\u02f6\5\u0094K\2\u02f2\u02f3\7\61\2\2\u02f3\u02f5\5\u0094K"+
		"\2\u02f4\u02f2\3\2\2\2\u02f5\u02f8\3\2\2\2\u02f6\u02f4\3\2\2\2\u02f6\u02f7"+
		"\3\2\2\2\u02f7\u02fe\3\2\2\2\u02f8\u02f6\3\2\2\2\u02f9\u02fa\5\u0094K"+
		"\2\u02fa\u02fb\5\u0094K\2\u02fb\u02fc\bF\1\2\u02fc\u02fe\3\2\2\2\u02fd"+
		"\u02f1\3\2\2\2\u02fd\u02f9\3\2\2\2\u02fe\u008b\3\2\2\2\u02ff\u0300\5\60"+
		"\31\2\u0300\u0301\7W\2\2\u0301\u0302\7\63\2\2\u0302\u0303\7\34\2\2\u0303"+
		"\u0304\5\4\3\2\u0304\u0306\5\u008eH\2\u0305\u0307\5\22\n\2\u0306\u0305"+
		"\3\2\2\2\u0306\u0307\3\2\2\2\u0307\u0311\3\2\2\2\u0308\u0309\5\60\31\2"+
		"\u0309\u030a\7W\2\2\u030a\u030b\7\63\2\2\u030b\u030c\7\34\2\2\u030c\u030d"+
		"\5\4\3\2\u030d\u030e\5\22\n\2\u030e\u030f\5H%\2\u030f\u0311\3\2\2\2\u0310"+
		"\u02ff\3\2\2\2\u0310\u0308\3\2\2\2\u0311\u008d\3\2\2\2\u0312\u0316\5\u0090"+
		"I\2\u0313\u0315\5\u0090I\2\u0314\u0313\3\2\2\2\u0315\u0318\3\2\2\2\u0316"+
		"\u0314\3\2\2\2\u0316\u0317\3\2\2\2\u0317\u008f\3\2\2\2\u0318\u0316\3\2"+
		"\2\2\u0319\u031a\7.\2\2\u031a\u031b\7(\2\2\u031b\u031e\7/\2\2\u031c\u031e"+
		"\7#\2\2\u031d\u0319\3\2\2\2\u031d\u031c\3\2\2\2\u031e\u0091\3\2\2\2\u031f"+
		"\u0322\5\u0094K\2\u0320\u0322\5\u009eP\2\u0321\u031f\3\2\2\2\u0321\u0320"+
		"\3\2\2\2\u0322\u0093\3\2\2\2\u0323\u0324\5\u0096L\2\u0324\u0095\3\2\2"+
		"\2\u0325\u0326\5\u0098M\2\u0326\u0327\5\u009aN\2\u0327\u0328\5\u00b0Y"+
		"\2\u0328\u032b\3\2\2\2\u0329\u032b\5\u00b0Y\2\u032a\u0325\3\2\2\2\u032a"+
		"\u0329\3\2\2\2\u032b\u0097\3\2\2\2\u032c\u032f\5\24\13\2\u032d\u032f\5"+
		"\u0084C\2\u032e\u032c\3\2\2\2\u032e\u032d\3\2\2\2\u032f\u0099\3\2\2\2"+
		"\u0330\u0331\t\b\2\2\u0331\u009b\3\2\2\2\u0332\u0333\bO\1\2\u0333\u0334"+
		"\7*\2\2\u0334\u0335\5\u009cO\2\u0335\u0336\7+\2\2\u0336\u033a\3\2\2\2"+
		"\u0337\u033a\7\32\2\2\u0338\u033a\7\r\2\2\u0339\u0332\3\2\2\2\u0339\u0337"+
		"\3\2\2\2\u0339\u0338\3\2\2\2\u033a\u0340\3\2\2\2\u033b\u033c\f\6\2\2\u033c"+
		"\u033d\t\t\2\2\u033d\u033f\5\u009cO\7\u033e\u033b\3\2\2\2\u033f\u0342"+
		"\3\2\2\2\u0340\u033e\3\2\2\2\u0340\u0341\3\2\2\2\u0341\u009d\3\2\2\2\u0342"+
		"\u0340\3\2\2\2\u0343\u0344\5\u00a0Q\2\u0344\u009f\3\2\2\2\u0345\u0346"+
		"\bQ\1\2\u0346\u0347\5\u00a2R\2\u0347\u0358\3\2\2\2\u0348\u0349\f\4\2\2"+
		"\u0349\u034a\7?\2\2\u034a\u0357\5\u00a2R\2\u034b\u034c\f\3\2\2\u034c\u0350"+
		"\7?\2\2\u034d\u034f\7G\2\2\u034e\u034d\3\2\2\2\u034f\u0352\3\2\2\2\u0350"+
		"\u034e\3\2\2\2\u0350\u0351\3\2\2\2\u0351\u0353\3\2\2\2\u0352\u0350\3\2"+
		"\2\2\u0353\u0354\5\u00a2R\2\u0354\u0355\bQ\1\2\u0355\u0357\3\2\2\2\u0356"+
		"\u0348\3\2\2\2\u0356\u034b\3\2\2\2\u0357\u035a\3\2\2\2\u0358\u0356\3\2"+
		"\2\2\u0358\u0359\3\2\2\2\u0359\u00a1\3\2\2\2\u035a\u0358\3\2\2\2\u035b"+
		"\u035c\bR\1\2\u035c\u035d\5\u00a4S\2\u035d\u036e\3\2\2\2\u035e\u035f\f"+
		"\4\2\2\u035f\u0360\7>\2\2\u0360\u036d\5\u00a4S\2\u0361\u0362\f\3\2\2\u0362"+
		"\u0366\7>\2\2\u0363\u0365\7F\2\2\u0364\u0363\3\2\2\2\u0365\u0368\3\2\2"+
		"\2\u0366\u0364\3\2\2\2\u0366\u0367\3\2\2\2\u0367\u0369\3\2\2\2\u0368\u0366"+
		"\3\2\2\2\u0369\u036a\5\u00a4S\2\u036a\u036b\bR\1\2\u036b\u036d\3\2\2\2"+
		"\u036c\u035e\3\2\2\2\u036c\u0361\3\2\2\2\u036d\u0370\3\2\2\2\u036e\u036c"+
		"\3\2\2\2\u036e\u036f\3\2\2\2\u036f\u00a3\3\2\2\2\u0370\u036e\3\2\2\2\u0371"+
		"\u0372\bS\1\2\u0372\u0373\5\u00a6T\2\u0373\u0379\3\2\2\2\u0374\u0375\f"+
		"\3\2\2\u0375\u0376\7G\2\2\u0376\u0378\5\u00a6T\2\u0377\u0374\3\2\2\2\u0378"+
		"\u037b\3\2\2\2\u0379\u0377\3\2\2\2\u0379\u037a\3\2\2\2\u037a\u00a5\3\2"+
		"\2\2\u037b\u0379\3\2\2\2\u037c\u037d\bT\1\2\u037d\u037e\5\u00a8U\2\u037e"+
		"\u0384\3\2\2\2\u037f\u0380\f\3\2\2\u0380\u0381\7H\2\2\u0381\u0383\5\u00a8"+
		"U\2\u0382\u037f\3\2\2\2\u0383\u0386\3\2\2\2\u0384\u0382\3\2\2\2\u0384"+
		"\u0385\3\2\2\2\u0385\u00a7\3\2\2\2\u0386\u0384\3\2\2\2\u0387\u0388\bU"+
		"\1\2\u0388\u0389\5\u00aaV\2\u0389\u038f\3\2\2\2\u038a\u038b\f\3\2\2\u038b"+
		"\u038c\7F\2\2\u038c\u038e\5\u00aaV\2\u038d\u038a\3\2\2\2\u038e\u0391\3"+
		"\2\2\2\u038f\u038d\3\2\2\2\u038f\u0390\3\2\2\2\u0390\u00a9\3\2\2\2\u0391"+
		"\u038f\3\2\2\2\u0392\u0393\bV\1\2\u0393\u0394\5\u00acW\2\u0394\u03a2\3"+
		"\2\2\2\u0395\u0396\f\5\2\2\u0396\u0397\7\63\2\2\u0397\u0398\5\u00acW\2"+
		"\u0398\u0399\bV\1\2\u0399\u03a1\3\2\2\2\u039a\u039b\f\4\2\2\u039b\u039c"+
		"\7:\2\2\u039c\u03a1\5\u00acW\2\u039d\u039e\f\3\2\2\u039e\u039f\7=\2\2"+
		"\u039f\u03a1\5\u00acW\2\u03a0\u0395\3\2\2\2\u03a0\u039a\3\2\2\2\u03a0"+
		"\u039d\3\2\2\2\u03a1\u03a4\3\2\2\2\u03a2\u03a0\3\2\2\2\u03a2\u03a3\3\2"+
		"\2\2\u03a3\u00ab\3\2\2\2\u03a4\u03a2\3\2\2\2\u03a5\u03a6\bW\1\2\u03a6"+
		"\u03a7\5\u00aeX\2\u03a7\u03b6\3\2\2\2\u03a8\u03a9\f\6\2\2\u03a9\u03aa"+
		"\7\65\2\2\u03aa\u03b5\5\u00aeX\2\u03ab\u03ac\f\5\2\2\u03ac\u03ad\7\64"+
		"\2\2\u03ad\u03b5\5\u00aeX\2\u03ae\u03af\f\4\2\2\u03af\u03b0\7;\2\2\u03b0"+
		"\u03b5\5\u00aeX\2\u03b1\u03b2\f\3\2\2\u03b2\u03b3\7<\2\2\u03b3\u03b5\5"+
		"\u00aeX\2\u03b4\u03a8\3\2\2\2\u03b4\u03ab\3\2\2\2\u03b4\u03ae\3\2\2\2"+
		"\u03b4\u03b1\3\2\2\2\u03b5\u03b8\3\2\2\2\u03b6\u03b4\3\2\2\2\u03b6\u03b7"+
		"\3\2\2\2\u03b7\u00ad\3\2\2\2\u03b8\u03b6\3\2\2\2\u03b9\u03ba\bX\1\2\u03ba"+
		"\u03bb\5\u00b6\\\2\u03bb\u03cb\3\2\2\2\u03bc\u03bd\f\5\2\2\u03bd\u03be"+
		"\7\65\2\2\u03be\u03bf\7\65\2\2\u03bf\u03ca\5\u00b6\\\2\u03c0\u03c1\f\4"+
		"\2\2\u03c1\u03c2\7\64\2\2\u03c2\u03c3\7\64\2\2\u03c3\u03ca\5\u00b6\\\2"+
		"\u03c4\u03c5\f\3\2\2\u03c5\u03c6\7\64\2\2\u03c6\u03c7\7\64\2\2\u03c7\u03c8"+
		"\7\64\2\2\u03c8\u03ca\5\u00b6\\\2\u03c9\u03bc\3\2\2\2\u03c9\u03c0\3\2"+
		"\2\2\u03c9\u03c4\3\2\2\2\u03ca\u03cd\3\2\2\2\u03cb\u03c9\3\2\2\2\u03cb"+
		"\u03cc\3\2\2\2\u03cc\u00af\3\2\2\2\u03cd\u03cb\3\2\2\2\u03ce\u03cf\bY"+
		"\1\2\u03cf\u03d0\5\u00b2Z\2\u03d0\u03ef\3\2\2\2\u03d1\u03d2\f\6\2\2\u03d2"+
		"\u03d3\7B\2\2\u03d3\u03ee\5\u00b2Z\2\u03d4\u03d5\f\5\2\2\u03d5\u03d9\7"+
		"@\2\2\u03d6\u03d8\7B\2\2\u03d7\u03d6\3\2\2\2\u03d8\u03db\3\2\2\2\u03d9"+
		"\u03d7\3\2\2\2\u03d9\u03da\3\2\2\2\u03da\u03dc\3\2\2\2\u03db\u03d9\3\2"+
		"\2\2\u03dc\u03dd\5\u00b2Z\2\u03dd\u03de\bY\1\2\u03de\u03ee\3\2\2\2\u03df"+
		"\u03e0\f\4\2\2\u03e0\u03e1\7C\2\2\u03e1\u03ee\5\u00b2Z\2\u03e2\u03e3\f"+
		"\3\2\2\u03e3\u03e7\7A\2\2\u03e4\u03e6\7C\2\2\u03e5\u03e4\3\2\2\2\u03e6"+
		"\u03e9\3\2\2\2\u03e7\u03e5\3\2\2\2\u03e7\u03e8\3\2\2\2\u03e8\u03ea\3\2"+
		"\2\2\u03e9\u03e7\3\2\2\2\u03ea\u03eb\5\u00b2Z\2\u03eb\u03ec\bY\1\2\u03ec"+
		"\u03ee\3\2\2\2\u03ed\u03d1\3\2\2\2\u03ed\u03d4\3\2\2\2\u03ed\u03df\3\2"+
		"\2\2\u03ed\u03e2\3\2\2\2\u03ee\u03f1\3\2\2\2\u03ef\u03ed\3\2\2\2\u03ef"+
		"\u03f0\3\2\2\2\u03f0\u00b1\3\2\2\2\u03f1\u03ef\3\2\2\2\u03f2\u03f3\bZ"+
		"\1\2\u03f3\u03f4\5\u00b4[\2\u03f4\u0421\3\2\2\2\u03f5\u03f6\f\b\2\2\u03f6"+
		"\u03f7\7D\2\2\u03f7\u0420\5\u00b4[\2\u03f8\u03f9\f\7\2\2\u03f9\u03fd\7"+
		"\n\2\2\u03fa\u03fc\7D\2\2\u03fb\u03fa\3\2\2\2\u03fc\u03ff\3\2\2\2\u03fd"+
		"\u03fb\3\2\2\2\u03fd\u03fe\3\2\2\2\u03fe\u0400\3\2\2\2\u03ff\u03fd\3\2"+
		"\2\2\u0400\u0401\5\u00b4[\2\u0401\u0402\bZ\1\2\u0402\u0420\3\2\2\2\u0403"+
		"\u0404\f\6\2\2\u0404\u0405\7E\2\2\u0405\u0420\5\u00b4[\2\u0406\u0407\f"+
		"\5\2\2\u0407\u040b\7\13\2\2\u0408\u040a\7E\2\2\u0409\u0408\3\2\2\2\u040a"+
		"\u040d\3\2\2\2\u040b\u0409\3\2\2\2\u040b\u040c\3\2\2\2\u040c\u040e\3\2"+
		"\2\2\u040d\u040b\3\2\2\2\u040e\u040f\5\u00b4[\2\u040f\u0410\bZ\1\2\u0410"+
		"\u0420\3\2\2\2\u0411\u0412\f\4\2\2\u0412\u0413\7I\2\2\u0413\u0420\5\u00b4"+
		"[\2\u0414\u0415\f\3\2\2\u0415\u0419\7\f\2\2\u0416\u0418\7I\2\2\u0417\u0416"+
		"\3\2\2\2\u0418\u041b\3\2\2\2\u0419\u0417\3\2\2\2\u0419\u041a\3\2\2\2\u041a"+
		"\u041c\3\2\2\2\u041b\u0419\3\2\2\2\u041c\u041d\5\u00b4[\2\u041d\u041e"+
		"\bZ\1\2\u041e\u0420\3\2\2\2\u041f\u03f5\3\2\2\2\u041f\u03f8\3\2\2\2\u041f"+
		"\u0403\3\2\2\2\u041f\u0406\3\2\2\2\u041f\u0411\3\2\2\2\u041f\u0414\3\2"+
		"\2\2\u0420\u0423\3\2\2\2\u0421\u041f\3\2\2\2\u0421\u0422\3\2\2\2\u0422"+
		"\u00b3\3\2\2\2\u0423\u0421\3\2\2\2\u0424\u0425\7B\2\2\u0425\u042a\5\u00b4"+
		"[\2\u0426\u0427\7C\2\2\u0427\u042a\5\u00b4[\2\u0428\u042a\5\u00b6\\\2"+
		"\u0429\u0424\3\2\2\2\u0429\u0426\3\2\2\2\u0429\u0428\3\2\2\2\u042a\u00b5"+
		"\3\2\2\2\u042b\u0431\5\u00b8]\2\u042c\u042d\7\67\2\2\u042d\u0431\5\u00b4"+
		"[\2\u042e\u042f\7\66\2\2\u042f\u0431\5\u00b4[\2\u0430\u042b\3\2\2\2\u0430"+
		"\u042c\3\2\2\2\u0430\u042e\3\2\2\2\u0431\u00b7\3\2\2\2\u0432\u0444\5|"+
		"?\2\u0433\u0444\5\24\13\2\u0434\u0437\5|?\2\u0435\u0436\7*\2\2\u0436\u0438"+
		"\7+\2\2\u0437\u0435\3\2\2\2\u0438\u0439\3\2\2\2\u0439\u0437\3\2\2\2\u0439"+
		"\u043a\3\2\2\2\u043a\u043b\3\2\2\2\u043b\u043c\b]\1\2\u043c\u0444\3\2"+
		"\2\2\u043d\u043f\t\n\2\2\u043e\u043d\3\2\2\2\u043f\u0440\3\2\2\2\u0440"+
		"\u043e\3\2\2\2\u0440\u0441\3\2\2\2\u0441\u0442\3\2\2\2\u0442\u0444\b]"+
		"\1\2\u0443\u0432\3\2\2\2\u0443\u0433\3\2\2\2\u0443\u0434\3\2\2\2\u0443"+
		"\u043e\3\2\2\2\u0444\u00b9\3\2\2\2\u0445\u0446\5\u00b8]\2\u0446\u0447"+
		"\7@\2\2\u0447\u00bb\3\2\2\2\u0448\u0449\5\u00b8]\2\u0449\u044a\7A\2\2"+
		"\u044a\u00bd\3\2\2\2l\u00c2\u00c6\u00ce\u00d8\u00e0\u00ed\u00f4\u00f9"+
		"\u0105\u010e\u0116\u011a\u011e\u0128\u0132\u0137\u013b\u0143\u014a\u0152"+
		"\u0155\u015a\u0163\u0168\u0170\u0175\u017d\u0180\u0189\u018e\u0195\u019a"+
		"\u01a5\u01ae\u01bb\u01cf\u01dc\u01e2\u01e8\u01f2\u0204\u020b\u0212\u0219"+
		"\u0220\u0223\u0230\u0237\u023a\u0240\u0248\u0279\u0287\u0290\u029b\u02a0"+
		"\u02aa\u02b2\u02b9\u02c5\u02d1\u02d6\u02df\u02e3\u02ea\u02ef\u02f6\u02fd"+
		"\u0306\u0310\u0316\u031d\u0321\u032a\u032e\u0339\u0340\u0350\u0356\u0358"+
		"\u0366\u036c\u036e\u0379\u0384\u038f\u03a0\u03a2\u03b4\u03b6\u03c9\u03cb"+
		"\u03d9\u03e7\u03ed\u03ef\u03fd\u040b\u0419\u041f\u0421\u0429\u0430\u0439"+
		"\u0440\u0443";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}