package execution;

import commands.ICommand;

import javax.management.Notification;
import javax.management.NotificationListener;
import java.util.ArrayList;

public class ExecutionManager implements NotificationListener {

    private static ExecutionManager sharedInstance = null;
    public static ExecutionManager getInstance(){return sharedInstance;}

    private ArrayList<ICommand> commandList = new ArrayList<>();
    private boolean foundEntry = false;
    private String entryClassName = null;



    @Override
    public void handleNotification(Notification notification, Object handback) {

    }
}
