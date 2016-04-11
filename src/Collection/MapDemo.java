package Collection;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by привет on 09.04.2016.
 */
public class MapDemo {
    public static void main(String[] args) {
        Map <String,Integer> maps = new HashMap<>();
        maps.put("A",1);
        maps.put("B",2);
        maps.put("C",3);
        System.out.println(maps);
        System.out.println(maps.size());
        System.out.println(maps.isEmpty());
Pair<String,Integer> pr = new Pair<String,Integer>("Mike",33);
        System.out.println(pr.fst);
        System.out.println(pr.scn);
    }
}
class Pair<A,B>{
    public  final A fst;

    public Pair(A fst, B scn) {
        this.fst = fst;
        this.scn = scn;
    }

    public  final B scn;

}