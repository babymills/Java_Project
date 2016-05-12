package Thread_Current.info;

/**
 * Created by привет on 26.04.2016.
 */
public class RunDemo {
    public static void main(String[] args) {
        Runnable r = new RunnableImpl();
        Thread thread = new Thread(r);
        thread.start();
    }
}
