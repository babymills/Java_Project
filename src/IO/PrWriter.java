package IO;

import java.io.*;

import static IO.class_0.readFullyByByte;
import static java.lang.System.in;

/**
 * Created by привет on 27.03.2016.
 */
public class PrWriter {

    public static void main(String[] args) throws IOException {
        try(FileInputStream list = new FileInputStream("C://idea//d.txt");){

        readFullyByByte(list);

            list.mark(2);

        //int c =list.available();
        //System.out.println(c);
     //   list.close();
      //  readFullyByByte(list);//повторный вызов клоз вызовет ошибку
    }catch (IOException r){
            System.out.println("Error");
        }}
    public static void readFullyByByte(InputStream in) throws IOException {
        while (true) {
            int oneByte = in.read();
            if (oneByte != -1) {
                System.out.print((char) oneByte);
            } else
                break;//метод что бы читать с текста сайта и байтов

        }
}}
