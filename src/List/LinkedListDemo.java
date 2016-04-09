package List;

import java.util.Collection;
import java.util.LinkedList;
import java.util.List;

/**
 * Created by привет on 07.04.2016.
 */
public class LinkedListDemo {
    public static void main(String args[]) {
        // Create a linked list.
        LinkedList<String> ll = new LinkedList<String>();

        // Add elements to the linked list.
        ll.add("F");
        ll.add("B");
        ll.add("D");
        ll.add("E");
        ll.add("C");
       //add first and last
        ll.addLast("Z");
        ll.addFirst("A");
ll.get(2);
        //add to index
        ll.add(1, "A2");
        System.out.println("Original contents of ll: " + ll);
        // Remove elements from the linked list.
        ll.remove("F");
       // ll.remove("A");
        ll.remove(2);

        System.out.println("Contents of ll after deletion: "
                + ll);
        // Remove first and last elements.
        ll.removeFirst();
        ll.removeLast();
        System.out.println("ll after deleting first and last: "
                + ll);
        // Get and set a value.
        String val = ll.get(2);
        ll.set(2, val + " Changed");
        System.out.println("ll after change: " + ll);
        //----------------------
        for (int i =0;i<2;i++){
        ll.remove(1);

        System.out.println("метод по удалению со средине"+ll);
    }
}}