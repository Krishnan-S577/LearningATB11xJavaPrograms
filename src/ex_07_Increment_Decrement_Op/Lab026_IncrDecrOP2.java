package ex_07_Increment_Decrement_Op;

public class Lab026_IncrDecrOP2 {
    public static void main(String[] args) {

        int a = 10;
        int b = a++;
        System.out.println(a);
        System.out.println(b);

        // line|Exp a| res b
        //6|10|na
        //7|11|10
        //8|11|na
        //9|na|10

        int a1= 10;
        System.out.println(a1++ + a1);

        int b1= 10;
        System.out.println(b1++ + ++b1);
        System.out.println(b1);

        //line|exp|result
        // a++ -> A -> ExpA -> 10 , b1 ->  11
        // +
        // ++a -> B -> ExpB -> 12 , b1 -> 12
        // A+B -> ExpA+ExpB -> 10+12 -> 22 , b1 -> 12

        int c1= 10;
        System.out.println(++c1 + ++c1);
        System.out.println(c1);

        //line|exp|result
        // ++a -> A -> ExpA -> 11 , c1 ->  11
        // +
        // ++a -> B -> ExpB -> 12 , c1 -> 12
        // A+B -> ExpA+ExpB -> 11+12 -> 23 , c1 -> 12

    }
}
