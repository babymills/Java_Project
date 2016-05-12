package Thread_Current.info;

/**
 * Created by привет on 05.05.2016.
 */
public class WaitDemo {
    public static void main(String[] args) throws InterruptedException {
        Object ref = new Object();
  synchronized (ref) {
      ref.notify();
  }
    }
}
