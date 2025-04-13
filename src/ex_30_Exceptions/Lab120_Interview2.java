package ex_30_Exceptions;

public class Lab120_Interview2 {
    public static void main(String[] args) {
        try {
            String input_user  = args[0]; // java.lang.ArrayIndexOutOfBoundsException
            int a = Integer.parseInt(input_user); // java.lang.NumberFormatException: For input string
            int output = 100/a;
        } catch (ArrayIndexOutOfBoundsException | ArithmeticException | NumberFormatException e) {
            // new NumberFormatException (); JVM is creating the object
            System.out.println(e.getMessage());
        }
    }
}
