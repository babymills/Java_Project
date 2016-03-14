package ArrayList;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

/**
 * Created by pc on 09.02.2016.
 */
public class list {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<String> list = new ArrayList<String>();
        for (int i = 0; i < 10; i++)
        {
            String s = reader.readLine();
            list.add(s);
            //list.set(3,"d");запись елемента в массив
            //list.get(3);взять элемент
            //list.size();размер массива
            //ArrayList<String> list = new ArrayList<String>();создть массив
            //list.add(2,"d");добавить в 2 эл д
            //list.add(0,"d");добавить в начало д
            //list.remove(4);удалить 4 элемент
        }

        for (int i = 0; i < list.size(); i++)
        {
            int j = list.size() - i - 1;
            System.out.println( list.get(j) );
        }
    }
}
