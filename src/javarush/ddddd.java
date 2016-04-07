package javarush;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Created by pc on 09.02.2016.
 */
public class ddddd {
  //  public static void main(String[] args) throws Exception
   // {
      /*  List<String> ArrayListDemo = new List<String>();

        int index = 0;

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        for(int i = 0; i < 5; i++)
        {
            ArrayListDemo.add(reader.readLine());}
        for(int i=0;i<ArrayListDemo.size();i++) {
            index = ArrayListDemo.get(0).length();
            if (index < ArrayListDemo.get(i).length())
                index = i;
        }
        System.out.println(ArrayListDemo.get(index));
        for(int i  =0;i<ArrayListDemo.size();i++){
            if(ArrayListDemo.get(i).length()==ArrayListDemo.get(index).length()){
                System.out.println(ArrayListDemo.get(i));
            }
        }
    }
}*/
        /*BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        List<String> ArrayListDemo = new List<String>();
        int index = 0;
        int max = 0;
        String longest = null;
        for (int i = 0; i < 5; i++){
            String s = reader.readLine();
            ArrayListDemo.add(s);
        }
        for (int i = 0; i < ArrayListDemo.size(); i++){
            String s = ArrayListDemo.get(i);
            if (s.length() > max){
                max = s.length();
                longest = s;
            }
        }
        //System.out.println(longest);

        for(int i=0;i<ArrayListDemo.size();i++) {
            index = ArrayListDemo.get(0).length();
            if (index < ArrayListDemo.get(i).length())
                index = i;}
        for(int i  =0;i<ArrayListDemo.size();i++){
            if(ArrayListDemo.get(i).length()==ArrayListDemo.get(index).length()){
                System.out.println(ArrayListDemo.get(i));
    }}}}*/
        /*BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        List<String> ArrayListDemo = new List<String>();
        int index = 0;
        int max = 100;
        String longest = null;
        for (int i = 0; i < 5; i++){
            String s = reader.readLine();
            ArrayListDemo.add(s);
        }
        for (int i = 0; i < ArrayListDemo.size(); i++){
            String s = ArrayListDemo.get(i);
            if (s.length() < max){
                max = s.length();
                longest = s;
            }
        }
        //System.out.println(longest);

        for(int i=0;i<ArrayListDemo.size();i++) {
            index = ArrayListDemo.get(0).length();
            if (index < ArrayListDemo.get(i).length())
                index = i;}
        for(int i  =0;i<ArrayListDemo.size();i++){
            if(ArrayListDemo.get(i).length()==ArrayListDemo.get(index).length()){
                System.out.println(ArrayListDemo.get(i));
            }}}}*/
      /*  List<String> ArrayListDemo = new List<>();
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        for (int i=0;i<5;i++){
            ArrayListDemo.add(reader.readLine());
        }
        int x = ArrayListDemo.size()-1;
        String s = "";
        for(int i=0;i<13;i++){

            s= ArrayListDemo.get(x);
            ArrayListDemo.remove(x);
            ArrayListDemo.add(0,s);
        }
        for(int i=0;i<ArrayListDemo.size();i++){
            System.out.println(ArrayListDemo.get(i));

        }
          }
}*/
        /*BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        List<Integer> ArrayListDemo = new List<Integer>();

        while (true)
        {
            String s = reader.readLine();
            if (s.isEmpty()) break;

            int x = Integer.parseInt(s);
            if (x % 2 == 0)  //проверяем, что остаток от деления на два равен нулю
                ArrayListDemo.add(x);          //добавление в конец
            else
                ArrayListDemo.add(0, x);      //вставка в начало
        }
    }}*/
        public static void main(String[] args) throws Exception
        {
            //напишите тут ваш код
            ArrayList<Integer> list1 = new ArrayList<>();
            ArrayList<Integer> list11 = new ArrayList<>();
            ArrayList<Integer> list2 = new ArrayList<>();
            ArrayList<Integer> list3 = new ArrayList<>();
            //BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            Scanner scanner = new Scanner(System.in);
            for (int i=0;i<20;i++){
                list1.add(scanner.nextInt());
            }
           for(int x:list1) {
               if (x % 3 == 0) {
                   list11.add(x);}
                if (x % 2 == 0) {
                    list2.add(x);
                }
                else if (x % 2 == 0 & x % 3 == 0) {
                   list2.add(x);
                   list11.add(x);
               }  if(x % 2 != 0 && x % 3 != 0)
               list3.add(x);
            }
            System.out.println("NA 3"); printList(list11);
            System.out.println("NA2");printList(list2);
            System.out.println("dIF");printList(list3);
//printList(list1);
        }

    public static void printList(ArrayList<Integer> list)
    {
        for(int c :list){
            System.out.println(c);
        }
    }
}