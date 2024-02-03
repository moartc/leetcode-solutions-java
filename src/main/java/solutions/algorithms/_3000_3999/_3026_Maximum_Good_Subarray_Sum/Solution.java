package solutions.algorithms._3000_3999._3026_Maximum_Good_Subarray_Sum;

import java.util.HashMap;
import java.util.Map;

class Solution {
    public long maximumSubarraySum(int[] nums, int k) {

        Map<Integer, Long> map = new HashMap<>();

        long max = Long.MIN_VALUE;
        long currentSum = 0;
        for (int second : nums) {
            Long current = map.get(second);
            if (current == null || current > currentSum) {
                map.put(second, currentSum);
            }
            currentSum += second;
            Long f = map.get(second - k);
            if (f != null) {
                max = Math.max(max, currentSum - f);
            }
            Long s = map.get(second + k);
            if (s != null) {
                max = Math.max(max, currentSum - s);
            }
        }
        return max == Long.MIN_VALUE ? 0 : max;
    }
}