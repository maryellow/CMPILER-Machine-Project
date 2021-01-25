package controller;

import antlr.ClypsBaseVisitor;
import antlr.ClypsParser;
import items.ClypsValue;

import java.util.HashMap;

public class ClypsCustomVisitor extends ClypsBaseVisitor<ClypsValue> {

    private Scope scope;
    private HashMap<String,Function> functionMap;

    public ClypsCustomVisitor(Scope scope, HashMap<String,Function> functionMap){
        this.scope=scope;
        this.functionMap=functionMap;
    }

    @Override public ClypsValue visitLocalVariableDeclarationStatement(ClypsParser.LocalVariableDeclarationStatementContext ctx) {
        System.out.println("NEW VAR");
        System.out.println(ctx.getText());
        System.out.println(ctx.getChild(0).getChild(0).getText());
        System.out.println(ctx.getChild(0).getChild(1).getChild(0).getChild(0).getText());
        System.out.println(ctx.getChild(0).getChild(1).getChild(0).getChild(2).getText());
        ClypsValue value = new ClypsValue(ctx.getChild(0).getChild(1).getChild(0).getChild(2).getText(), ctx.getChild(0).getChild(0).getText());

        SymbolTableManager.getInstance().getParentScope().registerVar(ctx.getChild(0).getChild(1).getChild(0).getChild(0).getText(),value);

        System.out.println("IS IT FOUND?");
//        System.out.println(SymbolTableManager.getInstance().getParentScope().lookup(ctx.getChild(0).getChild(1).getChild(0).getChild(0).getText()).getValue());
//        System.out.println(SymbolTableManager.getInstance().getParentScope().lookup(ctx.getChild(0).getChild(1).getChild(0).getChild(0).getText()).getPrimitiveType());

        SymbolTableManager.getInstance().getParentScope().printAllVars();

        return visitChildren(ctx);
    }

    @Override
    public ClypsValue visitIfThenStatement(ClypsParser.IfThenStatementContext ctx) {


        return visitChildren(ctx);
    }

    @Override
    public ClypsValue visitBlock(ClypsParser.BlockContext ctx) {

        return visitChildren(ctx);
    }

    @Override public ClypsValue visitMethodDeclaration(ClypsParser.MethodDeclarationContext ctx) {
        System.out.println("ENTER FUNCTION");
        System.out.println(ctx.getText());
        System.out.println(ctx.methodHeader().result().getText());
        System.out.println(ctx.methodHeader().methodDeclarator().Identifier().getText());

        Function function = new Function();

        SymbolTableManager.getInstance().addFunction(ctx.methodHeader().methodDeclarator().Identifier().getText(),function);

        System.out.println("PRINT ALL FUNCTION");
        SymbolTableManager.getInstance().printAllFunctions();

        return visitChildren(ctx);
    }
}
