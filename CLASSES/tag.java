package CLASSES;

import java.util.ArrayList;
import java.util.List;
import CLASSES.Expression;


public class tag extends Expression{
    List<Expression> div = new ArrayList<Expression>();
    List<Expression> p = new ArrayList<Expression>();
    List<Expression> h1 = new ArrayList<Expression>();
    List<Expression> img = new ArrayList<Expression>();
    List<Expression> javaScriptValue = new ArrayList<Expression>();
    //List<return_html> returnHtml = new ArrayList<return_html>();


    public List<Expression> getDiv() {
        return div;
    }

    public void setDiv(List<Expression> div) {
        this.div = div;
    }

    public List<Expression> getH1() {
        return h1;
    }

    public void setH1(List<Expression> h1) {
        this.h1 = h1;
    }

    public List<Expression> getImg() {
        return img;
    }

    public void setImg(List<Expression> img) {
        this.img = img;
    }

    public List<Expression> getP() {
        return p;
    }

    public void setP(List<Expression> p) {
        this.p = p;
    }

    public void setJavaScriptValue(List<Expression> javaScriptValue) {
        this.javaScriptValue = javaScriptValue;
    }

    public List<Expression> getJavaScriptValue() {
        return javaScriptValue;
    }

    @Override
    public String toString() {
            return " " + div + " " +  p + " " +  img+ " " + h1 ;
    }
}
