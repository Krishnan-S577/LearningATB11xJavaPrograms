package ex_13_Functions;

public class Lab059_UDFunctions2 {
    public static void main(String[] args) {

        int r1= sum_of_numbers(12,13);
        int r2= sum_of_numbers(10,15);

        System.out.println(r1);
        System.out.println(r2);
    }

    static int sum_of_numbers(int a, int b) {
        return a+b;
    }

}



