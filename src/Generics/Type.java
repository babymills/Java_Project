package Generics;

import java.util.ArrayList;

/**
 * Created by привет on 07.04.2016.
 */
public class Type {
    public static void main(String[] args) {
     Object [] ref = new String[]{"Mike"};
        ArrayList<? extends Number> ref2= new ArrayList<Integer>();//таким способом мы меняем тип
    }
}
