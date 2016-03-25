package HomeWork.TAsk2;

/**
 * Created by Катя on 19.10.2015.
 */
/*public class HomeWork2 {
    import java.util.Arrays;
    import java.util.Scanner;
//9.
/*public static void main(String[] args) {
        int i, j, k;
        System.out.print("Введите обьем массива: ");
        Scanner scan = new Scanner(System.in);
        int so = scan.nextInt();
        int mas1[][] = new int[so][so];
        for (i = 0; i < so; i++) {
        for (j = 0; j < so; j++) {
        mas1[i][j] = (int) ((Math.random() * 2 * so) - so);
        System.out.print(mas1[i][j] + " ");
        }
        System.out.println(" ");
        }
        System.out.println(" ");
        System.out.println(" ");
        for (i = 0; i < mas1.length; i++) {
        for (k = mas1.length - 1; k > 0; k--) {
        for (j = 0; j < mas1.length - 1; j++) {
        if (mas1[i][j] < mas1[i][j + 1]) {
        int mas2 = mas1[i][j];
        mas1[i][j] = mas1[i][j + 1];
        mas1[i][j + 1] = mas2;
        }
        }
        }
        }


        for (i = 0; i < so; i++) {
        for ( j = 0; j < so; j++) {
        System.out.print(mas1[i][j] + " ");
        }
        System.out.println(" ");
        }
        }}

//8.МАТРИЦА n*n
/*public static void main(String[] args) {
        int twoD[][]= new int[4][4];
        int i , j , k = 0;
        for(i=0; i<4; i++)
        for(j=0; j<4; j++) {
        twoD[i][j] = k ;
        k++;
        }
        for(i=0; i<4; i++) {
        for(j=0; j <4; j++)
        System.out.print(twoD[i][j] + " ");
        System.out.println();

//3.меньше среднего
/*public static void main(String[] args) {

        int sum = 0;
        String maxNumb= null;String minNumb=null;
        for (String a : args) {// в аргумент занести числа

        int x = a.length();
        sum += x;
        }
        int s = sum / 3;
        System.out.println("Среднее значение "+ s);
        System.out.print("Числа меньше среднего:");
        for(String a : args){
        int x = a.length();
        if(x<s){
        System.out.print(a+" ");}}}
//2.сортировка чисел
/*
class Sort1{
    public static void main(String[] args) {
        System.out.print("Введите обьем массива: ");
        Scanner scan = new Scanner(System.in);
        int so = scan.nextInt();
        System.out.println("Введите числа ");
        int mas1[] = new int[so];
        for (int i = 0; i < so; i++) {
            mas1[i] = scan.nextInt();
        }
        scan.close();

        System.out.print(Arrays.toString(mas1)+"->");
        Main.sort(mas1);
        System.out.println(Arrays.toString(mas1));

    }
}
public class Main {
    public static void sort(int[] data) {
        for (int barrier = data.length -1; barrier>=0;barrier--){
            for(int index = 0; index<barrier;index++) {
                if (data[index] > data[index+1]){
                    int tmp = data[index];
                    data[index] = data[index+1];
                    data[index+1] = tmp;
                }
            }
        }

    }
}
//1.минимум и максимум среди элементов

/*            int min = Integer.MAX_VALUE;
            int max = Integer.MIN_VALUE;
        String maxNumb= null;String minNumb=null;
        for (String a : args){// в аргумент занести числа


                if (min > a.length()) {
                    min = a.length();
                    minNumb = a;
                }
                if (max < a.length()) {
                    max = a.length();
                    maxNumb = a;
                }
            }


        System.out.println("МАксимальное количество символов: " + max + " Max Numb: "+ maxNumb);
            System.out.println("Минимально количество символов: " + min + " MIn Numb: "+ minNumb);
        }

    }
**/

