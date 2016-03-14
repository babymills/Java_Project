package RAZNOE;

/**
 * Created by Катя on 26.10.2015.
 */
public class test {
    public static void main(String[] args) {
        BAnk a =  new BAnk("private");
        BAnk.account df = a.new account(1,234);
        System.out.println(df);
        int r = 20;
        int v = 4;
        df.add(r);
        System.out.println(df);
    }
}
