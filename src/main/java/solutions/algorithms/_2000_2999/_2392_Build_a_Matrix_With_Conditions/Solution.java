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

    So, first I'll sort it and then see how to use it
    update: beats 59.05%,
    todo improve the answer building process and avoid using indexOf
     */
    public int[][] buildMatrix(int k, int[][] rowConditions, int[][] colConditions) {

        // rows
        List<Integer> rowsSorted = getSorted(k, rowConditions);
        if (rowsSorted.isEmpty() || rowsSorted.size() != k) {
            return new int[][]{};
        }

        // cols
        List<Integer> colsSorted = getSorted(k, colConditions);
        if (colsSorted.isEmpty() || colsSorted.size() != k) {
            return new int[][]{};
        }

        // both are not empty

        // by default zeros
        int[][] answer = new int[k][k];
        for (int i = 0; i < rowsSorted.size(); i++) {
            int valueAtRowI = rowsSorted.get(i);
            int colIdxForI = colsSorted.indexOf(valueAtRowI);
            answer[i][colIdxForI] = valueAtRowI;
        }
        return answer;

    }

    List<Integer> getSorted(int k, int[][] rowConditions) {
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

        List<Integer> rowSorted = new ArrayList<>();
        while (!rowQueue.isEmpty()) {
            Integer poll = rowQueue.poll();
            rowSorted.add(poll);
            if (rowAdjecencyList[poll] != null) {
                for (Integer i : rowAdjecencyList[poll]) {
                    rowInNodes[i]--;
                    if (rowInNodes[i] == 0) {
                        rowQueue.add(i);
                    }
                }
            }
        }
        return rowSorted;
    }
}