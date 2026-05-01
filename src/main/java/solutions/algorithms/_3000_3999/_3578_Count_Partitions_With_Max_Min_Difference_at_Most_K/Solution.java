package solutions.algorithms._3000_3999._3578_Count_Partitions_With_Max_Min_Difference_at_Most_K;

import java.util.Deque;
import java.util.LinkedList;

class Solution {

    /*
    no way it's a medium
     */

    private final static int MOD = ((int) Math.pow(10, 9) + 7);
    int[] dp;
    int[] prefixSum;

    public int countPartitions(int[] nums, int k) {
        dp = new int[nums.length];
        prefixSum = new int[nums.length];

        int left = 0;
        int right = 0;

        Deque<Integer> maxDeque = new LinkedList<>();
        Deque<Integer> minDeque = new LinkedList<>();

        while (right < nums.length) {

            int curr = nums[right];
            while (!maxDeque.isEmpty() && nums[maxDeque.getLast()] < curr) {
                maxDeque.removeLast();
            }
            maxDeque.addLast(right);

            while (!minDeque.isEmpty() && nums[minDeque.getLast()] > curr) {
                minDeque.removeLast();
            }
            minDeque.addLast(right);


            if (nums[maxDeque.getFirst()] - nums[minDeque.getFirst()] > k) {
                while (!maxDeque.isEmpty() && !minDeque.isEmpty() && nums[maxDeque.getFirst()] - nums[minDeque.getFirst()] > k && left < right) {
                    if (maxDeque.getFirst() == left) {
                        maxDeque.removeFirst();
                    }
                    if (!minDeque.isEmpty() && minDeque.getFirst() == left) {
                        minDeque.removeFirst();
                    }
                    left++;
                }
            }

            int tot = 0;
            if (left == 0) {
                tot = 1 + (right == 0 ? 0 : prefixSum[right - 1]);
            } else {
                int leftSum = left < 2 ? 0 : prefixSum[left - 2];
                tot = ((prefixSum[right - 1] - leftSum) % MOD + MOD) % MOD;
            }
            dp[right] = tot % MOD;
            prefixSum[right] = right == 0 ? dp[right] : prefixSum[right - 1] + dp[right];
            prefixSum[right] = prefixSum[right] % MOD;
            right++;
        }
        return dp[dp.length - 1];
    }

}