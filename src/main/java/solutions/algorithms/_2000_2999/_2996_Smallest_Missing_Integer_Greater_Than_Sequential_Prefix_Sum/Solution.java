package solutions.algorithms._2000_2999._2996_Smallest_Missing_Integer_Greater_Than_Sequential_Prefix_Sum;

import java.util.HashSet;
import java.util.Set;

class Solution {

    /*

     */
    public int missingInteger(int[] nums) {

        if (nums.length == 1) {
            return nums[0] + 1;
        }
        boolean longestFound = false;
        Set<Integer> set = new HashSet<>();
        set.add(nums[0]);
        int currentSum = nums[0];
        for (int i = 1; i < nums.length; i++) {
            set.add(nums[i]);
            if (!longestFound) {
                if (nums[i] == nums[i - 1] + 1) {
                    // sequence valid, increase sum
                    currentSum += nums[i];
                } else {
                    longestFound = true;
                }
            }
        }

        for (int i = currentSum; i < Integer.MAX_VALUE; i++) {
            if (!set.contains(i)) {
                return i;
            }
        }
        // cannot happen
        return -1;
    }
}