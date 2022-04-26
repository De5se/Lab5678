package Commands;

import CollectionClasses.LabWork;

import java.util.HashSet;

public class RemoveLower extends Command {
    private LabWork labWork;

    public RemoveLower(LabWork labWork) {
        super("remove_by_id", "удалить из коллекции все элементы, меньшие, чем заданный");
        this.labWork = labWork;
    }

    public RemoveLower() {
        super("remove_by_id", "удалить из коллекции все элементы, меньшие, чем заданный");
    }

    LabWorkCmp labWorkCmp = new LabWorkCmp();


    public String execute(HashSet<LabWork> labWorks)
    {
        labWorks.removeIf(it -> labWorkCmp.isMore(labWork, it));
        return ("Операция завершена");
    }
}
