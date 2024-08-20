package CLASSES;
import CLASSES.Expression;

public class Fun extends Expression{
    String name;

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return name + "\n";
    }
}
