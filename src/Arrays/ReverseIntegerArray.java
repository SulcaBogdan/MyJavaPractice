package Arrays;

import java.util.Arrays;

public class ReverseIntegerArray {
    public static void main(String[] args) {

        int[] numbers = {20, 30, 25, 35, -16, 60, -100};
        int[] newNumbers = new int[7];
        int indexValues = 6;

        for (int i = numbers.length -1 ; i >= 0; i--) {
            newNumbers[indexValues - i] = numbers[i];
        }
        System.out.println(Arrays.toString(newNumbers));
    }

}
