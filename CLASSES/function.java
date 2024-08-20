package CLASSES;

import CLASSES.Expression;

public class function extends Expression {
    String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return  name;
    }

//    public StringBuilder GenerateHtml(StringBuilder str,String name){
//        str.append("  "+name+"(){\n");
//        return str;
//    }
}

