package Current;

/**
 * Created by pc on 14.01.2016.
 */
public class Thread_3current implements Runnable{
    String name;
    Thread t;
    Thread_3current(String threadname){
        name = threadname;
        t=new Thread(this,name);
        System.out.println("Новый поток "+t);
        t.start();
    }
    @Override
    public void run() {
        try{
            for(int i=5;i>0 ;i--){
                System.out.println(name+": "+i);
                Thread.sleep(1000);
            }


        } catch (InterruptedException e) {
            System.out.println(name+" прерван");
        }
        System.out.println(name+" завершен");
    }
    }

