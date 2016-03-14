package Exception;

import java.util.Date;

/**
 * Created by PC on 10.03.2016.
 */
public class App0002 {
    public static void main(String[] args) {
        long x = System.currentTimeMillis();
        long c = x/(24*3600*1000);
        long t = c/360;
        System.out.println(x);
        System.out.println(c);
        System.out.println(t);
        System.out.println(new Date());

    }
}
