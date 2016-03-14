package IO;

import sun.java2d.pipe.BufferedBufImgOps;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by pc on 18.01.2016.
 */
public class TinyEdit {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str[] = new String[100];
        System.out.println("Start");
        for(int i=0;i<100;i++){//ПОЗВОЛЯТ НЕ ВЫХОДИТЬ ПОКА НЕ НАПИШЕШЬ СТОП
            str[i]=br.readLine();
            if (str[i].equals("stop"))
                break;
            }
        System.out.println("In");
        for(int i=0;i<100;i++){
            if (str[i].equals("stop")) break;
            System.out.println(str[i]);
        }
    }
}
