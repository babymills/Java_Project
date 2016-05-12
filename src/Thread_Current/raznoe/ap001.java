package Thread_Current.raznoe;

import Java_Lang.Stri;

/**
 * Created by привет on 02.05.2016.
 */
public class ap001 implements Runnable{
private String st = "firs";
private String fin = "last";

    public ap001(String st, String fin) {
        this.st = st;
        this.fin = fin;
    }

    public ap001() {
    }

    @Override
    public void run() {
        System.out.println(st);
    for(int  i = 0 ; i<3;i++) {
        System.out.println("Hello");
        Thread.yield();
    }
        System.out.println(fin);
    }

}
