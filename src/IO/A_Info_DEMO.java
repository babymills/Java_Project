package IO;

import java.io.*;
import java.net.URI;

/**
 * Created by привет on 10.04.2016.
 */
public class A_Info_DEMO {
    public static void main(String[] args) throws IOException {
//        File obFile = new File("\\com\\file.txt");
//        File obDir = new File("c:/jdk/src/java/io");
//        File obFile1 = new File(obDir, "File.java");
//        File obFile2 = new File("c:\\com", "file.txt");
//        File obFile3 = new File(new URI("Интернет-адрес"));
        File root = File.listRoots()[1];
        Writer out = new BufferedWriter(new OutputStreamWriter(
                new FileOutputStream("c://idea//re.txt"), "UTF8"));
String c  = "sd";
        out.write(c);
        System.out.println("\n%s %,d with %,d free."+" "+
               root.getPath()+" "+ root.getUsableSpace()/1000000+"mb "+ root.getTotalSpace()/1000000);


    }
}
