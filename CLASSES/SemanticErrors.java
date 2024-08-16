package CLASSES;
import java.util.ArrayList;
import java.util.List;

public class SemanticErrors {
    List <String> errors = new ArrayList<>();

    public List<String> getErrors() {
        return errors;
    }

    public void setErrors(List<String> errors) {
        this.errors = errors;
    }

    boolean isDeclKeyWord(String word){
        if (word.equals("let") || word.equals("var")|| word.equals("const")){
            return true;
        }
        return false;
        }

        public void checkIfPrintedVariableIsDefined(SymbolTable table){
            for(int i=0;i<table.rows.size();i++){
                if (table.rows.get(i).getType().equals("print")){
                    String var = table.rows.get(i).getValue().trim();
                    boolean IsFound = false;
                    int d = 0;
                for(int j=0;j<table.rows.size();j++){
                    if (isDeclKeyWord(table.rows.get(j).getType()) && table.rows.get(j).getValue().trim().equals(var)) {
                        IsFound = true ;
                        d = j;
                    }}
                if (!IsFound){
                    this.errors.add("Error : in line " + table.rows.get(i).getLine() + " you cant use Variable \"" + var +
                            "\" before you define it");
                }
                else {
                    if (Integer.parseInt(table.rows.get(i).getLine()) < Integer.parseInt(table.rows.get(d).getLine())){
                        this.errors.add("Error : in line " + table.rows.get(i).getLine() + " you cant use Variable \"" + var +
                                "\" before you define it");
                    }
                }}
            }
            }

    public void checkForRedublication(SymbolTable table){
     for(int i=0;i<table.rows.size();i++){
         if (isDeclKeyWord(table.rows.get(i).getType())) {
             for (int j = i + 1; j < table.rows.size(); j++) {
                 if (isDeclKeyWord(table.rows.get(i).getType())) {
                     if (table.rows.get(i).getValue().equals(table.rows.get(j).getValue())) {
                         this.errors.add("Error : variable \"" + table.rows.get(j).getValue().trim() +
                                 "\" is already declared in line " + table.rows.get(i).getLine());
                     }
                 }
             }
         }}
     }

    public void check(SymbolTable table){

        checkForRedublication(table);
        checkIfPrintedVariableIsDefined(table);
    }

    public void print(){
        System.out.println("\n\n*************************\n****** semantic errors ***** \n*************************\n");
        for(int i=0;i<errors.size();i++){
            if(errors.get(i)!=null)
            {
                System.out.println(errors.get(i));
            }
        }
    }
}
