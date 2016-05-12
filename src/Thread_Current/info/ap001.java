package Thread_Current.info;

/**
 * Created by привет on 27.04.2016.
 */
public class ap001 {
    public static void main(String[] args) {
        Thread thread = Thread.currentThread();
        System.out.println("thred(): "+ thread.getName());
        Thread th = new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("run(): "+ Thread.currentThread().getName());
            }
        });
        th.start();
    }
}
