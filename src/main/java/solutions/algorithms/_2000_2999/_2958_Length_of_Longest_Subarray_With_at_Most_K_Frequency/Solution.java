package solutions.algorithms._2000_2999._2958_Length_of_Longest_Subarray_With_at_Most_K_Frequency;

import java.util.HashMap;
import java.util.Map;

class Solution {
    public int maxSubarrayLength(int[] nums, int k) {


        int l = 0;
        int r = -1;
        int length = 0;
        int maxFound = -1;
        Map<Integer, Integer> freq = new HashMap<>();
        while (r + 1 < nums.length) {
            r++;
            length++;
            int n = nums[r];
            Integer current = freq.getOrDefault(n, 0);
            current++;
            freq.put(n, current);
            if (current > k) {
                while (true) {
                    Integer leftN = freq.get(nums[l]);
                    freq.put(nums[l], leftN - 1);
                    int leftV = nums[l];
                    length--;
                    l++;
                    if (leftV == nums[r]) {
                        break;
                    }
                }
                // here
            } else {
                // do nothing, it's ok
            }
            maxFound = Math.max(maxFound, length);
        }
        return maxFound;
    }
}