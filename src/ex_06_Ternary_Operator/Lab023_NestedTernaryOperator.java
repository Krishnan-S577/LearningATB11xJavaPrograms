package ex_06_Ternary_Operator;

public class Lab023_NestedTernaryOperator {
    public static void main(String[] args) {

       //result = Condition 1 ? expression 1 : (condition 2 ? expression 2 : expression 3);
        int number = 25;
         String result = number>20 ? "Yes" : (number<10 ? "Less than" : "Greater than");



        int num1 = 7;
        int num2 = 27;

        String IsGreater = num1>num2 ? "Num1 is Greater" : "Num 2 is Greater";


        int val1 = 0;
        int val2 = 9;
        int val3 = -11;

        String Greatest = val1>val2 ? "Val1 is Greater" : (val2>val3 ? "Val2 is Greater" : "Val3 is Greater");
        System.out.println(Greatest);
    }
}
