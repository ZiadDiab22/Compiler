package CLASSES;
import CLASSES.Expression;

public class return_html extends Expression{
    Expression main_html_tag;

    public void setMain_html_tag(Expression main_html_tag) {
        this.main_html_tag = main_html_tag;
    }

    public Expression getMain_html_tag() {
        return main_html_tag;
    }

    @Override
    public String toString() {
        return main_html_tag +"\n";
    }

    public StringBuilder generateHtml(StringBuilder str) {
        str.append("<div");
        return str;
    }

}
