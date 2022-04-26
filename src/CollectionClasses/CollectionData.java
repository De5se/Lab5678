package CollectionClasses;

import java.util.HashSet;

public class CollectionData {
     private HashSet<LabWork> labWorks;

    public CollectionData(HashSet<LabWork> tickets){
        this.labWorks = tickets;
    }
    public CollectionData(){}

    public HashSet<LabWork> getTickets() {
        return labWorks;
    }
}
