package Arrays;

public class CheckForElementsInArray {
    public static void main(String[] args) {

        int array[] = {2, 3, 4, 8, 10, 55, 129, 33, 44, 16, 23};
        System.out.println(test(array));

    }

    public static boolean test(int[] array){
        for (int i = 0; i < array.length; i++) {
            if (array[i] == 0 || array[i] == -1){
                return true;
            }
        }
        return false;
    }
}
