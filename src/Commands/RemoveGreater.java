package Commands;

import CollectionClasses.LabWork;

import java.util.HashSet;

public class RemoveGreater extends Command {
    private LabWork labWork;

    public RemoveGreater(LabWork labWork) {
        super("remove_by_id", "удалить из коллекции все элементы, превышающие заданный");
        this.labWork = labWork;
    }

    public RemoveGreater() {
        super("remove_by_id", "удалить из коллекции все элементы, превышающие заданный");
    }

    LabWorkCmp labWorkCmp = new LabWorkCmp();

    public String execute(HashSet<LabWork> labWorks)
    {
        LabWork labWork = InputLabWork.InputLabWork();

        labWorks.removeIf(it -> labWorkCmp.isMore(it, labWork));
        return "Операция завершена";
    }
}
