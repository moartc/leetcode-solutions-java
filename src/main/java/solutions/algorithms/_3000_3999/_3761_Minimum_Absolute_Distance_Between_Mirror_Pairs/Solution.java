package solutions.algorithms._3000_3999._3761_Minimum_Absolute_Distance_Between_Mirror_Pairs;

import java.util.HashMap;
import java.util.Map;

class Solution {
    public int minMirrorPairDistance(int[] nums) {

        int minDist = Integer.MAX_VALUE;

        Map<Integer, Integer> valToIndex = new HashMap<>();
        for (int i = nums.length - 1; i >= 0; i--) {
            int num = nums[i];
            int reversed = 0;
            while (num != 0) {
                int rem = num % 10;
                reversed *= 10;
                reversed += rem;
                num /= 10;
            }
            if (valToIndex.containsKey(reversed)) {
                Integer prevIdx = valToIndex.get(reversed);
                minDist = Math.min(minDist, Math.abs(i - prevIdx));
            }
            valToIndex.put(nums[i], i);
        }
        return minDist == Integer.MAX_VALUE ? -1 : minDist;
    }
}