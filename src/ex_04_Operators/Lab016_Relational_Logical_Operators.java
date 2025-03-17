package ex_04_Operators;

public class Lab016_Relational_Logical_Operators {
    public static void main(String[] args) {
        // < Less Than
        // < =  -> Less than or equal to
        // > Greater
        // > = Greater or equal
        // == ->  Equal to (but checking)
        // != -> Not equal

        // All of them will result boolean output
        //Modulus > prints remainder
        int a1= 16;
        int a2= 7;
        System.out.println(a1%a2);

        int a = 10;
        int b = 30;
        boolean c = a > b;
        System.out.println(c);

        int Krishnan_age = 33;
        int Ash_age = 34;
        boolean age = Ash_age >= Krishnan_age;
        System.out.println(age);

        // || > OR
        // & > AND
        boolean c1 = true || false;
        boolean c2 = true & false;
        System.out.println(c1);
        System.out.println(c2);

        LogicalOperators();
    }
    private static void LogicalOperators() {
        //Logical Operators

        boolean x = true;
        System.out.println(!x);
        System.out.println(!!x);
    }
}
