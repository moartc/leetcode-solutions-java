package solutions.algorithms._3000_3999._3041_Maximize_Consecutive_Elements_in_an_Array_After_Modification;

import java.util.Arrays;

class Solution {

    /*
    at each index I can keep values as it is, or increase it
    then I can jump to the next one that is equal (then I increase it) or grater by one (without increasing it)
     */

//    7, 8, 9, 10, 11, 12, 13, 14

    int[][] cache;

    public int maxSelectedElements(int[] nums) {

        cache = new int[2][nums.length];
        for (int[] ints : cache) {
            Arrays.fill(ints, -1);
        }

        Arrays.sort(nums);
        int bestFound = -0;
        for (int i = 0; i < nums.length; i++) {
            int withoutIncrease = findLongest(i, false, nums);
            bestFound = Math.max(bestFound, withoutIncrease);
            int withIncrease = findLongest(i, true, nums);
            bestFound = Math.max(bestFound, withIncrease);
        }
        return bestFound;
    }

    int findLongest(int idx, boolean increase, int[] nums) {

        int withIncrease = increase ? 1 : 0;
        if (cache[withIncrease][idx] != -1) {
            return cache[withIncrease][idx];
        }
        int curr = nums[idx] + (increase ? 1 : 0);

        int bestFound = 0;
        for (int i = idx + 1; i < nums.length; i++) {
            if (nums[i] - 2 > curr) {
                break;
            }
            if (curr == nums[i] - 1) {
                bestFound = Math.max(bestFound, findLongest(i, false, nums));
            } else if (curr == nums[i]) {
                bestFound = Math.max(bestFound, findLongest(i, true, nums));
            }
        }
        cache[withIncrease][idx] = bestFound + 1;
        return cache[withIncrease][idx];
    }


}