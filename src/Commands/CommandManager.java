package Commands;

import java.io.IOException;
import java.util.Scanner;

public class CommandManager {

    //commands initialazing
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

    //commands list for help
    AbstractCommand[] commands = new AbstractCommand[]{info, show, add, updateById, removeById, clear, save, executeScript, exit,
            addIfMin, removeGreater, removeLower, sumOfMinimalPoint, filterByMinimalPoint};

    Help help = new Help(commands);

    public void startProggram(String fileName) {
        save.setFileName(fileName);
        save.importCollection();

        Scanner scanner = new Scanner(System.in);

        while (true){
            String commandType = scanner.nextLine();

            switch (commandType) {
                case "help":
                    help.execute();
                    break;
                case "info" :
                    info.execute();
                    break;
                case "show" :
                    show.execute();
                    break;
                case "add" :
                    add.execute();
                    break;
                case "update" :
                    updateById.execute(add);
                    break;
                case "remove_by_id" :
                    removeById.execute();
                    break;
                case "clear" :
                    clear.execute();
                    break;
                case "save" :
                    save.execute();
                    break;
                case "execute_script" :
                    executeScript.execute();
                    break;
                case "exit" :
                    exit.execute();
                    break;
                case "add_if_min" :
                    addIfMin.execute();
                    break;
                case "remove_greater" :
                    removeGreater.execute();
                    break;
                case "remove_lower" :
                    removeLower.execute();
                    break;
                case "sum_of_minimal_point" :
                    sumOfMinimalPoint.execute();
                    break;
                case "filter_by_minimal_point" :
                    filterByMinimalPoint.execute();
                    break;
                default :
                    System.out.println("Если не знаете комманд, то введите help.");
                    break;
            }
        }

    }





}
