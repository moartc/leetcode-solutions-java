package solutions.algorithms._1000_1999._1292_Maximum_Side_Length_of_a_Square_with_Sum_Less_than_or_Equal_to_Threshold;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

class SolutionTest {

    private final Solution solution = new Solution();

    @Test
    void maxSideLength1() {
        int[][] mat = new int[][]{{1, 1, 3, 2, 4, 3, 2}, {1, 1, 3, 2, 4, 3, 2}, {1, 1, 3, 2, 4, 3, 2}};
        int threshold = 4;
        int answer = solution.maxSideLength(mat, threshold);
        Assertions.assertThat(answer).isEqualTo(2);
    }

    @Test
    void maxSideLength2() {
        int[][] mat = new int[][]{{2, 2, 2, 2, 2}, {2, 2, 2, 2, 2}, {2, 2, 2, 2, 2}, {2, 2, 2, 2, 2}, {2, 2, 2, 2, 2}};
        int threshold = 1;
        int answer = solution.maxSideLength(mat, threshold);
        Assertions.assertThat(answer).isEqualTo(0);
    }
}