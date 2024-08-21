package CLASSES;
import CLASSES.Expression;

import java.util.ArrayList;
import java.util.List;

public class onClick extends Expression{
    List<Expression> callFunction = new ArrayList<Expression>();

    public void setCallFunction(List<Expression> callFunction) {
        this.callFunction = callFunction;
    }

    public List<Expression> getCallFunction() {
        return callFunction;
    }
}
