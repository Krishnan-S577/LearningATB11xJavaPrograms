package ex_16_Arrays;

public class Lab072_Array_SumOf {
    public static void main(String[] args) {
        int[] num = {11,12,13};
        int sum =0;
        int sum1 =0;
        for (int i = 0; i< num.length;i ++){
            sum = sum + num[i];
        }
        System.out.println(sum);
        System.out.println(" ---");

        System.out.println(" For Each ---"); //Enhanced for loop
        for (int n : num) {
            sum1 = sum1 + n;
        }
        System.out.println(sum1);


    }
}

