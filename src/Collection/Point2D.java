package Collection;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by привет on 13.04.2016.
 */
public class Point2D {
    private  final int x;

    public Point2D(int y, int x) {
        this.y = y;
        this.x = x;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    private  final int y;

    @Override
    public boolean equals(Object obj) {
        if(obj == null)return false;
        if(this.getClass() != obj.getClass())return false;
        Point2D that = (Point2D) obj;
        return this.x ==that.x && this.y==that.y;
    }
    @Override
    public int hashCode() {
        return 0;
    }

    @Override
    public String toString() {
        return "Point2D{" +
                "x=" + x +
                ", y=" + y +
                '}';
    }

}
class Test {
    public static void main(String[] args) {
//        Integer t = 100;autoboxing выделяется для экономии памяти
//        Integer t1 = 100;одна ссылка поэтому тру.для малентких чсиел
        Integer t = new Integer(100);
        Integer t1 = new Integer(100);
        System.out.println(t==t1);
        System.out.println(t.equals(t1));
        List<Point2D> list = new ArrayList<>();
        list.add(new Point2D(0,0));
        System.out.println(list);
        System.out.println(list.contains(new Point2D(0,0)));//нужно переопределить метод иквелс
        // что бы методы ремув и контейнс и т.д. работали
        System.out.println(list.remove(new Point2D(0,0)));
        System.out.println(list);
     }
}