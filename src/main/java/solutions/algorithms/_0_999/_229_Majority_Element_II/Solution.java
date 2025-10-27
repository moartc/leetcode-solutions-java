package solutions.algorithms._0_999._229_Majority_Element_II;

import java.util.ArrayList;
import java.util.List;

class Solution {
    /*
    there might be at most 2 such elements
    I could try something similar to boyer-moore from the problem 169

     */
    public List<Integer> majorityElement(int[] nums) {

        if (nums.length == 1) {
            return List.of(nums[0]);
        } else if (nums.length == 2) {
            if (nums[0] != nums[1]) {
                return List.of(nums[0], nums[1]);
            } else {
                // there is only one unique element
                return List.of(nums[0]);
            }
        } else {
            int f = 0;
            int fc = 0;
            int s = 0;
            int sc = 0;

            for (int v : nums) {
                if (v == f) {
                    fc++;
                } else if (v == s) {
                    sc++;
                } else if (fc == 0) {
                    f = v;
                    fc = 1;
                } else if (sc == 0) {
                    s = v;
                    sc = 1;
                } else {
                    fc--;
                    sc--;
                }
            }
            int cntF = 0;
            int cntS = 0;
            for (int v : nums) {
                if (v == f) {
                    cntF++;
                } else if (v == s) {
                    cntS++;
                }
            }
            int exp = nums.length / 3;
            List<Integer> answer = new ArrayList<>();
            if (cntF > exp) {
                answer.add(f);
            }
            if (cntS > exp) {
                answer.add(s);
            }
            return answer;
        }
    }
}