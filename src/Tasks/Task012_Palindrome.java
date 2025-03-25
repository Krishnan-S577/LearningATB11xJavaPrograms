package Tasks;

import java.util.Scanner;

public class Task012_Palindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the input, I will check Palindrome");
        String userInput = sc.next();
        String newString =  reverseString(userInput);
        if(newString.equalsIgnoreCase(userInput)){
            System.out.println("Palindrome");
        }else {
            System.out.println("Not a Palindrome");
        }

    }

    private static String reverseString(String userInput) {
        String reverse = "";
        for (int i = userInput.length() - 1; i >= 0; i--) {
            reverse = reverse + userInput.charAt(i);

        }
        return reverse;
    }

}
