package javarush;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 * Created by pc on 09.02.2016.
 */
public class vv {

        public static void main(String[] args) throws Exception
        {
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            int array[]=new int[20];
            for(int i = 0;i<array.length;i++){
                array[i]= Integer.parseInt(reader.readLine());
            }
            int array1 []= new int[10];
            int array2 []= new int[10];
            for(int i = 0;i<10;i++){
                array1[i] = array[i];
            }
            for(int i = 0;i<10;i++){
                array2[i] = array[i+10];
            }
            for(int x:array2){
                System.out.println(x);
            }
        }
    }

