package solutions.algorithms._0_999._442_Find_All_Duplicates_in_an_Array;

import java.util.ArrayList;
import java.util.List;

class Solution {
    public List<Integer> findDuplicates(int[] nums) {
        List<Integer> answer = new ArrayList<>();
        for (int i = 0; i < nums.length; i++) {
            int v = Math.abs(nums[i]);
            if (nums[v - 1] < 0) {
                // already visited
                answer.add(v);
            } else {
                nums[v - 1] = -nums[v - 1];
            }
        }
        return answer;
    }
}