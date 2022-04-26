package Commands;

import CollectionClasses.LabWork;

import java.util.HashSet;

public class FilterByMinimalPoint extends Command {
    private  double targetMinimalPoint = -1;
    public FilterByMinimalPoint() {
        super("filter_by_minimal_point", "вывести элементы, значение поля minimalPoint которых равно заданному");
    }

    public FilterByMinimalPoint(double targetMinimalPoint) {
        super("filter_by_minimal_point", "вывести элементы, значение поля minimalPoint которых равно заданному");
        this.targetMinimalPoint = targetMinimalPoint;
    }

    public String execute(HashSet<LabWork> labWorks)
    {
        for (LabWork it : labWorks) {
            if (it.GetMinimalPoint() == targetMinimalPoint){
                return it.toString();
            }
        }
        return "В коллекции нет элементов, значение поля minimalPoint которых равно заданному";
    }
}
