package ex_30_Exceptions;

public class Lab117_Try_Catch {
    public static void main(String[] args) {
        System.out.println("1");
        try {
            int a = 10 / 0;
        }catch (Exception a){
            System.out.println("BaaKa");
        }
        System.out.println("2");
    }
}
