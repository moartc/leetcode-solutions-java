package solutions.algorithms._1000_1999._1267_Count_Servers_that_Communicate;

class Solution {


    public int countServers(int[][] grid) {


        int[] rowCtr = new int[grid.length];
        for (int y = 0; y < grid.length; y++) {
            int ctr = 0;
            for (int x = 0; x < grid[0].length; x++) {
                if (grid[y][x] == 1) {
                    ctr++;
                }
            }
            rowCtr[y] = ctr;
        }
        int[] colCtr = new int[grid[0].length];
        for (int x = 0; x < grid[0].length; x++) {
            int ctr = 0;
            for (int y = 0; y < grid.length; y++) {
                if (grid[y][x] == 1) {
                    ctr++;
                }
            }
            colCtr[x] = ctr;
        }

        int answer = 0;
        for (int y = 0; y < grid.length; y++) {
            for (int x = 0; x < grid[0].length; x++) {
                if (grid[y][x] == 1 && (rowCtr[y] > 1 || colCtr[x] > 1)) {
                    answer++;
                }
            }
        }
        return answer;
    }
}