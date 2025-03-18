package ex_06_Ternary_Operator;

public class Lab024_AgeClassification {
    public static void main(String[] args) {
        int a = Integer.parseInt(args[0]);
        String Age = a<18 ? "Minor" : (a<65 ? "Adult" : "Senior");
        System.out.println(Age);
    }
}

