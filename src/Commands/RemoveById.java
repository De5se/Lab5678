package Commands;

import CollectionClasses.Collection;
import CollectionClasses.LabWork;

import java.util.Scanner;

public class RemoveById extends AbstractCommand {

    public RemoveById() {
        super("remove_by_id", "удалить элемент из коллекции по его id");
    }

    public void execute()
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите id:");
        int id = scanner.nextInt();

        for (LabWork it: Collection.hashSet){
            if (it.GetId() == id){
                Collection.hashSet.remove(it);
                System.out.println("Элемент удален");
                return;
            }
        }

        System.out.println("Элемента с таким id нет");
    }
}
