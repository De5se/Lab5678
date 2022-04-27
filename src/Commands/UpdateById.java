package Commands;

import CollectionClasses.*;

import java.util.HashSet;

public class UpdateById extends Command {
    private int id;
    private LabWork labWorkToAdd;

    public UpdateById(int id, LabWork labWorkToAdd) {
        super("update", "обновить значение элемента коллекции, id которого равен заданному");
        this.id = id;
        this.labWorkToAdd = labWorkToAdd;
    }

    public UpdateById() {
        super("update", "обновить значение элемента коллекции, id которого равен заданному");
    }

    public String execute(HashSet<LabWork> labWorks)
    {
        for (LabWork it: labWorks){
            if (it.GetId() == id){
                labWorks.remove(it);
                labWorks.add(labWorkToAdd);
                return "Операция завершена";
            }
        }
        return  ("Элемента с таким id нет");
    }
}
