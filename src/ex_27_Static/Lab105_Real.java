package ex_27_Static;

public class Lab105_Real {
    public static void main(String[] args) {
        System.out.println(ATB11x.courseName);
        System.out.println(ATB11x.mentorName);

        ATB11x.doAssignment();
        ATB11x.joinZoomForClass();

        ATB11x krish = new ATB11x();
        krish.setName("Krishnan");
        String name = krish.getName();
        System.out.println(name);

    }
}

class ATB11x{
    static {
        System.out.println("Load the class?, I will execute");
    }
    {
        System.out.println("IIB");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    private String name; // non static
    private String phone;
    static String courseName = "ATB11x";
    static String mentorName = "Pramod";

    static void doAssignment(){
        //System.out.println(phone); // Static method can't access the non-static variables
        System.out.println("Do Assignment");
    }

    static void joinZoomForClass(){
        System.out.println("Class Joined!");
    }


    void howTheyAssignment(){
        System.out.println("It is different!");
    }






}
