package Tasks;

public class Task017_SecondHighest_Array {
    public static void main(String[] args) {
        int[] number={45,23,86,3,56,25,76};
        int max=0;
        int se_max=0;
        for (int i=0;i<number.length;i++){
            if(number[i]>max)
            {
                se_max=max;
                max=number[i];
            } else if (number[i]>se_max && number[i]!=max) {
                se_max=number[i];

            }

        }
        System.out.println("Second largest number is: " + se_max);
    }
}
