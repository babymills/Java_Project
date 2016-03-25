package Exception;

import java.util.List;

/**
 * Created by PC on 04.03.2016.
 */
public class App000 {
    public static void main(String[] args) {


    //  public static void f(List<Integer> list) {
        System.err.println(0);
        try {
            System.err.println( 1);
          if(true)  throw new Error();//true нужен что бы систем аут 3 выполнился
        }
        finally {//блок файнали всегда выполняется.но не чинит как кэтч
            System.err.println(2);
            if(true)  throw new RuntimeException();
        }/*catch (RuntimeException e){
            System.out.println("Good");
        }*/
        System.err.println(3);
    }
}