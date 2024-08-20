package CLASSES;
import CLASSES.Expression;

public class src extends Expression{
    public StringBuilder GenerateHtml(StringBuilder str , String s){
        str.append("<img src="+s+" />\n");
        return str;

    }
}
