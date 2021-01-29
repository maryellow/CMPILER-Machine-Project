package execution;

import commands.ICommand;

import java.util.*;

public class ExecutionThread extends Thread{

    private ArrayList<ICommand> commandList = new ArrayList<>();
    private ExecutionMonitor execMon;

    public ExecutionThread(ArrayList<ICommand> commandList, ExecutionMonitor execMon){
        this.commandList = commandList;
        this.execMon = execMon;
    }

    @Override
    public void run() {
        try{
            for(ICommand command : this.commandList){
                this.execMon.tryExecution();
                command.execute();
            }
        }catch (InterruptedException e){
            System.out.println("Interrupted!");
        }
        //Baraco has notifications, idk if we need that.

    }
}
