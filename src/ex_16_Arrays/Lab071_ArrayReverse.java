package ex_16_Arrays;

import java.util.Scanner;

public class Lab071_ArrayReverse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the array size");
        int size = sc.nextInt();
        int[] number = new int[size];

        for(int i= 0; i<number.length; i++){
            System.out.println("Enter the numbers in the array : ");
            number[i] = sc.nextInt();
        }

        for (int i = number.length-1; i>=0; i--){
            System.out.println(number[i]);
        }
    }
}
