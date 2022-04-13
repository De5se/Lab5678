package Commands;

import CollectionClasses.Collection;
import CollectionClasses.LabWork;

import java.util.Scanner;

public class ExecuteScript extends AbstractCommand {

    public ExecuteScript() {
        super("execute_script", "считать и исполнить скрипт из указанного файла. В скрипте содержатся команды в таком же виде, в котором их вводит пользователь в интерактивном режиме");
    }

    Scanner scanner = new Scanner(System.in);

    public void execute()
    {
        String fileName = null;
        while (fileName == null){
            System.out.println("В коллекции нет элементов");
            fileName = scanner.nextLine();
        }
    }
}
