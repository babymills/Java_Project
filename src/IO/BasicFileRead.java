package IO;

import org.omg.CORBA.portable.InputStream;

import java.io.*;

/**
 * Created by привет on 01.04.2016.
 */
public class BasicFileRead {
    public static void main(String[] args) throws IOException {
        //запмсь в файл
        // способ1
        String source = "Now is the time for all good men";
        byte buf[] = source.getBytes();
        try (FileOutputStream f0 = new FileOutputStream("C://idea//dh.txt");)
        {
            f0.write(buf);
    }
        //способ 2
        /*
           Writer out = new BufferedWriter(new OutputStreamWriter(
            new FileOutputStream("outfilename"), "UTF8"));
    out.write("asdf");
    out.close();
         */
        //Read file
        /*
        java.io.InputStream tt = new FileInputStream("c://idea//utf8.txt");
        int vv;
        while ((vv=tt.read()) !=-1){
            System.out.println((char)vv);*/
}}