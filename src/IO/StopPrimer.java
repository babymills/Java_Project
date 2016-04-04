package IO;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

/**
 * Created by привет on 26.03.2016.
 */
public class StopPrimer {//ввод и ввывод текста псле наж стоп
    public static void main(String[] args) throws IOException {
        ArrayList<String> list= new ArrayList<>();
        BufferedReader reader= new BufferedReader(new InputStreamReader(System.in));
while (true){
    String n=reader.readLine();
   if (n.equals("stop"))break;
   else  list.add(n);
}   for (String v:list){
            if (v.equals("stop")) break;
                System.out.println(v);
        }
    }
}
