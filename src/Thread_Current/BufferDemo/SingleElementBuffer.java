package Thread_Current.BufferDemo;

/**
 * Created by привет on 06.05.2016.
 */
public class SingleElementBuffer {
    private Integer elem = null;
            public synchronized void put(int newElem) throws InterruptedException{
                while (this.elem !=null){
                    this.wait();
                }
                this.elem = newElem;
                this.notifyAll();
            }
    public synchronized int get()throws InterruptedException{
        while (elem ==null){
            this.wait();
        }
        int result = this.elem;
        this.elem = null;
        this.notifyAll();
        return result;

    }
    }
