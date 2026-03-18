package solutions.algorithms._3000_3999._3070_Count_Submatrices_with_Top_Left_Element_and_Sum_Less_Than_k;

class Solution {

    /*
    I can store at each cell the value that represents the sum from the top left cell to the current cell
    I can add the value from y-1, x (cell above) to the total sum in the current row (on the left)
    For this second value I don't need any array, so I can also reuse input array to store already
    calculated sums.
     */
    public int countSubmatrices(int[][] grid, int k) {

        int answer = 0;
        for (int y = 0; y < grid.length; y++) {
            int currentRowSum = 0;
            for (int x = 0; x < grid[0].length; x++) {
                currentRowSum += grid[y][x];
                int valueAbove = y - 1 >= 0 ? grid[y - 1][x] : 0;
                grid[y][x] = currentRowSum + valueAbove;
                if (grid[y][x] <= k) {
                    answer++;
                }
            }
        }
        return answer;
    }
}