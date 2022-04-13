package Commands;

import CollectionClasses.Collection;
import CollectionClasses.LabWork;

import java.util.Scanner;

public class FilterByMinimalPoint extends AbstractCommand {

    public FilterByMinimalPoint() {
        super("filter_by_minimal_point", "вывести элементы, значение поля minimalPoint которых равно заданному");
    }

    Scanner scanner = new Scanner(System.in);

    public void execute()
    {
        System.out.println("Введите minimal point: ");
        double targetMinimalPoint = -1;
        while (targetMinimalPoint < 0 ) {
            try {
                targetMinimalPoint = scanner.nextDouble();
            } catch (Exception exception) {
                System.out.println("Некорректные данные");
                scanner.nextLine();
            }
        }

        int amountOfelements = 0;

        for (LabWork it : Collection.hashSet) {
            if (it.GetMinimalPoint() == targetMinimalPoint){
                amountOfelements++;
                System.out.println(it.toString());
            }
        }
        if (amountOfelements == 0){
            System.out.println("В коллекции нет элементов, значение поля minimalPoint которых равно заданному");
         }
    }
}
