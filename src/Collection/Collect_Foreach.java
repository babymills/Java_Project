package Collection;

import Java_Lang.Stri;

import java.util.*;

import static java.util.Arrays.asList;

/**
 * Created by привет on 10.04.2016.
 */
public class Collect_Foreach {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>(asList("A","AA","AAA"));
        Set<Integer> set = new HashSet<>(asList(1,2,3,4,5));
        //for(Iterator<Integer>i= set.iterator();i.hasNext();){
        //    System.out.println(i.next());
        //}  старый способ перебора длементов
        //новый способ
        for(Integer i : set){
            System.out.println(i);
        }
        System.out.println(set);
        System.out.println(list);
Map<String,String> map = new HashMap<String, String>() ;
        map.put("A","*");
        map.put("B","-");
        map.put("C","+");
        map.put("D","=");
        map.entrySet().forEach(System.out::println);

    }
}
