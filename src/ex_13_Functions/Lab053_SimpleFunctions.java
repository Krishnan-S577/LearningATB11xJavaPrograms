package ex_13_Functions;

public class Lab053_SimpleFunctions {
    public static void main(String[] args) {
        int result = return_int();
        System.out.println(result);

        boolean r = return_boolean();
        System.out.println(r);

        float pi = return_float_pi_value();
        System.out.println(pi);

        String a = return_String();
        System.out.println(a);

    }
    static void noreturn(){
        System.out.println("No return");
    }

    static int return_int(){
        return 10;
    }

    static boolean return_boolean(){
        return true;
    }

    static float return_float_pi_value(){
        return 3.14f;
    }

    static byte return_byte(){
        return 100;
    }

    static long return_long(){
        return 10l;
    }

    static String return_String(){
        return "Dazzy";
    }
}
