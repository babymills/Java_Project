package Collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;

/**
 * Created by привет on 10.04.2016.
 */
public class ComparattprDemo {
    public static void main(String[] args) {
        ArrayList<Item> list = new ArrayList<Item>();
        list.add(new Item(1,43.4,"ttt"));
        list.add(new Item(2,23.6,"ggg"));
        list.add(new Item(3,443.7,"ccc"));
        list.add(new Item(4,4.2,"ddd"));
        Comparator<Item> comparator = new Comparator<Item>() {

            public int compare(Item o1, Item o2)
            {

                return Double.compare(o2.getPrice(), o1.getPrice());
            }
        };
        Collections.sort(list,comparator);
        System.out.println(list);
    }
}
class Item {
    private int id;
    private double price;
    private String name;

    public Item(int id, double price, String name) {
        this.id = id;
        this.price = price;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Item{" +
                "id=" + id +
                ", price=" + price +
                ", name='" + name + '\'' +
                '}'+"\n";
    }
}