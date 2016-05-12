package Thread_Current.BufferDemo;

/**
 * Created by привет on 06.05.2016.
 */
public class Consumer implements Runnable {
    private final SingleElementBuffer buffer;
    private int id;

    public Consumer(SingleElementBuffer buffer,int id) {
        this.buffer = buffer;
         this.id = id;
    }

    @Override
    public void run() {
        while (true)
        {
        try {
            Integer elem = buffer.get();
            System.out.println(System.currentTimeMillis()+" : "+elem + " consumer by" +id);

        }catch (InterruptedException e){
            System.out.println(Thread.currentThread().getName()+" stop");
            return;
        }
        }
    }
}
