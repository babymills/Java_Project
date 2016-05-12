package Thread_Current.raznoe;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * Created by привет on 02.05.2016.
 */
public class Man003 {
    public static void main(String[] args){
    ExecutorService ex = Executors.newSingleThreadExecutor();//последовательность выполнения
    for(int i = 0 ; i < 5 ; i++ )
            //ex.execute(new ap001());
            ex.execute(new ap002(3));
    ex.shutdown();
    }
}
