package IO;

import java.io.ByteArrayOutputStream;
import java.util.ArrayList;
import java.util.DoubleSummaryStatistics;
import java.util.List;

/**
 * Created by привет on 02.04.2016.
 */
public class ByteArrayDemo {
    public static void main(String[] args) {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        for (int i=0;i<1000;i++){
            out.write((int)(1000*Math.random()));
        }
        byte[]bt=out.toByteArray();
        List<Double>list=new ArrayList<>();
        for (int i=0;i<1000;i++){
            list.add(1000*Math.random());}
        for (Double n:list){
            System.out.println(n);
        }
    }
}
