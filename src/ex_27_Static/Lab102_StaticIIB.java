package ex_27_Static;

public class Lab102_StaticIIB {
    public static void main(String[] args) {
        P p1 = new P();
        P p2 = new P();
    }
}
class P{
    static {
        System.out.println("SIB");
    }
    {
        System.out.println("IIB");
    }
    P(){
        System.out.println("DC");
    }
}
