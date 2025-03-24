package ex_14_Strings;

public class Lab063_StringCreation {
    public static void main(String[] args) {
        // String 2 ways
        String s1 = "pramod"; // SCP

        String s2 = new String("pramod"); // OA -> Object Area

        String s3 = "hello";
        s3 = s3.concat("world"); // concat add the values , merge the values
        System.out.println(s3);
    }
}
