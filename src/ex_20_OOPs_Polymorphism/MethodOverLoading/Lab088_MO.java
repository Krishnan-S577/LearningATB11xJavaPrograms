package ex_20_OOPs_Polymorphism.MethodOverLoading;

public class Lab088_MO {
    public static void main(String[] args) {
        Home h1 = new Home();
        h1.Add(3);
        h1.Add(3,5,6);
        System.out.println(h1);
    }
}
class Home{
    void Add(int a){
        System.out.println(a);
    }

    void Add(int a,int b){
        System.out.println(a+b);
    }

    void Add(int a,int b,int c){
        System.out.println(a+b+c);
    }
}