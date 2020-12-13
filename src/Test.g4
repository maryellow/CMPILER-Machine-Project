grammar Test;

initClass
    : 'class' Identifier classBody
    ;

classBody
    : '{' (classBodyDeclaration)* '}'
    ;

classBodyDeclaration
	:	classMemberDeclaration
//	|	instanceInitializer
//	|	staticInitializer
	;

classMemberDeclaration
	:	mainDeclaration
	|	methodDeclaration
//	|	';'
	;

mainDeclaration
	:	'main''()' '{' functionBody '}'
	;

methodDeclaration
    : Identifier argumentsDefinition '{' functionBody '}'
    ;

argumentsDefinition
    : '(' argument (',' argument)* ')'
    | '()'
    ;

argument
    : varTypes argumentName ('=' expression)?
    ;

varTypes
    :   'int'
    |   'float'
    |   'char'
    |   'String'
    |   'boolean'
    ;

argumentName
    : Identifier
    ;

functionBody
    : (statement)*
    ;

statement
    : variableStatement
    | nonVarVariableStatement
    | otherStatements ';'
    ;

//variableStatement
//    : varTypes Identifier ('=' expression)? ';'
//    ;
//
//nonVarVariableStatement
//    : Identifier '=' expression ';'
//    ;

variableDeclaratorList
	:	variableDeclarator (',' variableDeclarator)*
	;

variableDeclarator
	:	variableDeclaratorId ('=' variableInitializer)?
	;

variableDeclaratorId
	:	Identifier dims?
	;

variableInitializer
	:	expression
	|	arrayInitializer
	;

assignmentOperator
	:	'='
	|	'*='
	|	'/='
	|	'%='
	|	'+='
	|	'-='
	;

otherStatements
    :   incrementExpression
    |   decrementExpression
    |   methodCall
    |   printStatement
    |   scanStatement
//    |	ifThenStatement
//    |	ifThenElseStatement
//    |	whileStatement
//    |	forStatement
//    |	ifThenElseStatementNoShortIf
//    |	whileStatementNoShortIf
//    |	forStatementNoShortIf
//    |	doStatement
    |	returnStatement
    ;

printStatement
    :   'print' '(' printBlock ')' ';'
    ;

printBlock
    :   StringLiteral printExtra*
    |   Identifier printExtra*
    ;

printExtra
    :   '+' Identifier
    |   '+' StringLiteral
    ;

scanStatement
    :   'scan' '(' StringLiteral? scanExtra+ ')' ';'
    ;

scanExtra
    :   ':' Identifier
    ;

//ifThenStatement
//	:	'if' '(' conditionalExpression ')' statement
//	;
//
//ifThenElseStatement
//	:	'if' '(' conditionalExpression ')' statementNoShortIf 'else' statement
//	;
//
//ifThenElseStatementNoShortIf
//	:	'if' '(' conditionalExpression ')' statementNoShortIf 'else' statementNoShortIf
//	;
//
//whileStatement
//	:	'while' '(' conditionalExpression ')' statement
//	;
//
//whileStatementNoShortIf
//	:	'while' '(' conditionalExpression ')' statementNoShortIf
//	;
//
//doStatement
//	:	'do' statement 'while' '(' conditionalExpression ')' ';'
//	;
//
//forStatement
//	:	basicForStatement
//	|	enhancedForStatement
//	;
//
//forStatementNoShortIf
//	:	basicForStatementNoShortIf
//	|	enhancedForStatementNoShortIf
//	;
//
//basicForStatement
//	:	'for' '(' forInit? ';' conditionalExpression? ';' forUpdate? ')' statement
//	;
//
//basicForStatementNoShortIf
//	:	'for' '(' forInit? ';' conditionalExpression? ';' forUpdate? ')' statementNoShortIf
//	;
//
//forInit
//	:	statementExpressionList
//	|	localVariableDeclaration
//	;
//
//forUpdate
//	:	statementExpressionList
//	;
//
//statementExpressionList
//	:	statementExpression (',' statementExpression)*
//	;
//
//enhancedForStatement
//	:	'for' '(' variableModifier* unannType variableDeclaratorId ':' expression ')' statement
//	;
//
//enhancedForStatementNoShortIf
//	:	'for' '(' variableModifier* unannType variableDeclaratorId ':' expression ')' statementNoShortIf
//	;

returnStatement
	:	'return' expression? ';'
	;


literals
    :
    |   StringLiteral
    |   IntegerLiteral
    |   FloatingPointLiteral
    |   BooleanLiteral
    |   NullLiteral
    |   CharacterLiteral
    |   Identifier
    ;

