package ex_06_Ternary_Operator;

public class Lab022_Ternary_Operator {
    public static void main(String[] args) {
        int age = 10;
        //- result = condition ? expression1 : expression2;
        String canIVote = age>= 18 ? "Yes" : "No";
        System.out.println(canIVote);

        int val = -5;

        String Num = val >0 ? "Positive" : "Negative";
        System.out.println(Num);
    }
}
