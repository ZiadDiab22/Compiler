package CLASSES;
import CLASSES.Expression;

import java.util.ArrayList;
import java.util.List;

public class html_tag extends Expression{
    Expression tag;
   String name;
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

    public List<Expression> getProps() {
        return props;
    }

    public void setProps(List<Expression> props) {
        this.props = props;
    }

    @Override
    public String toString() {
        div d = new div();
        d.setName("div");
        if (tag !=null) {
            //d.getTag()
            return "tags = " + tag;
        }
        else return "tags = " + name;
    }


    public StringBuilder generateHtml(StringBuilder str) {
        str.append("<div");
        return str;
    }
}
