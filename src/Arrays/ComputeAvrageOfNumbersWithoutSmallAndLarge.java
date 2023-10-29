package Arrays;

import java.util.Arrays;

public class ComputeAvrageOfNumbersWithoutSmallAndLarge {
    public static void main(String[] args) {

        int array[] = {2, 3, 4, 8, 10, 55, 129, 33, 44, 16, 23};
        System.out.println("Original array: " + Arrays.toString(array));
        bubbleSort(array);
        System.out.println("Sorted array: " + Arrays.toString(array));
        System.out.println(elementsAvrage(array));

    }

    public static void bubbleSort(int[] array){
        for (int i = 0; i < array.length - 1; i++) {
            for (int j = 0; j < array.length - 1; j++) {
                if (array[j] > array[j + 1]){
                    int temp = array[j];
                    array[j] = array[j +1];
                    array[j+1] = temp;
                }

            }
        }
    }

    public static double elementsAvrage(int[] array){
        double sum = 0;
        for (int i = 1 ; i <array.length-1 ; i++) {
            sum += array[i];
        }
        double avrage = sum / (array.length-2);
        return avrage;
    }
}
