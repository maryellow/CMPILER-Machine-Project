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
		T__9=10, T__10=11, BOOLEAN=12, BREAK=13, BYTE=14, CHAR=15, CLASS=16, CONST=17, 
		DO=18, DOUBLE=19, ELSE=20, FINAL=21, FLOAT=22, FOR=23, IF=24, INT=25, 
		LONG=26, NEW=27, PRINT=28, RETURN=29, SCAN=30, SHORT=31, VOID=32, WHILE=33, 
		ArrayNum=34, IntegerLiteral=35, FloatingPointLiteral=36, BooleanLiteral=37, 
		CharacterLiteral=38, StringLiteral=39, NullLiteral=40, LPAREN=41, RPAREN=42, 
		LBRACE=43, RBRACE=44, LBRACK=45, RBRACK=46, SEMI=47, COMMA=48, DOT=49, 
		ASSIGN=50, GT=51, LT=52, BANG=53, TILDE=54, QUESTION=55, COLON=56, EQUAL=57, 
		LE=58, GE=59, NOTEQUAL=60, AND=61, OR=62, INC=63, DEC=64, ADD=65, SUB=66, 
		MUL=67, DIV=68, BITAND=69, BITOR=70, CARET=71, MOD=72, ARROW=73, COLONCOLON=74, 
		ADD_ASSIGN=75, SUB_ASSIGN=76, MUL_ASSIGN=77, DIV_ASSIGN=78, AND_ASSIGN=79, 
		OR_ASSIGN=80, XOR_ASSIGN=81, MOD_ASSIGN=82, LSHIFT_ASSIGN=83, RSHIFT_ASSIGN=84, 
		URSHIFT_ASSIGN=85, Identifier=86, AT=87, ELLIPSIS=88, WS=89, COMMENT=90, 
		LINE_COMMENT=91, ErrorCharacter=92;
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
		RULE_variableNoInit = 41, RULE_localVariableDeclarationStatement = 42, 
		RULE_localVariableDeclaration = 43, RULE_statement = 44, RULE_printStatement = 45, 
		RULE_printBlock = 46, RULE_printExtra = 47, RULE_scanStatement = 48, RULE_scanBlock = 49, 
		RULE_scanExtra = 50, RULE_statementWithoutTrailingSubstatement = 51, RULE_statementExpression = 52, 
		RULE_ifThenStatement = 53, RULE_ifThenElseStatement = 54, RULE_whileStatement = 55, 
		RULE_doStatement = 56, RULE_forStatement = 57, RULE_forMiddle = 58, RULE_forInit = 59, 
		RULE_forUpdate = 60, RULE_statementExpressionList = 61, RULE_returnStatement = 62, 
		RULE_primary = 63, RULE_primaryNoNewArray_lfno_arrayAccess = 64, RULE_arrayCall = 65, 
		RULE_arrayAccess = 66, RULE_methodInvocation = 67, RULE_argumentList = 68, 
		RULE_arrayCreationExpression = 69, RULE_dimExpr = 70, RULE_expression = 71, 
		RULE_assignmentExpression = 72, RULE_assignment = 73, RULE_leftHandSide = 74, 
		RULE_assignmentOperator = 75, RULE_expr = 76, RULE_conditionalExpression = 77, 
		RULE_conditionalOrExpression = 78, RULE_conditionalAndExpression = 79, 
		RULE_inclusiveOrExpression = 80, RULE_exclusiveOrExpression = 81, RULE_andExpression = 82, 
		RULE_equalityExpression = 83, RULE_relationalExpression = 84, RULE_shiftExpression = 85, 
		RULE_additiveExpression = 86, RULE_multiplicativeExpression = 87, RULE_unaryExpression = 88, 
		RULE_unaryExpressionNotPlusMinus = 89, RULE_postfixExpression = 90, RULE_postIncrementExpression = 91, 
		RULE_postDecrementExpression = 92;
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
			"variableNoInit", "localVariableDeclarationStatement", "localVariableDeclaration", 
			"statement", "printStatement", "printBlock", "printExtra", "scanStatement", 
			"scanBlock", "scanExtra", "statementWithoutTrailingSubstatement", "statementExpression", 
			"ifThenStatement", "ifThenElseStatement", "whileStatement", "doStatement", 
			"forStatement", "forMiddle", "forInit", "forUpdate", "statementExpressionList", 
			"returnStatement", "primary", "primaryNoNewArray_lfno_arrayAccess", "arrayCall", 
			"arrayAccess", "methodInvocation", "argumentList", "arrayCreationExpression", 
			"dimExpr", "expression", "assignmentExpression", "assignment", "leftHandSide", 
			"assignmentOperator", "expr", "conditionalExpression", "conditionalOrExpression", 
			"conditionalAndExpression", "inclusiveOrExpression", "exclusiveOrExpression", 
			"andExpression", "equalityExpression", "relationalExpression", "shiftExpression", 
			"additiveExpression", "multiplicativeExpression", "unaryExpression", 
			"unaryExpressionNotPlusMinus", "postfixExpression", "postIncrementExpression", 
			"postDecrementExpression"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'main'", "'String'", "'this'", "'#'", "'$'", "'up to'", "'down to'", 
			"'[ '", "'**'", "'//'", "'%%'", "'boolean'", "'break'", "'byte'", "'char'", 
			"'class'", "'const'", "'do'", "'double'", "'else'", "'final'", "'float'", 
			"'for'", "'if'", "'int'", "'long'", "'new'", "'print'", "'return'", "'scan'", 
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
			null, null, null, null, null, null, null, null, null, null, null, null, 
			"BOOLEAN", "BREAK", "BYTE", "CHAR", "CLASS", "CONST", "DO", "DOUBLE", 
			"ELSE", "FINAL", "FLOAT", "FOR", "IF", "INT", "LONG", "NEW", "PRINT", 
			"RETURN", "SCAN", "SHORT", "VOID", "WHILE", "ArrayNum", "IntegerLiteral", 
			"FloatingPointLiteral", "BooleanLiteral", "CharacterLiteral", "StringLiteral", 
			"NullLiteral", "LPAREN", "RPAREN", "LBRACE", "RBRACE", "LBRACK", "RBRACK", 
			"SEMI", "COMMA", "DOT", "ASSIGN", "GT", "LT", "BANG", "TILDE", "QUESTION", 
			"COLON", "EQUAL", "LE", "GE", "NOTEQUAL", "AND", "OR", "INC", "DEC", 
			"ADD", "SUB", "MUL", "DIV", "BITAND", "BITOR", "CARET", "MOD", "ARROW", 
			"COLONCOLON", "ADD_ASSIGN", "SUB_ASSIGN", "MUL_ASSIGN", "DIV_ASSIGN", 
			"AND_ASSIGN", "OR_ASSIGN", "XOR_ASSIGN", "MOD_ASSIGN", "LSHIFT_ASSIGN", 
			"RSHIFT_ASSIGN", "URSHIFT_ASSIGN", "Identifier", "AT", "ELLIPSIS", "WS", 
			"COMMENT", "LINE_COMMENT", "ErrorCharacter"
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
			setState(186);
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
			setState(190);
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
				setState(188);
				numericType();
				}
				break;
			case BOOLEAN:
				enterOuterAlt(_localctx, 2);
				{
				setState(189);
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
			setState(194);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case BYTE:
			case CHAR:
			case INT:
			case LONG:
			case SHORT:
				enterOuterAlt(_localctx, 1);
				{
				setState(192);
				integralType();
				}
				break;
			case DOUBLE:
			case FLOAT:
				enterOuterAlt(_localctx, 2);
				{
				setState(193);
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
			setState(196);
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
			setState(198);
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
			setState(202);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(200);
				typeVariable();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(201);
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
			setState(204);
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
			setState(212);
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
				setState(206);
				primitiveType();
				setState(207);
				dims();
				}
				break;
			case Identifier:
				enterOuterAlt(_localctx, 2);
				{
				setState(209);
				typeVariable();
				setState(210);
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
			setState(214);
			match(LBRACK);
			setState(215);
			match(RBRACK);
			setState(220);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==LBRACK) {
				{
				{
				setState(216);
				match(LBRACK);
				setState(217);
				match(RBRACK);
				}
				}
				setState(222);
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
			setState(223);
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
			setState(227);
			match(CLASS);
			setState(228);
			match(Identifier);
			setState(229);
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
			setState(231);
			match(LBRACE);
			setState(233);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
			case 1:
				{
				setState(232);
				classBodyDeclaration();
				}
				break;
			}
			setState(235);
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
			setState(240);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__1) | (1L << BOOLEAN) | (1L << BYTE) | (1L << CHAR) | (1L << DOUBLE) | (1L << FLOAT) | (1L << INT) | (1L << LONG) | (1L << SHORT) | (1L << VOID))) != 0)) {
				{
				{
				setState(237);
				classMemberDeclaration();
				}
				}
				setState(242);
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
		public List<MethodDeclarationContext> methodDeclaration() {
			return getRuleContexts(MethodDeclarationContext.class);
		}
		public MethodDeclarationContext methodDeclaration(int i) {
			return getRuleContext(MethodDeclarationContext.class,i);
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
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(246);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__1) | (1L << BOOLEAN) | (1L << BYTE) | (1L << CHAR) | (1L << DOUBLE) | (1L << FLOAT) | (1L << INT) | (1L << LONG) | (1L << SHORT) | (1L << VOID))) != 0)) {
				{
				{
				setState(243);
				methodDeclaration();
				}
				}
				setState(248);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(249);
			mainDeclaration();
			setState(253);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,8,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(250);
					methodDeclaration();
					}
					} 
				}
				setState(255);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,8,_ctx);
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
			setState(256);
			match(T__0);
			setState(257);
			match(LPAREN);
			setState(258);
			match(RPAREN);
			setState(259);
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
			setState(261);
			variableDeclarator();
			setState(266);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(262);
				match(COMMA);
				setState(263);
				variableDeclarator();
				}
				}
				setState(268);
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
			setState(269);
			variableDeclaratorId();
			setState(270);
			match(ASSIGN);
			setState(271);
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
		public TerminalNode LBRACK() { return getToken(ClypsParser.LBRACK, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode RBRACK() { return getToken(ClypsParser.RBRACK, 0); }
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
		try {
			setState(279);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(273);
				match(Identifier);
				setState(274);
				match(LBRACK);
				setState(275);
				expression();
				setState(276);
				match(RBRACK);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(278);
				match(Identifier);
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
			setState(287);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(281);
				expression();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(282);
				expression();
				setState(283);
				expression();
				notifyErrorListeners("Missing Operator");
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(286);
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
			setState(291);
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
				setState(289);
				unannPrimitiveType();
				}
				break;
			case T__1:
				enterOuterAlt(_localctx, 2);
				{
				setState(290);
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
			setState(295);
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
				setState(293);
				numericType();
				}
				break;
			case BOOLEAN:
				enterOuterAlt(_localctx, 2);
				{
				setState(294);
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
			setState(297);
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
			setState(305);
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
				setState(299);
				unannPrimitiveType();
				setState(300);
				dims();
				}
				break;
			case T__1:
				enterOuterAlt(_localctx, 2);
				{
				setState(302);
				unannTypeVariable();
				setState(303);
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
			setState(307);
			methodHeader();
			setState(308);
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
			setState(310);
			result();
			setState(311);
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
			setState(315);
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
				setState(313);
				unannType();
				}
				break;
			case VOID:
				enterOuterAlt(_localctx, 2);
				{
				setState(314);
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
			setState(317);
			match(Identifier);
			setState(318);
			match(LPAREN);
			setState(320);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__1) | (1L << BOOLEAN) | (1L << BYTE) | (1L << CHAR) | (1L << DOUBLE) | (1L << FINAL) | (1L << FLOAT) | (1L << INT) | (1L << LONG) | (1L << SHORT))) != 0) || _la==Identifier) {
				{
				setState(319);
				formalParameterList();
				}
			}

			setState(322);
			match(RPAREN);
			setState(324);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LBRACK) {
				{
				setState(323);
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
			setState(332);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,18,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(326);
				receiverParameter();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(327);
				formalParameters();
				setState(328);
				match(COMMA);
				setState(329);
				lastFormalParameter();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(331);
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
			setState(350);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,21,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(334);
				formalParameter();
				setState(339);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,19,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(335);
						match(COMMA);
						setState(336);
						formalParameter();
						}
						} 
					}
					setState(341);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,19,_ctx);
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(342);
				receiverParameter();
				setState(347);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,20,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(343);
						match(COMMA);
						setState(344);
						formalParameter();
						}
						} 
					}
					setState(349);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,20,_ctx);
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
			setState(355);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==FINAL || _la==Identifier) {
				{
				{
				setState(352);
				variableModifier();
				}
				}
				setState(357);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(358);
			unannType();
			setState(359);
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
			setState(364);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case FINAL:
				enterOuterAlt(_localctx, 1);
				{
				setState(361);
				match(FINAL);
				}
				break;
			case Identifier:
				enterOuterAlt(_localctx, 2);
				{
				setState(362);
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
			setState(377);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,25,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(369);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==FINAL || _la==Identifier) {
					{
					{
					setState(366);
					variableModifier();
					}
					}
					setState(371);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(372);
				unannType();
				setState(373);
				match(ELLIPSIS);
				setState(374);
				variableDeclaratorId();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(376);
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
			setState(379);
			unannType();
			setState(382);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Identifier) {
				{
				setState(380);
				match(Identifier);
				setState(381);
				match(DOT);
				}
			}

			setState(384);
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
			setState(386);
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
			setState(388);
			match(LBRACE);
			setState(390);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 35)) & ~0x3f) == 0 && ((1L << (_la - 35)) & ((1L << (IntegerLiteral - 35)) | (1L << (FloatingPointLiteral - 35)) | (1L << (BooleanLiteral - 35)) | (1L << (CharacterLiteral - 35)) | (1L << (StringLiteral - 35)) | (1L << (NullLiteral - 35)) | (1L << (LPAREN - 35)) | (1L << (LBRACE - 35)) | (1L << (ASSIGN - 35)) | (1L << (GT - 35)) | (1L << (LT - 35)) | (1L << (BANG - 35)) | (1L << (TILDE - 35)) | (1L << (COLON - 35)) | (1L << (ADD - 35)) | (1L << (SUB - 35)) | (1L << (MUL - 35)) | (1L << (DIV - 35)) | (1L << (BITAND - 35)) | (1L << (BITOR - 35)) | (1L << (Identifier - 35)))) != 0)) {
				{
				setState(389);
				variableInitializerList();
				}
			}

			setState(393);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COMMA) {
				{
				setState(392);
				match(COMMA);
				}
			}

			setState(395);
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
			setState(397);
			variableInitializer();
			setState(402);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,29,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(398);
					match(COMMA);
					setState(399);
					variableInitializer();
					}
					} 
				}
				setState(404);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,29,_ctx);
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
			setState(405);
			match(LBRACE);
			setState(407);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__1) | (1L << BOOLEAN) | (1L << BYTE) | (1L << CHAR) | (1L << DO) | (1L << DOUBLE) | (1L << FINAL) | (1L << FLOAT) | (1L << FOR) | (1L << IF) | (1L << INT) | (1L << LONG) | (1L << PRINT) | (1L << RETURN) | (1L << SCAN) | (1L << SHORT) | (1L << WHILE) | (1L << IntegerLiteral) | (1L << FloatingPointLiteral) | (1L << BooleanLiteral) | (1L << CharacterLiteral) | (1L << StringLiteral) | (1L << NullLiteral) | (1L << LPAREN) | (1L << LBRACE) | (1L << ASSIGN) | (1L << GT) | (1L << LT) | (1L << COLON))) != 0) || ((((_la - 65)) & ~0x3f) == 0 && ((1L << (_la - 65)) & ((1L << (ADD - 65)) | (1L << (SUB - 65)) | (1L << (MUL - 65)) | (1L << (DIV - 65)) | (1L << (BITAND - 65)) | (1L << (BITOR - 65)) | (1L << (Identifier - 65)))) != 0)) {
				{
				setState(406);
				blockStatements();
				}
			}

			setState(409);
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
			setState(412); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(411);
				blockStatement();
				}
				}
				setState(414); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__1) | (1L << BOOLEAN) | (1L << BYTE) | (1L << CHAR) | (1L << DO) | (1L << DOUBLE) | (1L << FINAL) | (1L << FLOAT) | (1L << FOR) | (1L << IF) | (1L << INT) | (1L << LONG) | (1L << PRINT) | (1L << RETURN) | (1L << SCAN) | (1L << SHORT) | (1L << WHILE) | (1L << IntegerLiteral) | (1L << FloatingPointLiteral) | (1L << BooleanLiteral) | (1L << CharacterLiteral) | (1L << StringLiteral) | (1L << NullLiteral) | (1L << LPAREN) | (1L << LBRACE) | (1L << ASSIGN) | (1L << GT) | (1L << LT) | (1L << COLON))) != 0) || ((((_la - 65)) & ~0x3f) == 0 && ((1L << (_la - 65)) & ((1L << (ADD - 65)) | (1L << (SUB - 65)) | (1L << (MUL - 65)) | (1L << (DIV - 65)) | (1L << (BITAND - 65)) | (1L << (BITOR - 65)) | (1L << (Identifier - 65)))) != 0) );
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
		public VariableNoInitContext variableNoInit() {
			return getRuleContext(VariableNoInitContext.class,0);
		}
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public ArrayCreationExpressionContext arrayCreationExpression() {
			return getRuleContext(ArrayCreationExpressionContext.class,0);
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
			setState(421);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,32,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(416);
				localVariableDeclarationStatement();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(417);
				variableDeclarationStatement();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(418);
				variableNoInit();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(419);
				statement();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(420);
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
			setState(423);
			variableDeclarator();
			setState(424);
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

	public static class VariableNoInitContext extends ParserRuleContext {
		public UnannTypeContext unannType() {
			return getRuleContext(UnannTypeContext.class,0);
		}
		public VariableDeclaratorIdContext variableDeclaratorId() {
			return getRuleContext(VariableDeclaratorIdContext.class,0);
		}
		public TerminalNode SEMI() { return getToken(ClypsParser.SEMI, 0); }
		public List<VariableModifierContext> variableModifier() {
			return getRuleContexts(VariableModifierContext.class);
		}
		public VariableModifierContext variableModifier(int i) {
			return getRuleContext(VariableModifierContext.class,i);
		}
		public VariableNoInitContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variableNoInit; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ClypsListener ) ((ClypsListener)listener).enterVariableNoInit(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ClypsListener ) ((ClypsListener)listener).exitVariableNoInit(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ClypsVisitor ) return ((ClypsVisitor<? extends T>)visitor).visitVariableNoInit(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VariableNoInitContext variableNoInit() throws RecognitionException {
		VariableNoInitContext _localctx = new VariableNoInitContext(_ctx, getState());
		enterRule(_localctx, 82, RULE_variableNoInit);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(429);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==FINAL || _la==Identifier) {
				{
				{
				setState(426);
				variableModifier();
				}
				}
				setState(431);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(432);
			unannType();
			setState(433);
			variableDeclaratorId();
			setState(434);
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
		enterRule(_localctx, 84, RULE_localVariableDeclarationStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(436);
			localVariableDeclaration();
			setState(437);
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
		public TerminalNode ASSIGN() { return getToken(ClypsParser.ASSIGN, 0); }
		public VariableInitializerContext variableInitializer() {
			return getRuleContext(VariableInitializerContext.class,0);
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
		enterRule(_localctx, 86, RULE_localVariableDeclaration);
		int _la;
		try {
			setState(454);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,35,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(442);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==FINAL || _la==Identifier) {
					{
					{
					setState(439);
					variableModifier();
					}
					}
					setState(444);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(445);
				unannType();
				setState(446);
				variableDeclaratorList();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(448);
				unannType();
				setState(449);
				unannType();
				setState(450);
				match(ASSIGN);
				setState(451);
				variableInitializer();
				notifyErrorListeners("Explicit Use of Keyword");
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
		enterRule(_localctx, 88, RULE_statement);
		try {
			setState(474);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,36,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(456);
				statementWithoutTrailingSubstatement();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(457);
				ifThenStatement();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(458);
				ifThenElseStatement();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(459);
				whileStatement();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(460);
				forStatement();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(461);
				printStatement();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(462);
				scanStatement();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(463);
				doStatement();
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(464);
				returnStatement();
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(465);
				postIncrementExpression();
				setState(466);
				match(SEMI);
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(468);
				postDecrementExpression();
				setState(469);
				match(SEMI);
				}
				break;
			case 12:
				enterOuterAlt(_localctx, 12);
				{
				setState(471);
				methodInvocation();
				setState(472);
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
		enterRule(_localctx, 90, RULE_printStatement);
		int _la;
		try {
			setState(499);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,39,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(476);
				match(PRINT);
				setState(477);
				match(LPAREN);
				setState(478);
				printBlock(0);
				setState(479);
				match(RPAREN);
				setState(480);
				match(SEMI);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(482);
				match(PRINT);
				setState(483);
				match(LPAREN);
				setState(487);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==StringLiteral || _la==Identifier) {
					{
					{
					setState(484);
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
					setState(489);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(493);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__3) | (1L << T__4) | (1L << IntegerLiteral) | (1L << DOT) | (1L << BANG) | (1L << COLON))) != 0) || ((((_la - 67)) & ~0x3f) == 0 && ((1L << (_la - 67)) & ((1L << (MUL - 67)) | (1L << (BITAND - 67)) | (1L << (CARET - 67)) | (1L << (MOD - 67)) | (1L << (AT - 67)))) != 0)) {
					{
					{
					setState(490);
					_la = _input.LA(1);
					if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__3) | (1L << T__4) | (1L << IntegerLiteral) | (1L << DOT) | (1L << BANG) | (1L << COLON))) != 0) || ((((_la - 67)) & ~0x3f) == 0 && ((1L << (_la - 67)) & ((1L << (MUL - 67)) | (1L << (BITAND - 67)) | (1L << (CARET - 67)) | (1L << (MOD - 67)) | (1L << (AT - 67)))) != 0)) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					}
					}
					setState(495);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(496);
				match(RPAREN);
				notifyErrorListeners("Missing double quotes");
				setState(498);
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
		int _startState = 92;
		enterRecursionRule(_localctx, 92, RULE_printBlock, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(502);
			printExtra();
			}
			_ctx.stop = _input.LT(-1);
			setState(509);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,40,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new PrintBlockContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_printBlock);
					setState(504);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(505);
					match(ADD);
					setState(506);
					printExtra();
					}
					} 
				}
				setState(511);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,40,_ctx);
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
		enterRule(_localctx, 94, RULE_printExtra);
		try {
			int _alt;
			setState(558);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,46,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(512);
				match(Identifier);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(513);
				match(StringLiteral);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(514);
				match(Identifier);
				setState(515);
				match(ADD);
				notifyErrorListeners("Too Many '+' Symbols");
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(517);
				match(StringLiteral);
				setState(518);
				match(ADD);
				notifyErrorListeners("Too Many '+' Symbols");
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(520);
				match(IntegerLiteral);
				setState(521);
				match(ADD);
				notifyErrorListeners("Too Many '+' Symbols");
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(523);
				match(IntegerLiteral);
				setState(525); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(524);
						match(IntegerLiteral);
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(527); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,41,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				notifyErrorListeners("Missing double quotes");
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(530);
				match(Identifier);
				setState(532); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(531);
						match(Identifier);
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(534); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,42,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				notifyErrorListeners("Missing double quotes");
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(537);
				match(Identifier);
				setState(539); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(538);
						match(StringLiteral);
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(541); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,43,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				notifyErrorListeners("Missing double quotes");
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(544);
				match(StringLiteral);
				setState(546); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(545);
						match(StringLiteral);
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(548); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,44,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				notifyErrorListeners("Missing double quotes");
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(551);
				match(StringLiteral);
				setState(553); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(552);
						match(Identifier);
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(555); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,45,_ctx);
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
		enterRule(_localctx, 96, RULE_scanStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(560);
			match(SCAN);
			setState(561);
			match(LPAREN);
			setState(562);
			scanBlock();
			setState(563);
			match(RPAREN);
			setState(564);
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
		enterRule(_localctx, 98, RULE_scanBlock);
		int _la;
		try {
			setState(581);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case StringLiteral:
				enterOuterAlt(_localctx, 1);
				{
				setState(566);
				match(StringLiteral);
				setState(569); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(567);
					match(COMMA);
					setState(568);
					scanExtra();
					}
					}
					setState(571); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==COMMA );
				}
				break;
			case Identifier:
				enterOuterAlt(_localctx, 2);
				{
				setState(573);
				match(Identifier);
				setState(578);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(574);
					match(COMMA);
					setState(575);
					scanExtra();
					}
					}
					setState(580);
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
		enterRule(_localctx, 100, RULE_scanExtra);
		try {
			setState(587);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,50,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(583);
				match(Identifier);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(584);
				match(Identifier);
				setState(585);
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
		enterRule(_localctx, 102, RULE_statementWithoutTrailingSubstatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(589);
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
		enterRule(_localctx, 104, RULE_statementExpression);
		try {
			setState(595);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,51,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(591);
				postIncrementExpression();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(592);
				postDecrementExpression();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(593);
				assignment();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(594);
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
		enterRule(_localctx, 106, RULE_ifThenStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(597);
			match(IF);
			setState(598);
			match(LPAREN);
			setState(599);
			conditionalExpression();
			setState(600);
			match(RPAREN);
			setState(601);
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
		enterRule(_localctx, 108, RULE_ifThenElseStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(603);
			match(IF);
			setState(604);
			match(LPAREN);
			setState(605);
			conditionalExpression();
			setState(606);
			match(RPAREN);
			setState(607);
			block();
			setState(608);
			match(ELSE);
			setState(609);
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
		enterRule(_localctx, 110, RULE_whileStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(611);
			match(WHILE);
			setState(612);
			match(LPAREN);
			setState(613);
			conditionalExpression();
			setState(614);
			match(RPAREN);
			setState(615);
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
		enterRule(_localctx, 112, RULE_doStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(617);
			match(DO);
			setState(618);
			block();
			setState(619);
			match(WHILE);
			setState(620);
			match(LPAREN);
			setState(621);
			conditionalExpression();
			setState(622);
			match(RPAREN);
			setState(623);
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
		public ForMiddleContext forMiddle() {
			return getRuleContext(ForMiddleContext.class,0);
		}
		public AssignmentExpressionContext assignmentExpression() {
			return getRuleContext(AssignmentExpressionContext.class,0);
		}
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
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
		enterRule(_localctx, 114, RULE_forStatement);
		try {
			setState(637);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,52,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(625);
				match(FOR);
				setState(626);
				forInit();
				setState(627);
				forMiddle();
				setState(628);
				assignmentExpression();
				setState(629);
				block();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(631);
				match(FOR);
				setState(632);
				forInit();
				setState(633);
				assignmentExpression();
				setState(634);
				block();
				notifyErrorListeners("Expecting 'up to' or 'down to'");
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

	public static class ForMiddleContext extends ParserRuleContext {
		public ForMiddleContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_forMiddle; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ClypsListener ) ((ClypsListener)listener).enterForMiddle(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ClypsListener ) ((ClypsListener)listener).exitForMiddle(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ClypsVisitor ) return ((ClypsVisitor<? extends T>)visitor).visitForMiddle(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ForMiddleContext forMiddle() throws RecognitionException {
		ForMiddleContext _localctx = new ForMiddleContext(_ctx, getState());
		enterRule(_localctx, 116, RULE_forMiddle);
		try {
			setState(642);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__5:
				enterOuterAlt(_localctx, 1);
				{
				setState(639);
				match(T__5);
				}
				break;
			case T__6:
				enterOuterAlt(_localctx, 2);
				{
				setState(640);
				match(T__6);
				}
				break;
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
			case BANG:
			case TILDE:
			case COLON:
			case ADD:
			case SUB:
			case MUL:
			case DIV:
			case BITAND:
			case BITOR:
			case Identifier:
				enterOuterAlt(_localctx, 3);
				{
				notifyErrorListeners("Expecting 'up to' or 'down to'");
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
		enterRule(_localctx, 118, RULE_forInit);
		try {
			setState(656);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,54,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(644);
				unannType();
				setState(645);
				variableDeclaratorList();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(647);
				unannType();
				setState(648);
				unannType();
				setState(649);
				variableDeclaratorList();
				notifyErrorListeners("Explicit Use of Keyword");
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(652);
				unannType();
				setState(653);
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
		enterRule(_localctx, 120, RULE_forUpdate);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(658);
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
		enterRule(_localctx, 122, RULE_statementExpressionList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(660);
			statementExpression();
			setState(665);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(661);
				match(COMMA);
				setState(662);
				statementExpression();
				}
				}
				setState(667);
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
		enterRule(_localctx, 124, RULE_returnStatement);
		int _la;
		try {
			setState(681);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,57,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(668);
				match(RETURN);
				setState(669);
				expression();
				setState(670);
				match(SEMI);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(672);
				match(RETURN);
				setState(676);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__1) | (1L << BOOLEAN) | (1L << FLOAT) | (1L << INT))) != 0)) {
					{
					{
					setState(673);
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
					setState(678);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(679);
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
		public LiteralContext literal() {
			return getRuleContext(LiteralContext.class,0);
		}
		public TerminalNode LPAREN() { return getToken(ClypsParser.LPAREN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(ClypsParser.RPAREN, 0); }
		public ArrayCallContext arrayCall() {
			return getRuleContext(ArrayCallContext.class,0);
		}
		public MethodInvocationContext methodInvocation() {
			return getRuleContext(MethodInvocationContext.class,0);
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
		enterRule(_localctx, 126, RULE_primary);
		try {
			setState(690);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,58,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(683);
				literal();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(684);
				match(LPAREN);
				setState(685);
				expression();
				setState(686);
				match(RPAREN);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(688);
				arrayCall();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(689);
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
		enterRule(_localctx, 128, RULE_primaryNoNewArray_lfno_arrayAccess);
		try {
			setState(698);
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
				setState(692);
				literal();
				}
				break;
			case LPAREN:
				enterOuterAlt(_localctx, 2);
				{
				setState(693);
				match(LPAREN);
				setState(694);
				expression();
				setState(695);
				match(RPAREN);
				}
				break;
			case Identifier:
				enterOuterAlt(_localctx, 3);
				{
				setState(697);
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

	public static class ArrayCallContext extends ParserRuleContext {
		public ExpressionNameContext expressionName() {
			return getRuleContext(ExpressionNameContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode RBRACK() { return getToken(ClypsParser.RBRACK, 0); }
		public ArrayCallContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arrayCall; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ClypsListener ) ((ClypsListener)listener).enterArrayCall(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ClypsListener ) ((ClypsListener)listener).exitArrayCall(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ClypsVisitor ) return ((ClypsVisitor<? extends T>)visitor).visitArrayCall(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArrayCallContext arrayCall() throws RecognitionException {
		ArrayCallContext _localctx = new ArrayCallContext(_ctx, getState());
		enterRule(_localctx, 130, RULE_arrayCall);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(700);
			expressionName();
			setState(701);
			match(T__7);
			setState(702);
			expression();
			setState(703);
			match(RBRACK);
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
		enterRule(_localctx, 132, RULE_arrayAccess);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(715);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,60,_ctx) ) {
			case 1:
				{
				setState(705);
				expressionName();
				setState(706);
				match(LBRACK);
				setState(707);
				expression();
				setState(708);
				match(RBRACK);
				}
				break;
			case 2:
				{
				setState(710);
				primaryNoNewArray_lfno_arrayAccess();
				setState(711);
				match(LBRACK);
				setState(712);
				expression();
				setState(713);
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
			setState(745);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,65,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(717);
				methodName();
				setState(718);
				match(LPAREN);
				setState(720);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (((((_la - 35)) & ~0x3f) == 0 && ((1L << (_la - 35)) & ((1L << (IntegerLiteral - 35)) | (1L << (FloatingPointLiteral - 35)) | (1L << (BooleanLiteral - 35)) | (1L << (CharacterLiteral - 35)) | (1L << (StringLiteral - 35)) | (1L << (NullLiteral - 35)) | (1L << (LPAREN - 35)) | (1L << (ASSIGN - 35)) | (1L << (GT - 35)) | (1L << (LT - 35)) | (1L << (BANG - 35)) | (1L << (TILDE - 35)) | (1L << (COLON - 35)) | (1L << (ADD - 35)) | (1L << (SUB - 35)) | (1L << (MUL - 35)) | (1L << (DIV - 35)) | (1L << (BITAND - 35)) | (1L << (BITOR - 35)) | (1L << (Identifier - 35)))) != 0)) {
					{
					setState(719);
					argumentList();
					}
				}

				setState(722);
				match(RPAREN);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(724);
				methodName();
				setState(727); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(725);
						match(LPAREN);
						setState(726);
						match(RPAREN);
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(729); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,62,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				setState(731);
				match(LPAREN);
				setState(733);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (((((_la - 35)) & ~0x3f) == 0 && ((1L << (_la - 35)) & ((1L << (IntegerLiteral - 35)) | (1L << (FloatingPointLiteral - 35)) | (1L << (BooleanLiteral - 35)) | (1L << (CharacterLiteral - 35)) | (1L << (StringLiteral - 35)) | (1L << (NullLiteral - 35)) | (1L << (LPAREN - 35)) | (1L << (ASSIGN - 35)) | (1L << (GT - 35)) | (1L << (LT - 35)) | (1L << (BANG - 35)) | (1L << (TILDE - 35)) | (1L << (COLON - 35)) | (1L << (ADD - 35)) | (1L << (SUB - 35)) | (1L << (MUL - 35)) | (1L << (DIV - 35)) | (1L << (BITAND - 35)) | (1L << (BITOR - 35)) | (1L << (Identifier - 35)))) != 0)) {
					{
					setState(732);
					argumentList();
					}
				}

				setState(735);
				match(RPAREN);
				setState(740);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,64,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(736);
						match(LPAREN);
						setState(737);
						match(RPAREN);
						}
						} 
					}
					setState(742);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,64,_ctx);
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
			setState(759);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,67,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(747);
				assignmentExpression();
				setState(752);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(748);
					match(COMMA);
					setState(749);
					assignmentExpression();
					}
					}
					setState(754);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(755);
				assignmentExpression();
				setState(756);
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
		public DimExprContext dimExpr() {
			return getRuleContext(DimExprContext.class,0);
		}
		public TerminalNode SEMI() { return getToken(ClypsParser.SEMI, 0); }
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
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(761);
			unannArrayType();
			setState(762);
			match(Identifier);
			setState(763);
			match(ASSIGN);
			setState(764);
			match(NEW);
			setState(765);
			primitiveType();
			setState(766);
			dimExpr();
			setState(767);
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

	public static class DimExprContext extends ParserRuleContext {
		public TerminalNode LBRACK() { return getToken(ClypsParser.LBRACK, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
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
		enterRule(_localctx, 140, RULE_dimExpr);
		try {
			setState(777);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,68,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(769);
				match(LBRACK);
				setState(770);
				expression();
				setState(771);
				match(RBRACK);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(773);
				match(LBRACK);
				setState(774);
				match(RBRACK);
				notifyErrorListeners("Array Size Required");
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(776);
				match(ArrayNum);
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
		enterRule(_localctx, 142, RULE_expression);
		try {
			setState(781);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,69,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(779);
				assignmentExpression();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(780);
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
		enterRule(_localctx, 144, RULE_assignmentExpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(783);
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
		enterRule(_localctx, 146, RULE_assignment);
		try {
			setState(790);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,70,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(785);
				leftHandSide();
				setState(786);
				assignmentOperator();
				setState(787);
				additiveExpression(0);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(789);
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
		enterRule(_localctx, 148, RULE_leftHandSide);
		try {
			setState(794);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,71,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(792);
				expressionName();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(793);
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
		enterRule(_localctx, 150, RULE_assignmentOperator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(796);
			_la = _input.LA(1);
			if ( !(((((_la - 50)) & ~0x3f) == 0 && ((1L << (_la - 50)) & ((1L << (ASSIGN - 50)) | (1L << (ADD_ASSIGN - 50)) | (1L << (SUB_ASSIGN - 50)) | (1L << (MUL_ASSIGN - 50)) | (1L << (DIV_ASSIGN - 50)) | (1L << (MOD_ASSIGN - 50)))) != 0)) ) {
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
		int _startState = 152;
		enterRecursionRule(_localctx, 152, RULE_expr, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(805);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LPAREN:
				{
				setState(799);
				match(LPAREN);
				setState(800);
				expr(0);
				setState(801);
				match(RPAREN);
				}
				break;
			case INT:
				{
				setState(803);
				((ExprContext)_localctx).atom = match(INT);
				}
				break;
			case BOOLEAN:
				{
				setState(804);
				((ExprContext)_localctx).atom = match(BOOLEAN);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(812);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,73,_ctx);
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
					setState(807);
					if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
					setState(808);
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
					setState(809);
					((ExprContext)_localctx).right = expr(5);
					}
					} 
				}
				setState(814);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,73,_ctx);
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
		enterRule(_localctx, 154, RULE_conditionalExpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(815);
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
		int _startState = 156;
		enterRecursionRule(_localctx, 156, RULE_conditionalOrExpression, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(818);
			conditionalAndExpression(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(836);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,76,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(834);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,75,_ctx) ) {
					case 1:
						{
						_localctx = new ConditionalOrExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_conditionalOrExpression);
						setState(820);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(821);
						match(OR);
						setState(822);
						conditionalAndExpression(0);
						}
						break;
					case 2:
						{
						_localctx = new ConditionalOrExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_conditionalOrExpression);
						setState(823);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(824);
						match(OR);
						setState(828);
						_errHandler.sync(this);
						_alt = getInterpreter().adaptivePredict(_input,74,_ctx);
						while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
							if ( _alt==1 ) {
								{
								{
								setState(825);
								match(BITOR);
								}
								} 
							}
							setState(830);
							_errHandler.sync(this);
							_alt = getInterpreter().adaptivePredict(_input,74,_ctx);
						}
						setState(831);
						conditionalAndExpression(0);
						notifyErrorListeners("Too Many '|' Symbols");
						}
						break;
					}
					} 
				}
				setState(838);
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
		int _startState = 158;
		enterRecursionRule(_localctx, 158, RULE_conditionalAndExpression, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(840);
			inclusiveOrExpression(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(858);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,79,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(856);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,78,_ctx) ) {
					case 1:
						{
						_localctx = new ConditionalAndExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_conditionalAndExpression);
						setState(842);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(843);
						match(AND);
						setState(844);
						inclusiveOrExpression(0);
						}
						break;
					case 2:
						{
						_localctx = new ConditionalAndExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_conditionalAndExpression);
						setState(845);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(846);
						match(AND);
						setState(850);
						_errHandler.sync(this);
						_alt = getInterpreter().adaptivePredict(_input,77,_ctx);
						while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
							if ( _alt==1 ) {
								{
								{
								setState(847);
								match(BITAND);
								}
								} 
							}
							setState(852);
							_errHandler.sync(this);
							_alt = getInterpreter().adaptivePredict(_input,77,_ctx);
						}
						setState(853);
						inclusiveOrExpression(0);
						notifyErrorListeners("Too Many '&' Symbols");
						}
						break;
					}
					} 
				}
				setState(860);
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
		int _startState = 160;
		enterRecursionRule(_localctx, 160, RULE_inclusiveOrExpression, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(862);
			exclusiveOrExpression(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(869);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,80,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new InclusiveOrExpressionContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_inclusiveOrExpression);
					setState(864);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(865);
					match(BITOR);
					setState(866);
					exclusiveOrExpression(0);
					}
					} 
				}
				setState(871);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,80,_ctx);
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
		int _startState = 162;
		enterRecursionRule(_localctx, 162, RULE_exclusiveOrExpression, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(873);
			andExpression(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(880);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,81,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new ExclusiveOrExpressionContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_exclusiveOrExpression);
					setState(875);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(876);
					match(CARET);
					setState(877);
					andExpression(0);
					}
					} 
				}
				setState(882);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,81,_ctx);
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
		int _startState = 164;
		enterRecursionRule(_localctx, 164, RULE_andExpression, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(884);
			equalityExpression(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(891);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,82,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new AndExpressionContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_andExpression);
					setState(886);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(887);
					match(BITAND);
					setState(888);
					equalityExpression(0);
					}
					} 
				}
				setState(893);
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
		int _startState = 166;
		enterRecursionRule(_localctx, 166, RULE_equalityExpression, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(895);
			relationalExpression(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(910);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,84,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(908);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,83,_ctx) ) {
					case 1:
						{
						_localctx = new EqualityExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_equalityExpression);
						setState(897);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(898);
						match(ASSIGN);
						setState(899);
						relationalExpression(0);
						notifyErrorListeners("Missing 1 '=' Symbol");
						}
						break;
					case 2:
						{
						_localctx = new EqualityExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_equalityExpression);
						setState(902);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(903);
						match(EQUAL);
						setState(904);
						relationalExpression(0);
						}
						break;
					case 3:
						{
						_localctx = new EqualityExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_equalityExpression);
						setState(905);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(906);
						match(NOTEQUAL);
						setState(907);
						relationalExpression(0);
						}
						break;
					}
					} 
				}
				setState(912);
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
		int _startState = 168;
		enterRecursionRule(_localctx, 168, RULE_relationalExpression, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(914);
			shiftExpression(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(930);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,86,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(928);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,85,_ctx) ) {
					case 1:
						{
						_localctx = new RelationalExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_relationalExpression);
						setState(916);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(917);
						match(LT);
						setState(918);
						shiftExpression(0);
						}
						break;
					case 2:
						{
						_localctx = new RelationalExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_relationalExpression);
						setState(919);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(920);
						match(GT);
						setState(921);
						shiftExpression(0);
						}
						break;
					case 3:
						{
						_localctx = new RelationalExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_relationalExpression);
						setState(922);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(923);
						match(LE);
						setState(924);
						shiftExpression(0);
						}
						break;
					case 4:
						{
						_localctx = new RelationalExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_relationalExpression);
						setState(925);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(926);
						match(GE);
						setState(927);
						shiftExpression(0);
						}
						break;
					}
					} 
				}
				setState(932);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,86,_ctx);
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
		int _startState = 170;
		enterRecursionRule(_localctx, 170, RULE_shiftExpression, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(934);
			unaryExpressionNotPlusMinus();
			}
			_ctx.stop = _input.LT(-1);
			setState(951);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,88,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(949);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,87,_ctx) ) {
					case 1:
						{
						_localctx = new ShiftExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_shiftExpression);
						setState(936);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(937);
						match(LT);
						setState(938);
						match(LT);
						setState(939);
						unaryExpressionNotPlusMinus();
						}
						break;
					case 2:
						{
						_localctx = new ShiftExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_shiftExpression);
						setState(940);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(941);
						match(GT);
						setState(942);
						match(GT);
						setState(943);
						unaryExpressionNotPlusMinus();
						}
						break;
					case 3:
						{
						_localctx = new ShiftExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_shiftExpression);
						setState(944);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(945);
						match(GT);
						setState(946);
						match(GT);
						setState(947);
						match(GT);
						setState(948);
						unaryExpressionNotPlusMinus();
						}
						break;
					}
					} 
				}
				setState(953);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,88,_ctx);
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
		int _startState = 172;
		enterRecursionRule(_localctx, 172, RULE_additiveExpression, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(955);
			multiplicativeExpression(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(987);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,92,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(985);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,91,_ctx) ) {
					case 1:
						{
						_localctx = new AdditiveExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_additiveExpression);
						setState(957);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(958);
						match(ADD);
						setState(959);
						multiplicativeExpression(0);
						}
						break;
					case 2:
						{
						_localctx = new AdditiveExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_additiveExpression);
						setState(960);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(961);
						match(INC);
						setState(965);
						_errHandler.sync(this);
						_alt = getInterpreter().adaptivePredict(_input,89,_ctx);
						while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
							if ( _alt==1 ) {
								{
								{
								setState(962);
								match(ADD);
								}
								} 
							}
							setState(967);
							_errHandler.sync(this);
							_alt = getInterpreter().adaptivePredict(_input,89,_ctx);
						}
						setState(968);
						multiplicativeExpression(0);
						notifyErrorListeners("Too Many '+' Symbols");
						}
						break;
					case 3:
						{
						_localctx = new AdditiveExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_additiveExpression);
						setState(971);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(972);
						match(SUB);
						setState(973);
						multiplicativeExpression(0);
						}
						break;
					case 4:
						{
						_localctx = new AdditiveExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_additiveExpression);
						setState(974);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(975);
						match(DEC);
						setState(979);
						_errHandler.sync(this);
						_alt = getInterpreter().adaptivePredict(_input,90,_ctx);
						while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
							if ( _alt==1 ) {
								{
								{
								setState(976);
								match(SUB);
								}
								} 
							}
							setState(981);
							_errHandler.sync(this);
							_alt = getInterpreter().adaptivePredict(_input,90,_ctx);
						}
						setState(982);
						multiplicativeExpression(0);
						notifyErrorListeners("Too Many '-' Symbols");
						}
						break;
					}
					} 
				}
				setState(989);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,92,_ctx);
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
		int _startState = 174;
		enterRecursionRule(_localctx, 174, RULE_multiplicativeExpression, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(991);
			unaryExpression();
			}
			_ctx.stop = _input.LT(-1);
			setState(1037);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,97,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(1035);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,96,_ctx) ) {
					case 1:
						{
						_localctx = new MultiplicativeExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_multiplicativeExpression);
						setState(993);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(994);
						match(MUL);
						setState(995);
						unaryExpression();
						}
						break;
					case 2:
						{
						_localctx = new MultiplicativeExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_multiplicativeExpression);
						setState(996);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(997);
						match(T__8);
						setState(1001);
						_errHandler.sync(this);
						_alt = getInterpreter().adaptivePredict(_input,93,_ctx);
						while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
							if ( _alt==1 ) {
								{
								{
								setState(998);
								match(MUL);
								}
								} 
							}
							setState(1003);
							_errHandler.sync(this);
							_alt = getInterpreter().adaptivePredict(_input,93,_ctx);
						}
						setState(1004);
						unaryExpression();
						notifyErrorListeners("Too Many '*' Symbols");
						}
						break;
					case 3:
						{
						_localctx = new MultiplicativeExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_multiplicativeExpression);
						setState(1007);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(1008);
						match(DIV);
						setState(1009);
						unaryExpression();
						}
						break;
					case 4:
						{
						_localctx = new MultiplicativeExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_multiplicativeExpression);
						setState(1010);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(1011);
						match(T__9);
						setState(1015);
						_errHandler.sync(this);
						_alt = getInterpreter().adaptivePredict(_input,94,_ctx);
						while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
							if ( _alt==1 ) {
								{
								{
								setState(1012);
								match(DIV);
								}
								} 
							}
							setState(1017);
							_errHandler.sync(this);
							_alt = getInterpreter().adaptivePredict(_input,94,_ctx);
						}
						setState(1018);
						unaryExpression();
						notifyErrorListeners("Too Many '/' Symbols");
						}
						break;
					case 5:
						{
						_localctx = new MultiplicativeExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_multiplicativeExpression);
						setState(1021);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(1022);
						match(MOD);
						setState(1023);
						unaryExpression();
						}
						break;
					case 6:
						{
						_localctx = new MultiplicativeExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_multiplicativeExpression);
						setState(1024);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(1025);
						match(T__10);
						setState(1029);
						_errHandler.sync(this);
						_la = _input.LA(1);
						while (_la==MOD) {
							{
							{
							setState(1026);
							match(MOD);
							}
							}
							setState(1031);
							_errHandler.sync(this);
							_la = _input.LA(1);
						}
						setState(1032);
						unaryExpression();
						notifyErrorListeners("Too Many '%' Symbols");
						}
						break;
					}
					} 
				}
				setState(1039);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,97,_ctx);
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
		enterRule(_localctx, 176, RULE_unaryExpression);
		try {
			setState(1045);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,98,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1040);
				match(ADD);
				setState(1041);
				unaryExpression();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1042);
				match(SUB);
				setState(1043);
				unaryExpression();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1044);
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
		enterRule(_localctx, 178, RULE_unaryExpressionNotPlusMinus);
		try {
			setState(1052);
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
				setState(1047);
				postfixExpression();
				}
				break;
			case TILDE:
				enterOuterAlt(_localctx, 2);
				{
				setState(1048);
				match(TILDE);
				setState(1049);
				unaryExpression();
				}
				break;
			case BANG:
				enterOuterAlt(_localctx, 3);
				{
				setState(1050);
				match(BANG);
				setState(1051);
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
		enterRule(_localctx, 180, RULE_postfixExpression);
		int _la;
		try {
			int _alt;
			setState(1071);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,102,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1054);
				primary();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1055);
				expressionName();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1056);
				primary();
				setState(1059); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(1057);
						match(LPAREN);
						setState(1058);
						match(RPAREN);
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(1061); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,100,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				notifyErrorListeners("Redundant Parenthesis");
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(1066); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(1065);
						_la = _input.LA(1);
						if ( !(((((_la - 50)) & ~0x3f) == 0 && ((1L << (_la - 50)) & ((1L << (ASSIGN - 50)) | (1L << (GT - 50)) | (1L << (LT - 50)) | (1L << (COLON - 50)) | (1L << (ADD - 50)) | (1L << (SUB - 50)) | (1L << (MUL - 50)) | (1L << (DIV - 50)) | (1L << (BITAND - 50)) | (1L << (BITOR - 50)))) != 0)) ) {
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
					setState(1068); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,101,_ctx);
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
		enterRule(_localctx, 182, RULE_postIncrementExpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1073);
			postfixExpression();
			setState(1074);
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
		enterRule(_localctx, 184, RULE_postDecrementExpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1076);
			postfixExpression();
			setState(1077);
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
		case 46:
			return printBlock_sempred((PrintBlockContext)_localctx, predIndex);
		case 76:
			return expr_sempred((ExprContext)_localctx, predIndex);
		case 78:
			return conditionalOrExpression_sempred((ConditionalOrExpressionContext)_localctx, predIndex);
		case 79:
			return conditionalAndExpression_sempred((ConditionalAndExpressionContext)_localctx, predIndex);
		case 80:
			return inclusiveOrExpression_sempred((InclusiveOrExpressionContext)_localctx, predIndex);
		case 81:
			return exclusiveOrExpression_sempred((ExclusiveOrExpressionContext)_localctx, predIndex);
		case 82:
			return andExpression_sempred((AndExpressionContext)_localctx, predIndex);
		case 83:
			return equalityExpression_sempred((EqualityExpressionContext)_localctx, predIndex);
		case 84:
			return relationalExpression_sempred((RelationalExpressionContext)_localctx, predIndex);
		case 85:
			return shiftExpression_sempred((ShiftExpressionContext)_localctx, predIndex);
		case 86:
			return additiveExpression_sempred((AdditiveExpressionContext)_localctx, predIndex);
		case 87:
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3^\u043a\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t;\4<\t<\4=\t="+
		"\4>\t>\4?\t?\4@\t@\4A\tA\4B\tB\4C\tC\4D\tD\4E\tE\4F\tF\4G\tG\4H\tH\4I"+
		"\tI\4J\tJ\4K\tK\4L\tL\4M\tM\4N\tN\4O\tO\4P\tP\4Q\tQ\4R\tR\4S\tS\4T\tT"+
		"\4U\tU\4V\tV\4W\tW\4X\tX\4Y\tY\4Z\tZ\4[\t[\4\\\t\\\4]\t]\4^\t^\3\2\3\2"+
		"\3\3\3\3\5\3\u00c1\n\3\3\4\3\4\5\4\u00c5\n\4\3\5\3\5\3\6\3\6\3\7\3\7\5"+
		"\7\u00cd\n\7\3\b\3\b\3\t\3\t\3\t\3\t\3\t\3\t\5\t\u00d7\n\t\3\n\3\n\3\n"+
		"\3\n\7\n\u00dd\n\n\f\n\16\n\u00e0\13\n\3\13\3\13\3\f\3\f\3\r\3\r\3\r\3"+
		"\r\3\16\3\16\5\16\u00ec\n\16\3\16\3\16\3\17\7\17\u00f1\n\17\f\17\16\17"+
		"\u00f4\13\17\3\20\7\20\u00f7\n\20\f\20\16\20\u00fa\13\20\3\20\3\20\7\20"+
		"\u00fe\n\20\f\20\16\20\u0101\13\20\3\21\3\21\3\21\3\21\3\21\3\22\3\22"+
		"\3\22\7\22\u010b\n\22\f\22\16\22\u010e\13\22\3\23\3\23\3\23\3\23\3\24"+
		"\3\24\3\24\3\24\3\24\3\24\5\24\u011a\n\24\3\25\3\25\3\25\3\25\3\25\3\25"+
		"\5\25\u0122\n\25\3\26\3\26\5\26\u0126\n\26\3\27\3\27\5\27\u012a\n\27\3"+
		"\30\3\30\3\31\3\31\3\31\3\31\3\31\3\31\5\31\u0134\n\31\3\32\3\32\3\32"+
		"\3\33\3\33\3\33\3\34\3\34\5\34\u013e\n\34\3\35\3\35\3\35\5\35\u0143\n"+
		"\35\3\35\3\35\5\35\u0147\n\35\3\36\3\36\3\36\3\36\3\36\3\36\5\36\u014f"+
		"\n\36\3\37\3\37\3\37\7\37\u0154\n\37\f\37\16\37\u0157\13\37\3\37\3\37"+
		"\3\37\7\37\u015c\n\37\f\37\16\37\u015f\13\37\5\37\u0161\n\37\3 \7 \u0164"+
		"\n \f \16 \u0167\13 \3 \3 \3 \3!\3!\3!\5!\u016f\n!\3\"\7\"\u0172\n\"\f"+
		"\"\16\"\u0175\13\"\3\"\3\"\3\"\3\"\3\"\5\"\u017c\n\"\3#\3#\3#\5#\u0181"+
		"\n#\3#\3#\3$\3$\3%\3%\5%\u0189\n%\3%\5%\u018c\n%\3%\3%\3&\3&\3&\7&\u0193"+
		"\n&\f&\16&\u0196\13&\3\'\3\'\5\'\u019a\n\'\3\'\3\'\3(\6(\u019f\n(\r(\16"+
		"(\u01a0\3)\3)\3)\3)\3)\5)\u01a8\n)\3*\3*\3*\3+\7+\u01ae\n+\f+\16+\u01b1"+
		"\13+\3+\3+\3+\3+\3,\3,\3,\3-\7-\u01bb\n-\f-\16-\u01be\13-\3-\3-\3-\3-"+
		"\3-\3-\3-\3-\3-\5-\u01c9\n-\3.\3.\3.\3.\3.\3.\3.\3.\3.\3.\3.\3.\3.\3."+
		"\3.\3.\3.\3.\5.\u01dd\n.\3/\3/\3/\3/\3/\3/\3/\3/\3/\7/\u01e8\n/\f/\16"+
		"/\u01eb\13/\3/\7/\u01ee\n/\f/\16/\u01f1\13/\3/\3/\3/\5/\u01f6\n/\3\60"+
		"\3\60\3\60\3\60\3\60\3\60\7\60\u01fe\n\60\f\60\16\60\u0201\13\60\3\61"+
		"\3\61\3\61\3\61\3\61\3\61\3\61\3\61\3\61\3\61\3\61\3\61\3\61\6\61\u0210"+
		"\n\61\r\61\16\61\u0211\3\61\3\61\3\61\6\61\u0217\n\61\r\61\16\61\u0218"+
		"\3\61\3\61\3\61\6\61\u021e\n\61\r\61\16\61\u021f\3\61\3\61\3\61\6\61\u0225"+
		"\n\61\r\61\16\61\u0226\3\61\3\61\3\61\6\61\u022c\n\61\r\61\16\61\u022d"+
		"\3\61\5\61\u0231\n\61\3\62\3\62\3\62\3\62\3\62\3\62\3\63\3\63\3\63\6\63"+
		"\u023c\n\63\r\63\16\63\u023d\3\63\3\63\3\63\7\63\u0243\n\63\f\63\16\63"+
		"\u0246\13\63\5\63\u0248\n\63\3\64\3\64\3\64\3\64\5\64\u024e\n\64\3\65"+
		"\3\65\3\66\3\66\3\66\3\66\5\66\u0256\n\66\3\67\3\67\3\67\3\67\3\67\3\67"+
		"\38\38\38\38\38\38\38\38\39\39\39\39\39\39\3:\3:\3:\3:\3:\3:\3:\3:\3;"+
		"\3;\3;\3;\3;\3;\3;\3;\3;\3;\3;\3;\5;\u0280\n;\3<\3<\3<\5<\u0285\n<\3="+
		"\3=\3=\3=\3=\3=\3=\3=\3=\3=\3=\3=\5=\u0293\n=\3>\3>\3?\3?\3?\7?\u029a"+
		"\n?\f?\16?\u029d\13?\3@\3@\3@\3@\3@\3@\7@\u02a5\n@\f@\16@\u02a8\13@\3"+
		"@\3@\5@\u02ac\n@\3A\3A\3A\3A\3A\3A\3A\5A\u02b5\nA\3B\3B\3B\3B\3B\3B\5"+
		"B\u02bd\nB\3C\3C\3C\3C\3C\3D\3D\3D\3D\3D\3D\3D\3D\3D\3D\5D\u02ce\nD\3"+
		"E\3E\3E\5E\u02d3\nE\3E\3E\3E\3E\3E\6E\u02da\nE\rE\16E\u02db\3E\3E\5E\u02e0"+
		"\nE\3E\3E\3E\7E\u02e5\nE\fE\16E\u02e8\13E\3E\3E\5E\u02ec\nE\3F\3F\3F\7"+
		"F\u02f1\nF\fF\16F\u02f4\13F\3F\3F\3F\3F\5F\u02fa\nF\3G\3G\3G\3G\3G\3G"+
		"\3G\3G\3H\3H\3H\3H\3H\3H\3H\3H\5H\u030c\nH\3I\3I\5I\u0310\nI\3J\3J\3K"+
		"\3K\3K\3K\3K\5K\u0319\nK\3L\3L\5L\u031d\nL\3M\3M\3N\3N\3N\3N\3N\3N\3N"+
		"\5N\u0328\nN\3N\3N\3N\7N\u032d\nN\fN\16N\u0330\13N\3O\3O\3P\3P\3P\3P\3"+
		"P\3P\3P\3P\3P\7P\u033d\nP\fP\16P\u0340\13P\3P\3P\3P\7P\u0345\nP\fP\16"+
		"P\u0348\13P\3Q\3Q\3Q\3Q\3Q\3Q\3Q\3Q\3Q\7Q\u0353\nQ\fQ\16Q\u0356\13Q\3"+
		"Q\3Q\3Q\7Q\u035b\nQ\fQ\16Q\u035e\13Q\3R\3R\3R\3R\3R\3R\7R\u0366\nR\fR"+
		"\16R\u0369\13R\3S\3S\3S\3S\3S\3S\7S\u0371\nS\fS\16S\u0374\13S\3T\3T\3"+
		"T\3T\3T\3T\7T\u037c\nT\fT\16T\u037f\13T\3U\3U\3U\3U\3U\3U\3U\3U\3U\3U"+
		"\3U\3U\3U\3U\7U\u038f\nU\fU\16U\u0392\13U\3V\3V\3V\3V\3V\3V\3V\3V\3V\3"+
		"V\3V\3V\3V\3V\3V\7V\u03a3\nV\fV\16V\u03a6\13V\3W\3W\3W\3W\3W\3W\3W\3W"+
		"\3W\3W\3W\3W\3W\3W\3W\3W\7W\u03b8\nW\fW\16W\u03bb\13W\3X\3X\3X\3X\3X\3"+
		"X\3X\3X\3X\7X\u03c6\nX\fX\16X\u03c9\13X\3X\3X\3X\3X\3X\3X\3X\3X\3X\7X"+
		"\u03d4\nX\fX\16X\u03d7\13X\3X\3X\3X\7X\u03dc\nX\fX\16X\u03df\13X\3Y\3"+
		"Y\3Y\3Y\3Y\3Y\3Y\3Y\3Y\7Y\u03ea\nY\fY\16Y\u03ed\13Y\3Y\3Y\3Y\3Y\3Y\3Y"+
		"\3Y\3Y\3Y\7Y\u03f8\nY\fY\16Y\u03fb\13Y\3Y\3Y\3Y\3Y\3Y\3Y\3Y\3Y\3Y\7Y\u0406"+
		"\nY\fY\16Y\u0409\13Y\3Y\3Y\3Y\7Y\u040e\nY\fY\16Y\u0411\13Y\3Z\3Z\3Z\3"+
		"Z\3Z\5Z\u0418\nZ\3[\3[\3[\3[\3[\5[\u041f\n[\3\\\3\\\3\\\3\\\3\\\6\\\u0426"+
		"\n\\\r\\\16\\\u0427\3\\\3\\\3\\\6\\\u042d\n\\\r\\\16\\\u042e\3\\\5\\\u0432"+
		"\n\\\3]\3]\3]\3^\3^\3^\3^\2\16^\u009a\u009e\u00a0\u00a2\u00a4\u00a6\u00a8"+
		"\u00aa\u00ac\u00ae\u00b0_\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&"+
		"(*,.\60\62\64\668:<>@BDFHJLNPRTVXZ\\^`bdfhjlnprtvxz|~\u0080\u0082\u0084"+
		"\u0086\u0088\u008a\u008c\u008e\u0090\u0092\u0094\u0096\u0098\u009a\u009c"+
		"\u009e\u00a0\u00a2\u00a4\u00a6\u00a8\u00aa\u00ac\u00ae\u00b0\u00b2\u00b4"+
		"\u00b6\u00b8\u00ba\2\13\3\2%*\5\2\20\21\33\34!!\4\2\25\25\30\30\4\2))"+
		"XX\13\2\6\7%%\63\63\67\67::EEGGIJYY\6\2\4\4\16\16\30\30\33\33\5\2\64\64"+
		"MPTT\4\2\65\67;@\5\2\64\66::CH\2\u0471\2\u00bc\3\2\2\2\4\u00c0\3\2\2\2"+
		"\6\u00c4\3\2\2\2\b\u00c6\3\2\2\2\n\u00c8\3\2\2\2\f\u00cc\3\2\2\2\16\u00ce"+
		"\3\2\2\2\20\u00d6\3\2\2\2\22\u00d8\3\2\2\2\24\u00e1\3\2\2\2\26\u00e3\3"+
		"\2\2\2\30\u00e5\3\2\2\2\32\u00e9\3\2\2\2\34\u00f2\3\2\2\2\36\u00f8\3\2"+
		"\2\2 \u0102\3\2\2\2\"\u0107\3\2\2\2$\u010f\3\2\2\2&\u0119\3\2\2\2(\u0121"+
		"\3\2\2\2*\u0125\3\2\2\2,\u0129\3\2\2\2.\u012b\3\2\2\2\60\u0133\3\2\2\2"+
		"\62\u0135\3\2\2\2\64\u0138\3\2\2\2\66\u013d\3\2\2\28\u013f\3\2\2\2:\u014e"+
		"\3\2\2\2<\u0160\3\2\2\2>\u0165\3\2\2\2@\u016e\3\2\2\2B\u017b\3\2\2\2D"+
		"\u017d\3\2\2\2F\u0184\3\2\2\2H\u0186\3\2\2\2J\u018f\3\2\2\2L\u0197\3\2"+
		"\2\2N\u019e\3\2\2\2P\u01a7\3\2\2\2R\u01a9\3\2\2\2T\u01af\3\2\2\2V\u01b6"+
		"\3\2\2\2X\u01c8\3\2\2\2Z\u01dc\3\2\2\2\\\u01f5\3\2\2\2^\u01f7\3\2\2\2"+
		"`\u0230\3\2\2\2b\u0232\3\2\2\2d\u0247\3\2\2\2f\u024d\3\2\2\2h\u024f\3"+
		"\2\2\2j\u0255\3\2\2\2l\u0257\3\2\2\2n\u025d\3\2\2\2p\u0265\3\2\2\2r\u026b"+
		"\3\2\2\2t\u027f\3\2\2\2v\u0284\3\2\2\2x\u0292\3\2\2\2z\u0294\3\2\2\2|"+
		"\u0296\3\2\2\2~\u02ab\3\2\2\2\u0080\u02b4\3\2\2\2\u0082\u02bc\3\2\2\2"+
		"\u0084\u02be\3\2\2\2\u0086\u02cd\3\2\2\2\u0088\u02eb\3\2\2\2\u008a\u02f9"+
		"\3\2\2\2\u008c\u02fb\3\2\2\2\u008e\u030b\3\2\2\2\u0090\u030f\3\2\2\2\u0092"+
		"\u0311\3\2\2\2\u0094\u0318\3\2\2\2\u0096\u031c\3\2\2\2\u0098\u031e\3\2"+
		"\2\2\u009a\u0327\3\2\2\2\u009c\u0331\3\2\2\2\u009e\u0333\3\2\2\2\u00a0"+
		"\u0349\3\2\2\2\u00a2\u035f\3\2\2\2\u00a4\u036a\3\2\2\2\u00a6\u0375\3\2"+
		"\2\2\u00a8\u0380\3\2\2\2\u00aa\u0393\3\2\2\2\u00ac\u03a7\3\2\2\2\u00ae"+
		"\u03bc\3\2\2\2\u00b0\u03e0\3\2\2\2\u00b2\u0417\3\2\2\2\u00b4\u041e\3\2"+
		"\2\2\u00b6\u0431\3\2\2\2\u00b8\u0433\3\2\2\2\u00ba\u0436\3\2\2\2\u00bc"+
		"\u00bd\t\2\2\2\u00bd\3\3\2\2\2\u00be\u00c1\5\6\4\2\u00bf\u00c1\7\16\2"+
		"\2\u00c0\u00be\3\2\2\2\u00c0\u00bf\3\2\2\2\u00c1\5\3\2\2\2\u00c2\u00c5"+
		"\5\b\5\2\u00c3\u00c5\5\n\6\2\u00c4\u00c2\3\2\2\2\u00c4\u00c3\3\2\2\2\u00c5"+
		"\7\3\2\2\2\u00c6\u00c7\t\3\2\2\u00c7\t\3\2\2\2\u00c8\u00c9\t\4\2\2\u00c9"+
		"\13\3\2\2\2\u00ca\u00cd\5\16\b\2\u00cb\u00cd\5\20\t\2\u00cc\u00ca\3\2"+
		"\2\2\u00cc\u00cb\3\2\2\2\u00cd\r\3\2\2\2\u00ce\u00cf\7X\2\2\u00cf\17\3"+
		"\2\2\2\u00d0\u00d1\5\4\3\2\u00d1\u00d2\5\22\n\2\u00d2\u00d7\3\2\2\2\u00d3"+
		"\u00d4\5\16\b\2\u00d4\u00d5\5\22\n\2\u00d5\u00d7\3\2\2\2\u00d6\u00d0\3"+
		"\2\2\2\u00d6\u00d3\3\2\2\2\u00d7\21\3\2\2\2\u00d8\u00d9\7/\2\2\u00d9\u00de"+
		"\7\60\2\2\u00da\u00db\7/\2\2\u00db\u00dd\7\60\2\2\u00dc\u00da\3\2\2\2"+
		"\u00dd\u00e0\3\2\2\2\u00de\u00dc\3\2\2\2\u00de\u00df\3\2\2\2\u00df\23"+
		"\3\2\2\2\u00e0\u00de\3\2\2\2\u00e1\u00e2\7X\2\2\u00e2\25\3\2\2\2\u00e3"+
		"\u00e4\7X\2\2\u00e4\27\3\2\2\2\u00e5\u00e6\7\22\2\2\u00e6\u00e7\7X\2\2"+
		"\u00e7\u00e8\5\32\16\2\u00e8\31\3\2\2\2\u00e9\u00eb\7-\2\2\u00ea\u00ec"+
		"\5\34\17\2\u00eb\u00ea\3\2\2\2\u00eb\u00ec\3\2\2\2\u00ec\u00ed\3\2\2\2"+
		"\u00ed\u00ee\7.\2\2\u00ee\33\3\2\2\2\u00ef\u00f1\5\36\20\2\u00f0\u00ef"+
		"\3\2\2\2\u00f1\u00f4\3\2\2\2\u00f2\u00f0\3\2\2\2\u00f2\u00f3\3\2\2\2\u00f3"+
		"\35\3\2\2\2\u00f4\u00f2\3\2\2\2\u00f5\u00f7\5\62\32\2\u00f6\u00f5\3\2"+
		"\2\2\u00f7\u00fa\3\2\2\2\u00f8\u00f6\3\2\2\2\u00f8\u00f9\3\2\2\2\u00f9"+
		"\u00fb\3\2\2\2\u00fa\u00f8\3\2\2\2\u00fb\u00ff\5 \21\2\u00fc\u00fe\5\62"+
		"\32\2\u00fd\u00fc\3\2\2\2\u00fe\u0101\3\2\2\2\u00ff\u00fd\3\2\2\2\u00ff"+
		"\u0100\3\2\2\2\u0100\37\3\2\2\2\u0101\u00ff\3\2\2\2\u0102\u0103\7\3\2"+
		"\2\u0103\u0104\7+\2\2\u0104\u0105\7,\2\2\u0105\u0106\5F$\2\u0106!\3\2"+
		"\2\2\u0107\u010c\5$\23\2\u0108\u0109\7\62\2\2\u0109\u010b\5$\23\2\u010a"+
		"\u0108\3\2\2\2\u010b\u010e\3\2\2\2\u010c\u010a\3\2\2\2\u010c\u010d\3\2"+
		"\2\2\u010d#\3\2\2\2\u010e\u010c\3\2\2\2\u010f\u0110\5&\24\2\u0110\u0111"+
		"\7\64\2\2\u0111\u0112\5(\25\2\u0112%\3\2\2\2\u0113\u0114\7X\2\2\u0114"+
		"\u0115\7/\2\2\u0115\u0116\5\u0090I\2\u0116\u0117\7\60\2\2\u0117\u011a"+
		"\3\2\2\2\u0118\u011a\7X\2\2\u0119\u0113\3\2\2\2\u0119\u0118\3\2\2\2\u011a"+
		"\'\3\2\2\2\u011b\u0122\5\u0090I\2\u011c\u011d\5\u0090I\2\u011d\u011e\5"+
		"\u0090I\2\u011e\u011f\b\25\1\2\u011f\u0122\3\2\2\2\u0120\u0122\5H%\2\u0121"+
		"\u011b\3\2\2\2\u0121\u011c\3\2\2\2\u0121\u0120\3\2\2\2\u0122)\3\2\2\2"+
		"\u0123\u0126\5,\27\2\u0124\u0126\5.\30\2\u0125\u0123\3\2\2\2\u0125\u0124"+
		"\3\2\2\2\u0126+\3\2\2\2\u0127\u012a\5\6\4\2\u0128\u012a\7\16\2\2\u0129"+
		"\u0127\3\2\2\2\u0129\u0128\3\2\2\2\u012a-\3\2\2\2\u012b\u012c\7\4\2\2"+
		"\u012c/\3\2\2\2\u012d\u012e\5,\27\2\u012e\u012f\5\22\n\2\u012f\u0134\3"+
		"\2\2\2\u0130\u0131\5.\30\2\u0131\u0132\5\22\n\2\u0132\u0134\3\2\2\2\u0133"+
		"\u012d\3\2\2\2\u0133\u0130\3\2\2\2\u0134\61\3\2\2\2\u0135\u0136\5\64\33"+
		"\2\u0136\u0137\5F$\2\u0137\63\3\2\2\2\u0138\u0139\5\66\34\2\u0139\u013a"+
		"\58\35\2\u013a\65\3\2\2\2\u013b\u013e\5*\26\2\u013c\u013e\7\"\2\2\u013d"+
		"\u013b\3\2\2\2\u013d\u013c\3\2\2\2\u013e\67\3\2\2\2\u013f\u0140\7X\2\2"+
		"\u0140\u0142\7+\2\2\u0141\u0143\5:\36\2\u0142\u0141\3\2\2\2\u0142\u0143"+
		"\3\2\2\2\u0143\u0144\3\2\2\2\u0144\u0146\7,\2\2\u0145\u0147\5\22\n\2\u0146"+
		"\u0145\3\2\2\2\u0146\u0147\3\2\2\2\u01479\3\2\2\2\u0148\u014f\5D#\2\u0149"+
		"\u014a\5<\37\2\u014a\u014b\7\62\2\2\u014b\u014c\5B\"\2\u014c\u014f\3\2"+
		"\2\2\u014d\u014f\5B\"\2\u014e\u0148\3\2\2\2\u014e\u0149\3\2\2\2\u014e"+
		"\u014d\3\2\2\2\u014f;\3\2\2\2\u0150\u0155\5> \2\u0151\u0152\7\62\2\2\u0152"+
		"\u0154\5> \2\u0153\u0151\3\2\2\2\u0154\u0157\3\2\2\2\u0155\u0153\3\2\2"+
		"\2\u0155\u0156\3\2\2\2\u0156\u0161\3\2\2\2\u0157\u0155\3\2\2\2\u0158\u015d"+
		"\5D#\2\u0159\u015a\7\62\2\2\u015a\u015c\5> \2\u015b\u0159\3\2\2\2\u015c"+
		"\u015f\3\2\2\2\u015d\u015b\3\2\2\2\u015d\u015e\3\2\2\2\u015e\u0161\3\2"+
		"\2\2\u015f\u015d\3\2\2\2\u0160\u0150\3\2\2\2\u0160\u0158\3\2\2\2\u0161"+
		"=\3\2\2\2\u0162\u0164\5@!\2\u0163\u0162\3\2\2\2\u0164\u0167\3\2\2\2\u0165"+
		"\u0163\3\2\2\2\u0165\u0166\3\2\2\2\u0166\u0168\3\2\2\2\u0167\u0165\3\2"+
		"\2\2\u0168\u0169\5*\26\2\u0169\u016a\5&\24\2\u016a?\3\2\2\2\u016b\u016f"+
		"\7\27\2\2\u016c\u016d\7X\2\2\u016d\u016f\b!\1\2\u016e\u016b\3\2\2\2\u016e"+
		"\u016c\3\2\2\2\u016fA\3\2\2\2\u0170\u0172\5@!\2\u0171\u0170\3\2\2\2\u0172"+
		"\u0175\3\2\2\2\u0173\u0171\3\2\2\2\u0173\u0174\3\2\2\2\u0174\u0176\3\2"+
		"\2\2\u0175\u0173\3\2\2\2\u0176\u0177\5*\26\2\u0177\u0178\7Z\2\2\u0178"+
		"\u0179\5&\24\2\u0179\u017c\3\2\2\2\u017a\u017c\5> \2\u017b\u0173\3\2\2"+
		"\2\u017b\u017a\3\2\2\2\u017cC\3\2\2\2\u017d\u0180\5*\26\2\u017e\u017f"+
		"\7X\2\2\u017f\u0181\7\63\2\2\u0180\u017e\3\2\2\2\u0180\u0181\3\2\2\2\u0181"+
		"\u0182\3\2\2\2\u0182\u0183\7\5\2\2\u0183E\3\2\2\2\u0184\u0185\5L\'\2\u0185"+
		"G\3\2\2\2\u0186\u0188\7-\2\2\u0187\u0189\5J&\2\u0188\u0187\3\2\2\2\u0188"+
		"\u0189\3\2\2\2\u0189\u018b\3\2\2\2\u018a\u018c\7\62\2\2\u018b\u018a\3"+
		"\2\2\2\u018b\u018c\3\2\2\2\u018c\u018d\3\2\2\2\u018d\u018e\7.\2\2\u018e"+
		"I\3\2\2\2\u018f\u0194\5(\25\2\u0190\u0191\7\62\2\2\u0191\u0193\5(\25\2"+
		"\u0192\u0190\3\2\2\2\u0193\u0196\3\2\2\2\u0194\u0192\3\2\2\2\u0194\u0195"+
		"\3\2\2\2\u0195K\3\2\2\2\u0196\u0194\3\2\2\2\u0197\u0199\7-\2\2\u0198\u019a"+
		"\5N(\2\u0199\u0198\3\2\2\2\u0199\u019a\3\2\2\2\u019a\u019b\3\2\2\2\u019b"+
		"\u019c\7.\2\2\u019cM\3\2\2\2\u019d\u019f\5P)\2\u019e\u019d\3\2\2\2\u019f"+
		"\u01a0\3\2\2\2\u01a0\u019e\3\2\2\2\u01a0\u01a1\3\2\2\2\u01a1O\3\2\2\2"+
		"\u01a2\u01a8\5V,\2\u01a3\u01a8\5R*\2\u01a4\u01a8\5T+\2\u01a5\u01a8\5Z"+
		".\2\u01a6\u01a8\5\u008cG\2\u01a7\u01a2\3\2\2\2\u01a7\u01a3\3\2\2\2\u01a7"+
		"\u01a4\3\2\2\2\u01a7\u01a5\3\2\2\2\u01a7\u01a6\3\2\2\2\u01a8Q\3\2\2\2"+
		"\u01a9\u01aa\5$\23\2\u01aa\u01ab\7\61\2\2\u01abS\3\2\2\2\u01ac\u01ae\5"+
		"@!\2\u01ad\u01ac\3\2\2\2\u01ae\u01b1\3\2\2\2\u01af\u01ad\3\2\2\2\u01af"+
		"\u01b0\3\2\2\2\u01b0\u01b2\3\2\2\2\u01b1\u01af\3\2\2\2\u01b2\u01b3\5*"+
		"\26\2\u01b3\u01b4\5&\24\2\u01b4\u01b5\7\61\2\2\u01b5U\3\2\2\2\u01b6\u01b7"+
		"\5X-\2\u01b7\u01b8\7\61\2\2\u01b8W\3\2\2\2\u01b9\u01bb\5@!\2\u01ba\u01b9"+
		"\3\2\2\2\u01bb\u01be\3\2\2\2\u01bc\u01ba\3\2\2\2\u01bc\u01bd\3\2\2\2\u01bd"+
		"\u01bf\3\2\2\2\u01be\u01bc\3\2\2\2\u01bf\u01c0\5*\26\2\u01c0\u01c1\5\""+
		"\22\2\u01c1\u01c9\3\2\2\2\u01c2\u01c3\5*\26\2\u01c3\u01c4\5*\26\2\u01c4"+
		"\u01c5\7\64\2\2\u01c5\u01c6\5(\25\2\u01c6\u01c7\b-\1\2\u01c7\u01c9\3\2"+
		"\2\2\u01c8\u01bc\3\2\2\2\u01c8\u01c2\3\2\2\2\u01c9Y\3\2\2\2\u01ca\u01dd"+
		"\5h\65\2\u01cb\u01dd\5l\67\2\u01cc\u01dd\5n8\2\u01cd\u01dd\5p9\2\u01ce"+
		"\u01dd\5t;\2\u01cf\u01dd\5\\/\2\u01d0\u01dd\5b\62\2\u01d1\u01dd\5r:\2"+
		"\u01d2\u01dd\5~@\2\u01d3\u01d4\5\u00b8]\2\u01d4\u01d5\7\61\2\2\u01d5\u01dd"+
		"\3\2\2\2\u01d6\u01d7\5\u00ba^\2\u01d7\u01d8\7\61\2\2\u01d8\u01dd\3\2\2"+
		"\2\u01d9\u01da\5\u0088E\2\u01da\u01db\7\61\2\2\u01db\u01dd\3\2\2\2\u01dc"+
		"\u01ca\3\2\2\2\u01dc\u01cb\3\2\2\2\u01dc\u01cc\3\2\2\2\u01dc\u01cd\3\2"+
		"\2\2\u01dc\u01ce\3\2\2\2\u01dc\u01cf\3\2\2\2\u01dc\u01d0\3\2\2\2\u01dc"+
		"\u01d1\3\2\2\2\u01dc\u01d2\3\2\2\2\u01dc\u01d3\3\2\2\2\u01dc\u01d6\3\2"+
		"\2\2\u01dc\u01d9\3\2\2\2\u01dd[\3\2\2\2\u01de\u01df\7\36\2\2\u01df\u01e0"+
		"\7+\2\2\u01e0\u01e1\5^\60\2\u01e1\u01e2\7,\2\2\u01e2\u01e3\7\61\2\2\u01e3"+
		"\u01f6\3\2\2\2\u01e4\u01e5\7\36\2\2\u01e5\u01e9\7+\2\2\u01e6\u01e8\t\5"+
		"\2\2\u01e7\u01e6\3\2\2\2\u01e8\u01eb\3\2\2\2\u01e9\u01e7\3\2\2\2\u01e9"+
		"\u01ea\3\2\2\2\u01ea\u01ef\3\2\2\2\u01eb\u01e9\3\2\2\2\u01ec\u01ee\t\6"+
		"\2\2\u01ed\u01ec\3\2\2\2\u01ee\u01f1\3\2\2\2\u01ef\u01ed\3\2\2\2\u01ef"+
		"\u01f0\3\2\2\2\u01f0\u01f2\3\2\2\2\u01f1\u01ef\3\2\2\2\u01f2\u01f3\7,"+
		"\2\2\u01f3\u01f4\b/\1\2\u01f4\u01f6\7\61\2\2\u01f5\u01de\3\2\2\2\u01f5"+
		"\u01e4\3\2\2\2\u01f6]\3\2\2\2\u01f7\u01f8\b\60\1\2\u01f8\u01f9\5`\61\2"+
		"\u01f9\u01ff\3\2\2\2\u01fa\u01fb\f\4\2\2\u01fb\u01fc\7C\2\2\u01fc\u01fe"+
		"\5`\61\2\u01fd\u01fa\3\2\2\2\u01fe\u0201\3\2\2\2\u01ff\u01fd\3\2\2\2\u01ff"+
		"\u0200\3\2\2\2\u0200_\3\2\2\2\u0201\u01ff\3\2\2\2\u0202\u0231\7X\2\2\u0203"+
		"\u0231\7)\2\2\u0204\u0205\7X\2\2\u0205\u0206\7C\2\2\u0206\u0231\b\61\1"+
		"\2\u0207\u0208\7)\2\2\u0208\u0209\7C\2\2\u0209\u0231\b\61\1\2\u020a\u020b"+
		"\7%\2\2\u020b\u020c\7C\2\2\u020c\u0231\b\61\1\2\u020d\u020f\7%\2\2\u020e"+
		"\u0210\7%\2\2\u020f\u020e\3\2\2\2\u0210\u0211\3\2\2\2\u0211\u020f\3\2"+
		"\2\2\u0211\u0212\3\2\2\2\u0212\u0213\3\2\2\2\u0213\u0231\b\61\1\2\u0214"+
		"\u0216\7X\2\2\u0215\u0217\7X\2\2\u0216\u0215\3\2\2\2\u0217\u0218\3\2\2"+
		"\2\u0218\u0216\3\2\2\2\u0218\u0219\3\2\2\2\u0219\u021a\3\2\2\2\u021a\u0231"+
		"\b\61\1\2\u021b\u021d\7X\2\2\u021c\u021e\7)\2\2\u021d\u021c\3\2\2\2\u021e"+
		"\u021f\3\2\2\2\u021f\u021d\3\2\2\2\u021f\u0220\3\2\2\2\u0220\u0221\3\2"+
		"\2\2\u0221\u0231\b\61\1\2\u0222\u0224\7)\2\2\u0223\u0225\7)\2\2\u0224"+
		"\u0223\3\2\2\2\u0225\u0226\3\2\2\2\u0226\u0224\3\2\2\2\u0226\u0227\3\2"+
		"\2\2\u0227\u0228\3\2\2\2\u0228\u0231\b\61\1\2\u0229\u022b\7)\2\2\u022a"+
		"\u022c\7X\2\2\u022b\u022a\3\2\2\2\u022c\u022d\3\2\2\2\u022d\u022b\3\2"+
		"\2\2\u022d\u022e\3\2\2\2\u022e\u022f\3\2\2\2\u022f\u0231\b\61\1\2\u0230"+
		"\u0202\3\2\2\2\u0230\u0203\3\2\2\2\u0230\u0204\3\2\2\2\u0230\u0207\3\2"+
		"\2\2\u0230\u020a\3\2\2\2\u0230\u020d\3\2\2\2\u0230\u0214\3\2\2\2\u0230"+
		"\u021b\3\2\2\2\u0230\u0222\3\2\2\2\u0230\u0229\3\2\2\2\u0231a\3\2\2\2"+
		"\u0232\u0233\7 \2\2\u0233\u0234\7+\2\2\u0234\u0235\5d\63\2\u0235\u0236"+
		"\7,\2\2\u0236\u0237\7\61\2\2\u0237c\3\2\2\2\u0238\u023b\7)\2\2\u0239\u023a"+
		"\7\62\2\2\u023a\u023c\5f\64\2\u023b\u0239\3\2\2\2\u023c\u023d\3\2\2\2"+
		"\u023d\u023b\3\2\2\2\u023d\u023e\3\2\2\2\u023e\u0248\3\2\2\2\u023f\u0244"+
		"\7X\2\2\u0240\u0241\7\62\2\2\u0241\u0243\5f\64\2\u0242\u0240\3\2\2\2\u0243"+
		"\u0246\3\2\2\2\u0244\u0242\3\2\2\2\u0244\u0245\3\2\2\2\u0245\u0248\3\2"+
		"\2\2\u0246\u0244\3\2\2\2\u0247\u0238\3\2\2\2\u0247\u023f\3\2\2\2\u0248"+
		"e\3\2\2\2\u0249\u024e\7X\2\2\u024a\u024b\7X\2\2\u024b\u024c\7\62\2\2\u024c"+
		"\u024e\b\64\1\2\u024d\u0249\3\2\2\2\u024d\u024a\3\2\2\2\u024eg\3\2\2\2"+
		"\u024f\u0250\5L\'\2\u0250i\3\2\2\2\u0251\u0256\5\u00b8]\2\u0252\u0256"+
		"\5\u00ba^\2\u0253\u0256\5\u0094K\2\u0254\u0256\5\u0088E\2\u0255\u0251"+
		"\3\2\2\2\u0255\u0252\3\2\2\2\u0255\u0253\3\2\2\2\u0255\u0254\3\2\2\2\u0256"+
		"k\3\2\2\2\u0257\u0258\7\32\2\2\u0258\u0259\7+\2\2\u0259\u025a\5\u009c"+
		"O\2\u025a\u025b\7,\2\2\u025b\u025c\5L\'\2\u025cm\3\2\2\2\u025d\u025e\7"+
		"\32\2\2\u025e\u025f\7+\2\2\u025f\u0260\5\u009cO\2\u0260\u0261\7,\2\2\u0261"+
		"\u0262\5L\'\2\u0262\u0263\7\26\2\2\u0263\u0264\5L\'\2\u0264o\3\2\2\2\u0265"+
		"\u0266\7#\2\2\u0266\u0267\7+\2\2\u0267\u0268\5\u009cO\2\u0268\u0269\7"+
		",\2\2\u0269\u026a\5L\'\2\u026aq\3\2\2\2\u026b\u026c\7\24\2\2\u026c\u026d"+
		"\5L\'\2\u026d\u026e\7#\2\2\u026e\u026f\7+\2\2\u026f\u0270\5\u009cO\2\u0270"+
		"\u0271\7,\2\2\u0271\u0272\7\61\2\2\u0272s\3\2\2\2\u0273\u0274\7\31\2\2"+
		"\u0274\u0275\5x=\2\u0275\u0276\5v<\2\u0276\u0277\5\u0092J\2\u0277\u0278"+
		"\5L\'\2\u0278\u0280\3\2\2\2\u0279\u027a\7\31\2\2\u027a\u027b\5x=\2\u027b"+
		"\u027c\5\u0092J\2\u027c\u027d\5L\'\2\u027d\u027e\b;\1\2\u027e\u0280\3"+
		"\2\2\2\u027f\u0273\3\2\2\2\u027f\u0279\3\2\2\2\u0280u\3\2\2\2\u0281\u0285"+
		"\7\b\2\2\u0282\u0285\7\t\2\2\u0283\u0285\b<\1\2\u0284\u0281\3\2\2\2\u0284"+
		"\u0282\3\2\2\2\u0284\u0283\3\2\2\2\u0285w\3\2\2\2\u0286\u0287\5*\26\2"+
		"\u0287\u0288\5\"\22\2\u0288\u0293\3\2\2\2\u0289\u028a\5*\26\2\u028a\u028b"+
		"\5*\26\2\u028b\u028c\5\"\22\2\u028c\u028d\b=\1\2\u028d\u0293\3\2\2\2\u028e"+
		"\u028f\5*\26\2\u028f\u0290\5&\24\2\u0290\u0291\b=\1\2\u0291\u0293\3\2"+
		"\2\2\u0292\u0286\3\2\2\2\u0292\u0289\3\2\2\2\u0292\u028e\3\2\2\2\u0293"+
		"y\3\2\2\2\u0294\u0295\5|?\2\u0295{\3\2\2\2\u0296\u029b\5j\66\2\u0297\u0298"+
		"\7\62\2\2\u0298\u029a\5j\66\2\u0299\u0297\3\2\2\2\u029a\u029d\3\2\2\2"+
		"\u029b\u0299\3\2\2\2\u029b\u029c\3\2\2\2\u029c}\3\2\2\2\u029d\u029b\3"+
		"\2\2\2\u029e\u029f\7\37\2\2\u029f\u02a0\5\u0090I\2\u02a0\u02a1\7\61\2"+
		"\2\u02a1\u02ac\3\2\2\2\u02a2\u02a6\7\37\2\2\u02a3\u02a5\t\7\2\2\u02a4"+
		"\u02a3\3\2\2\2\u02a5\u02a8\3\2\2\2\u02a6\u02a4\3\2\2\2\u02a6\u02a7\3\2"+
		"\2\2\u02a7\u02a9\3\2\2\2\u02a8\u02a6\3\2\2\2\u02a9\u02aa\7\61\2\2\u02aa"+
		"\u02ac\b@\1\2\u02ab\u029e\3\2\2\2\u02ab\u02a2\3\2\2\2\u02ac\177\3\2\2"+
		"\2\u02ad\u02b5\5\2\2\2\u02ae\u02af\7+\2\2\u02af\u02b0\5\u0090I\2\u02b0"+
		"\u02b1\7,\2\2\u02b1\u02b5\3\2\2\2\u02b2\u02b5\5\u0084C\2\u02b3\u02b5\5"+
		"\u0088E\2\u02b4\u02ad\3\2\2\2\u02b4\u02ae\3\2\2\2\u02b4\u02b2\3\2\2\2"+
		"\u02b4\u02b3\3\2\2\2\u02b5\u0081\3\2\2\2\u02b6\u02bd\5\2\2\2\u02b7\u02b8"+
		"\7+\2\2\u02b8\u02b9\5\u0090I\2\u02b9\u02ba\7,\2\2\u02ba\u02bd\3\2\2\2"+
		"\u02bb\u02bd\5\u0088E\2\u02bc\u02b6\3\2\2\2\u02bc\u02b7\3\2\2\2\u02bc"+
		"\u02bb\3\2\2\2\u02bd\u0083\3\2\2\2\u02be\u02bf\5\24\13\2\u02bf\u02c0\7"+
		"\n\2\2\u02c0\u02c1\5\u0090I\2\u02c1\u02c2\7\60\2\2\u02c2\u0085\3\2\2\2"+
		"\u02c3\u02c4\5\24\13\2\u02c4\u02c5\7/\2\2\u02c5\u02c6\5\u0090I\2\u02c6"+
		"\u02c7\7\60\2\2\u02c7\u02ce\3\2\2\2\u02c8\u02c9\5\u0082B\2\u02c9\u02ca"+
		"\7/\2\2\u02ca\u02cb\5\u0090I\2\u02cb\u02cc\7\60\2\2\u02cc\u02ce\3\2\2"+
		"\2\u02cd\u02c3\3\2\2\2\u02cd\u02c8\3\2\2\2\u02ce\u0087\3\2\2\2\u02cf\u02d0"+
		"\5\26\f\2\u02d0\u02d2\7+\2\2\u02d1\u02d3\5\u008aF\2\u02d2\u02d1\3\2\2"+
		"\2\u02d2\u02d3\3\2\2\2\u02d3\u02d4\3\2\2\2\u02d4\u02d5\7,\2\2\u02d5\u02ec"+
		"\3\2\2\2\u02d6\u02d9\5\26\f\2\u02d7\u02d8\7+\2\2\u02d8\u02da\7,\2\2\u02d9"+
		"\u02d7\3\2\2\2\u02da\u02db\3\2\2\2\u02db\u02d9\3\2\2\2\u02db\u02dc\3\2"+
		"\2\2\u02dc\u02dd\3\2\2\2\u02dd\u02df\7+\2\2\u02de\u02e0\5\u008aF\2\u02df"+
		"\u02de\3\2\2\2\u02df\u02e0\3\2\2\2\u02e0\u02e1\3\2\2\2\u02e1\u02e6\7,"+
		"\2\2\u02e2\u02e3\7+\2\2\u02e3\u02e5\7,\2\2\u02e4\u02e2\3\2\2\2\u02e5\u02e8"+
		"\3\2\2\2\u02e6\u02e4\3\2\2\2\u02e6\u02e7\3\2\2\2\u02e7\u02e9\3\2\2\2\u02e8"+
		"\u02e6\3\2\2\2\u02e9\u02ea\bE\1\2\u02ea\u02ec\3\2\2\2\u02eb\u02cf\3\2"+
		"\2\2\u02eb\u02d6\3\2\2\2\u02ec\u0089\3\2\2\2\u02ed\u02f2\5\u0092J\2\u02ee"+
		"\u02ef\7\62\2\2\u02ef\u02f1\5\u0092J\2\u02f0\u02ee\3\2\2\2\u02f1\u02f4"+
		"\3\2\2\2\u02f2\u02f0\3\2\2\2\u02f2\u02f3\3\2\2\2\u02f3\u02fa\3\2\2\2\u02f4"+
		"\u02f2\3\2\2\2\u02f5\u02f6\5\u0092J\2\u02f6\u02f7\5\u0092J\2\u02f7\u02f8"+
		"\bF\1\2\u02f8\u02fa\3\2\2\2\u02f9\u02ed\3\2\2\2\u02f9\u02f5\3\2\2\2\u02fa"+
		"\u008b\3\2\2\2\u02fb\u02fc\5\60\31\2\u02fc\u02fd\7X\2\2\u02fd\u02fe\7"+
		"\64\2\2\u02fe\u02ff\7\35\2\2\u02ff\u0300\5\4\3\2\u0300\u0301\5\u008eH"+
		"\2\u0301\u0302\7\61\2\2\u0302\u008d\3\2\2\2\u0303\u0304\7/\2\2\u0304\u0305"+
		"\5\u0090I\2\u0305\u0306\7\60\2\2\u0306\u030c\3\2\2\2\u0307\u0308\7/\2"+
		"\2\u0308\u0309\7\60\2\2\u0309\u030c\bH\1\2\u030a\u030c\7$\2\2\u030b\u0303"+
		"\3\2\2\2\u030b\u0307\3\2\2\2\u030b\u030a\3\2\2\2\u030c\u008f\3\2\2\2\u030d"+
		"\u0310\5\u0092J\2\u030e\u0310\5\u009cO\2\u030f\u030d\3\2\2\2\u030f\u030e"+
		"\3\2\2\2\u0310\u0091\3\2\2\2\u0311\u0312\5\u0094K\2\u0312\u0093\3\2\2"+
		"\2\u0313\u0314\5\u0096L\2\u0314\u0315\5\u0098M\2\u0315\u0316\5\u00aeX"+
		"\2\u0316\u0319\3\2\2\2\u0317\u0319\5\u00aeX\2\u0318\u0313\3\2\2\2\u0318"+
		"\u0317\3\2\2\2\u0319\u0095\3\2\2\2\u031a\u031d\5\24\13\2\u031b\u031d\5"+
		"\u0086D\2\u031c\u031a\3\2\2\2\u031c\u031b\3\2\2\2\u031d\u0097\3\2\2\2"+
		"\u031e\u031f\t\b\2\2\u031f\u0099\3\2\2\2\u0320\u0321\bN\1\2\u0321\u0322"+
		"\7+\2\2\u0322\u0323\5\u009aN\2\u0323\u0324\7,\2\2\u0324\u0328\3\2\2\2"+
		"\u0325\u0328\7\33\2\2\u0326\u0328\7\16\2\2\u0327\u0320\3\2\2\2\u0327\u0325"+
		"\3\2\2\2\u0327\u0326\3\2\2\2\u0328\u032e\3\2\2\2\u0329\u032a\f\6\2\2\u032a"+
		"\u032b\t\t\2\2\u032b\u032d\5\u009aN\7\u032c\u0329\3\2\2\2\u032d\u0330"+
		"\3\2\2\2\u032e\u032c\3\2\2\2\u032e\u032f\3\2\2\2\u032f\u009b\3\2\2\2\u0330"+
		"\u032e\3\2\2\2\u0331\u0332\5\u009eP\2\u0332\u009d\3\2\2\2\u0333\u0334"+
		"\bP\1\2\u0334\u0335\5\u00a0Q\2\u0335\u0346\3\2\2\2\u0336\u0337\f\4\2\2"+
		"\u0337\u0338\7@\2\2\u0338\u0345\5\u00a0Q\2\u0339\u033a\f\3\2\2\u033a\u033e"+
		"\7@\2\2\u033b\u033d\7H\2\2\u033c\u033b\3\2\2\2\u033d\u0340\3\2\2\2\u033e"+
		"\u033c\3\2\2\2\u033e\u033f\3\2\2\2\u033f\u0341\3\2\2\2\u0340\u033e\3\2"+
		"\2\2\u0341\u0342\5\u00a0Q\2\u0342\u0343\bP\1\2\u0343\u0345\3\2\2\2\u0344"+
		"\u0336\3\2\2\2\u0344\u0339\3\2\2\2\u0345\u0348\3\2\2\2\u0346\u0344\3\2"+
		"\2\2\u0346\u0347\3\2\2\2\u0347\u009f\3\2\2\2\u0348\u0346\3\2\2\2\u0349"+
		"\u034a\bQ\1\2\u034a\u034b\5\u00a2R\2\u034b\u035c\3\2\2\2\u034c\u034d\f"+
		"\4\2\2\u034d\u034e\7?\2\2\u034e\u035b\5\u00a2R\2\u034f\u0350\f\3\2\2\u0350"+
		"\u0354\7?\2\2\u0351\u0353\7G\2\2\u0352\u0351\3\2\2\2\u0353\u0356\3\2\2"+
		"\2\u0354\u0352\3\2\2\2\u0354\u0355\3\2\2\2\u0355\u0357\3\2\2\2\u0356\u0354"+
		"\3\2\2\2\u0357\u0358\5\u00a2R\2\u0358\u0359\bQ\1\2\u0359\u035b\3\2\2\2"+
		"\u035a\u034c\3\2\2\2\u035a\u034f\3\2\2\2\u035b\u035e\3\2\2\2\u035c\u035a"+
		"\3\2\2\2\u035c\u035d\3\2\2\2\u035d\u00a1\3\2\2\2\u035e\u035c\3\2\2\2\u035f"+
		"\u0360\bR\1\2\u0360\u0361\5\u00a4S\2\u0361\u0367\3\2\2\2\u0362\u0363\f"+
		"\3\2\2\u0363\u0364\7H\2\2\u0364\u0366\5\u00a4S\2\u0365\u0362\3\2\2\2\u0366"+
		"\u0369\3\2\2\2\u0367\u0365\3\2\2\2\u0367\u0368\3\2\2\2\u0368\u00a3\3\2"+
		"\2\2\u0369\u0367\3\2\2\2\u036a\u036b\bS\1\2\u036b\u036c\5\u00a6T\2\u036c"+
		"\u0372\3\2\2\2\u036d\u036e\f\3\2\2\u036e\u036f\7I\2\2\u036f\u0371\5\u00a6"+
		"T\2\u0370\u036d\3\2\2\2\u0371\u0374\3\2\2\2\u0372\u0370\3\2\2\2\u0372"+
		"\u0373\3\2\2\2\u0373\u00a5\3\2\2\2\u0374\u0372\3\2\2\2\u0375\u0376\bT"+
		"\1\2\u0376\u0377\5\u00a8U\2\u0377\u037d\3\2\2\2\u0378\u0379\f\3\2\2\u0379"+
		"\u037a\7G\2\2\u037a\u037c\5\u00a8U\2\u037b\u0378\3\2\2\2\u037c\u037f\3"+
		"\2\2\2\u037d\u037b\3\2\2\2\u037d\u037e\3\2\2\2\u037e\u00a7\3\2\2\2\u037f"+
		"\u037d\3\2\2\2\u0380\u0381\bU\1\2\u0381\u0382\5\u00aaV\2\u0382\u0390\3"+
		"\2\2\2\u0383\u0384\f\5\2\2\u0384\u0385\7\64\2\2\u0385\u0386\5\u00aaV\2"+
		"\u0386\u0387\bU\1\2\u0387\u038f\3\2\2\2\u0388\u0389\f\4\2\2\u0389\u038a"+
		"\7;\2\2\u038a\u038f\5\u00aaV\2\u038b\u038c\f\3\2\2\u038c\u038d\7>\2\2"+
		"\u038d\u038f\5\u00aaV\2\u038e\u0383\3\2\2\2\u038e\u0388\3\2\2\2\u038e"+
		"\u038b\3\2\2\2\u038f\u0392\3\2\2\2\u0390\u038e\3\2\2\2\u0390\u0391\3\2"+
		"\2\2\u0391\u00a9\3\2\2\2\u0392\u0390\3\2\2\2\u0393\u0394\bV\1\2\u0394"+
		"\u0395\5\u00acW\2\u0395\u03a4\3\2\2\2\u0396\u0397\f\6\2\2\u0397\u0398"+
		"\7\66\2\2\u0398\u03a3\5\u00acW\2\u0399\u039a\f\5\2\2\u039a\u039b\7\65"+
		"\2\2\u039b\u03a3\5\u00acW\2\u039c\u039d\f\4\2\2\u039d\u039e\7<\2\2\u039e"+
		"\u03a3\5\u00acW\2\u039f\u03a0\f\3\2\2\u03a0\u03a1\7=\2\2\u03a1\u03a3\5"+
		"\u00acW\2\u03a2\u0396\3\2\2\2\u03a2\u0399\3\2\2\2\u03a2\u039c\3\2\2\2"+
		"\u03a2\u039f\3\2\2\2\u03a3\u03a6\3\2\2\2\u03a4\u03a2\3\2\2\2\u03a4\u03a5"+
		"\3\2\2\2\u03a5\u00ab\3\2\2\2\u03a6\u03a4\3\2\2\2\u03a7\u03a8\bW\1\2\u03a8"+
		"\u03a9\5\u00b4[\2\u03a9\u03b9\3\2\2\2\u03aa\u03ab\f\5\2\2\u03ab\u03ac"+
		"\7\66\2\2\u03ac\u03ad\7\66\2\2\u03ad\u03b8\5\u00b4[\2\u03ae\u03af\f\4"+
		"\2\2\u03af\u03b0\7\65\2\2\u03b0\u03b1\7\65\2\2\u03b1\u03b8\5\u00b4[\2"+
		"\u03b2\u03b3\f\3\2\2\u03b3\u03b4\7\65\2\2\u03b4\u03b5\7\65\2\2\u03b5\u03b6"+
		"\7\65\2\2\u03b6\u03b8\5\u00b4[\2\u03b7\u03aa\3\2\2\2\u03b7\u03ae\3\2\2"+
		"\2\u03b7\u03b2\3\2\2\2\u03b8\u03bb\3\2\2\2\u03b9\u03b7\3\2\2\2\u03b9\u03ba"+
		"\3\2\2\2\u03ba\u00ad\3\2\2\2\u03bb\u03b9\3\2\2\2\u03bc\u03bd\bX\1\2\u03bd"+
		"\u03be\5\u00b0Y\2\u03be\u03dd\3\2\2\2\u03bf\u03c0\f\6\2\2\u03c0\u03c1"+
		"\7C\2\2\u03c1\u03dc\5\u00b0Y\2\u03c2\u03c3\f\5\2\2\u03c3\u03c7\7A\2\2"+
		"\u03c4\u03c6\7C\2\2\u03c5\u03c4\3\2\2\2\u03c6\u03c9\3\2\2\2\u03c7\u03c5"+
		"\3\2\2\2\u03c7\u03c8\3\2\2\2\u03c8\u03ca\3\2\2\2\u03c9\u03c7\3\2\2\2\u03ca"+
		"\u03cb\5\u00b0Y\2\u03cb\u03cc\bX\1\2\u03cc\u03dc\3\2\2\2\u03cd\u03ce\f"+
		"\4\2\2\u03ce\u03cf\7D\2\2\u03cf\u03dc\5\u00b0Y\2\u03d0\u03d1\f\3\2\2\u03d1"+
		"\u03d5\7B\2\2\u03d2\u03d4\7D\2\2\u03d3\u03d2\3\2\2\2\u03d4\u03d7\3\2\2"+
		"\2\u03d5\u03d3\3\2\2\2\u03d5\u03d6\3\2\2\2\u03d6\u03d8\3\2\2\2\u03d7\u03d5"+
		"\3\2\2\2\u03d8\u03d9\5\u00b0Y\2\u03d9\u03da\bX\1\2\u03da\u03dc\3\2\2\2"+
		"\u03db\u03bf\3\2\2\2\u03db\u03c2\3\2\2\2\u03db\u03cd\3\2\2\2\u03db\u03d0"+
		"\3\2\2\2\u03dc\u03df\3\2\2\2\u03dd\u03db\3\2\2\2\u03dd\u03de\3\2\2\2\u03de"+
		"\u00af\3\2\2\2\u03df\u03dd\3\2\2\2\u03e0\u03e1\bY\1\2\u03e1\u03e2\5\u00b2"+
		"Z\2\u03e2\u040f\3\2\2\2\u03e3\u03e4\f\b\2\2\u03e4\u03e5\7E\2\2\u03e5\u040e"+
		"\5\u00b2Z\2\u03e6\u03e7\f\7\2\2\u03e7\u03eb\7\13\2\2\u03e8\u03ea\7E\2"+
		"\2\u03e9\u03e8\3\2\2\2\u03ea\u03ed\3\2\2\2\u03eb\u03e9\3\2\2\2\u03eb\u03ec"+
		"\3\2\2\2\u03ec\u03ee\3\2\2\2\u03ed\u03eb\3\2\2\2\u03ee\u03ef\5\u00b2Z"+
		"\2\u03ef\u03f0\bY\1\2\u03f0\u040e\3\2\2\2\u03f1\u03f2\f\6\2\2\u03f2\u03f3"+
		"\7F\2\2\u03f3\u040e\5\u00b2Z\2\u03f4\u03f5\f\5\2\2\u03f5\u03f9\7\f\2\2"+
		"\u03f6\u03f8\7F\2\2\u03f7\u03f6\3\2\2\2\u03f8\u03fb\3\2\2\2\u03f9\u03f7"+
		"\3\2\2\2\u03f9\u03fa\3\2\2\2\u03fa\u03fc\3\2\2\2\u03fb\u03f9\3\2\2\2\u03fc"+
		"\u03fd\5\u00b2Z\2\u03fd\u03fe\bY\1\2\u03fe\u040e\3\2\2\2\u03ff\u0400\f"+
		"\4\2\2\u0400\u0401\7J\2\2\u0401\u040e\5\u00b2Z\2\u0402\u0403\f\3\2\2\u0403"+
		"\u0407\7\r\2\2\u0404\u0406\7J\2\2\u0405\u0404\3\2\2\2\u0406\u0409\3\2"+
		"\2\2\u0407\u0405\3\2\2\2\u0407\u0408\3\2\2\2\u0408\u040a\3\2\2\2\u0409"+
		"\u0407\3\2\2\2\u040a\u040b\5\u00b2Z\2\u040b\u040c\bY\1\2\u040c\u040e\3"+
		"\2\2\2\u040d\u03e3\3\2\2\2\u040d\u03e6\3\2\2\2\u040d\u03f1\3\2\2\2\u040d"+
		"\u03f4\3\2\2\2\u040d\u03ff\3\2\2\2\u040d\u0402\3\2\2\2\u040e\u0411\3\2"+
		"\2\2\u040f\u040d\3\2\2\2\u040f\u0410\3\2\2\2\u0410\u00b1\3\2\2\2\u0411"+
		"\u040f\3\2\2\2\u0412\u0413\7C\2\2\u0413\u0418\5\u00b2Z\2\u0414\u0415\7"+
		"D\2\2\u0415\u0418\5\u00b2Z\2\u0416\u0418\5\u00b4[\2\u0417\u0412\3\2\2"+
		"\2\u0417\u0414\3\2\2\2\u0417\u0416\3\2\2\2\u0418\u00b3\3\2\2\2\u0419\u041f"+
		"\5\u00b6\\\2\u041a\u041b\78\2\2\u041b\u041f\5\u00b2Z\2\u041c\u041d\7\67"+
		"\2\2\u041d\u041f\5\u00b2Z\2\u041e\u0419\3\2\2\2\u041e\u041a\3\2\2\2\u041e"+
		"\u041c\3\2\2\2\u041f\u00b5\3\2\2\2\u0420\u0432\5\u0080A\2\u0421\u0432"+
		"\5\24\13\2\u0422\u0425\5\u0080A\2\u0423\u0424\7+\2\2\u0424\u0426\7,\2"+
		"\2\u0425\u0423\3\2\2\2\u0426\u0427\3\2\2\2\u0427\u0425\3\2\2\2\u0427\u0428"+
		"\3\2\2\2\u0428\u0429\3\2\2\2\u0429\u042a\b\\\1\2\u042a\u0432\3\2\2\2\u042b"+
		"\u042d\t\n\2\2\u042c\u042b\3\2\2\2\u042d\u042e\3\2\2\2\u042e\u042c\3\2"+
		"\2\2\u042e\u042f\3\2\2\2\u042f\u0430\3\2\2\2\u0430\u0432\b\\\1\2\u0431"+
		"\u0420\3\2\2\2\u0431\u0421\3\2\2\2\u0431\u0422\3\2\2\2\u0431\u042c\3\2"+
		"\2\2\u0432\u00b7\3\2\2\2\u0433\u0434\5\u00b6\\\2\u0434\u0435\7A\2\2\u0435"+
		"\u00b9\3\2\2\2\u0436\u0437\5\u00b6\\\2\u0437\u0438\7B\2\2\u0438\u00bb"+
		"\3\2\2\2i\u00c0\u00c4\u00cc\u00d6\u00de\u00eb\u00f2\u00f8\u00ff\u010c"+
		"\u0119\u0121\u0125\u0129\u0133\u013d\u0142\u0146\u014e\u0155\u015d\u0160"+
		"\u0165\u016e\u0173\u017b\u0180\u0188\u018b\u0194\u0199\u01a0\u01a7\u01af"+
		"\u01bc\u01c8\u01dc\u01e9\u01ef\u01f5\u01ff\u0211\u0218\u021f\u0226\u022d"+
		"\u0230\u023d\u0244\u0247\u024d\u0255\u027f\u0284\u0292\u029b\u02a6\u02ab"+
		"\u02b4\u02bc\u02cd\u02d2\u02db\u02df\u02e6\u02eb\u02f2\u02f9\u030b\u030f"+
		"\u0318\u031c\u0327\u032e\u033e\u0344\u0346\u0354\u035a\u035c\u0367\u0372"+
		"\u037d\u038e\u0390\u03a2\u03a4\u03b7\u03b9\u03c7\u03d5\u03db\u03dd\u03eb"+
		"\u03f9\u0407\u040d\u040f\u0417\u041e\u0427\u042e\u0431";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}