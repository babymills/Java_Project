package Java_Lang;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by PC on 14.03.2016.
 */
public class Ap001 {
    public static void main(String[] args) throws IOException {
        /*String s = "one";
        String s1 = s.concat("two");
        String s2 = "Hello".replace("l","w");
        String s3 = "     Hello world  ".trim();
---------------------------------------------------------*/


           /* BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            String str;
            System.out.println("Bвeдитe 'стоп' для завершения.");
            System.out.println("Bвeдитe название штата : ") ;
            do {
                str = br.readLine();
                str = str.trim();
                if (str.equals("Иллинойс"))
                    System.out.println("Cтoлицa - Спрингфилд .");
                else if (str.equals("Миccypи"))
                    System.out.println(" Cтoлицa - Джефферсон-сити . ");
                else if (str.equals(" Kaлифopния "))
                    System.out.println(" Cтoлицa- Сакраменто . ");
                else if (str.equals(" Baшингтoн "))
                    System.out.println(" Cтoлицa - Олимпия .");
            }  while ( ! str.equals("стоп"));*/
        //------------------------------------------------------------
        long s = 10000000000000L;
        String.valueOf(s) ;
        System.out.println(s+1000);
    }
}
