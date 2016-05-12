package Thread_Current.raznoe;

/**
 * Created by привет on 02.05.2016.
 */
public class Lifftoff implements Runnable{
    protected int CountDown=10;
    private static int taskCount=0;
    private final int id = taskCount++;

    public Lifftoff() {    }

    public Lifftoff(int countDown) {
        CountDown = countDown;
    }

    @Override
    public void run() {
        while (CountDown-- >0){
            System.out.println(status());
            Thread.yield();
        }
    }

    public String status() {
    return "#" + id + "(" +(CountDown > 0 ? CountDown : " Liftoof") + "), ";
     }
}
