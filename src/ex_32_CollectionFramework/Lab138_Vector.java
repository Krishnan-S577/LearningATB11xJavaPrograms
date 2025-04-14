package ex_32_CollectionFramework;

import java.util.Vector;
public class Lab138_Vector {
    public static void main(String[] args) {
        Vector v = new Vector();
        v.add("Pramod");
        v.add("Amit");
        v.add("Lucky");
        System.out.println(v);
        v.remove("Amit");
        System.out.println(v.contains("Lucky"));
        System.out.println(v);

        System.out.println(" ---- Normal For Loop ");


        for (int i = 0; i < v.size(); i++) {
            System.out.println(v.get(i));
        }

    }
}
