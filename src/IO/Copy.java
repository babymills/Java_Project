package IO;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.MalformedURLException;
import java.net.URL;

/**
 * Created by Катя on 01.12.2015.
 */
public class Copy {
    public static void main(String[] args) throws IOException {
      InputStream src = new URL("http://vk.com").openStream();
     //  OutputStream dst = new FileOutputStream("d:/dom.txt");
        copy(src,System.out);

    }
    public static  void copy(InputStream src, OutputStream dst) throws IOException{
        while(true){
            byte[] da = new byte[1024*64];
            int data = src.read(da);
            if (data !=-1){
                dst.write(da,0,data);

            }else{

                return;
            }
        }
    }
}