incrementExpression
    : variableName '++'
    ;

decrementExpression
    : variableName '--'
    ;

arrayCreationExpression
	:	'new' varTypes dimExprs dims?
	|	'new' varTypes dims arrayInitializer
	;

dimExprs
	:	dimExpr dimExpr*
	;

dimExpr
	:	'[' expression ']'
	;

dims
	:	'[' ']' ('[' ']')*
	;

arrayInitializer
	:	'{' variableInitializerList? ','? '}'
	;

variableInitializerList
	:	variableInitializer (',' variableInitializer)*
	;

primary
	:	(	primaryNoNewArray_lfno_primary
		|	arrayCreationExpression
		)
		(	primaryNoNewArray_lf_primary
		)*
	;

primaryNoNewArray_lfno_primary
	:	literal
	|	typeName ('[' ']')* '.' 'class'
	|	unannPrimitiveType ('[' ']')* '.' 'class'
	|	'void' '.' 'class'
	|	'this'
	|	typeName '.' 'this'
	|	'(' expression ')'
	|	fieldAccess_lfno_primary
	|	arrayAccess_lfno_primary
	|	methodInvocation_lfno_primary
	|	methodReference_lfno_primary
	;

primaryNoNewArray_lf_primary
	:	fieldAccess_lf_primary
	|	arrayAccess_lf_primary
	|	methodInvocation_lf_primary
	|	methodReference_lf_primary
	;

expression
	:
	|	assignmentExpression
	|   conditionalExpression
	;

assignmentExpression
	:	//conditionalExpression
	|	assignment
	;

assignment
	:	leftHandSide assignmentOperator additiveExpression
	|   additiveExpression
	;

leftHandSide
	:	Identifier
	|	arrayAccess
	;

arrayAccess
	:	(	Identifier '[' expression ']'
		|	primaryNoNewArray_lfno_arrayAccess '[' expression ']'
		)
		(	primaryNoNewArray_lf_arrayAccess '[' expression ']'
		)*
	;

primaryNoNewArray_lfno_arrayAccess
	:	literals
	|	'(' expression ')'
	;

primaryNoNewArray_lf_arrayAccess
	:
	;

conditionalExpression
	:	conditionalOrExpression
//	|	conditionalOrExpression '?' expression ':' conditionalExpression
	;

conditionalOrExpression
	:	conditionalAndExpression
	|	conditionalOrExpression '||' conditionalAndExpression
	;

conditionalAndExpression
	:	inclusiveOrExpression
	|	conditionalAndExpression '&&' inclusiveOrExpression
	;

inclusiveOrExpression
	:	exclusiveOrExpression
	|	inclusiveOrExpression '|' exclusiveOrExpression
	;

exclusiveOrExpression
	:	andExpression
	|	exclusiveOrExpression '^' andExpression
	;

andExpression
	:	equalityExpression
	|	andExpression '&' equalityExpression
	;

equalityExpression
	:	relationalExpression
	|	equalityExpression '==' relationalExpression
	|	equalityExpression '!=' relationalExpression
	|   equalityExpression '=' relationalExpression {notifyErrorListeners("Missing '='");}
	;

relationalExpression
	:	shiftExpression
	|	relationalExpression '<' shiftExpression
	|	relationalExpression '>' shiftExpression
	|	relationalExpression '<=' shiftExpression
	|	relationalExpression '>=' shiftExpression
	;

shiftExpression
	:	unaryExpressionNotPlusMinus
	|	shiftExpression '<' '<' additiveExpression
	|	shiftExpression '>' '>' additiveExpression
	|	shiftExpression '>' '>' '>' additiveExpression
	;

additiveExpression
	:	multiplicativeExpression
	|	additiveExpression '+' multiplicativeExpression
	|   additiveExpression '++'('+')* multiplicativeExpression {notifyErrorListeners("Too Many '+' Symbols");}
	|	additiveExpression '-' multiplicativeExpression
	;

multiplicativeExpression
	:	unaryExpression
	|	multiplicativeExpression '*' unaryExpression
	|	multiplicativeExpression '/' unaryExpression
	|	multiplicativeExpression '%' unaryExpression
	;

unaryExpression
	:	preIncrementExpression
	|	preDecrementExpression
	|	'+' unaryExpression
	|	'-' unaryExpression
	|	unaryExpressionNotPlusMinus
	;

preIncrementExpression
	:	'++' unaryExpression
	;

preDecrementExpression
	:	'--' unaryExpression
	;

