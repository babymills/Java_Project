package Generics;

import Java_Lang.Str;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.lang.reflect.Array;
import java.util.ArrayList;

/**
 * Created by привет on 09.04.2016.
 */
public class Priomer {
    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<Integer> list = new ArrayList<>();
        //метод проверяет на пустую сироку
        /*while (true){
            String s = in.readLine();
            if(s.isEmpty())break;
            list.add(s);
        }*/
        //метод по чет и нечет числам
        while (true) {
        String c = in.readLine();
            if(c.isEmpty())break;
            int x = Integer.parseInt(c);
            if (x%2==0){
                list.add(x);
            }else list.add(0,x);
        }
        System.out.println(list);
    }
}
