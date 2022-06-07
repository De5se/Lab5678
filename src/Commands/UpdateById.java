package Commands;

import CollectionClasses.*;

import java.util.HashSet;

public class UpdateById extends Command {
    public UpdateById() {
        super("update", "обновить значение элемента коллекции, id которого равен заданному");
    }

    public String execute(HashSet<LabWork> labWorks)
    {
        for (LabWork it: labWorks){
            if (it.GetId() == getArg()){
                labWorks.remove(it);
                labWorks.add(getLabWork());
                return "Операция завершена";
            }
        }
        return  ("Элемента с таким id нет");
    }
}
