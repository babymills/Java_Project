package Thread_Current.dead;

/**
 * Created by привет on 29.04.2016.
 */
public class DeadLock02 {
    public static void main(String[] args) {
        final Thread [] threads = new Thread[2];
        threads[0] = new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    System.out.println("0 join to #1");
                    threads[1].join();
                } catch (InterruptedException ignore) {}
            }
        });
        threads[1] = new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    System.out.println("0 join to #1");
                    threads[0].join();
                } catch (InterruptedException ignore) {}
            }
        });
        threads[0].start();
        threads[1].start();
    }
}
