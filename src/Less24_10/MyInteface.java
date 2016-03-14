package Less24_10;

/**
 * Created by IT_School on 24.10.2015.
 */
public interface MyInteface {
    int b =10;
   enum Enum_in_interface{A,B,C};
    static void static_method_in_interface(){
        System.out.print("HELLO\n");
    }
    default void default_method_in_interface(){
        System.out.print("HeLLO dc\n");};
    class Class_in_interface{
        public void  print(){
            System.out.print("Hello class\n");}
        interface Interfce_in_interface{        };
    };
}
