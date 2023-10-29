package Arrays;

import java.util.Arrays;

public class SortNumericAndStringArray {
    public static void main(String[] args) {
        int[] numericArray = {1,4,6,8,3,9,10};
        String[] stringArray = {"Dodan", "Bogdan", "Andra"};

        System.out.println("Original numeric array is : " + Arrays.toString(numericArray));
        Arrays.sort(numericArray);
        System.out.println("Sorted numeric array is : " + Arrays.toString(numericArray));

        System.out.println("Original string array is : " + Arrays.toString(stringArray));
        Arrays.sort(stringArray);
        System.out.println("Sorted string array is : " + Arrays.toString(stringArray));

    }
}
