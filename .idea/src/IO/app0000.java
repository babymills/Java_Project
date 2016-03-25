package IO;
import java.io.FileOutputStream;
        import java.io.IOException;
        import java.io.InputStream;
        import java.io.OutputStream;
        import java.net.MalformedURLException;
        import java.net.URL;


/**
 * Created by привет on 25.03.2016.
 */
public class app0000 {



    public static void main(String[] args) throws IOException {
        InputStream src = new URL("http://google.com").openStream();
        OutputStream dsc = new java.io.FileOutputStream("c:/idea/gg.txt");
        copy(src,dsc);
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
