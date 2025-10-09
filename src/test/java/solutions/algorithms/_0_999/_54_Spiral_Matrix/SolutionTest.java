package solutions.algorithms._0_999._54_Spiral_Matrix;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.List;

class SolutionTest {

    private final Solution solution = new Solution();

    @Test
    void spiralOrder1() {
        int[][] matrix = new int[][]{{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        List<Integer> answer = solution.spiralOrder(matrix);
        Assertions.assertThat(answer).hasSameElementsAs(List.of(1, 2, 3, 6, 9, 8, 7, 4, 5));
    }

    @Test
    void spiralOrder2() {
        int[][] matrix = new int[][]{{1, 2, 3, 4}, {5, 6, 7, 8}, {9, 10, 11, 12}};
        List<Integer> answer = solution.spiralOrder(matrix);
        Assertions.assertThat(answer).hasSameElementsAs(List.of(1, 2, 3, 4, 8, 12, 11, 10, 9, 5, 6, 7));
    }
}