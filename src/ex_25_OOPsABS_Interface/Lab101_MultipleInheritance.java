package ex_25_OOPsABS_Interface;

public class Lab101_MultipleInheritance {
    public static void main(String[] args) {
    Child c = new Child();
    c.money();
    }
}

interface Mother{
    void money();
}
interface Father{
    void money();
}

class Child implements Mother,Father{

    @Override
    public void money() {

    }
}