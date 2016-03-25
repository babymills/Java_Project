package Interface.SharedConst;

import java.util.Random;

/**
 * Created by pc on 12.01.2016.
 */
public class Question implements SharedConstants {
    Random rand = new Random();
    int ask(){
        int prob = (int) (100*rand.nextDouble());
        System.out.println(prob);
        if(prob<30)
            return NO;//30%
        else if(prob<60)
            return YES;//30%
        else if(prob<75)//15%
        return LATER;
        else if(prob<98)//13%
        return SOON;
        else
            return NEVER;
    }
}
