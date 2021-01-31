package commands;

import antlr.ClypsParser;
import com.udojava.evalex.Expression;
import controller.IControlledCommand;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class ForCommand implements IControlledCommand {
    private ClypsParser.ForStatementContext expr;
    private int counter = 0;
    private int stop=0;
    private String start;
    private String end;

    private List<ICommand> blockCommands;

    public ForCommand(ClypsParser.ForStatementContext ctx){
        this.expr=ctx;
        this.start=this.expr.forInit().variableDeclaratorList().variableDeclarator(0).variableInitializer().getText();
        this.end=this.expr.assignmentExpression().getText();
        blockCommands = new ArrayList<>();

        this.counter=Integer.parseInt(new Expression(this.start).eval().toPlainString());
        this.stop=Integer.parseInt(new Expression(this.end).eval().toPlainString());
    }

    private boolean evaluate(){
//        System.out.println("FOR EVAL");
//        System.out.println(this.counter);
//        System.out.println(this.stop);
        //boolean result = new Expression(this.start).isBoolean();
        //System.out.println(result);
        // 1 5
        //if (result){
            if (this.counter!=this.stop){
               //System.out.println("Cond True");
                return true;
            }else {
                //System.out.println("Cond False");
                return false;
            }
        //}

    }

    @Override
    public void execute() {
        //System.out.println("EXECUTING FOR COMMAND");
        while (evaluate()){
            //System.out.println("LOOP: "+this.counter);
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

    @Override
    public ControlTypeEnum getControlType() {
        return ControlTypeEnum.FOR_CONTROL;
    }

    public void addCommand(ICommand command) {
        this.blockCommands.add(command);
    }

    public int getCommandCount() {
        return this.blockCommands.size();
    }
}
