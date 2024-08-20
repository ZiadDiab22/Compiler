package CLASSES;
import  CLASSES.Expression;

public class JavaScriptValue extends Expression{
    public StringBuilder GenerateHtml(StringBuilder str , String s){
        str.append(s);
        return str;

    }
}
