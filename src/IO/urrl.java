package IO;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.MalformedURLException;
import java.net.URL;

/**
 * Created by привет on 25.03.2016.
 */
public class urrl {
    public static void main(String[] args) throws IOException {

        InputStream src = new URL("http://google.ru").openStream();
      //  OutputStream dsc = new java.io.FileOutputStream00("c:\\idea\\g.txt");
       // copy(src,dsc);//в файл
          copy(src,System.out);//на консоль
    }
    public  static void copy(InputStream src, OutputStream dsc) throws IOException {
        while (true){
            int data = src.read();
            if(data !=-1){
                dsc.write(data);
            }else return;
        }
    }
}
