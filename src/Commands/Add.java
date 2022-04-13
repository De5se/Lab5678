package Commands;

import CollectionClasses.*;

import java.util.Scanner;
import java.util.Date;

public class Add extends AbstractCommand {

    Scanner scanner = new Scanner(System.in);

    public Add() {
        super("add", "добавить новый элемент в коллекцию");
    }


    public void execute()
    {
        LabWork labWork = InputLabWork.InputLabWork();

        Collection.hashSet.add(labWork);


        System.out.println("Коллекция добавлена");
    }
}
