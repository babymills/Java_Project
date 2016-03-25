package Current;

/**
 * Created by pc on 14.01.2016.
 */
public class NewThread implements  Runnable{
Thread t;
    NewThread(){
        t =new Thread(this,"Демонстративный поток");
        System.out.println("Дочерний поток"+t);
        t.start();//запуститть поток исполнения
    }
    @Override
    public void run() {
try{
    for(int i=5;i>0 ;i--){
        System.out.println("Дочерний поток создан:"+i);
        Thread.sleep(500);
    }


} catch (InterruptedException e) {
    System.out.println("Дочерний поток прерван");
}
        System.out.println("Дочерний поток завершен");
    }
}
