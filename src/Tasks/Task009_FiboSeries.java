package Tasks;


import java.util.Scanner;

public class Task009_FiboSeries {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Number for Fibonacci sequence : ");
        int num = scanner.nextInt();

        int first = 0; int second = 1;
        int next;
        System.out.print("Fibonacci Series: " + first + "," + second);

        for(int i = 2; i<num; i++){
            next=first + second;
            System.out.print("," + next);

            first = second;
            second = next;
        }
        scanner.close();
    }
}
