package ex_24_OOPs_Abstraction;

public class Lab097_Cars {
    public static void main(String[] args) {
        car car = new car();
        car.drive();
    }
}

abstract class Engine{

    abstract void startEngine();
    abstract void stopEngine();

    void normal(){
        System.out.println("Normal Function!");
    }
}

class car extends Engine{


    @Override
    void startEngine() {
        System.out.println("Start the engine");
    }

    @Override
    void stopEngine() {
        System.out.println("Stop the engine");
    }

    void drive(){
        startEngine();
        stopEngine();
    }
}
