package CLASSES;
import CLASSES.Expression;

public class h1 extends Expression{
    String name;
    Expression tag;

    public void setTag(Expression tag) {
        this.tag = tag;
    }

    public Expression getTag() {
        return tag;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        if (tag != null)
            return ""+tag;
        else return name;
    }
}
