package solutions.algorithms._3000_3999._3558_Number_of_Ways_to_Assign_Edge_WeightsI;

import java.util.*;

class Solution {


    long max;
    long MOD = 1000000000 + 7;

    public int assignEdgeWeights(int[][] edges) {
        Map<Integer, List<Integer>> edgeToEdges = new HashMap<>();
        for (int[] edge : edges) {
            int from = edge[0];
            int to = edge[1];
            List<Integer> paths1 = edgeToEdges.getOrDefault(from, new ArrayList<>());
            paths1.add(to);
            edgeToEdges.put(from, paths1);

            List<Integer> paths2 = edgeToEdges.getOrDefault(to, new ArrayList<>());
            paths2.add(from);
            edgeToEdges.put(to, paths2);
        }

        max = Long.MIN_VALUE;
        Map<Integer, Long> depths = new HashMap<>();
        findDepths(1, 0, depths, edgeToEdges, new HashSet<>());

        return Math.toIntExact(modPow(2, max - 1));

    }

    void findDepths(int current, long depth, Map<Integer, Long> depths, Map<Integer, List<Integer>> edgeToEdges, Set<Integer> visited) {
        max = Math.max(max, depth);
        visited.add(current);
        depths.put(current, depth);
        List<Integer> integers = edgeToEdges.get(current);
        if (integers == null) {
            return;
        }
        for (Integer integer : integers) {
            if (!visited.contains(integer)) {
                findDepths(integer, depth + 1, depths, edgeToEdges, visited);
            }
        }
    }

    private long modPow(long base, long exp) {
        long res = 1;

        while (exp > 0) {
            if ((exp & 1) == 1) {
                res = (res * base) % MOD;
            }
            base = (base * base) % MOD;
            exp >>= 1;
        }
        return res;
    }
}