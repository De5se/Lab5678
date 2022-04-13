package Commands;

import CollectionClasses.*;

import java.util.Scanner;

public class AddIfMin extends AbstractCommand {

    Scanner scanner = new Scanner(System.in);

    public AddIfMin() {
        super("add_if_min", "добавить новый элемент в коллекцию, если его значение меньше, чем у наименьшего элемента этой коллекции");
    }
    LabWorkCmp labWorkCmp = new LabWorkCmp();

    public void execute()
    {
        LabWork labWork = InputLabWork.InputLabWork();

        for (LabWork it : Collection.hashSet){
            if (labWorkCmp.isMore(labWork, it)){
                System.out.println("Элемент не добавлен");
                return;
            }
        }
    }
}
