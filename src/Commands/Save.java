package Commands;

import CollectionClasses.LabWork;
import com.opencsv.CSVReader;
import com.opencsv.bean.CsvToBeanBuilder;
import com.opencsv.bean.StatefulBeanToCsvBuilder;
import com.opencsv.enums.CSVReaderNullFieldIndicator;
import com.opencsv.exceptions.CsvDataTypeMismatchException;
import com.opencsv.exceptions.CsvRequiredFieldEmptyException;
import jdk.nashorn.internal.runtime.regexp.joni.exception.ValueException;

import java.io.*;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class Save extends Command {
    public Save() {
        super("save", "сохранить коллекцию в файл");
    }

    private String fileName;

    public void setFileName(String fileName){
        this.fileName = fileName;
    }

    public HashSet<LabWork> importCollection() {
        HashSet<LabWork> labWorks = new HashSet<LabWork>();
        
        if (fileName == null){
            System.out.println("Путь к файлу не задан");
            return labWorks;
        }

        try (CSVReader csvReader = new CSVReader(new FileReader(fileName))) {
            List<LabWork> list = new CsvToBeanBuilder<LabWork>(csvReader).withType(LabWork.class).withFieldAsNull(CSVReaderNullFieldIndicator.EMPTY_SEPARATORS).build().parse();
            labWorks.addAll(list);
        } catch (IOException fileNotFoundException) {
            System.out.println("Файл не найден");
        }
            catch (ValueException e){
            System.out.println("Неверные значения в файле!");
        }
        return labWorks;
    }

    public void save(HashSet<LabWork> labWorks){
        if (fileName == null){
            System.out.println("Путь к файлу не задан");
        }

        ArrayList<LabWork> list = new ArrayList<LabWork>();
        list.addAll(labWorks);
        try (BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(fileName))) {
            new StatefulBeanToCsvBuilder<LabWork>(bufferedWriter).build().write(list);
        }
        catch (IOException e){System.out.println("Ошибка в файле");}
        catch (CsvDataTypeMismatchException | CsvRequiredFieldEmptyException e){System.out.println("Ошибка записи дыннх");}

    }
}
