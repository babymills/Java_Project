package Java_Lang;

/**
 * Created by PC on 12.03.2016.
 */
public class SortString {
    static String arr[] = {
            "Now", "is", "the","3","1", "time", "for", "all", "good", "men",
            "to", "come", "to", "the", "aid", "of", "their", "country"
    };
    public static void main(String args[]) {
        for (int j = 0; j < arr.length; j++) {
            for (int i = j + 1; i < arr.length; i++) {
                if (arr[i].compareTo(arr[j]) < 0) {
                    String t = arr[j];
                    arr[j] = arr[i];
                    arr[i] = t;
                }
            }

            System.out.println(arr[j]);
        }
    }}