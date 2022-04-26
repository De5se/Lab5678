package Client;

import CollectionClasses.LabWork;
import Commands.*;

public class ClientCommandManager {
    private final SendCommand sendCommand;

    //commands list for help
    Info info = new Info();
    Show show = new Show();
    Add add = new Add();
    UpdateById updateById = new UpdateById();
    RemoveById removeById = new RemoveById();
    Clear clear = new Clear();
    Save save = new Save();
    ExecuteScript executeScript = new ExecuteScript();
    Exit exit = new Exit();
    AddIfMin addIfMin = new AddIfMin();
    RemoveGreater removeGreater = new RemoveGreater();
    RemoveLower removeLower = new RemoveLower();
    SumOfMinimalPoint sumOfMinimalPoint = new SumOfMinimalPoint();
    FilterByMinimalPoint filterByMinimalPoint = new FilterByMinimalPoint();

    Command[] commands = new Command[]{info, show, add, updateById, removeById, clear, save, executeScript, exit,
            addIfMin, removeGreater, removeLower, sumOfMinimalPoint, filterByMinimalPoint};

    public ClientCommandManager(){
        sendCommand = new SendCommand();
    }


    public void SendCommand(String[] command){
        Command clientCommand;

        switch (command[0]) {
            case "help" :
                clientCommand = new Help(commands);
                break;
            case "info" :
                clientCommand = new Info();
                break;
            case "show" :
                clientCommand = new Show();
                break;
            case "add" :
                LabWork labWork = InputLabWork.InputLabWork();
                clientCommand = new Add(labWork);
                break;
            case "update" :
                clientCommand = new UpdateById();
                break;
            case "remove_by_id" :
                clientCommand = new RemoveById();
                break;
            case "clear" :
                clientCommand = new Clear();
                break;
            case "save" :
                clientCommand = new Save();
                break;
            case "execute_script" :
                clientCommand = new ExecuteScript();
                break;
            case "exit" :
                return;
            case "add_if_min" :
                clientCommand = new AddIfMin();
                break;
            case "remove_greater" :
                clientCommand = new RemoveGreater();
                break;
            case "remove_lower" :
                clientCommand = new RemoveLower();
                break;
            case "sum_of_minimal_point" :
                clientCommand = new SumOfMinimalPoint();
                break;
            case "filter_by_minimal_point" :
                clientCommand = new FilterByMinimalPoint();
                break;
            default :
                System.out.println("Если не знаете комманд, то введите help.");
                return;
        }
        sendCommand.Sender(clientCommand);
    }
}
