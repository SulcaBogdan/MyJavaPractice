package Arrays;

import java.awt.image.AreaAveragingScaleFilter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class RemoveElementFromArray {
    public static void main(String[] args) {

        //sau transformi array ul  intr-o lista
        Integer[] numbers = {20, 30, 25, 35, -16, 60, -100};
        List<Integer> numbersList = new ArrayList<>(Arrays.asList(numbers));

        numbersList.remove(1); // Se va șterge elementul cu indexul 1

        System.out.println(numbersList);
    }
}


