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
    private HashSet<LabWork> labWorks;

    public ServerCollectionManager(){
        labWorks = new HashSet<>();
    }

    public HashSet<LabWork> getLabWorks(){
        return labWorks;
    }
}
