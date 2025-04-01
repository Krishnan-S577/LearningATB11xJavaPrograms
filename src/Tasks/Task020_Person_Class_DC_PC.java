package Tasks;

public class Task020_Person_Class_DC_PC {
    public static void main(String[] args) {

        Person1 P1 = new Person1();
        System.out.println(P1.name);
        System.out.println(P1.age);
        System.out.println(P1.address);
        System.out.println(P1.phone_no);
        System.out.println(P1.isMale);

        Person1 P2 = new Person1("Krishnan",24,"Bengaluru",948768905,true);
        P2.eat();
        P2.sleep();
        P1.printDetails();
        Person1 P3 = new Person1("Deepak",32,857463322);
        P3.walk();
        P3.doHomework();
        //P3.printDetails();

    }
}
    class Person1 {
        String name;
        int age;
        String address;
        long phone_no;
        boolean isMale;
        //DC
        Person1() {
            name = "Krishnan";
            age = 24;
            address = "Bengaluru";
            phone_no = 9487685905l;
            isMale = false;
        }

        void eat() {
            System.out.println(this.name + "is Eating!");
        }

        void sleep() {
            System.out.println(this.name + "is Sleeping!");
        }

        void walk() {
            System.out.println(this.name + "is Walking!");
        }

        void doHomework() {
            System.out.println(this.name + "is Doing Homework!");

        }
        //PC
        Person1(String name,int age,String address,long phone_no,boolean isMale){
            this.name = name;
            this.age = age;
            this.address = address;
            this.phone_no = phone_no;
            this.isMale = isMale;
        }
        Person1(String name, int age, long phone_no){
            this.name = name;
            this.age = age;
            this.phone_no = phone_no;
        }
        void printDetails(){
            System.out.println("Name - "+name);
            System.out.println("Age - "+age);
            System.out.println("Address - "+address);
            System.out.println("Phone - "+phone_no);
            System.out.println("Is Male - "+isMale);
            System.out.println("-----------------------------------------------------------");
        }
    }