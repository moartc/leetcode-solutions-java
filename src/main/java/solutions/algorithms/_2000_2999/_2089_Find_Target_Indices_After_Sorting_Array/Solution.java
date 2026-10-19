package solutions.algorithms._2000_2999._2089_Find_Target_Indices_After_Sorting_Array;

import java.util.ArrayList;
import java.util.List;

class Solution {
    public List<Integer> targetIndices(int[] nums, int target) {

        List<Integer> answer = new ArrayList<>();

        int targetCtr = 0;
        int lowerCtr = 0;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == target) {
                targetCtr++;
            } else if (nums[i] < target) {
                lowerCtr++;
            }
        }
        for (int i = lowerCtr; i < lowerCtr + targetCtr; i++) {
            answer.add(i);
        }
        return answer;
    }
}