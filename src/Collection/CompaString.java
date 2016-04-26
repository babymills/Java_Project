package Collection;

import java.util.*;

/**
 * Created by привет on 19.04.2016.
 */
public class CompaString {
    public static void main(String[] args) {
        NavigableSet<String> set = new TreeSet<>(/*new ItemSt()*/);//метод в кавычках сортирует по размеру
        set.add("Aaa");
        set.add("Hd");
        set.add("G");
        set.add("Cvdsfvdf");
        set.add("C");
        set.add("D");
        set.add("E");
        System.out.println(set);
        /*Iterator<String> iter= set.iterator();
        for(;iter.hasNext();){
        System.out.println(iter.next());
            }*/
    NavigableSet<String> subset = set.subSet("C",true,"E",true);
    NavigableSet<String> subset1 = set.tailSet("C",true);//от какого елем и до хвоста
    NavigableSet<String> subset2 = set.headSet("G",true);//все от головы и до какого ел
        System.out.println(subset);
        System.out.println(subset1);
        System.out.println(subset2);
}}
class ItemSt implements Comparator <String>{
    @Override
    public int compare(String o1, String o2) {
        int c =o1.length()-o2.length();
        if(c != 0){//поменять метсами о2 - о1 порядок с большим количеством символов
        return c;}else{
            return o1.compareTo(o2) ;
    }
}}