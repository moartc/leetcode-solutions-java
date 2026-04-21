package solutions.algorithms._1000_1999._1722_Minimize_Hamming_Distance_After_Swap_Operations;

import java.util.HashMap;
import java.util.Map;

class Solution {
    public int minimumHammingDistance(int[] source, int[] target, int[][] allowedSwaps) {

        int[] parents = new int[source.length];
        int[] ranks = new int[source.length];

        for (int i = 0; i < source.length; i++) {
            parents[i] = i;
            ranks[i] = 0;
        }

        for (int[] allowedSwap : allowedSwaps) {
            int a = allowedSwap[0];
            int b = allowedSwap[1];
            union(a, b, parents, ranks);
        }

        Map<Integer, Map<Integer, Integer>> parentToCount = new HashMap<>();
        for (int i = 0; i < source.length; i++) {
            int parent = findParent(i, parents);
            Map<Integer, Integer> freq = parentToCount.getOrDefault(parent, new HashMap<>());
            freq.put(source[i], freq.getOrDefault(source[i], 0) + 1);
            freq.put(target[i], freq.getOrDefault(target[i], 0) - 1);
            parentToCount.put(parent, freq);
        }

        int answer = 0;
        for (Map<Integer, Integer> value : parentToCount.values()) {
            for (Integer v : value.values()) {
                if (v > 0) {
                    answer += v;
                }
            }
        }

        return answer;
    }


    void union(int a, int b, int[] parents, int[] ranks) {
        int pA = findParent(a, parents);
        int pB = findParent(b, parents);
        if (pA == pB) {
            return;
        }
        int rA = ranks[pA];
        int rB = ranks[pB];
        if (rA < rB) {
            parents[pA] = pB;
        } else if (rB < rA) {
            parents[pB] = pA;
        } else { // rA == rB
            parents[pB] = pA;
            ranks[pA]++;
        }

    }

    int findParent(int a, int[] parents) {
        if (a != parents[a]) {
            parents[a] = findParent(parents[a], parents);
        }
        return parents[a];
    }

}