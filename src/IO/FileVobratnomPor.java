package IO;

import java.io.*;
import java.util.LinkedList;

/**
 * Created by привет on 01.04.2016.
 */
public class FileVobratnomPor {
    public static String read(String filename) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(
                new FileInputStream(filename),"CP1251"));
        String s;
        StringBuilder b = new StringBuilder();
        while ((s=in.readLine()) !=null)
            b.append(s+"\n");
        in.close();
return b.toString();
    }
    public static LinkedList rec(String g){
        byte[] vv = g.getBytes();
        LinkedList list = new LinkedList();
        for (int y=0;y<vv.length;y++){
            list.add((char)vv[y]);
        }

    for(int i =list.size()-1;i>=0;i--){
            System.out.print(list.get(i));
        }
     return list;
    }
    public static void main(String[] args)throws IOException {
        String g=read("c://idea//dh.txt");

     rec(g);
    }
}
