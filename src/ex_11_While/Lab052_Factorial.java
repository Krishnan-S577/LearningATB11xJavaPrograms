package ex_11_While;

import java.util.Scanner;

public class Lab052_Factorial {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the Number");
        int num = scanner.nextInt();

        int fact = 1;
        if(num<=0){
            System.out.println(fact);
        }else {
            for (int i = 1; i <= num; i++) {
                fact = fact * i;
            }
            System.out.println("Factorial of the number is : " + fact);
        }

    }
}
