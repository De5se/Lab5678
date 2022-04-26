package Commands;

import CollectionClasses.LabWork;

import java.util.Date;
import java.util.HashSet;

public class Info extends Command {

    private Date initDate;

    public Info() {
        super("info", "вывести в стандартный поток вывода информацию о коллекции (тип, дата инициализации, количество элементов и т.д.)");

        initDate = new Date();
    }

    public String execute(HashSet<LabWork> labWorks)
    {
        return  ("Тип коллекции:" + labWorks.getClass() +
                "\nДата инициализации: " + initDate +
                "\nКоличество элементов: " + labWorks.size());
    }
}
