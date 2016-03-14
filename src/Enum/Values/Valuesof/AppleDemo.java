package Enum.Values.Valuesof;

import Enum.Values.Valuesof.Apple;

/**
 * Created by pc on 18.01.2016.
 */
public class AppleDemo {
    public static void main(String[] args) {
        Apple ap;
        Apple all[]=Apple.values();//values все элементы
        for( Apple a: all)
            System.out.println(a+" "+a.getPrice()+"$");
        ap=Apple.valueOf("GoldenDel");
        System.out.println(ap);
    }
}
