package Less24_10.Int;

/**
 * Created by IT_School on 24.10.2015.
 */
import static java.lang.System.out;
public class Test {
    public String testfield = "(testfield!)";

    public static class Mynested {
        public String nested="(nested!)";
        public void nestedshow(){
            out.println("Hello i nested class!"+nested);}
        }
        public class Myinner{
            public String inner="(inner!)";
            public void innershow(){
                out.println("Hello i inner class!"+inner);}
    }
        public void show(){
            System.out.println("Hello I pr class!"+testfield);
        }
    }

