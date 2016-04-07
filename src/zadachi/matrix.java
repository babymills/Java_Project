package zadachi;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;

/**
 * Created by привет on 02.04.2016.
 */
public class matrix {

    public static void main(String[] args) throws InterruptedException {
int c ;
        ArrayList list = new ArrayList();
int c0 = 0,c1= 0,c2= 0,c3= 0,c4= 0,c5= 0,c6= 0,c7= 0,c8= 0;
        for (int i=0;i<100;i++){
            for (int y=0;y<35;y++){
                      Thread.sleep(6);

                c=(int)(Math.random()*9);
                list.add(c);
                if(c==0){
                    c0++;
                }else if(c==1){
                    c1++;
                }else if(c==2){
                    c2++;
                }else if(c==3){
                    c3++;
                }else if(c==4){
                    c4++;
                }else if(c==5){
                    c5++;
                }else if(c==6){
                    c6++;
                }else if(c==7){
                    c7++;
                    c8++;
                }else if(c==8){
                }
                System.out.print(c+"   ");

        }System.out.println();
        }

        System.out.println(" c0:"+c0+"c1:"+c1+"c2:"+c2+"c3:"+c3+"c4:"+c4+"c5:"+c5+"c6:"+c6+"c7:"+c7+"c8:"+c8);
        System.out.println(list.size());
    }
}
