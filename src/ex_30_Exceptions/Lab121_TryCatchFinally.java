package ex_30_Exceptions;

public class Lab121_TryCatchFinally {
    public static void main(String[] args) {
        int  a =1;
        int c =0;

        try {
            c = 10 / 0;
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        finally {
            System.out.println("This will print anyways");
        }
    }
}
