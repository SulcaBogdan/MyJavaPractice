package Arrays;

import java.util.Arrays;
import java.util.HashSet;

public class FindLengthOfLongestConsecutiveUnsortedElements {
    public static void main(String[] args) {

        int[] array = {49, 1, 3, 200, 2, 4, 70, 5};
        System.out.println(longestSequence(array));

    }

    public static int longestSequence(int[] nums){
        //HashSet = Seturile din python
        final HashSet<Integer> hSet = new HashSet<Integer>();
        for (int i : nums) hSet.add(i);

        int longestSequenceLength = 0;
        for (int i : nums){
            int length = 1;
            for (int j = i - 1; hSet.contains(j) ; j--) {
                hSet.remove(j);
                length++;

            }
            for (int j = i + 1; hSet.contains(j) ; j++) {
                hSet.remove(j);
                length++;

            }
            longestSequenceLength = Math.max(longestSequenceLength, length);
        }
        return longestSequenceLength;
    }

}
