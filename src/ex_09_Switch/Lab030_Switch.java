package ex_09_Switch;

import java.util.Scanner;
/*
switch(expression)
        {
         // case statements`
         // values must be of same type of expression`
         case value1 : expression = value 1 -> `
         // Statements`
         break;
*/


public class Lab030_Switch {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the day");
        int day = scanner.nextInt();

        switch (day) {
            case 1: {
                System.out.println("Mon");
            }
            break;
            case 2: {
                System.out.println("Tue");
            }
            break;
            case 3: {
                System.out.println("Wed");
            }
            break;
            case 4:{
                System.out.println("Thur");
            }
            break;
            case 5:{
                System.out.println("Fri");
            }
            break;
            case 6:{
                System.out.println("Sat");
            }
            break;
            case 7:{
                System.out.println("Sun");
            }
            break;
            default:{
                System.out.println("Invalid");
            }
        }
    }
}