unaryExpressionNotPlusMinus
	:	postfixExpression
	|	'~' unaryExpression
	|	'!' unaryExpression
	|	castExpression
	;

postfixExpression
	:	(	primary
		|	Identifier
		)
//		(	postIncrementExpression_lf_postfixExpression
//		|	postDecrementExpression_lf_postfixExpression
//		)*
	;

postIncrementExpression
	:	postfixExpression '++'
	;

//postIncrementExpression_lf_postfixExpression
//	:	'++'
//	;

postDecrementExpression
	:	postfixExpression '--'
	;
//
//postDecrementExpression_lf_postfixExpression
//	:	'--'
//	;

castExpression
	:	'(' primitiveType ')' unaryExpression
	|	'(' referenceType additionalBound* ')' unaryExpressionNotPlusMinus
	;

//assignmentExpression
//    : Identifier (assignmentExpressionSuffix)*
//    | additiveExpression
//    |
//    ;
//
//additiveExpression
//	:	multiplicativeExpression
//	|	additiveExpression '+' multiplicativeExpression
////	|   additiveExpression '++'('+')* multiplicativeExpression {notifyErrorListeners("Too Many '+' Symbols");}
//	|	additiveExpression '-' multiplicativeExpression
//	;
//
//multiplicativeExpression
//	:	endExpression
//	|	multiplicativeExpression '*' endExpression
//	|	multiplicativeExpression '/' endExpression
//	|	multiplicativeExpression '%' endExpression
//	;
//
//endExpression
//    :   '(' expression ')'
//    |   literals
//    ;

assignmentExpressionSuffix
    : ArrayIndex
    | ('()' | '(' expression (',' expression)* ')' )
    ;

methodCall
    : Identifier ('()' | '(' expression (',' expression)* ')' )
    ;

variableName
    : Identifier (variableSuffix)*
    ;

variableSuffix
    : ArrayIndex
    ;

arrayLiteral
    : '[' expression (',' expression)* ']'
    ;

objectLiteral
    : '{' (Identifier '=' expression (',' Identifier '=' expression)*)? '}'
    ;

keyValue
    : Identifier '=' StringLiteral
    ;

IntegerLiteral
    :   DecimalNumeral
    ;

fragment
DecimalNumeral
	:	'0'
	|	NonZeroDigit (Digits? | Underscores Digits)
	;

fragment
Digits
	:	Digit (DigitsAndUnderscores? Digit)?
	;

fragment
Digit
	:	'0'
	|	NonZeroDigit
	;

fragment
NonZeroDigit
	:	[1-9]
	;

fragment
DigitsAndUnderscores
	:	DigitOrUnderscore+
	;

fragment
DigitOrUnderscore
	:	Digit
	|	'_'
	;

fragment
Underscores
	:	'_'+
	;

FloatingPointLiteral
    :   DecimalFloatingPointLiteral
    ;

fragment
DecimalFloatingPointLiteral
	:	Digits '.' Digits? ExponentPart? FloatTypeSuffix?
	|	'.' Digits ExponentPart? FloatTypeSuffix?
	|	Digits ExponentPart FloatTypeSuffix?
	|	Digits FloatTypeSuffix
	;

fragment
ExponentPart
	:	ExponentIndicator SignedInteger
	;

fragment
ExponentIndicator
	:	[eE]
	;

fragment
SignedInteger
	:	Sign? Digits
	;

fragment
Sign
	:	[+-]
	;

fragment
FloatTypeSuffix
	:	[fF]
	;

BooleanLiteral
	:	'true'
	|	'false'
	;

CharacterLiteral
	:	'\'' SingleCharacter '\''
	|	'\'' EscapeSequence '\''
	;

fragment
SingleCharacter
	:	~['\\\r\n]
	;

StringLiteral
	:	'"' StringCharacters? '"'
	;

fragment
StringCharacters
	:	StringCharacter+
	;

fragment
StringCharacter
	:	~["\\\r\n]
	|	EscapeSequence
	;

NullLiteral
	:	'null'
	;

fragment
EscapeSequence
	:	'\\' [btnfr"'\\]
	;

ArrayIndex
    : '[' [1-9] [0-9]* ']'
    | '[' StringLiteral ']'
    ;

Identifier
    : [a-zA-Z0-9]+
    ;

WS
    : [ \t\r\n]+ -> skip
    ;

COMMENT
    : '/*' .*? '*/'  -> skip
    ;

LINE_COMMENT
    :   '//' ~[\r\n]* -> skip
    ;