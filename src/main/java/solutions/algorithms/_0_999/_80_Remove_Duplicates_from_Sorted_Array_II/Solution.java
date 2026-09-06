package solutions.algorithms._0_999._80_Remove_Duplicates_from_Sorted_Array_II;

import java.util.HashMap;
import java.util.Map;

class Solution {
    public int removeDuplicates(int[] nums) {

        Map<Integer, Integer> uniqueCtr = new HashMap<>();

        int currIdx = 0;
        for (int i = 0; i < nums.length; i++) {
            int v = nums[i];
            int curr = uniqueCtr.getOrDefault(v, 0);
            if (curr <= 1) {
                nums[currIdx] = v;
                currIdx++;
            }
            uniqueCtr.put(v, curr + 1);
        }
        return currIdx;
    }
}