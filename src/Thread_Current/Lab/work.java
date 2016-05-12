package Thread_Current.Lab;

/**
 * Created by привет on 30.04.2016.
 */
public class work implements Runnable {
    @Override
    public void run() {
        Runnable c = new PrintRunne("A",98);
        Thread r = new Thread(c);
        r.start();
        Runnable c1 = new PrintRunne("B",99);
        Thread r1 = new Thread(c1);
        r1.start();
        try {
            r.join();
            r1.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }}
