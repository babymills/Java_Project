package Collection;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by привет on 20.04.2016.
 */
    /*Map<String, String> map = new HashMap<>();
map.put("1", "2");
        map.put("3", "4");

        Map<String, String> mapCopy = new HashMap<>(map);
        for(Map.Entry<String, String> pair : mapCopy.entrySet()) {
        map.remove(pair.getKey());
        } удаление из мапы*/
public class MApTest {
    public static void main(String[] args) {
        HashMap<String, String> map = new HashMap<String, String>();
        map.put("Sim", "Sim");
        map.put("Tom", "Tom");
        map.put("Arbus", "Arbus");
        map.put("Baby", "Baby");
        map.put("Cat", "Cat");
        map.put("Dog", "Dog");
        map.put("Eat", "Eat");
        map.put("Food", "Food");
        map.put("Gevey", "Gevey");
        map.put("Hugs", "Hugs");

        printKeys(map);
    }

    public static void printKeys(Map<String, String> map)
    {
        for(Map.Entry<String,String> in : map.entrySet()){
            String key = in.getKey();
            String value = in.getValue();
            System.out.println(key+ " " + value);
        }
    }
}
