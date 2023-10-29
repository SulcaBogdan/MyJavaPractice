package Arrays;

public class ArrayCommonElementsInteger {
    public static void main(String[] args) {

        int[] numbers1 = {20, 30, 3, 25, 35, 55, -16, 60, -100};
        int[] numbers2 = {21, 31, 26, 22, 25, 35, -1, 2, -3};

        for (int i = 0; i < numbers1.length; i++) {
            for (int j = 0; j < numbers2.length ; j++) {
                if (numbers1[i] == numbers2[j]){
                    System.out.println("Common words: " + numbers2[j]);
                }
            }
        }
    }
}


