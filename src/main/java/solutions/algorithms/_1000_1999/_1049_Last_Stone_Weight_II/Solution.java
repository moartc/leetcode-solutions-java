package solutions.algorithms._1000_1999._1049_Last_Stone_Weight_II;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

class Solution {
    /*
    so basically there is a trick that I should divide all stones in 2 groups
    whose sums are as close as possible to totalSum / 2

    I can use a recursive method for this, visiting all combinations where
    I either include a number or exclude it and keep track of the value closest to totalSum / 2.

    update: TLE - I am adding caching

    todo improve performance - it beats 5%
     */

    Map<Pair, Integer> cache = new HashMap<>();

    public int lastStoneWeightII(int[] stones) {


        int totalSum = 0;
        for (int stone : stones) {
            totalSum += stone;
        }
        return find(0, stones, 0, totalSum);

    }

    Integer find(int currentIdx, int[] stones, int currentSum, int totalSum) {

        if (currentIdx == stones.length) {
            // it's the last one
            int currentDiff = Math.abs(totalSum - currentSum * 2);
            return currentDiff;
        } else {
            Pair key = new Pair(currentIdx, currentSum);
            if (cache.containsKey(key)) {
                return cache.get(key);
            }
            // skip it
            int a1 = find(currentIdx + 1, stones, currentSum, totalSum);
            // and include
            int a2 = find(currentIdx + 1, stones, currentSum + stones[currentIdx], totalSum);
            int bestAnswer = Math.min(a1, a2);
            cache.put(key, bestAnswer);
            return bestAnswer;
        }
    }

    class Pair {
        int idx;
        int currentSum;

        public Pair(int idx, int currentSum) {
            this.idx = idx;
            this.currentSum = currentSum;
        }

        @Override
        public boolean equals(Object o) {
            if (o == null || getClass() != o.getClass()) return false;
            Pair pair = (Pair) o;
            return idx == pair.idx && currentSum == pair.currentSum;
        }

        @Override
        public int hashCode() {
            return Objects.hash(idx, currentSum);
        }
    }
}