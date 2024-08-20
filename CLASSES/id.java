package CLASSES;
import CLASSES.Expression;

public class id extends Expression{
    Expression JavaScriptValue;

    public Expression getJavaScriptValue() {
        return JavaScriptValue;
    }

    public void setJavaScriptValue(Expression javaScriptValue) {
        JavaScriptValue = javaScriptValue;
    }

    public StringBuilder GenerateHtml(StringBuilder str,String s){
        str.append(" id=\"");
        return str;
    }
}
