package CLASSES;

public class useState {
    Var var;
    Fun fun ;

    public void setFun(Fun fun) {
        this.fun = fun;
    }

    public void setVar(Var var) {
        this.var = var;
    }

    public Fun getFun() {
        return fun;
    }

    public Var getVar() {
        return var;
    }

    @Override
    public String toString() {
        return "variable = " + var +
                "  function = " + fun;
    }
}
