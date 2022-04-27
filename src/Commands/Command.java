package Commands;

import CollectionClasses.LabWork;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Objects;

public class Command implements Serializable {
    private final String name;
    private final String description;

    public Command(String name, String description){
        this.name = name;
        this.description = description;
    }

    @Override
    public String toString() {
        return "" + name + " - "+ description;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Command that = (Command) o;
        return name.equals(that.name) && description.equals(that.description);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, description);
    }

    public String execute(HashSet<LabWork> labWorks){
        return "";
    }
}
