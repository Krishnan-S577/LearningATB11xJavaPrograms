package Tasks;

import java.util.Scanner;

public class Task006_ScannerClass {
    public static void main(String[] args) {
        //Take a user input - Name, Age and Salary and print them in the end.
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter your name");
        String name = scanner.next();

        System.out.println("Enter your age");
        int age = scanner.nextInt();

        System.out.println("enter your salary");
        double salary = scanner.nextDouble();

        System.out.println("-----Employee Details-----\n");
        System.out.println("Name is : " + name);
        System.out.println("Age is : " + age);
        System.out.println("Salary is : " + salary);

    }
}
