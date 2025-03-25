package ex_14_Strings;


import java.util.Scanner;

public class Lab069_PalindromeWOFunction {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter input string, check it's Palindrome : ");
        String userInput = scanner.next();
        String reverse = "";
        for(int i = userInput.length()-1; i>= 0; i--){
            reverse = reverse + userInput.charAt(i);
        }
        System.out.println("Reverse String : " + reverse);

        if(reverse.equalsIgnoreCase(userInput)){
            System.out.println("Palindrome");
        }else {
            System.out.println("Not a Palindrome");
        }
    }


}



