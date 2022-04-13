package CollectionClasses;

public class Discipline {
    private String name; //Поле не может быть null, Строка не может быть пустой
    private int lectureHours;

    public Discipline(String name, int lectureHours){
        this.name = name;
        this.lectureHours = lectureHours;
    }
}
