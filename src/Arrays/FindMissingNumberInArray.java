package Arrays;

import java.sql.SQLOutput;

public class FindMissingNumberInArray {
    public static void main(String[] args) {

        int array1[] = {2, 3, 4, 8, 10, 16};
        missingNumber(array1, 22);
    }
    public static void missingNumber(int[] array , int number){
        boolean numberPresent = false;
        for (int i = 0; i < array.length; i++) {
            if (number == array[i]){
                numberPresent = true;
                System.out.println("Element found ");
                break;
            }
        }
        if (!numberPresent){
            System.out.println("Element not found");
        }
    }
}
