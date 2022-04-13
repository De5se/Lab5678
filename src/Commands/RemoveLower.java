package Commands;

import CollectionClasses.Collection;
import CollectionClasses.LabWork;

public class RemoveLower extends AbstractCommand {

    public RemoveLower() {
        super("remove_by_id", "удалить из коллекции все элементы, меньшие, чем заданный");
    }

    LabWorkCmp labWorkCmp = new LabWorkCmp();

    public void execute()
    {
        LabWork labWork = InputLabWork.InputLabWork();

        Collection.hashSet.removeIf(it -> labWorkCmp.isMore(labWork, it));
        System.out.println("Операция завершена");
    }
}
