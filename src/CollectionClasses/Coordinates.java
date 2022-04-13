package CollectionClasses;

import com.opencsv.bean.CsvBindByName;

public class Coordinates {
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
