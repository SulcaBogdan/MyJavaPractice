package Arrays;

import java.util.Arrays;

public class TestTwoArraysEquality {
    public static void main(String[] args) {

        int array1[] = {2, 3, 4, 8, 10, 16};
        int array2[] = {2, 3, 4, 8, 10, 16};
        checkEquality(array1, array2);
    }

    public static void checkEquality(int[] array1, int[] array2) {
        Arrays.sort(array1);
        Arrays.sort(array2);
        boolean equal = true;

        if (array1.length != array2.length) {
            System.out.println("Arrays cannot be equal because their lengths are not equal.");
            return;
        }

        for (int i = 0; i < array1.length; i++) {
                if (array1[i] != array2[i]) {
                    equal = false;
                    break; // Nu mai are rost să verificăm dacă am găsit deja un element diferit
                }
            }


        if (equal) {
            System.out.println("The arrays are equal");
        } else {
            System.out.println("The arrays are not equal");
        }
    }
}
