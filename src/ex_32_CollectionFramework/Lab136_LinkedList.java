package ex_32_CollectionFramework;

import java.util.LinkedList;

public class Lab136_LinkedList {
    public static void main(String[] args) {
        LinkedList animals = new LinkedList();
        animals.add("Dog");
        animals.add("Cat");
        animals.add(11);
        animals.addFirst("Lion");
        animals.addLast("Elephant");
        System.out.println("LinkedList: " + animals);

        //1st Element
        System.out.println(animals.getFirst());
        //Last element
        System.out.println(animals.getLast());

        animals.remove(3);
        System.out.println(animals);

        System.out.println("Size of LinkedList: " + animals.size());
    }
}
