package ex_14_Strings;

public class Lab067_StringBuffer {
    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer("Krishnan");
        sb.append("Dazzy");
        System.out.println(sb);
        System.out.println(sb.append(123));
        System.out.println(sb.reverse());

        String s1 = "Hello";
        String s2 = " World!";
        String s3 = s1 + s2; // Creates a new string "Hello World!"
        System.out.println(s3); // Output: Hello World!
        System.out.println(s1);

    }
}
