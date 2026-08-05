package solutions.algorithms._3000_3999._3310_Remove_Methods_From_Project;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

class Solution {

    /*
    visit all from k and store in a set
    check all remaining, if none of them calls any method from the set, we can return
    all remaining, otherwise we cannot remove anything
     */
    public List<Integer> remainingMethods(int n, int k, int[][] invocations) {

        Set<Integer>[] adjLists = new HashSet[n];
        for (int[] invocation : invocations) {
            int a = invocation[0];
            int b = invocation[1];
            if (adjLists[a] == null) {
                adjLists[a] = new HashSet<>();
            }
            adjLists[a].add(b);
        }

        Set<Integer> visited = new HashSet<>();
        visit(k, visited, adjLists);


        for (int i = 0; i < adjLists.length; i++) {
            if (adjLists[i] != null && !visited.contains(i)) {
                for (Integer calledByNotVisited : adjLists[i]) {
                    if (visited.contains(calledByNotVisited)) {
                        // none can be removed
                        List<Integer> all = new ArrayList<>();
                        for (int i1 = 0; i1 < n; i1++) {
                            all.add(i1);
                        }
                        return all;
                    }
                }
            }
        }
        // visited can be removed
        List<Integer> toReturn = new ArrayList<>();
        for (int i1 = 0; i1 < n; i1++) {
            if (!visited.contains(i1)) {
                toReturn.add(i1);
            }
        }
        return toReturn;

    }

    void visit(int node, Set<Integer> visited, Set<Integer>[] adjLists) {
        visited.add(node);
        if (adjLists[node] != null) {
            for (Integer nodeToVisit : adjLists[node]) {
                if (visited.add(nodeToVisit)) {
                    visit(nodeToVisit, visited, adjLists);
                }
            }
        }
    }
}