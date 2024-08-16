package CLASSES;

public class return_html {
    html_tag main_html_tag;

    public void setMain_html_tag(html_tag main_html_tag) {
        this.main_html_tag = main_html_tag;
    }

    public html_tag getMain_html_tag() {
        return main_html_tag;
    }

    @Override
    public String toString() {
        return main_html_tag +"\n";
    }
}
