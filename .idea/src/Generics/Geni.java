package Generics;

import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

/**
 * Created by pc on 18.01.2016.
 */
public class Geni<T> {
    T ob;

    public Geni(T ob) {
        this.ob = ob;
    }

    public T getOb() {
        return ob;
    }
    void showType(){
        System.out.println("ТИП Т является "+ob.getClass());
    }
}
