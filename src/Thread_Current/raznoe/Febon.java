package Thread_Current.raznoe;

/**
 * Created by привет on 02.05.2016.
 */
public class Febon {
    public static void main(String[] args) {
        Runnable c = new ap002(5);
        Thread r = new Thread(c);
        r.start();
     //   r.yield();
        Runnable c1 = new ap002(10);
        Thread r1 = new Thread(c1);
        r1.start();
        r1.yield();
       // Runnable c2 = new ap002(5);
       // Thread r2 = new Thread(c2);
       // r2.start();
       // r2.yield();
        /*Runnable c3 = new ap002(10);
        Thread r3 = new Thread(c3);
        r3.start();
        r3.yield();
*/
    }
}
