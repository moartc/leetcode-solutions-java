package solutions.algorithms._0_999._47_Permutations_II;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Solution {

    /*
    Ok, so I basically have to use all possible numbers from the array
    I can track already added elements in a boolean array
    at every step I iterate through the remaining elements and add them
    I start by looping through all elements, create a list and add each of them to a separate list
    then I update the boolean array and call the method again, which does the same step but skips already added elements
    the final result should be stored in a set to avoid cases where I have f.ex 1,1,2 twice
    (once when I add the first element at index 0 and then at index 1, and then when I add the first 1 and then 2)

    potential improvement:
    sort the list, then when I add one element I am skipping all occurrences of the same element

    another improvement to consider: backtracking
    -----
    I'm starting with the initial approach and then implementing improvements -  it beats 9.54%
    improvement with sorting (without set) - beats 82.58%
    and with sorting and backtracking it's actually the same, but I am leaving this solution
     */

    List<List<Integer>> listToReturn;

    public List<List<Integer>> permuteUnique(int[] nums) {

        listToReturn = new ArrayList<>();

        Arrays.sort(nums);

        boolean[] alreadyAdded = new boolean[nums.length];
        add(nums, alreadyAdded, new ArrayList<>());

        return listToReturn;
    }

    private void add(int[] nums, boolean[] alreadyAdded, List<Integer> currentList) {
        if (currentList.size() == nums.length) {
            listToReturn.add(new ArrayList<>(currentList));
        }

        int previouslyCalled = Integer.MAX_VALUE;
        for (int i = 0; i < nums.length; i++) {
            if (alreadyAdded[i]) {
                //skip
            } else if (nums[i] != previouslyCalled) {
                currentList.add(nums[i]);
                previouslyCalled = nums[i];
                alreadyAdded[i] = true;
                add(nums, alreadyAdded, currentList);
                currentList.remove(currentList.size() - 1);
                alreadyAdded[i] = false;
            }
        }
    }
}
