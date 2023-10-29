package Arrays;

import java.util.Arrays;

public class AddTwoMatrixOfSameSize {
    public static void main(String[] args) {

        int[][] array1 = new int[5][5];
        int[][] array2 = new int[5][5];
        int[][] sum = new  int[5][5];

        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                array1[i][j] = 5;
            }
        }

        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                array2[i][j] = 6;
            }
        }

        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                sum[i][j] = array2[i][j] + array2[i][j];
            }
        }
        System.out.println("Sum of matrix is:");
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.print(sum[i][j] + "\t");
            }
            System.out.println();
        }
    }
}
