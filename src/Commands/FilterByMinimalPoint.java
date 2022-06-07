package Commands;

import CollectionClasses.LabWork;

import java.util.HashSet;

public class FilterByMinimalPoint extends Command {
    public FilterByMinimalPoint() {
        super("filter_by_minimal_point", "вывести элементы, значение поля minimalPoint которых равно заданному");
    }

    public String execute(HashSet<LabWork> labWorks)
    {
        for (LabWork it : labWorks) {
            if (it.getMinimalPoint() == this.getArg()){
                return it.toString();
            }
        }
        return "В коллекции нет элементов, значение поля minimalPoint которых равно заданному";
    }
}
