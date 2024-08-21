package CLASSES;
import java.util.ArrayList;
import java.util.List;

public class SemanticErrors {
//    List <String> errors = new ArrayList<>();
//
//    public List<String> getErrors() {
//        return errors;
//    }
//
//    public void setErrors(List<String> errors) {
//        this.errors = errors;
//    }

    boolean isDeclKeyWord(String word){
        if (word.equals("let") || word.equals("var")|| word.equals("const")){
            return true;
        }
        return false;
        }

//        public void checkIfPrintedVariableIsDefined(List errors,SymbolTable table,SymbolTable table2){
//            for(int i=0;i<table.rows.size();i++){
//                if (table.rows.get(i).getType().equals("print")){
//                    String var = table.rows.get(i).getValue().trim();
//                    boolean IsFound = false;
//                    int d = 0;
//                for(int j=0;j<table.rows.size();j++){
//                    if (isDeclKeyWord(table.rows.get(j).getType()) && table.rows.get(j).getValue().trim().equals(var)) {
//                        IsFound = true ;
//                        d = j;
//                    }}
//                for(int j=0;j<table2.rows.size();j++){
//                    if (isDeclKeyWord(table2.rows.get(j).getType()) && table2.rows.get(j).getValue().trim().equals(var)) {
//                            IsFound = true ;
//                            d = j;
//                        }}
//                    if (!IsFound){
//                    errors.add("Error : in line " + table.rows.get(i).getLine() + " , you cant use Variable \"" + var +
//                            "\" before you define it");
//                }
//                else {
//                    if (Integer.parseInt(table.rows.get(i).getLine()) < Integer.parseInt(table.rows.get(d).getLine())){
//                        errors.add("Error : in line " + table.rows.get(i).getLine() + " , you cant use Variable \"" + var +
//                                "\" before you define it");
//                    }
//                }}
//            }
//            }

//    public void checkForRedublication(List errors,SymbolTable table){
//     for(int i=0;i<table.rows.size();i++){
//         if (isDeclKeyWord(table.rows.get(i).getType())) {
//             for (int j = i + 1; j < table.rows.size(); j++) {
//                 if (isDeclKeyWord(table.rows.get(i).getType())) {
//                     if (table.rows.get(i).getValue().equals(table.rows.get(j).getValue())) {
//                         errors.add("Error : in line "+ table.rows.get(j).getLine() +
//                                 " , Variable \"" + table.rows.get(j).getValue().trim() +
//                                 "\" is already declared ");
//                     }
//                 }
//             }
//         }}
//     }

    public List<String> addVars(SymbolTable table){
        List<String> vars = new ArrayList<>();
        for(int i=0;i<table.rows.size();i++){
            if (isDeclKeyWord(table.rows.get(i).getType())) {
                vars.add(table.rows.get(i).getValue().trim());
                }
            }
    return vars;
    }

    public void checkIfFuncisDeclared(List errors,List funcs){
        for(int i=0;i<funcs.size();i=i+3){

                for (int j = i + 3; j < funcs.size(); j=j+3) {

                        if (funcs.get(i).toString().equals(funcs.get(j).toString())) {
                            errors.add("Error : in line " + funcs.get(i+1)+ " column " + funcs.get(i+2)
                                    + " , Function \"" + funcs.get(i).toString().trim() +
                                    "\" is already declared ");
                        }

                }
            }
    }

    public void checkIfDividedOnZero(List errors,List as){
        for(int i=0;i<as.size();i=i+2){
            List<String> sublist = (List) as.get(i);
            for (int j = 0; j < sublist.size(); j++) {
                if (sublist.get(j).toString().equals("/") && sublist.get(j+1).toString().equals("0")){
                    errors.add("Error : in line " + as.get(i+1).toString().substring(1, as.get(i+1).toString().length() - 1)
                            + " , you cant divide on zero ");
                }
            }
            }
        }

    public boolean IsOperation(String S){
        if (S.equals("+")||S.equals("-")||S.equals("*")||S.equals("/")) return true;
        return false;
    }

    public boolean IsText(String S){
        String c = String.valueOf(S.charAt(0));
        if (c.equals("\"")) {
            return true;
        }
        return false;
    }

//    public void checkIfArithmeticOperationIsAllowed(List as){
//        for(int i=0;i<as.size();i=i+2){
//            List<String> sublist = (List) as.get(i);
//            for (int j = 0; j < sublist.size(); j++) {
//                if (IsOperation(sublist.get(j).toString()) && IsText(sublist.get(j+1).toString())){
//                    this.errors.add("Error : in line " + as.get(i+1).toString().substring(1, as.get(i+1).toString().length() - 1)
//                            + " , you cant do arithmetic operations on Texts ");
//                }
//            }
//        }
//    }

    public void check(List errors,SymbolTable table,List functions,List assignments,SymbolTable table2){

       // checkForRedublication(errors,table);
        // checkIfPrintedVariableIsDefined(errors,table,table2);
        if (functions != null) {
            checkIfFuncisDeclared(errors,functions);
            checkIfDividedOnZero(errors,assignments);
            //checkIfArithmeticOperationIsAllowed(assignments);
        }
    }

    public void print(List errors){
        System.out.println("\n\n*************************\n****** errors list ***** \n*************************\n");
        for(int i=0;i<errors.size();i++){
            if(errors.get(i)!=null)
            {
                System.out.println(errors.get(i));
            }
        }
    }
}
