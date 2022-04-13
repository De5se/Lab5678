package Commands;

import CollectionClasses.Collection;
import CollectionClasses.LabWork;

public class RemoveGreater extends AbstractCommand {

    public RemoveGreater() {
        super("remove_by_id", "удалить из коллекции все элементы, превышающие заданный");
    }

    LabWorkCmp labWorkCmp = new LabWorkCmp();


    public void execute()
    {
        LabWork labWork = InputLabWork.InputLabWork();

        Collection.hashSet.removeIf(it -> labWorkCmp.isMore(it, labWork));
        System.out.println("Операция завершена");
    }
}
