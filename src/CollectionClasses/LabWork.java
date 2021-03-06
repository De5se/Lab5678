package CollectionClasses;

import com.opencsv.bean.CsvBindByName;
import com.opencsv.bean.CsvDate;
import com.opencsv.bean.CsvRecurse;

import java.io.Serializable;
import java.util.Date;

public class LabWork implements Serializable {
    @CsvBindByName
    private int id; //Значение поля должно быть больше 0, Значение этого поля должно быть уникальным, Значение этого поля должно генерироваться автоматически
    @CsvBindByName
    private String name; //Поле не может быть null, Строка не может быть пустой
    @CsvRecurse
    private Coordinates coordinates; //Поле не может быть null
    @CsvDate
    private Date creationDate; //Поле не может быть null, Значение этого поля должно генерироваться автоматически
    @CsvBindByName
    private double minimalPoint; //Значение поля должно быть больше 0
    @CsvBindByName
    private Difficulty difficulty; //Поле может быть null
    @CsvRecurse
    private Discipline discipline; //Поле не может быть null

    public LabWork(int id, String name, Coordinates coordinates, Date creationDate, double minimalPoint, Difficulty difficulty, Discipline discipline){
        this.id = id;
        this.name = name;
        this.coordinates = coordinates;
        this. creationDate = creationDate;
        this.minimalPoint = minimalPoint;
        this.difficulty = difficulty;
        this.discipline = discipline;
    }

    @Override
    public String toString() {
        return "LabWork{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", coordinates=" + coordinates +
                ", creationDate=" + creationDate +
                ", minimalPoint=" + minimalPoint +
                ", difficulty=" + difficulty +
                ", discipline=" + discipline +
                '}';
    }

    public int GetId(){
        return id;
    }
    public String getName(){return name;}

    public Coordinates getCoordinates(){return coordinates;}

    public Date getCreationDate(){
        return creationDate;
    }

    public double getMinimalPoint(){
        return minimalPoint;
    }

    public Difficulty getDifficulty(){
        return difficulty;
    }

    public Discipline getDiscipline(){
        return discipline;
    }


    public LabWork(){

    }

}



