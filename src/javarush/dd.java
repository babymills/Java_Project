package javarush;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by pc on 09.02.2016.
 */
public class dd {
    public static void main(String[] args) throws IOException {
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
    int array1[]=new int[10];
    for(int i = 0;i<array1.length;i++){
        array1[i]= Integer.parseInt(reader.readLine());
    }
    int array[] = array1.clone();
        for(int i =0;i<array1.length;i++){
            array[i]= array1[9-i];
        }
        array1=array;
    for(int x:array1){
        System.out.println(x);
    }
}
}
