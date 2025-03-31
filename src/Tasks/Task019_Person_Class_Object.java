package Tasks;

public class Task019_Person_Class_Object {
    public static void main(String[] args) {

        person p1 = new person();
        p1.sleep();
        p1.isIsmarried();
        p1.details("Krishnan",24,1391288);
        p1.person_name("Dazzy");


    }
}
class person{
    String name;
    String mobile_no;
    double weight;
    float height;
    int legs;
    double salary;
    byte age;
    String color_eyes;
    boolean isMale;
    boolean ismarried;

    void sleep(){
        System.out.println("I am Sleeping");
    }

    boolean isIsmarried(){
        ismarried = true;
        System.out.println("Is married " +ismarried);
        return ismarried;
    }

    void details(String name, int age, double salary){
        System.out.println(("Your name is ->" + name + "\nYour age is " + age + "\nYour salary is " + salary));
    }
    String person_name(String name) {
        System.out.println("Name is " + name);
        return name;
    }
}
