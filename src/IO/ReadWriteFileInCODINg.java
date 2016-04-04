package IO;

import java.io.*;

/**
 * Created by привет on 31.03.2016.
 */
public class ReadWriteFileInCODINg {
    public static void main(String[] args) throws IOException {
        int c1=1;
        String c = "Таблица рекордов:"+"\n"+"  Имя: " +" c "+" попытки";
        Writer out = new BufferedWriter(new OutputStreamWriter(
                new FileOutputStream("c://idea//d.txt"), "CP1251"));
        out.write(c1++ + ": "+c);
        out.close();
    //    InputStream inFile   = new BufferedReader(new InputStreamReader(new
      //          FileInputStream("C:\\idea\\re.txt"),"UTF-8"));
     //   readFullyByByte(inFile);


    }
    public static void readFullyByByte(InputStream in) throws IOException {
        while (true) {
            int oneByte = in.read();
            if (oneByte != -1) {
                System.out.print((char) oneByte);
            } else {
                System.out.print("\n" + "end");
                break;//метод что бы читать с текста сайта и байтов
            }
        }}}