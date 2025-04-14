package ex_32_CollectionFramework;

import java.util.*;

public class Lab142_StudentsAL {
    public static void main(String[] args) {
        Student s1 = new Student("Krishnan","1");
        Student s2 = new Student("Dazzy","2");

        List<Student> myStudents = new ArrayList<>();
        myStudents.add(s1);
        myStudents.add(s2);

        System.out.println(myStudents);

        s1.printDetails();
        s2.printDetails();
    }
}
