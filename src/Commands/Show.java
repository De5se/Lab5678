package Commands;

import CollectionClasses.LabWork;

import java.util.HashSet;

public class Show extends Command {

    public Show() {
        super("show", "вывести в стандартный поток вывода все элементы коллекции в строковом представлении");
    }

    public String execute(HashSet<LabWork> labWorks)
    {
        if (labWorks.size() == 0){
            return "В коллекции нет элементов";
        }

        StringBuilder answer = new StringBuilder();
        for (LabWork it : labWorks){
            answer.append(it.toString());
        }

        return answer.toString();
    }
}
