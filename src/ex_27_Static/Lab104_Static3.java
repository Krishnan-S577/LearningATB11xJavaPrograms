package ex_27_Static;

public class Lab104_Static3 {
    public static void main(String[] args) {
        B.commontoAll();
        System.out.println(B.b);

        B b_ref = new B();
        b_ref.display();
        System.out.println(b_ref.a);

    }
}

class B{

    int a=11;
    static int b=12;

    {
        System.out.println("IIB");
    }

    void display(){
        System.out.println(b);
        System.out.println("Non static F(n)");
    }

    static void commontoAll(){

        System.out.println("Static F(n)");

    }
}
