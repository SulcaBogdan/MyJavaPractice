package Arrays;

import javax.lang.model.element.Element;

public class FindIndexOfElement {

    public static void main(String[] args) {

        int[] numbers = {20, 30, 25, 35, -16, 60, -100};
        System.out.println(findIndex(numbers, 25));


    }

    public static int findIndex(int[] numbers, int element){
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] == element){
                return i;
            }
        }
        return 0;

    }
}
