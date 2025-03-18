package ex_07_Increment_Decrement_Op;

public class Lab025_IncrDecrOP {
    public static void main(String[] args) {
        //Pre-increment ++a
        //Value is increment first and then stored in result.
        int a = 10;
        int b = ++a;
        System.out.println(b);
        System.out.println(a);

        int post_a= 10;
        System.out.println(post_a++);
        System.out.println(post_a);

    }
}
