package Client;

import CollectionClasses.LabWork;
import Commands.*;

import java.util.Scanner;

import static java.lang.System.exit;

public class ClientCommandManager {
    private final SendCommand sendCommand;

    //commands list for help
    Info info = new Info();
    Show show = new Show();
    Add add = new Add();
    UpdateById updateById = new UpdateById();
    RemoveById removeById = new RemoveById();
    Clear clear = new Clear();
    ExecuteScript executeScript = new ExecuteScript();
    Exit exit = new Exit();
    AddIfMin addIfMin = new AddIfMin();
    RemoveGreater removeGreater = new RemoveGreater();
    RemoveLower removeLower = new RemoveLower();
    SumOfMinimalPoint sumOfMinimalPoint = new SumOfMinimalPoint();
    FilterByMinimalPoint filterByMinimalPoint = new FilterByMinimalPoint();

    Command[] commands = new Command[]{info, show, add, updateById, removeById, clear, executeScript, exit,
            addIfMin, removeGreater, removeLower, sumOfMinimalPoint, filterByMinimalPoint};

    public ClientCommandManager(){
        sendCommand = new SendCommand();
    }

    Scanner scanner = new Scanner(System.in);

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
                System.out.println("Введите id: ");
                int id = scanner.nextInt();
                LabWork labWork1 = InputLabWork.InputLabWork();
                clientCommand = new UpdateById(id, labWork1);
                break;
            case "remove_by_id" :
                System.out.println("Введите id: ");
                int id1 = scanner.nextInt();
                clientCommand = new RemoveById(id1);
                break;
            case "clear" :
                clientCommand = new Clear();
                break;
            case "execute_script" :
                clientCommand = new ExecuteScript();
                break;
            case "exit" :
                System.out.println("Пока");
                exit(0);
            case "add_if_min" :
                LabWork labWork2 = InputLabWork.InputLabWork();
                clientCommand = new AddIfMin(labWork2);
                break;
            case "remove_greater" :
                LabWork labWork3 = InputLabWork.InputLabWork();
                clientCommand = new RemoveGreater(labWork3);
                break;
            case "remove_lower" :
                LabWork labWork4 = InputLabWork.InputLabWork();
                clientCommand = new RemoveLower(labWork4);
                break;
            case "sum_of_minimal_point" :
                clientCommand = new SumOfMinimalPoint();
                break;
            case "filter_by_minimal_point" :
                System.out.println("Введите minimal Point: ");
                double minimalPoint = scanner.nextDouble();
                clientCommand = new FilterByMinimalPoint(minimalPoint);
                break;
            default :
                System.out.println("Если не знаете комманд, то введите help.");
                return;
        }
        sendCommand.Sender(clientCommand);
    }
}
