package ex_20_OOPs_Polymorphism.MethodOverRiding;

public class Lab090_MOverRiding {
    public static void main(String[] args) {
        Animal a = new Animal();
        a.sound();
         Dog d = new Dog();
         d.sound();

    }
}
class Animal {
    void sound() {
        System.out.println("Animal Sound");
    }
}

class Dog extends Animal{
    @Override
    void sound(){
        System.out.println("Barking!");
    }
}

