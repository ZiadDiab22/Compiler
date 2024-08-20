package CLASSES;
import java.util.ArrayList;
import java.util.List;
import CLASSES.Expression;

public class log extends Expression{
    List <String> logs = new ArrayList<>();

    public List<String> getLogs() {
        return logs;
    }

    public void setLogs(List<String> logs) {
        this.logs = logs;
    }

    @Override
    public String toString() {
        return "log{" +
                "logs=" + logs +
                '}';
    }
}
