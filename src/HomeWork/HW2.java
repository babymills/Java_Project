package HomeWork;

import java.util.Scanner;

/**
 * Created by Катя on 29.09.2015.
 */
public class HW2 {
    public static void main(String args[]) {
        System.out.println("Введите числп и нажмите ENTER");
        Scanner scanner = new Scanner(System.in);
        int i  = scanner.nextInt();
        while (i>0){
            System.out.println(i);
            i--;
        }
    }
}