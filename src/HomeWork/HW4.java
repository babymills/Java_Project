/**
 * Created by Катя on 29.09.2015.
 */
public class HW4 {
    public static void main(String args[]) {
        int pass = 1111;
        String num;
        if (pass==1011)
            num = "Пароль не верный ";
        else if (pass == 1111 )
            num = "Пароль верный ";
        else if (pass == 1001 )
            num = "Пароль не верный ";
        else if (pass == 0111 )
            num = "Пароль не верный ";
        else
            num = "Пароль не верный";
        System.out.println(num);

    }
}
