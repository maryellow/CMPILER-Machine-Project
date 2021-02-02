package commands;

import antlr.ClypsParser;
import controller.ClypsFunction;
import controller.ClypsValue;
import controller.Scope;
import controller.SymbolTableManager;
import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.tree.ErrorNode;
import org.antlr.v4.runtime.tree.ParseTreeListener;
import org.antlr.v4.runtime.tree.ParseTreeWalker;
import org.antlr.v4.runtime.tree.TerminalNode;
import utils.RecognizedKeywords;

import java.math.BigDecimal;
import java.util.List;

public class EvaluationCommand implements ICommand,ParseTreeListener {

    private ClypsParser.ExpressionContext expCtx;
    private String modifiedExp;
    private BigDecimal resultValue;

    public EvaluationCommand(ClypsParser.ExpressionContext exprCtx) {
        this.expCtx = exprCtx;
    }

    @Override
    public void execute() {
        this.modifiedExp = this.expCtx.getText();

        if(this.modifiedExp.contains(RecognizedKeywords.BOOLEAN_TRUE)) {
            this.resultValue = new BigDecimal(1);
        }
        else if(this.modifiedExp.contains(RecognizedKeywords.BOOLEAN_FALSE)) {
            this.resultValue = new BigDecimal(0);
        }
        else {
            ParseTreeWalker treeWalker = new ParseTreeWalker();
            treeWalker.walk(this, this.expCtx);

            Expression evalEx = new Expression(this.modifiedExp);
            this.resultValue = evalEx.eval();
        }
    }

    @Override
    public void visitTerminal(TerminalNode terminalNode) {

    }

    @Override
    public void visitErrorNode(ErrorNode errorNode) {

    }

    @Override
    public void enterEveryRule(ParserRuleContext parserRuleContext) {
        if (parserRuleContext instanceof ClypsParser.ExpressionContext) {
            ClypsParser.ExpressionContext exprCtx = (ClypsParser.ExpressionContext) parserRuleContext;
            if (EvaluationCommand.isFunctionCall(exprCtx)) {
                this.evaluateFunctionCall(exprCtx);
            }
            else if (EvaluationCommand.isVariableOrConst(exprCtx)) {
                this.evaluateVariable(exprCtx);
            }
        }
    }

    @Override
    public void exitEveryRule(ParserRuleContext parserRuleContext) {

    }

    public static boolean isFunctionCall(ClypsParser.ExpressionContext exprCtx) {
        //to access argument() = exprCtx.getRuleContext(ClypsParser.TypeArgumentContext.class);
        if (exprCtx.argument() != null) {
            return true;
        } else {
            return false;
        }
    }

    public static boolean isVariableOrConst(ClypsParser.ExpressionContext exprCtx) {
        //to access primary() = exprCtx.getRuleContext(ClypsParser.PrimaryContext.class, 0);
        if (exprCtx.primary() != null && exprCtx.primary().Identifier() != null) {
            return true;
        } else {
            return false;
        }
    }

    private void evaluateFunctionCall(ClypsParser.ExpressionContext exprCtx) {
        //to access expression() = exprCtx.getRuleContext(ClypsParser.ExpressionContext.class, 0);
        String functionName = exprCtx.expression(0).Identifier().getText();

        
        Scope scope = SymbolTableManager.getInstance().getClassScope(ParserHandler.getInstance().getCurrentClassName());
        ClypsFunction clypsFunction = scope.searchFunction(functionName);

        if (exprCtx.arguments().expressionList() != null) {
            List<ClypsParser.ExpressionContext> exprCtxList = exprCtx.arguments().expressionList().expression();

            for (int i = 0; i < exprCtxList.size(); i++) {
                ClypsParser.ExpressionContext parameterExprCtx = exprCtxList.get(i);

                EvaluationCommand evaluationCommand = new EvaluationCommand(parameterExprCtx);
                evaluationCommand.execute();

                clypsFunction.mapParameterByValueAt(evaluationCommand.getResult().toEngineeringString(), i);
            }
        }

        clypsFunction.execute();
       // System.out.println("EVALUATION COMMAND - Before modified EXP function call:" this.modifiedExp);
        this.modifiedExp = this.modifiedExp.replace(exprCtx.getText(), clypsFunction.getReturnValue().getValue().toString());
        // System.out.println("EVALUATION COMMAND - After modified EXP function call:" this.modifiedExp);
    }

    private void evaluateVariable(ClypsParser.ExpressionContext exprCtx) {
        ClypsValue mobiValue = VariableSearcher.searchVariable(exprCtx.getText());

        this.modifiedExp = this.modifiedExp.replaceFirst(exprCtx.getText(),
                mobiValue.getValue().toString());
    }

    public BigDecimal getResult() {
        return this.resultValue;
    }

}
