package ex_16_Arrays;

public class Lab076_2DArray2 {
    public static void main(String[] args) {
        int[][] matrix = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};

        for ( int i =0; i < matrix.length; i++){ // 0 to 2  matrix.length - r
            for(int j = 0; j <matrix[i].length; j++){ // matrix[i].length -> c
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}
