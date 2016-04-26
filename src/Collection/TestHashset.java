package Collection;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

class TestHashset {
    public static void main(String[] args) {
       Set<Point2D> list = new HashSet<>();
        list.add(new Point2D(0,0));
        System.out.println(list);
        System.out.println(list.contains(new Point2D(0,0)));//нужно переопределить метод иквелс
        // что бы методы ремув и контейнс и т.д. работали
        System.out.println(list.remove(new Point2D(0,0)));
        System.out.println(list);
     }
}