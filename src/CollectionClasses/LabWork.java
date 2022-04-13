package CollectionClasses;

import java.util.Date;



public class LabWork {
    private int id; //Значение поля должно быть больше 0, Значение этого поля должно быть уникальным, Значение этого поля должно генерироваться автоматически
    private String name; //Поле не может быть null, Строка не может быть пустой
    private Coordinates coordinates; //Поле не может быть null
    private Date creationDate; //Поле не может быть null, Значение этого поля должно генерироваться автоматически
    private double minimalPoint; //Значение поля должно быть больше 0
    private Difficulty difficulty; //Поле может быть null
    private Discipline discipline; //Поле не может быть null

    public LabWork(String name, Coordinates coordinates, Date creationDate, double minimalPoint, Difficulty difficulty, Discipline discipline){
        this.id = ++Collection.id;
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

    public double GetMinimalPoint(){
        return minimalPoint;
    }

    public int GetId(){
        return id;
    }
}



