package ex_27_Static;

public class Lab103_Static2 {
    public static void main(String[] args) {
        A ref1 = new A(10);
        ref1.displayValue();
        System.out.println(A.b);
        //System.out.println(ref1.b);
        A ref2 = new A(25);
        ref2.displayValue();
        A ref3 = new A(20);
    }
}
class A{

    int a; // non static -> instance variable / properties/ attribute / fields
    static int b = 20;

    A(int a) {
        this.a = a;
    }

    void displayValue(){
        System.out.println(this.a);
    }




}
