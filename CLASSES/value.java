package CLASSES;
import CLASSES.Expression;

public class value extends Expression{
    String name;

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return name;
    }

    public StringBuilder GenerateJS(StringBuilder Jstr , String s){
        Jstr.append(" = " + s + " ;\n");
       return Jstr;
    }
}
