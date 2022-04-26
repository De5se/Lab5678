package Commands;

import CollectionClasses.LabWork;

import java.util.HashSet;

public class Clear extends Command {
    public Clear() {
        super("clear", "очистить коллекцию");
    }

    public String execute(HashSet<LabWork> labWorks) {
        labWorks.clear();
        return  ("Коллекция очищена");
    }
}
