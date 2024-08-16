package CLASSES;

import java.util.ArrayList;
import java.util.List;

public class html_tag {
   tag tag;
   String name;

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
        div d = new div();
        d.setName("div");
        if (tag !=null) {
            tag.div.add(d);
            return "tags = " + tag;
        }
        else return "tags = " + name;
    }
}
