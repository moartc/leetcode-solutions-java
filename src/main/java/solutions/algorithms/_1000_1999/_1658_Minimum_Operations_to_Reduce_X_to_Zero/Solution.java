package solutions.algorithms._1000_1999._1658_Minimum_Operations_to_Reduce_X_to_Zero;

class Solution {


    public int minOperations(int[] nums, int x) {

        int total = 0;
        for (int num : nums) {
            total += num;
        }
        int search = total - x;
        if (search < 0) {
            return -1;
        }
        int l = 0;
        int r = -1;
        int curr = 0;
        int bestFound = Integer.MAX_VALUE;
        while (r + 1 < nums.length) {
            r++;
            curr += nums[r];
            if (curr == search) {
                int fromRight = nums.length - 1 - r;
                bestFound = Math.min(bestFound, fromRight + l);
            } else if (curr > search) {
                while (curr > search) {
                    curr -= nums[l];
                    l++;
                    if (curr == search) {
                        int fromRight = nums.length - 1 - r;
                        bestFound = Math.min(bestFound, fromRight + l);
                    }
                }
            }  // else curr < search, nothing to do
        }
        if (bestFound != Integer.MAX_VALUE) {
            return bestFound;
        } else {
            return -1;
        }
    }

}