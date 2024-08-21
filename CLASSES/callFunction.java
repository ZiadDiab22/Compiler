package CLASSES;
import CLASSES.Expression;

public class callFunction extends Expression{
    public StringBuilder GenerateHtml(StringBuilder str ,String s){
        str.append(" onClick=\""+s+"\"");
        return str;

    }
}
