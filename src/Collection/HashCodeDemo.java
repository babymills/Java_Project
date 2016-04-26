package Collection;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by привет on 15.04.2016.
 */

public class HashCodeDemo {

    public static void main(String[] args) {
        HC v = new HC(1,2);
        HC v1 = new HC(1,2);
        HC v2 = new HC(3,4);
        HC v3 = v;
        System.out.println(v==v1);//ссылки
        System.out.println(v==v2);
        System.out.println(v==v3);
        System.out.println(v.equals(v1));//значения
        System.out.println(v.equals(v2));
        System.out.println(v.equals(v3));
        System.out.println(v.hashCode() == v1.hashCode());
        System.out.println(v.hashCode() == v2.hashCode());
        System.out.println(v.hashCode() == v3.hashCode());
        System.out.println(v.hashCode());
        System.out.println(v1.hashCode());
        System.out.println(v2.hashCode());
        System.out.println(v3.hashCode());
        System.out.println(-101%2);
    }
}
class HC{
    public int c;
    public int d;

    public HC(int c, int d) {
        this.c = c;
        this.d = d;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        HC hc = (HC) o;

        if (c != hc.c) return false;
        return d == hc.d;

    }

    /*@Override
    public int hashCode() {
        int result = c;
        result = 31 * result + d;
        return result;
    }*/
}