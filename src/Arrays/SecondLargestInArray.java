package Arrays;

import java.util.Arrays;

public class SecondLargestInArray {
    public static void main(String[] args) {

        int[] numbers = {10, 22, 10, 20, 11, 26};
        int[] numbersSorted = new int[numbers.length]; // Nou array pentru elementele ordonate

        for (int i = 0; i < numbers.length; i++) {
            numbersSorted[i] = numbers[i]; // Copiem elementele în noul array
        }

        // Sortăm noul array
        for (int i = 0; i < numbersSorted.length - 1; i++) {
            for (int j = i + 1; j < numbersSorted.length; j++) {
                if (numbersSorted[i] > numbersSorted[j]) {
                    // Schimbăm pozițiile elementelor în array pentru a le ordona
                    int temp = numbersSorted[i];
                    numbersSorted[i] = numbersSorted[j];
                    numbersSorted[j] = temp;
                }
            }
        }

        System.out.println("Array original: " + Arrays.toString(numbers));
        System.out.println("Array ordonat: " + Arrays.toString(numbersSorted));
        System.out.println("Al doilea cel mai mare element este: " + numbersSorted[numbersSorted.length-2]);
    }
}

//Varianta cu Arrays.sort

    /*public static void main(String[] args) {
        int[] my_array = {
                10789, 2035, 1899, 1456, 2013,
                1458, 2458, 1254, 1472, 2365,
                1456, 2165, 1457, 2456};
        System.out.println("Original numeric array : "+Arrays.toString(my_array));
        Arrays.sort(my_array);
        int index = my_array.length-1;
        while(my_array[index]==my_array[my_array.length-1]){
            index--;
        }
        System.out.println("Second largest value: " + my_array[index]);
    }*/