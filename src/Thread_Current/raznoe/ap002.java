package Thread_Current.raznoe;

import static les22_11.file1.a;

/**
 * Created by привет on 02.05.2016.
 */
public class ap002 implements Runnable {
    int  ooi ;
    private static int taskCount=0;
    private final int id = taskCount++;
    public ap002(int ooi) {
        this.ooi = ooi;
    }

    public int getI() {
        return ooi;
    }

    @Override
    public void run() {

        int b = 1;
        int c ;
        int a = 0  ;
        System.out.println("поток "+id+" "+a);
        for(int k = 0 ; k<ooi;k++){
            c = a+b;
            a =  b;
            b=c;
            System.out.println("поток "+id+": "+c);
        }
        System.out.println("The end" +": поток " +id);
    }
}
