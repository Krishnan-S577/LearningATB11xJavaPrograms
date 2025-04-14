package ex_32_CollectionFramework;

import java.util.ListIterator;
import java.util.Vector;

public class Lab139_VectorListIterator {
    public static void main(String[] args) {
        Vector vector = new Vector();
        vector.add("Item1");
        vector.add("Item2");
        vector.add("Item3");
        vector.add("Item4");
        vector.add("Item5");

        ListIterator listIterator = vector.listIterator();

        while (listIterator.hasNext()){
            System.out.println(listIterator.next());
        }

        System.out.println("---");

        while(listIterator.hasPrevious()){
            System.out.println(listIterator.previous());
        }
    }
}
