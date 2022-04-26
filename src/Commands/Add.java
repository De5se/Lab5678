package Commands;

import CollectionClasses.*;

import java.util.HashSet;

public class Add extends Command {
    private LabWork labWorkToAdd;

    public Add(LabWork labWorkToAdd) {
        super("add", "добавить новый элемент в коллекцию");
        this.labWorkToAdd = labWorkToAdd;
    }
    public Add(){
        super("add", "добавить новый элемент в коллекцию");
    }

    public String execute(HashSet<LabWork> labWorks)
    {
        labWorks.add(labWorkToAdd);
        return "Коллекция добавлена";
    }
}
