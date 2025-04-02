package ex_19_OOPs_Inheritance;

public class Lab086_Inheritance {
    public static void main(String[] args) {

        father f1 = new father();
        System.out.println(f1.gold);
        f1.bhk2();

        son s1 = new son();
        s1.bhk3();
        System.out.println(s1.gold); //Father's Gold
        s1.bhk2(); //Father's House

    }
}

    class father{

    int gold=1000;      // Attribute | Data variables |  Property | Instance Variables


        void bhk2() { //  Behaviour |  Method | Function | Data members
            System.out.println("Father - 2BHK");
        }

    }

    class son extends father{

    void bhk3(){
        System.out.println("Son - 3BHK");
    }

    }