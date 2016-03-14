package lab2;


import java.util.*;

/**
 * Created by Катя on 26.10.2015.
 */
public class Salad {
    public static void main(String[] args) {
        vegetebls[] a = new vegetebls[]{
                new vegetebls("Гриб", 132, 100),
                new vegetebls("Морковь", 67, 100),
                new vegetebls("Кабачёк", 24, 100),
                new vegetebls("Помидор", 189, 100)};
        int sum = 0;
        int sum1 = 0;
        String v = "";
        for (int i = 0; i < a.length; i++) {
            sum = sum + a[i].getCallories();
            sum1 = sum1 + a[i].getGramm();
            v = v + a[i].getName() + ", ";

            // Arrays.sort(new int[]{a[i].getCallories()});

            //  System.out.println(a[i].getCallories());
        }


            System.out.println("Салат Осенний.Состав:" + v + " Количество калорий=" + sum + ". " + "Количество грамм=" + sum1 + ".");

        for (vegetebls d : a) {
            if (d.getCallories() > 50 & d.getCallories() < 100)
                System.out.println("Овощи которые имеют калорийность меньше 100 и больше 50= " + d.getName());
        }


}}