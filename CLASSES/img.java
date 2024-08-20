package CLASSES;
import CLASSES.Expression;

public class img extends Expression{
    String name;
    Expression src;

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setSrc(Expression src) {
        this.src = src;
    }

    public Expression getSrc() {
        return src;
    }

    @Override
    public String toString() {
        return name;
    }
}
