package Less14_11;

import java.util.TreeSet;

/**
 * Created by IT_School on 14.11.2015.
 */
public class ComDemo {
    public static void main(String[] args) {
        TreeSet<String> ts= new TreeSet<String>(new MyComp());
        ts.add("C");
        ts.add("B");
        ts.add("D");
        ts.add("A");
        ts.add("E");
        ts.add("F");
        for(String element:ts)
            System.out.print(element + " ");
        System.out.println();
    }
}
