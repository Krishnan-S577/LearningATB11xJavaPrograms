package ex_26_IIB;

public class ex_26_IIB {
    public static void main(String[] args) {
       new A();

    }
}

class A{
    A(){
        System.out.println("DC");
    }

    {
        System.out.println("Hi, I am IIB");
        System.out.println("If you want to call something when object is created");
        // mysql connection
        // read a csv, xlsx file
        // read json, xml.
        // read a text file or env file

    }

    {
        System.out.println("Hi, I am IIB2");
    }

    {
        System.out.println("Hi, I am IIB3");
    }


}
