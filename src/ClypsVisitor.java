// Generated from C:/Users/jeffc/Desktop/CMPILER-Machine-Project/src\Clyps.g4 by ANTLR 4.9
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link ClypsParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface ClypsVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link ClypsParser#literal}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLiteral(ClypsParser.LiteralContext ctx);
	/**
	 * Visit a parse tree produced by {@link ClypsParser#primitiveType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrimitiveType(ClypsParser.PrimitiveTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link ClypsParser#numericType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNumericType(ClypsParser.NumericTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link ClypsParser#integralType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIntegralType(ClypsParser.IntegralTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link ClypsParser#floatingPointType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFloatingPointType(ClypsParser.FloatingPointTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link ClypsParser#referenceType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReferenceType(ClypsParser.ReferenceTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link ClypsParser#classOrInterfaceType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClassOrInterfaceType(ClypsParser.ClassOrInterfaceTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link ClypsParser#classType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClassType(ClypsParser.ClassTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link ClypsParser#classType_lf_classOrInterfaceType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClassType_lf_classOrInterfaceType(ClypsParser.ClassType_lf_classOrInterfaceTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link ClypsParser#classType_lfno_classOrInterfaceType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClassType_lfno_classOrInterfaceType(ClypsParser.ClassType_lfno_classOrInterfaceTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link ClypsParser#interfaceType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInterfaceType(ClypsParser.InterfaceTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link ClypsParser#interfaceType_lf_classOrInterfaceType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInterfaceType_lf_classOrInterfaceType(ClypsParser.InterfaceType_lf_classOrInterfaceTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link ClypsParser#interfaceType_lfno_classOrInterfaceType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInterfaceType_lfno_classOrInterfaceType(ClypsParser.InterfaceType_lfno_classOrInterfaceTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link ClypsParser#typeVariable}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeVariable(ClypsParser.TypeVariableContext ctx);
	/**
	 * Visit a parse tree produced by {@link ClypsParser#arrayType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArrayType(ClypsParser.ArrayTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link ClypsParser#dims}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDims(ClypsParser.DimsContext ctx);
	/**
	 * Visit a parse tree produced by {@link ClypsParser#typeParameter}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeParameter(ClypsParser.TypeParameterContext ctx);
	/**
	 * Visit a parse tree produced by {@link ClypsParser#typeParameterModifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeParameterModifier(ClypsParser.TypeParameterModifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link ClypsParser#typeBound}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeBound(ClypsParser.TypeBoundContext ctx);
	/**
	 * Visit a parse tree produced by {@link ClypsParser#additionalBound}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAdditionalBound(ClypsParser.AdditionalBoundContext ctx);
	/**
	 * Visit a parse tree produced by {@link ClypsParser#typeArguments}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeArguments(ClypsParser.TypeArgumentsContext ctx);
	/**
	 * Visit a parse tree produced by {@link ClypsParser#typeArgumentList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeArgumentList(ClypsParser.TypeArgumentListContext ctx);
	/**
	 * Visit a parse tree produced by {@link ClypsParser#typeArgument}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeArgument(ClypsParser.TypeArgumentContext ctx);
	/**
	 * Visit a parse tree produced by {@link ClypsParser#wildcard}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWildcard(ClypsParser.WildcardContext ctx);
	/**
	 * Visit a parse tree produced by {@link ClypsParser#wildcardBounds}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWildcardBounds(ClypsParser.WildcardBoundsContext ctx);
	/**
	 * Visit a parse tree produced by {@link ClypsParser#typeName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeName(ClypsParser.TypeNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link ClypsParser#packageOrTypeName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPackageOrTypeName(ClypsParser.PackageOrTypeNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link ClypsParser#expressionName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpressionName(ClypsParser.ExpressionNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link ClypsParser#methodName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMethodName(ClypsParser.MethodNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link ClypsParser#ambiguousName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAmbiguousName(ClypsParser.AmbiguousNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link ClypsParser#classDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClassDeclaration(ClypsParser.ClassDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link ClypsParser#normalClassDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNormalClassDeclaration(ClypsParser.NormalClassDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link ClypsParser#typeParameters}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeParameters(ClypsParser.TypeParametersContext ctx);
	/**
	 * Visit a parse tree produced by {@link ClypsParser#typeParameterList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeParameterList(ClypsParser.TypeParameterListContext ctx);
	/**
	 * Visit a parse tree produced by {@link ClypsParser#classBody}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClassBody(ClypsParser.ClassBodyContext ctx);
	/**
	 * Visit a parse tree produced by {@link ClypsParser#classBodyDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClassBodyDeclaration(ClypsParser.ClassBodyDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link ClypsParser#classMemberDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClassMemberDeclaration(ClypsParser.ClassMemberDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link ClypsParser#mainDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMainDeclaration(ClypsParser.MainDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link ClypsParser#variableDeclaratorList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariableDeclaratorList(ClypsParser.VariableDeclaratorListContext ctx);
	/**
	 * Visit a parse tree produced by {@link ClypsParser#variableDeclarator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariableDeclarator(ClypsParser.VariableDeclaratorContext ctx);
	/**
	 * Visit a parse tree produced by {@link ClypsParser#variableDeclaratorId}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariableDeclaratorId(ClypsParser.VariableDeclaratorIdContext ctx);
	/**
	 * Visit a parse tree produced by {@link ClypsParser#variableInitializer}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariableInitializer(ClypsParser.VariableInitializerContext ctx);
	/**
	 * Visit a parse tree produced by {@link ClypsParser#unannType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnannType(ClypsParser.UnannTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link ClypsParser#unannPrimitiveType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnannPrimitiveType(ClypsParser.UnannPrimitiveTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link ClypsParser#unannReferenceType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnannReferenceType(ClypsParser.UnannReferenceTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link ClypsParser#unannClassOrInterfaceType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnannClassOrInterfaceType(ClypsParser.UnannClassOrInterfaceTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link ClypsParser#unannClassType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnannClassType(ClypsParser.UnannClassTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link ClypsParser#unannClassType_lf_unannClassOrInterfaceType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnannClassType_lf_unannClassOrInterfaceType(ClypsParser.UnannClassType_lf_unannClassOrInterfaceTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link ClypsParser#unannClassType_lfno_unannClassOrInterfaceType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnannClassType_lfno_unannClassOrInterfaceType(ClypsParser.UnannClassType_lfno_unannClassOrInterfaceTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link ClypsParser#unannInterfaceType_lf_unannClassOrInterfaceType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnannInterfaceType_lf_unannClassOrInterfaceType(ClypsParser.UnannInterfaceType_lf_unannClassOrInterfaceTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link ClypsParser#unannInterfaceType_lfno_unannClassOrInterfaceType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnannInterfaceType_lfno_unannClassOrInterfaceType(ClypsParser.UnannInterfaceType_lfno_unannClassOrInterfaceTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link ClypsParser#unannTypeVariable}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnannTypeVariable(ClypsParser.UnannTypeVariableContext ctx);
	/**
	 * Visit a parse tree produced by {@link ClypsParser#unannArrayType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnannArrayType(ClypsParser.UnannArrayTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link ClypsParser#methodDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMethodDeclaration(ClypsParser.MethodDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link ClypsParser#methodHeader}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMethodHeader(ClypsParser.MethodHeaderContext ctx);
	/**
	 * Visit a parse tree produced by {@link ClypsParser#result}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitResult(ClypsParser.ResultContext ctx);
	/**
	 * Visit a parse tree produced by {@link ClypsParser#methodDeclarator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMethodDeclarator(ClypsParser.MethodDeclaratorContext ctx);
	/**
	 * Visit a parse tree produced by {@link ClypsParser#formalParameterList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFormalParameterList(ClypsParser.FormalParameterListContext ctx);
	/**
	 * Visit a parse tree produced by {@link ClypsParser#formalParameters}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFormalParameters(ClypsParser.FormalParametersContext ctx);
	/**
	 * Visit a parse tree produced by {@link ClypsParser#formalParameter}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFormalParameter(ClypsParser.FormalParameterContext ctx);
	/**
	 * Visit a parse tree produced by {@link ClypsParser#variableModifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariableModifier(ClypsParser.VariableModifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link ClypsParser#lastFormalParameter}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLastFormalParameter(ClypsParser.LastFormalParameterContext ctx);
	/**
	 * Visit a parse tree produced by {@link ClypsParser#receiverParameter}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReceiverParameter(ClypsParser.ReceiverParameterContext ctx);
	/**
	 * Visit a parse tree produced by {@link ClypsParser#throws_}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitThrows_(ClypsParser.Throws_Context ctx);
	/**
	 * Visit a parse tree produced by {@link ClypsParser#exceptionTypeList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExceptionTypeList(ClypsParser.ExceptionTypeListContext ctx);
	/**
	 * Visit a parse tree produced by {@link ClypsParser#exceptionType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExceptionType(ClypsParser.ExceptionTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link ClypsParser#methodBody}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMethodBody(ClypsParser.MethodBodyContext ctx);
	/**
	 * Visit a parse tree produced by {@link ClypsParser#instanceInitializer}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInstanceInitializer(ClypsParser.InstanceInitializerContext ctx);
	/**
	 * Visit a parse tree produced by {@link ClypsParser#staticInitializer}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStaticInitializer(ClypsParser.StaticInitializerContext ctx);
	/**
	 * Visit a parse tree produced by {@link ClypsParser#annotation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAnnotation(ClypsParser.AnnotationContext ctx);
	/**
	 * Visit a parse tree produced by {@link ClypsParser#normalAnnotation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNormalAnnotation(ClypsParser.NormalAnnotationContext ctx);
	/**
	 * Visit a parse tree produced by {@link ClypsParser#elementValuePairList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitElementValuePairList(ClypsParser.ElementValuePairListContext ctx);
	/**
	 * Visit a parse tree produced by {@link ClypsParser#elementValuePair}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitElementValuePair(ClypsParser.ElementValuePairContext ctx);
	/**
	 * Visit a parse tree produced by {@link ClypsParser#elementValue}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitElementValue(ClypsParser.ElementValueContext ctx);
	/**
	 * Visit a parse tree produced by {@link ClypsParser#elementValueArrayInitializer}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitElementValueArrayInitializer(ClypsParser.ElementValueArrayInitializerContext ctx);
	/**
	 * Visit a parse tree produced by {@link ClypsParser#elementValueList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitElementValueList(ClypsParser.ElementValueListContext ctx);
	/**
	 * Visit a parse tree produced by {@link ClypsParser#arrayInitializer}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArrayInitializer(ClypsParser.ArrayInitializerContext ctx);
	/**
	 * Visit a parse tree produced by {@link ClypsParser#variableInitializerList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariableInitializerList(ClypsParser.VariableInitializerListContext ctx);
	/**
	 * Visit a parse tree produced by {@link ClypsParser#block}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBlock(ClypsParser.BlockContext ctx);
	/**
	 * Visit a parse tree produced by {@link ClypsParser#blockStatements}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBlockStatements(ClypsParser.BlockStatementsContext ctx);
	/**
	 * Visit a parse tree produced by {@link ClypsParser#blockStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBlockStatement(ClypsParser.BlockStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link ClypsParser#localVariableDeclarationStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLocalVariableDeclarationStatement(ClypsParser.LocalVariableDeclarationStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link ClypsParser#localVariableDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLocalVariableDeclaration(ClypsParser.LocalVariableDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link ClypsParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatement(ClypsParser.StatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link ClypsParser#printStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrintStatement(ClypsParser.PrintStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link ClypsParser#printBlock}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrintBlock(ClypsParser.PrintBlockContext ctx);
	/**
	 * Visit a parse tree produced by {@link ClypsParser#printExtra}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrintExtra(ClypsParser.PrintExtraContext ctx);
	/**
	 * Visit a parse tree produced by {@link ClypsParser#scanStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitScanStatement(ClypsParser.ScanStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link ClypsParser#scanExtra}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitScanExtra(ClypsParser.ScanExtraContext ctx);
	/**
	 * Visit a parse tree produced by {@link ClypsParser#statementNoShortIf}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatementNoShortIf(ClypsParser.StatementNoShortIfContext ctx);
	/**
	 * Visit a parse tree produced by {@link ClypsParser#statementWithoutTrailingSubstatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatementWithoutTrailingSubstatement(ClypsParser.StatementWithoutTrailingSubstatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link ClypsParser#labeledStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLabeledStatement(ClypsParser.LabeledStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link ClypsParser#labeledStatementNoShortIf}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLabeledStatementNoShortIf(ClypsParser.LabeledStatementNoShortIfContext ctx);
	/**
	 * Visit a parse tree produced by {@link ClypsParser#expressionStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpressionStatement(ClypsParser.ExpressionStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link ClypsParser#statementExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatementExpression(ClypsParser.StatementExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link ClypsParser#ifThenStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIfThenStatement(ClypsParser.IfThenStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link ClypsParser#ifThenElseStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIfThenElseStatement(ClypsParser.IfThenElseStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link ClypsParser#ifThenElseStatementNoShortIf}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIfThenElseStatementNoShortIf(ClypsParser.IfThenElseStatementNoShortIfContext ctx);
	/**
	 * Visit a parse tree produced by {@link ClypsParser#whileStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWhileStatement(ClypsParser.WhileStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link ClypsParser#whileStatementNoShortIf}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWhileStatementNoShortIf(ClypsParser.WhileStatementNoShortIfContext ctx);
	/**
	 * Visit a parse tree produced by {@link ClypsParser#doStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDoStatement(ClypsParser.DoStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link ClypsParser#forStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitForStatement(ClypsParser.ForStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link ClypsParser#forStatementNoShortIf}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitForStatementNoShortIf(ClypsParser.ForStatementNoShortIfContext ctx);
	/**
	 * Visit a parse tree produced by {@link ClypsParser#basicForStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBasicForStatement(ClypsParser.BasicForStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link ClypsParser#basicForStatementNoShortIf}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBasicForStatementNoShortIf(ClypsParser.BasicForStatementNoShortIfContext ctx);
	/**
	 * Visit a parse tree produced by {@link ClypsParser#forInit}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitForInit(ClypsParser.ForInitContext ctx);
	/**
	 * Visit a parse tree produced by {@link ClypsParser#forUpdate}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitForUpdate(ClypsParser.ForUpdateContext ctx);
	/**
	 * Visit a parse tree produced by {@link ClypsParser#statementExpressionList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatementExpressionList(ClypsParser.StatementExpressionListContext ctx);
	/**
	 * Visit a parse tree produced by {@link ClypsParser#enhancedForStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEnhancedForStatement(ClypsParser.EnhancedForStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link ClypsParser#enhancedForStatementNoShortIf}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEnhancedForStatementNoShortIf(ClypsParser.EnhancedForStatementNoShortIfContext ctx);
	/**
	 * Visit a parse tree produced by {@link ClypsParser#returnStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReturnStatement(ClypsParser.ReturnStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link ClypsParser#primary}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrimary(ClypsParser.PrimaryContext ctx);
	/**
	 * Visit a parse tree produced by {@link ClypsParser#primaryNoNewArray}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrimaryNoNewArray(ClypsParser.PrimaryNoNewArrayContext ctx);
	/**
	 * Visit a parse tree produced by {@link ClypsParser#primaryNoNewArray_lf_arrayAccess}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrimaryNoNewArray_lf_arrayAccess(ClypsParser.PrimaryNoNewArray_lf_arrayAccessContext ctx);
	/**
	 * Visit a parse tree produced by {@link ClypsParser#primaryNoNewArray_lfno_arrayAccess}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrimaryNoNewArray_lfno_arrayAccess(ClypsParser.PrimaryNoNewArray_lfno_arrayAccessContext ctx);
	/**
	 * Visit a parse tree produced by {@link ClypsParser#primaryNoNewArray_lf_primary}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrimaryNoNewArray_lf_primary(ClypsParser.PrimaryNoNewArray_lf_primaryContext ctx);
	/**
	 * Visit a parse tree produced by {@link ClypsParser#primaryNoNewArray_lf_primary_lf_arrayAccess_lf_primary}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrimaryNoNewArray_lf_primary_lf_arrayAccess_lf_primary(ClypsParser.PrimaryNoNewArray_lf_primary_lf_arrayAccess_lf_primaryContext ctx);
	/**
	 * Visit a parse tree produced by {@link ClypsParser#primaryNoNewArray_lf_primary_lfno_arrayAccess_lf_primary}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrimaryNoNewArray_lf_primary_lfno_arrayAccess_lf_primary(ClypsParser.PrimaryNoNewArray_lf_primary_lfno_arrayAccess_lf_primaryContext ctx);
	/**
	 * Visit a parse tree produced by {@link ClypsParser#primaryNoNewArray_lfno_primary}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrimaryNoNewArray_lfno_primary(ClypsParser.PrimaryNoNewArray_lfno_primaryContext ctx);
	/**
	 * Visit a parse tree produced by {@link ClypsParser#primaryNoNewArray_lfno_primary_lf_arrayAccess_lfno_primary}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrimaryNoNewArray_lfno_primary_lf_arrayAccess_lfno_primary(ClypsParser.PrimaryNoNewArray_lfno_primary_lf_arrayAccess_lfno_primaryContext ctx);
	/**
	 * Visit a parse tree produced by {@link ClypsParser#primaryNoNewArray_lfno_primary_lfno_arrayAccess_lfno_primary}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrimaryNoNewArray_lfno_primary_lfno_arrayAccess_lfno_primary(ClypsParser.PrimaryNoNewArray_lfno_primary_lfno_arrayAccess_lfno_primaryContext ctx);
	/**
	 * Visit a parse tree produced by {@link ClypsParser#fieldAccess}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFieldAccess(ClypsParser.FieldAccessContext ctx);
	/**
	 * Visit a parse tree produced by {@link ClypsParser#fieldAccess_lf_primary}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFieldAccess_lf_primary(ClypsParser.FieldAccess_lf_primaryContext ctx);
	/**
	 * Visit a parse tree produced by {@link ClypsParser#fieldAccess_lfno_primary}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFieldAccess_lfno_primary(ClypsParser.FieldAccess_lfno_primaryContext ctx);
	/**
	 * Visit a parse tree produced by {@link ClypsParser#arrayAccess}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArrayAccess(ClypsParser.ArrayAccessContext ctx);
	/**
	 * Visit a parse tree produced by {@link ClypsParser#arrayAccess_lf_primary}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArrayAccess_lf_primary(ClypsParser.ArrayAccess_lf_primaryContext ctx);
	/**
	 * Visit a parse tree produced by {@link ClypsParser#arrayAccess_lfno_primary}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArrayAccess_lfno_primary(ClypsParser.ArrayAccess_lfno_primaryContext ctx);
	/**
	 * Visit a parse tree produced by {@link ClypsParser#methodInvocation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMethodInvocation(ClypsParser.MethodInvocationContext ctx);
	/**
	 * Visit a parse tree produced by {@link ClypsParser#methodInvocation_lf_primary}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMethodInvocation_lf_primary(ClypsParser.MethodInvocation_lf_primaryContext ctx);
	/**
	 * Visit a parse tree produced by {@link ClypsParser#methodInvocation_lfno_primary}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMethodInvocation_lfno_primary(ClypsParser.MethodInvocation_lfno_primaryContext ctx);
	/**
	 * Visit a parse tree produced by {@link ClypsParser#argumentList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArgumentList(ClypsParser.ArgumentListContext ctx);
	/**
	 * Visit a parse tree produced by {@link ClypsParser#methodReference}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMethodReference(ClypsParser.MethodReferenceContext ctx);
	/**
	 * Visit a parse tree produced by {@link ClypsParser#methodReference_lf_primary}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMethodReference_lf_primary(ClypsParser.MethodReference_lf_primaryContext ctx);
	/**
	 * Visit a parse tree produced by {@link ClypsParser#methodReference_lfno_primary}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMethodReference_lfno_primary(ClypsParser.MethodReference_lfno_primaryContext ctx);
	/**
	 * Visit a parse tree produced by {@link ClypsParser#arrayCreationExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArrayCreationExpression(ClypsParser.ArrayCreationExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link ClypsParser#dimExprs}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDimExprs(ClypsParser.DimExprsContext ctx);
	/**
	 * Visit a parse tree produced by {@link ClypsParser#dimExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDimExpr(ClypsParser.DimExprContext ctx);
	/**
	 * Visit a parse tree produced by {@link ClypsParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpression(ClypsParser.ExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link ClypsParser#lambdaExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLambdaExpression(ClypsParser.LambdaExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link ClypsParser#lambdaParameters}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLambdaParameters(ClypsParser.LambdaParametersContext ctx);
	/**
	 * Visit a parse tree produced by {@link ClypsParser#inferredFormalParameterList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInferredFormalParameterList(ClypsParser.InferredFormalParameterListContext ctx);
	/**
	 * Visit a parse tree produced by {@link ClypsParser#lambdaBody}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLambdaBody(ClypsParser.LambdaBodyContext ctx);
	/**
	 * Visit a parse tree produced by {@link ClypsParser#assignmentExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignmentExpression(ClypsParser.AssignmentExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link ClypsParser#assignment}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignment(ClypsParser.AssignmentContext ctx);
	/**
	 * Visit a parse tree produced by {@link ClypsParser#leftHandSide}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLeftHandSide(ClypsParser.LeftHandSideContext ctx);
	/**
	 * Visit a parse tree produced by {@link ClypsParser#assignmentOperator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignmentOperator(ClypsParser.AssignmentOperatorContext ctx);
	/**
	 * Visit a parse tree produced by {@link ClypsParser#conditionalExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConditionalExpression(ClypsParser.ConditionalExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link ClypsParser#conditionalOrExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConditionalOrExpression(ClypsParser.ConditionalOrExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link ClypsParser#conditionalAndExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConditionalAndExpression(ClypsParser.ConditionalAndExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link ClypsParser#inclusiveOrExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInclusiveOrExpression(ClypsParser.InclusiveOrExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link ClypsParser#exclusiveOrExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExclusiveOrExpression(ClypsParser.ExclusiveOrExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link ClypsParser#andExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAndExpression(ClypsParser.AndExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link ClypsParser#equalityExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEqualityExpression(ClypsParser.EqualityExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link ClypsParser#relationalExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRelationalExpression(ClypsParser.RelationalExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link ClypsParser#shiftExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitShiftExpression(ClypsParser.ShiftExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link ClypsParser#additiveExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAdditiveExpression(ClypsParser.AdditiveExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link ClypsParser#multiplicativeExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMultiplicativeExpression(ClypsParser.MultiplicativeExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link ClypsParser#unaryExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnaryExpression(ClypsParser.UnaryExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link ClypsParser#preIncrementExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPreIncrementExpression(ClypsParser.PreIncrementExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link ClypsParser#preDecrementExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPreDecrementExpression(ClypsParser.PreDecrementExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link ClypsParser#unaryExpressionNotPlusMinus}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnaryExpressionNotPlusMinus(ClypsParser.UnaryExpressionNotPlusMinusContext ctx);
	/**
	 * Visit a parse tree produced by {@link ClypsParser#postfixExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPostfixExpression(ClypsParser.PostfixExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link ClypsParser#postIncrementExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPostIncrementExpression(ClypsParser.PostIncrementExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link ClypsParser#postIncrementExpression_lf_postfixExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPostIncrementExpression_lf_postfixExpression(ClypsParser.PostIncrementExpression_lf_postfixExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link ClypsParser#postDecrementExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPostDecrementExpression(ClypsParser.PostDecrementExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link ClypsParser#postDecrementExpression_lf_postfixExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPostDecrementExpression_lf_postfixExpression(ClypsParser.PostDecrementExpression_lf_postfixExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link ClypsParser#castExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCastExpression(ClypsParser.CastExpressionContext ctx);
}