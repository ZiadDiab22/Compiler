package CLASSES;
import gen.MyLanguageParser;
import gen.MyLanguageParserBaseVisitor;

import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class BaseVisitor extends MyLanguageParserBaseVisitor {

    SymbolTable symbolTable = new SymbolTable();
    SemanticErrors E = new SemanticErrors();
    StringBuilder str = new StringBuilder();
    List<String> functions = new ArrayList<>();
    List<List> assignments = new ArrayList<>();
    List<String> vars = new ArrayList<>();


    @Override
    public new_component visitNew_component(MyLanguageParser.New_componentContext ctx) {
    new_component NC = new new_component();

        for (int i=0;i<ctx.imp().size();i++){
        if(ctx.imp(i)!=null){
            NC.getImps().add(visitImp(ctx.imp(i)));
        }}
        Row row = new Row();
        row.setType("main component name ");
        row.setLine(Integer.toString(ctx.RBrack().getSymbol().getLine()));

   if (ctx.arrow_function()!=null){
       NC.setArrow_function(visitArrow_function(ctx.arrow_function()));
       row.setValue(ctx.arrow_function().ARRAY_STRING_VALUES().getText());
       NC.GenerateHtml(str,ctx.arrow_function().ARRAY_STRING_VALUES().getText());
   } else {
       NC.setFunction(visitFunction(ctx.function()));
       row.setValue(ctx.function().ARRAY_STRING_VALUES().getText());
       NC.GenerateHtml(str,ctx.arrow_function().ARRAY_STRING_VALUES().getText());
   }
        symbolTable.getRows().add(row);

    for (int i=0;i<ctx.useState().size();i++){
        if(ctx.useState(i)!=null){
            NC.getUseStates().add(visitUseState(ctx.useState(i)));
        }}
    for (int i=0;i<ctx.useRef().size();i++){
        if(ctx.useRef(i)!=null){
            NC.getUseRef().add(visitUseRef(ctx.useRef(i)));
        }}
    for (int i=0;i<ctx.useEffect().size();i++){
        if(ctx.useEffect(i)!=null){
            NC.getUseEffect().add(visitUseEffect(ctx.useEffect(i)));
            }}
        str.append("\n<script>\n");
    for (int i=0;i<ctx.component().size();i++){
        if(ctx.component(i)!=null){
            NC.getComponents().add(visitComponent(ctx.component(i)));
        }}

    for (int i=0;i<ctx.decl().size();i++){
        if(ctx.decl(i)!=null){
            NC.getDecls().add(visitDecl(ctx.decl(i)));
        }}

        for (int i=0;i<ctx.assign().size();i++){
            if(ctx.assign(i)!=null){
                NC.getAssigns().add(visitAssign(ctx.assign(i)));
            }}

    for (int i=0;i<ctx.log().size();i++){
            if(ctx.log(i)!=null){
                NC.getLogs().add(visitLog(ctx.log(i)));
            }}
        str.append("\n</script>\n");

    if(ctx.export()!=null)
        NC.setExport(visitExport(ctx.export()));

    NC.setReturnHtml(visitReturn_html((ctx.return_html())));

        str.append("\n</body>\n</html>\n");

        this.E.check(this.symbolTable,this.functions,this.assignments);
    if (this.E.errors.size()>0){
        this.symbolTable.print();
        this.E.print();
    } else  {
        System.out.println("All is OK");
        this.symbolTable.print();}
    try (FileWriter file = new FileWriter("GenerateHtml.txt")) {
        file.write(str.toString());
        //System.out.println("success");
    } catch(IOException e){
        System.out.println("an error occured");
        }
        this.vars = E.addVars(this.symbolTable);
        return NC;
    }

    @Override
    public function visitFunction(MyLanguageParser.FunctionContext ctx) {
        function f = new function();
        f.setName(ctx.ARRAY_STRING_VALUES().getText());
       // f.GenerateHtml(str,ctx.ARRAY_STRING_VALUES().getText());
        this.functions.add(ctx.ARRAY_STRING_VALUES().getText());
        this.functions.add(Integer.toString(ctx.ARRAY_STRING_VALUES().getSymbol().getLine()));
        this.functions.add(Integer.toString(ctx.ARRAY_STRING_VALUES().getSymbol().getCharPositionInLine() + 1));

        return f;
    }

    @Override
    public log visitLog(MyLanguageParser.LogContext ctx) {
        log l = new log();
        str.append("console.log(");
        for (int i=0;i<ctx.ARRAY_STRING_VALUES().size();i++){
            if(ctx.ARRAY_STRING_VALUES(i)!=null){
                str.append(ctx.ARRAY_STRING_VALUES(i).getText());
                l.logs.add(ctx.ARRAY_STRING_VALUES(i).getText());
                Row row = new Row();
                row.setType("print");
                row.setValue(ctx.ARRAY_STRING_VALUES(i).getText());
                row.setLine(Integer.toString(ctx.Console().getSymbol().getLine()));
                symbolTable.getRows().add(row);
            }}
        str.append(");\n");
        return l;
    }

    @Override
    public arrow_function visitArrow_function(MyLanguageParser.Arrow_functionContext ctx) {
        arrow_function f = new arrow_function();
        f.setName(ctx.ARRAY_STRING_VALUES().getText());
       // f.GenerateHtml(str,ctx.ARRAY_STRING_VALUES().getText());
        this.functions.add(ctx.ARRAY_STRING_VALUES().getText());
        this.functions.add(Integer.toString(ctx.ARRAY_STRING_VALUES().getSymbol().getLine()));
        this.functions.add(Integer.toString(ctx.ARRAY_STRING_VALUES().getSymbol().getCharPositionInLine() + 1));
        return f;
    }

    @Override
    public imp visitImp(MyLanguageParser.ImpContext ctx) {
        imp i = new imp();
        i.GenerateHtml(str);
        if(ctx.ARRAY_STRING_VALUES()!=null)
            i.setName(ctx.ARRAY_STRING_VALUES().getText());
        else i.setName("All file");
        i.setLink(visitLink(ctx.link()));

        Row row = new Row();
        row.setType(i.getName());
        row.setValue(i.getLink().toString());
        row.setLine(Integer.toString(ctx.Imp().getSymbol().getLine()));
        symbolTable.getRows().add(row);

        return i;
    }

    @Override
    public link visitLink(MyLanguageParser.LinkContext ctx) {
        link l = new link();
        if(ctx.One_Qoute_Term() != null)
            l.setName(ctx.One_Qoute_Term().getText());
        else l.setName((ctx.Path().getText()));
        return l;
    }

    @Override
    public useState visitUseState(MyLanguageParser.UseStateContext ctx) {
        useState US = new useState();
        if(ctx.fun()!=null)
            US.setFun(visitFun(ctx.fun()));
        if(ctx.var()!=null)
            US.setVar(visitVar(ctx.var()));

        Row row = new Row();
        System.out.println();
        row.setType("Use State");
        row.setValue("variable : " + US.getVar() + " function : " + US.getFun());
        row.setLine(Integer.toString(ctx.Use_State().getSymbol().getLine()));
        symbolTable.getRows().add(row);

    return US;
}

    @Override
    public useEffect visitUseEffect(MyLanguageParser.UseEffectContext ctx) {
        useEffect u = new useEffect();
        u.setLine(Integer.toString(ctx.UseEffect().getSymbol().getLine()));
        Row row = new Row();
        System.out.println();
        row.setType("Use Effect");
        row.setValue("in line : " + u.getLine());
        row.setLine(u.getLine());
        symbolTable.getRows().add(row);
        return u;
    }

    @Override
    public useRef visitUseRef(MyLanguageParser.UseRefContext ctx) {
        useRef u = new useRef();
        u.setVar(visitVar(ctx.var()));
        u.setName(ctx.ARRAY_STRING_VALUES().getText());

        Row row = new Row();
        row.setType("Use Ref : "+ ctx.var().ARRAY_STRING_VALUES());
        row.setValue("function : " + u.getName());
        row.setLine(Integer.toString(ctx.ARRAY_STRING_VALUES().getSymbol().getLine()));
        symbolTable.getRows().add(row);

        return u;
    }

    @Override
    public decl visitDecl(MyLanguageParser.DeclContext ctx) {
        decl d = new decl();
        d.setType(ctx.VarType().getText());
        Row row = new Row();
        row.setType(d.getType());
        d.setVariable(ctx.ARRAY_STRING_VALUES().getText());
        row.setValue("\t\t"+d.getVariable());
        row.setLine(Integer.toString(ctx.ARRAY_STRING_VALUES().getSymbol().getLine()));
        symbolTable.getRows().add(row);
        str.append(ctx.VarType().getText() + " " + ctx.ARRAY_STRING_VALUES().getText()+ " = " + ctx.value().getText()+"\n");
        return d;
    }

    @Override
    public assign visitAssign(MyLanguageParser.AssignContext ctx) {
        assign a = new assign();
        List<String> as = new ArrayList<>();
        for (int i=0 ; i< ctx.children.size();i++){
            if (i!=1)
            as.add(ctx.children.get(i).getText());
        }
        List<Integer> l = new ArrayList<>();
        l.add(ctx.Equal().getSymbol().getLine());
        this.assignments.add(as);
        this.assignments.add(l);
        return a;
    }

    @Override
    public value visitValue(MyLanguageParser.ValueContext ctx) {
            value v = new value();
            if(ctx.One_Qoute_Term()!=null) v.setName(ctx.One_Qoute_Term().getText());
            if(ctx.Tow_Qoute_Term()!=null) v.setName(ctx.Tow_Qoute_Term().getText());
            if(ctx.Text()!=null) v.setName(ctx.Text().getText());
            if(ctx.Bool()!=null) v.setName(ctx.Bool().getText());

        return v;
        }

    @Override
    public Var visitVar(MyLanguageParser.VarContext ctx) {
    Var v = new Var();
    v.setName(ctx.ARRAY_STRING_VALUES().getText());
    return v;
    }

    @Override
    public export visitExport(MyLanguageParser.ExportContext ctx) {
        export e = new export();
        e.setName(ctx.ARRAY_STRING_VALUES().getText());

        Row row = new Row();
        row.setType("export   ");
        row.setValue(e.getName());
        row.setLine(Integer.toString(ctx.ARRAY_STRING_VALUES().getSymbol().getLine()));
        symbolTable.getRows().add(row);
        return e;
    }

    @Override
    public Fun visitFun(MyLanguageParser.FunContext ctx) {
        Fun f = new Fun();
        f.setName(ctx.ARRAY_STRING_VALUES().getText());
        return f;
    }

    @Override
    public component visitComponent(MyLanguageParser.ComponentContext ctx) {
        component c = new component();
        Row row = new Row();
        row.setType("component");
        row.setLine(Integer.toString(ctx.RBrack().getSymbol().getLine()));
        if (ctx.arrow_function()!=null){
            c.setArrow_function(visitArrow_function(ctx.arrow_function()));
            row.setValue(ctx.arrow_function().ARRAY_STRING_VALUES().getText());
            str.append("const "+ctx.arrow_function().getText()+"=()=>{\n");
        } else {
            c.setFunction(visitFunction(ctx.function()));
            row.setValue(ctx.function().ARRAY_STRING_VALUES().getText());
            str.append(ctx.function().getText()+"\n");
        }
        for (int i=0;i<ctx.log().size();i++){
            if(ctx.log(i)!=null){
                c.getLogs().add(visitLog(ctx.log(i)));
            }}

        for (int i=0;i<ctx.decl().size();i++){
            if(ctx.decl(i)!=null){
                c.getDecls().add(visitDecl(ctx.decl(i)));
            }}

        symbolTable.getRows().add(row);
        c.setReturnHtml(visitReturn_html((ctx.return_html())));
        str.append("\n}\n");

    return c;
    }

    @Override
    public return_html visitReturn_html(MyLanguageParser.Return_htmlContext ctx) {
        return_html r = new return_html();
        if(ctx.html_tag()!=null)
            r.setMain_html_tag(visitHtml_tag((ctx.html_tag())));
        return r;
    }

    @Override
    public html_tag visitHtml_tag(MyLanguageParser.Html_tagContext ctx) {
        html_tag h = new html_tag();
        str.append("<div>");
//        Row row = new Row();
//        row.setType("html tag");
//        row.setValue("div");
//        symbolTable.getRows().add(row);

        if (ctx.tag().children != null)
            h.setTag(visitTag(ctx.tag()));
        else h.setName("div");
        str.append("</div>");
        return h;
      }

    @Override
    public tag visitTag(MyLanguageParser.TagContext ctx) {
        tag t = new tag();
            for (int i=0;i<ctx.div().size();i++){
                if(ctx.div(i)!=null){
                    t.getDiv().add(visitDiv(ctx.div(i)));
                }}
            for (int i=0;i<ctx.p().size();i++){
                if(ctx.p(i)!=null){
                    t.getP().add(visitP(ctx.p(i)));
                }}
            for (int i=0;i<ctx.h1().size();i++){
                if(ctx.h1(i)!=null){
                    t.getH1().add(visitH1(ctx.h1(i)));
                }}
            for (int i=0;i<ctx.img().size();i++){
                if(ctx.img(i)!=null){
                    t.getImg().add(visitImg(ctx.img(i)));
                }}
        return t;
    }

    @Override
    public div visitDiv(MyLanguageParser.DivContext ctx) {
        div d = new div();
        str.append("<div>");
        for (int i=0;i<ctx.ARRAY_STRING_VALUES().size();i++){
            str.append(" "+ctx.ARRAY_STRING_VALUES(i).getText());
        }
        d.setName("div");
        if (ctx.tag()!=null){
            d.setTag(visitTag(ctx.tag()));
        }
//        Row row = new Row();
//        row.setType("html tagggg");
//        row.setValue("div");
//        symbolTable.getRows().add(row);
            str.append("</div>\n");
            return d;
    }

    @Override
    public h1 visitH1(MyLanguageParser.H1Context ctx) {
        h1 h = new h1();
        str.append("<h1>");
        for (int i=0;i<ctx.ARRAY_STRING_VALUES().size();i++){
            str.append(" "+ctx.ARRAY_STRING_VALUES(i).getText());
        }
        h.setName("h1");
        if (ctx.tag()!=null){
            h.setTag(visitTag(ctx.tag()));
        }
//        Row row = new Row();
//        row.setType("html tag");
//        row.setValue("h1");
//        symbolTable.getRows().add(row);
        str.append("</h1>");
        return h;
    }

    @Override
    public p visitP(MyLanguageParser.PContext ctx) {
        p pp = new p();
        pp.setName("p");
        str.append("<p>");
        for (int i=0;i<ctx.ARRAY_STRING_VALUES().size();i++){
            str.append(" "+ctx.ARRAY_STRING_VALUES(i).getText());
        }
        if (ctx.tag()!=null){
            pp.setTag(visitTag(ctx.tag()));
        }
//        Row row = new Row();
//        row.setType("html tag");
//        row.setValue("p");
//        symbolTable.getRows().add(row);
        str.append("</p>\n");
        return pp;
    }

    @Override
    public img visitImg(MyLanguageParser.ImgContext ctx) {
        img i = new img();
        i.setName(ctx.Img().getText());
        str.append("\n<img src={");
        visitSrc(ctx.src());
        str.append("}/>\n");
//        Row row = new Row();
//        row.setType("html tag");
//        row.setValue("img");
//        symbolTable.getRows().add(row);
        return i;
    }

    @Override
    public src visitSrc(MyLanguageParser.SrcContext ctx) {
        src s = new src();
        str.append(ctx.ARRAY_STRING_VALUES().getText());
        return s;
    }
}
