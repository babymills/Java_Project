package Less14_11.Ad;

import java.lang.reflect.Array;
import java.util.*;

/**
 * Created by IT_School on 14.11.2015.
 */
public class dj {
    public static void main(String[] args) {
        ArrayList<Adress> ml = new ArrayList<Adress>();
        ml.add(new Adress("J.W.West",29));
        ml.add(new Adress("MAx", 28));
        Iterator<Adress> itr = ml.iterator();
        while(itr.hasNext()) {
            Adress element = itr.next();
            System.out.println(element + " ");
        }
        System.out.println();

        Set<Adress> mla = new TreeSet<>();
        mla.add(new Adress("J.W.West",29));
        mla.add(new Adress("MAx", 28));
        System.out.println(mla);



    }
}
