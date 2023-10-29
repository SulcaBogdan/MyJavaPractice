package Arrays;

public class CheckIfValueIsInArray {
    public static void main(String[] args) {
        int[] numbers = {20, 30, 25, 35, -16, 60, -100};

        int value1 = 25;
        int value2 = 26;
        System.out.println(checkValueArray(numbers,value1));
        System.out.println(checkValueArray(numbers,value2));

    }

    public static boolean checkValueArray(int[] numbers, int value) {
        /*for (int n : numbers)
            if  (value == n){    --> lambda
                return true;
            }*/

        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] == value) {
                return true;
            }
        }
        return false;

    }
}
