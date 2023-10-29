package Arrays;

import java.util.Arrays;

public class SumOfValuesOfArray {
    public static void main(String[] args) {

        int[] numArray = {1,2,3,44,55,66,77};
        int sum = 0;
        for (int i = 0; i < numArray.length; i++) {
            sum += numArray[i];
        }
        System.out.println(sum);

        //Sau varianta cu lambda

        int[] myArray = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int sum1 = 0;
        //lambda function pentru elementele 'i' in array ul myArray se adauga la sum fiecare element in parte.
        for (int i : myArray)
            sum1 += i;
        System.out.println("The sum is " + sum1);
    }
}
