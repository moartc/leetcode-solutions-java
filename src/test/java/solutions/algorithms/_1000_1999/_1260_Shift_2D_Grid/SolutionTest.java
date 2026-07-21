package solutions.algorithms._1000_1999._1260_Shift_2D_Grid;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.List;

class SolutionTest {

    private final Solution solution = new Solution();

    @Test
    void shiftGrid1() {
        int[][] grid = new int[][]{{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        int k = 1;
        List<List<Integer>> answer = solution.shiftGrid(grid, k);
        Assertions.assertThat(answer.get(0)).containsExactly(9, 1, 2);
        Assertions.assertThat(answer.get(1)).containsExactly(3, 4, 5);
        Assertions.assertThat(answer.get(2)).containsExactly(6, 7, 8);
    }

    @Test
    void shiftGrid2() {
        int[][] grid = new int[][]{{3, 8, 1, 9}, {19, 7, 2, 5}, {4, 6, 11, 10}, {12, 0, 21, 13}};
        int k = 4;
        List<List<Integer>> answer = solution.shiftGrid(grid, k);
        Assertions.assertThat(answer.get(0)).containsExactly(12, 0, 21, 13);
        Assertions.assertThat(answer.get(1)).containsExactly(3, 8, 1, 9);
        Assertions.assertThat(answer.get(2)).containsExactly(19, 7, 2, 5);
        Assertions.assertThat(answer.get(3)).containsExactly(4, 6, 11, 10);

    }

    @Test
    void shiftGrid3() {
        int[][] grid = new int[][]{{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        int k = 9;
        List<List<Integer>> answer = solution.shiftGrid(grid, k);
        Assertions.assertThat(answer.get(0)).containsExactly(1, 2, 3);
        Assertions.assertThat(answer.get(1)).containsExactly(4, 5, 6);
        Assertions.assertThat(answer.get(2)).containsExactly(7, 8, 9);
    }
}