package Commands;

import CollectionClasses.*;

import java.util.Date;
import java.util.Scanner;

public class InputLabWork{

    static Scanner scanner = new Scanner(System.in);

    public static  LabWork InputLabWork()
    {
        String name = null;
        System.out.println("Введите имя: ");
        while (name == null || name.length() < 3){
            name = scanner.nextLine();
            if (name.length() < 3){
                System.out.println("имя должно иметь больше 2 символов");
            }
        }
        System.out.println("Введите координаты x и y: ");

        Long x = null;


        while (x == null) {
            try {
                x = scanner.nextLong();
            } catch (Exception exception) {
                System.out.println("Некорректные данные");
                scanner.nextLine();
            }
        }
        Integer y = null;
        while (y == null) {
            try {
                    y = scanner.nextInt();
            } catch (Exception exception) {
                System.out.println("Некорректные данные");
                scanner.nextLine();
            }
        }

        Coordinates coordinates = new Coordinates(x, y);

        Date date = new Date();

        System.out.println("Введите minimal point: ");
        double minimalPoint = -1;

        while (minimalPoint < 0 ) {
            try {
                minimalPoint = scanner.nextDouble();
            } catch (Exception exception) {
                System.out.println("Некорректные данные");
                scanner.nextLine();
            }
        }

        System.out.println("Вы можете пропустить выбор сложности(нажмите enter) или написать один из вариантов:\nVERY_EASY\nEASY\nINSANE\n");
        Difficulty difficulty =null;
        scanner.nextLine();
        String diff = scanner.nextLine();

        if (diff != "\n") {
            try {
                difficulty = Difficulty.valueOf(diff.toUpperCase());
            } catch (IllegalArgumentException e) {
                System.out.println("Некорректные данные, Difficulty равна null");
            }
        }

        String disciplineName = null;
        while (disciplineName == null || disciplineName.equals("\n")){
            System.out.println("Введите название дисциплины: ");
            disciplineName = scanner.nextLine();
        }

        System.out.println("Введите количество часов: ");
        Integer lectureHours = null;
        while (lectureHours == null){
            try {
                lectureHours = scanner.nextInt();
            } catch (Exception exception) {
                System.out.println("Некорректные данные");
                scanner.nextLine();
            }
        }

        Discipline discipline = new Discipline(disciplineName, lectureHours);

        return new LabWork(name, coordinates, date, minimalPoint, difficulty, discipline);

    }
}
