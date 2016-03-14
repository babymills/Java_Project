package javarush;

import java.util.ArrayList;

/**
 * Created by pc on 29.01.2016.
 */
public class Solution {
    public static void main(String[] args) {
        Cat a = new Cat("A",1,2,3);
        Cat a2 = new Cat("A1",11,21,3);
        Cat a3 = new Cat("A2",21,2,13);
        a.fight(a2);
        a.fight(a3);
         a2.fight(a3);
        a3.fight(a);

    }


}
