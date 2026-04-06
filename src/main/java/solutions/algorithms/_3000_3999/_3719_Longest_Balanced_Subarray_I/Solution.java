package solutions.algorithms._3000_3999._3719_Longest_Balanced_Subarray_I;

import java.util.HashSet;
import java.util.Set;

class Solution {
    public int longestBalanced(int[] nums) {
        int maxLength = 0;
        for (int i = 0; i < nums.length; i++) {
            int evenCtr = 0;
            int oddCtr = 0;
            Set<Integer> visited = new HashSet<>();
            for (int j = i; j < nums.length; j++) {
                if (visited.add(nums[j])) {
                    if (nums[j] % 2 == 0) {
                        evenCtr++;
                    } else {
                        oddCtr++;
                    }
                }

                if (evenCtr == oddCtr) {
                    int length = j - i + 1;
                    maxLength = Math.max(maxLength, length);
                }
            }
        }
        return maxLength;
    }

}