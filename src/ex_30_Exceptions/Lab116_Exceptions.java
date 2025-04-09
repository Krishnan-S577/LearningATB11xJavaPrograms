package ex_30_Exceptions;

public class Lab116_Exceptions {
    public static void main(String[] args) {
        int a = 0;
        try {
            a = a/0;
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        System.out.println(a);
    }
}

