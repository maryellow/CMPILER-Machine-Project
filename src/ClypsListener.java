// Generated from C:/Users/jeffc/Desktop/CMPILER-Machine-Project/src\Clyps.g4 by ANTLR 4.9
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link ClypsParser}.
 */
public interface ClypsListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link ClypsParser#literal}.
	 * @param ctx the parse tree
	 */
	void enterLiteral(ClypsParser.LiteralContext ctx);
	/**
	 * Exit a parse tree produced by {@link ClypsParser#literal}.
	 * @param ctx the parse tree
	 */
	void exitLiteral(ClypsParser.LiteralContext ctx);
	/**
	 * Enter a parse tree produced by {@link ClypsParser#primitiveType}.
	 * @param ctx the parse tree
	 */
	void enterPrimitiveType(ClypsParser.PrimitiveTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link ClypsParser#primitiveType}.
	 * @param ctx the parse tree
	 */
	void exitPrimitiveType(ClypsParser.PrimitiveTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link ClypsParser#numericType}.
	 * @param ctx the parse tree
	 */
	void enterNumericType(ClypsParser.NumericTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link ClypsParser#numericType}.
	 * @param ctx the parse tree
	 */
	void exitNumericType(ClypsParser.NumericTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link ClypsParser#integralType}.
	 * @param ctx the parse tree
	 */
	void enterIntegralType(ClypsParser.IntegralTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link ClypsParser#integralType}.
	 * @param ctx the parse tree
	 */
	void exitIntegralType(ClypsParser.IntegralTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link ClypsParser#floatingPointType}.
	 * @param ctx the parse tree
	 */
	void enterFloatingPointType(ClypsParser.FloatingPointTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link ClypsParser#floatingPointType}.
	 * @param ctx the parse tree
	 */
	void exitFloatingPointType(ClypsParser.FloatingPointTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link ClypsParser#referenceType}.
	 * @param ctx the parse tree
	 */
	void enterReferenceType(ClypsParser.ReferenceTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link ClypsParser#referenceType}.
	 * @param ctx the parse tree
	 */
	void exitReferenceType(ClypsParser.ReferenceTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link ClypsParser#classOrInterfaceType}.
	 * @param ctx the parse tree
	 */
	void enterClassOrInterfaceType(ClypsParser.ClassOrInterfaceTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link ClypsParser#classOrInterfaceType}.
	 * @param ctx the parse tree
	 */
	void exitClassOrInterfaceType(ClypsParser.ClassOrInterfaceTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link ClypsParser#classType}.
	 * @param ctx the parse tree
	 */
	void enterClassType(ClypsParser.ClassTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link ClypsParser#classType}.
	 * @param ctx the parse tree
	 */
	void exitClassType(ClypsParser.ClassTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link ClypsParser#classType_lf_classOrInterfaceType}.
	 * @param ctx the parse tree
	 */
	void enterClassType_lf_classOrInterfaceType(ClypsParser.ClassType_lf_classOrInterfaceTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link ClypsParser#classType_lf_classOrInterfaceType}.
	 * @param ctx the parse tree
	 */
	void exitClassType_lf_classOrInterfaceType(ClypsParser.ClassType_lf_classOrInterfaceTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link ClypsParser#classType_lfno_classOrInterfaceType}.
	 * @param ctx the parse tree
	 */
	void enterClassType_lfno_classOrInterfaceType(ClypsParser.ClassType_lfno_classOrInterfaceTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link ClypsParser#classType_lfno_classOrInterfaceType}.
	 * @param ctx the parse tree
	 */
	void exitClassType_lfno_classOrInterfaceType(ClypsParser.ClassType_lfno_classOrInterfaceTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link ClypsParser#interfaceType}.
	 * @param ctx the parse tree
	 */
	void enterInterfaceType(ClypsParser.InterfaceTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link ClypsParser#interfaceType}.
	 * @param ctx the parse tree
	 */
	void exitInterfaceType(ClypsParser.InterfaceTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link ClypsParser#interfaceType_lf_classOrInterfaceType}.
	 * @param ctx the parse tree
	 */
	void enterInterfaceType_lf_classOrInterfaceType(ClypsParser.InterfaceType_lf_classOrInterfaceTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link ClypsParser#interfaceType_lf_classOrInterfaceType}.
	 * @param ctx the parse tree
	 */
	void exitInterfaceType_lf_classOrInterfaceType(ClypsParser.InterfaceType_lf_classOrInterfaceTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link ClypsParser#interfaceType_lfno_classOrInterfaceType}.
	 * @param ctx the parse tree
	 */
	void enterInterfaceType_lfno_classOrInterfaceType(ClypsParser.InterfaceType_lfno_classOrInterfaceTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link ClypsParser#interfaceType_lfno_classOrInterfaceType}.
	 * @param ctx the parse tree
	 */
	void exitInterfaceType_lfno_classOrInterfaceType(ClypsParser.InterfaceType_lfno_classOrInterfaceTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link ClypsParser#typeVariable}.
	 * @param ctx the parse tree
	 */
	void enterTypeVariable(ClypsParser.TypeVariableContext ctx);
	/**
	 * Exit a parse tree produced by {@link ClypsParser#typeVariable}.
	 * @param ctx the parse tree
	 */
	void exitTypeVariable(ClypsParser.TypeVariableContext ctx);
	/**
	 * Enter a parse tree produced by {@link ClypsParser#arrayType}.
	 * @param ctx the parse tree
	 */
	void enterArrayType(ClypsParser.ArrayTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link ClypsParser#arrayType}.
	 * @param ctx the parse tree
	 */
	void exitArrayType(ClypsParser.ArrayTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link ClypsParser#dims}.
	 * @param ctx the parse tree
	 */
	void enterDims(ClypsParser.DimsContext ctx);
	/**
	 * Exit a parse tree produced by {@link ClypsParser#dims}.
	 * @param ctx the parse tree
	 */
	void exitDims(ClypsParser.DimsContext ctx);
	/**
	 * Enter a parse tree produced by {@link ClypsParser#typeParameter}.
	 * @param ctx the parse tree
	 */
	void enterTypeParameter(ClypsParser.TypeParameterContext ctx);
	/**
	 * Exit a parse tree produced by {@link ClypsParser#typeParameter}.
	 * @param ctx the parse tree
	 */
	void exitTypeParameter(ClypsParser.TypeParameterContext ctx);
	/**
	 * Enter a parse tree produced by {@link ClypsParser#typeParameterModifier}.
	 * @param ctx the parse tree
	 */
	void enterTypeParameterModifier(ClypsParser.TypeParameterModifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link ClypsParser#typeParameterModifier}.
	 * @param ctx the parse tree
	 */
	void exitTypeParameterModifier(ClypsParser.TypeParameterModifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link ClypsParser#typeBound}.
	 * @param ctx the parse tree
	 */
	void enterTypeBound(ClypsParser.TypeBoundContext ctx);
	/**
	 * Exit a parse tree produced by {@link ClypsParser#typeBound}.
	 * @param ctx the parse tree
	 */
	void exitTypeBound(ClypsParser.TypeBoundContext ctx);
	/**
	 * Enter a parse tree produced by {@link ClypsParser#additionalBound}.
	 * @param ctx the parse tree
	 */
	void enterAdditionalBound(ClypsParser.AdditionalBoundContext ctx);
	/**
	 * Exit a parse tree produced by {@link ClypsParser#additionalBound}.
	 * @param ctx the parse tree
	 */
	void exitAdditionalBound(ClypsParser.AdditionalBoundContext ctx);
	/**
	 * Enter a parse tree produced by {@link ClypsParser#typeArguments}.
	 * @param ctx the parse tree
	 */
	void enterTypeArguments(ClypsParser.TypeArgumentsContext ctx);
	/**
	 * Exit a parse tree produced by {@link ClypsParser#typeArguments}.
	 * @param ctx the parse tree
	 */
	void exitTypeArguments(ClypsParser.TypeArgumentsContext ctx);
	/**
	 * Enter a parse tree produced by {@link ClypsParser#typeArgumentList}.
	 * @param ctx the parse tree
	 */
	void enterTypeArgumentList(ClypsParser.TypeArgumentListContext ctx);
	/**
	 * Exit a parse tree produced by {@link ClypsParser#typeArgumentList}.
	 * @param ctx the parse tree
	 */
	void exitTypeArgumentList(ClypsParser.TypeArgumentListContext ctx);
	/**
	 * Enter a parse tree produced by {@link ClypsParser#typeArgument}.
	 * @param ctx the parse tree
	 */
	void enterTypeArgument(ClypsParser.TypeArgumentContext ctx);
	/**
	 * Exit a parse tree produced by {@link ClypsParser#typeArgument}.
	 * @param ctx the parse tree
	 */
	void exitTypeArgument(ClypsParser.TypeArgumentContext ctx);
	/**
	 * Enter a parse tree produced by {@link ClypsParser#wildcard}.
	 * @param ctx the parse tree
	 */
	void enterWildcard(ClypsParser.WildcardContext ctx);
	/**
	 * Exit a parse tree produced by {@link ClypsParser#wildcard}.
	 * @param ctx the parse tree
	 */
	void exitWildcard(ClypsParser.WildcardContext ctx);
	/**
	 * Enter a parse tree produced by {@link ClypsParser#wildcardBounds}.
	 * @param ctx the parse tree
	 */
	void enterWildcardBounds(ClypsParser.WildcardBoundsContext ctx);
	/**
	 * Exit a parse tree produced by {@link ClypsParser#wildcardBounds}.
	 * @param ctx the parse tree
	 */
	void exitWildcardBounds(ClypsParser.WildcardBoundsContext ctx);
	/**
	 * Enter a parse tree produced by {@link ClypsParser#typeName}.
	 * @param ctx the parse tree
	 */
	void enterTypeName(ClypsParser.TypeNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link ClypsParser#typeName}.
	 * @param ctx the parse tree
	 */
	void exitTypeName(ClypsParser.TypeNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link ClypsParser#packageOrTypeName}.
	 * @param ctx the parse tree
	 */
	void enterPackageOrTypeName(ClypsParser.PackageOrTypeNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link ClypsParser#packageOrTypeName}.
	 * @param ctx the parse tree
	 */
	void exitPackageOrTypeName(ClypsParser.PackageOrTypeNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link ClypsParser#expressionName}.
	 * @param ctx the parse tree
	 */
	void enterExpressionName(ClypsParser.ExpressionNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link ClypsParser#expressionName}.
	 * @param ctx the parse tree
	 */
	void exitExpressionName(ClypsParser.ExpressionNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link ClypsParser#methodName}.
	 * @param ctx the parse tree
	 */
	void enterMethodName(ClypsParser.MethodNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link ClypsParser#methodName}.
	 * @param ctx the parse tree
	 */
	void exitMethodName(ClypsParser.MethodNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link ClypsParser#ambiguousName}.
	 * @param ctx the parse tree
	 */
	void enterAmbiguousName(ClypsParser.AmbiguousNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link ClypsParser#ambiguousName}.
	 * @param ctx the parse tree
	 */
	void exitAmbiguousName(ClypsParser.AmbiguousNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link ClypsParser#classDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterClassDeclaration(ClypsParser.ClassDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link ClypsParser#classDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitClassDeclaration(ClypsParser.ClassDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link ClypsParser#normalClassDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterNormalClassDeclaration(ClypsParser.NormalClassDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link ClypsParser#normalClassDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitNormalClassDeclaration(ClypsParser.NormalClassDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link ClypsParser#typeParameters}.
	 * @param ctx the parse tree
	 */
	void enterTypeParameters(ClypsParser.TypeParametersContext ctx);
	/**
	 * Exit a parse tree produced by {@link ClypsParser#typeParameters}.
	 * @param ctx the parse tree
	 */
	void exitTypeParameters(ClypsParser.TypeParametersContext ctx);
	/**
	 * Enter a parse tree produced by {@link ClypsParser#typeParameterList}.
	 * @param ctx the parse tree
	 */
	void enterTypeParameterList(ClypsParser.TypeParameterListContext ctx);
	/**
	 * Exit a parse tree produced by {@link ClypsParser#typeParameterList}.
	 * @param ctx the parse tree
	 */
	void exitTypeParameterList(ClypsParser.TypeParameterListContext ctx);
	/**
	 * Enter a parse tree produced by {@link ClypsParser#classBody}.
	 * @param ctx the parse tree
	 */
	void enterClassBody(ClypsParser.ClassBodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link ClypsParser#classBody}.
	 * @param ctx the parse tree
	 */
	void exitClassBody(ClypsParser.ClassBodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link ClypsParser#classBodyDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterClassBodyDeclaration(ClypsParser.ClassBodyDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link ClypsParser#classBodyDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitClassBodyDeclaration(ClypsParser.ClassBodyDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link ClypsParser#classMemberDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterClassMemberDeclaration(ClypsParser.ClassMemberDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link ClypsParser#classMemberDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitClassMemberDeclaration(ClypsParser.ClassMemberDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link ClypsParser#mainDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterMainDeclaration(ClypsParser.MainDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link ClypsParser#mainDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitMainDeclaration(ClypsParser.MainDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link ClypsParser#variableDeclaratorList}.
	 * @param ctx the parse tree
	 */
	void enterVariableDeclaratorList(ClypsParser.VariableDeclaratorListContext ctx);
	/**
	 * Exit a parse tree produced by {@link ClypsParser#variableDeclaratorList}.
	 * @param ctx the parse tree
	 */
	void exitVariableDeclaratorList(ClypsParser.VariableDeclaratorListContext ctx);
	/**
	 * Enter a parse tree produced by {@link ClypsParser#variableDeclarator}.
	 * @param ctx the parse tree
	 */
	void enterVariableDeclarator(ClypsParser.VariableDeclaratorContext ctx);
	/**
	 * Exit a parse tree produced by {@link ClypsParser#variableDeclarator}.
	 * @param ctx the parse tree
	 */
	void exitVariableDeclarator(ClypsParser.VariableDeclaratorContext ctx);
	/**
	 * Enter a parse tree produced by {@link ClypsParser#variableDeclaratorId}.
	 * @param ctx the parse tree
	 */
	void enterVariableDeclaratorId(ClypsParser.VariableDeclaratorIdContext ctx);
	/**
	 * Exit a parse tree produced by {@link ClypsParser#variableDeclaratorId}.
	 * @param ctx the parse tree
	 */
	void exitVariableDeclaratorId(ClypsParser.VariableDeclaratorIdContext ctx);
	/**
	 * Enter a parse tree produced by {@link ClypsParser#variableInitializer}.
	 * @param ctx the parse tree
	 */
	void enterVariableInitializer(ClypsParser.VariableInitializerContext ctx);
	/**
	 * Exit a parse tree produced by {@link ClypsParser#variableInitializer}.
	 * @param ctx the parse tree
	 */
	void exitVariableInitializer(ClypsParser.VariableInitializerContext ctx);
	/**
	 * Enter a parse tree produced by {@link ClypsParser#unannType}.
	 * @param ctx the parse tree
	 */
	void enterUnannType(ClypsParser.UnannTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link ClypsParser#unannType}.
	 * @param ctx the parse tree
	 */
	void exitUnannType(ClypsParser.UnannTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link ClypsParser#unannPrimitiveType}.
	 * @param ctx the parse tree
	 */
	void enterUnannPrimitiveType(ClypsParser.UnannPrimitiveTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link ClypsParser#unannPrimitiveType}.
	 * @param ctx the parse tree
	 */
	void exitUnannPrimitiveType(ClypsParser.UnannPrimitiveTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link ClypsParser#unannReferenceType}.
	 * @param ctx the parse tree
	 */
	void enterUnannReferenceType(ClypsParser.UnannReferenceTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link ClypsParser#unannReferenceType}.
	 * @param ctx the parse tree
	 */
	void exitUnannReferenceType(ClypsParser.UnannReferenceTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link ClypsParser#unannClassOrInterfaceType}.
	 * @param ctx the parse tree
	 */
	void enterUnannClassOrInterfaceType(ClypsParser.UnannClassOrInterfaceTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link ClypsParser#unannClassOrInterfaceType}.
	 * @param ctx the parse tree
	 */
	void exitUnannClassOrInterfaceType(ClypsParser.UnannClassOrInterfaceTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link ClypsParser#unannClassType}.
	 * @param ctx the parse tree
	 */
	void enterUnannClassType(ClypsParser.UnannClassTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link ClypsParser#unannClassType}.
	 * @param ctx the parse tree
	 */
	void exitUnannClassType(ClypsParser.UnannClassTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link ClypsParser#unannClassType_lf_unannClassOrInterfaceType}.
	 * @param ctx the parse tree
	 */
	void enterUnannClassType_lf_unannClassOrInterfaceType(ClypsParser.UnannClassType_lf_unannClassOrInterfaceTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link ClypsParser#unannClassType_lf_unannClassOrInterfaceType}.
	 * @param ctx the parse tree
	 */
	void exitUnannClassType_lf_unannClassOrInterfaceType(ClypsParser.UnannClassType_lf_unannClassOrInterfaceTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link ClypsParser#unannClassType_lfno_unannClassOrInterfaceType}.
	 * @param ctx the parse tree
	 */
	void enterUnannClassType_lfno_unannClassOrInterfaceType(ClypsParser.UnannClassType_lfno_unannClassOrInterfaceTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link ClypsParser#unannClassType_lfno_unannClassOrInterfaceType}.
	 * @param ctx the parse tree
	 */
	void exitUnannClassType_lfno_unannClassOrInterfaceType(ClypsParser.UnannClassType_lfno_unannClassOrInterfaceTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link ClypsParser#unannInterfaceType_lf_unannClassOrInterfaceType}.
	 * @param ctx the parse tree
	 */
	void enterUnannInterfaceType_lf_unannClassOrInterfaceType(ClypsParser.UnannInterfaceType_lf_unannClassOrInterfaceTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link ClypsParser#unannInterfaceType_lf_unannClassOrInterfaceType}.
	 * @param ctx the parse tree
	 */
	void exitUnannInterfaceType_lf_unannClassOrInterfaceType(ClypsParser.UnannInterfaceType_lf_unannClassOrInterfaceTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link ClypsParser#unannInterfaceType_lfno_unannClassOrInterfaceType}.
	 * @param ctx the parse tree
	 */
	void enterUnannInterfaceType_lfno_unannClassOrInterfaceType(ClypsParser.UnannInterfaceType_lfno_unannClassOrInterfaceTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link ClypsParser#unannInterfaceType_lfno_unannClassOrInterfaceType}.
	 * @param ctx the parse tree
	 */
	void exitUnannInterfaceType_lfno_unannClassOrInterfaceType(ClypsParser.UnannInterfaceType_lfno_unannClassOrInterfaceTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link ClypsParser#unannTypeVariable}.
	 * @param ctx the parse tree
	 */
	void enterUnannTypeVariable(ClypsParser.UnannTypeVariableContext ctx);
	/**
	 * Exit a parse tree produced by {@link ClypsParser#unannTypeVariable}.
	 * @param ctx the parse tree
	 */
	void exitUnannTypeVariable(ClypsParser.UnannTypeVariableContext ctx);
	/**
	 * Enter a parse tree produced by {@link ClypsParser#unannArrayType}.
	 * @param ctx the parse tree
	 */
	void enterUnannArrayType(ClypsParser.UnannArrayTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link ClypsParser#unannArrayType}.
	 * @param ctx the parse tree
	 */
	void exitUnannArrayType(ClypsParser.UnannArrayTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link ClypsParser#methodDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterMethodDeclaration(ClypsParser.MethodDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link ClypsParser#methodDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitMethodDeclaration(ClypsParser.MethodDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link ClypsParser#methodHeader}.
	 * @param ctx the parse tree
	 */
	void enterMethodHeader(ClypsParser.MethodHeaderContext ctx);
	/**
	 * Exit a parse tree produced by {@link ClypsParser#methodHeader}.
	 * @param ctx the parse tree
	 */
	void exitMethodHeader(ClypsParser.MethodHeaderContext ctx);
	/**
	 * Enter a parse tree produced by {@link ClypsParser#result}.
	 * @param ctx the parse tree
	 */
	void enterResult(ClypsParser.ResultContext ctx);
	/**
	 * Exit a parse tree produced by {@link ClypsParser#result}.
	 * @param ctx the parse tree
	 */
	void exitResult(ClypsParser.ResultContext ctx);
	/**
	 * Enter a parse tree produced by {@link ClypsParser#methodDeclarator}.
	 * @param ctx the parse tree
	 */
	void enterMethodDeclarator(ClypsParser.MethodDeclaratorContext ctx);
	/**
	 * Exit a parse tree produced by {@link ClypsParser#methodDeclarator}.
	 * @param ctx the parse tree
	 */
	void exitMethodDeclarator(ClypsParser.MethodDeclaratorContext ctx);
	/**
	 * Enter a parse tree produced by {@link ClypsParser#formalParameterList}.
	 * @param ctx the parse tree
	 */
	void enterFormalParameterList(ClypsParser.FormalParameterListContext ctx);
	/**
	 * Exit a parse tree produced by {@link ClypsParser#formalParameterList}.
	 * @param ctx the parse tree
	 */
	void exitFormalParameterList(ClypsParser.FormalParameterListContext ctx);
	/**
	 * Enter a parse tree produced by {@link ClypsParser#formalParameters}.
	 * @param ctx the parse tree
	 */
	void enterFormalParameters(ClypsParser.FormalParametersContext ctx);
	/**
	 * Exit a parse tree produced by {@link ClypsParser#formalParameters}.
	 * @param ctx the parse tree
	 */
	void exitFormalParameters(ClypsParser.FormalParametersContext ctx);
	/**
	 * Enter a parse tree produced by {@link ClypsParser#formalParameter}.
	 * @param ctx the parse tree
	 */
	void enterFormalParameter(ClypsParser.FormalParameterContext ctx);
	/**
	 * Exit a parse tree produced by {@link ClypsParser#formalParameter}.
	 * @param ctx the parse tree
	 */
	void exitFormalParameter(ClypsParser.FormalParameterContext ctx);
	/**
	 * Enter a parse tree produced by {@link ClypsParser#variableModifier}.
	 * @param ctx the parse tree
	 */
	void enterVariableModifier(ClypsParser.VariableModifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link ClypsParser#variableModifier}.
	 * @param ctx the parse tree
	 */
	void exitVariableModifier(ClypsParser.VariableModifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link ClypsParser#lastFormalParameter}.
	 * @param ctx the parse tree
	 */
	void enterLastFormalParameter(ClypsParser.LastFormalParameterContext ctx);
	/**
	 * Exit a parse tree produced by {@link ClypsParser#lastFormalParameter}.
	 * @param ctx the parse tree
	 */
	void exitLastFormalParameter(ClypsParser.LastFormalParameterContext ctx);
	/**
	 * Enter a parse tree produced by {@link ClypsParser#receiverParameter}.
	 * @param ctx the parse tree
	 */
	void enterReceiverParameter(ClypsParser.ReceiverParameterContext ctx);
	/**
	 * Exit a parse tree produced by {@link ClypsParser#receiverParameter}.
	 * @param ctx the parse tree
	 */
	void exitReceiverParameter(ClypsParser.ReceiverParameterContext ctx);
	/**
	 * Enter a parse tree produced by {@link ClypsParser#throws_}.
	 * @param ctx the parse tree
	 */
	void enterThrows_(ClypsParser.Throws_Context ctx);
	/**
	 * Exit a parse tree produced by {@link ClypsParser#throws_}.
	 * @param ctx the parse tree
	 */
	void exitThrows_(ClypsParser.Throws_Context ctx);
	/**
	 * Enter a parse tree produced by {@link ClypsParser#exceptionTypeList}.
	 * @param ctx the parse tree
	 */
	void enterExceptionTypeList(ClypsParser.ExceptionTypeListContext ctx);
	/**
	 * Exit a parse tree produced by {@link ClypsParser#exceptionTypeList}.
	 * @param ctx the parse tree
	 */
	void exitExceptionTypeList(ClypsParser.ExceptionTypeListContext ctx);
	/**
	 * Enter a parse tree produced by {@link ClypsParser#exceptionType}.
	 * @param ctx the parse tree
	 */
	void enterExceptionType(ClypsParser.ExceptionTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link ClypsParser#exceptionType}.
	 * @param ctx the parse tree
	 */
	void exitExceptionType(ClypsParser.ExceptionTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link ClypsParser#methodBody}.
	 * @param ctx the parse tree
	 */
	void enterMethodBody(ClypsParser.MethodBodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link ClypsParser#methodBody}.
	 * @param ctx the parse tree
	 */
	void exitMethodBody(ClypsParser.MethodBodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link ClypsParser#instanceInitializer}.
	 * @param ctx the parse tree
	 */
	void enterInstanceInitializer(ClypsParser.InstanceInitializerContext ctx);
	/**
	 * Exit a parse tree produced by {@link ClypsParser#instanceInitializer}.
	 * @param ctx the parse tree
	 */
	void exitInstanceInitializer(ClypsParser.InstanceInitializerContext ctx);
	/**
	 * Enter a parse tree produced by {@link ClypsParser#staticInitializer}.
	 * @param ctx the parse tree
	 */
	void enterStaticInitializer(ClypsParser.StaticInitializerContext ctx);
	/**
	 * Exit a parse tree produced by {@link ClypsParser#staticInitializer}.
	 * @param ctx the parse tree
	 */
	void exitStaticInitializer(ClypsParser.StaticInitializerContext ctx);
	/**
	 * Enter a parse tree produced by {@link ClypsParser#annotation}.
	 * @param ctx the parse tree
	 */
	void enterAnnotation(ClypsParser.AnnotationContext ctx);
	/**
	 * Exit a parse tree produced by {@link ClypsParser#annotation}.
	 * @param ctx the parse tree
	 */
	void exitAnnotation(ClypsParser.AnnotationContext ctx);
	/**
	 * Enter a parse tree produced by {@link ClypsParser#normalAnnotation}.
	 * @param ctx the parse tree
	 */
	void enterNormalAnnotation(ClypsParser.NormalAnnotationContext ctx);
	/**
	 * Exit a parse tree produced by {@link ClypsParser#normalAnnotation}.
	 * @param ctx the parse tree
	 */
	void exitNormalAnnotation(ClypsParser.NormalAnnotationContext ctx);
	/**
	 * Enter a parse tree produced by {@link ClypsParser#elementValuePairList}.
	 * @param ctx the parse tree
	 */
	void enterElementValuePairList(ClypsParser.ElementValuePairListContext ctx);
	/**
	 * Exit a parse tree produced by {@link ClypsParser#elementValuePairList}.
	 * @param ctx the parse tree
	 */
	void exitElementValuePairList(ClypsParser.ElementValuePairListContext ctx);
	/**
	 * Enter a parse tree produced by {@link ClypsParser#elementValuePair}.
	 * @param ctx the parse tree
	 */
	void enterElementValuePair(ClypsParser.ElementValuePairContext ctx);
	/**
	 * Exit a parse tree produced by {@link ClypsParser#elementValuePair}.
	 * @param ctx the parse tree
	 */
	void exitElementValuePair(ClypsParser.ElementValuePairContext ctx);
	/**
	 * Enter a parse tree produced by {@link ClypsParser#elementValue}.
	 * @param ctx the parse tree
	 */
	void enterElementValue(ClypsParser.ElementValueContext ctx);
	/**
	 * Exit a parse tree produced by {@link ClypsParser#elementValue}.
	 * @param ctx the parse tree
	 */
	void exitElementValue(ClypsParser.ElementValueContext ctx);
	/**
	 * Enter a parse tree produced by {@link ClypsParser#elementValueArrayInitializer}.
	 * @param ctx the parse tree
	 */
	void enterElementValueArrayInitializer(ClypsParser.ElementValueArrayInitializerContext ctx);
	/**
	 * Exit a parse tree produced by {@link ClypsParser#elementValueArrayInitializer}.
	 * @param ctx the parse tree
	 */
	void exitElementValueArrayInitializer(ClypsParser.ElementValueArrayInitializerContext ctx);
	/**
	 * Enter a parse tree produced by {@link ClypsParser#elementValueList}.
	 * @param ctx the parse tree
	 */
	void enterElementValueList(ClypsParser.ElementValueListContext ctx);
	/**
	 * Exit a parse tree produced by {@link ClypsParser#elementValueList}.
	 * @param ctx the parse tree
	 */
	void exitElementValueList(ClypsParser.ElementValueListContext ctx);
	/**
	 * Enter a parse tree produced by {@link ClypsParser#arrayInitializer}.
	 * @param ctx the parse tree
	 */
	void enterArrayInitializer(ClypsParser.ArrayInitializerContext ctx);
	/**
	 * Exit a parse tree produced by {@link ClypsParser#arrayInitializer}.
	 * @param ctx the parse tree
	 */
	void exitArrayInitializer(ClypsParser.ArrayInitializerContext ctx);
	/**
	 * Enter a parse tree produced by {@link ClypsParser#variableInitializerList}.
	 * @param ctx the parse tree
	 */
	void enterVariableInitializerList(ClypsParser.VariableInitializerListContext ctx);
	/**
	 * Exit a parse tree produced by {@link ClypsParser#variableInitializerList}.
	 * @param ctx the parse tree
	 */
	void exitVariableInitializerList(ClypsParser.VariableInitializerListContext ctx);
	/**
	 * Enter a parse tree produced by {@link ClypsParser#block}.
	 * @param ctx the parse tree
	 */
	void enterBlock(ClypsParser.BlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link ClypsParser#block}.
	 * @param ctx the parse tree
	 */
	void exitBlock(ClypsParser.BlockContext ctx);
	/**
	 * Enter a parse tree produced by {@link ClypsParser#blockStatements}.
	 * @param ctx the parse tree
	 */
	void enterBlockStatements(ClypsParser.BlockStatementsContext ctx);
	/**
	 * Exit a parse tree produced by {@link ClypsParser#blockStatements}.
	 * @param ctx the parse tree
	 */
	void exitBlockStatements(ClypsParser.BlockStatementsContext ctx);
	/**
	 * Enter a parse tree produced by {@link ClypsParser#blockStatement}.
	 * @param ctx the parse tree
	 */
	void enterBlockStatement(ClypsParser.BlockStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link ClypsParser#blockStatement}.
	 * @param ctx the parse tree
	 */
	void exitBlockStatement(ClypsParser.BlockStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link ClypsParser#localVariableDeclarationStatement}.
	 * @param ctx the parse tree
	 */
	void enterLocalVariableDeclarationStatement(ClypsParser.LocalVariableDeclarationStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link ClypsParser#localVariableDeclarationStatement}.
	 * @param ctx the parse tree
	 */
	void exitLocalVariableDeclarationStatement(ClypsParser.LocalVariableDeclarationStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link ClypsParser#localVariableDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterLocalVariableDeclaration(ClypsParser.LocalVariableDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link ClypsParser#localVariableDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitLocalVariableDeclaration(ClypsParser.LocalVariableDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link ClypsParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStatement(ClypsParser.StatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link ClypsParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStatement(ClypsParser.StatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link ClypsParser#printStatement}.
	 * @param ctx the parse tree
	 */
	void enterPrintStatement(ClypsParser.PrintStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link ClypsParser#printStatement}.
	 * @param ctx the parse tree
	 */
	void exitPrintStatement(ClypsParser.PrintStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link ClypsParser#printBlock}.
	 * @param ctx the parse tree
	 */
	void enterPrintBlock(ClypsParser.PrintBlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link ClypsParser#printBlock}.
	 * @param ctx the parse tree
	 */
	void exitPrintBlock(ClypsParser.PrintBlockContext ctx);
	/**
	 * Enter a parse tree produced by {@link ClypsParser#printExtra}.
	 * @param ctx the parse tree
	 */
	void enterPrintExtra(ClypsParser.PrintExtraContext ctx);
	/**
	 * Exit a parse tree produced by {@link ClypsParser#printExtra}.
	 * @param ctx the parse tree
	 */
	void exitPrintExtra(ClypsParser.PrintExtraContext ctx);
	/**
	 * Enter a parse tree produced by {@link ClypsParser#scanStatement}.
	 * @param ctx the parse tree
	 */
	void enterScanStatement(ClypsParser.ScanStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link ClypsParser#scanStatement}.
	 * @param ctx the parse tree
	 */
	void exitScanStatement(ClypsParser.ScanStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link ClypsParser#scanExtra}.
	 * @param ctx the parse tree
	 */
	void enterScanExtra(ClypsParser.ScanExtraContext ctx);
	/**
	 * Exit a parse tree produced by {@link ClypsParser#scanExtra}.
	 * @param ctx the parse tree
	 */
	void exitScanExtra(ClypsParser.ScanExtraContext ctx);
	/**
	 * Enter a parse tree produced by {@link ClypsParser#statementNoShortIf}.
	 * @param ctx the parse tree
	 */
	void enterStatementNoShortIf(ClypsParser.StatementNoShortIfContext ctx);
	/**
	 * Exit a parse tree produced by {@link ClypsParser#statementNoShortIf}.
	 * @param ctx the parse tree
	 */
	void exitStatementNoShortIf(ClypsParser.StatementNoShortIfContext ctx);
	/**
	 * Enter a parse tree produced by {@link ClypsParser#statementWithoutTrailingSubstatement}.
	 * @param ctx the parse tree
	 */
	void enterStatementWithoutTrailingSubstatement(ClypsParser.StatementWithoutTrailingSubstatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link ClypsParser#statementWithoutTrailingSubstatement}.
	 * @param ctx the parse tree
	 */
	void exitStatementWithoutTrailingSubstatement(ClypsParser.StatementWithoutTrailingSubstatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link ClypsParser#labeledStatement}.
	 * @param ctx the parse tree
	 */
	void enterLabeledStatement(ClypsParser.LabeledStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link ClypsParser#labeledStatement}.
	 * @param ctx the parse tree
	 */
	void exitLabeledStatement(ClypsParser.LabeledStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link ClypsParser#labeledStatementNoShortIf}.
	 * @param ctx the parse tree
	 */
	void enterLabeledStatementNoShortIf(ClypsParser.LabeledStatementNoShortIfContext ctx);
	/**
	 * Exit a parse tree produced by {@link ClypsParser#labeledStatementNoShortIf}.
	 * @param ctx the parse tree
	 */
	void exitLabeledStatementNoShortIf(ClypsParser.LabeledStatementNoShortIfContext ctx);
	/**
	 * Enter a parse tree produced by {@link ClypsParser#expressionStatement}.
	 * @param ctx the parse tree
	 */
	void enterExpressionStatement(ClypsParser.ExpressionStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link ClypsParser#expressionStatement}.
	 * @param ctx the parse tree
	 */
	void exitExpressionStatement(ClypsParser.ExpressionStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link ClypsParser#statementExpression}.
	 * @param ctx the parse tree
	 */
	void enterStatementExpression(ClypsParser.StatementExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link ClypsParser#statementExpression}.
	 * @param ctx the parse tree
	 */
	void exitStatementExpression(ClypsParser.StatementExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link ClypsParser#ifThenStatement}.
	 * @param ctx the parse tree
	 */
	void enterIfThenStatement(ClypsParser.IfThenStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link ClypsParser#ifThenStatement}.
	 * @param ctx the parse tree
	 */
	void exitIfThenStatement(ClypsParser.IfThenStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link ClypsParser#ifThenElseStatement}.
	 * @param ctx the parse tree
	 */
	void enterIfThenElseStatement(ClypsParser.IfThenElseStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link ClypsParser#ifThenElseStatement}.
	 * @param ctx the parse tree
	 */
	void exitIfThenElseStatement(ClypsParser.IfThenElseStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link ClypsParser#ifThenElseStatementNoShortIf}.
	 * @param ctx the parse tree
	 */
	void enterIfThenElseStatementNoShortIf(ClypsParser.IfThenElseStatementNoShortIfContext ctx);
	/**
	 * Exit a parse tree produced by {@link ClypsParser#ifThenElseStatementNoShortIf}.
	 * @param ctx the parse tree
	 */
	void exitIfThenElseStatementNoShortIf(ClypsParser.IfThenElseStatementNoShortIfContext ctx);
	/**
	 * Enter a parse tree produced by {@link ClypsParser#whileStatement}.
	 * @param ctx the parse tree
	 */
	void enterWhileStatement(ClypsParser.WhileStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link ClypsParser#whileStatement}.
	 * @param ctx the parse tree
	 */
	void exitWhileStatement(ClypsParser.WhileStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link ClypsParser#whileStatementNoShortIf}.
	 * @param ctx the parse tree
	 */
	void enterWhileStatementNoShortIf(ClypsParser.WhileStatementNoShortIfContext ctx);
	/**
	 * Exit a parse tree produced by {@link ClypsParser#whileStatementNoShortIf}.
	 * @param ctx the parse tree
	 */
	void exitWhileStatementNoShortIf(ClypsParser.WhileStatementNoShortIfContext ctx);
	/**
	 * Enter a parse tree produced by {@link ClypsParser#doStatement}.
	 * @param ctx the parse tree
	 */
	void enterDoStatement(ClypsParser.DoStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link ClypsParser#doStatement}.
	 * @param ctx the parse tree
	 */
	void exitDoStatement(ClypsParser.DoStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link ClypsParser#forStatement}.
	 * @param ctx the parse tree
	 */
	void enterForStatement(ClypsParser.ForStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link ClypsParser#forStatement}.
	 * @param ctx the parse tree
	 */
	void exitForStatement(ClypsParser.ForStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link ClypsParser#forStatementNoShortIf}.
	 * @param ctx the parse tree
	 */
	void enterForStatementNoShortIf(ClypsParser.ForStatementNoShortIfContext ctx);
	/**
	 * Exit a parse tree produced by {@link ClypsParser#forStatementNoShortIf}.
	 * @param ctx the parse tree
	 */
	void exitForStatementNoShortIf(ClypsParser.ForStatementNoShortIfContext ctx);
	/**
	 * Enter a parse tree produced by {@link ClypsParser#basicForStatement}.
	 * @param ctx the parse tree
	 */
	void enterBasicForStatement(ClypsParser.BasicForStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link ClypsParser#basicForStatement}.
	 * @param ctx the parse tree
	 */
	void exitBasicForStatement(ClypsParser.BasicForStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link ClypsParser#basicForStatementNoShortIf}.
	 * @param ctx the parse tree
	 */
	void enterBasicForStatementNoShortIf(ClypsParser.BasicForStatementNoShortIfContext ctx);
	/**
	 * Exit a parse tree produced by {@link ClypsParser#basicForStatementNoShortIf}.
	 * @param ctx the parse tree
	 */
	void exitBasicForStatementNoShortIf(ClypsParser.BasicForStatementNoShortIfContext ctx);
	/**
	 * Enter a parse tree produced by {@link ClypsParser#forInit}.
	 * @param ctx the parse tree
	 */
	void enterForInit(ClypsParser.ForInitContext ctx);
	/**
	 * Exit a parse tree produced by {@link ClypsParser#forInit}.
	 * @param ctx the parse tree
	 */
	void exitForInit(ClypsParser.ForInitContext ctx);
	/**
	 * Enter a parse tree produced by {@link ClypsParser#forUpdate}.
	 * @param ctx the parse tree
	 */
	void enterForUpdate(ClypsParser.ForUpdateContext ctx);
	/**
	 * Exit a parse tree produced by {@link ClypsParser#forUpdate}.
	 * @param ctx the parse tree
	 */
	void exitForUpdate(ClypsParser.ForUpdateContext ctx);
	/**
	 * Enter a parse tree produced by {@link ClypsParser#statementExpressionList}.
	 * @param ctx the parse tree
	 */
	void enterStatementExpressionList(ClypsParser.StatementExpressionListContext ctx);
	/**
	 * Exit a parse tree produced by {@link ClypsParser#statementExpressionList}.
	 * @param ctx the parse tree
	 */
	void exitStatementExpressionList(ClypsParser.StatementExpressionListContext ctx);
	/**
	 * Enter a parse tree produced by {@link ClypsParser#enhancedForStatement}.
	 * @param ctx the parse tree
	 */
	void enterEnhancedForStatement(ClypsParser.EnhancedForStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link ClypsParser#enhancedForStatement}.
	 * @param ctx the parse tree
	 */
	void exitEnhancedForStatement(ClypsParser.EnhancedForStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link ClypsParser#enhancedForStatementNoShortIf}.
	 * @param ctx the parse tree
	 */
	void enterEnhancedForStatementNoShortIf(ClypsParser.EnhancedForStatementNoShortIfContext ctx);
	/**
	 * Exit a parse tree produced by {@link ClypsParser#enhancedForStatementNoShortIf}.
	 * @param ctx the parse tree
	 */
	void exitEnhancedForStatementNoShortIf(ClypsParser.EnhancedForStatementNoShortIfContext ctx);
	/**
	 * Enter a parse tree produced by {@link ClypsParser#returnStatement}.
	 * @param ctx the parse tree
	 */
	void enterReturnStatement(ClypsParser.ReturnStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link ClypsParser#returnStatement}.
	 * @param ctx the parse tree
	 */
	void exitReturnStatement(ClypsParser.ReturnStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link ClypsParser#primary}.
	 * @param ctx the parse tree
	 */
	void enterPrimary(ClypsParser.PrimaryContext ctx);
	/**
	 * Exit a parse tree produced by {@link ClypsParser#primary}.
	 * @param ctx the parse tree
	 */
	void exitPrimary(ClypsParser.PrimaryContext ctx);
	/**
	 * Enter a parse tree produced by {@link ClypsParser#primaryNoNewArray}.
	 * @param ctx the parse tree
	 */
	void enterPrimaryNoNewArray(ClypsParser.PrimaryNoNewArrayContext ctx);
	/**
	 * Exit a parse tree produced by {@link ClypsParser#primaryNoNewArray}.
	 * @param ctx the parse tree
	 */
	void exitPrimaryNoNewArray(ClypsParser.PrimaryNoNewArrayContext ctx);
	/**
	 * Enter a parse tree produced by {@link ClypsParser#primaryNoNewArray_lf_arrayAccess}.
	 * @param ctx the parse tree
	 */
	void enterPrimaryNoNewArray_lf_arrayAccess(ClypsParser.PrimaryNoNewArray_lf_arrayAccessContext ctx);
	/**
	 * Exit a parse tree produced by {@link ClypsParser#primaryNoNewArray_lf_arrayAccess}.
	 * @param ctx the parse tree
	 */
	void exitPrimaryNoNewArray_lf_arrayAccess(ClypsParser.PrimaryNoNewArray_lf_arrayAccessContext ctx);
	/**
	 * Enter a parse tree produced by {@link ClypsParser#primaryNoNewArray_lfno_arrayAccess}.
	 * @param ctx the parse tree
	 */
	void enterPrimaryNoNewArray_lfno_arrayAccess(ClypsParser.PrimaryNoNewArray_lfno_arrayAccessContext ctx);
	/**
	 * Exit a parse tree produced by {@link ClypsParser#primaryNoNewArray_lfno_arrayAccess}.
	 * @param ctx the parse tree
	 */
	void exitPrimaryNoNewArray_lfno_arrayAccess(ClypsParser.PrimaryNoNewArray_lfno_arrayAccessContext ctx);
	/**
	 * Enter a parse tree produced by {@link ClypsParser#primaryNoNewArray_lf_primary}.
	 * @param ctx the parse tree
	 */
	void enterPrimaryNoNewArray_lf_primary(ClypsParser.PrimaryNoNewArray_lf_primaryContext ctx);
	/**
	 * Exit a parse tree produced by {@link ClypsParser#primaryNoNewArray_lf_primary}.
	 * @param ctx the parse tree
	 */
	void exitPrimaryNoNewArray_lf_primary(ClypsParser.PrimaryNoNewArray_lf_primaryContext ctx);
	/**
	 * Enter a parse tree produced by {@link ClypsParser#primaryNoNewArray_lf_primary_lf_arrayAccess_lf_primary}.
	 * @param ctx the parse tree
	 */
	void enterPrimaryNoNewArray_lf_primary_lf_arrayAccess_lf_primary(ClypsParser.PrimaryNoNewArray_lf_primary_lf_arrayAccess_lf_primaryContext ctx);
	/**
	 * Exit a parse tree produced by {@link ClypsParser#primaryNoNewArray_lf_primary_lf_arrayAccess_lf_primary}.
	 * @param ctx the parse tree
	 */
	void exitPrimaryNoNewArray_lf_primary_lf_arrayAccess_lf_primary(ClypsParser.PrimaryNoNewArray_lf_primary_lf_arrayAccess_lf_primaryContext ctx);
	/**
	 * Enter a parse tree produced by {@link ClypsParser#primaryNoNewArray_lf_primary_lfno_arrayAccess_lf_primary}.
	 * @param ctx the parse tree
	 */
	void enterPrimaryNoNewArray_lf_primary_lfno_arrayAccess_lf_primary(ClypsParser.PrimaryNoNewArray_lf_primary_lfno_arrayAccess_lf_primaryContext ctx);
	/**
	 * Exit a parse tree produced by {@link ClypsParser#primaryNoNewArray_lf_primary_lfno_arrayAccess_lf_primary}.
	 * @param ctx the parse tree
	 */
	void exitPrimaryNoNewArray_lf_primary_lfno_arrayAccess_lf_primary(ClypsParser.PrimaryNoNewArray_lf_primary_lfno_arrayAccess_lf_primaryContext ctx);
	/**
	 * Enter a parse tree produced by {@link ClypsParser#primaryNoNewArray_lfno_primary}.
	 * @param ctx the parse tree
	 */
	void enterPrimaryNoNewArray_lfno_primary(ClypsParser.PrimaryNoNewArray_lfno_primaryContext ctx);
	/**
	 * Exit a parse tree produced by {@link ClypsParser#primaryNoNewArray_lfno_primary}.
	 * @param ctx the parse tree
	 */
	void exitPrimaryNoNewArray_lfno_primary(ClypsParser.PrimaryNoNewArray_lfno_primaryContext ctx);
	/**
	 * Enter a parse tree produced by {@link ClypsParser#primaryNoNewArray_lfno_primary_lf_arrayAccess_lfno_primary}.
	 * @param ctx the parse tree
	 */
	void enterPrimaryNoNewArray_lfno_primary_lf_arrayAccess_lfno_primary(ClypsParser.PrimaryNoNewArray_lfno_primary_lf_arrayAccess_lfno_primaryContext ctx);
	/**
	 * Exit a parse tree produced by {@link ClypsParser#primaryNoNewArray_lfno_primary_lf_arrayAccess_lfno_primary}.
	 * @param ctx the parse tree
	 */
	void exitPrimaryNoNewArray_lfno_primary_lf_arrayAccess_lfno_primary(ClypsParser.PrimaryNoNewArray_lfno_primary_lf_arrayAccess_lfno_primaryContext ctx);
	/**
	 * Enter a parse tree produced by {@link ClypsParser#primaryNoNewArray_lfno_primary_lfno_arrayAccess_lfno_primary}.
	 * @param ctx the parse tree
	 */
	void enterPrimaryNoNewArray_lfno_primary_lfno_arrayAccess_lfno_primary(ClypsParser.PrimaryNoNewArray_lfno_primary_lfno_arrayAccess_lfno_primaryContext ctx);
	/**
	 * Exit a parse tree produced by {@link ClypsParser#primaryNoNewArray_lfno_primary_lfno_arrayAccess_lfno_primary}.
	 * @param ctx the parse tree
	 */
	void exitPrimaryNoNewArray_lfno_primary_lfno_arrayAccess_lfno_primary(ClypsParser.PrimaryNoNewArray_lfno_primary_lfno_arrayAccess_lfno_primaryContext ctx);
	/**
	 * Enter a parse tree produced by {@link ClypsParser#fieldAccess}.
	 * @param ctx the parse tree
	 */
	void enterFieldAccess(ClypsParser.FieldAccessContext ctx);
	/**
	 * Exit a parse tree produced by {@link ClypsParser#fieldAccess}.
	 * @param ctx the parse tree
	 */
	void exitFieldAccess(ClypsParser.FieldAccessContext ctx);
	/**
	 * Enter a parse tree produced by {@link ClypsParser#fieldAccess_lf_primary}.
	 * @param ctx the parse tree
	 */
	void enterFieldAccess_lf_primary(ClypsParser.FieldAccess_lf_primaryContext ctx);
	/**
	 * Exit a parse tree produced by {@link ClypsParser#fieldAccess_lf_primary}.
	 * @param ctx the parse tree
	 */
	void exitFieldAccess_lf_primary(ClypsParser.FieldAccess_lf_primaryContext ctx);
	/**
	 * Enter a parse tree produced by {@link ClypsParser#fieldAccess_lfno_primary}.
	 * @param ctx the parse tree
	 */
	void enterFieldAccess_lfno_primary(ClypsParser.FieldAccess_lfno_primaryContext ctx);
	/**
	 * Exit a parse tree produced by {@link ClypsParser#fieldAccess_lfno_primary}.
	 * @param ctx the parse tree
	 */
	void exitFieldAccess_lfno_primary(ClypsParser.FieldAccess_lfno_primaryContext ctx);
	/**
	 * Enter a parse tree produced by {@link ClypsParser#arrayAccess}.
	 * @param ctx the parse tree
	 */
	void enterArrayAccess(ClypsParser.ArrayAccessContext ctx);
	/**
	 * Exit a parse tree produced by {@link ClypsParser#arrayAccess}.
	 * @param ctx the parse tree
	 */
	void exitArrayAccess(ClypsParser.ArrayAccessContext ctx);
	/**
	 * Enter a parse tree produced by {@link ClypsParser#arrayAccess_lf_primary}.
	 * @param ctx the parse tree
	 */
	void enterArrayAccess_lf_primary(ClypsParser.ArrayAccess_lf_primaryContext ctx);
	/**
	 * Exit a parse tree produced by {@link ClypsParser#arrayAccess_lf_primary}.
	 * @param ctx the parse tree
	 */
	void exitArrayAccess_lf_primary(ClypsParser.ArrayAccess_lf_primaryContext ctx);
	/**
	 * Enter a parse tree produced by {@link ClypsParser#arrayAccess_lfno_primary}.
	 * @param ctx the parse tree
	 */
	void enterArrayAccess_lfno_primary(ClypsParser.ArrayAccess_lfno_primaryContext ctx);
	/**
	 * Exit a parse tree produced by {@link ClypsParser#arrayAccess_lfno_primary}.
	 * @param ctx the parse tree
	 */
	void exitArrayAccess_lfno_primary(ClypsParser.ArrayAccess_lfno_primaryContext ctx);
	/**
	 * Enter a parse tree produced by {@link ClypsParser#methodInvocation}.
	 * @param ctx the parse tree
	 */
	void enterMethodInvocation(ClypsParser.MethodInvocationContext ctx);
	/**
	 * Exit a parse tree produced by {@link ClypsParser#methodInvocation}.
	 * @param ctx the parse tree
	 */
	void exitMethodInvocation(ClypsParser.MethodInvocationContext ctx);
	/**
	 * Enter a parse tree produced by {@link ClypsParser#methodInvocation_lf_primary}.
	 * @param ctx the parse tree
	 */
	void enterMethodInvocation_lf_primary(ClypsParser.MethodInvocation_lf_primaryContext ctx);
	/**
	 * Exit a parse tree produced by {@link ClypsParser#methodInvocation_lf_primary}.
	 * @param ctx the parse tree
	 */
	void exitMethodInvocation_lf_primary(ClypsParser.MethodInvocation_lf_primaryContext ctx);
	/**
	 * Enter a parse tree produced by {@link ClypsParser#methodInvocation_lfno_primary}.
	 * @param ctx the parse tree
	 */
	void enterMethodInvocation_lfno_primary(ClypsParser.MethodInvocation_lfno_primaryContext ctx);
	/**
	 * Exit a parse tree produced by {@link ClypsParser#methodInvocation_lfno_primary}.
	 * @param ctx the parse tree
	 */
	void exitMethodInvocation_lfno_primary(ClypsParser.MethodInvocation_lfno_primaryContext ctx);
	/**
	 * Enter a parse tree produced by {@link ClypsParser#argumentList}.
	 * @param ctx the parse tree
	 */
	void enterArgumentList(ClypsParser.ArgumentListContext ctx);
	/**
	 * Exit a parse tree produced by {@link ClypsParser#argumentList}.
	 * @param ctx the parse tree
	 */
	void exitArgumentList(ClypsParser.ArgumentListContext ctx);
	/**
	 * Enter a parse tree produced by {@link ClypsParser#methodReference}.
	 * @param ctx the parse tree
	 */
	void enterMethodReference(ClypsParser.MethodReferenceContext ctx);
	/**
	 * Exit a parse tree produced by {@link ClypsParser#methodReference}.
	 * @param ctx the parse tree
	 */
	void exitMethodReference(ClypsParser.MethodReferenceContext ctx);
	/**
	 * Enter a parse tree produced by {@link ClypsParser#methodReference_lf_primary}.
	 * @param ctx the parse tree
	 */
	void enterMethodReference_lf_primary(ClypsParser.MethodReference_lf_primaryContext ctx);
	/**
	 * Exit a parse tree produced by {@link ClypsParser#methodReference_lf_primary}.
	 * @param ctx the parse tree
	 */
	void exitMethodReference_lf_primary(ClypsParser.MethodReference_lf_primaryContext ctx);
	/**
	 * Enter a parse tree produced by {@link ClypsParser#methodReference_lfno_primary}.
	 * @param ctx the parse tree
	 */
	void enterMethodReference_lfno_primary(ClypsParser.MethodReference_lfno_primaryContext ctx);
	/**
	 * Exit a parse tree produced by {@link ClypsParser#methodReference_lfno_primary}.
	 * @param ctx the parse tree
	 */
	void exitMethodReference_lfno_primary(ClypsParser.MethodReference_lfno_primaryContext ctx);
	/**
	 * Enter a parse tree produced by {@link ClypsParser#arrayCreationExpression}.
	 * @param ctx the parse tree
	 */
	void enterArrayCreationExpression(ClypsParser.ArrayCreationExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link ClypsParser#arrayCreationExpression}.
	 * @param ctx the parse tree
	 */
	void exitArrayCreationExpression(ClypsParser.ArrayCreationExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link ClypsParser#dimExprs}.
	 * @param ctx the parse tree
	 */
	void enterDimExprs(ClypsParser.DimExprsContext ctx);
	/**
	 * Exit a parse tree produced by {@link ClypsParser#dimExprs}.
	 * @param ctx the parse tree
	 */
	void exitDimExprs(ClypsParser.DimExprsContext ctx);
	/**
	 * Enter a parse tree produced by {@link ClypsParser#dimExpr}.
	 * @param ctx the parse tree
	 */
	void enterDimExpr(ClypsParser.DimExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link ClypsParser#dimExpr}.
	 * @param ctx the parse tree
	 */
	void exitDimExpr(ClypsParser.DimExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link ClypsParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExpression(ClypsParser.ExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link ClypsParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExpression(ClypsParser.ExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link ClypsParser#lambdaExpression}.
	 * @param ctx the parse tree
	 */
	void enterLambdaExpression(ClypsParser.LambdaExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link ClypsParser#lambdaExpression}.
	 * @param ctx the parse tree
	 */
	void exitLambdaExpression(ClypsParser.LambdaExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link ClypsParser#lambdaParameters}.
	 * @param ctx the parse tree
	 */
	void enterLambdaParameters(ClypsParser.LambdaParametersContext ctx);
	/**
	 * Exit a parse tree produced by {@link ClypsParser#lambdaParameters}.
	 * @param ctx the parse tree
	 */
	void exitLambdaParameters(ClypsParser.LambdaParametersContext ctx);
	/**
	 * Enter a parse tree produced by {@link ClypsParser#inferredFormalParameterList}.
	 * @param ctx the parse tree
	 */
	void enterInferredFormalParameterList(ClypsParser.InferredFormalParameterListContext ctx);
	/**
	 * Exit a parse tree produced by {@link ClypsParser#inferredFormalParameterList}.
	 * @param ctx the parse tree
	 */
	void exitInferredFormalParameterList(ClypsParser.InferredFormalParameterListContext ctx);
	/**
	 * Enter a parse tree produced by {@link ClypsParser#lambdaBody}.
	 * @param ctx the parse tree
	 */
	void enterLambdaBody(ClypsParser.LambdaBodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link ClypsParser#lambdaBody}.
	 * @param ctx the parse tree
	 */
	void exitLambdaBody(ClypsParser.LambdaBodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link ClypsParser#assignmentExpression}.
	 * @param ctx the parse tree
	 */
	void enterAssignmentExpression(ClypsParser.AssignmentExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link ClypsParser#assignmentExpression}.
	 * @param ctx the parse tree
	 */
	void exitAssignmentExpression(ClypsParser.AssignmentExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link ClypsParser#assignment}.
	 * @param ctx the parse tree
	 */
	void enterAssignment(ClypsParser.AssignmentContext ctx);
	/**
	 * Exit a parse tree produced by {@link ClypsParser#assignment}.
	 * @param ctx the parse tree
	 */
	void exitAssignment(ClypsParser.AssignmentContext ctx);
	/**
	 * Enter a parse tree produced by {@link ClypsParser#leftHandSide}.
	 * @param ctx the parse tree
	 */
	void enterLeftHandSide(ClypsParser.LeftHandSideContext ctx);
	/**
	 * Exit a parse tree produced by {@link ClypsParser#leftHandSide}.
	 * @param ctx the parse tree
	 */
	void exitLeftHandSide(ClypsParser.LeftHandSideContext ctx);
	/**
	 * Enter a parse tree produced by {@link ClypsParser#assignmentOperator}.
	 * @param ctx the parse tree
	 */
	void enterAssignmentOperator(ClypsParser.AssignmentOperatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link ClypsParser#assignmentOperator}.
	 * @param ctx the parse tree
	 */
	void exitAssignmentOperator(ClypsParser.AssignmentOperatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link ClypsParser#conditionalExpression}.
	 * @param ctx the parse tree
	 */
	void enterConditionalExpression(ClypsParser.ConditionalExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link ClypsParser#conditionalExpression}.
	 * @param ctx the parse tree
	 */
	void exitConditionalExpression(ClypsParser.ConditionalExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link ClypsParser#conditionalOrExpression}.
	 * @param ctx the parse tree
	 */
	void enterConditionalOrExpression(ClypsParser.ConditionalOrExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link ClypsParser#conditionalOrExpression}.
	 * @param ctx the parse tree
	 */
	void exitConditionalOrExpression(ClypsParser.ConditionalOrExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link ClypsParser#conditionalAndExpression}.
	 * @param ctx the parse tree
	 */
	void enterConditionalAndExpression(ClypsParser.ConditionalAndExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link ClypsParser#conditionalAndExpression}.
	 * @param ctx the parse tree
	 */
	void exitConditionalAndExpression(ClypsParser.ConditionalAndExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link ClypsParser#inclusiveOrExpression}.
	 * @param ctx the parse tree
	 */
	void enterInclusiveOrExpression(ClypsParser.InclusiveOrExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link ClypsParser#inclusiveOrExpression}.
	 * @param ctx the parse tree
	 */
	void exitInclusiveOrExpression(ClypsParser.InclusiveOrExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link ClypsParser#exclusiveOrExpression}.
	 * @param ctx the parse tree
	 */
	void enterExclusiveOrExpression(ClypsParser.ExclusiveOrExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link ClypsParser#exclusiveOrExpression}.
	 * @param ctx the parse tree
	 */
	void exitExclusiveOrExpression(ClypsParser.ExclusiveOrExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link ClypsParser#andExpression}.
	 * @param ctx the parse tree
	 */
	void enterAndExpression(ClypsParser.AndExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link ClypsParser#andExpression}.
	 * @param ctx the parse tree
	 */
	void exitAndExpression(ClypsParser.AndExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link ClypsParser#equalityExpression}.
	 * @param ctx the parse tree
	 */
	void enterEqualityExpression(ClypsParser.EqualityExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link ClypsParser#equalityExpression}.
	 * @param ctx the parse tree
	 */
	void exitEqualityExpression(ClypsParser.EqualityExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link ClypsParser#relationalExpression}.
	 * @param ctx the parse tree
	 */
	void enterRelationalExpression(ClypsParser.RelationalExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link ClypsParser#relationalExpression}.
	 * @param ctx the parse tree
	 */
	void exitRelationalExpression(ClypsParser.RelationalExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link ClypsParser#shiftExpression}.
	 * @param ctx the parse tree
	 */
	void enterShiftExpression(ClypsParser.ShiftExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link ClypsParser#shiftExpression}.
	 * @param ctx the parse tree
	 */
	void exitShiftExpression(ClypsParser.ShiftExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link ClypsParser#additiveExpression}.
	 * @param ctx the parse tree
	 */
	void enterAdditiveExpression(ClypsParser.AdditiveExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link ClypsParser#additiveExpression}.
	 * @param ctx the parse tree
	 */
	void exitAdditiveExpression(ClypsParser.AdditiveExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link ClypsParser#multiplicativeExpression}.
	 * @param ctx the parse tree
	 */
	void enterMultiplicativeExpression(ClypsParser.MultiplicativeExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link ClypsParser#multiplicativeExpression}.
	 * @param ctx the parse tree
	 */
	void exitMultiplicativeExpression(ClypsParser.MultiplicativeExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link ClypsParser#unaryExpression}.
	 * @param ctx the parse tree
	 */
	void enterUnaryExpression(ClypsParser.UnaryExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link ClypsParser#unaryExpression}.
	 * @param ctx the parse tree
	 */
	void exitUnaryExpression(ClypsParser.UnaryExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link ClypsParser#preIncrementExpression}.
	 * @param ctx the parse tree
	 */
	void enterPreIncrementExpression(ClypsParser.PreIncrementExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link ClypsParser#preIncrementExpression}.
	 * @param ctx the parse tree
	 */
	void exitPreIncrementExpression(ClypsParser.PreIncrementExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link ClypsParser#preDecrementExpression}.
	 * @param ctx the parse tree
	 */
	void enterPreDecrementExpression(ClypsParser.PreDecrementExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link ClypsParser#preDecrementExpression}.
	 * @param ctx the parse tree
	 */
	void exitPreDecrementExpression(ClypsParser.PreDecrementExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link ClypsParser#unaryExpressionNotPlusMinus}.
	 * @param ctx the parse tree
	 */
	void enterUnaryExpressionNotPlusMinus(ClypsParser.UnaryExpressionNotPlusMinusContext ctx);
	/**
	 * Exit a parse tree produced by {@link ClypsParser#unaryExpressionNotPlusMinus}.
	 * @param ctx the parse tree
	 */
	void exitUnaryExpressionNotPlusMinus(ClypsParser.UnaryExpressionNotPlusMinusContext ctx);
	/**
	 * Enter a parse tree produced by {@link ClypsParser#postfixExpression}.
	 * @param ctx the parse tree
	 */
	void enterPostfixExpression(ClypsParser.PostfixExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link ClypsParser#postfixExpression}.
	 * @param ctx the parse tree
	 */
	void exitPostfixExpression(ClypsParser.PostfixExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link ClypsParser#postIncrementExpression}.
	 * @param ctx the parse tree
	 */
	void enterPostIncrementExpression(ClypsParser.PostIncrementExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link ClypsParser#postIncrementExpression}.
	 * @param ctx the parse tree
	 */
	void exitPostIncrementExpression(ClypsParser.PostIncrementExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link ClypsParser#postIncrementExpression_lf_postfixExpression}.
	 * @param ctx the parse tree
	 */
	void enterPostIncrementExpression_lf_postfixExpression(ClypsParser.PostIncrementExpression_lf_postfixExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link ClypsParser#postIncrementExpression_lf_postfixExpression}.
	 * @param ctx the parse tree
	 */
	void exitPostIncrementExpression_lf_postfixExpression(ClypsParser.PostIncrementExpression_lf_postfixExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link ClypsParser#postDecrementExpression}.
	 * @param ctx the parse tree
	 */
	void enterPostDecrementExpression(ClypsParser.PostDecrementExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link ClypsParser#postDecrementExpression}.
	 * @param ctx the parse tree
	 */
	void exitPostDecrementExpression(ClypsParser.PostDecrementExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link ClypsParser#postDecrementExpression_lf_postfixExpression}.
	 * @param ctx the parse tree
	 */
	void enterPostDecrementExpression_lf_postfixExpression(ClypsParser.PostDecrementExpression_lf_postfixExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link ClypsParser#postDecrementExpression_lf_postfixExpression}.
	 * @param ctx the parse tree
	 */
	void exitPostDecrementExpression_lf_postfixExpression(ClypsParser.PostDecrementExpression_lf_postfixExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link ClypsParser#castExpression}.
	 * @param ctx the parse tree
	 */
	void enterCastExpression(ClypsParser.CastExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link ClypsParser#castExpression}.
	 * @param ctx the parse tree
	 */
	void exitCastExpression(ClypsParser.CastExpressionContext ctx);
}