package LeetCodeProblems;

import java.util.Arrays;
import java.util.List;

public class Problem2974 {

    //Solutie pentru listele nesortate
    public static void main(String[] args) {
        Problem2974 obiect = new Problem2974();
        int[] nums = new int[4];
        nums[0] = 4;
        nums[1] = 4;
        nums[2] = 3;
        nums[3] = 8;
        System.out.println(Arrays.toString(obiect.numberGame(nums)));

    }

    public int[] numberGame(int[] nums) {
        int[] newArray = new int[nums.length];
        int index = 0;
        boolean isTrue = true;

        while (isTrue){
            int firstVal = aliceCheck(nums);
            nums = removeVal(nums, firstVal);
            int secondVal = bobCheck(nums);
            nums = removeVal(nums, secondVal);
            newArray[index] = secondVal;
            index++;
            newArray[index] = firstVal;
            index++;
            if (index == newArray.length){
                isTrue = false;
            }
        }


        return newArray;

    }

    public int aliceCheck(int[] nums){
        int minValue = nums[0];
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] < minValue){
                minValue = nums[i];
            }
        }
        return minValue;
    }

    public int bobCheck(int[] nums) {
        int minValue = nums[0];
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] < minValue) {
                minValue = nums[i];
            }

        }
        return minValue;
    }

    public int[] removeVal(int[] nums, int val) {
        boolean found = false;

        for (int i : nums){
            if (i == val){
                found = true;
                break;
            }
        }
        if (found){
            int[] newArray = new int[nums.length-1];
            int newArrayIndex = 0;

            for (int i : nums){
                if (i != val){
                    newArray[newArrayIndex++] = i;
                }
            }
            return newArray;
        }else{
            return  nums;
        }
    }


    //Versiunea cu elementele sorted

    public int[] numberGameSorted(int[] nums){
        Arrays.sort(nums);
        for (int i = 0; i < nums.length; i+=2) {
            int temp = nums[i];
            nums[i] = nums[i+1];
            nums[i+1] = temp;
        }
        return nums;
    }
}


