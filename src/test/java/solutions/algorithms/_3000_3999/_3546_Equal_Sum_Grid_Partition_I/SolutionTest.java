package solutions.algorithms._3000_3999._3546_Equal_Sum_Grid_Partition_I;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

class SolutionTest {

    private final Solution solution = new Solution();

    @Test
    void canPartitionGrid1() {
        int[][] grid = new int[][]{{1, 4}, {2, 3}};
        boolean answer = solution.canPartitionGrid(grid);
        Assertions.assertThat(answer).isTrue();
    }

    @Test
    void canPartitionGrid2() {
        int[][] grid = new int[][]{{1, 3}, {2, 4}};
        boolean answer = solution.canPartitionGrid(grid);
        Assertions.assertThat(answer).isFalse();
    }
}