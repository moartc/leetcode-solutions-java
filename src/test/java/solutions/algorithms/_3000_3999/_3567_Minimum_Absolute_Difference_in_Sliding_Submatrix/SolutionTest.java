package solutions.algorithms._3000_3999._3567_Minimum_Absolute_Difference_in_Sliding_Submatrix;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

class SolutionTest {

    private final Solution solution = new Solution();


    @Test
    void minAbsDiff1() {
        int[][] grid = new int[][]{{1, 8}, {3, -2}};
        int k = 2;
        int[][] answer = solution.minAbsDiff(grid, k);
        Assertions.assertThat(answer[0]).containsExactly(2);
    }

    @Test
    void minAbsDiff2() {
        int[][] grid = new int[][]{{3, -1}};
        int k = 1;
        int[][] answer = solution.minAbsDiff(grid, k);
        Assertions.assertThat(answer[0]).containsExactly(0, 0);
    }

    @Test
    void minAbsDiff3() {
        int[][] grid = new int[][]{{1, -2, 3}, {2, 3, 5}};
        int k = 2;
        int[][] answer = solution.minAbsDiff(grid, k);
        Assertions.assertThat(answer[0]).containsExactly(1, 2);
    }
}