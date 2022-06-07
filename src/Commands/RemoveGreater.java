package Commands;

import CollectionClasses.LabWork;

import java.util.HashSet;

public class RemoveGreater extends Command {
    public RemoveGreater() {
        super("remove_greater", "удалить из коллекции все элементы, превышающие заданный");
    }

    LabWorkCmp labWorkCmp = new LabWorkCmp();

    public String execute(HashSet<LabWork> labWorks)
    {
        labWorks.removeIf(it -> labWorkCmp.isMore(it, this.getLabWork()));
        return "Операция завершена";
    }
}
