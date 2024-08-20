package CLASSES;
import CLASSES.Expression;

public class imp extends Expression{
    String name;
    Expression link;

    public void setName(String name) {
        this.name = name;
    }

    public void setLink(Expression link) {
        this.link = link;
    }

    public String getName() {
        return name;
    }

    public Expression getLink() {
        return link;
    }

    @Override
    public String toString() {
        return "{ imported ='" + name + '\'' +
                ", path = " + link +
                "}\n";
    }

    public StringBuilder GenerateHtml(StringBuilder str){
        //str.append("yy");
        return str;
    }
}
