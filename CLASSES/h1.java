package CLASSES;

public class h1 {
    String name;
    tag tag;

    public void setTag(CLASSES.tag tag) {
        this.tag = tag;
    }

    public CLASSES.tag getTag() {
        return tag;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        if (tag != null)
            return ""+tag;
        else return name;
    }
}
