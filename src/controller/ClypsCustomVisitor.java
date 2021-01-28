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
//        System.out.println(ctx.getText());
//        System.out.println(ctx.getChild(0).getChild(0).getText());
//        System.out.println(ctx.getChild(0).getChild(1).getChild(0).getChild(0).getText());
//        System.out.println(ctx.getChild(0).getChild(1).getChild(0).getChild(2).getText());
        if (SymbolTableManager.searchVariableInLocalIterative(ctx.getChild(0).getChild(1).getChild(0).getChild(0).getText(),SymbolTableManager.getInstance().getActiveLocalScope())==null&&
                SymbolTableManager.searchVariableInLocalIterative(ctx.getChild(0).getChild(1).getChild(0).getChild(0).getText(),SymbolTableManager.getInstance().getActiveLocalScope().getParent())==null){
            System.out.println("VAR NOT FOUND");
            boolean test1 = ctx.getChild(0).getChild(1).getChild(0).getChild(2).getText().contains("\"");
            boolean test2 = ctx.getChild(0).getChild(1).getChild(0).getChild(2).getText().contains("'");

            System.out.println(test2);
            System.out.println(ctx.getChild(0).getChild(0).getText());
            System.out.println(ClypsValue.translateType(ctx.getChild(0).getChild(0).getText()));
            if (ClypsValue.translateType(ctx.getChild(0).getChild(0).getText())!= ClypsValue.PrimitiveType.STRING&&!test1&&!test2){
                boolean test = new Expression(ctx.getChild(0).getChild(1).getChild(0).getChild(2).getText()).isBoolean();
                if (!test&&ctx.getChild(0).getChild(1).getChild(0).getChild(2).getText().contains("true")||ctx.getChild(0).getChild(1).getChild(0).getChild(2).getText().contains("false"))
                    test=true;
                System.out.println("====");
                System.out.println(test);
                System.out.println(ctx.getChild(0).getChild(1).getChild(0).getChild(2).getText());
                if (ClypsValue.translateType(ctx.getChild(0).getChild(0).getText())== ClypsValue.PrimitiveType.BOOLEAN&&test){
                    System.out.println("IS BOOLEAN");
                    SymbolTableManager.getInstance().getActiveLocalScope().addInitializedVariableFromKeywords(ctx.getChild(0).getChild(0).getText(),ctx.getChild(0).getChild(1).getChild(0).getChild(0).getText(),ctx.getChild(0).getChild(1).getChild(0).getChild(2).getText());
                } else if (ClypsValue.translateType(ctx.getChild(0).getChild(0).getText())!= ClypsValue.PrimitiveType.BOOLEAN&&(test||ctx.getChild(0).getChild(1).getChild(0).getChild(2).getText().contains("true")||ctx.getChild(0).getChild(1).getChild(0).getChild(2).getText().contains("false"))){
                    System.out.println("NOT BOOLEAN");
                    editor.addCustomError("TYPE MISMATCH",ctx.start.getLine());
                }else if (ClypsValue.translateType(ctx.getChild(0).getChild(0).getText())!= ClypsValue.PrimitiveType.BOOLEAN&&!test){
                    System.out.println("IS DECIMAL");
                    SymbolTableManager.getInstance().getActiveLocalScope().addInitializedVariableFromKeywords(ctx.getChild(0).getChild(0).getText(),ctx.getChild(0).getChild(1).getChild(0).getChild(0).getText(),ctx.getChild(0).getChild(1).getChild(0).getChild(2).getText());

                }
            }else if (ClypsValue.translateType(ctx.getChild(0).getChild(0).getText())== ClypsValue.PrimitiveType.STRING&&test1){
                SymbolTableManager.getInstance().getActiveLocalScope().addEmptyVariableFromKeywords(ctx.getChild(0).getChild(0).getText(),ctx.getChild(0).getChild(1).getChild(0).getChild(0).getText());
                SymbolTableManager.getInstance().getActiveLocalScope().searchVariableIncludingLocal(ctx.getChild(0).getChild(1).getChild(0).getChild(0).getText()).setSCValue(ctx.getChild(0).getChild(1).getChild(0).getChild(2).getText());
            }else if(ClypsValue.translateType(ctx.getChild(0).getChild(0).getText())== ClypsValue.PrimitiveType.CHAR&&test2){
                SymbolTableManager.getInstance().getActiveLocalScope().addEmptyVariableFromKeywords(ctx.getChild(0).getChild(0).getText(),ctx.getChild(0).getChild(1).getChild(0).getChild(0).getText());
                SymbolTableManager.getInstance().getActiveLocalScope().searchVariableIncludingLocal(ctx.getChild(0).getChild(1).getChild(0).getChild(0).getText()).setSCValue(ctx.getChild(0).getChild(1).getChild(0).getChild(2).getText());

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
