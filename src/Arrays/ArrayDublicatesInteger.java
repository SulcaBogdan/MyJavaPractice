package Arrays;

public class ArrayDublicatesInteger {
    public static void main(String[] args) {


        int[] numbers = {20, 30, 25, 25, 35, 35, -16, 60, -100};

        for (int i = 0; i < numbers.length; i++) {
            for (int j = 1; j <numbers.length ; j++) {
                if (numbers[i] == numbers[j] && (i != j)){
                    System.out.println("Duplicate Element : " +numbers[j]);
                    break;
                }
            }
        }
    }
}
