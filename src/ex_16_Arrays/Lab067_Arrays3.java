package ex_16_Arrays;

public class Lab067_Arrays3 {
    public static void main(String[] args) {
        String[] names = {"Krishnan","Dazzy","Zoro"};
        System.out.println(names.length);
        System.out.println(names[2]);

        String[] names2 = new String[3];
        names2[0] = "Krishnan";
        names[1] = "Dazzy";
        names[2] = "Zoro";

        System.out.println(names[2]);
    }
}
