package Commands;

import CollectionClasses.LabWork;

import java.util.HashSet;

public class RemoveById extends Command {
    public RemoveById() {
        super("remove_by_id", "удалить элемент из коллекции по его id");
    }

    public String execute(HashSet<LabWork> labWorks)
    {
        for (LabWork it: labWorks){
            if (it.GetId() == getArg()){
                labWorks.remove(it);
                return  "Элемент удален";
            }
        }
        return  "Элемента с таким id нет";
    }
}
