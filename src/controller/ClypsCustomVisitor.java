package controller;

import antlr.ClypsBaseVisitor;
import antlr.ClypsParser;
import items.ClypsValue;

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
//        System.out.println(ctx.getText());
//        System.out.println(ctx.getChild(0).getChild(0).getText());
//        System.out.println(ctx.getChild(0).getChild(1).getChild(0).getChild(0).getText());
//        System.out.println(ctx.getChild(0).getChild(1).getChild(0).getChild(2).getText());
        if (SymbolTableManager.getInstance().lookup(ctx.getChild(0).getChild(1).getChild(0).getChild(0).getText(),0)==null){
            System.out.println("VAR NOT FOUND");
            ClypsValue value = new ClypsValue(ctx.getChild(0).getChild(1).getChild(0).getChild(2).getText(), ctx.getChild(0).getChild(0).getText());
            ClypsValueLevel valueL = new ClypsValueLevel(this.level,value);

            SymbolTableManager.getInstance().registerVar(ctx.getChild(0).getChild(1).getChild(0).getChild(0).getText(),valueL);
        }else {
            //System.out.println("DUPLICATE VAR");
            editor.addCustomError("DUPLICATE VAR DETECTED",ctx.start.getLine());
            //System.out.println(editor.errors.get(editor.errors.size()-1));
        }


        //System.out.println("IS IT FOUND?");
//        System.out.println(SymbolTableManager.getInstance().getParentScope().lookup(ctx.getChild(0).getChild(1).getChild(0).getChild(0).getText()).getValue());
//        System.out.println(SymbolTableManager.getInstance().getParentScope().lookup(ctx.getChild(0).getChild(1).getChild(0).getChild(0).getText()).getPrimitiveType());

        //SymbolTableManager.getInstance().printAllVars();

        return visitChildren(ctx);
    }

    @Override
    public ClypsValueLevel visitIfThenStatement(ClypsParser.IfThenStatementContext ctx) {


        return visitChildren(ctx);
    }

    @Override
    public ClypsValueLevel visitBlock(ClypsParser.BlockContext ctx) {

        return visitChildren(ctx);
    }

    @Override public ClypsValueLevel visitMethodDeclaration(ClypsParser.MethodDeclarationContext ctx) {
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
