package CLASSES;

public class arrow_function {
        String name;

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        @Override
        public String toString() {
            return  name;
        }

    public StringBuilder GenerateHtml(StringBuilder str,String name){
        str.append("const "+name+"=()=>{\n");
        return str;
    }
}
