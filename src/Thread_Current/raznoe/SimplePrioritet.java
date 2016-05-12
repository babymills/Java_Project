package Thread_Current.raznoe;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;

/**
 * Created by привет on 03.05.2016.
 */
public class SimplePrioritet implements Runnable {
private int countDown  = 5;
    private volatile double d;
    private int priority;

    public SimplePrioritet(int priority) {
        this.priority = priority;
    }

    @Override
    public String toString() {
        return Thread.currentThread() +": " + countDown;
    }

    @Override
    public void run() {
        Thread.currentThread().setPriority(priority);
        while (true){
            for(int i =1;i<10000;i++){
                d+=(Math.PI + Math.E)/(double)i;
                if(i%1000 ==0)
                    Thread.yield();
            }
            System.out.println(this);
            if(--countDown ==0)return;
        }
    }

    public static void main(String[] args) {
        ExecutorService ex = Executors.newCachedThreadPool();
        for(int i = 0 ; i < 5 ; i++ )
            ex.execute(new SimplePrioritet(Thread.MAX_PRIORITY));
            ex.execute(new SimplePrioritet(Thread.MIN_PRIORITY));
    ex.shutdown();
    }
}
