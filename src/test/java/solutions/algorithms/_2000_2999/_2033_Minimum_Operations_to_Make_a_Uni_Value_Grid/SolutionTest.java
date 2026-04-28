package solutions.algorithms._2000_2999._2033_Minimum_Operations_to_Make_a_Uni_Value_Grid;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

class SolutionTest {

    private final Solution solution = new Solution();

    @Test
    void minOperations1() {
        int[][] grid = new int[][]{{2, 4}, {6, 8}};
        int x = 2;
        int answer = solution.minOperations(grid, x);
        Assertions.assertThat(answer).isEqualTo(4);
    }

    @Test
    void minOperations2() {
        int[][] grid = new int[][]{{1, 5}, {2, 3}};
        int x = 1;
        int answer = solution.minOperations(grid, x);
        Assertions.assertThat(answer).isEqualTo(5);
    }

    @Test
    void minOperations3() {
        int[][] grid = new int[][]{{1, 2}, {3, 4}};
        int x = 2;
        int answer = solution.minOperations(grid, x);
        Assertions.assertThat(answer).isEqualTo(-1);
    }

    @Test
    void minOperations4() {
        int[][] grid = new int[][]{{146}};
        int x = 86;
        int answer = solution.minOperations(grid, x);
        Assertions.assertThat(answer).isEqualTo(0);
    }

    @Test
    void minOperations5() {
        int[][] grid = new int[][]{{931, 128}, {639, 712}};
        int x = 73;
        int answer = solution.minOperations(grid, x);
        Assertions.assertThat(answer).isEqualTo(12);
    }
}