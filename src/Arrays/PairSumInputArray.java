package Arrays;

import java.util.Scanner;

public class PairSumInputArray {
    public static void main(String[] args) {
        int array2[] = {2, 3, 4, 8, 10, 16};

        pairsValues(array2,10);
        pairsValues(array2,7);

    }

    public static void pairsValues(int[] array , int number){
        for (int i = 0; i < array.length; i++) {
            for (int j = i + 1 ; j < array.length; j++) {
                if (array[i] + array[j] == number){
                    System.out.println(array[i] + " + " + array[j]+ " = " + number);
                }
            }
        }
    }
}
