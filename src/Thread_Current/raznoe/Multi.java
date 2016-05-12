package Thread_Current.raznoe;

/**
 * Created by привет on 02.05.2016.
 */
public class Multi {
    public static void main(String[] args) {
        for(int i = 0 ; i<5;i++)
          new Thread(new Lifftoff()).start();
        System.out.println("Waiting");
    }
}
