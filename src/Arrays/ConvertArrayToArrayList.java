package Arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ConvertArrayToArrayList {
    public static void main(String[] args) {

        Integer[] numbers = {1,2,3,4,5,6};
        ArrayList<Integer> numbersList = new ArrayList<Integer>(Arrays.asList(numbers));
        System.out.println(numbersList);

    }
}
