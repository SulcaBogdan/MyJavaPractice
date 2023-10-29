package Arrays;

public class CheckSumOfNumIsFixed {
    public static void main(String[] args) {

        int[] array = {10, 77, 10, 54, -11, 10};
        System.out.println(checkSum(array, 10));

    }

    public static boolean checkSum(int[] array, int numberToCheck){
        int tempSum = 0;
        int fixedSum = 30;
        for (int i = 0; i < array.length; i++) {
            if (array[i] == numberToCheck){
                tempSum += array[i];
            }
        }
        if (tempSum == fixedSum){
            return true;
        }
        return false;
    }
}
