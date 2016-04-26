package Collection;

import javafx.beans.property.adapter.JavaBeanBooleanProperty;
import lesons.S;

import java.util.Set;
import java.util.TreeSet;

/**
 * Created by привет on 17.04.2016.
 */
public class TreeSetDemo {
    public static void main(String[] args) {
        Set<H> set = new TreeSet<>();
        set.add(new H(2,3));
        set.add(new H(1,3));
        set.add(new H(1,1));
        for (Object v : set){
        System.out.println(v);}

    }

}
class H implements Comparable<H>{
    public int d;
    public int v;

    public H(int d, int v) {
        this.d = d;
        this.v = v;
    }

    @Override
    public int compareTo(H that) {//адаптированный метод для сравнени
int dx = this.d-that.d;
        if(dx!=0){
            return dx;}
        else {
        return this.v - that.v;}
    }

    @Override
    public String toString() {
        return "H{" +
                "d=" + d +
                ", v='" + v + '\'' +
                '}';
    }
}