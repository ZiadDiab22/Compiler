package CLASSES;

public class useRef {
    String name;
    Var var;

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setVar(Var var) {
        this.var = var;
    }

    public Var getVar() {
        return var;
    }

    @Override
    public String toString() {
        return  "name='" + var + '\'' +
                " , function = " + name + "\n";
    }
}
