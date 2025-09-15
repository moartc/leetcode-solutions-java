package solutions.algorithms._0_999._417_Pacific_Atlantic_Water_Flow;

import java.util.ArrayList;
import java.util.List;

class Solution {

    /*
    I could mark (in another array or 2 if needed) all cells that border either of 2 oceans.
    Then, starting from the top-left, I check if I can reach the  Pacific Ocean.
    The same applies to the Atlantic Ocean,
    but in this case I process the cells starting from the bottom-right and moving  upwards-leftwards.

    Then, from every cell with access to an ocean, I can visit all cells that have the same or higher height
    and mark them as also having access.

    update:
    during the initial marking I also visit neighbours

    beats: 97.72%
     */
    public List<List<Integer>> pacificAtlantic(int[][] heights) {

        boolean[][] canReachPacific = new boolean[heights.length][heights[0].length];
        boolean[][] canReachAtlantic = new boolean[heights.length][heights[0].length];

        // pacific part vertically
        for (int y = 0; y < heights.length; y++) {
            visitAndMark(y, 0, canReachPacific, heights, true);
        }
        // pacific part horizontally
        for (int x = 0; x < heights[0].length; x++) {
            visitAndMark(0, x, canReachPacific, heights, true);
        }
        // atlantic part vertically
        for (int y = 0; y < heights.length; y++) {
            visitAndMark(y, heights[0].length - 1, canReachAtlantic, heights, true);
        }
        // atlantic part horizontally
        for (int x = 0; x < heights[0].length; x++) {
            visitAndMark(heights.length - 1, x, canReachAtlantic, heights, true);
        }

        List<List<Integer>> answer = new ArrayList<>();
        // iterate through both new arrays and select cells where both values are true
        for (int y = 0; y < heights.length; y++) {
            for (int x = 0; x < heights[0].length; x++) {
                if (canReachPacific[y][x] && canReachAtlantic[y][x]) {
                    answer.add(List.of(y, x));
                }
            }
        }
        return answer;
    }

    void visitAndMark(int y, int x, boolean[][] accessMap, int[][] heights, boolean firstVisit) {

        if (accessMap[y][x] && !firstVisit) {
            return;
        }
        accessMap[y][x] = true;

        int currentHeight = heights[y][x];

        if (y - 1 >= 0 && heights[y - 1][x] >= currentHeight) {
            visitAndMark(y - 1, x, accessMap, heights, false);
        }
        if (y + 1 < heights.length && heights[y + 1][x] >= currentHeight) {
            visitAndMark(y + 1, x, accessMap, heights, false);
        }
        if (x - 1 >= 0 && heights[y][x - 1] >= currentHeight) {
            visitAndMark(y, x - 1, accessMap, heights, false);
        }
        if (x + 1 < heights[0].length && heights[y][x + 1] >= currentHeight) {
            visitAndMark(y, x + 1, accessMap, heights, false);
        }
    }
}