package CLASSES;

import java.util.ArrayList;
import java.util.List;

public class new_component {
    List<useState> useStates = new ArrayList<useState>();
    List<component> components = new ArrayList<component>();
    List<useEffect> useEffect = new ArrayList<useEffect>();
    List<useRef> useRef = new ArrayList<useRef>();
    List<decl> decls = new ArrayList<decl>();
    List<log> logs = new ArrayList<log>();
    List<imp> imps = new ArrayList<imp>();
    export export;
    function function;
    arrow_function arrow_function;

    public List<useState> getUseStates() {
        return useStates;
    }
    public void setUseStates(List<useState> useStates) {
        this.useStates = useStates;
    }

    public List<component> getComponents() {
        return components;
    }
    public void setComponents(List<component> components) {
        this.components = components;
    }


    public List<decl> getDecls() {return decls;}
    public void setDecls(List<decl> decls) {this.decls = decls;}

    public List<log> getLogs() {return logs;}
    public void setLogs(List<log> logs) {this.logs = logs;}

    public List<imp> getImps() {return imps;}
    public void setImps(List<imp> imps) {this.imps = imps;}

    public CLASSES.export getExport() {return export;}
    public void setExport(CLASSES.export export) {this.export = export;}

    public void setArrow_function(arrow_function arrow_function) {this.arrow_function = arrow_function;}
    public arrow_function getArrow_function() {return arrow_function;}

    public void setFunction(function function) {this.function = function;}
    public function getFunction() {return function;}

    public void setUseEffect(List<CLASSES.useEffect> useEffect) {this.useEffect = useEffect;}
    public void setUseRef(List<CLASSES.useRef> useRef) {this.useRef = useRef;}

    public List<CLASSES.useEffect> getUseEffect() {return useEffect;}
    public List<CLASSES.useRef> getUseRef() {return useRef;}

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
}
