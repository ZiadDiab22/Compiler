package CLASSES;
import CLASSES.Expression;

public class className extends Expression{
    public StringBuilder GenerateHtml(StringBuilder str,String name){
     str.append(" className = "+name);
     return str;
    }
}
