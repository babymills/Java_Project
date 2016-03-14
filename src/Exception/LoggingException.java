package Exception;

import java.io.PrintStream;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.logging.Logger;

/**
 * Created by PC on 04.03.2016.
 */
//вывод информации об исключениях через обьект Logger.
public class LoggingException extends Exception {
    private static Logger logger =
            Logger.getLogger("LoggingException");
    public LoggingException(){
        StringWriter trace = new StringWriter();
        printStackTrace(new PrintWriter(trace));
        logger.severe(trace.toString());
    }
}
class LoggingExceptions{
    public static void main(String[] args) {
        try {
            throw new LoggingException();
        } catch (LoggingException e) {
            System.err.println("OK "+e);
        }
        try {
            throw new LoggingException();
        } catch (LoggingException e) {
            System.err.println("OK "+e);
        }
    }
}