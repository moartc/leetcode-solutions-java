package solutions.algorithms._0_999._228_Summary_Ranges;

import java.util.ArrayList;
import java.util.List;

class Solution {
    public List<String> summaryRanges(int[] nums) {

        int length = nums.length;
        if (length == 0) {
            return List.of();
        } else if (length == 1) {
            return List.of(Integer.toString(nums[0]));
        }
        int start = nums[0];
        int i = 0;
        List<String> result = new ArrayList<>();
        while (i < length) {

            while (i + 1 < length && nums[i + 1] - nums[i] == 1) {
                i++;
            }

            int current = nums[i];
            if (start == current) {
                result.add(Integer.toString(start));
            } else {
                result.add(start + "->" + current);
            }
            if (++i < length) {
                start = nums[i];
            }
        }
        return result;
    }
}