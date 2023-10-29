package Arrays;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class InsertElementAtSpecificIndex {

    /*public static void main(String[] args) {

        int[] numbers = {20, 30, 25, 35, -16, 60, -100};
        int elementAtIndex = 3;
        int valueToAdd = 55;
        for (int i = numbers.length-1; i > elementAtIndex; i--) {
            numbers[i] = numbers[i-1];
        }
        numbers[elementAtIndex] = valueToAdd;
        System.out.println(Arrays.toString(numbers));

    }
}*/

//sau transformam array ul intr o lista deoarece arrays sunt imutabile si in procesul de adaugare se pierde un element.
    //pe cand la liste se pot adauga foarte usor.

    public static void main(String[] args) {
        Integer[] numbers = {20, 30, 25, 35, -16, 60, -100};
        List<Integer> numbersList = new ArrayList<>(Arrays.asList(numbers));
        numbersList.add(3,55);
        System.out.println(numbersList);
    }
}