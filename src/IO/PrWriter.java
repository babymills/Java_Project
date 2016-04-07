package IO;

import java.io.*;

/**
 * Created by привет on 27.03.2016.
 */
public class PrWriter {

    public static void main(String[] args) throws IOException {
        try(FileInputStream list = new FileInputStream("C://idea//d.txt");){

        readFullyByByte(list);

            list.mark(2);

        //int c =ArrayListDemo.available();
        //System.out.println(c);
     //   ArrayListDemo.close();
      //  readFullyByByte(ArrayListDemo);//повторный вызов клоз вызовет ошибку
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
