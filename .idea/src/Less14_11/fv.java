package Less14_11;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

/**
 * Created by IT_School on 14.11.2015.
 */
public class fv {
        public static void main(String[] args) {

            ArrayList<String> al = new ArrayList<String>();
            al.add("C");
            al.add("A");
            al.add("E");
            al.add("B");
            al.add("D");
            al.add("F");
            System.out.println("Original cntents of al : ");
            Iterator<String> itr = al.iterator();
            while(itr.hasNext()) {
                String element = itr.next();
                System.out.print(element + " ");
            }
            System.out.println();
            ListIterator<String> litr = al.listIterator();
            while(litr.hasNext()) {
                String element = litr.next();
                litr.set(element + " ");
            }
            System.out.print("Modified of al ");
            itr = al.iterator();
            while(itr.hasNext()){
                String element = itr.next();
                System.out.print(element + " ");

        }
            System.out.println();
            System.out.println("Modificate list ");
            while(litr.hasPrevious()){
                String element = litr.previous();
                System.out.print(element + " ");
    }
            System.out.println();
}}
