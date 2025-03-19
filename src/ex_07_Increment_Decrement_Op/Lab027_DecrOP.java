package ex_07_Increment_Decrement_Op;

public class Lab027_DecrOP {
    public static void main(String[] args) {
        int a=10;
        int result_post = a--;
        System.out.println(result_post);
        System.out.println(a);

        int b=10;
        int result_pre = --b;
        System.out.println(result_pre);
        System.out.println(b);
    }
}
