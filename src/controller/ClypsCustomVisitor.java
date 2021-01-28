package controller;

import ErrorCheckers.TypeChecking;
import antlr.ClypsBaseVisitor;
import antlr.ClypsParser;
import items.ClypsValue;
import sun.awt.Symbol;

import java.util.HashMap;

public class ClypsCustomVisitor extends ClypsBaseVisitor<ClypsValue> {

    @Override public ClypsValue visitLocalVariableDeclarationStatement(ClypsParser.LocalVariableDeclarationStatementContext ctx) {
        System.out.println("NEW VAR");
//        System.out.println(ctx.getText());
//        System.out.println(ctx.getChild(0).getChild(0).getText());
//        System.out.println(ctx.getChild(0).getChild(1).getChild(0).getChild(0).getText());
//        System.out.println(ctx.getChild(0).getChild(1).getChild(0).getChild(2).getText());
        if (SymbolTableManager.searchVariableInLocalIterative(ctx.getChild(0).getChild(1).getChild(0).getChild(0).getText(),SymbolTableManager.getInstance().getActiveLocalScope().getParent())==null){
            System.out.println("VAR NOT FOUND");
            SymbolTableManager.getInstance().getActiveLocalScope().addInitializedVariableFromKeywords(ctx.getChild(0).getChild(0).getText(),ctx.getChild(0).getChild(1).getChild(0).getChild(0).getText(),ctx.getChild(0).getChild(1).getChild(0).getChild(2).getText());

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
        if (SymbolTableManager.getInstance().getActiveLocalScope().searchVariableIncludingLocal(ctx.variableDeclarator().variableDeclaratorId().Identifier().getText())!=null){
            System.out.println("REASSIGN");
            SymbolTableManager.getInstance().getActiveLocalScope().setDeclaredVariable(ctx.variableDeclarator().variableDeclaratorId().Identifier().getText(),ctx.variableDeclarator().variableInitializer().getText());
        }else {
            //System.out.println("DUPLICATE VAR");
            editor.addCustomError("VAR DOES NOT EXIST",ctx.start.getLine());
            //System.out.println(editor.errors.get(editor.errors.size()-1));
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
