package solutions.algorithms._1000_1999._1674_MinimumMoves_to_Make_Array_Complementary;

class Solution {
    public int minMoves(int[] nums, int limit) {

        int maxTarget = limit * 2;
        int n = nums.length;

        int[] diff = new int[maxTarget + 2]; // max is reachable + 1 for `total+1`

        for (int i = 0; i < n / 2; i++) {
            int f = nums[i];
            int s = nums[n - 1 - i];

            int total = f + s;
            // broadest range with 1 change
            // [low+1, high + limit]
            int low = Math.min(f, s) + 1;
            int high = Math.max(f, s) + limit;

            diff[low] -= 1;
            diff[high + 1] += 1;
            diff[total] -= 1;
            diff[total + 1] += 1;
        }


        int curr = 0;
        int best = Integer.MAX_VALUE;
        for (int target = 2; target <= limit * 2; target++) {
            curr += diff[target];
            best = Math.min(best, n + curr);
        }
        return best;
    }
}