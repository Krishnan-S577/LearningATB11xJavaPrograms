package ex_010_ForLoops;

public class Lab042_ForLoop_Continue {
    public static void main(String[] args) {
        for (int i = 0; i < 50; i++) { // 0 to 49, 50 times
            if (i == 5) {
                continue; // skip below code, move to top
            }
            System.out.println(i);
        }
    }
}
