package solutions.algorithms._1000_1999._1536_Minimum_Swaps_to_Arrange_a_Binary_Grid;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

class SolutionTest {

    private final Solution solution = new Solution();

    @Test
    void minSwaps1() {
        int[][] grid = new int[][]{{0, 0, 1}, {1, 1, 0}, {1, 0, 0}};
        int answer = solution.minSwaps(grid);
        Assertions.assertThat(answer).isEqualTo(3);
    }

    @Test
    void minSwaps2() {
        int[][] grid = new int[][]{{0, 1, 1, 0}, {0, 1, 1, 0}, {0, 1, 1, 0}, {0, 1, 1, 0}};
        int answer = solution.minSwaps(grid);
        Assertions.assertThat(answer).isEqualTo(-1);
    }

    @Test
    void minSwaps3() {
        int[][] grid = new int[][]{{1, 0, 0}, {1, 1, 0}, {1, 1, 1}};
        int answer = solution.minSwaps(grid);
        Assertions.assertThat(answer).isEqualTo(0);
    }

    @Test
    void minSwaps4() {
        int[][] grid = new int[][]{{1, 0, 0, 0}, {1, 1, 1, 1}, {1, 0, 0, 0}, {1, 0, 0, 0}};
        int answer = solution.minSwaps(grid);
        Assertions.assertThat(answer).isEqualTo(2);
    }

}