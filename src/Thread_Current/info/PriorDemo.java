package Thread_Current.info;

/**
 * Created by привет on 29.04.2016.
 */
public class PriorDemo {
//детерменированная или по другоу синхронизация программа ..
// когда потоки обслуживаются по очереди
    //пример с одним туалетом на 20 человек..у кого выше приоретите тот первый
    //если их не сколько то по четко определёному времени
    public static void main(String[] args) {
    Thread thread=    new Thread(new Runnable() {
            @Override
            public void run() {
                for(int i = 0 ; i<5000;i++){
                    sillyWork();
                    Thread.yield();
                    System.out.println("Hello!");
                }
            }
        });
        thread.setPriority(Thread.MIN_PRIORITY);
        thread.start();
        for(int i = 0 ; i<5000;i++){
            sillyWork();
            System.out.println("Bye!");
    }
}
private static void sillyWork(){
double d = 2.0;
    for(int i = 0 ; i<10_000_000;i++){
    d = Math.sin(2);}
}
}