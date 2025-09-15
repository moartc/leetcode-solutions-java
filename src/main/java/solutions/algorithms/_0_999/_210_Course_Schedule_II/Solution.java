package solutions.algorithms._0_999._210_Course_Schedule_II;

import java.util.ArrayList;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Queue;

class Solution {

    /*
    In the previous problem (207. Course Schedule), I verified if I can take all courses, considering all the given requirements.
    I can do the same here again to check if a solution exists.
    If not, I can return an empty array, otherwise, sort them topologically to find a solution.

    update:
    Actually, I don't need to check for cycles in the graph.
    If the number of processed nodes is less than the total number of nodes, it indicates the presence of a cycle.

    but it's not faster
     */
    public int[] findOrder(int numCourses, int[][] prerequisites) {

        // inNodes for Khan's algorithm
        int[] inNodes = new int[numCourses];
        List<Integer>[] adjecencyList = new ArrayList[numCourses];
        for (int[] prerequisite : prerequisites) {
            int f = prerequisite[1];
            int s = prerequisite[0];
            if (adjecencyList[f] == null) {
                adjecencyList[f] = new ArrayList<>();
            }
            adjecencyList[f].add(s);
            inNodes[s]++;
        }

        Queue<Integer> queue = new PriorityQueue<>();
        for (int i = 0; i < inNodes.length; i++) {
            if (inNodes[i] == 0) {
                queue.add(i);
            }
        }

        int currentIndex = 0;
        int[] answer = new int[numCourses];

        while (!queue.isEmpty()) {
            Integer node = queue.poll();
            answer[currentIndex++] = node;
            if (adjecencyList[node] != null) {
                for (Integer i : adjecencyList[node]) {
                    inNodes[i]--;
                    if (inNodes[i] == 0) {
                        queue.add(i);
                    }
                }
            }
        }
        if (currentIndex == numCourses) {
            return answer;
        } else {
            return new int[]{};
        }
    }
}