package Commands;

import CollectionClasses.LabWork;

public class LabWorkCmp {
    public boolean isMore(LabWork a, LabWork b) {
        return a.GetMinimalPoint() > b.GetMinimalPoint();
    }
}
