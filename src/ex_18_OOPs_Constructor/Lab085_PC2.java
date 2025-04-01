package ex_18_OOPs_Constructor;

public class Lab085_PC2 {
    public static void main(String[] args) {
        Person p1 = new Person("Dazzy",97555321,"opo");
        Person p2 = new Person("Krish",95566898,"ewr");

        Person p3  = new Person();
        p3.name = "Krish";
        System.out.println(p3.name);

        Person p4 = new Person("Akash",823424242);
        System.out.println(p4.address);


        p1.eat();
        p2.eat();
        p3.eat();
        p4.eat();
    }
}
class Person{

    String name;
    long phone;
    String address;

    Person(){

    }

    Person(String name_arg,long phone_arg, String address_arg){
        this.name = name_arg;
        this.address = address_arg;
        this.phone = phone_arg;

    }

    Person(String name_arg,long phone_arg){
        this.name = name_arg;
        this.phone = phone_arg;

    }

    void eat(){
        System.out.println(this.name + " is eating!");
    }


}