package commands;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.StandardCharsets;
import java.util.*;
import java.util.logging.Level;
import java.util.logging.Logger;

import antlr.ClypsLexer;
import antlr.ClypsParser;
import controller.ClypsCustomListener;
import controller.ClypsCustomVisitor;
import controller.ClypseCustomErrorListener;
import controller.Main;
import execution.ExecutionManager;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.ErrorNode;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.ParseTreeListener;
import org.antlr.v4.runtime.tree.TerminalNode;

public class IFCommand implements ICommand{

    private List<ICommand> posCommands;
    private List<ICommand> negCommands;
    private ClypsParser.ExpressionContext condExp;

    private ArrayList<String> localVars = new ArrayList<>();
    private boolean returned;

    public IFCommand(ClypsParser.ExpressionContext condExp) {
        this.posCommands = new ArrayList<ICommand>();
        this.negCommands = new ArrayList<ICommand>();
        this.condExp = condExp;
    }

    @Override
    public void execute() {
        this.identifyVariables();

        //ExecutionMonitor Stuff

        try {
            if (ConditionEval.evaluateCondition(this.condExp)) {
                for (ICommand command : this.posCommands) {
                    //executionMonitor.tryExecution()
                    command.execute();

                    /*** To be implemented ***/
//                    LocalVarTracker.getInstance().populateLocalVars(command);
//
//                    if (command instanceof ReturnCommand) {
//                        returned = true;
//                        break;
//                    }
//
//                    if (ExecutionManager.getInstance().isAborted())
//                        break;
                }
            } else {
                for (ICommand command : this.negCommands) {
                    //executionMonitor.tryExecution()
                    command.execute();

                    /*** To be implemented ***/
//                    LocalVarTracker.getInstance().populateLocalVars(command);
//
//                    if (command instanceof ReturnCommand) {
//                        returned = true;
//                        break;
//                    }
//
//                    if (ExecutionManager.getInstance().isAborted())
//                        break;
                }
            }
            //to be changed to InterruptedException
        }catch(Exception exception){
            System.out.println("Oops... Something happened. " + exception.getMessage());

        }
    }

    public void clearCommands(){
        this.posCommands.clear();
        this.negCommands.clear();
    }

    public void addPositiveCommand(ICommand command){

        this.posCommands.add(command);

    }

    public void addNegativeCommand(ICommand command){

        this.negCommands.add(command);
    }

    private void identifyVariables(){
        //Value Stuff to be added
    }

    public boolean isReturned(){return returned;}

    public boolean condition(){
        if(ConditionEval.evaluateCondition(this.condExp))
            return true;
        else
            return false;
    }



}
