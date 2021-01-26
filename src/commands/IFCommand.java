package commands;

import java.util.*;

import antlr.ClypsParser;
import org.antlr.v4.runtime.Parser;

public class IFCommand implements ICommand{

    private List<ICommand> posCommands;
    private List<ICommand> negCommands;
    private ClypsParser.IfThenStatementContext condExp;

    private ArrayList<String> localVars = new ArrayList<>();

    public IFCommand(ClypsParser.IfThenStatementContext condExp) {
        this.posCommands = new ArrayList<ICommand>();
        this.negCommands = new ArrayList<ICommand>();
        this.condExp = condExp;
    }

    @Override
    public void execute() {

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
}
