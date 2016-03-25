package Current;

/**
 * Created by pc on 14.01.2016.
 */
public class ThreadDemo {
    public static void main(String[] args) {
        Thread t = Thread.currentThread();
        System.out.println("ТЕКУЩИЙ ПОТОК " + t);
        t.setName("My Thread");
        System.out.println("После изменения имени потока: " + t);
        try {
            for(int n=0;n<10;n++){
                System.out.println(n);
                Thread.sleep(1000);

            }

        } catch (InterruptedException e) {
            System.out.println("Главный поток исполнения прерван");
        }
    }
}
