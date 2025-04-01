package ex_18_OOPs_Constructor;

public class Lab084_PC {
    public static void main(String[] args) {

        Car2 c1 = new Car2();
        System.out.println(c1.name);
        Car2 c2 = new Car2("Model 3", 2015, "Tesla");
        System.out.println(c2.name);
        Car2 c4 = new Car2("Mahindra",2020 , "Scorpoio");
        System.out.println(c4.name);

    }
}
    class Car2{

        String name;
        String model;
        int year;


        // DC
        Car2() {
            model = "XXX";
            year = 1900;
            name = "Unknown Car!";
            System.out.println("DC");

        }

        //PC

        Car2(String model,int year,String name){
            this.model=model;
            this.year=year;
            this.name=name;

        }
    }
