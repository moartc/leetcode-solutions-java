package solutions.algorithms._0_999._448_Find_All_Numbers_Disappeared_in_an_Array;

import java.util.ArrayList;
import java.util.List;

class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {

        for (int num : nums) {
            if (num > 0 && num <= nums.length) {
                markVal(num, nums);
            }
        }
        List<Integer> answer = new ArrayList<>();
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != -1) {
                answer.add(i + 1);
            }
        }
        return answer;
    }

    void markVal(int v, int[] nums) {
        int origValue = nums[v - 1];
        if (origValue == v) {
            nums[v - 1] = -1;
        } else if (origValue > 0 && origValue <= nums.length) {
            nums[v - 1] = -1;
            markVal(origValue, nums);
        } else {
            nums[v - 1] = -1;
        }
    }

}