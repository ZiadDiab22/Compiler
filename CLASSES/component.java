package CLASSES;

import CLASSES.Expression;

import java.util.ArrayList;
import java.util.List;

public class component extends Expression{
    String name;
    return_html returnHtml;
    function function;
    arrow_function arrow_function;
    List<Expression> logs = new ArrayList<Expression>();
    List<Expression> decls = new ArrayList<Expression>();

    public void setReturnHtml(return_html returnHtml) {
        this.returnHtml = returnHtml;
    }

    public return_html getReturnHtml() {
        return returnHtml;
    }

    public List<Expression> getLogs() {return logs;}
    public void setLogs(List<Expression> logs) {this.logs = logs;}

    public List<Expression> getDecls() {return decls;}
    public void setDecls(List<Expression> decls) {this.decls = decls;}

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setFunction(CLASSES.function function) {
        this.function = function;
    }

    public CLASSES.function getFunction() {
        return function;
    }

    public void setArrow_function(CLASSES.arrow_function arrow_function) {
        this.arrow_function = arrow_function;
    }

    public CLASSES.arrow_function getArrow_function() {
        return arrow_function;
    }

    @Override
    public String toString() {
        if (arrow_function != null)
        return "name = " + arrow_function ;
        else return "name = " + function ;

    }
}
