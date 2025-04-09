package ex_20_OOPs_Polymorphism.MethodOverLoading;

public class Lab087_MethodOverloading {
    public static void main(String[] args) {
        MathOperations m1 = new MathOperations();
        int r1 = m1.add(3, 4);
        System.out.println(r1);
        int r2 = m1.add(3, 4, 9);
        System.out.println(r2);
        double r3 = m1.add(3.14, 5.46);
        System.out.println(r3);
    }
}
    class MathOperations {
// In the same class, When you have a method wit same
// name but different arguments and different return type.
         int add(int a, int b){
         return a + b;
         }

         int add(int a, int b, int c){
             return a + b + c;
         }

        double add(double a, double b) {
            return a + b;
        }
    }

