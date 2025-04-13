package ex_32_CollectionFramework;

import java.util.ArrayList;
import java.util.List;
public class Lab133_List {
    public static void main(String[] args) {
        //List list = new List();
        List fruits = List.of("Orange","Mango",9);
        System.out.println(fruits);

        ArrayList arr = new ArrayList();
                arr.add("mango");
        arr.add(55);
        System.out.println(arr);

    }
}
