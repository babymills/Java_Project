package Generics;

import java.util.Arrays;
import java.util.List;

/**
 * Created by Катя on 17.11.2015.
 */
   class ma {
    public static void main(String[] args) {
        Gen <String,Integer> a = new Gen<String,Integer>("Next",1);
        a.showType();
        String str = a.getData();
        int st = a.getDa();
        System.out.println(str+ " "+ st);

    }
}
