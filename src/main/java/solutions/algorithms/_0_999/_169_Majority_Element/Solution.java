package solutions.algorithms._0_999._169_Majority_Element;

import java.util.HashMap;
import java.util.Map;

class Solution {
    public int majorityElement(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>(nums.length);
        for (int value : nums) {
            int counter = map.getOrDefault(value, 0) + 1;
            if (counter > nums.length / 2) {
                return value;
            }
            map.put(value, counter);
        }
        return -1;
    }
}