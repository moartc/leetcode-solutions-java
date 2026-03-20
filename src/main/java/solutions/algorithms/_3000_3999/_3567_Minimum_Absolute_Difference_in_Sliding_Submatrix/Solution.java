package solutions.algorithms._3000_3999._3567_Minimum_Absolute_Difference_in_Sliding_Submatrix;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

class Solution {
    /*
    brute force
     */
    public int[][] minAbsDiff(int[][] grid, int k) {

        int[][] answer = new int[grid.length - k + 1][grid[0].length - k + 1];
        for (int y = 0; y < grid.length - k + 1; y++) {
            for (int x = 0; x < grid[0].length - k + 1; x++) {
                Set<Integer> allValues = new HashSet<>();
                for (int i = 0; i < k; i++) {
                    for (int j = 0; j < k; j++) {
                        allValues.add(grid[y + i][x + j]);
                    }
                }
                int colAnswer = findDiff(allValues);
                answer[y][x] = colAnswer;
            }
        }
        return answer;
    }

    int findDiff(Set<Integer> set) {
        if (set.size() == 1) {
            return 0;
        }
        List<Integer> list = new ArrayList<>(set);
        int minDiff = Integer.MAX_VALUE;
        for (int i = 0; i < list.size(); i++) {
            for (int j = i + 1; j < list.size(); j++) {
                int diff = Math.abs(list.get(i) - list.get(j));
                minDiff = Math.min(diff, minDiff);
            }
        }
        return minDiff;
    }
}
