package Tasks;

import java.util.Scanner;

public class Task007_Even_Odd {
    public static void main(String[] args) {
        //Take user input & Check weather the input is even or odd number.
        //ScannerClass:
        Scanner scanner = new Scanner(System.in);
//        System.out.println("Enter the First No. : ");
//        int num = scanner.nextInt();

        //CLI Option:
       int num = Integer.parseInt(args[0]);
       System.out.println("User Input is " + num);

        if(num % 2 == 0){
            System.out.println( num + " is even");
        }else{
            System.out.println( num + " is odd ");
        }
    }
}
