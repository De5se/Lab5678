package Server;

import CollectionClasses.CollectionData;
import CollectionClasses.LabWork;
import Commands.Command;
import Commands.LabWorkCmp;
import Commands.Save;

import java.time.LocalDate;
import java.util.Comparator;
import java.util.HashSet;

public class ServerCollectionManager {
    private LocalDate localDate;
    private HashSet<LabWork> labWorks;
    private String env;
    Save save = new Save();

    public ServerCollectionManager(String env){
        this.env=env;
        labWorks = new HashSet<>();
        localDate = LocalDate.now();
        save.importCollection();
    }
    public String  ExecuteCommand(Command command){
        return command.execute(labWorks);
    }

}
