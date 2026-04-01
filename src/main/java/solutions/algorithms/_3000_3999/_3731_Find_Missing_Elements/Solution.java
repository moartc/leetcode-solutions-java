package solutions.algorithms._3000_3999._3731_Find_Missing_Elements;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Solution {
    public List<Integer> findMissingElements(int[] nums) {

        if (nums.length == 1) {
            return List.of();
        }
        Arrays.sort(nums);
        int expected = nums[0] + 1;

        List<Integer> answer = new ArrayList<>();
        int i = 1;
        while (i < nums.length) {
            if (expected < nums[i]) {
                answer.add(expected);
            } else {
                i++;
            }
            expected++;
        }
        return answer;
    }
}