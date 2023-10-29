package Arrays;

public class FindEvenAndOddNumbers {


    public static void main(String[] args) {

        int array[] = {2, 3, 4, 8, 10, 16};

        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 == 0){
                System.out.println("Even number: " + array[i]);
            }else if (array[i] % 3 == 0){
                System.out.println("Odd number: " + array[i]);
            }
        }
    }
}
