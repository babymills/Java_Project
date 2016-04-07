package Java_Lang;

import java.io.IOException;

/**
 * Created by PC on 14.03.2016.
 */
public class Appe {
    public static void main(String[] args) throws IOException {
      /*  String s = "This text";
        String upper = s.toUpperCase();
        String lower = s.toLowerCase();
        System.out.println(upper);
        System.out.println(lower);
        String c = "";
        boolean v = c.isEmpty();
        System.out.println(v);
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        List<String> ArrayListDemo = new List<>();
        for(int i  = 0;i<5;i++) {
            String sqw = reader.readLine();
          ArrayListDemo.add(sqw);
            while (sqw.isEmpty()) {
                break;
            }
        }
         for(String q:ArrayListDemo){
             System.out.println(q);
         }*/
        //---------------------------------------
         /* StringBuffer b = new StringBuffer("cdsd");//буфер стрингов

        b.setLength(3);//типо lenght только наоборот сам выделяешь сколько нужно

        System.out.println(b.capacity());//показывает сколь байт занимает.16 байт резервирует
        System.out.println(b);*/
        //---------------------------------------------------------------
        StringBuffer sb = new StringBuffer("I am Java");
        System.out.println(sb.insert(5,"like "));

        System.out.println(sb.reverse());//задом наперед
        System.out.println(sb.delete(0,2));//удалить
        System.out.println(sb.replace(3,4,"ccc"));//заменить
        }
    }

