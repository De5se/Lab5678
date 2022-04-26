package Server;

import CollectionClasses.CollectionData;
import CollectionClasses.LabWork;
import Commands.Command;
import Commands.LabWorkCmp;

import java.time.LocalDate;
import java.util.Comparator;
import java.util.HashSet;

public class ServerCollectionManager {
    private LocalDate localDate;
    private HashSet<LabWork> labWorks;
    private CollectionData collectionData;
    private String env;

    public ServerCollectionManager(String env){
        this.env=env;
        labWorks = new HashSet<>();
        localDate = LocalDate.now();

        LabWorkCmp cmp = new LabWorkCmp();
        labWorks.stream().sorted((Comparator<? super LabWork>) cmp);

        collectionData =new CollectionData(labWorks);
    }
    public String  ExecuteCommand(Command command){
        return command.execute(labWorks);
    }

}
