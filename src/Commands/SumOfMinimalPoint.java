package Commands;

import CollectionClasses.LabWork;

import java.util.HashSet;

public class SumOfMinimalPoint extends Command {

    public SumOfMinimalPoint() {
        super("show", "вывести в стандартный поток вывода все элементы коллекции в строковом представлении");
    }

    public String execute(HashSet<LabWork> labWorks)
    {
        double sumOfMinimalPoint = 0;

        for (LabWork it : labWorks){
            sumOfMinimalPoint += it.getMinimalPoint();
        }

        return String.valueOf(sumOfMinimalPoint);
    }
}
