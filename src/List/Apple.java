package List;

import com.sun.scenario.effect.impl.prism.PrImage;

import java.util.ArrayList;

/**
 * Created by привет on 07.04.2016.
 */
public class Apple {
    private static long counter;
    private static long id = counter++;
    public long id(){return  id;}
}
    class Orange {}

   class AppleAndOrange{
       @SuppressWarnings("UNCK")
       public static void main(String[] args) {
           ArrayList<Apple> apples = new ArrayList<>();
           for(int i =0;i<3;i++){
               apples.add(new Apple());
           }
           //apples.add(new Orange());
           for(int i =0;i<apples.size();i++)
               ((Apple)apples.get(i)).id();
           }

   }