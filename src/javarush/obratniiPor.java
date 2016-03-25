package javarush;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by pc on 09.02.2016.
 */
public class obratniiPor {
    public static void main(String[] args) throws IOException {
    BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
    String array [] = new String[10];
    for(int i = 0;i<8;i++){
        array[i]=reader.readLine();
    }
    for(int i = 9;i>-1;i--){
        System.out.println(array[i]);
    }
}

}
