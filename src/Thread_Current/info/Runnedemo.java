package Thread_Current.info;

/**
 * Created by привет on 26.04.2016.
 */
public class Runnedemo {
    public static void main(String[] args) {
        Runnable r = new Runnable() {
            @Override
            public void run() {
                System.out.println("run");
            }
        };
        System.out.println(r.getClass().getName());
    }
}
