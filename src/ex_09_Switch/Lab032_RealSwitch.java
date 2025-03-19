package ex_09_Switch;

import java.util.Scanner;

public class Lab032_RealSwitch {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the Browser");
        String Browser = scanner.next();
        switch (Browser){
            case "chrome" :
                System.out.println("Starting the chrome");
                System.out.println("........");
                System.out.println("TC1");
                System.out.println("TC2");
                break;
            case "firefox" :
                System.out.println("Starting the firefox browser");
                // Further code to start the Firefox
                // Webdriver driver = new Firfox(); // Selenium Code
                break;
            default:
                System.out.println("Browser not found");
                break;

        }
    }
}
