package lesons;

import java.util.Scanner;

/**
 * Created by Катя on 17.11.2015.
 */
public class month {
    public static void main(String args[]) {
        System.out.println("Введите номер месяца(ниже и нажми Enter):");
        Scanner scanner = new Scanner(System.in);
        int month = scanner.nextInt();
        String season;
        if (month == 12 )
            season = "зиме это декабрь ";
        else if (month == 1 )
            season = "зиме это январь ";
        else if (month == 2)
            season = "зиме это февраль ";
        else if (month == 3)
            season = " весне это март";
        else if (month == 4 )
            season = "весне это апрель ";
        else if (month == 5 )
            season = "весне это май ";
        else if (month == 6 )
            season = "лету это июнь ";
        else if (month == 7 )
            season = "лету это июль ";
        else if (month == 8 )
            season = "лету это август ";
        else if (month == 9 )
            season = "осени это сентябрь ";
        else if (month == 10 )
            season = "осени это октябрь ";
        else if (month == 11 )
            season = "осени это ноябрь ";
        else
            season = " Вымешленным месяцам";
        System.out.println(month + " Месяц относится к "  + season + ".....");
    }
}