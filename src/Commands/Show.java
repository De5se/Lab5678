package Commands;

import CollectionClasses.Collection;
import CollectionClasses.LabWork;

public class Show extends AbstractCommand {

    public Show() {
        super("show", "вывести в стандартный поток вывода все элементы коллекции в строковом представлении");
    }

    public void execute()
    {
        if (Collection.hashSet.size() == 0){
            System.out.println("В коллекции нет элементов");
            return;
        }

        for (LabWork it : Collection.hashSet){
            System.out.println(it.toString());
        }
    }
}
