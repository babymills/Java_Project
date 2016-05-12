package Thread_Current.raznoe;

/**
 * Created by привет on 02.05.2016.
 */
public class Ma {
    public static void main(String[] args) {
            Runnable  r = new ap001();
        for(int i = 0 ; i<3;i++){
            Thread  t  = new Thread(r);
            t.start();
            t.yield();
        }
    }
}
