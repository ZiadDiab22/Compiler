package CLASSES;
import CLASSES.Expression;

public class useEffect extends Expression{
    String line;

    public void setLine(String line) {
        this.line = line;
    }

    public String getLine() {
        return line;
    }

    @Override
    public String toString() {
        return line ;
    }

    public StringBuilder GenerateJs(StringBuilder str , String s){
        str.append(s + "\n");
        return str;
    }
}
