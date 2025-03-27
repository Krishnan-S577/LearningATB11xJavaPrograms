package ex_16_Arrays;

public class Lab069_Arrays_Min {
    public static void main(String[] args) {
        int[] array = {25, 14, 56, 15, 36, 56, 77, 18, 29, 49};

        int minouput = givememin(array);
        System.out.println(minouput);
    }

    private static int givememin(int[] array) {
        int min = array[0];
        for (int i = 0; i < array.length; i++) {
            if (array[i] < min) {
                min = array[i];
            }
        }
        return min;
    }
}

