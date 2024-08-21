package CLASSES;
import CLASSES.Expression;

import java.util.List;


public class assign extends Expression{

    public void ErrorHandle(List errors ,List v1, List v2, String name , String line) {
        if ((!v1.contains(name)) && (!v2.contains(name)))
            errors.add("Error : in line " + line
                    + " , you cant use Variable \"" + name + "\" before you define it");
    }

}
