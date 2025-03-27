package ex_13_Functions;

import java.util.Scanner;

public class Lab056_ArthFunc {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Num1");
        int num1 = 0;
        if (scanner.hasNextInt()) {
            num1 = scanner.nextInt();
        } else {
            System.out.println("Enter the int only, ");
            System.exit(0);
        }

        System.out.println("Enter the num2");
        int num2 = 0;
        if (scanner.hasNextInt()) {
            num2 = scanner.nextInt();
        } else {
            System.out.println("Enter the int only, ");
            System.exit(0);
        }


        int sum = add(num1,num2);
        System.out.println(sum);
        int sub = sub(num1,num2);
        System.out.println(sub);
        int mul = mul(num1,num2);
        System.out.println(mul);
        int div = div(num1,num2);
        System.out.println(div);
    }

    static int add(int num1, int num2){
        return num1+num2;
    }

    static int sub(int num1, int num2){
        return num1-num2;
    }

    static int mul(int num1, int num2) {
        return num1 * num2;
    }
    static int div(int num1,int num2){
        return num1/num2;
    }
}
