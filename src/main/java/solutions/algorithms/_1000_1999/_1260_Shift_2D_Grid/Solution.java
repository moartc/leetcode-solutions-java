package solutions.algorithms._1000_1999._1260_Shift_2D_Grid;

import java.util.ArrayList;
import java.util.List;

class Solution {
    public List<List<Integer>> shiftGrid(int[][] grid, int k) {

        for (int i = 0; i < k; i++) {
            shift(grid);
        }

        List<List<Integer>> answer = new ArrayList<>();
        for (int[] ints : grid) {
            List<Integer> singleArray = new ArrayList<>();
            for (int i : ints) {
                singleArray.add(i);
            }
            answer.add(singleArray);
        }
        return answer;
    }


    void shift(int[][] grid) {

        int current = grid[0][0];
        int prev = 0;
        for (int y = 0; y < grid.length; y++) {
            for (int x = 0; x < grid[0].length; x++) {
                int newY = y;
                int newX = x;
                if (y == grid.length - 1 && x == grid[0].length - 1) {
                    newY = 0;
                    newX = 0;
                } else if (x == grid[0].length - 1) {
                    newY++;
                    newX = 0;
                } else {
                    newX++;
                }
                prev = grid[newY][newX];
                grid[newY][newX] = current;
                current = prev;
            }
        }
    }

}