package LeetCodeProblems;

import java.util.ArrayList;
import java.util.List;

public class Problema2859 {

    public static void main(String[] args) {
        Problema2859 obiect = new Problema2859();
        List<Integer> nums = new ArrayList<>(List.of(5,10,1,5,2));
        obiect.sumIndicesWithKSetBits(nums, 1);
        System.out.println(nums.get(1));


    }
    // elementele care au doar un 1 in valoarea lor binara sa se faca suma lor dupa index

    public int sumIndicesWithKSetBits(List<Integer> nums, int k) {
        int sum = 0;
        int index = 0;
        int arrayLen = nums.size() ;
        while (index < arrayLen){
           String binaryNum = Integer.toString(nums.get(index), 2);
           int count = 0;

            for (int i = 0; i < binaryNum.length(); i++) {
                if (binaryNum.charAt(i) == '1'){
                    count++;
                }
            }

           if (count == k){
               sum += nums.get(index);
           }

           index++;
        }
        return sum;
    }
}

