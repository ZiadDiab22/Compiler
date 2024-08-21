package CLASSES;
import CLASSES.Expression;

import java.util.ArrayList;
import java.util.List;

public class p extends Expression{
    String name;
    Expression tag;
    List<Expression> javaScriptValue = new ArrayList<Expression>();
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

    public List<Expression> getJavaScriptValue() {
        return javaScriptValue;
    }

    public void setJavaScriptValue(List<Expression> javaScriptValue) {
        this.javaScriptValue = javaScriptValue;
    }

    public List<Expression> getProps() {
        return props;
    }

    public void setProps(List<Expression> props) {
        this.props = props;
    }

    @Override
    public String toString() {

        if (tag != null)
            return ""+tag;
        else return name;

    }

    public StringBuilder GenerateHtml(StringBuilder str){
        str.append("\n<p ");
        return str;
    }
}
