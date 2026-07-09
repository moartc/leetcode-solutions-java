package solutions.algorithms._3000_3999._3532_Path_Existence_Queries_in_a_Graph_I;

class Solution {
    public boolean[] pathExistenceQueries(int n, int[] nums, int maxDiff, int[][] queries) {


        int[] parents = new int[n];
        int[] ranks = new int[n];

        for (int i = 0; i < n; i++) {
            parents[i] = i;
            ranks[i] = 0;
        }

        for (int i = 1; i < n; i++) {
            int l = nums[i - 1];
            int r = nums[i];
            if (r - l <= maxDiff) {
                union(i - 1, i, parents, ranks);
            }
        }

        boolean[] answer = new boolean[queries.length];
        for (int i = 0; i < queries.length; i++) {
            int[] query = queries[i];
            int l = query[0];
            int r = query[1];
            answer[i] = findParent(l, parents) == findParent(r, parents);
        }
        return answer;

    }

    int findParent(int i, int[] parents) {
        if (parents[i] != i) {
            parents[i] = findParent(parents[i], parents);
        }
        return parents[i];
    }

    void union(int a, int b, int[] parents, int[] ranks) {
        int pA = findParent(a, parents);
        int pB = findParent(b, parents);

        if (pA == pB) {
            return;
        }

        int rankA = ranks[pA];
        int rankB = ranks[pB];
        if (rankA > rankB) {
            parents[pB] = pA;
        } else if (rankB > rankA) {
            parents[pA] = pB;
        } else { // rankA == rankB
            parents[pB] = pA;
            ranks[pA]++;
        }
    }
}