package solutions.algorithms._2000_2999._2976_Minimum_Cost_to_Convert_String_I;

import java.util.*;

class Solution {
    public long minimumCost(String source, String target, char[] original, char[] changed, int[] cost) {

        int[][] best = new int[26][26];
        for (int i = 0; i < 26; i++) {
            for (int j = 0; j < 26; j++) {
                if (i == j) {
                    best[i][j] = 0;
                } else {
                    best[i][j] = Integer.MAX_VALUE;
                }
            }
        }
        Map<Character, List<PairCharInt>> map = new HashMap<>();
        for (int i = 0; i < changed.length; i++) {
            List<PairCharInt> list = map.getOrDefault(original[i], new ArrayList<>());
            list.add(new PairCharInt(changed[i], cost[i]));
            map.put(original[i], list);
        }
        for (int i = 0; i < 26; i++) {
            char charToCheck = (char) ('a' + i);
            if (map.containsKey(charToCheck)) {
                PriorityQueue<PairCharInt> pq = new PriorityQueue<>((o1, o2) -> o1.cost - o2.cost);
                pq.add(new PairCharInt(charToCheck, 0));
                while (!pq.isEmpty()) {
                    PairCharInt current = pq.poll();
                    int currentCost = current.cost;
                    if (best[charToCheck - 'a'][current.c - 'a'] <= currentCost) {
                        continue;
                    }
                    List<PairCharInt> neighbours = map.get(current.c);
                    if (neighbours != null) {
                        for (PairCharInt neighbour : neighbours) {
                            char neighbourChar = neighbour.c;
                            int neighbourCost = neighbour.cost;
                            if (best[charToCheck - 'a'][neighbourChar - 'a'] > currentCost + neighbourCost) {
                                best[charToCheck - 'a'][neighbourChar - 'a'] = currentCost + neighbourCost;
                                pq.add(new PairCharInt(neighbourChar, currentCost + neighbourCost));
                            }
                        }
                    }
                }
            }
        }
        long totalCost = 0;
        for (int i = 0; i < source.length(); i++) {
            char sC = source.charAt(i);
            char tC = target.charAt(i);
            if (best[sC - 'a'][tC - 'a'] == Integer.MAX_VALUE) {
                return -1;
            } else {
                totalCost += best[sC - 'a'][tC - 'a'];
            }
        }
        return totalCost;
    }

    static class PairCharInt {
        public char c;
        public int cost;

        public PairCharInt(char c, int cost) {
            this.c = c;
            this.cost = cost;
        }
    }

}