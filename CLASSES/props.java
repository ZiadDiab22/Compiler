package CLASSES;
import CLASSES.Expression;

public class props extends Expression {
    Expression className;
    Expression ID;


    public void setClassName(Expression className) {
        this.className = className;
    }

    public Expression getClassName() {
        return className;
    }

    public void setID(Expression ID) {
        this.ID = ID;
    }

    public Expression getID() {
        return ID;
    }
}
