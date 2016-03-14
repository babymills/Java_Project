package Java_Lang;

/**
 * Created by PC on 13.03.2016.
 */
public class Replac {
    public static void main(String[] args) {
        String org = "This is a man.Those is man";
        String search = "man";
        String sub = "women";
        String result = "";
        int i;
        do {
            System.out.println(org);
        i = org.indexOf(search);
        if (i!=-1){
           result = org.substring(0,i);
           result = result+sub;
            result = result +org.substring(i+search.length());
          org= result;
        }} while (i!=-1);
    }
}
