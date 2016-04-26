package Collection;

/**
 * Created by привет on 16.04.2016.
 */
public class OrelReshka {
    public static void main(String[] args) {
        int a=0;
        int b=0;
        for(int i=0;i<1_000_000;i++){
            int c= (int)(Math.random()*2);
            if(c==0){a++;}else b++;
        }
        System.out.println("a =" +a);//вероятность орла и решки в 1м= 1м / 2 + кв.корень из 1м
        System.out.println("b =" +b);//в основном шаг не больше чем на 1000
        System.out.println(a +b);
    }
}
