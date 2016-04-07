package Collection;

import java.util.*;

/**
 * Created by привет on 05.04.2016.
 */
public class ListDemo {
    public static void main(String[] args) {
        Collection<String> list = new HashSet<>();//можно комбенировать и arrayList and Linked
        List<String> list1 = new ArrayList<>();//and to
        ArrayList<String> list2 = new ArrayList<>();
        list.add("a");//добавит в массив
//        list1.add(1,"aa");//вставляь в 1 ячейку
  //      list1.set(1,"bbb");//1 ячейку заменяь
        list.remove("a");//true если есть и удалил
        list.remove(1);//true если есть и удалил по индексу
        list.contains("a");//true  если содержиэм длемен
        list.isEmpty();//тру если пуст
        list.size();//размер
        //все надо через вывод проверять
        //----------------------------------------
        //Порядок вывода
        //Set<String> list11 = new LinkedHashSet<>();//..b c a d f e(в том же порядке)
        //Set<String> list11 = new TreeSet<>();//..a b c d e f(по возрастанию
        Set<String> list11 = new HashSet<>();//..a b c d e f(тоже по возрастанию
        System.out.println(list11.add("b"));
        System.out.println(list11.add("c"));
        System.out.println(list11.add("a"));
        System.out.println(list11.add("d"));
        System.out.println(list11.add("f"));
        System.out.println(list11.add("e"));
        System.out.println(list11);
//   34.39 дюенрики
    }
}
