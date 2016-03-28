package IO;

import java.io.File;

/**
 * Created by Катя on 28.11.2015.
 */
public class DirList {
    public static void main(String args[]) {
        String dirname = "C://idea";
        File f1 = new File(dirname);
byte n = 0;
        if (f1.isDirectory()) {
            System.out.println("Directory of " + dirname);
            String s[] = f1.list();

            for (int i=0; i < s.length; i++) {
                File f = new File(dirname + "/" + s[i]);
                if (f.isDirectory()) {
                    System.out.println(s[i] + " is a directory");
                } else {
                    int v = (byte) s[i].length();
                    n= (byte) (n+v);
                    System.out.println(s[i] + " is a file "+s[i].length()+"bytes");
                }
            }
        } else {
            System.out.println(dirname + " is not a directory");
        }
        System.out.println("Сумма байтов"+n);
    }
}

