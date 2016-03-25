import java.util.Scanner;

/**
 * Created by Катя on 04.10.2015.
 */
public class HW6_5 {
    public static void main(String[] args) {
        System.out.print("Введите количество вводимых чисел: ");
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        System.out.println("Введите 3-ьох значные числа ");
        int mass[] = new int[n];
        for (int i = 0; i < n; i++) {
            mass[i] = scan.nextInt();
        }
        scan.close();
        System.out.print(" Трёх значные числа которых нет одинаковых: ");
        String ms[] = new String[n];
        int numb1 = 0;
        for (int i = 0; i < mass.length; i++){
            ms[i]= String.valueOf(mass[i]);
        }
        for (int i = 0; i < ms.length; i++){
            if (ms[i].length()==3){
                byte a[] = ms[i].getBytes();
                if ((a[0]!=a[1])&&(a[1]!=a[2])&&(a[0]!=a[2])) {
                    System.out.print(mass[i] + " ");
                    numb1 = 1;
                }
            }
        }
        if (numb1 == 0) System.out.println("I am sorry");
    }
}

