package IO;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;

/**
 * Created by привет on 01.04.2016.
 */
public class LinkList {
    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        list.add(Arrays.toString(args));
        list.add("LinkList".toUpperCase());
        list.add("qqqq");
        for(int i =list.size()-1;i>=0;i--){
            System.out.println(list.get(i));
        }
    }
}
