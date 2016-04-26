package Collection;

import java.util.ArrayList;
import java.util.List;
import java.util.Properties;

/**
 * Created by привет on 20.04.2016.
 */
public class RanTest<T extends Number> {

    T []o;
    public RanTest(T[] o) {
        this.o = o;
    }
    double aver(){
        double sum = 0.0;
        for(int i =0;i<o.length;i++)
            sum += o[i].doubleValue();

        return sum/o.length;
    }
}
class  te{
    public static void main(String[] args) {
        Double [] i = {1.3,2.44,3.5,4.5,5.7};

        RanTest<?> io = new RanTest<>(i);
        double v = io.aver();
        System.out.println(v);
    }
}