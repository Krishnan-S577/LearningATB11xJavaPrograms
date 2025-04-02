package ex_19_OOPs_Inheritance.Multilevel;

public class Lab089_Multilevel3 {
    public static void main(String[] args) {

        Son Krishnan = new Son();
        Krishnan.home();
        Krishnan.s();
        Krishnan.f();
        Krishnan.gf();
        System.out.println(Krishnan.gold_gf);

        System.out.println("----");

        Father f1 = new Father();
        f1.home();

        System.out.println("----");

        Grandfather gf1 = new Grandfather();
        gf1.home();

        System.out.println("----");

        Grandfather grandFather = new Son();
        grandFather.home();

    }
}
