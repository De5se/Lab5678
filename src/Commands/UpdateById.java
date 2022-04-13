package Commands;

import CollectionClasses.*;

import java.util.Date;
import java.util.Scanner;

public class UpdateById extends AbstractCommand {

    Scanner scanner = new Scanner(System.in);

    public UpdateById() {
        super("update", "обновить значение элемента коллекции, id которого равен заданному");
    }


    public void execute(Add add)
    {
        System.out.println("Введите id:");
        int id = scanner.nextInt();

        for (LabWork it: Collection.hashSet){
            if (it.GetId() == id){
                Collection.hashSet.remove(it);
                add.execute();
                return;
            }
        }
        System.out.println("Элемента с таким id нет");
    }
}
