package Commands;

import java.util.Objects;

abstract class AbstractCommand{
    private final String name;
    private final String description;


    public AbstractCommand(String name, String description){
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
        AbstractCommand that = (AbstractCommand) o;
        return name.equals(that.name) && description.equals(that.description);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, description);
    }
}
