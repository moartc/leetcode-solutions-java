package solutions.algorithms._0_999._207_Course_Schedule;

import java.util.ArrayList;
import java.util.List;

class Solution {

    /*
    notes:
    I have to take 2nd course before the 1st one

    so I should return false if there is a course X that I have to take before course Y
    and a course Y that I have to take before course X


    case with 3 courses
    0, 1 -> 1 before 0
    2, 0 -> 0 before 2
    1  2 -> 2 before 1

    for the last 2, the order is:
    0 -> 2 -> 1
    but the first requirement says that 1 -> 0

    as a graph:
    1 -> 0 -> 2
    ^         |
    |<----<----

    So, if there is a cycle I can return false, otherwise, true

    I am using DFS cycle detection

     */
    public boolean canFinish(int numCourses, int[][] prerequisites) {

        List<Integer>[] adjacencyList = new ArrayList[numCourses];

        for (int[] prerequisite : prerequisites) {
            int f = prerequisite[1];
            int s = prerequisite[0];

            if (adjacencyList[f] == null) {
                ArrayList<Integer> newList = new ArrayList<>();
                newList.add(s);
                adjacencyList[f] = newList;
            } else {
                adjacencyList[f].add(s);
            }
        }
        boolean[] visited = new boolean[numCourses];
        boolean[] recStack = new boolean[numCourses];
        for (int node = 0; node < numCourses; node++) {

            if (detectCycle(node, adjacencyList, visited, recStack)) {
                return false;
            }
        }
        return true;
    }

    boolean detectCycle(int currentNode, List<Integer>[] adjacencyList, boolean[] visited, boolean[] recStack) {

        if (recStack[currentNode]) {
            return true;
        }
        recStack[currentNode] = true;
        if (adjacencyList[currentNode] != null) {
            for (Integer i : adjacencyList[currentNode]) {
                if (visited[i]) {
                    continue;
                }
                if (detectCycle(i, adjacencyList, visited, recStack)) {
                    return true;
                }
            }
        }
        recStack[currentNode] = false;
        visited[currentNode] = true;
        return false;
    }

}