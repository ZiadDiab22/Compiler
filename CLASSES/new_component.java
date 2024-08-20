package CLASSES;

import java.util.ArrayList;
import java.util.List;
import CLASSES.*;

public class new_component {
    List<Expression> useStates = new ArrayList<Expression>();
    List<Expression> components = new ArrayList<Expression>();
    List<Expression> useEffect = new ArrayList<Expression>();
    List<Expression> useRef = new ArrayList<Expression>();
    Expression returnHtml;
    List<Expression> decls = new ArrayList<Expression>();
    List<Expression> assigns = new ArrayList<Expression>();
    List<Expression> logs = new ArrayList<Expression>();
    List<Expression> imps = new ArrayList<Expression>();
    Expression export;
    Expression function;
    Expression arrow_function;


    public List<Expression> getUseStates() {
        return useStates;
    }
    public void setUseStates(List<Expression> useStates) {
        this.useStates = useStates;
    }

    public List<Expression> getComponents() {
        return components;
    }
    public void setComponents(List<Expression> components) {
        this.components = components;
    }


    public List<Expression> getDecls() {return decls;}
    public void setDecls(List<Expression> decls) {this.decls = decls;}

    public List<Expression> getComLogs() {return logs;}
    public void setComLogs(List<Expression> logs) {this.logs = logs;}

    public List<Expression> getImps() {return imps;}
    public void setImps(List<Expression> imps) {this.imps = imps;}

    public List<Expression> getAssigns() {return assigns;}
    public void setAssigns(List<Expression> assigns) {this.assigns = assigns;}

    public Expression getExport() {return export;}
    public void setExport(Expression export) {this.export = export;}

    public void setArrow_function(Expression arrow_function) {this.arrow_function = arrow_function;}
    public Expression getArrow_function() {return arrow_function;}

    public void setFunction(Expression function) {this.function = function;}
    public Expression getFunction() {return function;}

    public void setUseEffect(List<Expression> useEffect) {this.useEffect = useEffect;}
    public void setUseRef(List<Expression> useRef) {this.useRef = useRef;}

    public List<Expression> getUseEffect() {return useEffect;}
    public List<Expression> getUseRef() {return useRef;}

    public void setReturnHtml(Expression returnHtml) {this.returnHtml = returnHtml;}
    public Expression getReturnHtml() {return returnHtml;}

    @Override
    public String toString() {
        System.out.println("\n\n*************************\n******** AST Tree ******* \n*************************\n");
        if (arrow_function !=null )return "\nmain component  \n{" +
                "\nmain component name : " + arrow_function +
                "\nimports = \n" + imps +
                "\nuseStates = \n" + useStates +
                "\nuseRefs = \n" + useRef +
                "\nuseEffects Lines = \n" + useEffect +
                "\nvariables = \n" + decls +
                "\nexport = " + export +
                "\n}";
        else return "\nmain component  \n{" +
                "\nmain component name : " + function +
                "\nimports = \n" + imps +
                "\ncomponent = \n" + components +
                "\nuseStates = \n" + useStates +
                "\nuseRefs = \n" + useRef +
                "\nuseEffects Lines = \n" + useEffect +
                "\nvariables = \n" + decls +
                "\nexport = " + export +
                "\n}";
    }

    public StringBuilder GenerateHtml(StringBuilder str,String main_component){
        str.append("<!DOCTYPE html>\n" +
                "<html lang=\"en\">\n" +
                "<head>\n" +
                "    <meta charset=\"UTF-8\">\n" +
                "    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n" +
                "    <title>" + main_component +"</title>" +
                 "\n</head>\n"+"<body>\n");
        return str;
    }

//    public static String generateHtml(){
//        StringBuilder str = new StringBuilder();
//        str.append("xx");
//        str.append(CLASSES.assign.generateHtml());
//        return str.toString();
//    }
}
