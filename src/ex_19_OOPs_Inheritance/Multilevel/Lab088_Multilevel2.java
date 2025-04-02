package ex_19_OOPs_Inheritance.Multilevel;

public class Lab088_Multilevel2 {
    public static void main(String[] args) {

        Son Dazzy = new Son();

        Grandfather gf = new Son();
        gf.gf();
        gf.home();


        Grandfather gf2 = new Father();
        gf2.gf();
        gf2.home();

        Father f = new Son();
        f.f();
        f.gf();
        f.home();
    }
}
