package CLASSES;
import CLASSES.Expression;

public class useState extends Expression{
    Expression var;
    Expression fun ;

    public void setFun(Expression fun) {
        this.fun = fun;
    }

    public void setVar(Expression var) {
        this.var = var;
    }

    public Expression getFun() {
        return fun;
    }

    public Expression getVar() {
        return var;
    }

    @Override
    public String toString() {
        return "variable = " + var +
                "  function = " + fun;
    }

    public StringBuilder GenerateJS(StringBuilder Jstr , String s){
        String[] arr = s.trim().split(" ");
        if (arr.length > 6)
        Jstr.append("var " + arr[2] + " = " + arr[7].toString().substring(1, arr[7].toString().length() - 1)+ " ;\n\n");
        else Jstr.append("var " + arr[2] + " ;\n\n");

        Jstr.append("function " + arr[5].trim() + "(value){\n" + arr[2] + " = value ;\n}\n");
        return Jstr;
    }
}
