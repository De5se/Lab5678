package CollectionClasses;

import com.opencsv.bean.CsvBindByName;

import java.io.Serializable;

public class Coordinates implements Serializable {
    @CsvBindByName
    private Long x; //Поле не может быть null
    @CsvBindByName
    private Integer y; //Поле не может быть null

    public Coordinates(Long x, Integer y){
        this.x = x;
        this.y = y;
    }

    public Coordinates(){

    }
}
