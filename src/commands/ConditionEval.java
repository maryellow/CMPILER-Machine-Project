package commands;

import antlr.ClypsParser;
import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.tree.ErrorNode;
import org.antlr.v4.runtime.tree.ParseTreeListener;
import org.antlr.v4.runtime.tree.ParseTreeWalker;
import org.antlr.v4.runtime.tree.TerminalNode;

import java.beans.Expression;
import java.math.BigDecimal;

public class ConditionEval implements ICommand, ParseTreeListener {

    private ClypsParser.ExpressionContext expression;
    private String newExp;
    private BigDecimal resultVal;
    private String result = "";

    private boolean isNumber;
    private boolean hasException = false;

    public ConditionEval(ClypsParser.ExpressionContext expressionCtx){
        this.expression  = expressionCtx;
    }


    @Override
    public void execute() {
        this.newExp = this.expression.getText();

        ParseTreeWalker treeWalker = new ParseTreeWalker();
        treeWalker.walk(this, this.expression);

        isNumber = !this.result.contains("\"") && this.result.contains("\'");

        if(!isNumber){
            if(this.result.contains("==") || this.result.contains("!=")){

                String[] strings = {"", ""};

                if(this.result.contains("=="))
                    strings = this.result.split("==");
                if(this.result.contains("!="))
                    strings = this.result.split("!=");


                String equality = "STREQ("+strings[0]+", " + strings[1] + ")";

                if(this.result.contains("!="))
                    equality = "not(" + equality + ")";
            }
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
        if(parserRuleContext instanceof ClypsParser.ExpressionContext){
        }

    }

    @Override
    public void exitEveryRule(ParserRuleContext parserRuleContext) {

    }
}
