package CLASSES;
import CLASSES.Expression;

import java.util.ArrayList;
import java.util.List;


public class div extends Expression{
    String name;
    Expression tag;
    List<Expression> props = new ArrayList<Expression>();


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

    public void setProps(List<Expression> props) {
        this.props = props;
    }

    public List<Expression> getProps() {
        return props;
    }

    @Override
    public String toString() {
        if (tag != null)
            return ""+tag;
        else return name;

    }
    public StringBuilder generateHtml(StringBuilder str) {
        str.append("<div");
        return str;
    }
}
