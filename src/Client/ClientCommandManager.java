package Client;

import CollectionClasses.LabWork;
import Commands.*;

import static java.lang.System.exit;

public class ClientCommandManager {
    private final SendCommand sendCommand;

    //commands
    Help help;
    Info info = new Info();
    Show show = new Show();
    Add add = new Add();
    UpdateById updateById = new UpdateById();
    RemoveById removeById = new RemoveById();
    Clear clear = new Clear();
    ExecuteScript executeScript = new ExecuteScript();
    AddIfMin addIfMin = new AddIfMin();
    RemoveGreater removeGreater = new RemoveGreater();
    RemoveLower removeLower = new RemoveLower();
    SumOfMinimalPoint sumOfMinimalPoint = new SumOfMinimalPoint();
    FilterByMinimalPoint filterByMinimalPoint = new FilterByMinimalPoint();

    public ClientCommandManager(){
        sendCommand = new SendCommand();
        help = new Help();
    }

    public void processingCommand(String[] userCommand){
        switch (userCommand[0]){
            case "add":
                add.SetLabWork(InputLabWork.InputLabWork());
                break;
            case "add_if_min":
                addIfMin.SetLabWork(InputLabWork.InputLabWork());
                break;
            case "remove_by_id":
                try {
                    removeById.setArg(Long.parseLong(userCommand[1]));
                }
                catch (NumberFormatException ex){
                    System.out.println("Неверный формат id");
                }
                catch (IndexOutOfBoundsException ex){
                    System.out.println("Отсутствует id");
                }
                break;
            case "count_less_than_refundable":
                sumOfMinimalPoint.setArg(Long.parseLong(userCommand[1]));
                break;
            case "update":
                try {
                    long user_id = Long.parseLong(userCommand[1]);
                    updateById.SetLabWork(InputLabWork.InputLabWork());
                    updateById.setArg(user_id);
                }
                catch (NumberFormatException ex){
                    System.out.println("Неверное значение id");
                }
                break;
        }

        if(GetCommand(userCommand[0]) != null) {
            System.out.println("Отправка команды");
            sendCommand.sendingCommand(GetCommand(userCommand[0]));
        }
        else{
            System.out.println("Если не знаете комманд, то введите help.");
        }
    }

    private Command GetCommand(String command){
        Command clientCommand;

        switch (command) {
            case "help" :
                clientCommand = help;
                break;
            case "info" :
                clientCommand = info;
                break;
            case "show" :
                clientCommand = show;
                break;
            case "add" :
                LabWork labWork = InputLabWork.InputLabWork();
                add.SetLabWork(labWork);
                clientCommand = add;
                break;
            case "update" :
                clientCommand = updateById;
                break;
            case "remove_by_id" :
                clientCommand = removeById;
                break;
            case "clear" :
                clientCommand = clear;
                break;
            case "execute_script" :
                clientCommand = executeScript;
                break;
            case "exit" :
                System.out.println("Пока");
                exit(0);
            case "add_if_min" :
                clientCommand = addIfMin;
                break;
            case "remove_greater" :
                clientCommand = removeGreater;
                break;
            case "remove_lower" :
                clientCommand = removeLower;
                break;
            case "sum_of_minimal_point" :
                clientCommand = sumOfMinimalPoint;
                break;
            case "filter_by_minimal_point" :
                clientCommand = filterByMinimalPoint;
                break;
            default:
                return null;
        }
        return clientCommand;
    }
}
