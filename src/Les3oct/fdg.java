package Les3oct;

/**
 * Created by Катя on 17.11.2015.
 */
public class fdg {
    public static void invert(int[] arr) {//???????? ?????? ?? ?????
        for (int k = 0; k < arr.length / 2; k++) {
            int tmp = arr[k];
            arr[k] = arr[arr.length - k - 1];
            arr[arr.length - k - 1] = tmp;//???????? ??????? ????????
        }
    }
}