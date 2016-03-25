package Less24_10;

/**
 * Created by IT_School on 24.10.2015.
 */
public class main implements MyInteface {
    public static void main(String[] args) {
        Enum_in_interface s = Enum_in_interface.C;
        System.out.println("Hello inter" + s);
        MyInteface.static_method_in_interface();
        MyInteface g = new main();
        g.default_method_in_interface();
        Class_in_interface f = new Class_in_interface();
        f.print();
    }
}
