package Interface;

/**
 * Created by pc on 12.01.2016.
 */
public class NastedDemo {
    public static void main(String[] args) {
        A1.NestedIf nif = new B1();
        A1.Nov nif2 = new B1();
        nif2.xo(1);
        System.out.println();
        if (nif.isNotNegative(10))
            System.out.println("Numb 10 not");
        if(nif.isNotNegative(-12))
            System.out.println("Not Enter");
    }
}
