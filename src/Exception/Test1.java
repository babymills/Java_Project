package Exception;

import java.io.IOException;

/**
 * Created by PC on 13.03.2016.
 */
public class Test1 {
    public static void main(String[] args)  {
        try {
             f();
           // throw new IOException();
            System.out.println("try");
            g();

        } /*catch (IOException e) {
            System.out.println("norm");
        }*/finally {
            System.out.println("finally");
        }
        System.out.println("out try");

    }

    private static void g() {
        System.out.println("g");
    }

    private static void f() {
        try {
            throw new IOException();
        } catch (IOException e) {
            System.out.println("IOEXCEPTION CALLED");
        }
    }
}
