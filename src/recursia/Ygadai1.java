package recursia;
import java.io.*;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.Random;
import java.util.Scanner;

public class Ygadai1 {

    public static void mm (int[]vb) throws IOException {
        Scanner scanner = new Scanner(System.in);
        Random rand = new Random();
        int x=0;
        int y= vb.length;
        if(vb.length==7){
         x = rand.nextInt(100);
            System.out.println("Вводите числа");}
        else if(vb.length==5){
            x = rand.nextInt(60);
            System.out.println("Вводите числа");}
        else if(vb.length==4){
            x = rand.nextInt(30);
            System.out.println("Вводите числа");}
        int k  =0;
        for(int i =0 ;i<vb.length;i++){
                  vb[i]= scanner.nextInt();
            if(vb[i]==x){

                f(k);
                break;}
            else if(vb[i]>x){
                System.out.println("Не угaдал, меньше. Осталось "+(y-1)+"попыток(и)"+x);
            }else if(vb[i]<x){
                System.out.println("НЕ угадал, больше. Осталось "+(y-1)+"попыток(и)"+x);
            }
            if(y == 1)
                System.out.println("Мне жаль ты проиграл это было число: "+x);
            k++;
        y--;}
    return ;}
    public static void main(String[] args) throws IOException{
        Scanner scanner = new Scanner(System.in);
        System.out.println("Давай поиграем я загадаю число а ты попробуй угадать.");
        System.out.println("Выбери уровень сложности:" +'\n'+ "1.легкий. Числа от 0 до 30(попыток: 4)"+'\n'+ "2.средний. Числа от 0 до 60(попыток: 5)"+'\n'+ "3.сложный. Числа от 0 до 100(попыток 7)");
        int w =0;
        try {
            do{
            w = scanner.nextInt();
        if(w==3){
            int c []= new int[7];
          mm(c);
        }else if(w==2){
            int c []= new int[5];
            mm(c);
        }else if(w==1) {
            int c[] = new int[4];
            mm(c);
        }
        } while(!(w==1|w==2|w==3));
        } catch (Exception e) {
            System.out.println("Error. НЕизвестная ошибка. Возможно вы ввели символ а не цифру или арефреметическое действие");
        }}

    private static void f(int i) throws IOException {
        System.out.println("Введите свое имя");
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        System.out.println("Поздравляю "+s+" ты угaдал(а) с "+ i+"попытки");
      String c = "name: "+s +" c "+i+" попытки";
        Writer out = new BufferedWriter(new OutputStreamWriter(
                new FileOutputStream("c://io//re.txt",true), "CP1251"));
        out.append("\n");
        out.append(c);
        out.close();
        BufferedReader br=new BufferedReader (new InputStreamReader(
                new FileInputStream("c://io//re.txt"),"CP1251"));
        String s1;
        while ((s1 = br.readLine()) != null) {
            System.out.println(s1);//читает с файла текст упрощенно
        }


    }}

