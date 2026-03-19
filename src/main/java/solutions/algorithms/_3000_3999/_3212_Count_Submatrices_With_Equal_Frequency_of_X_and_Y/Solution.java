package solutions.algorithms._3000_3999._3212_Count_Submatrices_With_Equal_Frequency_of_X_and_Y;


/*
    x x . y x y y
    x y . y . . .
    . y . x . . .

    use 2 additional arrays to store number of xs and ys to the current cell (including it)
    I iterate through a row and count xs and ys, then at each cell I check how many of them were above.
*/
class Solution {

    public int numberOfSubmatrices(char[][] grid) {
        int answer = 0;
        int[] yAbove = new int[grid[0].length];
        int[] xAbove = new int[grid[0].length];
        for (int y = 0; y < grid.length; y++) {
            int yCounter = 0;
            int xCounter = 0;
            for (int x = 0; x < grid[0].length; x++) {
                if (grid[y][x] == 'X') {
                    xCounter++;
                } else if (grid[y][x] == 'Y') {
                    yCounter++;
                }
                int ysAbove = yAbove[x];
                int xsAbove = xAbove[x];
                int yTotal = ysAbove + yCounter;
                int xTotal = xsAbove + xCounter;
                if (yTotal == xTotal && xTotal > 0) {
                    answer++;
                }
                yAbove[x] = yTotal;
                xAbove[x] = xTotal;
            }
        }
        return answer;
    }

}