package solutions.algorithms._3000_3999._3116_Kth_Smallest_Amount_With_Single_Denomination_Combination;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

class Solution {


    /*
    2 4 6 8 10 12 14 16 18
    5 10 15 20

    2 4 5 6 8 10 12 14 15
    1 2 3 4 5 6  7
    answer 12

     */
    public long findKthSmallest(int[] coins, int k) {

        Map<Integer, List<List<Integer>>> sizeToLists = new HashMap<>();
        for (int i = 1; i <= coins.length; i++) {
            List<List<Integer>> all = new ArrayList<>();
            generateAllCombinations(0, coins, i, new ArrayList<>(), all);
            sizeToLists.put(i, all);
        }

        Map<Integer, List<Long>> sizeToLcms = new HashMap<>();
        for (Map.Entry<Integer, List<List<Integer>>> entry : sizeToLists.entrySet()) {
            int size = entry.getKey();
            List<Long> lcms = new ArrayList<>();
            for (List<Integer> integers : entry.getValue()) {
                lcms.add(lcm(integers));
            }
            sizeToLcms.put(size, lcms);
        }

        int min = Integer.MAX_VALUE;
        for (int coin : coins) {
            min = Math.min(min, coin);
        }

        long l = 1;
        long r = (long) min * k;

        long best = Long.MAX_VALUE;
        while (l <= r) {

            long mid = (l + r) / 2;
            long count = count(mid, sizeToLcms);
            if (count >= k) { // try to find lower
                best = Math.min(mid, best);
                r = mid - 1;
            } else {
                l = mid + 1;
            }
        }
        return best;
    }

    long count(long v, Map<Integer, List<Long>> sizeToLcms) {
        long r = 0;
        for (Map.Entry<Integer, List<Long>> entry : sizeToLcms.entrySet()) {
            Integer size = entry.getKey();
            List<Long> values = entry.getValue();
            long singleRes = 0;
            for (Long singleVal : values) {
                singleRes += (v / singleVal);
            }
            if (size % 2 == 1) {
                r += singleRes;
            } else {
                r -= singleRes;
            }
        }
        return r;
    }

    void generateAllCombinations(int i, int[] coins, int size, List<Integer> current, List<List<Integer>> all) {
        if (current.size() == size) {
            all.add(current);
            return;
        }
        if (i >= coins.length) {
            return;
        }
        // skip
        generateAllCombinations(i + 1, coins, size, current, all);
        // add and go to the next one
        List<Integer> newList = new ArrayList<>(current);
        newList.add(coins[i]);
        generateAllCombinations(i + 1, coins, size, newList, all);
    }

    long lcm(List<Integer> nums) {
        if (nums.size() == 1) {
            return nums.get(0);
        } else {
            long res = lcm(nums.get(0), nums.get(1));
            for (int i = 2; i < nums.size(); i++) {
                int next = nums.get(i);
                res = lcm(res, next);
            }
            return res;
        }
    }

    long lcm(long a, long b) {
        return a / gcd(a, b) * b;
    }

    long gcd(long a, long b) {
        while (b != 0) {
            long r = a % b;
            a = b;
            b = r;
        }
        return a;
    }
}