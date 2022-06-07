package Commands;

import CollectionClasses.*;

import java.util.HashSet;
public class AddIfMin extends Command {
    public AddIfMin(){
        super("add_if_min", "добавить новый элемент в коллекцию, если его значение меньше, чем у наименьшего элемента этой коллекции");
    }

    LabWorkCmp labWorkCmp = new LabWorkCmp();
    public String execute(HashSet<LabWork> labWorks){
        for (LabWork it : labWorks){
            if (labWorkCmp.isMore(this.getLabWork(), it)){
                return "Коллекция не добавлена";
            }
        }

        labWorks.add(this.getLabWork());
        return "Коллекция добавлена";
    }
}
