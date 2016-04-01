package IO;

import com.sun.xml.internal.fastinfoset.util.CharArray;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.Arrays;
import java.util.zip.GZIPInputStream;
import java.util.zip.GZIPOutputStream;

/**
 * Created by привет on 31.03.2016.
 */
public class AdapterDemo {
    public static void main(String[] args) throws IOException {
      /*  ByteArrayOutputStream buff= new ByteArrayOutputStream();
        for (int i=0;i<10;i++){
            buff.write(new byte[]{70,71,72});

        }
   byte [] bytes =buff.toByteArray();
        System.out.println(Arrays.toString(bytes));*/
        //-----------------------------------------
      /*  StringWriter buff= new StringWriter();
        for (int i=0;i<10;i++){
            buff.write(new char[]{'g',71,72+1});

        }
        String str  =buff.toString();

        System.out.println(str);*/
        //------------------------------------
      /*  CharArrayWriter buff= new CharArrayWriter();
        for (int i=0;i<10;i++){
            buff.write(new char[]{'g',71,72+1});

        }
        char [] str  =buff.toCharArray();

        System.out.println(str);*/
        //---------------------------------------
       /* char []chars = new char[]{'s','d','d'};
        f(new CharArrayReader(chars));
    }

    private static void f(Reader read) throws IOException {
        int c;
        while((c = read.read()) != -1){
            System.out.println((char) c);
        }*/
    //---------------------------------------
       /* DataOutputStream da = new DataOutputStream(new FileOutputStream(new File("C://idea//ttttt.txt")));
        for (int i=0;i<1000;i++){
            da.writeDouble(123.45);
        }
        da.flush();
        da.close();
    */
     /*   DataOutputStream da = new DataOutputStream(new GZIPOutputStream(new BufferedOutputStream(
                new FileOutputStream(new File("C://idea//ttttt.txt")))));
        for (int i=0;i<1000;i++){
            da.writeDouble(123.45);
        }
        da.flush();
        da.close();

        DataInputStream in = new DataInputStream(new GZIPInputStream(new BufferedInputStream(
                new FileInputStream(new File("C://idea//ttttt.txt")))));
        for (int i=0;i<1000;i++){

        System.out.println(in.readDouble());}*/
      /*  try {
            BufferedReader br = new BufferedReader(new FileReader("c://idea//d.txt"));
            String s;
            while ((s = br.readLine()) != null) {
                System.out.println(s);//читает с файла текст упрощенно
            }
            br.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }*/
         /*  String pa = "c://idea//re.txt";
        String bb = "\nhhh";
        Files.write(Paths.get(pa),bb.getBytes(), StandardOpenOption.APPEND);
  BufferedReader br=new BufferedReader (new InputStreamReader(
          new FileInputStream("c://idea//re.txt"),"CP1251"));
        String s;
        while ((s = br.readLine()) != null) {
            System.out.println(s);//читает с файла т8екст упрощенно
        }*///добавляет текст

        String pa = "c://idea//re.txt";
        String bb = "\nhhh";
        FileWriter writer= new FileWriter(pa,true);
        BufferedWriter wr=new BufferedWriter(writer);
        wr.write(bb);
        wr.close();

    }
}
