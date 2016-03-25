package Exception;

import com.sun.javafx.collections.SortHelper;
import org.omg.CORBA.INITIALIZE;

/**
 * Created by PC on 01.03.2016.
 */
public class App06 {
    public static void main(String[] args) {
        for(int i=0;i<2;i++){
            f();
            System.err.println();
        }
    }

    private static void f() {
        for(int k = 0;k<2;k++){
            System.err.print(0);
            //if(true)continue;//002
            //if(true)break;//02
            //if(true)return;//0
            //if(true)throw new Error();error
         //   System.err.println(1);
        }//throw new NullPointerException("ds");
         System.err.print(2);}

}
