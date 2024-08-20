package CLASSES;
import CLASSES.Expression;

public class Row extends Expression{
    String type;
    String value;
    String line;
    String details;

    public String getType() { return type; }

    public String getValue() { return value; }

    public String getLine() {return line;}

    public void setType(String type) { this.type = type; }

    public void setValue(String value) { this.value = value; }

    public void setLine(String line) {this.line = line;}

    public void setDetails(String details) {
        this.details = details;
    }

    public String getDetails() {
        return details;
    }
}



