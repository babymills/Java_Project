package javarush;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by pc on 07.02.2016.
 */
public class main extends fs{


    public static void main(String[] args) throws Exception
    {
        int[] array = initializeArray();
        int max = max(array);
        System.out.println(max);
    }
    public static int[] initializeArray() throws IOException {
        //Инициализируйте (создайте и заполните) массив тут
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int array [] = new int[4];
        for(int i = 0;i<array.length;i++){
            array[i]=Integer.parseInt(reader.readLine());
        }
        return array;
    }

    public static int max(int[] array) {
        //Найдите максимальное значение в этом методе
        int x = array[0];
        for(int i =1;i<array.length;i++){
            if(array[i]>x)
                x=array[i];
        }
        return x;
    }
}
