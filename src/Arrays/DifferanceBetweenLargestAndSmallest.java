package Arrays;

import java.lang.reflect.Array;
import java.sql.PreparedStatement;
import java.util.Arrays;

public class DifferanceBetweenLargestAndSmallest {
    public static void main(String[] args) {

        int array[] = {2, 3, 4, 8, 10, 55, 129, 33, 44, 16, 23};
        Arrays.sort(array);
        System.out.println("Original sorted array: " + Arrays.toString(array));
        System.out.println(diffSmallLarge(array));
        versiuneaLor(array); // cu algoritm de cautare a valorilor mai mari si mai mici
    }
    public static int diffSmallLarge(int[] array){
        return array[array.length-1] - array[0];
    }

    public static void versiuneaLor(int[] array){

        int maxValue = array[0];
        int minValue = array[0];

        for (int i = 0; i < array.length; i++) {
            if (array[i] > maxValue){
                maxValue = array[i];
            }else if (array[i] < minValue){
                minValue = array[i];
            }
        }
        int result = maxValue - minValue;
        System.out.println("Difference between largest and smallest number is : " + maxValue + " - " + minValue +" = "+ result );

    }

}
