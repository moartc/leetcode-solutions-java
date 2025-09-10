package solutions.algorithms._0_999._416_Partition_Equal_Subset_Sum;

class Solution {


    /*
    If I can partition into two subsets with equal sums, it means that the total sum has to be even.
    The sum of one set is then equal to the half of the total Sum.

    In one step I can either add the current element or skip it

    update: caching as a set of pairs where Pair is a class containing index and sum is extremely slow
    I am replacing it with a 2d array
    and now instead of ~5% it beats ~67%
    */

    boolean[][] cache;

    public boolean canPartition(int[] nums) {


        int totalSum = 0;
        for (int num : nums) {
            totalSum += num;
        }
        if (totalSum % 2 != 0) {
            return false;
        }
        int sumToFind = totalSum / 2;
        cache = new boolean[nums.length + 1][sumToFind];


        return find(0, 0, sumToFind, nums);
    }

    boolean find(int idx, int currentSum, int sumToFind, int[] nums) {

        if (idx >= nums.length) {
            cache[idx][currentSum] = true;
            return false;
        }

        if (cache[idx][currentSum]) {
            return false;
        }

        int val = nums[idx];
        // skip and continue
        boolean answer = find(idx + 1, currentSum, sumToFind, nums);
        if (answer) {
            return true;
        }

        // add and continue
        int updatedSum = currentSum + val;
        if (updatedSum == sumToFind) {
            return true;
        } else if (updatedSum > sumToFind) {
            cache[idx][currentSum] = true;
            return false;
        } else {
            // continue to the next one
            boolean answer2 = find(idx + 1, updatedSum, sumToFind, nums);
            if (answer2) {
                return true;
            }
        }
        cache[idx][currentSum] = true;
        return false;
    }
}