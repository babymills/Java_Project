package Stack_Heap;

import jdk.nashorn.internal.runtime.regexp.joni.encoding.IntHolder;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 * Created by pc on 23.02.2016.
 */
public class App01 {
    public static void main(String[] arg) {
        IntHolder x = new IntHolder();
        IntHolder y = x;
        x.value=2;
        System.out.println(x.value);
        System.out.println(y.value);
        //BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
       // System.out.println(4|3);
        //System.out.println(4|3);


    }
}
