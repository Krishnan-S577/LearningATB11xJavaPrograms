package ex_24_OOPs_Abstraction;

public class Lab098_RealEg {
    public static void main(String[] args) {

        E emp1 = new E();
        emp1.computePay();
        emp1.mailCheck("dazzy","Abc22334");


    }
}
abstract class Employee{


    private String name;
    private String address;
    private int number;

    Employee(){


    }


    Employee(String name, String address, int number){
        System.out.println("Constructing an Employee");
        this.name = name;
        this.address = address;
        this.number = number;
    }

    abstract double computePay();

    void mailCheck(String name, String address) {
        this.name = name;
        this.address = address;
        System.out.println("Mailing a check to " + this.name + " " + this.address);
    }
}
 class E extends Employee{
     @Override
     double computePay() {
         return 0;
     }
 }