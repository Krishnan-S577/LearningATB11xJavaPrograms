package ex_30_Exceptions;

import java.util.Scanner;

public class Lab122_TryCatchFinally2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number : ");
        int v = sc.nextInt();

        try {
            int b = 10/v;
        } catch (Exception e) {
            System.out.println(e.getMessage());
        } finally {
            sc.close();
            System.out.println("sc closed");
        }


    }
}
