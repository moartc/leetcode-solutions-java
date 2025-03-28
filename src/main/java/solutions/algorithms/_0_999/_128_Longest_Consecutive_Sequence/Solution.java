package solutions.algorithms._0_999._128_Longest_Consecutive_Sequence;

import java.util.HashSet;
import java.util.Set;

class Solution {

    public int longestConsecutive(int[] nums) {

        if (nums.length == 0) {
            return 0;
        }
        Set<Integer> allNumbers = new HashSet<>();
        int max = 1;

        for (int num : nums) {
            allNumbers.add(num);
        }

        for (Integer current : allNumbers) {
            int prev = current - 1;
            if (!allNumbers.contains(prev)) {
                // skip this one
                // find the sequence
                int ctr = 1;
                int next = current + 1;
                while (allNumbers.contains(next)) {
                    ctr++;
                    next++;
                }
                if (ctr > max) {
                    max = ctr;
                }
            }
        }
        return max;
    }
}