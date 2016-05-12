package Thread_Current.Lab;

/**
 * Created by привет on 30.04.2016.
 */
public class Lab01 {
    public static void main(String[] args) throws InterruptedException {
   //     Runnable r = new work();
        Thread prorab = new Thread(new work());
        prorab.start();
        prorab.join();
        System.out.println("Я все");
    }}


