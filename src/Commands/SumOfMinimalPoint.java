package Commands;

import CollectionClasses.Collection;
import CollectionClasses.LabWork;

public class SumOfMinimalPoint extends AbstractCommand {

    public SumOfMinimalPoint() {
        super("show", "вывести в стандартный поток вывода все элементы коллекции в строковом представлении");
    }

    public void execute()
    {
        double sumOfMinimalPoint = 0;

        for (LabWork it : Collection.hashSet){
            sumOfMinimalPoint += it.GetMinimalPoint();
        }

        System.out.println(sumOfMinimalPoint);
    }
}
