package ex_08_IfCondition;

import java.util.Scanner;

public class Lab029_IfElse {
    public static void main(String[] args) {
        /*
         Allowed to vote or not
         If age > 18 -> allowed to vote.
         else age < >18 -> Not allowed to vote.
        */
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your age");
        int age = scanner.nextInt();
        if (age>=18){
            System.out.println("Allowed to Vote");
        }else{
            System.out.println("Not Allowed to Vote");
        }
    }
}
