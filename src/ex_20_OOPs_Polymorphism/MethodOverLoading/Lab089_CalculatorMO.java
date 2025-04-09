package ex_20_OOPs_Polymorphism.MethodOverLoading;

public class Lab089_CalculatorMO {

    public int add(int a , int b){
        return a + b;
    }
    public double add(double a, double b) {
        return a + b;
    }

    public static void main(String[] args) {
        Lab089_CalculatorMO c1 = new Lab089_CalculatorMO();
        c1.add(3,4);
        System.out.println(c1);
        c1.add(3.414,4.56);
        ;
    }
}
