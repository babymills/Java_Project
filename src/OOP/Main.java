package OOP;

import OOP.A;

/**
 * Created by pc on 12.01.2016.
 */
public class Main {
    public static void main(String[] args) {
        A ob = new A("Vaska",8861,61,6);
        A ob1 = new A("Dron",5464111,212,51);
        System.out.println("FIGHT Vaska about Dron");
//        ob.dd();
//        ob1.dd1();
        System.out.println( ob.fight(ob1));
//A.c();//вызов статической переменной
    }
}
