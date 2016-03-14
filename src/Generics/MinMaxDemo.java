package Generics;

/**
 * Created by pc on 18.01.2016.
 */
public class MinMaxDemo {
    public static void main(String[] args) {
        Integer in[] = {1,2,3,4,5,6,7,8,9,10};
        Character sn[]= {'a','b','c','v','b','n','g','d'};
        MyMinMax<Integer> iob = new MyMinMax<Integer>(in);
        MyMinMax<Character> iob2 = new MyMinMax<Character>(sn);
        System.out.println("Max nums " + iob.max());
        System.out.println("Min nums " + iob.min());
        System.out.println("Max word " + iob2.max());
        System.out.println("Min nums " + iob2.min());
    }
}
