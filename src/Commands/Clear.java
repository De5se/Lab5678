package Commands;

import CollectionClasses.Collection;

public class Clear extends AbstractCommand {
    public Clear() {
        super("clear", "очистить коллекцию");
    }

    public void execute() {
        Collection.hashSet.clear();
        System.out.println("Коллекция очищена");
    }
}
