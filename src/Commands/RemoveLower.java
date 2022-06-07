package Commands;

import CollectionClasses.LabWork;

import java.util.HashSet;

public class RemoveLower extends Command {
    public RemoveLower() {
        super("remove_lower", "удалить из коллекции все элементы, меньшие, чем заданный");
    }

    LabWorkCmp labWorkCmp = new LabWorkCmp();


    public String execute(HashSet<LabWork> labWorks)
    {
        labWorks.removeIf(it -> labWorkCmp.isMore(this.getLabWork(), it));
        return ("Операция завершена");
    }
}
