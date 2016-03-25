package Stack_Heap;

import java.util.Arrays;

/**
 * Created by PC on 28.02.2016.
 */
public class app {
    public static void main(String[] args) {
   int[] x = {0,1,2};
        int []y=x;
        x=null;
        System.out.println(Arrays.toString(x));
        System.out.println(Arrays.toString(y));
    }
}

