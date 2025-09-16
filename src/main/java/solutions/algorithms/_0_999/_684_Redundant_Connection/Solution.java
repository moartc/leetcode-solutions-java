package solutions.algorithms._0_999._684_Redundant_Connection;

class Solution {

    /*
    So I have to construct a spanning tree
    Union-Find algorithm
     */
    public int[] findRedundantConnection(int[][] edges) {

        int[] parent = new int[edges.length + 1];
        for (int i = 0; i < parent.length; i++) {
            parent[i] = i;
        }

        for (int[] edge : edges) {
            int f = edge[0];
            int s = edge[1];

            int pfVal = find(f, parent);
            int psVal = find(s, parent);
            if (pfVal == psVal) {
                return edge;
            }
            parent[psVal] = parent[pfVal];
        }
        // cannot happen
        return null;
    }

    int find(int i, int[] parent) {
        while (parent[i] != i) {
            i = parent[i];
        }
        return i;
    }
}