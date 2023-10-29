package Arrays;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class FindSumOfTwoElementsOfAGivenNumber {
    public static void main(String[] args) {
        //versiunea mea
        int[] array = {49, 1, 3, 200, 2, 4, 70, 5};
        sumOfNums(array, 202);
        //versiunea w3school
        ArrayList<Integer> my_array = new ArrayList<Integer>();
        my_array.add(1);
        my_array.add(2);
        my_array.add(4);
        my_array.add(5);
        my_array.add(6);
        int target = 6;
        ArrayList<Integer> result = two_sum_array_target(my_array, target);
        for(int i : result)
            System.out.print("Index: "+i + " ");

    }
//metoda mea
    public static void sumOfNums(int[]array, int target){
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                if (array[i] + array[j] == target) {
                    System.out.println("Numbers are : " + array[i] + " and " + array[j]);
                }
            }
        }
    }

//metoda lor


    public static ArrayList<Integer> two_sum_array_target(final List<Integer> a, int b) {

        HashMap<Integer, Integer> my_map = new HashMap<Integer, Integer>();
        ArrayList<Integer> result = new ArrayList<Integer>();
        result.add(0);
        result.add(1);
        for(int i = 0; i < a.size(); i++){
            if(my_map.containsKey(a.get(i))){
                int index = my_map.get(a.get(i));
                result.set(0, index );
                result.set(1, i );
                break;
            }
            else{
                my_map.put(b - a.get(i), i);
            }
        }

        return result;
    }

}

