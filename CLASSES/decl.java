package CLASSES;

public class decl {
    String type;
    String variable;

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

    @Override
    public String toString() {
        return " { type = " + type + ", variable name = " + variable + " }\n";
    }
}
