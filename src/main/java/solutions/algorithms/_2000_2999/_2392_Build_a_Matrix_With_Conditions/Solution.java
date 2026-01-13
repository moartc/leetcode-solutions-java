package solutions.algorithms._2000_2999._2392_Build_a_Matrix_With_Conditions;

import java.util.ArrayList;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Queue;

class Solution {
    /*
    it looks a bit like a topological sorting problem
    I could sort numbers twice. Once for rows and once for columns.

    In the 2nd example for rows I get: [1,2],[2,3][3,1]
    so I can already detect a cycle already during sorting and return.

    So, first I'll sort it and then see how to use it - beats 59.05%,
    update: list replaced by array, and it beats 84% now.
     */
    public int[][] buildMatrix(int k, int[][] rowConditions, int[][] colConditions) {

        // rows
        int[] rowsSorted = getSorted(k, rowConditions);
        if (rowsSorted == null) {
            return new int[][]{};
        }

        // cols
        int[] colsSorted = getSorted(k, colConditions);
        if (colsSorted == null) {
            return new int[][]{};
        }

        // both are not empty

        // by default zeros
        int[][] answer = new int[k][k];
        for (int i = 1; i <= k; i++) {
            answer[rowsSorted[i]][colsSorted[i]] = i;
        }
        return answer;

    }

    // update, instead of returning sorted list, I return array of position
    int[] getSorted(int k, int[][] rowConditions) {
        int[] rowInNodes = new int[k + 1];
        List<Integer>[] rowAdjecencyList = new ArrayList[k + 1];
        for (int[] rowCondition : rowConditions) {
            int f = rowCondition[0];
            int s = rowCondition[1];
            if (rowAdjecencyList[f] == null) {
                rowAdjecencyList[f] = new ArrayList<>();
            }
            rowAdjecencyList[f].add(s);
            rowInNodes[s]++;
        }

        Queue<Integer> rowQueue = new PriorityQueue<>();
        for (int i = 1; i < rowInNodes.length; i++) {
            if (rowInNodes[i] == 0) {
                rowQueue.add(i);
            }
        }

        int[] rowSorted = new int[k + 1];
        int idx = 0;
        while (!rowQueue.isEmpty()) {
            Integer poll = rowQueue.poll();
            rowSorted[poll] = idx++;
            if (rowAdjecencyList[poll] != null) {
                for (Integer i : rowAdjecencyList[poll]) {
                    rowInNodes[i]--;
                    if (rowInNodes[i] == 0) {
                        rowQueue.add(i);
                    }
                }
            }
        }
        if (idx != k) {
            return null;
        } else {
            return rowSorted;
        }
    }
}