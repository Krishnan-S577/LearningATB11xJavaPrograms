package ex_14_Strings;

public class Lab068_StringBuilder {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("Java");
        sb.append(" Programming"); // Appends text
        System.out.println(sb);
        sb.delete(5,16); // Delete the substring
        System.out.println(sb);
        sb.replace(0,4,"C");
        System.out.println(sb);
    }
}
