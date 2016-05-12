package Thread_Current.raznoe;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * Created by привет on 03.05.2016.
 */
public class ChackedPool {
    public static void main(String[] args) {
       // ExecutorService ex = Executors.newFixedThreadPool(5);фиксация кол потоков
       ExecutorService ex = Executors.newSingleThreadExecutor();//последовательность выполнения
                for(int i = 0 ; i < 5 ; i++ )
            ex.execute(new Lifftoff());
            ex.shutdown();

    }
}
