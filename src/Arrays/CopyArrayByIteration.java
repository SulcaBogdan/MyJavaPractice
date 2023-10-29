package Arrays;

import java.util.Arrays;

public class CopyArrayByIteration {
    public static void main(String[] args) {

        int[] numbers = {20, 30, 25, 35, -16, 60, -100};
        int[] numbersCopy =new int[7];
        for (int i = 0; i < numbers.length; i++) {
            numbersCopy[i] = numbers[i];
        }
        System.out.println(Arrays.toString(numbersCopy));

    }
}
