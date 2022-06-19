package solutions.algorithms._1091_Shortest_Path_in_Binary_Matrix;

import java.util.LinkedList;
import java.util.Queue;

class Solution {

    public int shortestPathBinaryMatrix(int[][] grid) {
        int length = grid.length;
        if (grid[0][0] != 0 || grid[length - 1][length - 1] != 0) {
            return -1;
        }
        if (length == 1) {
            return 1;
        }
        int[][] possibleMoves = new int[][]{{-1, -1}, {0, -1}, {1, -1}, {-1, 0}, {1, 0}, {-1, 1}, {0, 1}, {1, 1}};
        Queue<int[]> queue = new LinkedList<>();
        queue.add(new int[]{0, 0});
        grid[0][0] = 1;
        while (!queue.isEmpty()) {
            int[] remove = queue.remove();
            for (int[] move : possibleMoves) {
                int nextY = remove[0] + move[0];
                int nextX = remove[1] + move[1];
                if (!(nextY < 0 || nextY >= length || nextX < 0 || nextX >= length) && grid[nextY][nextX] == 0) {
                    if (nextY == length - 1 && nextX == length - 1) {
                        return grid[remove[0]][remove[1]] + 1;
                    } else {
                        grid[nextY][nextX] = grid[remove[0]][remove[1]] + 1;
                        queue.add(new int[]{nextY, nextX});
                    }
                }
            }
        }
        return -1;
    }
}