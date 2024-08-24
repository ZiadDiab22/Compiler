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
    StringBuilder Jstr = new StringBuilder();
    List<String> functions = new ArrayList<>();
    List<List> assignments = new ArrayList<>();
    List<SymbolTable> TablesStack = new ArrayList<>();
    List<String> vars = new ArrayList<>();
    List<String> usedVars = new ArrayList<>();
    List<List> Variables = new ArrayList<>();
    List <String> errors = new ArrayList<>();


    @Override
    public new_component visitNew_component(MyLanguageParser.New_componentContext ctx) {
       new_component NC = new new_component();
        SymbolTable S = new SymbolTable();
        TablesStack.add(S);
        TablesStack.get(TablesStack.size() -1);

        List<String> v = new ArrayList<>();
        Variables.add(v);

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
        TablesStack.get(TablesStack.size() -1).getRows().add(row);

        for (int i=0;i<ctx.decl().size();i++){
            if(ctx.decl(i)!=null){
                NC.getDecls().add(visitDecl(ctx.decl(i)));
            }}

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

        for (int i=0;i<ctx.assign().size();i++){
            if(ctx.assign(i)!=null){
                NC.getAssigns().add(visitAssign(ctx.assign(i)));
            }}

    for (int i=0;i<ctx.log().size();i++){
            if(ctx.log(i)!=null){
                NC.getComLogs().add(visitLog(ctx.log(i)));
            }}

        NC.setReturnHtml(visitReturn_html((ctx.return_html())));

        for (int i=0;i<ctx.component().size();i++){
            if(ctx.component(i)!=null){
                NC.getComponents().add(visitComponent(ctx.component(i)));
            }}

        if(ctx.export()!=null)
        NC.setExport(visitExport(ctx.export()));

        str.append("\n<script>\n"+Jstr+"\n</script>\n</body>\n</html>\n");

        TablesStack.get(TablesStack.size()-1).vars = E.addVars(TablesStack.get(TablesStack.size() -1));
        this.E.check(errors,TablesStack.get(TablesStack.size() -1),this.functions,this.assignments,TablesStack.get(0));
    if (errors.size()>0){
        this.E.print(errors);
        return null;
    } else  {
        System.out.println("All is OK");
        TablesStack.get(TablesStack.size() -1).print();
    }
    try (FileWriter file = new FileWriter("GenerateHtml.txt")) {
        file.write(str.toString());
    } catch(IOException e){
        System.out.println("an error occured");
        }
        return NC;
    }

    @Override
    public Expression visitFunction(MyLanguageParser.FunctionContext ctx) {
        function f = new function();
        f.setName(ctx.ARRAY_STRING_VALUES().getText());
       // f.GenerateHtml(str,ctx.ARRAY_STRING_VALUES().getText());
        this.functions.add(ctx.ARRAY_STRING_VALUES().getText());
        this.functions.add(Integer.toString(ctx.ARRAY_STRING_VALUES().getSymbol().getLine()));
        this.functions.add(Integer.toString(ctx.ARRAY_STRING_VALUES().getSymbol().getCharPositionInLine() + 1));

        return (Expression) f;
    }

    @Override
    public Expression visitLog(MyLanguageParser.LogContext ctx) {
        log l = new log();
        str.append("console.log(");
        for (int i=0;i<ctx.ARRAY_STRING_VALUES().size();i++){
            if(ctx.ARRAY_STRING_VALUES(i)!=null){
                String name = ctx.ARRAY_STRING_VALUES(i).getText();
                str.append(name);
                l.logs.add(name);
                Row row = new Row();
                row.setType("print");
                row.setValue(name);
                row.setLine(Integer.toString(ctx.Console().getSymbol().getLine()));
                if ((!Variables.get(Variables.size() - 1).contains(name)) && (!Variables.get(0).contains(name)))
                    errors.add("Error : in line " + Integer.toString(ctx.Console().getSymbol().getLine())
                            + " , you cant use Variable \"" + name + "\" before you define it");
                TablesStack.get(TablesStack.size() -1).getRows().add(row);
            }}
        str.append(");\n");
        return (Expression) l;
    }

    public Expression visitArrow_function(MyLanguageParser.Arrow_functionContext ctx) {
        arrow_function f = new arrow_function();
       // f.GenerateHtml(str,ctx.ARRAY_STRING_VALUES().getText());
        if (ctx.ARRAY_STRING_VALUES()!=null) {
            f.setName(ctx.ARRAY_STRING_VALUES().getText());
            this.functions.add(ctx.ARRAY_STRING_VALUES().getText());
            this.functions.add(Integer.toString(ctx.ARRAY_STRING_VALUES().getSymbol().getLine()));
            this.functions.add(Integer.toString(ctx.ARRAY_STRING_VALUES().getSymbol().getCharPositionInLine() + 1));
        }
//        if (B){
//            f.GenerateJS(Jstr)
//        }
        return (Expression) f;
    }

    @Override
    public Expression visitImp(MyLanguageParser.ImpContext ctx) {
        imp i = new imp();
        i.GenerateHtml(str);
//        if(ctx.ARRAY_STRING_VALUES()!=null)
//            i.setName(ctx.ARRAY_STRING_VALUES().getText());
//        else
        i.setName("All file");
        i.setLink(visitLink(ctx.link()));

        Row row = new Row();
        row.setType(i.getName());
        row.setValue(i.getLink().toString());
        row.setLine(Integer.toString(ctx.Imp().getSymbol().getLine()));
        TablesStack.get(TablesStack.size() -1).getRows().add(row);

        return (Expression) i;
    }

    @Override
    public Expression visitLink(MyLanguageParser.LinkContext ctx) {
        link l = new link();
        if(ctx.One_Qoute_Term() != null)
            l.setName(ctx.One_Qoute_Term().getText());
        else l.setName((ctx.Path().getText()));
        return (Expression) l;
    }

    @Override
    public Expression visitUseState(MyLanguageParser.UseStateContext ctx) {
        useState US = new useState();
        if(ctx.fun()!=null)
            US.setFun(visitFun(ctx.fun()));
        if(ctx.var()!=null)
            US.setVar(visitVar(ctx.var()));

        Row row = new Row();
        Row row2 = new Row();
        row2.setType("var");
        row2.setValue(US.getVar().toString());
        row2.setLine(Integer.toString(ctx.Use_State().getSymbol().getLine()));
        row.setType("Use State");
        if (ctx.Tow_Qoute_Term().toString().length() > 2) {
            row.setValue("variable : " + US.getVar() + " function : " + US.getFun() + " par " + ctx.Tow_Qoute_Term().toString());
            row2.setDetails(ctx.Tow_Qoute_Term().toString().substring(1, ctx.Tow_Qoute_Term().toString().length() - 1));
        }
        else if (ctx.Path().toString().length() > 2) {
            row.setValue("variable : " + US.getVar() + " function : " + US.getFun() + " par " + ctx.Path().toString());
            row2.setDetails(ctx.Path().toString().substring(1, ctx.Path().toString().length() - 1));
        }
        else if (ctx.ARRAY_NUMERIC_VALUES().toString().length() > 2) {
            row.setValue("variable : " + US.getVar() + " function : " + US.getFun() + " par " + ctx.ARRAY_NUMERIC_VALUES().toString());
            row2.setDetails(ctx.ARRAY_NUMERIC_VALUES().toString().substring(1, ctx.ARRAY_NUMERIC_VALUES().toString().length() - 1));
        }
        else row.setValue("variable : " + US.getVar() + " function : " + US.getFun());

        row.setLine(Integer.toString(ctx.Use_State().getSymbol().getLine()));
        TablesStack.get(TablesStack.size() -1).getRows().add(row);
        TablesStack.get(TablesStack.size() -1).getRows().add(row2);

        US.GenerateJS(Jstr, row.getValue());

        return (Expression) US;
}

    @Override
    public Expression visitUseEffect(MyLanguageParser.UseEffectContext ctx) {
        useEffect u = new useEffect();
        u.setLine(Integer.toString(ctx.UseEffect().getSymbol().getLine()));
        Row row = new Row();
        System.out.println();
        row.setType("Use Effect");
        row.setValue("in line : " + u.getLine());
        row.setLine(u.getLine());
        TablesStack.get(TablesStack.size() -1).getRows().add(row);
        if (ctx.arrow_function()!=null){
            u.setArrow_function(visitArrow_function(ctx.arrow_function()));
        } else {
            u.setFunction(visitFunction(ctx.function()));
        }
        for (int i=0;i<ctx.useEffectContent().size();i++){
            if(ctx.useEffectContent()!=null){
                u.GenerateJs(Jstr,ctx.useEffectContent().get(i).getText());
            }}
        return (Expression) u;
    }

    @Override
    public Expression visitUseRef(MyLanguageParser.UseRefContext ctx) {
        useRef u = new useRef();
        u.setVar(visitVar(ctx.var()));
        u.setName(ctx.ARRAY_STRING_VALUES().getText());

        Row row = new Row();
        row.setType("Use Ref : "+ ctx.var().ARRAY_STRING_VALUES());
        row.setValue("function : " + u.getName());
        row.setLine(Integer.toString(ctx.ARRAY_STRING_VALUES().getSymbol().getLine()));
        TablesStack.get(TablesStack.size() -1).getRows().add(row);

        return (Expression) u;
    }

    @Override
    public Expression visitDecl(MyLanguageParser.DeclContext ctx) {
        decl d = new decl();
        d.setType(ctx.VarType().getText());
        Row row = new Row();
        row.setType(d.getType());
        d.setVariable(ctx.ARRAY_STRING_VALUES().getText());
        row.setValue("\t\t"+d.getVariable());
        if (d.ErrorHandle(ctx.ARRAY_STRING_VALUES().getText(),Variables.get(Variables.size() -1))){
            errors.add("Error : in line "+ Integer.toString(ctx.ARRAY_STRING_VALUES().getSymbol().getLine()) +
                    " , Variable \"" + ctx.ARRAY_STRING_VALUES().getText().trim() +
                    "\" is already declared ");
        }

        Variables.get(Variables.size() - 1 ).add(ctx.ARRAY_STRING_VALUES().getText());
        row.setLine(Integer.toString(ctx.ARRAY_STRING_VALUES().getSymbol().getLine()));
        TablesStack.get(TablesStack.size() -1).getRows().add(row);
        d.GenerateJS(Jstr,ctx.VarType().getText(),ctx.ARRAY_STRING_VALUES().getText());
        if(ctx.value()!=null) {
            row.setDetails(ctx.value().children.toString().substring(1, ctx.value().children.toString().length() - 1));
            d.setValue(visitValue(ctx.value()));
        }
        return (Expression) d;
    }

    @Override
    public Expression visitAssign(MyLanguageParser.AssignContext ctx) {
        assign a = new assign();
        List<String> as = new ArrayList<>();
        for (int i=0 ; i< ctx.children.size();i++){
            if (i!=1)
            as.add(ctx.children.get(i).getText());
        }
        str.append("console.log(");
        for (int i=0;i<ctx.ARRAY_STRING_VALUES().size();i++){
            if(ctx.ARRAY_STRING_VALUES(i)!=null){
                 a.ErrorHandle(errors,Variables.get(Variables.size() - 1),
                         Variables.get(0),ctx.ARRAY_STRING_VALUES(i).getText(),
                         Integer.toString(ctx.Equal().getSymbol().getLine()));
        }}

        List<Integer> l = new ArrayList<>();
        l.add(ctx.Equal().getSymbol().getLine());
        this.assignments.add(as);
        this.assignments.add(l);
        return (Expression) a;
    }

    @Override
    public Expression visitValue(MyLanguageParser.ValueContext ctx) {
            value v = new value();
            if(ctx.One_Qoute_Term()!=null) v.setName(ctx.One_Qoute_Term().getText());
            if(ctx.Tow_Qoute_Term()!=null) v.setName(ctx.Tow_Qoute_Term().getText());
            if(ctx.Text()!=null) v.setName(ctx.Text().getText());
            if(ctx.Bool()!=null) v.setName(ctx.Bool().getText());
            if(ctx.ARRAY_NUMERIC_VALUES()!=null) v.setName(ctx.ARRAY_NUMERIC_VALUES().getText());
            if(ctx.Path()!=null) v.setName(ctx.Path().getText());
            v.GenerateJS(Jstr , v.getName());

        return (Expression) v;
        }

    @Override
    public Expression visitVar(MyLanguageParser.VarContext ctx) {
    Var v = new Var();
    v.setName(ctx.ARRAY_STRING_VALUES().getText());
    return (Expression) v;
    }

    @Override
    public Expression visitExport(MyLanguageParser.ExportContext ctx) {
        export e = new export();
        e.setName(ctx.ARRAY_STRING_VALUES().getText());

        Row row = new Row();
        row.setType("export   ");
        row.setValue(e.getName());
        row.setLine(Integer.toString(ctx.ARRAY_STRING_VALUES().getSymbol().getLine()));
        TablesStack.get(TablesStack.size() -1).getRows().add(row);
        return (Expression) e;
    }

    @Override
    public Expression visitFun(MyLanguageParser.FunContext ctx) {
        Fun f = new Fun();
        f.setName(ctx.ARRAY_STRING_VALUES().getText());
        return (Expression) f;
    }

    @Override
    public Expression visitComponent(MyLanguageParser.ComponentContext ctx) {
        component c = new component();
        SymbolTable S = new SymbolTable();
        TablesStack.add(S);
        List<String> v = new ArrayList<>();
        Variables.add(v);
        Row row = new Row();
        row.setType("component");
        row.setLine(Integer.toString(ctx.RBrack().getSymbol().getLine()));
        if (ctx.arrow_function()!=null){
            c.setArrow_function(visitArrow_function(ctx.arrow_function()));
            row.setValue(ctx.arrow_function().ARRAY_STRING_VALUES().getText());
        } else {
            c.setFunction(visitFunction(ctx.function()));
            row.setValue(ctx.function().ARRAY_STRING_VALUES().getText());
        }
        TablesStack.get(TablesStack.size() -1).getRows().add(row);


        for (int i=0;i<ctx.decl().size();i++){
            if(ctx.decl(i)!=null){
                c.getDecls().add(visitDecl(ctx.decl(i)));
            }}

        for (int i=0;i<ctx.assign().size();i++){
            if(ctx.assign(i)!=null){
                c.getAssigns().add(visitAssign(ctx.assign(i)));
            }}

        for (int i=0;i<ctx.log().size();i++){
            if(ctx.log(i)!=null){
                c.getLogs().add(visitLog(ctx.log(i)));
            }}

        this.E.check(errors,TablesStack.get(TablesStack.size() -1),null,null,TablesStack.get(0));

            TablesStack.remove(TablesStack.get(TablesStack.size() -1));
            Variables.remove(Variables.get(Variables.size() -1));


        c.setReturnHtml(visitReturn_html((ctx.return_html())));
        str.append("\n}\n");

    return (Expression) c;
    }

    @Override
    public Expression visitReturn_html(MyLanguageParser.Return_htmlContext ctx) {
        return_html r = new return_html();
        if(ctx.html_tag()!=null)
            r.setMain_html_tag(visitHtml_tag((ctx.html_tag())));
        str.append("\n</div>");
        return (Expression) r;
    }

    @Override
    public Expression visitHtml_tag(MyLanguageParser.Html_tagContext ctx) {
        html_tag h = new html_tag();
        h.generateHtml(str);
        for (int i=0;i<ctx.props().size();i++){
            if(ctx.props(i)!=null){
                h.getProps().add(visitProps(ctx.props(i)));
            }}
        str.append(">\n");
        if (ctx.tag().children != null)
            h.setTag(visitTag(ctx.tag()));
        else h.setName("div");

       // str.append("</div>");
        return (Expression) h;
      }

    @Override
    public Expression visitTag(MyLanguageParser.TagContext ctx) {
        tag t = new tag();
        for (int i=0;i<ctx.h1().size();i++){
            if(ctx.h1(i)!=null){
                t.getH1().add(visitH1(ctx.h1(i)));
            }}
        for (int i=0;i<ctx.p().size();i++){
            if(ctx.p(i)!=null){
                t.getP().add(visitP(ctx.p(i)));
            }}
        for (int i=0;i<ctx.img().size();i++){
            if(ctx.img(i)!=null){
                t.getImg().add(visitImg(ctx.img(i)));
            }}
            for (int i=0;i<ctx.div().size();i++){
                if(ctx.div(i)!=null){
                    t.getDiv().add(visitDiv(ctx.div(i)));
                }}
        for (int i=0;i<ctx.javaScriptValue().size();i++){
            if(ctx.javaScriptValue(i)!=null){
                t.getJavaScriptValue().add(visitJavaScriptValue(ctx.javaScriptValue(i)));
            }}
        return (Expression) t;
    }

    @Override
    public Expression visitDiv(MyLanguageParser.DivContext ctx) {
        div d = new div();
        d.setName("div");
        d.generateHtml(str);
        for (int i=0;i<ctx.props().size();i++){
            if(ctx.props(i)!=null){
                d.getProps().add(visitProps(ctx.props(i)));
            }}
        str.append(">");
        if (ctx.tag()!=null){
            d.setTag(visitTag(ctx.tag()));
        }
        str.append("</div>");
            return (Expression) d;
    }

    @Override
    public Expression visitH1(MyLanguageParser.H1Context ctx) {
        h1 h = new h1();
        str.append("<h1>");
        for (int i=0;i<ctx.ARRAY_STRING_VALUES().size();i++){
            str.append(" "+ctx.ARRAY_STRING_VALUES(i).getText());
        }
        h.setName("h1");
        if (ctx.tag()!=null){
            h.setTag(visitTag(ctx.tag()));
        }
        str.append("</h1>\n");
        return (Expression) h;
    }

    @Override
    public Expression visitP(MyLanguageParser.PContext ctx) {
        p pp = new p();
        pp.setName("p");
        pp.GenerateHtml(str);
        for (int i=0;i<ctx.props().size();i++){
            if(ctx.props(i)!=null){
                pp.getProps().add(visitProps(ctx.props(i)));
            }}

        str.append(">");
        if (ctx.tag()!=null){
            pp.setTag(visitTag(ctx.tag()));
        }
        for (int i=0;i<ctx.javaScriptValue().size();i++){
            if(ctx.javaScriptValue(i)!=null){
                pp.getJavaScriptValue().add(visitJavaScriptValue(ctx.javaScriptValue(i)));
            }}
        for (int i=0;i<ctx.ARRAY_STRING_VALUES().size();i++){
            str.append(" "+ctx.ARRAY_STRING_VALUES(i).getText());
        }
//        Row row = new Row();
//        row.setType("html tag");
//        row.setValue("p");
//        symbolTable.getRows().add(row);
        str.append("</p>\n");
        return (Expression) pp;
    }

    @Override
    public Expression visitImg(MyLanguageParser.ImgContext ctx) {
        img i = new img();
        i.setName(ctx.Img().getText());
        i.setSrc(visitSrc(ctx.src()));
        return (Expression) i;
    }

    @Override
    public Expression visitSrc(MyLanguageParser.SrcContext ctx) {
        src s = new src();
        String a;
        if (ctx.ARRAY_STRING_VALUES() != null) a= ctx.ARRAY_STRING_VALUES().getText();
        else a= ctx.Path().getText();
        for(int i=0;i<TablesStack.get(TablesStack.size() -1).rows.size();i++){
            if ((TablesStack.get(TablesStack.size() -1).rows.get(i).getType().equals("let") ||
                    TablesStack.get(TablesStack.size() -1).rows.get(i).getType().equals("var")||
                    TablesStack.get(TablesStack.size() -1).rows.get(i).getType().equals("const")) &&
                    ((TablesStack.get(TablesStack.size() -1).rows.get(i).getValue().trim().equals(a)))) {
                s.GenerateHtml(str,TablesStack.get(TablesStack.size() -1).rows.get(i).getDetails());
            }
            }

        return (Expression) s;
    }

    @Override
    public Expression visitProps(MyLanguageParser.PropsContext ctx) {
         props p = new props();
        if(ctx.className()!=null)
            p.setClassName(visitClassName(ctx.className()));
        if(ctx.id()!=null)
            p.setID(visitId(ctx.id()));
        if(ctx.onClick()!=null)
            p.setOnClick(visitOnClick(ctx.onClick()));
        return (Expression) p;
    }

    @Override
    public Expression visitWidth(MyLanguageParser.WidthContext ctx) {
        width w = new width();
        return (Expression) w;
    }

    @Override
    public Expression visitHeight(MyLanguageParser.HeightContext ctx) {
        height h = new height();
        return (Expression) h;
    }

    @Override
    public Expression visitClassName(MyLanguageParser.ClassNameContext ctx) {
        className c = new className();
        c.GenerateHtml(str,ctx.One_Qoute_Term().getText());
        return (Expression) c;
    }

    @Override
    public Expression visitOnClick(MyLanguageParser.OnClickContext ctx) {
        onClick c = new onClick();
        for (int i=0;i<ctx.callFunction().size();i++){
            if(ctx.callFunction(i)!=null){
                c.getCallFunction().add(visitCallFunction(ctx.callFunction(i)));
            }}
        return (Expression) c;
    }

    @Override
    public Expression visitCallFunction(MyLanguageParser.CallFunctionContext ctx) {
        callFunction c = new callFunction();
        c.GenerateHtml(str,ctx.getText());
        return (Expression) c;
    }

    @Override
    public Expression visitId(MyLanguageParser.IdContext ctx) {
        id i = new id();
        i.GenerateHtml(str," ");
        i.setJavaScriptValue(visitJavaScriptValue(ctx.javaScriptValue()));
        str.append("\"");
        return (Expression) i;
    }

    @Override
    public Expression visitJavaScriptValue(MyLanguageParser.JavaScriptValueContext ctx) {
        JavaScriptValue j = new JavaScriptValue();
        if ((ctx != null)){
        for(int i=0;i<TablesStack.get(TablesStack.size() -1).rows.size();i++){
            if ((TablesStack.get(TablesStack.size() -1).rows.get(i).getType().equals("let") ||
                    TablesStack.get(TablesStack.size() -1).rows.get(i).getType().equals("var")||
                    TablesStack.get(TablesStack.size() -1).rows.get(i).getType().equals("const")) &&
                    TablesStack.get(TablesStack.size() -1).rows.get(i).getValue().trim().equals(ctx.ARRAY_STRING_VALUES().getText())) {
                if ((TablesStack.get(TablesStack.size() -1).rows.get(i).getDetails() != null ) &&
                        (TablesStack.get(TablesStack.size() -1).rows.get(i).getDetails().charAt(0) == '\"'))
                    j.GenerateHtml(str, TablesStack.get(TablesStack.size() -1).rows.get(i).getDetails().toString().substring(1, TablesStack.get(TablesStack.size() -1).rows.get(i).getDetails().toString().length() - 1));
                else j.GenerateHtml(str, TablesStack.get(TablesStack.size() -1).rows.get(i).getDetails());
            }
        }}
        return (Expression) j;
    }
}
