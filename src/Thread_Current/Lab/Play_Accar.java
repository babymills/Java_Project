package Thread_Current.Lab;

/**
 * Created by привет on 30.04.2016.
 */
public class Play_Accar {
    public static void main(String[] args) throws InterruptedException {
        Runnable printA = new PrintRunne("A   .",100);
        Thread threadA = new Thread(printA);//новый поток
        threadA.start();
        Runnable printB = new PrintRunne(".    B",99);
        Thread threadB = new Thread(printB);//новый поток
        threadB.start();
        threadA.join();
        threadB.join();
        System.out.println("--------");
        Runnable runnableC= new PrintRunne("    c",100);
        runnableC.run();//поток мзйн
        System.out.println("--------");
    }
}
