package solutions._1_Two_Sum;

import java.util.HashMap;
import java.util.Map;

class Solution {
    public int[] twoSum(int[] nums, int target) {

        Map<Integer, Integer> map = new HashMap<>(nums.length);
        for (int i = 0; i < nums.length; i++) {
            int num = nums[i];
            if (map.containsKey(target - num)) {
                int first = map.get(target - num);
                return new int[]{first, i};
            } else {
                map.put(num, i);
            }
        }
        return new int[]{0, 0};
    }
}