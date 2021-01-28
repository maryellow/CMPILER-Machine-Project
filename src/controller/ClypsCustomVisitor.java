package controller;

import ErrorCheckers.TypeChecking;
import antlr.ClypsBaseVisitor;
import antlr.ClypsParser;
import com.udojava.evalex.Expression;
import items.ClypsValue;
import sun.awt.Symbol;

import java.util.HashMap;

public class ClypsCustomVisitor extends ClypsBaseVisitor<ClypsValue> {

    @Override public ClypsValue visitLocalVariableDeclarationStatement(ClypsParser.LocalVariableDeclarationStatementContext ctx) {
        System.out.println("NEW VAR");



        System.out.println(ctx.getText());
        System.out.println("----");
        String type = ctx.localVariableDeclaration().unannType(0).getText();
        String name = ctx.localVariableDeclaration().variableDeclaratorList().variableDeclarator().get(0).variableDeclaratorId().getText();
        String value = ctx.localVariableDeclaration().variableDeclaratorList().variableDeclarator().get(0).variableInitializer().getText();
        System.out.println(ctx.localVariableDeclaration().unannType(0).getText());
        System.out.println(ctx.localVariableDeclaration().variableDeclaratorList().variableDeclarator().get(0).variableDeclaratorId().getText());
        System.out.println(ctx.localVariableDeclaration().variableDeclaratorList().variableDeclarator().get(0).variableInitializer().getText());
        if (SymbolTableManager.searchVariableInLocalIterative(name,SymbolTableManager.getInstance().getActiveLocalScope())==null&&
                SymbolTableManager.searchVariableInLocalIterative(name,SymbolTableManager.getInstance().getActiveLocalScope().getParent())==null){
            System.out.println("VAR NOT FOUND");
            boolean test1 = value.contains("\"");
            boolean test2 = value.contains("'");

            System.out.println(test2);
            System.out.println(type);
            System.out.println(ClypsValue.translateType(type));
            if (ClypsValue.translateType(type)!= ClypsValue.PrimitiveType.STRING&&!test1&&!test2){
                boolean test = new Expression(value).isBoolean();
                if (!test&&value.contains("true")||value.contains("false"))
                    test=true;
                System.out.println("====");
                System.out.println(test);
                System.out.println(value);
                if (ClypsValue.translateType(type)== ClypsValue.PrimitiveType.BOOLEAN&&test){
                    System.out.println("IS BOOLEAN");
                    SymbolTableManager.getInstance().getActiveLocalScope().addInitializedVariableFromKeywords(type,name,value);

                } else if (ClypsValue.translateType(type)!= ClypsValue.PrimitiveType.BOOLEAN&&(test||value.contains("true")||value.contains("false"))){
                    System.out.println("NOT BOOLEAN");
                    editor.addCustomError("TYPE MISMATCH",ctx.start.getLine());
                }else if (ClypsValue.translateType(type)!= ClypsValue.PrimitiveType.BOOLEAN&&!test){
                    System.out.println("IS DECIMAL");
                    SymbolTableManager.getInstance().getActiveLocalScope().addInitializedVariableFromKeywords(type,name,value);

                }
                if (!ctx.localVariableDeclaration().variableModifier().isEmpty()){
                    if (ctx.localVariableDeclaration().variableModifier().get(0).getText().contains("final")){
                        SymbolTableManager.getInstance().getActiveLocalScope().searchVariableIncludingLocal(name).markFinal();
                    }
                }
            }else if ((ClypsValue.translateType(type)== ClypsValue.PrimitiveType.STRING&&test1)||
                    (ClypsValue.translateType(type)== ClypsValue.PrimitiveType.CHAR&&test2)){
                SymbolTableManager.getInstance().getActiveLocalScope().addEmptyVariableFromKeywords(type,name);
                SymbolTableManager.getInstance().getActiveLocalScope().searchVariableIncludingLocal(name).setSCValue(value);
                if (!ctx.localVariableDeclaration().variableModifier().isEmpty()){
                    if (ctx.localVariableDeclaration().variableModifier().get(0).getText().contains("final")){
                        SymbolTableManager.getInstance().getActiveLocalScope().searchVariableIncludingLocal(name).markFinal();
                    }
                }

            }else {
                editor.addCustomError("TYPE MISMATCH",ctx.start.getLine());
            }

        }else {
            editor.addCustomError("DUPLICATE VAR DETECTED",ctx.start.getLine());
        }

        System.out.println("PRINT ALL VARS");
        SymbolTableManager.getInstance().getActiveLocalScope().printAllVars();
        System.out.println("PRINT ALL VARS");
        return visitChildren(ctx);
    }

