package ex_23_Super;

public class Lab095_Super2 {
    public static void main(String[] args) {
        Dog a = new Dog();
        a.display();
    }
}

class GOD{

    void sound(){

        System.out.println("God");
    }
}

class Animal extends GOD{
    protected  String color  = "white";


    void sound(){
        System.out.println("Animal Sound!");
        super.sound();
    }

}

class Dog extends Animal{
    private String color  = "Black";
        String sound = "Barking";
    void display(){
        System.out.println(this.sound);
        System.out.println(this.color);
        System.out.println(super.color);
        super.sound();
    }

}