package commands;

import antlr.ClypsParser;
import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.tree.ErrorNode;
import org.antlr.v4.runtime.tree.ParseTreeListener;
import org.antlr.v4.runtime.tree.ParseTreeWalker;
import org.antlr.v4.runtime.tree.TerminalNode;

public class PrintCommand implements ICommand, ParseTreeListener {

    private ClypsParser.PrintStatementContext expCtx;
    private String printStatement = "";
    private boolean evalExp = false;

    public PrintCommand(ClypsParser.PrintStatementContext stateCtx){

        this.expCtx = stateCtx;

        //To be checked
//        UndeclaredChecker undeclaredChecker = new UndeclaredChecker(expCtx);
//        undeclaredChecker.verify();

        //printStatement = "";
    }

    @Override
    public void execute() {

        //ParseTreeWalker treeWalk = new ParseTreeWalker();
        //treeWalk.walk(this, this.expCtx);

       // printStatement += "\n";
        System.out.println("PRINTING COMMAND");
        System.out.println(expCtx.printBlock().getText());

        //System.out.println(this.printStatement);

       // printStatement = "";
        //evalExp = false;

    }

    @Override
    public void visitTerminal(TerminalNode terminalNode) {

    }

    @Override
    public void visitErrorNode(ErrorNode errorNode) {

    }

    @Override
    public void enterEveryRule(ParserRuleContext parserRuleContext) {

        if(parserRuleContext instanceof ClypsParser.ConditionalExpressionContext && !evalExp){
            ClypsParser.ConditionalExpressionContext eCtx = (ClypsParser.ConditionalExpressionContext) parserRuleContext;

            CommEval evCom = new CommEval(eCtx);
            evCom.execute();

            if(evCom.isNumberResult())
                printStatement += evCom.getResult().toEngineeringString();
            else
                printStatement += evCom.getStringResult();

            evalExp = true;
        }

    }

    @Override
    public void exitEveryRule(ParserRuleContext parserRuleContext) {

    }
    public String getPrintStatement(){return this.printStatement;}
}
