package ex_010_ForLoops;

public class Lab041_ForLoop_Break {
    public static void main(String[] args) {
        for (int i = 0; i <= 50; i++) {
            if (i == 5) {
                System.out.println("Break");
                break;
            }
            System.out.println(i);
        }
    }
}