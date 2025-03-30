package ex_16_Arrays;

import java.util.Scanner;

public class Lab078_MatrixMultiplication {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the matrix size");
        int size = scanner.nextInt();

        for (int i = 0; i < size ; i++) {
            for (int j = 0; j < size; j++) {
                System.out.print((i*j)+"\t");
            }
            System.out.println("");
        }
    }
}
