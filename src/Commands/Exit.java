package Commands;

import CollectionClasses.LabWork;

import java.util.HashSet;

public class Exit extends Command {
    public Exit() {
        super("exit", "завершить программу ");
    }

    public String execute(HashSet<LabWork> labWorks)  {
        return "Пока";
    }
}
