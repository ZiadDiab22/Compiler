package CLASSES;
import CLASSES.Expression;

public class props extends Expression {
    Expression className;
    Expression ID;
    Expression OnClick;


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

    public Expression getOnClick() {
        return OnClick;
    }

    public void setOnClick(Expression onClick) {
        OnClick = onClick;
    }
}
