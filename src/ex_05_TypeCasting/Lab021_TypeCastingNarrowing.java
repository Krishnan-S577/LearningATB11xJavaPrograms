package ex_05_TypeCasting;

public class Lab021_TypeCastingNarrowing {
    public static void main(String[] args) {
        int val = 200;
        /*
        byte b = val; // Invalid - Narrowing - Implicit Casting is not allowed.
         Valid - Narrowing - Explicit Casting - Allowed.
        */
        byte a = (byte)val;
        System.out.println(a);

        long phone_no = 9876543210l;
        //short s = phone_no; // implicit ?
        short s = (short) phone_no; // Explicit Casting - Narrowing
        System.out.println(s);
    }
}
