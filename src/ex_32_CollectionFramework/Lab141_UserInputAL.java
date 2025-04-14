package ex_32_CollectionFramework;

import java.util.ArrayList;
import java.util.Scanner;

public class Lab141_UserInputAL {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        ArrayList<String> names = new ArrayList<>();
        ArrayList<Integer> ages = new ArrayList<>();

        String continousInput = "Y";

        while (continousInput.equalsIgnoreCase("Y")){

            System.out.println("Enter the names");
            String name = sc.next();
            names.add(name);

            System.out.println("Enter the Age");
            Integer age = sc.nextInt();
            ages.add(age);

            sc.nextLine();
            System.out.print("Do you want to enter another record? (Y/N): ");
            continousInput = sc.nextLine();

        }

        for (int i = 0; i < names.size() ; i++) {
            System.out.println(names.get(i));
        }

        for (int i = 0; i < ages.size(); i++) {
            System.out.println(ages.get(i));
        }

        sc.close();


    }
}
