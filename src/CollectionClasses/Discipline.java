package CollectionClasses;

import com.opencsv.bean.CsvBindByName;

public class Discipline {
    @CsvBindByName
    private String name; //Поле не может быть null, Строка не может быть пустой
    @CsvBindByName
    private int lectureHours;

    public Discipline(String name, int lectureHours){
        this.name = name;
        this.lectureHours = lectureHours;
    }
    public Discipline(){

    }
}
