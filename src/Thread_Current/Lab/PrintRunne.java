package Thread_Current.Lab;

import jdk.management.resource.internal.inst.ThreadRMHooks;

/**
 * Created by привет on 30.04.2016.
 */
public class PrintRunne implements Runnable {
    private  String msg;
    private  long times;

    public PrintRunne(String msg, long times) {
        this.msg = msg;
        this.times = times;
    }

    @Override
    public void run() {
        //for(int i = 0;i<Integer.MAX_VALUE;i++){//истема умирает
        for(int i = 0;i<10;i++){
            try {
                Thread.sleep(times);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(msg);
        }
    }
}
