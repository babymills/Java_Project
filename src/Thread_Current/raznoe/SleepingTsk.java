package Thread_Current.raznoe;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

/**
 * Created by привет on 03.05.2016.
 */
public class SleepingTsk extends Lifftoff {
    @Override
    public void run() {
        try {
            while (CountDown-- > 0) {
                System.out.println(status());
                  TimeUnit.MILLISECONDS.sleep(1000);
            }
            System.out.println(100+"MilliSeconds ");

        } catch (InterruptedException e) {
            e.printStackTrace();

        }
    }

    public static void main(String[] args) {
        ExecutorService ex = Executors.newCachedThreadPool();
        for(int i = 0 ; i < 5 ; i++ )
        ex.execute(new SleepingTsk());
        ex.shutdown();
    }
}