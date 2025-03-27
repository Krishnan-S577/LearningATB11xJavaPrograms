package ex_11_While;

import java.util.Random;
import java.util.Scanner;

public class Lab048_GuessingGame {
    public static void main(String[] args) {

        Random random = new Random();
        int numberToGuess = random.nextInt(16);
        System.out.println(numberToGuess);
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number");

        int guess;
        int attempts = 0;

        while (true){
            guess = scanner.nextInt();
            attempts++;

            if(guess< numberToGuess){
                System.out.println("Number is too low");
            } else if (guess> numberToGuess) {
                System.out.println("Number is too high");
            }else {
                System.out.println("You are right ! " + attempts + " attempts taken to guess");
                break;
            }
        }
    }
}
