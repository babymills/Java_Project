package Generics;

/**
 * Created by pc on 18.01.2016.
 */
public class GemiDemo {
    public static void main(String[] args) {
Geni<Integer>iob;
        iob = new Geni<Integer>(88);
        iob.showType();
        int v = iob.getOb();
        System.out.println(v);
        Geni<String>str = new Geni<String>("ds");
        str.showType();
        String str1 = str.getOb();
        System.out.println(str1);
    }
}
