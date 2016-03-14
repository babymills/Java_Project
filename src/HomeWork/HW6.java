import java.util.Scanner;

/**
 * Created by Катя on 29.09.2015.
 */
public class HW6 {
    public static void main(String[] args) {
        int a [] = {1,2,3,4,5,6,7,8,9,10};
        for(int x:a){

            if(x%2==1)continue;
            System.out.println("Чётные " + x);
        }
        for(int x:a) {
            if (x % 2 == 0) continue;
            System.out.println("НЕ чётные " + x);
        }
        }
    }

