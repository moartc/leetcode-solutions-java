package solutions.algorithms._3000_3999._3619_Count_Islands_With_Total_Value_Divisible_by_K;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

class SolutionTest {

    private final Solution solution = new Solution();

    @Test
    void countIslands1() {
        int[][] grid = new int[][]{{0, 2, 1, 0, 0}, {0, 5, 0, 0, 5}, {0, 0, 1, 0, 0}, {0, 1, 4, 7, 0}, {0, 2, 0, 0, 8}};
        int k = 5;
        int answer = solution.countIslands(grid, k);
        Assertions.assertThat(answer).isEqualTo(2);
    }

    @Test
    void countIslands2() {
        int[][] grid = new int[][]{{3, 0, 3, 0}, {0, 3, 0, 3}, {3, 0, 3, 0}};
        int k = 3;
        int answer = solution.countIslands(grid, k);
        Assertions.assertThat(answer).isEqualTo(6);
    }

    @Test
    void countIslands3() {
        int[][] grid = new int[][]{{0, 0, 0}, {0, 0, 1}, {11, 0, 6}, {0, 10, 2}, {0, 0, 0}, {8, 0, 0}};
        int k = 19;
        int answer = solution.countIslands(grid, k);
        Assertions.assertThat(answer).isEqualTo(1);
    }

    /*
    0   0   0
    0   0   1
    11  0   6
    0   10  2
    0   0   0
    8   0   0
     */
}