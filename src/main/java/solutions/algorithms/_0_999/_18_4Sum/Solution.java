package solutions.algorithms._0_999._18_4Sum;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Solution {
    /*
    Like 3-sum, but with an additional loop
    a, b, and c start on the left side, while d starts on the right and moves backward
     */
    public List<List<Integer>> fourSum(int[] nums, int target) {

        List<List<Integer>> answer = new ArrayList<>();

        Arrays.sort(nums);
        int a = 0;
        while (a < nums.length - 2) { // most outer loop for a
            int b = a + 1;
            while (b < nums.length - 1) { // 2nd loop
                int sumWithout2Pointers = nums[a] + nums[b];
                int c = b + 1;
                int d = nums.length - 1;
                // loop like in the regular 2 sum problem
                while (c < d) {
                    int cdSum = nums[c] + nums[d];
                    long totalSum = sumWithout2Pointers + cdSum;
                    if (totalSum == target) {
                        answer.add(List.of(nums[a], nums[b], nums[c], nums[d]));
                        // let's move one of them - the same procedure as for other loops - I have to skip the same value
                        do {
                            c++;
                        } while (c < d && nums[c - 1] == nums[c]);
                    } else if (totalSum > target) {
                        d--;
                    } else { // totalSum < target
                        c++;
                    }
                }
                // move the 2nd loop
                do {
                    b++;
                } while (b < nums.length - 1 && nums[b - 1] == nums[b]);
            }
            // move the outer loop
            do {
                a++;
            } while (a < nums.length - 2 && nums[a - 1] == nums[a]);

        }
        return answer;
    }
}