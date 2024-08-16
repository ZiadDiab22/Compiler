package CLASSES;

import java.util.ArrayList;
import java.util.List;

public class tag {
    List<div> div = new ArrayList<div>();
    List<p> p = new ArrayList<p>();
    List<h1> h1 = new ArrayList<h1>();
    List<img> img = new ArrayList<img>();
    //List<return_html> returnHtml = new ArrayList<return_html>();


    public List<CLASSES.div> getDiv() {
        return div;
    }

    public void setDiv(List<CLASSES.div> div) {
        this.div = div;
    }

    public List<CLASSES.h1> getH1() {
        return h1;
    }

    public void setH1(List<CLASSES.h1> h1) {
        this.h1 = h1;
    }

    public List<CLASSES.img> getImg() {
        return img;
    }

    public void setImg(List<CLASSES.img> img) {
        this.img = img;
    }

    public List<CLASSES.p> getP() {
        return p;
    }

    public void setP(List<CLASSES.p> p) {
        this.p = p;
    }

    @Override
    public String toString() {
            return " " + div + " " +  p + " " +  img+ " " + h1 ;
    }
}
