package Commands;

import CollectionClasses.LabWork;

import java.io.Serializable;

public class LabWorkCmp implements Serializable {
    public boolean isMore(LabWork a, LabWork b) {
        return a.getMinimalPoint() > b.getMinimalPoint();
    }
}
