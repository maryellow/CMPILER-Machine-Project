package commands;

import antlr.ClypsParser;
import com.udojava.evalex.Expression;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class ForCommand implements ICommand{
    private ClypsParser.ForStatementContext expr;
    private int counter = 0;
    private String conditionExpr;

    private List<ICommand> blockCommands = new ArrayList<>();

    public ForCommand(ClypsParser.ForStatementContext ctx){
        this.expr=ctx;
        //this.counter=;
        //this.conditionExpr = ;
        for (int i =0;i<ctx.block().getChildCount();i++){
            if (ctx.block().blockStatements().blockStatement(3).statement().printStatement() != null){
                //PrintCommand printCommand = n
                //this.addCommand();
            }
        }
    }

    private boolean evaluate(){
        boolean result = new Expression(this.conditionExpr).isBoolean();
        String send;
        if (result){
            send = new Expression(conditionExpr).eval().toPlainString();
            if (Integer.parseInt(send)==1){
                return true;
            }else {
                return false;
            }
        }

        return false;
    }

    @Override
    public void execute() {
        while (evaluate()){
            for(ICommand command:blockCommands){
                command.execute();
            }

            if (this.expr.forMiddle().getText().contains("up to")){
                this.counter++;
            }else if (this.expr.forMiddle().getText().contains("down to")){
                this.counter--;
            }
        }
    }

    public void addCommand(ICommand command) {
        this.blockCommands.add(command);
    }

    public int getCommandCount() {
        return this.blockCommands.size();
    }
}
