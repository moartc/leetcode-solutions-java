package solutions.algorithms._0_999._90_Subsets_II;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Solution {


    /*
    notes:
    "no duplicate subsets" so I cannot iterate from the beginning after some time, but start from the next index
    I also have to sort the initial array

     in the case of this array: [1,2,2]
     I can skip the duplicate if from '1' I go to the next one '2' but then I skip all the same values

     also, I need to track the current index
     */
    public List<List<Integer>> subsetsWithDup(int[] nums) {

        Arrays.sort(nums);
        List<List<Integer>> result = new ArrayList<>();
        int i = 0;
        result.add(new ArrayList<>());
        while (i < nums.length) {
            subset(i, new ArrayList<>(), nums, result);
            int v = nums[i];
            int newI = i;
            while (newI < nums.length && nums[newI] == v) {
                newI++;
            }
            i = newI;
        }
        return result;
    }

    void subset(int currentIdx, List<Integer> currentSubset, int[] nums, List<List<Integer>> results) {

        // get the current value and add it to the current subset and to result
        int currVal = nums[currentIdx];
        currentSubset.add(currVal);
        results.add(new ArrayList<>(currentSubset));

        // and now, add next values, but with skipping duplicates
        int i = currentIdx + 1;
        while (i < nums.length) {
            subset(i, currentSubset, nums, results);
            currentSubset.remove(currentSubset.size() - 1);
            int v = nums[i];
            // skip the same value
            int newI = i;
            while (newI < nums.length && nums[newI] == v) {
                newI++;
            }
            i = newI;

        }
    }
}