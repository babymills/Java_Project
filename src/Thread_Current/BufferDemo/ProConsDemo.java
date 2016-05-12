package Thread_Current.BufferDemo;

/**
 * Created by привет on 06.05.2016.
 */
public class ProConsDemo {
    public static void main(String[] args) {
        SingleElementBuffer buffer = new SingleElementBuffer();
        //поток производит и потребляет сразу ресур
        /*new Thread(new Producer(1,1000,buffer)).start();
        new Thread(new Consumer(buffer)).start();*/
        //создаются больше поток производства чем потребления
        new Thread(new Producer(1,300,buffer)).start();
        new Thread(new Producer(100,500,buffer)).start();
        new Thread(new Producer(1000,700,buffer)).start();
        new Thread(new Consumer(buffer,1)).start();
        new Thread(new Consumer(buffer,2)).start();
    }
}
