package solutions.algorithms._3000_3999._3505_Minimum_Operations_to_Make_Elements_Within_K_Subarrays_Equal;

import java.util.Arrays;
import java.util.PriorityQueue;

class Solution {

    long[][] bestCache;

    /*
    filling movesAtIdx with help from claude
     */
    public long minOperations(int[] nums, int x, int k) {

        long[] movesAtIdx = new long[nums.length - x + 1];


        // finding required moves
        PriorityQueue<Integer> minHeap = new PriorityQueue<>((a, b) -> Integer.compare(nums[a], nums[b]));
        PriorityQueue<Integer> maxHeap = new PriorityQueue<>((a, b) -> Integer.compare(nums[b], nums[a]));
        int lowCtr = 0;
        long lowSum = 0;
        int highCtr = 0;
        long highSum = 0;
        boolean[] inLow = new boolean[nums.length];
        for (int i = 0; i < nums.length; i++) {
            // before windwos
            if (i >= x) {
                int out = i - x;
                if (inLow[out]) {
                    lowCtr--;
                    lowSum -= nums[out];
                } else {
                    highCtr--;
                    highSum -= nums[out];
                }
            }
            prune(minHeap, i - x);
            if (minHeap.isEmpty() || nums[i] <= nums[minHeap.peek()]) {
                inLow[i] = true;
                maxHeap.add(i);
                lowCtr++;
                lowSum += nums[i];
            } else {
                inLow[i] = false;
                minHeap.add(i);
                highCtr++;
                highSum += nums[i];
            }

            while (lowCtr > (x + 1) / 2) {
                prune(maxHeap, i - x);
                int poll = maxHeap.poll();
                inLow[poll] = false;
                minHeap.add(poll);
                lowCtr--;
                lowSum -= nums[poll];
                highCtr++;
                highSum += nums[poll];
            }
            while (highCtr > 0 && lowCtr < (x + 1) / 2) {
                prune(minHeap, i - x);
                int poll = minHeap.poll();
                inLow[poll] = true;
                maxHeap.add(poll);
                lowCtr++;
                lowSum += nums[poll];
                highCtr--;
                highSum -= nums[poll];
            }

            if (i >= x - 1) {
                prune(maxHeap, i - x);
                long med = nums[maxHeap.peek()];
                movesAtIdx[i - x + 1] = med * lowCtr - lowSum + highSum - med * highCtr;
            }
        }

        bestCache = new long[movesAtIdx.length][k + 1];
        for (long[] ints : bestCache) {
            Arrays.fill(ints, -2);
        }
        return findBest(0, movesAtIdx, x, k);

    }

    void prune(PriorityQueue<Integer> heap, int lastDeadIdx) {
        while (!heap.isEmpty() && heap.peek() <= lastDeadIdx) {
            heap.poll();
        }
    }

    long findBest(int curr, long[] movesAtIdx, int x, int k) {

        if (curr >= movesAtIdx.length) {
            return Long.MAX_VALUE;
        }
        if (bestCache[curr][k] != -2) {
            return bestCache[curr][k];
        }
        if (k == 0) {
            return 0;
        }
        // skip current
        long bestWithSkip = Long.MAX_VALUE;
        bestWithSkip = findBest(curr + 1, movesAtIdx, x, k);

        // take it
        long bestWithoutSkip = Long.MAX_VALUE;
        if (k > 1) {
            bestWithoutSkip = findBest(curr + x, movesAtIdx, x, k - 1);
        } else {
            bestWithoutSkip = 0;
        }

        if (bestWithoutSkip != Long.MAX_VALUE && bestWithoutSkip + movesAtIdx[curr] < bestWithSkip) {
            bestCache[curr][k] = movesAtIdx[curr] + bestWithoutSkip;
        } else {
            bestCache[curr][k] = bestWithSkip;
        }
        return bestCache[curr][k];

    }

    // based on sol from 462, but I cannot use it because it's too slow :(
    long calcMoves(int i, int[] nums, int x) {
        int[] tempArr = Arrays.copyOfRange(nums, i, i + x);
        Arrays.sort(tempArr);
        int midIdx = tempArr.length / 2;
        int midEl = tempArr[midIdx];
        long answer = 0;
        for (int num : tempArr) {
            answer += Math.abs(num - midEl);
        }
        return answer;
    }

}
