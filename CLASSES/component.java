package CLASSES;

import java.util.ArrayList;
import java.util.List;

public class component {
    String name;
    return_html returnHtml;
    function function;
    arrow_function arrow_function;
    List<log> logs = new ArrayList<log>();
    List<decl> decls = new ArrayList<decl>();

    public void setReturnHtml(return_html returnHtml) {
        this.returnHtml = returnHtml;
    }

    public return_html getReturnHtml() {
        return returnHtml;
    }

    public List<log> getLogs() {return logs;}
    public void setLogs(List<log> logs) {this.logs = logs;}

    public List<decl> getDecls() {return decls;}
    public void setDecls(List<decl> decls) {this.decls = decls;}

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
