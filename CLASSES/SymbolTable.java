package CLASSES;
import java.util.ArrayList;
import java.util.List;

public class SymbolTable {
    List <Row> rows = new ArrayList<>();
    List<String> vars = new ArrayList<>();

    public List<Row> getRows() {
        return rows;
    }

    public void setRows(List<Row> rows) {
        this.rows = rows;
    }

    public void print(){
        System.out.println("\n\n*************************\n****** Symbol table ***** \n*************************\n");
        for(int i=0;i<rows.size();i++){
            if(rows.get(i)!=null)
            {
                System.out.println(rows.get(i).getType() + "\t\t\t\t" + rows.get(i).getValue()+ " | "
                        + rows.get(i).getLine() + "  " + rows.get(i).getDetails());
            }
        }
    }
}
