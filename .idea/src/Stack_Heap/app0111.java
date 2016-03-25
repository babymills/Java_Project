package Stack_Heap;

import jdk.nashorn.internal.runtime.regexp.joni.encoding.IntHolder;

import java.util.Arrays;

/**
 * Created by PC on 28.02.2016.
 */
public class app0111 {
    /*public static void main(String[] args) {
  int[] x ={0,1,2};
x= f(x);
        System.out.println( "x = " + Arrays.toString(x));
    }

    private static int[] f(int[] x) {
        return new int[]{x[0]+10,x[1]+10,x[2]+10};
    }
}
public class App22{*/
    public static void main(String[] args) {
        Object[] ref = new Object[1];
        int count = 0;
        while(true){
            ref = new Object[]{ref,new byte[100000]};
            System.out.println(count++);
        }
    }
}//-XX:+TraceClassLoading.......показывает все загружаемые классы