package IO;

import javafx.scene.Parent;

import java.io.*;
import java.lang.reflect.Array;
import java.util.*;
import java.util.concurrent.CopyOnWriteArrayList;

/**
 * Created by pc on 18.01.2016.
 */


    class DataIODemo  {
    public static void main(String[] args) throws Throwable {
         String str = new String(new byte [] {0,1,2});
        String c = "A";
        char cc[]= {2};
        System.out.println(str);
        System.out.println( );
        System.out.println("A".getBytes("UTF-16").length);//4
        System.out.println("AA".getBytes("UTF-16").length);//6
        System.out.println("AAA".getBytes("UTF-16").length);//6
        System.out.println("A".getBytes("UTF-8").length);//1
        System.out.println("AA".getBytes("UTF-8").length);//2
    }
}



