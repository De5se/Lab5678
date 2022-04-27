package Commands;

import CollectionClasses.*;

import java.util.HashSet;
public class AddIfMin extends Command {
    private LabWork labWorkToAdd;

    public AddIfMin(LabWork labWorkToAdd) {
        super("add_if_min", "добавить новый элемент в коллекцию, если его значение меньше, чем у наименьшего элемента этой коллекции");
        this.labWorkToAdd = labWorkToAdd;
    }

    public AddIfMin(){
        super("add_if_min", "добавить новый элемент в коллекцию, если его значение меньше, чем у наименьшего элемента этой коллекции");
    }

    LabWorkCmp labWorkCmp = new LabWorkCmp();
    public String execute(HashSet<LabWork> labWorks){
        for (LabWork it : labWorks){
            if (labWorkCmp.isMore(labWorkToAdd, it)){
                return "Коллекция не добавлена";
            }
        }

        labWorks.add(labWorkToAdd);
        return "Коллекция добавлена";
    }
}
