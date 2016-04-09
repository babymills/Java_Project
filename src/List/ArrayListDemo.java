package List;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

/**
 * Created by pc on 09.02.2016.
 */
public class ArrayListDemo {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<String> list = new ArrayList<String>();
        //list.ensureCapacity(5);//увеличываем разщмер листа вручную.экономя память
        for (int i = 0; i < 10; i++)
        {
            String s = reader.readLine();
            list.add(s);

            //ArrayListDemo.set(3,"d");запись елемента в массив
            //ArrayListDemo.get(3);взять элемент
            //ArrayListDemo.size();размер массива
            //List<String> ArrayListDemo = new List<String>();создть массив
            //ArrayListDemo.add(2,"d");добавить в 2 эл д
            //ArrayListDemo.add(0,"d");добавить в начало д
            //ArrayListDemo.remove(4);удалить 4 элемент
        }

        for (int i = 0; i < list.size(); i++)
        {
            int j = list.size() - i - 1;
            System.out.println( list.get(j) );
        }
        /*int index = catnamesList.indexOf("Рыжик");

// выводим имя кота и его номер в массиве
        editResult.setText("Рыжик числится под номером " + index);*/
        //-------------------------------
        /*Integer[]a = new Integer[list.size()];
        a=list.toArray(a);
        toArray возращает значения*/
    }
}
