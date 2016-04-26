package Collection;

import java.util.*;

/**
 * Created by привет on 19.04.2016.
 */
class SortColl {
    public static void main(String[] args) {
        List<PointD> list = new ArrayList<>();

        list.add(new PointD(2,2));
        list.add(new PointD(0,2));
        list.add(new PointD(0,0));
        list.add(new PointD(0,2));
        list.add(new PointD(2,0));
        Collections.sort(list, new Comparator<PointD>() {
            @Override
            public int compare(PointD o1, PointD o2) {
                return o1.getY() - o2.getY();
            }
        });
        Collections.sort(list, new Comparator<PointD>() {
            @Override
            public int compare(PointD o1, PointD o2) {
                return o1.getX() - o2.getX();
            }
        });
        for (PointD p :list) {
            System.out.println(p);
        }

    }
}
class PointD {
    private final int x;

    public PointD(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    private final int y;

    @Override
    public String toString() {
        return "PointD{" +
                "x=" + x +
                ", y=" + y +
                '}';
    }
}