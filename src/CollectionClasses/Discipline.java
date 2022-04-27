package CollectionClasses;

import com.opencsv.bean.CsvBindByName;

import java.io.Serializable;

public class Discipline implements Serializable {
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
