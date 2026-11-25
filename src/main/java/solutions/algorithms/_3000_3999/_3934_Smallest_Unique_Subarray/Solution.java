package solutions.algorithms._3000_3999._3934_Smallest_Unique_Subarray;

import java.util.HashMap;
import java.util.Map;

class Solution {

    private final static int MOD = 1000000000 + 7; // (10^9)+7

    public int smallestUniqueSubarray(int[] nums) {
        int r = nums.length;
        int l = 1;
        int bestFound = -1;
        while (r >= l) {
            int m = (r + l) / 2;
            if (exists(m, nums)) {
                bestFound = m;
                r = m - 1;
            } else {
                l = m + 1;
            }
        }
        return bestFound;
    }

    boolean exists(int size, int[] nums) {

        Map<Long, Integer> hashCtr = new HashMap<>();
        long hashBase = 100000 + 1; // 10^5 + 1 "random" xD greater than max in nums
        long currHash = 0;
        long maxHash = 1;
        for (int i = 0; i < size - 1; i++) {
            maxHash *= hashBase;
            maxHash %= MOD;
        }
        // init hash
        currHash = nums[0];
        for (int i = 1; i < size; i++) {
            currHash *= hashBase;
            currHash %= MOD;
            currHash += nums[i];
            currHash %= MOD;
        }
        currHash %= MOD;
        hashCtr.put(currHash, 1);

        for (int i = 1; i + size <= nums.length; i++) {
            // remove the left one
            currHash -= maxHash * nums[i - 1];
            currHash %= MOD;
            currHash += MOD;
            currHash *= hashBase;
            currHash %= MOD;
            currHash += nums[i + size - 1];
            currHash %= MOD;
            Integer aDefault = hashCtr.getOrDefault(currHash, 0);
            hashCtr.put(currHash, aDefault + 1);
        }

        for (Integer value : hashCtr.values()) {
            if (value == 1) {
                return true;
            }
        }
        return false;
    }
}