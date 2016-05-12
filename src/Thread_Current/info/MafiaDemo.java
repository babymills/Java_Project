package Thread_Current.info;

/**
 * Created by привет on 29.04.2016.
 */
public class MafiaDemo {
//тут пример я вызываю поток следом воторой..жду когда
    //умрёт воторой поток вывожу сообщение и продолжаю дальше свою работу
    public static void main(String[] args) {
    Thread thread=    new Thread(new Runnable() {
            @Override
            public void run() {
                for(int i = 0 ; i<10;i++){
                    sillyWork();
                    Thread.yield();
                    System.out.println("Hello!");
                }
            }
        });
        thread.start();
        for(int i = 0 ; i<5;i++){
            sillyWork();
            System.out.println("Bye!");

    }
        System.out.println("The end .. Second thread");
}
private static void sillyWork(){
double d = 2.0;
    for(int i = 0 ; i<10_000_000;i++){
    d = Math.sin(2);}
}
}