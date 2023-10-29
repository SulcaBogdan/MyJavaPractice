package Arrays;

import java.util.Arrays;

public class SecondSmallestElementInArray {
    public static void main(String[] args) {
        int[] my_array = {
                10789, 2035, 1899, 1456, 2013,
                1458, 2458, 1254, 1472, 2365,
                1456, 2165, 1457, 2456};
        System.out.println("Original numeric array : "+ Arrays.toString(my_array));
        Arrays.sort(my_array);
        System.out.println("Sorted numeric array : "+ Arrays.toString(my_array));
        int secondSmalles = my_array[1];
        System.out.println("Second smallest number : " + secondSmalles);
    }
}
