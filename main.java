import CLASSES.*;

import gen.MyLanguageParser;
import gen.MyLanguageLexer;

import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;
import java.io.IOException;
import static org.antlr.v4.runtime.CharStreams.fromFileName;

public class main {
    public static void main (String[] args) throws IOException{
        String source = "CLASSES/Test/test5JSX.txt";
        CharStream cs = fromFileName(source);
        MyLanguageLexer lexer = new MyLanguageLexer(cs);
        CommonTokenStream token = new CommonTokenStream(lexer);
        MyLanguageParser parser = new MyLanguageParser(token);
        ParseTree tree = parser.new_component();
        new_component doc = (new_component) new BaseVisitor().visit(tree);
        System.out.println(doc);
    }
}
