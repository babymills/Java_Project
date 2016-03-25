package Sort;

import java.util.Arrays;

/**
 * Created by Катя on 17.11.2015.
 */
public class gh {
    public static void main(String[] args) {
        int[]arr;
        arr = new int[]{2,1,0,5,8,9};
        System.out.print(Arrays.toString(arr)+"->");
        Main.sort(arr);
        System.out.println(Arrays.toString(arr));
    }
}
