package zadachi;

import Java_Lang.Stri;

/**
 * Created by привет on 26.03.2016.
 */
public class ap02 {

    public static void main(String[] args) {
  String s = "bhhj hhgg hhhjj bgghh";
        String sea = "hhgg";
        String bb= "nnnnnnnnn";
        String b = "";
        int i = s.indexOf(sea);
        b=s.substring(0,i)+bb +s.substring(i+sea.length(),s.length());
        System.out.println(b);
        //---------------------------
        //2 решение
        String n = "buhgghujjj bhj bb jjjj bb jjihgg jj";
        String nn= n.replaceAll("bb","mm");
        System.out.println(nn);



        int in = 1100;
        double c = 7.2;
        double v= in*c;
        System.out.println(v);

    }
}
