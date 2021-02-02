package commands;

import antlr.ClypsParser;
import controller.ClypsCustomVisitor;

import java.util.List;

public class DoWhileCommand extends WhileCommand {

    private ClypsParser.DoStatementContext expr;
    private boolean isGo;
    private String value;
    private List<ICommand> blockCommands;

    public DoWhileCommand(ClypsParser.WhileStatementContext ctx) {
       super(ctx);
    }

    private boolean evaluate() {
        List<Integer> dummy = null;
        boolean check = new Expression(ClypsCustomVisitor.testingExpression(this.expr.conditionalExpression().getText(),dummy,expr.start.getLine())).isBoolean();
        System.out.println("CHECK "+check);
        if (this.expr.conditionalExpression().getText().matches("true|false")){
            check=true;
        }
        if (check){
            String swi = new Expression(ClypsCustomVisitor.testingExpression(this.expr.conditionalExpression().getText(),dummy,expr.start.getLine())).eval().toPlainString();
            if (Integer.parseInt(swi)==1){
                System.out.println("IS TRUE");
                isGo=true;
            }else {
                System.out.println("IS FALSE");
                isGo=false;
            }

            if (isGo){
                return true;
            }else {
                return false;
            }
        }else {
            System.out.println("NOT BOOLEAN");
            return false;
        }
        //return false;
    }

    @Override
    public void execute() {
        do{
            for(ICommand command: blockCommands) {
                command.execute();
            }
        }while(evaluate());
    }

    @Override
    public IControlledCommand.ControlTypeEnum getControlType() {
        return IControlledCommand.ControlTypeEnum.DO_WHILE_CONTROL;
    }
}
