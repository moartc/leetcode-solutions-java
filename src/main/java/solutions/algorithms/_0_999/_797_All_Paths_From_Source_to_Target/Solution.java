package solutions.algorithms._0_999._797_All_Paths_From_Source_to_Target;

import java.util.LinkedList;
import java.util.List;

class Solution {
    public List<List<Integer>> allPathsSourceTarget(int[][] graph) {

        List<List<Integer>> result = new LinkedList<>();
        List<Integer> initialList = List.of(0);
        addToList(graph, 0, initialList, result);
        return result;
    }

    void addToList(int[][] graph, int index, List<Integer> currentList, List<List<Integer>> result) {
        if (graph.length - 1 == index) {
            result.add(currentList);
        }
        for (int i : graph[index]) {
            List<Integer> newList = new LinkedList<>(currentList);
            newList.add(i);
            addToList(graph, i, newList, result);
        }
    }
}