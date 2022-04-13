package Commands;

import CollectionClasses.Collection;

import java.util.Date;

public class Info extends AbstractCommand {

    private Date initDate;

    public Info() {
        super("info", "вывести в стандартный поток вывода информацию о коллекции (тип, дата инициализации, количество элементов и т.д.)");

        initDate = new Date();
    }

    public void execute()
    {
        System.out.println("Тип коллекции:" + Collection.hashSet.getClass() +
                "\nДата инициализации: " + initDate +
                "\nКоличество элементов: " + Collection.hashSet.size());
    }
}
