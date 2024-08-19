package CLASSES;

public class imp {
    String name;
    link link;

    public void setName(String name) {
        this.name = name;
    }

    public void setLink(link link) {
        this.link = link;
    }

    public String getName() {
        return name;
    }

    public link getLink() {
        return link;
    }

    @Override
    public String toString() {
        return "{ imported ='" + name + '\'' +
                ", path = " + link +
                "}\n";
    }

    public StringBuilder GenerateHtml(StringBuilder str){
        //str.append("yy");
        return str;
    }
}
