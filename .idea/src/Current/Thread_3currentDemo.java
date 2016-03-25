package Current;

/**
 * Created by pc on 14.01.2016.
 */
public class Thread_3currentDemo {
    public static void main(String[] args) {
        new Thread_3current("Один");
        new Thread_3current("Два");
        new Thread_3current("Три");
    try{
Thread.sleep(10000);
    }catch(InterruptedException e){


        System.out.println("Главный поток прерван");
    }
        System.out.println("Главный поток завершен");
}}