    @Override
    public ClypsValue visitVariableDeclarationStatement(ClypsParser.VariableDeclarationStatementContext ctx) {
        //System.out.println(ctx.variableDeclarator().variableDeclaratorId().Identifier());
        if (!SymbolTableManager.getInstance().getActiveLocalScope().searchVariableIncludingLocal(ctx.variableDeclarator().variableDeclaratorId().Identifier().getText()).isFinal()){
            if (SymbolTableManager.getInstance().getActiveLocalScope().searchVariableIncludingLocal(ctx.variableDeclarator().variableDeclaratorId().Identifier().getText())!=null){
                System.out.println("REASSIGN");
                SymbolTableManager.getInstance().getActiveLocalScope().setDeclaredVariable(ctx.variableDeclarator().variableDeclaratorId().Identifier().getText(),ctx.variableDeclarator().variableInitializer().getText());
            }else {
                //System.out.println("DUPLICATE VAR");
                editor.addCustomError("VAR DOES NOT EXIST",ctx.start.getLine());
                //System.out.println(editor.errors.get(editor.errors.size()-1));
            }
        }else {
            editor.addCustomError("CANNOT CHANGE CONSTANT VARIABLE",ctx.start.getLine());
        }

        System.out.println("PRINT ALL VARS");
        SymbolTableManager.getInstance().getActiveLocalScope().printAllVars();
        System.out.println("PRINT ALL VARS");
        return visitChildren(ctx);
    }

    @Override
    public ClypsValue visitVariableNoInit(ClypsParser.VariableNoInitContext ctx) {
        String type = ctx.unannType().getText();
        String name = ctx.variableDeclaratorId().Identifier().getText();

        if (SymbolTableManager.searchVariableInLocalIterative(name,SymbolTableManager.getInstance().getActiveLocalScope())==null&&
                SymbolTableManager.searchVariableInLocalIterative(name,SymbolTableManager.getInstance().getActiveLocalScope().getParent())==null){
            System.out.println("VAR NOT FOUND");

            System.out.println(ClypsValue.translateType(type));
            if (ClypsValue.translateType(type)!= ClypsValue.PrimitiveType.STRING){
                if (ClypsValue.translateType(type)== ClypsValue.PrimitiveType.BOOLEAN){
                    System.out.println("IS BOOLEAN");
                    SymbolTableManager.getInstance().getActiveLocalScope().addEmptyVariableFromKeywords(type,name);
                }else if (ClypsValue.translateType(type)!= ClypsValue.PrimitiveType.BOOLEAN){
                    System.out.println("IS DECIMAL");
                    SymbolTableManager.getInstance().getActiveLocalScope().addEmptyVariableFromKeywords(type,name);
                }
                if (!ctx.variableModifier().isEmpty()){
                    if (ctx.variableModifier().get(0).getText().contains("final")){
                        editor.addCustomError("CONSTANT VARIABLE NEEDS TO BE INITIALIZED",ctx.start.getLine());
                    }
                }
            }else if ((ClypsValue.translateType(type)== ClypsValue.PrimitiveType.STRING)||
                    (ClypsValue.translateType(type)== ClypsValue.PrimitiveType.CHAR)){
                SymbolTableManager.getInstance().getActiveLocalScope().addEmptyVariableFromKeywords(type,name);
                if (!ctx.variableModifier().isEmpty()){
                    if (ctx.variableModifier().get(0).getText().contains("final")){
                        editor.addCustomError("CONSTANT VARIABLE NEEDS TO BE INITIALIZED",ctx.start.getLine());
                    }
                }
            }else {
                editor.addCustomError("TYPE MISMATCH",ctx.start.getLine());
            }

        }else {
            editor.addCustomError("DUPLICATE VAR DETECTED",ctx.start.getLine());
        }

        System.out.println("PRINT ALL VARS");
        SymbolTableManager.getInstance().getActiveLocalScope().printAllVars();
        System.out.println("PRINT ALL VARS");

        return visitChildren(ctx);
    }

    @Override
    public ClypsValue visitIfThenStatement(ClypsParser.IfThenStatementContext ctx) {


        return visitChildren(ctx);
    }

    @Override
    public ClypsValue visitBlock(ClypsParser.BlockContext ctx) {
        System.out.println("ENTER BLOCK");
        SymbolTableManager.getInstance().openLocalScope();

        visitChildren(ctx);

        SymbolTableManager.getInstance().closeLocalScope();
        System.out.println("EXIT BLOCK");
        return null;
    }

    @Override public ClypsValue visitMethodDeclaration(ClypsParser.MethodDeclarationContext ctx) {
        System.out.println("ENTER FUNCTION");
        System.out.println(ctx.getText());
        System.out.println(ctx.methodHeader().result().getText());
        System.out.println(ctx.methodHeader().methodDeclarator().Identifier().getText());

        if (SymbolTableManager.getInstance().functionLookup(ctx.methodHeader().methodDeclarator().Identifier().getText())==null){
            Function function = new Function();

            SymbolTableManager.getInstance().addFunction(ctx.methodHeader().methodDeclarator().Identifier().getText(),function);
        }else {
            editor.addCustomError("DUPLICATE FUNCTION DETECTED",ctx.start.getLine());
        }


        System.out.println("PRINT ALL FUNCTION");
        SymbolTableManager.getInstance().printAllFunctions();

        return visitChildren(ctx);
    }

}
