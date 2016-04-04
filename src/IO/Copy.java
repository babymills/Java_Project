package IO;

import java.io.*;
import java.io.FileOutputStream;
import java.net.MalformedURLException;
import java.net.URL;

/**
 * Created by Катя on 01.12.2015.
 */
public class Copy {
    public static void main(String[] args) throws IOException {
     // InputStream src = new URL("http://vk.com").openStream();вывод с сайта
      InputStream src = new FileInputStream("C://idea//d.txt");//вывод с текста
     PrintWriter dst = new PrintWriter("C://idea//g.txt");// запись в файл
        //copy(src,System.out);//метод что запичывать и выводить даные с сайта
        copy(src,dst);//метод что запичывать и выводить даные с сайта

    }
    public static  void copy(InputStream src,PrintWriter dst) throws IOException{
        while(true){
            String s;
            int c =1;
            byte[] da = new byte[1024*64];
            int data = src.read(da);
            if (data !=-1){
                dst.println(c++ +": "+data);
       }else{
                src.close();
                dst.close();
                return;
            }  //2 Method
        /*public static void readFullyByByte(InputStream in) throws IOException {
            while (true) {
                int oneByte = in.read();
                if (oneByte != -1) {
                    System.out.print((char) oneByte);
                } else {
                    System.out.print("\n" + "end");
                    break;//метод что бы читать с текста сайта и байтов
                }
            }*/
        }
    }
}
