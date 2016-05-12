package Thread_Current.dead;

/**
 * Created by привет on 29.04.2016.
 */
public class DeadLock01 {
    public static void main(String[] args) throws InterruptedException {
        Thread.currentThread().join();//смерть ситемы
    }
}
