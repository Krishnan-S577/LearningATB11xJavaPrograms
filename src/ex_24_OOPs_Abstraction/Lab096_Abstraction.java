package ex_24_OOPs_Abstraction;

public class Lab096_Abstraction {
    public static void main(String[] args) {
        child c = new child();
        c.loan50K();
        c.loan25k();
    }
}
abstract class father{
    abstract void loan50K();
    void loan25k(){
        System.out.println("Given 25K");
    }
}
class child extends father{

    @Override
    void loan50K() {
        System.out.println("Child pay loan !");
    }
}
