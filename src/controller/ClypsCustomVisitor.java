package controller;

import antlr.ClypsBaseVisitor;
import antlr.ClypsParser;
import items.ClypsValue;
import sun.awt.Symbol;

import java.util.HashMap;

public class ClypsCustomVisitor extends ClypsBaseVisitor<ClypsValueLevel> {

    private int level;
    //private HashMap<String,Function> functionMap;

    public ClypsCustomVisitor(int level){
        this.level=level;
        //this.functionMap=functionMap;
    }

    @Override public ClypsValueLevel visitLocalVariableDeclarationStatement(ClypsParser.LocalVariableDeclarationStatementContext ctx) {
        System.out.println("NEW VAR");
        System.out.println(ctx.getText());
        System.out.println(ctx.getChild(0).getChild(0).getText());
        System.out.println(ctx.getChild(0).getChild(1).getChild(0).getChild(0).getText());
        System.out.println(ctx.getChild(0).getChild(1).getChild(0).getChild(2).getText());
        if (SymbolTableManager.getInstance().lookup(ctx.getChild(0).getChild(1).getChild(0).getChild(0).getText(),0)==null){
            System.out.println("VAR NOT FOUND");
            ClypsValue value = new ClypsValue(ctx.getChild(0).getChild(1).getChild(0).getChild(2).getText(), ctx.getChild(0).getChild(0).getText());
            ClypsValueLevel valueL = new ClypsValueLevel(SymbolTableManager.getInstance().getCurrentLevel(), value);

            SymbolTableManager.getInstance().registerVar(ctx.getChild(0).getChild(1).getChild(0).getChild(0).getText(),valueL);
        }else {
            //System.out.println("DUPLICATE VAR");
            editor.addCustomError("DUPLICATE VAR DETECTED",ctx.start.getLine());
            //System.out.println(editor.errors.get(editor.errors.size()-1));
        }


        System.out.println("IS IT FOUND?");
//        System.out.println(SymbolTableManager.getInstance().getParentScope().lookup(ctx.getChild(0).getChild(1).getChild(0).getChild(0).getText()).getValue());
//        System.out.println(SymbolTableManager.getInstance().getParentScope().lookup(ctx.getChild(0).getChild(1).getChild(0).getChild(0).getText()).getPrimitiveType());

        SymbolTableManager.getInstance().printAllVars();

        return visitChildren(ctx);
    }

    @Override
    public ClypsValueLevel visitVariableDeclarationStatement(ClypsParser.VariableDeclarationStatementContext ctx) {
        //System.out.println(ctx.variableDeclarator().variableDeclaratorId().Identifier());
        if (SymbolTableManager.getInstance().lookup(ctx.variableDeclarator().variableDeclaratorId().Identifier().getText(),0)!=null){
            System.out.println("REASSIGN");
            ClypsValue value = new ClypsValue(ctx.variableDeclarator().variableInitializer().getText(), ctx.variableDeclarator().variableDeclaratorId().Identifier().getText());
            ClypsValueLevel valueL = new ClypsValueLevel(SymbolTableManager.getInstance().getCurrentLevel(), value);
            SymbolTableManager.getInstance().assign(ctx.variableDeclarator().variableDeclaratorId().Identifier().getText(),valueL);
        }else {
            //System.out.println("DUPLICATE VAR");
            editor.addCustomError("VAR DOES NOT EXIST",ctx.start.getLine());
            //System.out.println(editor.errors.get(editor.errors.size()-1));
        }
        SymbolTableManager.getInstance().printAllVars();
        return visitChildren(ctx);
    }

    @Override
    public ClypsValueLevel visitIfThenStatement(ClypsParser.IfThenStatementContext ctx) {


        return visitChildren(ctx);
    }

    @Override
    public ClypsValueLevel visitBlock(ClypsParser.BlockContext ctx) {
        System.out.println(SymbolTableManager.getInstance().getCurrentLevel());
        System.out.println("ENTER BLOCK");
        SymbolTableManager.getInstance().addLevel();
        System.out.println(SymbolTableManager.getInstance().getCurrentLevel());

        visitChildren(ctx);

        SymbolTableManager.getInstance().decreaseLevel();
        System.out.println("EXIT BLOCK");
        System.out.println(SymbolTableManager.getInstance().getCurrentLevel());

        return null;
    }

    @Override public ClypsValueLevel visitMethodDeclaration(ClypsParser.MethodDeclarationContext ctx) {
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
