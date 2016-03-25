package LabsOOP.labs0_1;

import java.util.Arrays;

/**
 * Created by Катя on 27.10.2015.
 */
public class Salat {
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
            v = v + a[i].getName() + ", ";}
        System.out.println("Сортировка овощей по калориям");
        Arrays.sort(a);
        for(vegetebls x:a){
            System.out.println(x);
        }
        System.out.println("Салат Осенний.Состав:" + v + " Количество калорий=" + sum + ". " + "Количество грамм=" + sum1 + ".");

        for (vegetebls d : a) {
            if (d.getCallories() > 50 & d.getCallories() < 100)
                System.out.println("Овощи которые имеют калорийность меньше 100 и больше 50= " + d.getName());
        }  }}


