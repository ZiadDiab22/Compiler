package CLASSES;
import CLASSES.Expression;

public class useRef extends Expression{
    String name;
    Expression var;

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setVar(Expression var) {
        this.var = var;
    }

    public Expression getVar() {
        return var;
    }

    @Override
    public String toString() {
        return  "name='" + var + '\'' +
                " , function = " + name + "\n";
    }
}
