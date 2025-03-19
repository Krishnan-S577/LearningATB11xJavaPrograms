package ex_08_IfCondition;

public class Lab028_IfElse {
    public static void main(String[] args) {
        //CLI Option
        int age = Integer.parseInt(args[0]);
        if (age>18) {
            System.out.println("Major");
        } else{
            System.out.println("Minor");
        }
    }
}
