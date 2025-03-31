package Tasks;

public class Task015_LeapYear {
    public static void main(String[] args) {
        int year = 2025;

        boolean isLeap = false;
        if((year%4==0 && year%100!=0)|| (year%400==0)){
            isLeap = true;
        }
        if(isLeap){
            System.out.println("Leap year");
        }else {
            System.out.println("Not a Leap year");
        }
    }
}
