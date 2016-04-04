package IO;

import java.io.*;

/**
 * Created by привет on 02.04.2016.
 */
public class UtfCodirovca {
    public static void main(String[] args) throws IOException {
        String v = "Hello";
        try(OutputStream out = new FileOutputStream(new File("c://idea//utf8.txt"));){
            Writer st = new OutputStreamWriter(out,"UTF-8");
            st.write(v);
            st.flush();
            InputStream tt = new FileInputStream("c://idea//utf8.txt");
            int vv;
            while ((vv=tt.read()) !=-1){
                System.out.println((char)vv);
            }
        }
    }
}
