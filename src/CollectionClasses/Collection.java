package CollectionClasses;

import Commands.LabWorkCmp;

import java.util.Comparator;
import java.util.HashSet;
import java.util.function.Predicate;

public class Collection {
    public static HashSet<LabWork> hashSet = new HashSet<LabWork>();
    public static int id;

    public static void sortCollection(){
        LabWorkCmp cmp = new LabWorkCmp();
        hashSet.stream().sorted((Comparator<? super LabWork>) cmp);
    }
}

