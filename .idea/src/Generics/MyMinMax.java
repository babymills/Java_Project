package Generics;

/**
 * Created by pc on 18.01.2016.
 */
public class MyMinMax<T extends Comparable<T>>implements MinMax<T> {
    T[]vals;

    public MyMinMax(T[] vals) {
        this.vals = vals;
    }

    @Override
    public T min() {
        T v = vals[0];
        for(int i=1;i<vals.length;i++)
            if(vals[i].compareTo(v)<0)
        v=vals[i];
                return v;
    }

    @Override
    public T max() {
        T v = vals[0];
        for(int i=1;i<vals.length;i++)
            if(vals[i].compareTo(v)>0)
                v=vals[i];
        return v ;
    }
}
