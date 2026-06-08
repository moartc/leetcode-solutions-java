package solutions.algorithms._2000_2999._2161_Partition_Array_According_to_Given_Pivot;

import java.util.ArrayList;
import java.util.List;

class Solution {
    public int[] pivotArray(int[] nums, int pivot) {

        List<Integer> greater = new ArrayList<>();

        int lowerIdx = 0;
        int equalCounter = 0;
        for (int i = 0; i < nums.length; i++) {
            int val = nums[i];
            if (val < pivot) {
                nums[i] = Integer.MAX_VALUE;
                nums[lowerIdx] = val;
                lowerIdx++;
            } else if (val == pivot) {
                equalCounter++;
                nums[i] = Integer.MAX_VALUE;
            } else if (val < Integer.MAX_VALUE) {
                greater.add(val);
                nums[i] = Integer.MAX_VALUE;
            }
        }

        while (equalCounter > 0) {
            nums[lowerIdx] = pivot;
            lowerIdx++;
            equalCounter--;
        }

        for (Integer val : greater) {
            nums[lowerIdx] = val;
            lowerIdx++;
        }
        return nums;
    }
}