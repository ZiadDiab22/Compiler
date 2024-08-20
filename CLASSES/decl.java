package CLASSES;
import CLASSES.Expression;


public class decl extends Expression{
    String type;
    String variable;
    Expression value;

    public void setType(String type) {
        this.type = type;
    }

    public void setVariable(String variable) {
        this.variable = variable;
    }

    public String getType() {
        return type;
    }

    public String getVariable() {
        return variable;
    }

    public void setValue(Expression value) {
        this.value = value;
    }

    public Expression getValue() {
        return value;
    }

    @Override
    public String toString() {
        return " { type = " + type + ", variable name = " + variable + " }\n";
    }

    public StringBuilder GenerateJS (StringBuilder Jstr, String a , String b){
        Jstr.append(a + " "+ b + " ");
        return Jstr;
    }
}
