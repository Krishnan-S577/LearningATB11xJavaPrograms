package Tasks;

public class Task003_In_De_Operator {
    public static void main(String[] args) {
        int a = 10;
        System.out.println(++a + a++ + a++);
        System.out.println(a);
        //11, +, 11 + 12, 13
    }
}
